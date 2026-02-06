package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class W9 {
    public static boolean A00;
    public static byte[] A01;
    public static final Map<String, Long> A02;
    public static final Map<String, Long> A03;
    public static final Map<String, String> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{96, 54, Byte.MAX_VALUE, 96, 54, Byte.MAX_VALUE, 96, C3307Iz.V, Byte.MAX_VALUE, 96, C3307Iz.V, Byte.MAX_VALUE, 96, C3307Iz.V, 82, 92, 4, 92, 0, 87, 85, 85, C8077mf.m, C3307Iz.e0, 55, 48, 57, 126, 50, ED2.a, C3307Iz.e0, 42, 126, ED2.a, 58, 126, C3307Iz.d0, 59, C3307Iz.e0, C3307Iz.f0, 49, 48, C3307Iz.e0, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A03 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A04 = new ConcurrentHashMap();
        A00 = false;
    }

    public static long A00(String str, EnumC1148Vq enumC1148Vq) {
        if (A03.containsKey(str)) {
            return A03.get(str).longValue();
        }
        switch (enumC1148Vq) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(WA wa) {
        AbstractC1156Vy.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A04.get(A03(wa));
    }

    public static String A03(WA wa) {
        return String.format(Locale.US, A01(0, 14, 29), wa.A09(), wa.A07(), Integer.valueOf(wa.A08() == null ? 0 : wa.A08().A00()), Integer.valueOf(wa.A08() == null ? 0 : wa.A08().A01()), Integer.valueOf(wa.A04()));
    }

    public static void A05(long j, WA wa) {
        A03.put(A03(wa), Long.valueOf(j));
    }

    public static void A06(WA wa) {
        A02.put(A03(wa), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, WA wa) {
        A04.put(A03(wa), str);
    }

    public static boolean A08(WA wa) {
        if (A00) {
            return false;
        }
        String A032 = A03(wa);
        if (A02.containsKey(A032)) {
            return System.currentTimeMillis() - A02.get(A032).longValue() < A00(A032, wa.A07());
        }
        return false;
    }
}
