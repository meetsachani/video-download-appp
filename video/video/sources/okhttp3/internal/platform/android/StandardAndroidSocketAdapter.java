package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.C6562gT0;
import o.C9516sY;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final Class<?> paramClass;
    @NotNull
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ SocketAdapter buildIfSupported$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.buildIfSupported(str);
        }

        @Nullable
        public final SocketAdapter buildIfSupported(@NotNull String str) {
            C6562gT0.p(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                C6562gT0.n(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                C6562gT0.n(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C6562gT0.o(cls3, "paramsClass");
                return new StandardAndroidSocketAdapter(cls, cls2, cls3);
            } catch (Exception e) {
                Platform.Companion.get().log("unable to load android socket classes", 5, e);
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(@NotNull Class<? super SSLSocket> cls, @NotNull Class<? super SSLSocketFactory> cls2, @NotNull Class<?> cls3) {
        super(cls);
        C6562gT0.p(cls, "sslSocketClass");
        C6562gT0.p(cls2, "sslSocketFactoryClass");
        C6562gT0.p(cls3, "paramClass");
        this.sslSocketFactoryClass = cls2;
        this.paramClass = cls3;
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory) {
        C6562gT0.p(sSLSocketFactory, "sslSocketFactory");
        return this.sslSocketFactoryClass.isInstance(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory) {
        C6562gT0.p(sSLSocketFactory, "sslSocketFactory");
        Object readFieldOrNull = Util.readFieldOrNull(sSLSocketFactory, this.paramClass, "sslParameters");
        C6562gT0.m(readFieldOrNull);
        X509TrustManager x509TrustManager = (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager == null) {
            return (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
        }
        return x509TrustManager;
    }
}
