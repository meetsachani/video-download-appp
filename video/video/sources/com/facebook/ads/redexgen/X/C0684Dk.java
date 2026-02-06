package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Dk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0684Dk extends UN<C4A> {
    public final /* synthetic */ C0683Dj A00;

    public C0684Dk(C0683Dj c0683Dj) {
        this.A00 = c0683Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.UN
    /* renamed from: A00 */
    public final void A03(C4A c4a) {
        C0710Ek c0710Ek;
        C0710Ek c0710Ek2;
        C0710Ek c0710Ek3;
        String A02;
        c0710Ek = this.A00.A00;
        if (c0710Ek == null) {
            return;
        }
        C0683Dj c0683Dj = this.A00;
        C0683Dj c0683Dj2 = this.A00;
        c0710Ek2 = this.A00.A00;
        int duration = c0710Ek2.getDuration();
        c0710Ek3 = this.A00.A00;
        A02 = c0683Dj2.A02(duration - c0710Ek3.getCurrentPositionInMillis());
        c0683Dj.setText(A02);
    }

    @Override // com.facebook.ads.redexgen.X.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
