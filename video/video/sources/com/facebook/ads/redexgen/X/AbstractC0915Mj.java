package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Mj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC0915Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, 28, 19, 3, C8077mf.r, 9, C8077mf.u, 17, 36, C8077mf.E, C8077mf.m, C8077mf.H, 17, C8077mf.r, C8077mf.y, C8077mf.H};
    }

    public static long A00(InterfaceC0916Mk interfaceC0916Mk) {
        return interfaceC0916Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static Uri A01(InterfaceC0916Mk interfaceC0916Mk) {
        String A6j = interfaceC0916Mk.A6j(A02(7, 9, 119), null);
        if (A6j == null) {
            return null;
        }
        return Uri.parse(A6j);
    }
}
