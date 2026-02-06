package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC1329b8 {
    public final /* synthetic */ C1157Vz A00;

    public W2(C1157Vz c1157Vz) {
        this.A00 = c1157Vz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1329b8
    public final void AE7(C1328b7 c1328b7) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        VV vv;
        VV vv2;
        atomicBoolean = this.A00.A0G;
        atomicBoolean.set(c1328b7.A00() != null);
        atomicBoolean2 = this.A00.A0H;
        if (atomicBoolean2.get()) {
            vv = this.A00.A05;
            if (vv != null) {
                vv2 = this.A00.A05;
                vv2.AFB(c1328b7.A00() != null);
            }
        }
    }
}
