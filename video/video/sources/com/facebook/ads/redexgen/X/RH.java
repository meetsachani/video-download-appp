package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.CK1;
import o.QC1;
import o.Xu2;

/* loaded from: assets/audience_network/classes2.dex */
public class RH {
    public static byte[] A0H;
    public int A01;
    public int A02;
    public int A06;
    public int A07;
    public long A08;
    public SparseArray<Object> A0G;
    public int A0F = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0E = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{75, 9, C8077mf.H, 31, 75, 2, 31, 75, 2, C8077mf.B, 75, C8077mf.z, C8077mf.D, 87, 126, 91, 78, 91, 7, 78, 66, C8077mf.q, C3307Iz.Y, 7, C8077mf.p, 7, C8077mf.z, 7, 6, C3307Iz.c0, C8077mf.n, C8077mf.x, C8077mf.m, 17, C8077mf.m, 0, C8077mf.p, 7, C3307Iz.c0, C8077mf.z, 7, C8077mf.q, C3307Iz.V, 13, C8077mf.A, C8077mf.n, C8077mf.z, 49, C8077mf.m, C8077mf.n, 1, 7, 50, C8077mf.r, 7, C8077mf.x, C8077mf.m, 13, C8077mf.A, 17, C3307Iz.f0, 3, C8077mf.E, 13, C8077mf.A, C8077mf.z, 95, C3307Iz.V, C3307Iz.e0, 96, 68, 99, 93, Byte.MAX_VALUE, 104, 65, 108, 116, 98, QC1.w, 121, 48, 60, 48, 125, 89, 100, 117, 125, 83, Byte.MAX_VALUE, 101, 126, 100, C3307Iz.e0, 3, C8077mf.q, 66, Byte.MAX_VALUE, 93, 74, 89, 70, 64, 90, 92, 99, 78, 86, 64, 90, 91, 102, 91, 74, 66, 108, 64, 90, 65, 91, C8077mf.u, 86, 90, C8077mf.A, 40, C8077mf.q, C8077mf.x, 42, 8, 31, C8077mf.H, 19, C8077mf.C, C8077mf.p, 19, C8077mf.n, 31, 59, C8077mf.x, 19, C8077mf.A, C8077mf.E, C8077mf.p, 19, C8077mf.y, C8077mf.x, 9, 71, C3307Iz.a0, C3307Iz.X, 104, 87, 112, 107, 86, 108, 104, 117, 105, 96, 68, 107, 108, 104, 100, 113, 108, 106, 107, 118, 56, 17, C8077mf.G, 80, 110, 73, 79, 72, 94, 73, 72, 79, 88, 126, 85, 92, 83, 90, 88, 89, 0, QC1.w, 85, 77, 91, 65, 64, C8077mf.x, 71, 64, 85, 64, 81, C8077mf.x, 71, 92, 91, 65, 88, 80, C8077mf.x, 86, 81, C8077mf.x, 91, 90, 81, C8077mf.x, 91, 82, C8077mf.x, 107, 76, 89, 76, 93, 67, 85, 108, 89, 74, 95, 93, 76, 104, 87, 75, 81, 76, 81, 87, 86, 5};
    }

    public final int A03() {
        if (this.A09) {
            return this.A05 - this.A00;
        }
        return this.A03;
    }

    public final void A04(int i) {
        if ((this.A04 & i) != 0) {
            return;
        }
        throw new IllegalStateException(A01(CK1.x, 30, 44) + Integer.toBinaryString(i) + A01(0, 11, 115) + Integer.toBinaryString(this.A04));
    }

    public final void A05(AbstractC1021Qq abstractC1021Qq) {
        this.A04 = 1;
        this.A03 = abstractC1021Qq.A0B();
        this.A09 = false;
        this.A0E = false;
        this.A0A = false;
    }

    public final boolean A06() {
        return this.A0F != -1;
    }

    public final boolean A07() {
        return this.A09;
    }

    public final boolean A08() {
        return this.A0B;
    }

    public final String toString() {
        return A01(222, 22, 32) + this.A0F + A01(11, 8, 34) + this.A0G + A01(82, 13, 8) + this.A03 + A01(95, 27, 55) + this.A05 + A01(19, 48, 122) + this.A00 + A01(Xu2.K, 20, 37) + this.A0D + A01(67, 15, 21) + this.A09 + A01(149, 23, 29) + this.A0C + A01(122, 27, 98) + this.A0B + '}';
    }
}
