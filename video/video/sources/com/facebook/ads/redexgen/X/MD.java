package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class MD extends AbstractC1236Zd {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C0963Og A04;
    public final C1673gi A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{3, 32, 34, 42, 3, C3307Iz.d0, 47, 51, C3307Iz.X, 96, 1, 36, 96, C8077mf.u, C3307Iz.X, 48, 47, 50, 52, C3307Iz.a0, C3307Iz.f0, C3307Iz.Z};
    }

    static {
        A01();
        A09 = (int) (XX.A02 * 4.0f);
        A08 = (int) (XX.A02 * 10.0f);
        A07 = (int) (XX.A02 * 44.0f);
    }

    public MD(C1673gi c1673gi, VA va, String str) {
        super(c1673gi, va, str);
        this.A05 = c1673gi;
        this.A04 = AbstractC0964Oh.A00(c1673gi.A02());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        YB.A0N(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0O() {
        this.A01.setImageBitmap(YN.A01(YM.CROSS));
        this.A01.setOnClickListener(new View$OnClickListenerC1245Zm(this));
        this.A01.setContentDescription(A00(4, 18, 84));
        C1240Zh c1240Zh = new C1240Zh(this.A05);
        c1240Zh.setData(this.A04.A0H(), YM.HIDE_AD);
        c1240Zh.setOnClickListener(new View$OnClickListenerC1246Zn(this, c1240Zh));
        C1240Zh c1240Zh2 = new C1240Zh(this.A05);
        c1240Zh2.setData(this.A04.A0L(), YM.REPORT_AD);
        c1240Zh2.setOnClickListener(new View$OnClickListenerC1247Zo(this, c1240Zh2));
        C1240Zh c1240Zh3 = new C1240Zh(this.A05);
        c1240Zh3.setData(this.A04.A0M(), YM.AD_CHOICES_ICON);
        c1240Zh3.setOnClickListener(new View$OnClickListenerC1248Zp(this, c1240Zh3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        YB.A0W(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c1240Zh, layoutParams);
        this.A02.addView(c1240Zh2, layoutParams);
        this.A02.addView(c1240Zh3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0P() {
        YB.A0I(this);
        YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0Q(C0967Ok c0967Ok, EnumC0965Oi enumC0965Oi) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        YB.A0a(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        YB.A0W(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
        super.A0Q(c0967Ok, enumC0965Oi);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0R(C0967Ok c0967Ok, EnumC0965Oi enumC0965Oi) {
        YB.A0W(this.A03);
        this.A01.setImageBitmap(YN.A01(YM.BACK_ARROW));
        this.A01.setOnClickListener(new View$OnClickListenerC1249Zq(this));
        this.A01.setContentDescription(A00(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (C0967Ok c0967Ok2 : c0967Ok.A05()) {
            C1240Zh c1240Zh = new C1240Zh(this.A05);
            c1240Zh.setData(c0967Ok2.A04(), null);
            c1240Zh.setOnClickListener(new View$OnClickListenerC1250Zr(this, c1240Zh, c0967Ok2));
            this.A02.addView(c1240Zh, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final boolean A0S() {
        return true;
    }
}
