package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.C2372q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.CK1;
import o.ED2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class NI {
    public static byte[] A00;
    public static String[] A01 = {"rumqJp0zjtXTj7VCZC", "TMr6rmpz3eFeqFi1AyEescympmX4mKYs", "yKc30ML1ifcOIqfiQ1Y0n8yeP8tTgKvd", "ifxbXcWS1dksd5gxUX3XXpeR8fGAW9", "ARavVsGpFp1prhlT9X", "AJCuKBIGe5nliswM6BoL4M7qaWNzDabC", "wiV5dRZ8vBgNvrirj4IbquLjXKvqAP", "mqXFYOGhIorfWow0I7OGPDKbQEIe0IwJ"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1852ji A01(@Nullable C1673gi c1673gi, JSONObject jSONObject, String str, boolean z, int i, int i2) {
        boolean optBoolean;
        int optInt;
        boolean optBoolean2;
        int optInt2;
        boolean optBoolean3;
        int optInt3;
        ArrayList arrayList;
        if (jSONObject == null) {
            return new C1852ji();
        }
        XI.A04(c1673gi, A02(0, 23, 112));
        String optString = jSONObject.optString(A02(479, 10, 1));
        int optInt4 = jSONObject.optInt(A02(116, 12, 106), 0);
        String optString2 = jSONObject.optString(A02(253, 13, 18));
        String A02 = AbstractC1184Xd.A02(jSONObject, A02(266, 12, 52));
        Uri A002 = TextUtils.isEmpty(A02) ? null : XB.A00(A02);
        String A022 = AbstractC1184Xd.A02(jSONObject, A02(128, 4, 54));
        String A012 = AbstractC1202Xv.A01(A022);
        String A023 = AbstractC1184Xd.A02(jSONObject, A02(101, 15, 34));
        String A024 = AbstractC1184Xd.A02(jSONObject, A02(593, 5, 82));
        String A025 = AbstractC1184Xd.A02(jSONObject, A02(585, 8, 123));
        String A026 = AbstractC1184Xd.A02(jSONObject, A02(386, 8, 111));
        String A027 = AbstractC1184Xd.A02(jSONObject, A02(539, 14, 32));
        String A028 = AbstractC1184Xd.A02(jSONObject, A02(403, 16, 125));
        String A029 = AbstractC1184Xd.A02(jSONObject, A02(553, 21, 41));
        String A0210 = AbstractC1184Xd.A02(jSONObject, A02(87, 14, 99));
        String A0211 = AbstractC1184Xd.A02(jSONObject, A02(459, 20, 94));
        String A0212 = AbstractC1184Xd.A02(jSONObject, A02(CK1.q, 16, 123));
        String A0213 = AbstractC1184Xd.A02(jSONObject, A02(426, 17, 38));
        String A0214 = AbstractC1184Xd.A02(jSONObject, A02(C3503Kz.V, 14, 16));
        C05467m A003 = C05467m.A00(jSONObject, c1673gi);
        C1135Vb A004 = C1135Vb.A00(jSONObject.optJSONObject(A02(394, 4, 38)));
        C1135Vb A005 = C1135Vb.A00(jSONObject.optJSONObject(A02(398, 5, 114)));
        C1136Vc A006 = C1136Vc.A00(jSONObject.optJSONObject(A02(574, 11, 124)));
        String A0215 = AbstractC1184Xd.A02(jSONObject, A02(598, 15, 10));
        boolean optBoolean4 = jSONObject.optBoolean(A02(C10997yd1.u1, 15, 64));
        boolean optBoolean5 = jSONObject.optBoolean(A02(219, 19, 54));
        int optInt5 = jSONObject.optInt(A02(514, 25, 43), 4);
        int optInt6 = jSONObject.optInt(A02(489, 25, 29), 0);
        int optInt7 = jSONObject.optInt(A02(695, 31, 75), 0);
        int optInt8 = jSONObject.optInt(A02(726, 26, 18), 1000);
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(53, 15, 30));
        C1135Vb A007 = optJSONObject != null ? C1135Vb.A00(optJSONObject) : null;
        String A0216 = AbstractC1184Xd.A02(jSONObject, A02(68, 19, 95));
        EnumC0927Mv A008 = AbstractC0929Mx.A00(jSONObject);
        Collection<String> A03 = AbstractC0929Mx.A03(c1673gi, jSONObject);
        String A0217 = AbstractC1184Xd.A02(jSONObject, A02(686, 9, 20));
        int optInt9 = jSONObject.optInt(A02(635, 18, 76), 0);
        String A0218 = A02(662, 24, 63);
        if (A01[2].charAt(6) != 'o') {
            String[] strArr = A01;
            strArr[1] = "3DgIwYJYxCZHaga7jdAdEfDBKsaQLEaY";
            strArr[0] = "PJjdxes2PDM40JhdCx";
            long optLong = jSONObject.optLong(A0218, -1L);
            String A0219 = AbstractC1184Xd.A02(jSONObject, A02(653, 9, 120));
            String A0220 = A02(613, 22, 83);
            EnumC1139Vf enumC1139Vf = !jSONObject.has(A0220) ? EnumC1139Vf.A03 : jSONObject.optBoolean(A0220) ? EnumC1139Vf.A05 : EnumC1139Vf.A04;
            String A0221 = A02(C2372q.m, 29, 111);
            if (A01[2].charAt(6) != 'o') {
                A01[5] = "EiaN2GrSxKmld9dBg6rLOOlJPXBJhn44";
                optBoolean = jSONObject.optBoolean(A0221);
                optInt = jSONObject.optInt(A02(C3503Kz.n0, 36, 107), 100);
                optBoolean2 = jSONObject.optBoolean(A02(278, 18, 99), false);
                optInt2 = jSONObject.optInt(A02(296, 26, 38), 10);
                optBoolean3 = jSONObject.optBoolean(A02(353, 33, 122), false);
                optInt3 = jSONObject.optInt(A02(322, 31, 12), 1);
                arrayList = null;
            } else {
                optBoolean = jSONObject.optBoolean(A0221);
                optInt = jSONObject.optInt(A02(C3503Kz.n0, 36, 107), 100);
                optBoolean2 = jSONObject.optBoolean(A02(278, 18, 99), false);
                optInt2 = jSONObject.optInt(A02(296, 26, 38), 10);
                optBoolean3 = jSONObject.optBoolean(A02(353, 33, 122), false);
                optInt3 = jSONObject.optInt(A02(322, 31, 12), 1);
                arrayList = null;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(A02(C3503Kz.j0, 8, 26));
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    ArrayList arrayList2 = new ArrayList(length);
                    for (int i3 = 0; i3 < length; i3++) {
                        try {
                            arrayList2.add(A01(c1673gi, optJSONArray.getJSONObject(i3), str, true, i3, length));
                        } catch (JSONException e) {
                            e = e;
                            arrayList = arrayList2;
                            c1673gi.A08().ABC(A02(419, 7, 72), AbstractC1085Td.A2A, new C1086Te(e));
                            Log.e(C1864ju.A0E, A02(23, 30, 97), e);
                            return new C1852ji(A0216, A012, A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A007, A003, A004, A005, A006, A0217, A0219, optLong, enumC1139Vf, z, i, i2, arrayList, str, optString, optInt4, optString2, A002, A0215, optBoolean4, optBoolean5, optInt6, optInt5, optInt7, optInt8, A008, A03, optInt, optBoolean, optInt9, optBoolean2, optInt2, optBoolean3, optInt3);
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (JSONException e2) {
                e = e2;
            }
            return new C1852ji(A0216, A012, A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A007, A003, A004, A005, A006, A0217, A0219, optLong, enumC1139Vf, z, i, i2, arrayList, str, optString, optInt4, optString2, A002, A0215, optBoolean4, optBoolean5, optInt6, optInt5, optInt7, optInt8, A008, A03, optInt, optBoolean, optInt9, optBoolean2, optInt2, optBoolean3, optInt3);
        }
        throw new RuntimeException();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{C8077mf.D, 78, C4715Xk.i, 66, 62, 71, 60, 62, -7, C3307Iz.Z, 62, 77, 80, 72, 75, 68, -7, C3307Iz.X, 72, 58, C4715Xk.i, 62, C4715Xk.i, 31, 56, C3307Iz.c0, C3307Iz.d0, 54, 47, -22, 62, 57, -22, 58, C3307Iz.c0, 60, C4715Xk.i, 47, -22, C3307Iz.e0, C3307Iz.c0, 60, 57, ED2.a, C4715Xk.i, 47, 54, -22, C3307Iz.f0, C3307Iz.c0, 62, C3307Iz.c0, -8, -24, -21, -26, -22, -17, -10, -16, -22, -20, -6, -26, -16, -22, -10, -11, C3307Iz.a0, C3307Iz.d0, C3307Iz.Z, C3307Iz.c0, 48, 55, 49, C3307Iz.c0, C3307Iz.e0, 59, C3307Iz.Z, 52, 49, 54, 51, C3307Iz.Z, C4715Xk.i, 58, 52, C3307Iz.e0, 48, C3307Iz.c0, 64, 62, C3307Iz.e0, 58, ED2.a, 56, C3307Iz.e0, 64, 53, 59, 58, -20, -17, 1, -16, -3, -1, -12, -2, -16, -3, -22, -7, -20, -8, -16, 52, 65, 50, ED2.a, 66, 58, 66, 50, 71, 76, 67, 56, 1, C8077mf.p, 3, C8077mf.B, -36, C2638Cg0.B7, -27, -27, C2638Cg0.n7, -19, -24, C2638Cg0.n7, C2638Cg0.B7, -36, -19, -30, -24, -25, -26, -28, -11, -14, -8, -10, -24, -17, 55, 67, 66, 72, 53, C4715Xk.i, 66, 57, 70, 51, 74, C4715Xk.i, 57, 75, 53, 54, C4715Xk.i, 64, C4715Xk.i, 72, 77, 51, 55, 60, 57, 55, ED2.a, 51, C4715Xk.i, 66, 72, 57, 70, 74, 53, 64, 59, 71, 70, 76, 57, 65, 70, C4715Xk.i, 74, 55, 78, 65, C4715Xk.i, 79, 57, 58, 65, 68, 65, 76, 81, 55, C4715Xk.i, 70, 57, 58, 68, C4715Xk.i, 60, 4, 13, 0, 1, C8077mf.m, 4, -2, C8077mf.u, 13, 0, C8077mf.q, C8077mf.u, 7, C8077mf.p, 19, -2, C8077mf.m, C8077mf.p, 6, C8077mf.p, C8077mf.A, 10, C8077mf.m, C8077mf.y, C8077mf.p, 8, 31, C8077mf.u, C8077mf.p, 32, 8, C8077mf.y, C8077mf.B, C8077mf.r, -32, -23, -34, -19, -12, -21, -17, -32, -33, C2638Cg0.B7, -34, -21, -24, 3, -1, -2, 1, -4, 0, C8077mf.n, 10, 10, -2, C8077mf.m, 1, 52, 49, C3307Iz.c0, 47, 59, 65, 58, 64, 49, 62, C3307Iz.c0, 49, 58, C3307Iz.e0, C3307Iz.f0, 56, 49, 48, -9, -12, -18, -14, -2, 4, -3, 3, -12, 1, -18, 3, -8, -4, -12, -18, -8, -3, -18, 2, -12, -14, -2, -3, -13, 2, -35, C2638Cg0.B7, -44, -30, -22, C2638Cg0.C7, -23, -34, -44, C2638Cg0.n7, C2638Cg0.C7, -34, C2638Cg0.n7, -32, -44, C2638Cg0.n7, C2638Cg0.C7, -28, -24, C2638Cg0.B7, -44, -34, C2638Cg0.n7, -28, -29, -44, C2638Cg0.n7, -28, -22, -29, -23, 75, 72, 66, 80, 88, 79, 87, 76, 66, 70, 79, 76, 70, 78, 66, 70, 79, 82, 86, 72, 66, 76, 70, 82, 81, 66, 72, 81, 68, 69, 79, 72, 71, 64, C4715Xk.i, 57, 60, 68, 65, 70, C4715Xk.i, -8, -14, -2, -3, 68, 72, 60, 66, 64, 82, 79, 84, 81, 69, 74, 75, 89, 73, 88, 79, 86, 90, 79, 85, 84, C3307Iz.V, C8077mf.u, 35, 36, C8077mf.D, 31, C8077mf.B, -1, -16, 4, 2, -12, -18, 3, 1, -16, -3, 2, -5, -16, 3, -8, -2, -3, 84, 80, 69, 93, 67, 88, 86, 69, 82, 87, 80, 69, 88, 77, 83, 82, 55, 57, 54, 52, 54, 59, C3307Iz.d0, C3307Iz.c0, C3307Iz.Y, 59, 57, 40, 53, 58, 51, 40, 59, 48, 54, 53, -36, C2638Cg0.A7, -37, -33, C2638Cg0.A7, -35, -34, C2638Cg0.v7, -45, C2638Cg0.z7, -7, -12, -25, -10, -7, -18, -11, -6, -27, -23, -11, -13, -10, -8, -21, -7, -7, -27, -9, -5, -25, -14, -17, -6, -1, 7, 2, -11, 4, 7, -4, 3, 8, -13, 0, 3, -5, -13, -8, -7, 0, -11, 13, -13, 7, -7, -9, 3, 2, -8, -4, -8, -20, -14, -22, -11, -24, -20, -8, -9, -3, -18, 1, -3, 5, 2, 1, 0, 5, 1, 4, -9, -10, -15, 6, 4, -13, 0, 5, -2, -13, 6, -5, 1, 0, 88, 89, 70, 87, 68, 87, 70, 89, 78, 83, 76, 87, 89, 70, 88, 77, 88, 80, 73, 47, 36, 47, C3307Iz.Z, 32, -24, -26, C2638Cg0.n7, -41, -46, -27, C2638Cg0.n7, -29, -30, -27, -25, -46, -24, -27, -33, 50, C3307Iz.X, 32, C3307Iz.V, C3307Iz.c0, C8077mf.E, C8077mf.G, 49, 48, C3307Iz.c0, C3307Iz.d0, 40, C8077mf.G, 53, C8077mf.E, C3307Iz.V, 42, C8077mf.G, C8077mf.H, 40, C3307Iz.V, 32, C3307Iz.c0, C8077mf.H, C8077mf.C, C8077mf.D, 36, C8077mf.x, C8077mf.C, 42, C3307Iz.Z, C8077mf.z, C3307Iz.a0, C8077mf.H, 36, 35, C8077mf.x, 40, C8077mf.D, C8077mf.B, 87, 74, 69, 70, 80, 64, 78, 81, 69, C8077mf.H, 17, C8077mf.n, 13, C8077mf.A, 7, C8077mf.B, C8077mf.D, 13, C8077mf.x, C8077mf.A, 9, C8077mf.n, 7, C8077mf.E, 17, 34, 13, 7, 10, C3307Iz.V, 28, 13, C8077mf.E, -13, -26, C2638Cg0.C7, -30, -20, -36, -14, -17, -23, 42, C8077mf.G, C8077mf.C, C3307Iz.c0, C8077mf.y, C8077mf.z, C8077mf.G, 32, C8077mf.G, 40, C3307Iz.e0, 19, C8077mf.A, 28, C8077mf.C, C8077mf.A, 31, 19, C8077mf.G, 34, C8077mf.G, 40, C8077mf.G, C8077mf.y, 32, 19, C8077mf.B, C8077mf.C, 32, C8077mf.y, C3307Iz.e0, -15, -28, -32, -14, -36, -35, -28, -25, -28, -17, -12, C2638Cg0.B7, -34, -29, -32, -34, -26, C2638Cg0.B7, -28, -23, -17, -32, -19, -15, -36, -25};
    }

    static {
        A03();
    }

    public static C1852ji A00(C1673gi c1673gi, JSONObject jSONObject, String str) {
        return A01(c1673gi, jSONObject, str, false, -1, 0);
    }
}
