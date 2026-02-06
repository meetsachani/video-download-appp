package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.5l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC04935l {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 64, 57, 56, 69, 54, 73, 69, C3307Iz.c0, 28, 47, C3307Iz.c0, -26, C3307Iz.e0, C3307Iz.c0, C3307Iz.c0, 32, C8077mf.y, C8077mf.x};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String A01 = AbstractC1877k7.A01(str);
        if (TextUtils.isEmpty(A01)) {
            return false;
        }
        return ((A01.contains(A00(4, 4, 105)) && !A01.contains(A00(8, 8, 79))) || A01.contains(A00(0, 4, 100)) || A01.contains(A00(16, 3, 64))) ? false : true;
    }
}
