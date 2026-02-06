package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1380bx implements Runnable {
    public final /* synthetic */ C0856Kc A00;

    public RunnableC1380bx(C0856Kc c0856Kc) {
        this.A00 = c0856Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC1386c3) this.A00).A07.A0D() != null) {
                ((AbstractC1386c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
