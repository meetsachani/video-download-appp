package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.dg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1487dg implements Runnable {
    public final /* synthetic */ AnonymousClass55 A00;

    public RunnableC1487dg(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1493dm interfaceC1493dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0B = true;
            interfaceC1493dm = this.A00.A0Z;
            interfaceC1493dm.AFw(true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
