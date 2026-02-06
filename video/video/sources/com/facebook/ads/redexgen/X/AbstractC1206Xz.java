package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Xz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1206Xz {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -6, -16, -2, -5, -11, -16, -70, -4, -15, -2, -7, -11, -1, -1, -11, -5, -6, -70, C2638Cg0.y7, C2638Cg0.A7, C2638Cg0.A7, -47, -33, -33, -21, C2638Cg0.B7, -47, -32, -29, -37, -34, -41, -21, -33, -32, C2638Cg0.y7, -32, -47, 5, 17, C8077mf.r, C8077mf.r, 7, 5, C8077mf.z, C8077mf.m, C8077mf.B, C8077mf.m, C8077mf.z, C8077mf.E};
    }

    public static EnumC1205Xy A00(Context context) {
        int result = context.checkCallingOrSelfPermission(A01(0, 39, 51));
        if (result != 0) {
            return EnumC1205Xy.A08;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(A01(39, 12, 73))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return EnumC1205Xy.A07;
        }
        int result2 = activeNetworkInfo.getType();
        if (result2 == 0) {
            int result3 = activeNetworkInfo.getSubtype();
            switch (result3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return EnumC1205Xy.A03;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return EnumC1205Xy.A04;
                case 13:
                    return EnumC1205Xy.A05;
                default:
                    return EnumC1205Xy.A08;
            }
        }
        return EnumC1205Xy.A06;
    }
}
