package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Qf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1011Qf {
    public static byte[] A05;
    public static String[] A06 = {"6A8c5bTmn3VqyB8YAlCr0l6Zt8", "WvRRX1RoaLPXS8ebG7t3iKQl5mlirRpT", "WchiA2SGVr9snt7FUspuKPhd1UDHlrMO", "Eitw2B1PL", "6IVwjfWBqAtEKeEHT6LIQhSZ71mOayX0", "DKDeSzlopwneHhxkht4X8JiglSdKfD1S", "icQypc6bx", "6eJUJUb"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ C1743hr A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-97, -109, -32, -74, -30, -30, -27, -41, -36, C2638Cg0.C7, -44, -25, C2638Cg0.n7, -80, -45, C2638Cg0.u7, C8077mf.x, -13, 8, 32, C8077mf.z, 28, C8077mf.E, -19, C8077mf.C, C8077mf.z, C8077mf.x, -20, C8077mf.y, C8077mf.m, -28, 3, -9, 68, C3307Iz.e0, 56, 67, 64, 59, C8077mf.x, -9, 36, C8077mf.C, C8077mf.H, C3307Iz.X, 40, -1, 36, 28, C3307Iz.X, 49, 35, 6, C3307Iz.X, C3307Iz.a0, 31, 42, 31, C3307Iz.X, 36, -13};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A05(View view) {
        int A052 = this.A04.A04.A05();
        if (A052 >= 0) {
            A04(view);
            return;
        }
        this.A01 = this.A04.A0r(view);
        if (this.A02) {
            int A07 = (this.A04.A04.A07() - A052) - this.A04.A04.A0C(view);
            this.A00 = this.A04.A04.A07() - A07;
            if (A07 > 0) {
                int A0D = this.A00 - this.A04.A04.A0D(view);
                int A0A = this.A04.A04.A0A();
                int min = A0D - (Math.min(this.A04.A04.A0F(view) - A0A, 0) + A0A);
                if (min < 0) {
                    this.A00 += Math.min(A07, -min);
                    return;
                }
                return;
            }
            return;
        }
        int A0F = this.A04.A04.A0F(view);
        int A0A2 = A0F - this.A04.A04.A0A();
        this.A00 = A0F;
        if (A0A2 > 0) {
            int A0D2 = this.A04.A04.A0D(view) + A0F;
            int A072 = this.A04.A04.A07() - Math.min(0, (this.A04.A04.A07() - A052) - this.A04.A04.A0C(view));
            String[] strArr = A06;
            if (strArr[2].charAt(17) == strArr[1].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "Cz8X0dfem";
            strArr2[6] = "kvMaEjgz6";
            int i = A072 - A0D2;
            if (i < 0) {
                this.A00 -= Math.min(A0A2, -i);
            }
        }
    }

    static {
        A01();
    }

    public C1011Qf(C1743hr c1743hr) {
        this.A04 = c1743hr;
        A03();
    }

    public final void A02() {
        int A0A;
        if (this.A02) {
            A0A = this.A04.A04.A07();
        } else {
            A0A = this.A04.A04.A0A();
        }
        this.A00 = A0A;
    }

    public final void A03() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = false;
        this.A03 = false;
    }

    public final void A04(View view) {
        if (this.A02) {
            this.A00 = this.A04.A04.A0C(view) + this.A04.A04.A05();
        } else {
            this.A00 = this.A04.A04.A0F(view);
        }
        C1743hr c1743hr = this.A04;
        String[] strArr = A06;
        if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "KzGGhFAymIJJcnKPjC7mQoKH3wQvbJNl";
        strArr2[1] = "M2kGapXrbhEzK3ghy5X2EP5VRS1NNbBf";
        this.A01 = c1743hr.A0r(view);
    }

    public final boolean A06(View view, RH rh) {
        R3 r3 = (R3) view.getLayoutParams();
        return !r3.A02() && r3.A00() >= 0 && r3.A00() < rh.A03();
    }

    public final String toString() {
        return A00(40, 21, 92) + this.A01 + A00(0, 14, 25) + this.A00 + A00(14, 17, 77) + this.A02 + A00(31, 9, 125) + this.A03 + '}';
    }
}
