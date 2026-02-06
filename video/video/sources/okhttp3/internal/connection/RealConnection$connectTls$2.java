package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC8052mY0;
import o.C6562gT0;
import o.C8466oF;
import o.FA0;
import o.InterfaceC8303na2;
import okhttp3.Handshake;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1549#2:766\n1620#2,3:767\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n*L\n411#1:766\n411#1:767,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RealConnection$connectTls$2 extends AbstractC8052mY0 implements FA0<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // o.FA0
    @NotNull
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake;
        handshake = this.this$0.handshake;
        C6562gT0.m(handshake);
        List<Certificate> peerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(C8466oF.b0(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            C6562gT0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
