package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.it  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1803it extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C05567w A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C05347a A02;

    public C1803it(C05347a c05347a, O8 o8, C05567w c05567w) {
        this.A02 = c05347a;
        this.A01 = o8;
        this.A00 = c05567w;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C1145Vm(adErrorType, ""));
    }
}
