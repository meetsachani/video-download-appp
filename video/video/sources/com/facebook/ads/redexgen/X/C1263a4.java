package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.a4  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1263a4 extends LinearLayout {
    public final Handler A00;
    public final ImageView A01;
    public final ImageView A02;
    public final C0943Nm A03;
    public final C0963Og A04;
    public final C1673gi A05;
    public final VI A06;
    public final InterfaceC1214Yh A07;
    public final Runnable A08;
    public final String A09;

    public C1263a4(C1673gi c1673gi, AbstractC1847jd abstractC1847jd, VI vi, InterfaceC1214Yh interfaceC1214Yh) {
        super(c1673gi);
        this.A00 = new Handler(Looper.getMainLooper());
        this.A08 = new RunnableC1261a2(this);
        this.A05 = c1673gi;
        this.A09 = abstractC1847jd.A2E();
        this.A03 = abstractC1847jd.A2C();
        this.A07 = interfaceC1214Yh;
        this.A06 = vi;
        this.A04 = AbstractC0964Oh.A00(c1673gi.A02());
        this.A01 = A01(YM.AD_CHOICE_V2_COLLAPSE, 1104);
        addView(this.A01);
        this.A02 = A01(YM.AD_CHOICE_V2_EXPAND, 1105);
        addView(this.A02);
        A07(8);
        setOnClickListener(new View$OnClickListenerC1262a3(this));
    }

    private final ImageView A01(YM ym, int i) {
        ImageView imageView = new ImageView(this.A05);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView.setImageBitmap(YN.A01(ym));
        YB.A0G(i, imageView);
        return imageView;
    }

    public final void A04() {
        this.A00.removeCallbacksAndMessages(null);
    }

    public final void A05() {
        this.A00.removeCallbacks(this.A08);
        A07(8);
    }

    public final void A06() {
        if (this.A06 != null) {
            this.A06.A04(VH.A0A, null);
        }
        if (this.A04.A0O(this.A05.A02(), true)) {
            this.A07.AAo(this.A09, this.A03);
        } else if (TextUtils.isEmpty(this.A03.A00())) {
        } else {
            X6.A0O(new X6(), this.A05, XB.A00(this.A03.A00()), this.A09);
        }
    }

    public final void A07(int i) {
        if (i == 0) {
            this.A02.setVisibility(0);
            this.A01.setVisibility(8);
            return;
        }
        this.A02.setVisibility(8);
        this.A01.setVisibility(0);
    }
}
