package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0752Gb implements InterfaceC1329b8 {
    public final /* synthetic */ C04794x A00;

    public C0752Gb(C04794x c04794x) {
        this.A00 = c04794x;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1329b8
    public final void AE7(C1328b7 c1328b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c1328b7.A00() != null);
        this.A00.A06();
    }
}
