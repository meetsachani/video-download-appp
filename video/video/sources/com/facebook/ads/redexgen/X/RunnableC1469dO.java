package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.dO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1469dO implements Runnable {
    public final /* synthetic */ C5S A00;

    public RunnableC1469dO(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1493dm interfaceC1493dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A08 = true;
            interfaceC1493dm = this.A00.A0P;
            interfaceC1493dm.AFw(true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
