package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05437j extends AbstractC1810j0 {
    public C05437j(C1673gi c1673gi, O7 o7) {
        super(c1673gi, o7);
    }

    private C1808iy A00(Runnable runnable) {
        return new C1808iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final NQ A0I() {
        C1869jz successfullyLoadedAdapter = (C1869jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final void A0P() {
        C1869jz interstitialAdapter = (C1869jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final void A0R(N1 n1, C1104Tw c1104Tw, C1102Tu c1102Tu, O8 o8) {
        C1869jz c1869jz = (C1869jz) n1;
        C1809iz c1809iz = new C1809iz(this, o8, c1869jz);
        A0H().postDelayed(c1809iz, c1104Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c1869jz.A0A(this.A0B, A00(c1809iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
