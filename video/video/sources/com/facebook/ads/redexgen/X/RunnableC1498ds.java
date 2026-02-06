package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ds  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1498ds implements Runnable {
    public final /* synthetic */ GS A00;

    public RunnableC1498ds(GS gs) {
        this.A00 = gs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0H(VH.A0b);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
