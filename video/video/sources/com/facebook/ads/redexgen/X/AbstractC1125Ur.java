package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.C9355rt;
import o.ED2;
import o.EF0;
import o.InterfaceC8148mw2;
import o.QC1;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Ur  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1125Ur {
    public static byte[] A00;
    public static String[] A01 = {"Z5CDeKIRbdSSRSQIrVuvkRGSoBqaj2vD", "vAYmZT8ASJMB3FzzuSGq4ydCUrxXwpoH", "w5gGutYUngeqRFsCKcvWOvxRavdUOOsS", "yOEODZsyHWLZAvoEgSYJGhZTBHDJn", "rt7Bq94iIT4vcXtoKSYLP1d4W6MwPUTJ", "NG6XHFEJ7LlyPEQHkLbosD3XyF7yGiUv", "J0QPPK8CgABCN6AkZrLHMYAzYl1dWHal", "XBXEBoD0FueyJiRlgHiLQagWcf9HuHXl"};

    public static String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A0N() {
        A00 = new byte[]{80, 28, 62, 49, QC1.w, C3307Iz.c0, Byte.MAX_VALUE, 47, 62, C3307Iz.e0, C3307Iz.d0, 58, Byte.MAX_VALUE, C3307Iz.d0, 62, 50, 47, 51, 54, 49, 56, 113, 52, 50, C8077mf.A, C8077mf.u, C8077mf.u, 31, 2, 31, C8077mf.C, C8077mf.B, C8077mf.A, C8077mf.D, C3307Iz.a0, C8077mf.u, 19, C8077mf.x, 3, 17, C3307Iz.a0, C8077mf.D, C8077mf.C, 17, 17, 31, C8077mf.B, 17, C3307Iz.a0, C8077mf.x, C8077mf.D, C8077mf.A, C8077mf.y, C8077mf.G, C3307Iz.a0, C8077mf.D, 31, 5, 2, 10, C8077mf.q, C8077mf.q, 2, 31, 2, 4, 5, 10, 7, 52, C8077mf.q, C8077mf.p, 9, C8077mf.H, C8077mf.n, 52, 7, 4, C8077mf.n, C8077mf.n, 2, 5, C8077mf.n, 52, 9, 7, 10, 8, 0, 52, 7, 2, C8077mf.B, 31, 52, C8077mf.E, C8077mf.p, C8077mf.C, 8, C8077mf.p, 5, 31, 10, C8077mf.n, C8077mf.p, C3307Iz.Z, 34, 34, 47, 50, 47, C3307Iz.a0, 40, C3307Iz.Z, 42, C8077mf.C, 34, 35, 36, 51, C3307Iz.V, C8077mf.C, 42, C3307Iz.a0, C3307Iz.V, C3307Iz.V, 47, 40, C3307Iz.V, C8077mf.C, 53, C3307Iz.Z, C3307Iz.c0, 54, 42, 47, 40, C3307Iz.V, C8077mf.C, 54, 35, 52, C3307Iz.X, 35, 40, 50, C3307Iz.Z, C3307Iz.V, 35, 84, 81, 91, 66, 106, 84, 81, 81, 92, 65, 92, 90, 91, 84, 89, 106, 89, 90, 82, 82, 92, 91, 82, 106, 71, 80, 65, 71, 76, 106, 89, 92, 88, 92, 65, C8077mf.n, 9, 3, C8077mf.D, 50, C8077mf.n, 9, 9, 4, C8077mf.C, 4, 2, 3, C8077mf.n, 1, 50, 1, 2, 10, 10, 4, 3, 10, 50, C8077mf.B, C8077mf.H, 8, 50, C8077mf.C, 8, 0, C8077mf.G, 50, C8077mf.m, 4, 1, 8, 50, C8077mf.m, 2, 31, 50, 31, 8, C8077mf.D, 31, 4, C8077mf.C, 8, 112, 117, Byte.MAX_VALUE, 102, 78, 112, Byte.MAX_VALUE, 117, 99, 126, QC1.w, 117, 78, 112, 125, 102, 112, 104, 98, 78, 125, 126, 118, 78, 114, 126, 99, 116, 78, 119, 100, Byte.MAX_VALUE, Byte.MAX_VALUE, 116, 125, 78, 116, 103, 116, Byte.MAX_VALUE, 101, 98, 70, 67, 73, 80, QC1.w, 70, 73, 67, 85, 72, 78, 67, QC1.w, 68, 70, 68, 79, 66, QC1.w, 67, 66, 69, 82, 64, QC1.w, 66, 81, 66, 73, 83, 84, QC1.w, 84, 70, 74, 87, 75, 78, 73, 64, QC1.w, 85, 70, 83, 66, C8077mf.n, 9, 3, C8077mf.D, 50, C8077mf.n, 3, 9, 31, 2, 4, 9, 50, 9, 4, C8077mf.H, C8077mf.G, C8077mf.n, C8077mf.C, C8077mf.p, 5, 8, 31, 50, 4, 3, 4, C8077mf.C, 4, C8077mf.n, 1, 50, 31, 8, C8077mf.C, 31, C8077mf.x, 50, 9, 8, 1, C8077mf.n, C8077mf.x, 50, 0, C8077mf.H, 83, 86, 92, 69, 109, 83, 92, 86, 64, 93, 91, 86, 109, 86, 91, 65, 66, 83, 70, 81, 90, 87, 64, 109, 95, 83, 74, 109, 64, 87, 70, 64, 75, 109, 81, 93, 71, 92, 70, 48, 53, ED2.a, C3307Iz.Y, C8077mf.p, 48, ED2.a, 53, 35, 62, 56, 53, C8077mf.p, 55, 36, ED2.a, ED2.a, 52, C4715Xk.i, C8077mf.p, 53, 52, 51, 36, 54, C8077mf.p, 52, C3307Iz.Z, 52, ED2.a, C3307Iz.X, 34, C8077mf.p, 34, 48, 60, C3307Iz.V, C4715Xk.i, 56, ED2.a, 54, C8077mf.p, 35, 48, C3307Iz.X, 52, 68, 65, 75, 82, 122, 68, 75, 65, 87, 74, 76, 65, 122, 76, 85, 70, 122, 65, 64, 71, 80, 66, 122, 64, 83, 64, 75, 81, 86, 122, 86, 68, 72, 85, 73, 76, 75, 66, 122, 87, 68, 81, 64, 54, 51, 57, 32, 8, 54, 57, 51, C3307Iz.X, 56, 62, 51, 8, 59, 56, 52, 54, 59, 8, 52, 56, 34, 57, 35, 50, C3307Iz.X, 36, 8, 36, 54, 58, C3307Iz.Z, 59, 62, 57, 48, 8, C3307Iz.X, 54, 35, 50, 77, 72, 66, 91, 115, 77, 66, 72, 94, 67, 69, 72, 115, 66, 77, 88, 69, 90, 73, 115, 90, 69, 73, 91, 77, 78, 69, 64, 69, 88, 85, 115, 68, 69, 95, 88, 67, 94, 85, 115, 95, 77, 65, 92, 64, 69, 66, 75, 115, 94, 77, 88, 73, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 84, 95, 78, 77, 85, 72, 81, 101, 94, 95, 88, 79, 93, 101, 95, 76, 95, 84, 78, 73, 101, 73, 91, 87, 74, 86, 83, 84, 93, 101, 72, 91, 78, 95, 76, 73, 67, 90, 114, 76, 67, 73, 95, 66, 68, 73, 114, 88, 94, 72, 114, 65, 66, 78, 76, 65, 114, 78, 66, 88, 67, 89, 72, 95, 94, 123, 126, 116, 109, 69, 126, Byte.MAX_VALUE, QC1.w, 111, 125, 69, 118, 117, 125, 69, 124, 115, 118, Byte.MAX_VALUE, 69, 105, 115, 96, Byte.MAX_VALUE, 69, 118, 115, 119, 115, 110, 69, QC1.w, 99, 110, Byte.MAX_VALUE, 105, 73, 76, 70, 95, 119, 76, 77, 74, 93, 79, 119, 68, 71, 79, 79, 65, 70, 79, QC1.w, 125, 119, 110, 70, 125, 124, 123, 108, 126, 70, 117, 118, 126, 126, 112, 119, 126, 70, 124, 111, 124, 119, 109, 70, 117, 112, 116, 112, 109, 19, C8077mf.z, 28, 5, C3307Iz.e0, C8077mf.H, C8077mf.G, C8077mf.y, C3307Iz.e0, 19, C8077mf.z, C8077mf.z, C8077mf.E, 6, C8077mf.E, C8077mf.G, 28, 19, C8077mf.H, C3307Iz.e0, C8077mf.H, C8077mf.G, C8077mf.y, C8077mf.y, C8077mf.E, 28, C8077mf.y, C3307Iz.e0, C8077mf.A, 4, C8077mf.A, 28, 6, 1, C3307Iz.e0, C8077mf.H, C8077mf.E, 31, C8077mf.E, 6, 53, 48, 58, 35, C8077mf.m, 56, 59, 51, C8077mf.m, 53, 48, 48, C4715Xk.i, 32, C4715Xk.i, 59, 58, 53, 56, C8077mf.m, 56, 59, 51, 51, C4715Xk.i, 58, 51, C8077mf.m, C4715Xk.i, 58, C8077mf.m, 57, 49, 57, 59, C3307Iz.Y, C3307Iz.e0, C8077mf.m, 49, 34, 49, 58, 32, C3307Iz.Z, C8077mf.m, 56, C4715Xk.i, 57, C4715Xk.i, 32, 73, 76, 70, 95, 119, 68, 71, 79, 119, 73, 76, 76, 65, 92, 65, 71, 70, 73, 68, 119, 68, 71, 79, 79, 65, 70, 79, 119, 91, 77, 91, 91, 65, 71, 70, 119, 77, 94, 77, 70, 92, 91, 119, 73, 68, 95, 73, 81, 91, 48, 53, ED2.a, C3307Iz.Y, C8077mf.p, 34, 52, ED2.a, 53, C8077mf.p, 48, 53, 53, 56, C3307Iz.X, 56, 62, ED2.a, 48, C4715Xk.i, C8077mf.p, 53, 52, 51, 36, 54, C8077mf.p, C4715Xk.i, 62, 54, 54, 56, ED2.a, 54, C8077mf.p, 34, C3307Iz.X, 48, 50, 58, C3307Iz.X, 35, 48, 50, 52, 122, Byte.MAX_VALUE, 117, 108, 68, 104, 115, 116, 110, 119, Byte.MAX_VALUE, 68, 110, 104, 126, 68, 125, 114, 119, 126, 68, 121, 122, 104, 126, Byte.MAX_VALUE, 68, 105, 126, QC1.w, 116, 105, Byte.MAX_VALUE, 68, Byte.MAX_VALUE, 122, 111, 122, 121, 122, 104, 126, 32, C3307Iz.X, 47, 54, C8077mf.H, 52, 50, 36, C8077mf.H, 50, C3307Iz.a0, C3307Iz.f0, 51, 53, C8077mf.H, 36, 47, 55, C8077mf.H, C3307Iz.X, 32, 53, 32, C8077mf.H, 
        C3307Iz.Z, C3307Iz.f0, 51, C8077mf.H, 32, C3307Iz.X, C3307Iz.X, 40, 53, 40, C3307Iz.f0, 47, 32, C3307Iz.e0, C8077mf.H, C3307Iz.e0, C3307Iz.f0, C3307Iz.Y, C3307Iz.Y, 40, 47, C3307Iz.Y, 122, 124, 71, 124, 121, 108, 121, 71, 116, 119, Byte.MAX_VALUE, Byte.MAX_VALUE, 113, 118, Byte.MAX_VALUE, 71, 116, 113, 117, 113, 108, C8077mf.m, C8077mf.r, C8077mf.A, C8077mf.B, C8077mf.A, C8077mf.E, C8077mf.D, C3307Iz.V, C8077mf.u, 17, C8077mf.C, C8077mf.C, C8077mf.A, C8077mf.r, C8077mf.C, C3307Iz.V, C8077mf.D, C8077mf.A, 13, C8077mf.p, 31, 10, C8077mf.G, C8077mf.z, C3307Iz.V, C8077mf.A, C8077mf.r, 10, C8077mf.E, C8077mf.n, 8, 31, C8077mf.u, C3307Iz.V, 13, C8077mf.E, C8077mf.G, 17, C8077mf.r, C8077mf.D, 13, 66, 89, 94, 81, 94, 82, 83, 104, 91, 88, 80, 80, 94, 89, 80, 104, 82, 65, 82, 89, 67, 104, 91, 94, 90, 94, 67, 3, C8077mf.B, 31, C8077mf.r, 31, 19, C8077mf.u, C3307Iz.a0, C8077mf.D, C8077mf.C, 17, 17, 31, C8077mf.B, 17, C3307Iz.a0, 31, C8077mf.E, C8077mf.E, 19, C8077mf.u, 31, C8077mf.A, 2, 19, C3307Iz.a0, C8077mf.u, 19, C8077mf.D, C8077mf.A, C8077mf.q, C3307Iz.a0, C8077mf.E, 5, 102, 125, 122, 117, 122, 118, 119, 76, Byte.MAX_VALUE, 124, 116, 116, 122, 125, 116, 76, 97, 118, 103, 97, 106, 76, Byte.MAX_VALUE, 122, 126, 122, 103};
    }

    static {
        A0N();
    }

    public static int A00(Context context) {
        return C1123Up.A0V(context).A32(A0L(750, 40, 73), 10);
    }

    public static int A01(Context context) {
        return C1123Up.A0V(context).A32(A0L(790, 50, 111), 50);
    }

    public static int A02(Context context) {
        return C1123Up.A0V(context).A32(A0L(149, 35, 14), 1);
    }

    public static int A03(Context context) {
        return A0H(context, A0L(59, 46, 80), 0);
    }

    public static int A04(Context context) {
        return A0H(context, A0L(105, 44, 125), 0);
    }

    public static int A05(Context context) {
        return C1123Up.A0V(context).A32(A0L(o.J8.b0, 21, 35), 10);
    }

    public static int A06(Context context) {
        return C1123Up.A0V(context).A32(A0L(275, 45, 28), 0);
    }

    public static int A07(Context context) {
        return C1123Up.A0V(context).A32(A0L(666, 36, 33), C9355rt.h);
    }

    public static int A08(Context context) {
        return C1123Up.A0V(context).A32(A0L(720, 30, 34), 30);
    }

    public static int A09(Context context) {
        return C1123Up.A0V(context).A32(A0L(366, 39, 9), 5);
    }

    public static int A0A(Context context) {
        return C1123Up.A0V(context).A32(A0L(405, 46, 106), 0);
    }

    public static int A0B(Context context) {
        return C1123Up.A0V(context).A32(A0L(451, 43, 30), 0);
    }

    public static int A0C(Context context) {
        return C1123Up.A0V(context).A32(A0L(494, 41, 108), 0);
    }

    public static int A0D(Context context) {
        return C1123Up.A0V(context).A32(A0L(535, 53, 23), 0);
    }

    public static int A0E(Context context) {
        return C1123Up.A0V(context).A32(A0L(588, 47, 1), 0);
    }

    public static int A0F(Context context) {
        return C1123Up.A0V(context).A32(A0L(1084, 27, 12), 30);
    }

    public static int A0G(Context context) {
        return C1123Up.A0V(context).A32(A0L(1145, 27, 40), 20);
    }

    public static int A0H(Context context, String str, int i) {
        int A32 = C1123Up.A0V(context).A32(str, i);
        if (A32 >= 0 && A32 < 101) {
            return A32;
        }
        return i;
    }

    public static long A0I(Context context) {
        return C1123Up.A0V(context).A33(A0L(320, 46, 86), 2000L);
    }

    public static long A0J(Context context) {
        return C1123Up.A0V(context).A32(A0L(1043, 41, 69), 300) * 1000;
    }

    public static long A0K(Context context) {
        return C1123Up.A0V(context).A33(A0L(1111, 34, 77), 500L);
    }

    public static HashMap<String, Integer> A0M(Context context) throws JSONException {
        String blackListString = C1123Up.A0V(context).A34(A0L(24, 35, 77), A0L(22, 2, 84));
        HashMap<String, Integer> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray(blackListString);
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String A0L = A0L(0, 1, 85);
                if (optString.contains(A0L)) {
                    String[] split = optString.split(A0L);
                    String blackListString2 = split[1];
                    try {
                        int parseInt = Integer.parseInt(blackListString2);
                        String str = split[0];
                        Integer valueOf = Integer.valueOf(parseInt);
                        String[] strArr = A01;
                        if (strArr[1].charAt(19) == strArr[6].charAt(19)) {
                            throw new RuntimeException();
                        }
                        A01[2] = "wzhVBTrm4NHLde2dsMQb3id1wgsCAtfS";
                        hashMap.put(str, valueOf);
                    } catch (NumberFormatException unused) {
                        throw new JSONException(A0L(1, 21, 100));
                    }
                } else {
                    String[] strArr2 = A01;
                    if (strArr2[1].charAt(19) != strArr2[6].charAt(19)) {
                        String[] strArr3 = A01;
                        strArr3[5] = "lVwzbqekYbQANiPk50jGeH7RXXU9rAeI";
                        strArr3[7] = "4HLNgzBPZBjDavwa2VUT1a0cI7AwYTVO";
                        hashMap.put(optString, -1);
                    } else {
                        hashMap.put(optString, -1);
                    }
                }
            }
        }
        return hashMap;
    }

    public static boolean A0O(Context context) {
        return C1123Up.A0V(context).A38(A0L(EF0.t, 49, 86), true);
    }

    public static boolean A0P(Context context) {
        return C1123Up.A0V(context).A38(A0L(InterfaceC8148mw2.h.l, 18, 19), false);
    }

    public static boolean A0Q(Context context) {
        return C1123Up.A0V(context).A38(A0L(840, 49, 19), true);
    }

    public static boolean A0R(Context context) {
        return C1123Up.A0V(context).A38(A0L(889, 45, 106), false);
    }

    public static boolean A0S(Context context) {
        return C1123Up.A0V(context).A38(A0L(233, 42, 42), true);
    }

    public static boolean A0T(Context context) {
        return C1123Up.A0V(context).A38(A0L(934, 42, 32), false);
    }

    public static boolean A0U(Context context) {
        return C1123Up.A0V(context).A38(A0L(635, 31, 22), false);
    }

    public static boolean A0V(Context context) {
        return C1123Up.A0V(context).A38(A0L(976, 46, 122), true);
    }
}
