package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Xf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1186Xf implements InterfaceC2298rS<C1130Uw, V1> {
    public XM A00;

    public C1186Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2298rS
    public final void A6R(C2293rN<C1130Uw, V1> c2293rN, InterfaceC2283rD interfaceC2283rD) {
        switch (interfaceC2283rD.A9U(c2293rN)) {
            case A02:
            case A04:
                this.A00.A02(c2293rN, interfaceC2283rD);
                return;
            default:
                return;
        }
    }
}
