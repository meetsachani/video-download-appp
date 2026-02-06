package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ih  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0810Ih implements InterfaceC1329b8 {
    public final /* synthetic */ C04895h A00;

    public C0810Ih(C04895h c04895h) {
        this.A00 = c04895h;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1329b8
    public final void AE7(C1328b7 c1328b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c1328b7.A00() != null);
        this.A00.A07();
    }
}
