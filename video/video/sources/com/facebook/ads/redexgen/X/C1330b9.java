package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.b9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1330b9 {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, C2638Cg0.C7, -22, -21, -16, -10, -11, -37, -42, -36, C2638Cg0.w7, C2638Cg0.A7};
    }

    public C1330b9() {
        this.A00 = new HashMap();
    }

    public C1330b9(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C1330b9 A02(Y2 y2) {
        if (y2 != null) {
            this.A00.put(A00(11, 5, 48), AbstractC1184Xd.A01(y2.A04()));
        }
        return this;
    }

    public final C1330b9 A03(C1618fp c1618fp) {
        if (c1618fp != null) {
            this.A00.putAll(c1618fp.A0S());
        }
        return this;
    }

    public final C1330b9 A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
