package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.rL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2291rL {
    public InterfaceC2292rM A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A02() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A03(InterfaceC2292rM interfaceC2292rM) {
        this.A00 = interfaceC2292rM;
    }
}
