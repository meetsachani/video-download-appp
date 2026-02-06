package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class FD extends C1368bl {
    public final ImageView A00;
    public final C1673gi A01;

    public FD(C1673gi c1673gi) {
        super(c1673gi);
        this.A01 = c1673gi;
        this.A00 = new ImageView(c1673gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        LM downloadImageTask = new LM(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
