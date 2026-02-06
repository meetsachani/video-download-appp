package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.C8463oE0;
import o.ED2;
import o.InterfaceC8148mw2;
import o.QC1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Og  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0963Og {
    public static byte[] A01;
    public static String[] A02 = {"pVDJwwImNDAzAU7MVHYB7KJyYkXB8ng6", "xCCCN", "WmAvu667o4AOfXv58a4lhsk2v5Ms6Skb", "l5AJTkPNjTtBLXifXwK6kFeEJ0fMsOcr", "3rlSEGUZnv4yJ13AM8B6pi", "FEUqx4", "USh9ikhtS0UWG5H8nhVral6z3PYi0bQO", "dZN"};
    public static final String[] A03;
    public final InterfaceC0969Om A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{106, 7, C3307Iz.c0, 56, C3307Iz.V, 106, C3307Iz.c0, C3307Iz.f0, 106, C3307Iz.c0, 57, 106, C3307Iz.X, C3307Iz.d0, C3307Iz.d0, 47, 36, 57, 35, 60, 47, 106, C3307Iz.X, 56, 106, 35, 36, C3307Iz.c0, 58, 58, 56, C3307Iz.X, 58, 56, 35, C3307Iz.c0, 62, 47, 104, 77, 9, 65, 64, 77, 77, 76, 71, 7, 106, 79, C8077mf.m, 89, 78, 91, 68, 89, 95, 78, 79, 5, C8077mf.u, ED2.a, 54, 42, 122, 47, C3307Iz.a0, 122, 47, 52, 62, ED2.a, 40, C3307Iz.a0, C3307Iz.f0, 59, 52, 62, 122, C3307Iz.e0, 50, 59, C3307Iz.f0, 122, 51, C3307Iz.a0, 122, 50, 59, 42, 42, ED2.a, 52, 51, 52, C4715Xk.i, 116, 122, 13, 50, 35, 122, 62, 53, 52, 125, C3307Iz.f0, 122, 35, 53, 47, 122, C3307Iz.e0, 59, 52, C3307Iz.f0, 122, C3307Iz.f0, 53, 122, C3307Iz.a0, ED2.a, ED2.a, 122, C3307Iz.f0, 50, 51, C3307Iz.a0, 101, C3307Iz.Z, 10, 3, 31, 79, C8077mf.D, 28, 79, C8077mf.D, 1, C8077mf.m, 10, C8077mf.G, 28, C8077mf.E, C8077mf.p, 1, C8077mf.m, 79, C8077mf.B, 7, C8077mf.p, C8077mf.E, 79, 6, 28, 79, 7, C8077mf.p, 31, 31, 10, 1, 6, 1, 8, 65, 79, 56, 7, C8077mf.z, 79, 6, 28, 79, C8077mf.E, 7, 6, 28, 79, 6, 1, C8077mf.p, 31, 31, C8077mf.G, 0, 31, C8077mf.G, 6, C8077mf.p, C8077mf.E, 10, 80, 77, 108, 97, 96, C3307Iz.X, 68, 97, 118, 90, 85, 90, 92, 94, C8077mf.E, 90, 95, C8077mf.E, 75, 73, 94, 93, 94, 73, 94, 85, 88, 94, 72, 89, QC1.w, 55, Byte.MAX_VALUE, 126, 115, 114, 55, 118, 115, 55, QC1.w, 103, 99, 126, QC1.w, 121, 100, 31, 62, 113, 35, 52, C3307Iz.V, 62, 35, C3307Iz.X, 113, 48, 53, 113, 62, C3307Iz.V, C3307Iz.X, 56, 62, ED2.a, 34, 77, 122, 111, 112, 109, 107, ED2.a, 94, 123, 73, Byte.MAX_VALUE, Byte.MAX_VALUE, 58, 124, Byte.MAX_VALUE, 109, Byte.MAX_VALUE, 104, 58, 123, 126, 105, 58, 118, 115, 113, Byte.MAX_VALUE, 58, 110, 114, 115, 105, 110, 81, 64, C8077mf.C, 88, 84, C8077mf.C, 112, C8077mf.C, 74, 92, 92, 80, 87, 94, C8077mf.C, 77, 81, 80, 74, C8077mf.C, 88, 93, 6, 60, 10, C8077mf.r, C8077mf.A, 69, C8077mf.z, C8077mf.r, 7, 8, C8077mf.n, C8077mf.z, C8077mf.z, C8077mf.n, 10, C8077mf.m, 69, C8077mf.n, C8077mf.z, 69, C8077mf.m, 10, C8077mf.u, 69, 7, 0, C8077mf.n, C8077mf.m, 2, 69, C8077mf.A, 0, 19, C8077mf.n, 0, C8077mf.u, 0, 1, 75, 76, 74, 125, QC1.w, 67, Byte.MAX_VALUE, 116, 115, 117, Byte.MAX_VALUE, 121, 111, 67, 105, 110, 117, 102, 109, 108, 105, 97, 119, 96, 107, 90, 109, 96, 100, 97, 108, 107, 98, C3307Iz.Y, C3307Iz.e0, C3307Iz.d0, C3307Iz.a0, C3307Iz.V, 55, 32, C3307Iz.c0, C8077mf.D, 42, 53, 49, C3307Iz.d0, 42, C3307Iz.c0, 54, 117, 122, 125, 122, 96, 123, 118, 119, 76, 119, 118, 96, 112, 97, 122, 99, 103, 122, 124, 125, 74, 69, 66, 69, 95, 68, 73, 72, 115, 68, 69, 72, 73, 115, 77, 72, 90, 85, 82, 85, 79, 84, 89, 88, 99, 78, 89, 76, 83, 78, 72, 99, 93, 88, 59, 58, 55, 54, C8077mf.n, 50, 55, 49, 48, C4715Xk.i, 60, 6, 56, C4715Xk.i, 6, C4715Xk.i, 60, 42, 58, C3307Iz.c0, 48, C3307Iz.a0, C3307Iz.e0, 48, 54, 55, C4715Xk.i, 60, 49, 48, 10, 52, 49, 10, 51, 58, 57, 57, 58, 34, 10, 32, C3307Iz.X, 10, C4715Xk.i, 48, 52, 49, 60, 59, 50, 90, 91, 86, 87, 109, 83, 86, 109, 93, 66, 70, 91, 93, 92, 65, 89, 84, 70, 65, 106, 64, 69, 81, 84, 65, 80, 81, 106, 65, 92, 88, 80, 70, 65, 84, 88, 69, 40, 36, C3307Iz.c0, 36, 34, 32, C8077mf.D, 36, C3307Iz.V, C8077mf.D, 53, 55, 32, 35, 32, 55, 32, C3307Iz.c0, C3307Iz.Y, 32, 54, 85, 89, 86, 89, 95, 93, 103, 89, 92, 103, 72, 74, 93, 94, 93, 74, 93, 86, 91, 93, 75, 103, 77, 74, 81, 117, 110, 119, 119, 98, 125, 121, 100, 98, 99, 82, 121, 104, 117, 121, C3307Iz.V, 62, 58, C3307Iz.Z, C3307Iz.V, 32, 17, 56, 47, 34, 59, C3307Iz.c0, 8, 31, 10, C8077mf.y, 8, C8077mf.p, C3307Iz.X, C8077mf.E, C8077mf.H, C3307Iz.Z, 48, C3307Iz.X, 58, C3307Iz.Z, C3307Iz.V, 10, 52, 49, 10, 49, 48, C3307Iz.Y, 54, C3307Iz.Z, 60, C3307Iz.X, C3307Iz.V, 60, 58, 59, 13, C8077mf.D, C8077mf.q, C8077mf.r, 13, C8077mf.m, 32, C8077mf.H, C8077mf.E, 32, C8077mf.C, C8077mf.r, 19, 19, C8077mf.r, 8, 32, 10, C8077mf.q, 32, C8077mf.A, C8077mf.D, C8077mf.H, C8077mf.E, C8077mf.z, 17, C8077mf.B, 66, 85, 64, 95, 66, 68, 111, 81, 84, 111, 95, 64, 68, 89, 95, 94, 67, 91, 76, 89, 70, 91, 93, 64, 71, 78, C8077mf.r, C8077mf.q, C8077mf.H, 56, 6, 10, 56, C8077mf.p, 56, C8077mf.x, 2, 2, C8077mf.p, 9, 0, 56, 19, C8077mf.q, C8077mf.p, C8077mf.x};
    }

    static {
        A06();
        A03 = new String[]{A02(455, 7, 105), A02(462, 19, 99), A02(481, 25, 111), A02(InterfaceC8148mw2.g.n, 15, 8), A02(616, 9, 64), A02(625, 21, 111), A02(646, 27, 69), A02(673, 17, 10), A02(543, 21, 127), A02(421, 16, 22), A02(437, 18, 6), A02(401, 20, 41), A02(699, 20, 93), A02(355, 14, 38), A02(564, 25, 2)};
    }

    public C0963Og(InterfaceC0969Om interfaceC0969Om) {
        this.A00 = interfaceC0969Om;
    }

    private String A00() {
        return A03(A02(481, 25, 111), A02(60, 69, 96));
    }

    private String A01() {
        return A03(A02(646, 27, 69), A02(129, 64, 85));
    }

    private String A03(String str, String str2) {
        String A9E = this.A00.A9E(str, str2);
        if (A9E != null) {
            String value = A02(589, 4, 33);
            return A9E.equals(value) ? str2 : A9E;
        }
        return str2;
    }

    public static List<C0967Ok> A04(String str) throws JSONException {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(589, 4, 33))) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            C0967Ok c0967Ok = new C0967Ok(jSONObject.getInt(A02(InterfaceC8148mw2.e.t, 12, 116)), jSONObject.getString(A02(593, 11, 55)), jSONObject.optString(A02(369, 16, 63)));
            for (C0967Ok c0967Ok2 : A04(jSONObject.optString(A02(385, 16, 127)))) {
                c0967Ok.A06(c0967Ok2);
            }
            arrayList.add(c0967Ok);
        }
        return arrayList;
    }

    public static Map<String, String> A05(String str) {
        String[] strArr;
        if (str != null && !str.isEmpty()) {
            if (A02[0].charAt(31) == '2') {
                throw new RuntimeException();
            }
            A02[0] = "A8tiJT5v19tpxSVqHJBkbDhH2RRDdRkC";
            if (!str.equals(A02(353, 2, 45))) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    for (String str2 : A03) {
                        if (!jSONObject.has(str2)) {
                            return null;
                        }
                        hashMap.put(str2, jSONObject.getString(str2));
                    }
                    if (A04(jSONObject.getString(A02(673, 17, 10))).size() == 0) {
                        A08(AbstractC1085Td.A28, new C1086Te(A02(239, 20, 107)));
                        return null;
                    } else if (A04(jSONObject.getString(A02(InterfaceC8148mw2.g.n, 15, 8))).size() == 0) {
                        A08(AbstractC1085Td.A25, new C1086Te(A02(221, 18, 45)));
                        return null;
                    } else {
                        return hashMap;
                    }
                } catch (JSONException e) {
                    A08(AbstractC1085Td.A27, new C1086Te(e));
                    return null;
                }
            }
        }
        return null;
    }

    private final void A07() {
        C1762iC A6I = this.A00.A6I();
        A6I.A00(A02(521, 22, 15), 0L);
        A6I.A02();
    }

    public static void A08(int i, C1086Te c1086Te) {
        C1669ge sdkContext = T7.A00();
        if (sdkContext != null) {
            sdkContext.A08().ABC(A02(690, 9, 19), i, c1086Te);
        }
    }

    public final long A09() {
        return this.A00.A8Q(A02(521, 22, 15), 0L);
    }

    public final C0967Ok A0A() {
        C0967Ok c0967Ok = new C0967Ok(A00());
        try {
            for (C0967Ok hideAdParent : A04(A03(A02(InterfaceC8148mw2.g.n, 15, 8), A02(0, 0, 48)))) {
                c0967Ok.A06(hideAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(AbstractC1085Td.A26, new C1086Te(e));
        }
        return c0967Ok;
    }

    public final C0967Ok A0B() {
        C0967Ok c0967Ok = new C0967Ok(A01());
        try {
            for (C0967Ok reportAdParent : A04(A03(A02(673, 17, 10), A02(0, 0, 48)))) {
                c0967Ok.A06(reportAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(AbstractC1085Td.A29, new C1086Te(e));
        }
        return c0967Ok;
    }

    public final String A0C() {
        return A03(A02(355, 14, 38), A02(0, 0, 48));
    }

    public final String A0D() {
        return A03(A02(401, 20, 41), A02(315, 38, 95));
    }

    public final String A0E() {
        return A03(A02(421, 16, 22), A02(38, 10, 19));
    }

    public final String A0F() {
        return A03(A02(437, 18, 6), A02(48, 12, 17));
    }

    public final String A0G() {
        return A03(A02(462, 19, 99), A02(268, 23, 32));
    }

    public final String A0H() {
        return A03(A02(455, 7, 105), A02(C8463oE0.u, 7, 63));
    }

    public final String A0I() {
        return A03(A02(564, 25, 2), A02(0, 0, 48));
    }

    public final String A0J() {
        return A03(A02(543, 21, 127), A02(200, 21, 1));
    }

    public final String A0K() {
        return A03(A02(625, 21, 111), A02(0, 38, 112));
    }

    public final String A0L() {
        return A03(A02(616, 9, 64), A02(259, 9, 37));
    }

    public final String A0M() {
        return A03(A02(699, 20, 93), A02(291, 24, 3));
    }

    public final void A0N(String str) {
        String[] strArr;
        Map<String, String> A05 = A05(str);
        if (A05 == null || A05.size() != A03.length) {
            return;
        }
        C1762iC A6I = this.A00.A6I();
        for (String str2 : A03) {
            A6I.A01(str2, A05.get(str2));
        }
        if (A02[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "MCE7RaiUtGHbfQd9DpKX6Z";
        strArr2[5] = "LB7njF";
        A6I.A00(A02(521, 22, 15), System.currentTimeMillis());
        A6I.A02();
    }

    public final boolean A0O(Context context, boolean z) {
        return (z || C1123Up.A2h(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
