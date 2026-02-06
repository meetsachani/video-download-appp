package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Hu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0797Hu {
    public final InterfaceC0780Hd A00;

    public abstract boolean A0B(C04774v c04774v) throws C3K;

    public abstract boolean A0C(C04774v c04774v, long j) throws C3K;

    public AbstractC0797Hu(InterfaceC0780Hd interfaceC0780Hd) {
        this.A00 = interfaceC0780Hd;
    }

    public final boolean A00(C04774v c04774v, long j) throws C3K {
        return A0B(c04774v) && A0C(c04774v, j);
    }
}
