package com.facebook.ads.internal.protocol;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public enum AdPlacementType {
    BANNER(A00(74, 6, 36)),
    MEDIUM_RECTANGLE(A00(92, 16, 88)),
    INTERSTITIAL(A00(80, 12, 40)),
    NATIVE(A00(108, 6, 13)),
    NATIVE_BANNER(A00(114, 13, 119)),
    REWARDED_VIDEO(A00(127, 14, 85)),
    UNKNOWN(A00(C3503Kz.e0, 7, 17));
    
    public static byte[] A01;
    public static String[] A02 = {"CWC1iyAzuHCyWu1B0SYAHTA3miIxyRDu", "FO468KlqU7YYiE83Le7T5pQKY2foYhCa", "4lSmmc8pBcjbV0on62ZikVJFYVLsdMQp", "9H0k66zkYNaHG7pLFG5T73JVLywfdj", "IkTzUK68woTPnHHBk", "q5XpLTEZbHtnyzZXCKIvrGbFL2My8Wb0", "rdQ7fJEKRbVHtvxpiCxMwn5qtJ9qGM1n", "xGvuYGSPJhOX4"};
    public String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(3) != '7') {
                throw new RuntimeException();
            }
            A02[7] = "CTk8rnXs6cBCh";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-35, -36, -23, -23, -32, -19, C2638Cg0.A7, -44, C2638Cg0.B7, C2638Cg0.x7, C2638Cg0.n7, C2638Cg0.E7, C2638Cg0.B7, C2638Cg0.A7, C2638Cg0.B7, C2638Cg0.A7, C2638Cg0.u7, -46, C8077mf.A, C8077mf.q, C8077mf.p, 19, 31, C8077mf.A, C3307Iz.a0, 28, C8077mf.q, 13, C8077mf.H, C8077mf.m, C8077mf.B, 17, C8077mf.z, C8077mf.q, -33, -46, -27, C2638Cg0.B7, -25, -42, -13, -26, -7, -18, -5, -22, 4, -25, -26, -13, -13, -22, -9, C3307Iz.d0, 31, 49, C8077mf.E, C3307Iz.d0, C8077mf.H, 31, C8077mf.H, 57, 48, 35, C8077mf.H, 31, C3307Iz.a0, C8077mf.r, 9, 6, 9, 10, C8077mf.u, 9, 5, 4, 17, 17, 8, C8077mf.y, C8077mf.r, C8077mf.y, C8077mf.E, C8077mf.n, C8077mf.C, C8077mf.D, C8077mf.E, C8077mf.r, C8077mf.E, C8077mf.r, 8, 19, 68, 60, 59, 64, 76, 68, 54, 73, 60, 58, 75, 56, 69, 62, 67, 60, -6, -19, 0, -11, 2, -15, 100, 87, 106, 95, 108, 91, 85, 88, 87, 100, 100, 91, 104, 70, 57, 75, 53, 70, 56, 57, 56, 51, 74, C4715Xk.i, 56, 57, 67, 5, -2, -5, -2, -1, 7, -2};
    }

    static {
        A01();
    }

    AdPlacementType(String str) {
        this.A00 = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.A00;
    }
}
