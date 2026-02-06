package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import o.C5422bq;
import o.C6562gT0;
import o.C8222nF;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC2677Cq;
import o.InterfaceC8046mW0;
import o.InterfaceC8289nW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
/* loaded from: classes4.dex */
public final class Response implements Closeable {
    @Nullable
    private final ResponseBody body;
    @Nullable
    private final Response cacheResponse;
    private final int code;
    @Nullable
    private final Exchange exchange;
    @Nullable
    private final Handshake handshake;
    @NotNull
    private final Headers headers;
    @Nullable
    private CacheControl lazyCacheControl;
    @NotNull
    private final String message;
    @Nullable
    private final Response networkResponse;
    @Nullable
    private final Response priorResponse;
    @NotNull
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    @NotNull
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(@NotNull Request request, @NotNull Protocol protocol, @NotNull String str, int i, @Nullable Handshake handshake, @NotNull Headers headers, @Nullable ResponseBody responseBody, @Nullable Response response, @Nullable Response response2, @Nullable Response response3, long j, long j2, @Nullable Exchange exchange) {
        C6562gT0.p(request, "request");
        C6562gT0.p(protocol, "protocol");
        C6562gT0.p(str, "message");
        C6562gT0.p(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @InterfaceC8046mW0(name = "-deprecated_body")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "body", imports = {}))
    @Nullable
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final ResponseBody m135deprecated_body() {
        return this.body;
    }

