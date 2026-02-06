package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.az  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1320az implements Runnable {
    public final /* synthetic */ C1321b0 A00;
    public final /* synthetic */ InterfaceC1322b1 A01;

    public RunnableC1320az(C1321b0 c1321b0, InterfaceC1322b1 interfaceC1322b1) {
        this.A00 = c1321b0;
        this.A01 = interfaceC1322b1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
