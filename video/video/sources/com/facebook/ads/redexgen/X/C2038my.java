package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.my  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2038my implements HY {
    public static byte[] A06;
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{65, 57, 53, 113, 96, 103, 116, 97, 124, 122, 123, 102, 64, 102, 40, 111, 99, C3307Iz.d0, C3307Iz.X, C3307Iz.X, 48, C3307Iz.Y, 55, 48, 126, 53, 57, 106, 112, 99, 124, 106, 36, 105, 101, 49, C3307Iz.d0, 40, 32, C8077mf.r, 54, QC1.w, 47, 4, C8077mf.C, 2, 7, C3307Iz.X, 2, 8, 9, C8077mf.x, 68, 0, 9, 2, C8077mf.m, C8077mf.B, 4, 81};
    }

    public C2038my(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        if (this.A00 > 0) {
            this.A05 = jArr2[this.A00 - 1] + jArr3[this.A00 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j) {
        return C5C.A0L(this.A04, j, true, true);
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final long A7t() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final HX A91(long j) {
        int A00 = A00(j);
        HZ hz = new HZ(this.A04[A00], this.A03[A00]);
        int chunkIndex = (hz.A01 > j ? 1 : (hz.A01 == j ? 0 : -1));
        if (chunkIndex < 0) {
            int chunkIndex2 = this.A00;
            if (A00 != chunkIndex2 - 1) {
                int chunkIndex3 = A00 + 1;
                long j2 = this.A04[chunkIndex3];
                int chunkIndex4 = A00 + 1;
                HZ seekPoint = new HZ(j2, this.A03[chunkIndex4]);
                return new HX(hz, seekPoint);
            }
        }
        return new HX(hz);
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final boolean AAj() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 116) + this.A00 + A01(25, 8, 1) + Arrays.toString(this.A01) + A01(15, 10, 91) + Arrays.toString(this.A03) + A01(33, 9, 93) + Arrays.toString(this.A04) + A01(1, 14, 13) + Arrays.toString(this.A02) + A01(0, 1, 112);
    }
}
