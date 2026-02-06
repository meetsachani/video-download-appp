package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZX extends FrameLayout {
    public static byte[] A03;
    public RelativeLayout A00;
    public ScrollView A01;
    public final C1673gi A02;

    static {
        A04();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{98, 94, 83, C8077mf.z, 119, 82, C8077mf.z, 95, 69, C8077mf.z, 94, 95, 82, 82, 83, 88, 94, 101, 111, 100};
    }

    public ZX(C1673gi c1673gi) {
        super(c1673gi);
        this.A02 = c1673gi;
        this.A02.A0F().AB1();
        A03();
        A02();
    }

    private void A01() {
        YB.A0I(this);
        YB.A0J(this);
    }

    private void A02() {
        this.A00.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.A00.addView(getAdHideView(), layoutParams);
        YB.A0W(this.A00);
        this.A01.fullScroll(33);
    }

    private void A03() {
        this.A01 = new ScrollView(this.A02);
        this.A01.setFillViewport(true);
        YB.A0N(this.A01, -218103809);
        this.A00 = new RelativeLayout(this.A02);
        this.A00.setPadding(XV.A0U, XV.A0U, XV.A0U, XV.A0U);
        this.A01.addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        ScrollView scrollView = this.A01;
        FrameLayout.LayoutParams mainLayoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(scrollView, mainLayoutParams);
    }

    public final /* synthetic */ void A05(C1240Zh c1240Zh, View view) {
        this.A02.A0F().AB2();
        c1240Zh.A01();
        A01();
    }

    private LinearLayout getAdHideView() {
        LinearLayout linearLayout = new LinearLayout(this.A02);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.A02);
        YB.A0a(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(A00(0, 16, 17));
        textView.setGravity(17);
        LinearLayout.LayoutParams undoAdHideParams = new LinearLayout.LayoutParams(-2, -2);
        undoAdHideParams.setMargins(XV.A00, XV.A00, XV.A00, XV.A09);
        final C1240Zh c1240Zh = new C1240Zh(this.A02);
        c1240Zh.setData(A00(16, 4, 44), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c1240Zh.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ZV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZX.this.A05(c1240Zh, view);
            }
        });
        linearLayout.addView(textView, undoAdHideParams);
        linearLayout.addView(c1240Zh, layoutParams);
        return linearLayout;
    }
}
