package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC1561eu {
    public C0710Ek A00;

    public ED(C1673gi c1673gi) {
        super(c1673gi);
    }

    public ED(C1673gi c1673gi, AttributeSet attributeSet, int i) {
        super(c1673gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eu
    public final void AAv(C0710Ek c0710Ek) {
        this.A00 = c0710Ek;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eu
    public final void AKV(C0710Ek c0710Ek) {
        A08();
        this.A00 = null;
    }

    public C0710Ek getVideoView() {
        return this.A00;
    }
}
