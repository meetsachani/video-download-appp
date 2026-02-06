package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1809iz extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C1869jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C05437j A02;

    public C1809iz(C05437j c05437j, O8 o8, C1869jz c1869jz) {
        this.A02 = c05437j;
        this.A01 = o8;
        this.A00 = c1869jz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1145Vm A00 = C1145Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
