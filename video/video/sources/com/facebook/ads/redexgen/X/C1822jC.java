package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1822jC implements O3 {
    public final /* synthetic */ C0951Nu A00;

    public C1822jC(C0951Nu c0951Nu) {
        this.A00 = c0951Nu;
    }

    @Override // com.facebook.ads.redexgen.X.O3
    public final void AFF(AdError adError) {
        InterfaceC0950Nt interfaceC0950Nt;
        interfaceC0950Nt = this.A00.A04;
        interfaceC0950Nt.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.O3
    public final void AFG() {
        InterfaceC0950Nt interfaceC0950Nt;
        interfaceC0950Nt = this.A00.A04;
        interfaceC0950Nt.ACp();
    }
}
