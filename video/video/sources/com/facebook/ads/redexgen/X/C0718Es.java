package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Es  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0718Es extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C0710Ek A00;

    public C0718Es(C0710Ek c0710Ek) {
        this.A00 = c0710Ek;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        boolean z;
        UM um;
        Handler handler;
        int i;
        z = this.A00.A04;
        if (!z) {
            um = this.A00.A0C;
            um.A02(new EB(this.A00.getCurrentPositionInMillis()) { // from class: com.facebook.ads.redexgen.X.4A
            });
            handler = this.A00.A08;
            i = this.A00.A01;
            handler.postDelayed(this, i);
        }
    }
}
