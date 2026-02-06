package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C3771Nr1;
import o.C6562gT0;
import o.InterfaceC8303na2;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* loaded from: classes4.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    @NotNull
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    @Nullable
    private final Exchange exchange;
    private final int index;
    @NotNull
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    @NotNull
    private final Request request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(@NotNull RealCall realCall, @NotNull List<? extends Interceptor> list, int i, @Nullable Exchange exchange, @NotNull Request request, int i2, int i3, int i4) {
        C6562gT0.p(realCall, C3771Nr1.E0);
        C6562gT0.p(list, "interceptors");
        C6562gT0.p(request, "request");
        this.call = realCall;
        this.interceptors = list;
        this.index = i;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i2;
        this.readTimeoutMillis = i3;
        this.writeTimeoutMillis = i4;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = realInterceptorChain.index;
        }
        if ((i5 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        if ((i5 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        if ((i5 & 8) != 0) {
            i2 = realInterceptorChain.connectTimeoutMillis;
        }
        if ((i5 & 16) != 0) {
            i3 = realInterceptorChain.readTimeoutMillis;
        }
        if ((i5 & 32) != 0) {
            i4 = realInterceptorChain.writeTimeoutMillis;
        }
        int i6 = i3;
        int i7 = i4;
        return realInterceptorChain.copy$okhttp(i, exchange, request, i2, i6, i7);
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @Nullable
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection$okhttp();
        }
        return null;
    }

    @NotNull
    public final RealInterceptorChain copy$okhttp(int i, @Nullable Exchange exchange, @NotNull Request request, int i2, int i3, int i4) {
        C6562gT0.p(request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, i, exchange, request, i2, i3, i4);
    }

    @NotNull
    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    @Nullable
    public final Exchange getExchange$okhttp() {
        return this.exchange;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }

    @NotNull
    public final Request getRequest$okhttp() {
        return this.request;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Response proceed(@NotNull Request request) throws IOException {
        C6562gT0.p(request, "request");
        if (this.index < this.interceptors.size()) {
            this.calls++;
            Exchange exchange = this.exchange;
            if (exchange != null) {
                if (exchange.getFinder$okhttp().sameHostAndPort(request.url())) {
                    if (this.calls != 1) {
                        throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
                }
            }
            RealInterceptorChain copy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
            Interceptor interceptor = this.interceptors.get(this.index);
            Response intercept = interceptor.intercept(copy$okhttp$default);
            if (intercept != null) {
                if (this.exchange != null && this.index + 1 < this.interceptors.size() && copy$okhttp$default.calls != 1) {
                    throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
                } else if (intercept.body() != null) {
                    return intercept;
                } else {
                    throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
                }
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Request request() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withConnectTimeout(int i, @NotNull TimeUnit timeUnit) {
        C6562gT0.p(timeUnit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", i, timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withReadTimeout(int i, @NotNull TimeUnit timeUnit) {
        C6562gT0.p(timeUnit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", i, timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withWriteTimeout(int i, @NotNull TimeUnit timeUnit) {
        C6562gT0.p(timeUnit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", i, timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
