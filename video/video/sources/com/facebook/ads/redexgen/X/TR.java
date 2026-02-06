package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class TR {
    public static byte[] A03;
    public final String A00;
    public final String A01;
    public final Map<String, String> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{8, 101, 2, 0, C8077mf.x, 6, 9, C8077mf.y, 62, 4, C8077mf.C, 2, 4, 17, C8077mf.y, 8, C8077mf.p, C8077mf.q, C8077mf.G, C8077mf.D, C8077mf.q, 13, 5, C8077mf.D, 28, C8077mf.q, 13, C8077mf.m};
    }

    public TR(String str, Map<String, String> mStaticEnvironmentData) {
        this(str, mStaticEnvironmentData, false);
    }

    public TR(String str, Map<String, String> map, boolean z) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = z ? A00(1, 1, 37) : A00(0, 1, 73);
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(18, 10, 31), this.A01);
        hashMap.put(A00(2, 16, 16), this.A00);
        Map<String, String> data = this.A02;
        hashMap.putAll(data);
        return hashMap;
    }
}
