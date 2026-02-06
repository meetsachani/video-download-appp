package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Kl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0865Kl extends AbstractRunnableC1160Wc {
    public final /* synthetic */ AbstractC1358bb A00;

    public C0865Kl(AbstractC1358bb abstractC1358bb) {
        this.A00 = abstractC1358bb;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC1358bb abstractC1358bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC1358bb.postOnAnimationDelayed(runnable, i);
    }
}
