package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public final class XD {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final Map<String, String> A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-10, -14, -66, -11, C2638Cg0.q7, -11, -66, -76, -80, 124, C2638Cg0.o7, C2638Cg0.r7, -68, -68, -73, -68, -75, -83, -77, Byte.MIN_VALUE, -77, -84, -86, -83, -99};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized String A01(String str) {
        synchronized (XD.class) {
            if (A04()) {
                return System.getProperty(A00(0, 7, 115) + str);
            }
            return null;
        }
    }

    public static Map<String, String> A02() {
        if (!A04()) {
            return Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        boolean z;
        synchronized (XD.class) {
            if (!A00) {
                A01 = A00(21, 4, 27).equals(System.getProperty(A00(7, 14, 49)));
                A00 = true;
            }
            z = A01;
        }
        return z;
    }

    public static synchronized boolean A05(String str) {
        boolean z;
        synchronized (XD.class) {
            z = !TextUtils.isEmpty(A01(str));
        }
        return z;
    }
}
