package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1759i9 implements InterfaceC0977Ou {
    private C0978Ov A00(InterfaceC0976Ot interfaceC0976Ot) {
        return (C0978Ov) interfaceC0976Ot.A7E();
    }

    public final void A01(InterfaceC0976Ot interfaceC0976Ot) {
        if (!interfaceC0976Ot.A9R()) {
            interfaceC0976Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC0976Ot);
        float A8r = A8r(interfaceC0976Ot);
        float elevation = AbstractC0980Ox.A00(A8S, A8r, interfaceC0976Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC0980Ox.A01(A8S, A8r, interfaceC0976Ot.A8q());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC0976Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final ColorStateList A71(InterfaceC0976Ot interfaceC0976Ot) {
        return A00(interfaceC0976Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final float A7v(InterfaceC0976Ot interfaceC0976Ot) {
        return interfaceC0976Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final float A8S(InterfaceC0976Ot interfaceC0976Ot) {
        return A00(interfaceC0976Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final float A8X(InterfaceC0976Ot interfaceC0976Ot) {
        return A8r(interfaceC0976Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final float A8Y(InterfaceC0976Ot interfaceC0976Ot) {
        return A8r(interfaceC0976Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final float A8r(InterfaceC0976Ot interfaceC0976Ot) {
        return A00(interfaceC0976Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final void AAG(InterfaceC0976Ot interfaceC0976Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0978Ov background = new C0978Ov(colorStateList, f);
        interfaceC0976Ot.AJK(background);
        View view = interfaceC0976Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC0976Ot, f3);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final void ADP(InterfaceC0976Ot interfaceC0976Ot) {
        AJX(interfaceC0976Ot, A8S(interfaceC0976Ot));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final void AFT(InterfaceC0976Ot interfaceC0976Ot) {
        AJX(interfaceC0976Ot, A8S(interfaceC0976Ot));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final void AJJ(InterfaceC0976Ot interfaceC0976Ot, ColorStateList colorStateList) {
        A00(interfaceC0976Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final void AJP(InterfaceC0976Ot interfaceC0976Ot, float f) {
        interfaceC0976Ot.A7F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final void AJX(InterfaceC0976Ot interfaceC0976Ot, float f) {
        A00(interfaceC0976Ot).A07(f, interfaceC0976Ot.A9R(), interfaceC0976Ot.A8q());
        A01(interfaceC0976Ot);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ou
    public final void AJj(InterfaceC0976Ot interfaceC0976Ot, float f) {
        A00(interfaceC0976Ot).A06(f);
    }
}
