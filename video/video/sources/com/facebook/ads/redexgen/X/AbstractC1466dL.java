package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1466dL {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1465dK A00(C1673gi c1673gi, JSONObject jSONObject, C1079Sx c1079Sx, VI vi, C1444cz c1444cz, boolean z) {
        boolean z2;
        String str;
        boolean z3 = z;
        String A01 = A01(101, 3, 41);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String optString = jSONObject.optString(A01(51, 26, 104));
        arrayList3.add(optString);
        if (z3) {
            str = c1079Sx.A0S(optString);
            if (optString.equals(str)) {
                z3 = false;
                z2 = false;
            } else {
                z2 = z3;
            }
        } else {
            z2 = z3;
            str = optString;
        }
        vi.A04(VH.A0P, null);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(92, 4, 49));
            if (optJSONObject != null && optJSONObject.optString(A01) != null) {
                arrayList.add(optJSONObject.optString(A01));
                if (z2) {
                    optJSONObject.put(A01, c1079Sx.A0R(optJSONObject.optString(A01)));
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(A01(77, 15, 113));
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString2 = optJSONArray.optString(i);
                    arrayList.add(optString2);
                    if (z2) {
                        optJSONArray.put(i, c1079Sx.A0R(optString2));
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 37));
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    A03(arrayList, arrayList2, optJSONArray2.optJSONObject(i2), c1079Sx, z2);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c1079Sx, z2);
            }
        } catch (JSONException unused) {
            c1444cz.A04(AbstractC1085Td.A15, A01(0, 43, 35));
        }
        return new C1465dK(jSONObject, str, arrayList, arrayList2, arrayList3, z3);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-87, -42, -42, -45, -42, -124, C2638Cg0.n7, -42, C2638Cg0.s7, -46, -41, C2638Cg0.w7, -45, -42, -47, C2638Cg0.y7, -46, C2638Cg0.x7, -124, -82, -73, -77, -78, -124, C2638Cg0.y7, -46, -124, C2638Cg0.E7, -44, -56, C2638Cg0.s7, C2638Cg0.n7, C2638Cg0.v7, -89, C2638Cg0.s7, C2638Cg0.u7, -52, C2638Cg0.v7, -56, -71, -42, -48, -41, C2638Cg0.v7, C2638Cg0.u7, C2638Cg0.n7, -43, -37, C2638Cg0.E7, C2638Cg0.x7, -46, 13, 34, C8077mf.A, 10, C8077mf.z, C8077mf.u, C8077mf.n, 8, 28, 13, C8077mf.x, 8, C8077mf.y, 10, 34, C8077mf.p, C8077mf.E, 8, 17, C8077mf.G, C8077mf.z, C8077mf.y, 8, C8077mf.H, C8077mf.E, C8077mf.y, C8077mf.A, 32, C8077mf.z, 17, C8077mf.y, 19, 36, C8077mf.z, 17, C8077mf.E, 31, 19, C8077mf.C, C8077mf.A, C3307Iz.X, -37, -43, C2638Cg0.C7, -32, -35, C2638Cg0.C7, -43, -37, C2638Cg0.E7, -33, -36, -42, -32, -45, C2638Cg0.z7, C2638Cg0.A7, C2638Cg0.E7, C2638Cg0.v7, -33, -36, -42};
    }

    public static void A03(ArrayList<String> imageUrls, ArrayList<String> videoUrls, JSONObject jSONObject, C1079Sx c1079Sx, boolean z) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(96, 5, 51));
        if (optJSONObject != null) {
            String A01 = A01(101, 3, 41);
            if (optJSONObject.optString(A01) != null) {
                String optString = optJSONObject.optString(A01);
                imageUrls.add(optString);
                if (z) {
                    optJSONObject.put(A01, c1079Sx.A0R(optString));
                }
            }
        }
        String A012 = A01(104, 9, 41);
        if (!TextUtils.isEmpty(jSONObject.optString(A012))) {
            String optString2 = jSONObject.optString(A012);
            videoUrls.add(optString2);
            if (z) {
                jSONObject.put(A012, c1079Sx.A0S(optString2));
            }
        }
    }
}
