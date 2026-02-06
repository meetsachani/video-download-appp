package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ke  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0858Ke implements InterfaceC1329b8 {
    public final WeakReference<C6M> A00;

    public C0858Ke(C6M c6m) {
        this.A00 = new WeakReference<>(c6m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1329b8
    public final void AE7(C1328b7 c1328b7) {
        C6M c6m = this.A00.get();
        if (c6m != null) {
            c6m.A04 = c1328b7.A00() != null;
            c6m.A02();
        }
    }
}
