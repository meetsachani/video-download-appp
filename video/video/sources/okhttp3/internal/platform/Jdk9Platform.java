package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.C6562gT0;
import o.C9302rf2;
import o.C9516sY;
import o.InterfaceC8303na2;
import o.LU0;
import o.MU0;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2,2:90\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n36#1:90,2\n*E\n"})
/* loaded from: classes4.dex */
public class Jdk9Platform extends Platform {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final boolean isAvailable;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @Nullable
        public final Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean isAvailable() {
            return Jdk9Platform.isAvailable;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0.intValue() >= 9) goto L8;
     */
    static {
        Integer num;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            num = C9302rf2.p1(property);
        } else {
            num = null;
        }
        boolean z = false;
        if (num == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        z = true;
        isAvailable = z;
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<Protocol> list) {
        C6562gT0.p(sSLSocket, "sslSocket");
        C6562gT0.p(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        LU0.a(sSLParameters, (String[]) Platform.Companion.alpnProtocolNames(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket) {
        boolean g;
        C6562gT0.p(sSLSocket, "sslSocket");
        try {
            String a = MU0.a(sSLSocket);
            if (a == null) {
                g = true;
            } else {
                g = C6562gT0.g(a, "");
            }
            if (g) {
                return null;
            }
            return a;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory) {
        C6562gT0.p(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
