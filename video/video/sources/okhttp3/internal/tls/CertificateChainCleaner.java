package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import o.C6562gT0;
import o.C9516sY;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class CertificateChainCleaner {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final CertificateChainCleaner get(@NotNull X509TrustManager x509TrustManager) {
            C6562gT0.p(x509TrustManager, "trustManager");
            return Platform.Companion.get().buildCertificateChainCleaner(x509TrustManager);
        }

        private Companion() {
        }

        @NotNull
        public final CertificateChainCleaner get(@NotNull X509Certificate... x509CertificateArr) {
            C6562gT0.p(x509CertificateArr, "caCerts");
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }
    }

    @NotNull
    public abstract List<Certificate> clean(@NotNull List<? extends Certificate> list, @NotNull String str) throws SSLPeerUnverifiedException;
}
