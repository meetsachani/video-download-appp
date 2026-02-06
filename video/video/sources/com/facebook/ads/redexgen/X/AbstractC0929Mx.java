package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Mx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0929Mx {
    public static byte[] A00;
    public static String[] A01 = {"jSoy8XspXCFqO9NWG0uega5zyBcMMpnv", "8I941vkvBihlhZSR3", "E0n4xhy7f55RdYtJKKgnHTy6BEjDvFXE", "Oow628hlFtykEPzM3xMW0Wh", "gjSfO6YGNNbsKn6TLZq3stDSfq2Vbbu6", "XJoMwGgC8l1BSQaiX90ZQnicuTGj509z", "JK4GcCSwzapE3gOVlVNykyUw2lU6lT6d", "8BqJ2MeWpSgEuyxwl"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {86, 115, 55, 126, 100, 55, 126, 121, 97, 118, 123, 126, 115, 118, 99, 114, 115, 55, 96, 126, 99, Byte.MAX_VALUE, QC1.w, 98, 99, 55, 99, QC1.w, 124, 114, 121, 57, C8077mf.E, 10, 19, 117, 116, 101, 116, 114, 101, QC1.w, 126, Byte.MAX_VALUE, 78, 98, 101, 99, QC1.w, Byte.MAX_VALUE, 118, 98, C3307Iz.Z, 32, 56, 47, 34, C3307Iz.Z, 42, 47, 58, C3307Iz.Z, C3307Iz.V, 32, 17, C3307Iz.d0, C3307Iz.c0, C3307Iz.Y, 47, 56, C3307Iz.Z, C3307Iz.V, 60, C3307Iz.e0, 60, 47, C3307Iz.f0, 52, 51, 58};
        if (A01[6].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "4DtSv1ItoT1AnjNkW";
        strArr[1] = "xsdhzuZMhKe1kPAxh";
        A00 = bArr;
    }

    static {
        A05();
    }

    public static EnumC0927Mv A00(JSONObject jSONObject) {
        return EnumC0927Mv.A00(jSONObject.optString(A02(52, 21, 9)));
    }

    public static C1888kJ A01(C1673gi c1673gi, JSONObject jSONObject, String str) {
        return new C1888kJ(jSONObject, c1673gi, str);
    }

    public static Collection<String> A03(C1673gi c1673gi, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 86));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e) {
            c1673gi.A08().ABC(A02(73, 7, 26), AbstractC1085Td.A2C, new C1086Te(e));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A06(C1673gi c1673gi, InterfaceC0928Mw interfaceC0928Mw, VA va) {
        EnumC0927Mv A8K = interfaceC0928Mw.A8K();
        if (A8K != null) {
            EnumC0927Mv invalidationBehavior = EnumC0927Mv.A03;
            if (A8K != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A7p = interfaceC0928Mw.A7p();
                if (A7p == null || A7p.isEmpty()) {
                    return false;
                }
                Iterator<String> it = A7p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (AbstractC1189Xi.A04(c1673gi, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC0927Mv invalidationBehavior2 = EnumC0927Mv.A02;
                if (packageInstalled != (A8K == invalidationBehavior2)) {
                    return false;
                }
                String clientToken = interfaceC0928Mw.A7O();
                if (!TextUtils.isEmpty(clientToken)) {
                    va.ABK(clientToken, null);
                    return true;
                }
                c1673gi.A08().ABC(A02(32, 3, 61), AbstractC1085Td.A0Z, new C1086Te(A02(0, 32, 80)));
                return true;
            }
        }
        return false;
    }
}
