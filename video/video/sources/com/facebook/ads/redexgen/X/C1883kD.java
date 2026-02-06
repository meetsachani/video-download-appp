package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.kD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1883kD extends AbstractRunnableC1160Wc {
    public final /* synthetic */ N8 A00;

    public C1883kD(N8 n8) {
        this.A00 = n8;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        N7 n7;
        CountDownLatch countDownLatch;
        this.A00.A07();
        n7 = this.A00.A02;
        n7.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
