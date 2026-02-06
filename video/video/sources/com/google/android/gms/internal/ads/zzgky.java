package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.C8077mf;

/* loaded from: classes2.dex */
public final class zzgky {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long b = b(bArr, 0, 0);
        long b2 = b(bArr, 3, 2) & 67108611;
        long b3 = b(bArr, 6, 4) & 67092735;
        long b4 = b(bArr, 9, 6) & 66076671;
        long b5 = b(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 < length) {
                int min = Math.min(16, length - i2);
                System.arraycopy(bArr2, i2, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i, (byte) 0);
                }
                long j6 = b5 * 5;
                long j7 = b4 * 5;
                long j8 = b3 * 5;
                long b6 = j5 + b(bArr3, 0, 0);
                long b7 = j2 + b(bArr3, 3, 2);
                long b8 = j + b(bArr3, 6, 4);
                long b9 = j3 + b(bArr3, 9, 6);
                long b10 = j4 + (b(bArr3, 12, 8) | (bArr3[16] << C8077mf.B));
                long j9 = b7 * b;
                long j10 = b7 * b2;
                long j11 = b7 * b3;
                long j12 = b9 * b;
                long j13 = b7 * b4;
                long j14 = b10 * b;
                long j15 = (b6 * b) + (b7 * j6) + (b8 * j7) + (b9 * j8) + (b2 * 5 * b10);
                long j16 = (b6 * b2) + j9 + (b8 * j6) + (b9 * j7) + (j8 * b10) + (j15 >> 26);
                long j17 = (b6 * b3) + j10 + (b8 * b) + (b9 * j6) + (j7 * b10) + (j16 >> 26);
                long j18 = (b6 * b4) + j11 + (b8 * b2) + j12 + (b10 * j6) + (j17 >> 26);
                long j19 = (b6 * b5) + j13 + (b8 * b3) + (b9 * b2) + j14 + (j18 >> 26);
                long j20 = (j15 & 67108863) + ((j19 >> 26) * 5);
                j2 = (j16 & 67108863) + (j20 >> 26);
                i2 += 16;
                j = j17 & 67108863;
                j3 = j18 & 67108863;
                j4 = j19 & 67108863;
                i = 17;
                j5 = j20 & 67108863;
            } else {
                long j21 = j + (j2 >> 26);
                long j22 = j21 & 67108863;
                long j23 = j3 + (j21 >> 26);
                long j24 = j23 & 67108863;
                long j25 = j4 + (j23 >> 26);
                long j26 = j25 & 67108863;
                long j27 = j5 + ((j25 >> 26) * 5);
                long j28 = j27 & 67108863;
                long j29 = j28 + 5;
                long j30 = (j2 & 67108863) + (j27 >> 26);
                long j31 = j30 + (j29 >> 26);
                long j32 = (j31 >> 26) + j22;
                long j33 = j24 + (j32 >> 26);
                long j34 = (j26 + (j33 >> 26)) - 67108864;
                long j35 = j34 >> 63;
                long j36 = ~j35;
                long j37 = (j30 & j35) | (j31 & 67108863 & j36);
                long j38 = (j22 & j35) | (j32 & 67108863 & j36);
                long j39 = (j24 & j35) | (j33 & 67108863 & j36);
                long j40 = (j26 & j35) | (j34 & j36);
                long c = (((j35 & j28) | (j29 & 67108863 & j36) | (j37 << 26)) & 4294967295L) + c(bArr, 16);
                long c2 = (((j37 >> 6) | (j38 << 20)) & 4294967295L) + c(bArr, 20);
                long c3 = (((j38 >> 12) | (j39 << 14)) & 4294967295L) + c(bArr, 24);
                long c4 = (((j39 >> 18) | (j40 << 8)) & 4294967295L) + c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, c & 4294967295L, 0);
                long j41 = c2 + (c >> 32);
                d(bArr4, j41 & 4294967295L, 4);
                long j42 = c3 + (j41 >> 32);
                d(bArr4, j42 & 4294967295L, 8);
                d(bArr4, (c4 + (j42 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    public static long b(byte[] bArr, int i, int i2) {
        return (c(bArr, i) >> i2) & 67108863;
    }

    public static long c(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return (((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static void d(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
