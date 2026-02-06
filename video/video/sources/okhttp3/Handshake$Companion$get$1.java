package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import o.AbstractC8052mY0;
import o.FA0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Handshake$Companion$get$1 extends AbstractC8052mY0 implements FA0<List<? extends Certificate>> {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$get$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // o.FA0
    @NotNull
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
