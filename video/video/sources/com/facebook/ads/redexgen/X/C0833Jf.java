package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Jf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0833Jf implements InterfaceC1329b8 {
    public final WeakReference<AnonymousClass67> A00;

    public C0833Jf(AnonymousClass67 anonymousClass67) {
        this.A00 = new WeakReference<>(anonymousClass67);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1329b8
    public final void AE7(C1328b7 c1328b7) {
        AnonymousClass67 anonymousClass67 = this.A00.get();
        if (anonymousClass67 != null) {
            anonymousClass67.A06 = c1328b7.A00() != null;
            anonymousClass67.A02();
        }
    }
}
