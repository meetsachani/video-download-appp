package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1821jB implements SM {
    public final /* synthetic */ C0951Nu A00;

    public C1821jB(C0951Nu c0951Nu) {
        this.A00 = c0951Nu;
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACx() {
        InterfaceC0950Nt interfaceC0950Nt;
        interfaceC0950Nt = this.A00.A04;
        interfaceC0950Nt.ACp();
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACy() {
        InterfaceC0950Nt interfaceC0950Nt;
        interfaceC0950Nt = this.A00.A04;
        interfaceC0950Nt.ACo(AdError.CACHE_ERROR);
    }
}
