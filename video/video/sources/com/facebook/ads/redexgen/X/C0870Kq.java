package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Kq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0870Kq extends AbstractRunnableC1160Wc {
    public final /* synthetic */ AbstractC1358bb A00;

    public C0870Kq(AbstractC1358bb abstractC1358bb) {
        this.A00 = abstractC1358bb;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC1358bb abstractC1358bb = this.A00;
            i = this.A00.A08;
            abstractC1358bb.postDelayed(this, i);
            return;
        }
        this.A00.setPressed(true);
        AbstractC1358bb abstractC1358bb2 = this.A00;
        runnable = this.A00.A0A;
        abstractC1358bb2.postOnAnimationDelayed(runnable, 250L);
    }
}
