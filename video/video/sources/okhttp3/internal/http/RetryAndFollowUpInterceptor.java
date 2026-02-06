package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.AI0;
import o.C10219vQ1;
import o.C10662xF;
import o.C6562gT0;
import o.C8222nF;
import o.C9516sY;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int MAX_FOLLOW_UPS = 20;
    @NotNull
    private final OkHttpClient client;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient okHttpClient) {
        C6562gT0.p(okHttpClient, "client");
        this.client = okHttpClient;
    }

    private final Request buildRedirectRequest(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        boolean z;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(response, "Location", null, 2, null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!C6562gT0.g(resolve.scheme(), response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(str)) {
            int code = response.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            if (!httpMethod.redirectsWithBody(str) && code != 308 && code != 307) {
                z = false;
            } else {
                z = true;
            }
            if (httpMethod.redirectsToGet(str) && code != 308 && code != 307) {
                newBuilder.method("GET", null);
            } else {
                if (z) {
                    requestBody = response.request().body();
                }
                newBuilder.method(str, requestBody);
            }
            if (!z) {
                newBuilder.removeHeader(AI0.K0);
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(response.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response response, Exchange exchange) throws IOException {
        Route route;
        RealConnection connection$okhttp;
        if (exchange != null && (connection$okhttp = exchange.getConnection$okhttp()) != null) {
            route = connection$okhttp.route();
        } else {
            route = null;
        }
        int code = response.code();
        String method = response.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code != 421) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!this.client.retryOnConnectionFailure()) {
                                return null;
                            } else {
                                RequestBody body = response.request().body();
                                if (body != null && body.isOneShot()) {
                                    return null;
                                }
                                Response priorResponse = response.priorResponse();
                                if ((priorResponse != null && priorResponse.code() == 408) || retryAfter(response, 0) > 0) {
                                    return null;
                                }
                                return response.request();
                            }
                        } else {
                            C6562gT0.m(route);
                            if (route.proxy().type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, response);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response priorResponse2 = response.priorResponse();
                        if ((priorResponse2 != null && priorResponse2.code() == 503) || retryAfter(response, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return response.request();
                    }
                } else {
                    RequestBody body2 = response.request().body();
                    if ((body2 != null && body2.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                        return null;
                    }
                    exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                    return response.request();
                }
            } else {
                return this.client.authenticator().authenticate(route, response);
            }
        }
        return buildRedirectRequest(response, method);
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request, boolean z) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((z && requestIsOneShot(iOException, request)) || !isRecoverable(iOException, z) || !realCall.retryAfterFailure()) {
            return false;
        }
        return true;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        if ((body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private final int retryAfter(Response response, int i) {
        String header$default = Response.header$default(response, AI0.A0, null, 2, null);
        if (header$default == null) {
            return i;
        }
        if (new C10219vQ1("\\d+").m(header$default)) {
            Integer valueOf = Integer.valueOf(header$default);
            C6562gT0.o(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = r1.getInterceptorScopedExchange$okhttp();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r6 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0.isDuplex$okhttp() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r0.isOneShot() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        r0 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        okhttp3.internal.Util.closeQuietly(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r8 > 20) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = r0.newBuilder().priorResponse(r7.newBuilder().body(null).build()).build();
     */
    @Override // okhttp3.Interceptor
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Request followUpRequest;
        C6562gT0.p(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RealCall call$okhttp = realInterceptorChain.getCall$okhttp();
        List H = C8222nF.H();
        int i = 0;
        Response response = null;
        while (true) {
            boolean z = true;
            while (true) {
                call$okhttp.enterNetworkInterceptorExchange(request$okhttp, z);
                try {
                    if (!call$okhttp.isCanceled()) {
                        try {
                            Response proceed = realInterceptorChain.proceed(request$okhttp);
                            break;
                        } catch (IOException e) {
                            if (recover(e, call$okhttp, request$okhttp, !(e instanceof ConnectionShutdownException))) {
                                H = C10662xF.H4(H, e);
                            } else {
                                throw Util.withSuppressed(e, H);
                            }
                        } catch (RouteException e2) {
                            if (recover(e2.getLastConnectException(), call$okhttp, request$okhttp, false)) {
                                H = C10662xF.H4(H, e2.getFirstConnectException());
                            } else {
                                throw Util.withSuppressed(e2.getFirstConnectException(), H);
                            }
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                    call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                    z = false;
                } catch (Throwable th) {
                    call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                    throw th;
                }
            }
            call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
            request$okhttp = followUpRequest;
        }
    }
}
