package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.3c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04343c extends AbstractC0693Dt {
    public final /* synthetic */ C0681Dh A00;

    public C04343c(C0681Dh c0681Dh) {
        this.A00 = c0681Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.UN
    /* renamed from: A00 */
    public final void A03(C0694Du c0694Du) {
        if (C0681Dh.A02(this.A00) != null && c0694Du.A00().getAction() == 0) {
            C0681Dh.A00(this.A00).removeCallbacksAndMessages(null);
            C0681Dh.A0B(this.A00, new C1574f7(this));
        }
    }
}
