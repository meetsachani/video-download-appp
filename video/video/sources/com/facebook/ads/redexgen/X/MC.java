package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class MC extends AbstractC1236Zd {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C0963Og A03;
    public final C1673gi A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-52, -21, -19, -11, QC1.w, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A01();
        A08 = (int) (XX.A02 * 8.0f);
        A07 = (int) (XX.A02 * 10.0f);
        A06 = (int) (XX.A02 * 44.0f);
    }

    public MC(C1673gi c1673gi, VA va, String str) {
        super(c1673gi, va, str);
        this.A04 = c1673gi;
        this.A03 = AbstractC0964Oh.A00(this.A04.A02());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        YB.A0N(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0O() {
        this.A00.setImageBitmap(YN.A01(YM.CROSS));
        this.A00.setOnClickListener(new View$OnClickListenerC1255Zw(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        C1240Zh c1240Zh = new C1240Zh(this.A04);
        c1240Zh.setData(this.A03.A0H(), YM.HIDE_AD);
        c1240Zh.setOnClickListener(new View$OnClickListenerC1256Zx(this, c1240Zh));
        C1240Zh c1240Zh2 = new C1240Zh(this.A04);
        c1240Zh2.setData(this.A03.A0L(), YM.REPORT_AD);
        c1240Zh2.setOnClickListener(new View$OnClickListenerC1257Zy(this, c1240Zh2));
        C1240Zh c1240Zh3 = new C1240Zh(this.A04);
        c1240Zh3.setData(this.A03.A0M(), YM.AD_CHOICES_ICON);
        c1240Zh3.setOnClickListener(new View$OnClickListenerC1258Zz(this, c1240Zh3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c1240Zh, menuParams);
        linearLayout.addView(c1240Zh2, menuParams);
        linearLayout.addView(c1240Zh3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0P() {
        YB.A0I(this);
        YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0Q(C0967Ok c0967Ok, EnumC0965Oi enumC0965Oi) {
        String A0H;
        YM ym;
        int i;
        this.A00.setOnClickListener(null);
        if (enumC0965Oi == EnumC0965Oi.A06) {
            A0H = this.A03.A0F();
            ym = YM.REPORT_AD;
            i = -552389;
        } else {
            A0H = this.A03.A0H();
            ym = YM.HIDE_AD;
            i = -13272859;
        }
        C1233Za A0H2 = new C1233Za(this.A04, this.A0D).A0H(A0H);
        String title = this.A03.A0D();
        C1233Za A0G = A0H2.A0G(title);
        String title2 = c0967Ok.A04();
        C1234Zb adHiddenView = A0G.A0E(title2).A0J(false).A0D(ym).A0C(i).A0K(false).A0I(false).A0L();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
        super.A0Q(c0967Ok, enumC0965Oi);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0R(C0967Ok c0967Ok, EnumC0965Oi enumC0965Oi) {
        boolean isReportFlow = enumC0965Oi == EnumC0965Oi.A06;
        C1254Zv c1254Zv = new C1254Zv(this.A04, c0967Ok, this.A0D, isReportFlow ? YM.REPORT_AD : YM.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW));
        this.A00.setOnClickListener(new View$OnClickListenerC1259a0(this));
        this.A00.setContentDescription(A00(0, 4, 114));
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c1254Zv, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final boolean A0S() {
        return true;
    }
}
