package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0766Gp implements InterfaceC1212Yf {
    public final /* synthetic */ AbstractC0760Gj A00;

    public C0766Gp(AbstractC0760Gj abstractC0760Gj) {
        this.A00 = abstractC0760Gj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1212Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
