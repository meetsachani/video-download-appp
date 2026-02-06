package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ga  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0751Ga extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C04794x A00;

    public C0751Ga(C04794x c04794x) {
        this.A00 = c04794x;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        AbstractC1386c3 abstractC1386c3;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC1386c3 abstractC1386c32;
        abstractC1386c3 = this.A00.A00;
        if (abstractC1386c3 != null) {
            abstractC1386c32 = this.A00.A00;
            abstractC1386c32.A1F();
        }
        AbstractC1208Yb abstractC1208Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC1208Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
