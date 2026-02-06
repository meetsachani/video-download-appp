package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0750Fz implements InterfaceC1437cs {
    public final /* synthetic */ C0749Fy A00;

    public C0750Fz(C0749Fy c0749Fy) {
        this.A00 = c0749Fy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1437cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1437cs
    public final void AGY(View view) {
        AbstractC0834Jg abstractC0834Jg = (AbstractC0834Jg) view;
        abstractC0834Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC0834Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
