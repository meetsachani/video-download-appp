package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05326y implements InterfaceC1103Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C05326y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.VP
    public final void ACm() {
        WT.A00(new C1098Tq(this));
    }

    @Override // com.facebook.ads.redexgen.X.VP
    public final void ACq() {
        WT.A00(new C1099Tr(this));
    }

    @Override // com.facebook.ads.redexgen.X.VP
    public final void ADp(C1145Vm c1145Vm) {
        WT.A00(new C1101Tt(this, c1145Vm));
    }

    @Override // com.facebook.ads.redexgen.X.VP
    public final void AEl() {
        WT.A00(new C1097Tp(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1103Tv
    public final void AEq() {
        WT.A00(new C1100Ts(this));
    }
}
