package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class F9 extends C1368bl {
    public final ImageView A00;
    public final C1673gi A01;

    public F9(C1673gi c1673gi) {
        super(c1673gi);
        this.A01 = c1673gi;
        setRadius(30);
        this.A00 = new ImageView(c1673gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C1328b7 c1328b7) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        LM lm = new LM(this.A00, this.A01);
        lm.A04();
        lm.A07(str);
        lm.A06(new InterfaceC1329b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.facebook.ads.redexgen.X.InterfaceC1329b8
            public final void AE7(C1328b7 c1328b7) {
                F9.this.A00(c1328b7);
            }
        });
    }
}
