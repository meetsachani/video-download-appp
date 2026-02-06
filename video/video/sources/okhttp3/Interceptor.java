package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o.C6562gT0;
import o.HA0;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public interface Interceptor {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes4.dex */
    public interface Chain {
        @NotNull
        Call call();

        int connectTimeoutMillis();

        @Nullable
        Connection connection();

        @NotNull
        Response proceed(@NotNull Request request) throws IOException;

        int readTimeoutMillis();

        @NotNull
        Request request();

        @NotNull
        Chain withConnectTimeout(int i, @NotNull TimeUnit timeUnit);

        @NotNull
        Chain withReadTimeout(int i, @NotNull TimeUnit timeUnit);

        @NotNull
        Chain withWriteTimeout(int i, @NotNull TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final Interceptor invoke(@NotNull final HA0<? super Chain, Response> ha0) {
            C6562gT0.p(ha0, "block");
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    C6562gT0.p(chain, "it");
                    return ha0.invoke(chain);
                }
            };
        }
    }

    @NotNull
    Response intercept(@NotNull Chain chain) throws IOException;
}
