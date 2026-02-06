package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.AI0;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC7072ia2;
import o.J82;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private volatile boolean canceled;
    @NotNull
    private final RealInterceptorChain chain;
    @NotNull
    private final RealConnection connection;
    @NotNull
    private final Http2Connection http2Connection;
    @NotNull
    private final Protocol protocol;
    @Nullable
    private volatile Http2Stream stream;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String CONNECTION = "connection";
    @NotNull
    private static final String HOST = "host";
    @NotNull
    private static final String KEEP_ALIVE = "keep-alive";
    @NotNull
    private static final String PROXY_CONNECTION = "proxy-connection";
    @NotNull
    private static final String TE = "te";
    @NotNull
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    @NotNull
    private static final String ENCODING = "encoding";
    @NotNull
    private static final String UPGRADE = "upgrade";
    @NotNull
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    @NotNull
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final List<Header> http2HeadersList(@NotNull Request request) {
            C6562gT0.p(request, "request");
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String header = request.header(AI0.w);
            if (header != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                Locale locale = Locale.US;
                C6562gT0.o(locale, "US");
                String lowerCase = name.toLowerCase(locale);
                C6562gT0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (C6562gT0.g(lowerCase, Http2ExchangeCodec.TE) && C6562gT0.g(headers.value(i), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headers.value(i)));
                }
            }
            return arrayList;
        }

        @NotNull
        public final Response.Builder readHttp2HeadersList(@NotNull Headers headers, @NotNull Protocol protocol) {
            C6562gT0.p(headers, "headerBlock");
            C6562gT0.p(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            StatusLine statusLine = null;
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if (C6562gT0.g(name, Header.RESPONSE_STATUS_UTF8)) {
                    StatusLine.Companion companion = StatusLine.Companion;
                    statusLine = companion.parse("HTTP/1.1 " + value);
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(@NotNull OkHttpClient okHttpClient, @NotNull RealConnection realConnection, @NotNull RealInterceptorChain realInterceptorChain, @NotNull Http2Connection http2Connection) {
        C6562gT0.p(okHttpClient, "client");
        C6562gT0.p(realConnection, CONNECTION);
        C6562gT0.p(realInterceptorChain, "chain");
        C6562gT0.p(http2Connection, "http2Connection");
        this.connection = realConnection;
        this.chain = realInterceptorChain;
        this.http2Connection = http2Connection;
        List<Protocol> protocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = protocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public J82 createRequestBody(@NotNull Request request, long j) {
        C6562gT0.p(request, "request");
        Http2Stream http2Stream = this.stream;
        C6562gT0.m(http2Stream);
        return http2Stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        Http2Stream http2Stream = this.stream;
        C6562gT0.m(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public InterfaceC7072ia2 openResponseBodySource(@NotNull Response response) {
        C6562gT0.p(response, "response");
        Http2Stream http2Stream = this.stream;
        C6562gT0.m(http2Stream);
        return http2Stream.getSource$okhttp();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @Nullable
    public Response.Builder readResponseHeaders(boolean z) {
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            Response.Builder readHttp2HeadersList = Companion.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
            if (z && readHttp2HeadersList.getCode$okhttp() == 100) {
                return null;
            }
            return readHttp2HeadersList;
        }
        throw new IOException("stream wasn't created");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@NotNull Response response) {
        C6562gT0.p(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        return Util.headersContentLength(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        C6562gT0.m(http2Stream);
        return http2Stream.trailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@NotNull Request request) {
        boolean z;
        C6562gT0.p(request, "request");
        if (this.stream != null) {
            return;
        }
        if (request.body() != null) {
            z = true;
        } else {
            z = false;
        }
        this.stream = this.http2Connection.newStream(Companion.http2HeadersList(request), z);
        if (!this.canceled) {
            Http2Stream http2Stream = this.stream;
            C6562gT0.m(http2Stream);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            http2Stream.readTimeout().timeout(this.chain.getReadTimeoutMillis$okhttp(), timeUnit);
            Http2Stream http2Stream2 = this.stream;
            C6562gT0.m(http2Stream2);
            http2Stream2.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), timeUnit);
            return;
        }
        Http2Stream http2Stream3 = this.stream;
        C6562gT0.m(http2Stream3);
        http2Stream3.closeLater(ErrorCode.CANCEL);
        throw new IOException("Canceled");
    }
}
