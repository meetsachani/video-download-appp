package com.facebook.ads.redexgen.X;

import android.media.MediaFormat;
import java.util.Arrays;
import java.util.Random;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.is  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1802is {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static final Random A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{C3307Iz.Z, 0, 8, 13, 4, 5, 65, C8077mf.y, C8077mf.p, 65, 19, 4, C8077mf.y, 19, 8, 4, C8077mf.A, 4, 65, C3307Iz.d0, 4, 5, 8, 0, C3307Iz.Z, C8077mf.p, 19, C8077mf.n, 0, C8077mf.y, 73, 100, 115, 110, 68, 121, 110, 84, 117, 104, 109, 9, C3307Iz.c0, 54, C3307Iz.V, 32, 116, 10, C3307Iz.e0, 56, C3307Iz.e0, C3307Iz.d0, 42, 126, 72, 89, 13, 108, 100, 13, 107, Byte.MAX_VALUE, 110, 13, 124, 107, 105, 13, 65, 72, 91, 72, 65, 13, 89, 66, 13, 8, 73, 59, 13, 28, 72, C3307Iz.a0, C3307Iz.V, 72, C3307Iz.f0, 58, C3307Iz.c0, 72, C8077mf.D, 13, C8077mf.C, C8077mf.G, 13, C8077mf.E, 28, 72, 28, 7, 72, 89, C8077mf.n, 58, C3307Iz.c0, Byte.MAX_VALUE, C8077mf.H, C8077mf.z, Byte.MAX_VALUE, C8077mf.C, 13, 28, Byte.MAX_VALUE, C3307Iz.a0, 54, 59, 58, 48, Byte.MAX_VALUE, 59, 42, C3307Iz.e0, 62, C3307Iz.c0, 54, 48, 49, Byte.MAX_VALUE, C3307Iz.c0, 48, Byte.MAX_VALUE, 122, 59, C3307Iz.X, 40, 36, 42, C3307Iz.X, 57, 19, C8077mf.p, 10, 2, 8, C8077mf.u, 19, 56, 19, C8077mf.y, C8077mf.H, C8077mf.p, 9, 0, 56, 19, 8, 56, 1, C8077mf.p, 9, 3, 56, C8077mf.x, 2, 0, 10, 2, 9, 19, 56, C8077mf.p, 9, 56, 8, C8077mf.p, C8077mf.m, C8077mf.q, 28, C8077mf.A, C8077mf.G, C8077mf.z, C8077mf.m, 87, 10, 28, C8077mf.D, 84, C8077mf.B, C8077mf.r, 31, C8077mf.m, C8077mf.D, 84, 13, C8077mf.m, C8077mf.B, C8077mf.A, 10, 31, 28, C8077mf.m, 84, C8077mf.m, 28, 8, C8077mf.n, 28, 10, 13, 87, C8077mf.q, C8077mf.B, C8077mf.y, C8077mf.n, 28, 112, 99, 104, 98, 105, 116, 40, 117, 99, 101, C3307Iz.c0, 103, 111, 96, 116, 101, C3307Iz.c0, 112, 111, 98, 99, 105, C3307Iz.c0, 98, 115, 116, 103, 114, 111, 105, 104, 40, 112, 103, 106, 115, 99, 78, 93, 86, 92, 87, 74, C8077mf.z, 75, 93, 91, C8077mf.y, 89, 81, 94, 74, 91, C8077mf.y, 78, 81, 92, 93, 87, C8077mf.y, 73, 94, 92, C8077mf.y, 84, 93, 78, 93, 84, C8077mf.z, 78, 89, 84, 77, 93, 89, 71, 74, 90, 70};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(C3503Kz.c0, 37, 109);
        A03 = new Random();
    }

    public static int A00(int i, int i2) {
        if (i2 != 0) {
            return (int) ((Math.pow(2.0d, i - 1) * i2 * 1000.0d) + A03.nextInt(2000));
        }
        return (int) Math.min(((i - 1) * 1000) + 500, 5000L);
    }

    public static void A03(C1836jQ c1836jQ, MediaFormat mediaFormat) {
        String A012 = A01(0, 30, 107);
        String A013 = A01(30, 11, 11);
        if (!c1836jQ.A01) {
            return;
        }
        try {
            if (C1800iq.A02()) {
                if (c1836jQ.A0P && !C1800iq.A03(mediaFormat.getInteger(A01(290, 5, 36)), mediaFormat.getInteger(A01(C3503Kz.W, 6, 71)))) {
                    return;
                }
                long j = c1836jQ.A00;
                if (j > 0) {
                    mediaFormat.setLong(A01(C10997yd1.z1, 37, 12), j);
                    AbstractC1730hd.A01(A013, A01(102, 31, 85), Long.valueOf(j));
                }
                mediaFormat.setInteger(A01(252, 38, 50), c1836jQ.A02);
                AbstractC1730hd.A01(A013, A01(53, 26, 39), Integer.valueOf(c1836jQ.A02));
                mediaFormat.setInteger(A01(176, 39, 115), 1);
                AbstractC1730hd.A00(A013, A01(79, 23, 98));
            }
        } catch (ClassCastException e) {
            AbstractC1730hd.A02(A013, A012, e);
        } catch (NullPointerException e2) {
            AbstractC1730hd.A02(A013, A012, e2);
        }
    }

    public static boolean A04(C1836jQ c1836jQ, int i, int i2, int i3, int i4) {
        if (c1836jQ.A01 && c1836jQ.A0P && C1800iq.A03(i, i2) != C1800iq.A03(i3, i4)) {
            return true;
        }
        return false;
    }
}
