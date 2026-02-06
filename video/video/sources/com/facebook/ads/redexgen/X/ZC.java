package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZC extends LinearLayout {
    public static final int A03 = (int) (XX.A02 * 10.0f);
    public static final int A04 = (int) (XX.A02 * 24.0f);
    public final ImageView A00;
    public final C0963Og A01;
    public final C1673gi A02;

    public ZC(C1673gi c1673gi) {
        super(c1673gi);
        this.A02 = c1673gi;
        this.A01 = AbstractC0964Oh.A00(c1673gi.A02());
        this.A00 = new ImageView(c1673gi);
        A02();
    }

    private void A02() {
        A03(this.A00, YM.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, YM ym) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(YN.A01(ym));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C0943Nm c0943Nm, String str, VI vi, InterfaceC1214Yh interfaceC1214Yh) {
        setOnClickListener(new ZB(this, vi, interfaceC1214Yh, str, c0943Nm));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
