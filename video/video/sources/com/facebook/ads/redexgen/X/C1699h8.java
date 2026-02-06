package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.h8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1699h8 extends WP {
    public final /* synthetic */ C1696h5 A00;
    public final /* synthetic */ C1145Vm A01;

    public C1699h8(C1696h5 c1696h5, C1145Vm c1145Vm) {
        this.A00 = c1696h5;
        this.A01 = c1145Vm;
    }

    @Override // com.facebook.ads.redexgen.X.WP
    public final void A01() {
        S6 s6;
        S6 s62;
        s6 = this.A00.A01;
        if (s6.A00() != null) {
            s62 = this.A00.A01;
            s62.A00().onAdError(XE.A00(this.A01));
        }
    }
}
