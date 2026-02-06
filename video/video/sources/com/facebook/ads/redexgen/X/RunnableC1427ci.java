package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ci  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1427ci implements Runnable {
    public final /* synthetic */ C0836Ji A00;

    public RunnableC1427ci(C0836Ji c0836Ji) {
        this.A00 = c0836Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0D;
            if (z) {
                this.A00.A0M();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
