package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o.AI0;
import o.C5422bq;
import o.C6562gT0;
import o.C8120mp2;
import o.C9516sY;
import o.C9545sf2;
import o.C9604su1;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import o.InterfaceC7072ia2;
import o.InterfaceC8148mw2;
import o.J82;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class CacheInterceptor implements Interceptor {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private final Cache cache;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if ((!C9545sf2.c2(AI0.g, name, true) || !C9545sf2.J2(value, "1", false, 2, null)) && (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null)) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String name2 = headers2.name(i2);
                if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                    builder.addLenient$okhttp(name2, headers2.value(i2));
                }
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String str) {
            if (C9545sf2.c2("Content-Length", str, true) || C9545sf2.c2("Content-Encoding", str, true) || C9545sf2.c2("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        private final boolean isEndToEnd(String str) {
            if (!C9545sf2.c2("Connection", str, true) && !C9545sf2.c2(AI0.u0, str, true) && !C9545sf2.c2("Proxy-Authenticate", str, true) && !C9545sf2.c2(AI0.H, str, true) && !C9545sf2.c2(AI0.M, str, true) && !C9545sf2.c2("Trailers", str, true) && !C9545sf2.c2(AI0.K0, str, true) && !C9545sf2.c2(AI0.N, str, true)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response response) {
            ResponseBody responseBody;
            if (response != null) {
                responseBody = response.body();
            } else {
                responseBody = null;
            }
            if (responseBody != null) {
                return response.newBuilder().body(null).build();
            }
            return response;
        }

        private Companion() {
        }
    }

    public CacheInterceptor(@Nullable Cache cache) {
        this.cache = cache;
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        J82 body = cacheRequest.body();
        ResponseBody body2 = response.body();
        C6562gT0.m(body2);
        final InterfaceC2677Cq source = body2.source();
        final InterfaceC2579Bq d = C9604su1.d(body);
        InterfaceC7072ia2 interfaceC7072ia2 = new InterfaceC7072ia2() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                InterfaceC2677Cq.this.close();
            }

            @Override // o.InterfaceC7072ia2
            public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
                C6562gT0.p(c5422bq, "sink");
                try {
                    long read = InterfaceC2677Cq.this.read(c5422bq, j);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            d.close();
                        }
                        return -1L;
                    }
                    c5422bq.p(d.B(), c5422bq.size() - read, read);
                    d.l1();
                    return read;
                } catch (IOException e) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e;
                }
            }

            @Override // o.InterfaceC7072ia2
            @NotNull
            public C8120mp2 timeout() {
                return InterfaceC2677Cq.this.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().contentLength(), C9604su1.e(interfaceC7072ia2))).build();
    }

    @Nullable
    public final Cache getCache$okhttp() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Response response;
        EventListener eventListener;
        ResponseBody body;
        ResponseBody body2;
        C6562gT0.p(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        RealCall realCall = null;
        if (cache != null) {
            response = cache.get$okhttp(chain.request());
        } else {
            response = null;
        }
        CacheStrategy compute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = compute.getNetworkRequest();
        Response cacheResponse = compute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(compute);
        }
        if (call instanceof RealCall) {
            realCall = (RealCall) call;
        }
        if (realCall == null || (eventListener = realCall.getEventListener$okhttp()) == null) {
            eventListener = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (body2 = response.body()) != null) {
            Util.closeQuietly(body2);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response build = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(InterfaceC8148mw2.g.l).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, build);
            return build;
        } else if (networkRequest == null) {
            C6562gT0.m(cacheResponse);
            Response build2 = cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, build2);
            return build2;
        } else {
            if (cacheResponse != null) {
                eventListener.cacheConditionalHit(call, cacheResponse);
            } else if (this.cache != null) {
                eventListener.cacheMiss(call);
            }
            try {
                Response proceed = chain.proceed(networkRequest);
                if (proceed == null && response != null && body != null) {
                }
                if (cacheResponse != null) {
                    if (proceed != null && proceed.code() == 304) {
                        Response.Builder newBuilder = cacheResponse.newBuilder();
                        Companion companion = Companion;
                        Response build3 = newBuilder.headers(companion.combine(cacheResponse.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(proceed)).build();
                        ResponseBody body3 = proceed.body();
                        C6562gT0.m(body3);
                        body3.close();
                        Cache cache3 = this.cache;
                        C6562gT0.m(cache3);
                        cache3.trackConditionalCacheHit$okhttp();
                        this.cache.update$okhttp(cacheResponse, build3);
                        eventListener.cacheHit(call, build3);
                        return build3;
                    }
                    ResponseBody body4 = cacheResponse.body();
                    if (body4 != null) {
                        Util.closeQuietly(body4);
                    }
                }
                C6562gT0.m(proceed);
                Response.Builder newBuilder2 = proceed.newBuilder();
                Companion companion2 = Companion;
                Response build4 = newBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(proceed)).build();
                if (this.cache != null) {
                    if (HttpHeaders.promisesBody(build4) && CacheStrategy.Companion.isCacheable(build4, networkRequest)) {
                        Response cacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(build4), build4);
                        if (cacheResponse != null) {
                            eventListener.cacheMiss(call);
                        }
                        return cacheWritingResponse;
                    } else if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                        try {
                            this.cache.remove$okhttp(networkRequest);
                        } catch (IOException unused) {
                        }
                    }
                }
                return build4;
            } finally {
                if (response != null && (body = response.body()) != null) {
                    Util.closeQuietly(body);
                }
            }
        }
    }
}
