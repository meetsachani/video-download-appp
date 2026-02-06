package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.AbstractC8052mY0;
import o.C8222nF;
import o.FA0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Handshake$peerCertificates$2 extends AbstractC8052mY0 implements FA0<List<? extends Certificate>> {
    final /* synthetic */ FA0<List<Certificate>> $peerCertificatesFn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(FA0<? extends List<? extends Certificate>> fa0) {
        super(0);
        this.$peerCertificatesFn = fa0;
    }

    @Override // o.FA0
    @NotNull
    public final List<? extends Certificate> invoke() {
        try {
            return this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return C8222nF.H();
        }
    }
}
