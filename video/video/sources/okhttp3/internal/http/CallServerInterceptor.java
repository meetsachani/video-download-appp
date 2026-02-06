package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import o.AI0;
import o.C3917Pf0;
import o.C6562gT0;
import o.C9545sf2;
import o.C9604su1;
import o.InterfaceC2579Bq;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // okhttp3.Interceptor
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder builder;
        Response.Builder builder2;
        Response build;
        int code;
        Response build2;
        ResponseBody body;
        long j;
        Response.Builder builder3;
        C6562gT0.p(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        C6562gT0.m(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody body2 = request$okhttp.body();
        long currentTimeMillis = System.currentTimeMillis();
        Long l = null;
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            ?? permitsRequestBody = HttpMethod.permitsRequestBody(request$okhttp.method());
            try {
                if (permitsRequestBody != 0 && body2 != null) {
                    if (C9545sf2.c2("100-continue", request$okhttp.header(AI0.s), true)) {
                        exchange$okhttp.flushRequest();
                        Response.Builder readResponseHeaders = exchange$okhttp.readResponseHeaders(true);
                        try {
                            exchange$okhttp.responseHeadersStart();
                            z = false;
                            builder3 = readResponseHeaders;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            builder = readResponseHeaders;
                            if (!(e instanceof ConnectionShutdownException)) {
                                builder2 = builder;
                                if (!exchange$okhttp.getHasFailure$okhttp()) {
                                    throw e;
                                }
                                if (builder2 == null) {
                                }
                                build = builder2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                                code = build.code();
                                if (shouldIgnoreAndWaitForRealResponse(code)) {
                                }
                                exchange$okhttp.responseHeadersEnd(build);
                                if (!this.forWebSocket) {
                                }
                                build2 = build.newBuilder().body(exchange$okhttp.openResponseBody(build)).build();
                                if (!C9545sf2.c2("close", build2.request().header("Connection"), true)) {
                                }
                                exchange$okhttp.noNewExchangesOnConnection();
                                if (code != 204) {
                                }
                                body = build2.body();
                                if (body == null) {
                                }
                                if (j > 0) {
                                }
                                return build2;
                            }
                            throw e;
                        }
                    } else {
                        z = true;
                        builder3 = null;
                    }
                    if (builder3 == null) {
                        if (body2.isDuplex()) {
                            exchange$okhttp.flushRequest();
                            body2.writeTo(C9604su1.d(exchange$okhttp.createRequestBody(request$okhttp, true)));
                            permitsRequestBody = builder3;
                        } else {
                            InterfaceC2579Bq d = C9604su1.d(exchange$okhttp.createRequestBody(request$okhttp, false));
                            body2.writeTo(d);
                            d.close();
                            permitsRequestBody = builder3;
                        }
                    } else {
                        exchange$okhttp.noRequestBody();
                        permitsRequestBody = builder3;
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange$okhttp.noNewExchangesOnConnection();
                            permitsRequestBody = builder3;
                        }
                    }
                } else {
                    exchange$okhttp.noRequestBody();
                    z = true;
                    permitsRequestBody = 0;
                }
                if (body2 == null || !body2.isDuplex()) {
                    exchange$okhttp.finishRequest();
                }
                e = null;
                builder2 = permitsRequestBody;
            } catch (IOException e2) {
                e = e2;
                builder = permitsRequestBody;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            builder = null;
        }
        if (builder2 == null) {
            try {
                builder2 = exchange$okhttp.readResponseHeaders(false);
                C6562gT0.m(builder2);
                if (z) {
                    exchange$okhttp.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e4) {
                if (e != null) {
                    C3917Pf0.a(e, e4);
                    throw e;
                }
                throw e4;
            }
        }
        build = builder2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        code = build.code();
        if (shouldIgnoreAndWaitForRealResponse(code)) {
            Response.Builder readResponseHeaders2 = exchange$okhttp.readResponseHeaders(false);
            C6562gT0.m(readResponseHeaders2);
            if (z) {
                exchange$okhttp.responseHeadersStart();
            }
            build = readResponseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange$okhttp.responseHeadersEnd(build);
        if (!this.forWebSocket && code == 101) {
            build2 = build.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            build2 = build.newBuilder().body(exchange$okhttp.openResponseBody(build)).build();
        }
        if (!C9545sf2.c2("close", build2.request().header("Connection"), true) || C9545sf2.c2("close", Response.header$default(build2, "Connection", null, 2, null), true)) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (code != 204 || code == 205) {
            body = build2.body();
            if (body == null) {
                j = body.contentLength();
            } else {
                j = -1;
            }
            if (j > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(code);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody body3 = build2.body();
                if (body3 != null) {
                    l = Long.valueOf(body3.contentLength());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return build2;
    }
}
