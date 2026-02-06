package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.6v  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05296v extends C1743hr {
    public static String[] A08 = {"3Z4oVcBXIxTGfHDkJENHcNR3oKWZn0O4", "rFv82zPhlr6ageKpcxYW53i7WQEhI", "2tYR0SC80tVMegpE61nD", "NxUbiyfiYIyXyrFLuBvPtjT94e88s", "0hjSAQsR9gnR7LOOW", "3YJcpQnZmcsLDiaVOnEQeEpmcgGPkAOH", "Bqc2ZUTwiywYobMvaWapE1roD64Q2E5u", "7wlgBc9wtLyqXjV7RP"};
    public float A00;
    public int A01;
    public int A02;
    public C05306w A03;
    public int[] A04;
    public final C1673gi A05;
    public final C1505dz A06;
    public final C1506e0 A07;

    public C05296v(C1673gi c1673gi, C1506e0 c1506e0, C1505dz c1505dz) {
        super(c1673gi);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1673gi;
        this.A07 = c1506e0;
        this.A06 = c1505dz;
        this.A01 = -1;
        this.A03 = new C05306w(this, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.R2
    public final void A1L(RA ra, RH rh, int i, int widthMode) {
        int[] iArr;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A28() == 1) || (mode2 == 1073741824 && A28() == 0)) {
            super.A1L(ra, rh, i, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArr = this.A06.A02(this.A01);
        } else {
            iArr = new int[]{0, 0};
            if (rh.A03() >= 1) {
                int i2 = A0Y() > 0 ? 1 : A0Y();
                for (int heightMode = 0; heightMode < i2; heightMode++) {
                    View A1o = A1o(heightMode);
                    if (A1o == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(A1o, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A28() == 0) {
                        iArr[0] = iArr[0] + this.A04[0];
                        if (heightMode == 0) {
                            iArr[1] = this.A04[1] + A0i() + A0f();
                        }
                    } else {
                        iArr[1] = iArr[1] + this.A04[1];
                        if (heightMode == 0) {
                            iArr[0] = this.A04[0] + A0g() + A0h();
                        }
                    }
                }
                int i3 = this.A01;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "c7gaApi93PYPuTyj4vut3Dl9rZW6DyZw";
                strArr2[7] = "eCokdcVdwhThfuMVf9";
                if (i3 != -1) {
                    this.A06.A00(this.A01, iArr);
                }
            }
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        A15(iArr[0], iArr[1]);
    }

    @Override // com.facebook.ads.redexgen.X.C1743hr, com.facebook.ads.redexgen.X.R2
    public final void A1r(int i) {
        A2D(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.C1743hr, com.facebook.ads.redexgen.X.R2
    public final void A1z(C7M c7m, RH rh, int i) {
        this.A03.A0A(i);
        A1N(this.A03);
    }

    public final void A2I(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C05306w(this, this.A05);
    }

    public final void A2J(int i) {
        this.A01 = i;
    }

    public final void A2K(int i) {
        this.A02 = i;
    }
}