    @InterfaceC8046mW0(name = "-deprecated_cacheControl")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "cacheControl", imports = {}))
    @NotNull
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m136deprecated_cacheControl() {
        return cacheControl();
    }

    @InterfaceC8046mW0(name = "-deprecated_cacheResponse")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "cacheResponse", imports = {}))
    @Nullable
    /* renamed from: -deprecated_cacheResponse  reason: not valid java name */
    public final Response m137deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @InterfaceC8046mW0(name = "-deprecated_code")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "code", imports = {}))
    /* renamed from: -deprecated_code  reason: not valid java name */
    public final int m138deprecated_code() {
        return this.code;
    }

    @InterfaceC8046mW0(name = "-deprecated_handshake")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "handshake", imports = {}))
    @Nullable
    /* renamed from: -deprecated_handshake  reason: not valid java name */
    public final Handshake m139deprecated_handshake() {
        return this.handshake;
    }

    @InterfaceC8046mW0(name = "-deprecated_headers")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "headers", imports = {}))
    @NotNull
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m140deprecated_headers() {
        return this.headers;
    }

    @InterfaceC8046mW0(name = "-deprecated_message")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "message", imports = {}))
    @NotNull
    /* renamed from: -deprecated_message  reason: not valid java name */
    public final String m141deprecated_message() {
        return this.message;
    }

    @InterfaceC8046mW0(name = "-deprecated_networkResponse")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "networkResponse", imports = {}))
    @Nullable
    /* renamed from: -deprecated_networkResponse  reason: not valid java name */
    public final Response m142deprecated_networkResponse() {
        return this.networkResponse;
    }

    @InterfaceC8046mW0(name = "-deprecated_priorResponse")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "priorResponse", imports = {}))
    @Nullable
    /* renamed from: -deprecated_priorResponse  reason: not valid java name */
    public final Response m143deprecated_priorResponse() {
        return this.priorResponse;
    }

    @InterfaceC8046mW0(name = "-deprecated_protocol")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "protocol", imports = {}))
    @NotNull
    /* renamed from: -deprecated_protocol  reason: not valid java name */
    public final Protocol m144deprecated_protocol() {
        return this.protocol;
    }

    @InterfaceC8046mW0(name = "-deprecated_receivedResponseAtMillis")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "receivedResponseAtMillis", imports = {}))
    /* renamed from: -deprecated_receivedResponseAtMillis  reason: not valid java name */
    public final long m145deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @InterfaceC8046mW0(name = "-deprecated_request")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "request", imports = {}))
    @NotNull
    /* renamed from: -deprecated_request  reason: not valid java name */
    public final Request m146deprecated_request() {
        return this.request;
    }

    @InterfaceC8046mW0(name = "-deprecated_sentRequestAtMillis")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "sentRequestAtMillis", imports = {}))
    /* renamed from: -deprecated_sentRequestAtMillis  reason: not valid java name */
    public final long m147deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @InterfaceC8046mW0(name = "body")
    @Nullable
    public final ResponseBody body() {
        return this.body;
    }

    @InterfaceC8046mW0(name = "cacheControl")
    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    @InterfaceC8046mW0(name = "cacheResponse")
    @Nullable
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @NotNull
    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i = this.code;
        if (i != 401) {
            if (i != 407) {
                return C8222nF.H();
            }
            str = "Proxy-Authenticate";
        } else {
            str = "WWW-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    @InterfaceC8046mW0(name = "code")
    public final int code() {
        return this.code;
    }

    @InterfaceC8046mW0(name = "exchange")
    @Nullable
    public final Exchange exchange() {
        return this.exchange;
    }

    @InterfaceC8046mW0(name = "handshake")
    @Nullable
    public final Handshake handshake() {
        return this.handshake;
    }

    @InterfaceC8289nW0
    @Nullable
    public final String header(@NotNull String str) {
        C6562gT0.p(str, "name");
        return header$default(this, str, null, 2, null);
    }

    @InterfaceC8046mW0(name = "headers")
    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSuccessful() {
        int i = this.code;
        if (200 > i || i >= 300) {
            return false;
        }
        return true;
    }

    @InterfaceC8046mW0(name = "message")
    @NotNull
    public final String message() {
        return this.message;
    }

    @InterfaceC8046mW0(name = "networkResponse")
    @Nullable
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @NotNull
    public final ResponseBody peekBody(long j) throws IOException {
        ResponseBody responseBody = this.body;
        C6562gT0.m(responseBody);
        InterfaceC2677Cq peek = responseBody.source().peek();
        C5422bq c5422bq = new C5422bq();
        peek.e2(j);
        c5422bq.Y2(peek, Math.min(j, peek.B().size()));
        return ResponseBody.Companion.create(c5422bq, this.body.contentType(), c5422bq.size());
    }

    @InterfaceC8046mW0(name = "priorResponse")
    @Nullable
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @InterfaceC8046mW0(name = "protocol")
    @NotNull
    public final Protocol protocol() {
        return this.protocol;
    }

    @InterfaceC8046mW0(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @InterfaceC8046mW0(name = "request")
    @NotNull
    public final Request request() {
        return this.request;
    }

    @InterfaceC8046mW0(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    @NotNull
    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    @InterfaceC8289nW0
    @Nullable
    public final String header(@NotNull String str, @Nullable String str2) {
        C6562gT0.p(str, "name");
        String str3 = this.headers.get(str);
        return str3 == null ? str2 : str3;
    }

    @NotNull
    public final List<String> headers(@NotNull String str) {
        C6562gT0.p(str, "name");
        return this.headers.values(str);
    }

    @InterfaceC8303na2({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    /* loaded from: classes4.dex */
    public static class Builder {
        @Nullable
        private ResponseBody body;
        @Nullable
        private Response cacheResponse;
        private int code;
        @Nullable
        private Exchange exchange;
        @Nullable
        private Handshake handshake;
        @NotNull
        private Headers.Builder headers;
        @Nullable
        private String message;
        @Nullable
        private Response networkResponse;
        @Nullable
        private Response priorResponse;
        @Nullable
        private Protocol protocol;
        private long receivedResponseAtMillis;
        @Nullable
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response == null || response.body() == null) {
                return;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                if (response.body() == null) {
                    if (response.networkResponse() == null) {
                        if (response.cacheResponse() == null) {
                            if (response.priorResponse() == null) {
                                return;
                            }
                            throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        @NotNull
        public Builder addHeader(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        @NotNull
        public Builder body(@Nullable ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        @NotNull
        public Response build() {
            int i = this.code;
            if (i >= 0) {
                Request request = this.request;
                if (request != null) {
                    Protocol protocol = this.protocol;
                    if (protocol != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("protocol == null");
                }
                throw new IllegalStateException("request == null");
            }
            throw new IllegalStateException(("code < 0: " + this.code).toString());
        }

        @NotNull
        public Builder cacheResponse(@Nullable Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        @NotNull
        public Builder code(int i) {
            this.code = i;
            return this;
        }

        @Nullable
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        @Nullable
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @Nullable
        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        @Nullable
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @Nullable
        public final String getMessage$okhttp() {
            return this.message;
        }

        @Nullable
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @Nullable
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @Nullable
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @Nullable
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @NotNull
        public Builder handshake(@Nullable Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        @NotNull
        public Builder header(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            this.headers.set(str, str2);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            C6562gT0.p(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(@NotNull Exchange exchange) {
            C6562gT0.p(exchange, "deferredTrailers");
            this.exchange = exchange;
        }

        @NotNull
        public Builder message(@NotNull String str) {
            C6562gT0.p(str, "message");
            this.message = str;
            return this;
        }

        @NotNull
        public Builder networkResponse(@Nullable Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        @NotNull
        public Builder priorResponse(@Nullable Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        @NotNull
        public Builder protocol(@NotNull Protocol protocol) {
            C6562gT0.p(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @NotNull
        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        @NotNull
        public Builder removeHeader(@NotNull String str) {
            C6562gT0.p(str, "name");
            this.headers.removeAll(str);
            return this;
        }

        @NotNull
        public Builder request(@NotNull Request request) {
            C6562gT0.p(request, "request");
            this.request = request;
            return this;
        }

        @NotNull
        public Builder sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public final void setBody$okhttp(@Nullable ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@Nullable Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(@Nullable Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(@Nullable Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            C6562gT0.p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@Nullable String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@Nullable Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@Nullable Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@Nullable Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(@Nullable Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public Builder(@NotNull Response response) {
            C6562gT0.p(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}
