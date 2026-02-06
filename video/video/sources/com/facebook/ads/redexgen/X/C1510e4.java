package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.e4  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1510e4 extends LinearLayout {
    public static final int A04 = (int) (XX.A02 * 32.0f);
    public static final int A05 = (int) (XX.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C1367bk A02;
    public final C1673gi A03;

    public C1510e4(C1673gi c1673gi) {
        super(c1673gi);
        this.A03 = c1673gi;
        A00(c1673gi);
    }

    private final void A00(C1673gi c1673gi) {
        setGravity(16);
        this.A02 = new C1367bk(c1673gi);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1673gi);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1673gi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        YB.A0a(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c1673gi);
        YB.A0a(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C0943Nm c0943Nm) {
        LM lm = new LM(this.A02, this.A03);
        lm.A05(A04, A04);
        lm.A07(c0943Nm.A01());
        this.A00.setText(c0943Nm.A02());
        this.A01.setText(c0943Nm.A03());
    }
}
