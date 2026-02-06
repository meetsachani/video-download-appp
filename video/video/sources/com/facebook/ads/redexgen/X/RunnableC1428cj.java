package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.cj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1428cj implements Runnable {
    public final /* synthetic */ C0836Ji A00;

    public RunnableC1428cj(C0836Ji c0836Ji) {
        this.A00 = c0836Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1390c7 c1390c7;
        C1390c7 c1390c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c1390c7 = this.A00.A0b;
            if (c1390c7.A0D() != null) {
                c1390c72 = this.A00.A0b;
                c1390c72.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
