package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import o.AI0;
import o.C10763xf2;
import o.C3794Ny0;
import o.C5422bq;
import o.C6562gT0;
import o.C8120mp2;
import o.C9516sY;
import o.C9545sf2;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import o.InterfaceC7072ia2;
import o.InterfaceC8303na2;
import o.J82;
import o.VI0;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
/* loaded from: classes4.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    @Nullable
    private final OkHttpClient client;
    @NotNull
    private final RealConnection connection;
    @NotNull
    private final HeadersReader headersReader;
    @NotNull
    private final InterfaceC2579Bq sink;
    @NotNull
    private final InterfaceC2677Cq source;
    private int state;
    @Nullable
    private Headers trailers;

    /* loaded from: classes4.dex */
    public abstract class AbstractSource implements InterfaceC7072ia2 {
        private boolean closed;
        @NotNull
        private final C3794Ny0 timeout;

        public AbstractSource() {
            this.timeout = new C3794Ny0(Http1ExchangeCodec.this.source.timeout());
        }

        public final boolean getClosed() {
            return this.closed;
        }

        @NotNull
        public final C3794Ny0 getTimeout() {
            return this.timeout;
        }

        @Override // o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(c5422bq, j);
            } catch (IOException e) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
                return;
            }
            throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // o.InterfaceC7072ia2
        @NotNull
        public C8120mp2 timeout() {
            return this.timeout;
        }
    }

    @InterfaceC8303na2({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class ChunkedSink implements J82 {
        private boolean closed;
        @NotNull
        private final C3794Ny0 timeout;

        public ChunkedSink() {
            this.timeout = new C3794Ny0(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.K1("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // o.J82, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // o.J82
        @NotNull
        public C8120mp2 timeout() {
            return this.timeout;
        }

        @Override // o.J82
        public void write(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "source");
            if (!this.closed) {
                if (j == 0) {
                    return;
                }
                Http1ExchangeCodec.this.sink.F4(j);
                Http1ExchangeCodec.this.sink.K1(VI0.D);
                Http1ExchangeCodec.this.sink.write(c5422bq, j);
                Http1ExchangeCodec.this.sink.K1(VI0.D);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    @InterfaceC8303na2({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        @NotNull
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            C6562gT0.p(httpUrl, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.k2();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.H5();
                String obj = C10763xf2.b6(this.this$0.source.k2()).toString();
                if (this.bytesRemainingInChunk >= 0 && (obj.length() <= 0 || C9545sf2.J2(obj, ";", false, 2, null))) {
                    if (this.bytesRemainingInChunk == 0) {
                        this.hasMoreChunks = false;
                        Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                        http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                        OkHttpClient okHttpClient = this.this$0.client;
                        C6562gT0.m(okHttpClient);
                        CookieJar cookieJar = okHttpClient.cookieJar();
                        HttpUrl httpUrl = this.url;
                        Headers headers = this.this$0.trailers;
                        C6562gT0.m(headers);
                        HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                        responseBodyComplete();
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + '\"');
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "sink");
            if (j >= 0) {
                if (!getClosed()) {
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                    long j2 = this.bytesRemainingInChunk;
                    if (j2 == 0 || j2 == -1) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    long read = super.read(c5422bq, Math.min(j, this.bytesRemainingInChunk));
                    if (read != -1) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC8303na2({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "sink");
            if (j >= 0) {
                if (!getClosed()) {
                    long j2 = this.bytesRemaining;
                    if (j2 == 0) {
                        return -1L;
                    }
                    long read = super.read(c5422bq, Math.min(j2, j));
                    if (read != -1) {
                        long j3 = this.bytesRemaining - read;
                        this.bytesRemaining = j3;
                        if (j3 == 0) {
                            responseBodyComplete();
                        }
                        return read;
                    }
                    Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    @InterfaceC8303na2({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class KnownLengthSink implements J82 {
        private boolean closed;
        @NotNull
        private final C3794Ny0 timeout;

        public KnownLengthSink() {
            this.timeout = new C3794Ny0(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // o.J82, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // o.J82
        @NotNull
        public C8120mp2 timeout() {
            return this.timeout;
        }

        @Override // o.J82
        public void write(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "source");
            if (!this.closed) {
                Util.checkOffsetAndCount(c5422bq.size(), 0L, j);
                Http1ExchangeCodec.this.sink.write(c5422bq, j);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    @InterfaceC8303na2({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "sink");
            if (j >= 0) {
                if (!getClosed()) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    long read = super.read(c5422bq, j);
                    if (read == -1) {
                        this.inputExhausted = true;
                        responseBodyComplete();
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    public Http1ExchangeCodec(@Nullable OkHttpClient okHttpClient, @NotNull RealConnection realConnection, @NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull InterfaceC2579Bq interfaceC2579Bq) {
        C6562gT0.p(realConnection, "connection");
        C6562gT0.p(interfaceC2677Cq, "source");
        C6562gT0.p(interfaceC2579Bq, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = interfaceC2677Cq;
        this.sink = interfaceC2579Bq;
        this.headersReader = new HeadersReader(interfaceC2677Cq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(C3794Ny0 c3794Ny0) {
        C8120mp2 a = c3794Ny0.a();
        c3794Ny0.b(C8120mp2.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return C9545sf2.c2("chunked", Response.header$default(response, AI0.K0, null, 2, null), true);
    }

    private final J82 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC7072ia2 newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC7072ia2 newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final J82 newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC7072ia2 newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public J82 createRequestBody(@NotNull Request request, long j) {
        C6562gT0.p(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public InterfaceC7072ia2 openResponseBodySource(@NotNull Response response) {
        C6562gT0.p(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @Nullable
    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
            if (z && parse.code == 100) {
                return null;
            }
            int i2 = parse.code;
            if (i2 == 100) {
                this.state = 3;
                return headers;
            } else if (102 <= i2 && i2 < 200) {
                this.state = 3;
                return headers;
            } else {
                this.state = 4;
                return headers;
            }
        } catch (EOFException e) {
            String redact = getConnection().route().address().url().redact();
            throw new IOException("unexpected end of stream on " + redact, e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@NotNull Response response) {
        C6562gT0.p(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(@NotNull Response response) {
        C6562gT0.p(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        InterfaceC7072ia2 newFixedLengthSource = newFixedLengthSource(headersContentLength);
        Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Headers trailers() {
        if (this.state == 6) {
            Headers headers = this.trailers;
            if (headers == null) {
                return Util.EMPTY_HEADERS;
            }
            return headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet");
    }

    public final void writeRequest(@NotNull Headers headers, @NotNull String str) {
        C6562gT0.p(headers, "headers");
        C6562gT0.p(str, "requestLine");
        if (this.state == 0) {
            this.sink.K1(str).K1(VI0.D);
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.K1(headers.name(i)).K1(": ").K1(headers.value(i)).K1(VI0.D);
            }
            this.sink.K1(VI0.D);
            this.state = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@NotNull Request request) {
        C6562gT0.p(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        C6562gT0.o(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return C9545sf2.c2("chunked", request.header(AI0.K0), true);
    }
}
