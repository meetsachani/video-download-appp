package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Fu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0745Fu implements InterfaceC1041Rk {
    public final /* synthetic */ C1035Re A00;
    public final /* synthetic */ C4U A01;

    public C0745Fu(C4U c4u, C1035Re c1035Re) {
        this.A01 = c4u;
        this.A00 = c1035Re;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1041Rk
    public final boolean AAI() {
        boolean A0j;
        boolean A0k;
        if (!this.A01.A0i()) {
            A0j = this.A01.A0j();
            if (A0j) {
                return true;
            }
            A0k = this.A01.A0k();
            return A0k;
        }
        this.A01.A0h(this.A00);
        return true;
    }
}
