package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class WX extends UO<String> {
    public final /* synthetic */ V7 A00;
    public final /* synthetic */ WW A01;

    public WX(WW ww, V7 v7) {
        this.A01 = ww;
        this.A00 = v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.UO
    /* renamed from: A00 */
    public final void A02(String str) {
        V9 v9;
        V9 v92;
        super.A02(str);
        if (this.A00.A0B()) {
            v92 = this.A01.A02;
            v92.A62();
            return;
        }
        v9 = this.A01.A02;
        v9.A61();
    }

    @Override // com.facebook.ads.redexgen.X.UO
    public final void A01(int i, String str) {
        super.A01(i, str);
    }
}
