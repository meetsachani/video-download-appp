package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int MAX_SIGNERS = 9;
    @NotNull
    private final TrustRootIndex trustRootIndex;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public BasicCertificateChainCleaner(@NotNull TrustRootIndex trustRootIndex) {
        C6562gT0.p(trustRootIndex, "trustRootIndex");
        this.trustRootIndex = trustRootIndex;
    }

    private final boolean verifySignature(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C6562gT0.g(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    @NotNull
    public List<Certificate> clean(@NotNull List<? extends Certificate> list, @NotNull String str) throws SSLPeerUnverifiedException {
        C6562gT0.p(list, "chain");
        C6562gT0.p(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C6562gT0.o(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            C6562gT0.n(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate findByIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !C6562gT0.g(x509Certificate, findByIssuerAndSignature)) {
                    arrayList.add(findByIssuerAndSignature);
                }
                if (!verifySignature(findByIssuerAndSignature, findByIssuerAndSignature)) {
                    z = true;
                } else {
                    return arrayList;
                }
            } else {
                Iterator it = arrayDeque.iterator();
                C6562gT0.o(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    C6562gT0.n(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (verifySignature(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof BasicCertificateChainCleaner) && C6562gT0.g(((BasicCertificateChainCleaner) obj).trustRootIndex, this.trustRootIndex)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }
}
