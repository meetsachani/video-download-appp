package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ch  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1426ch implements Runnable {
    public final /* synthetic */ C0836Ji A00;

    public RunnableC1426ch(C0836Ji c0836Ji) {
        this.A00 = c0836Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1350bT c1350bT;
        C1350bT c1350bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1350bT = this.A00.A09;
            if (c1350bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c1350bT2 = this.A00.A09;
                c1350bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
