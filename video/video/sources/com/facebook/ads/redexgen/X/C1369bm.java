package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.bm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1369bm extends LinearLayout {
    public static final int A06 = (int) (XX.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1673gi A04;
    public final C1370bn[] A05;

    public C1369bm(C1673gi c1673gi, int i, int i2, int i3, int i4) {
        super(c1673gi);
        this.A00 = A06;
        this.A04 = c1673gi;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new C1370bn[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private C1370bn A00() {
        C1370bn c1370bn = new C1370bn(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c1370bn.setLayoutParams(starRatingViewParams);
        return c1370bn;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A01() {
        int i = 0;
        while (i < i) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A05[i].getLayoutParams();
            int i2 = i == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i2;
            i++;
        }
        requestLayout();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02(float f) {
        for (int i = 0; i < i; i++) {
            float fillRatio = Math.min(1.0f, f - i);
            int i2 = (fillRatio > 0.0f ? 1 : (fillRatio == 0.0f ? 0 : -1));
            if (i2 < 0) {
                fillRatio = 0.0f;
            }
            this.A05[i].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
