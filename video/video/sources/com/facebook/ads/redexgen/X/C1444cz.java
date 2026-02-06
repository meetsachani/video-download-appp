package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1444cz {
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-88, -73, -80, -80, -45, C2638Cg0.x7, C2638Cg0.x7, C2638Cg0.v7, -42, -74, C2638Cg0.A7, C2638Cg0.q7, C2638Cg0.r7, C2638Cg0.y7, C2638Cg0.t7, -127, -43, -48, -127, -60, -45, C2638Cg0.t7, C2638Cg0.q7, -43, C2638Cg0.t7, -127, C2638Cg0.q7, C2638Cg0.s7, C2638Cg0.s7, C2638Cg0.w7, -43, C2638Cg0.w7, -48, C2638Cg0.A7, C2638Cg0.q7, C2638Cg0.y7, -86, C2638Cg0.A7, C2638Cg0.u7, -48, -28, -25, -30, -26, -11, -24, -28, -9, -20, -7, -24, -30, -9, -4, -13, -24, -44, -41, -46, C2638Cg0.E7, -30, -27, -32, -44, -25, -46, -25, -20, -29, C2638Cg0.n7, C8077mf.r, 19, C8077mf.p, C3307Iz.V, C8077mf.x, 32, 36, C8077mf.x, 34, 35, C8077mf.p, C8077mf.B, 19, -26, -11, -18, C2638Cg0.E7, -35, -47, -41, -43, -6, -19, -24, -23, -13};
    }

    public C1444cz(String str, String str2, int i) {
        String A01;
        this.A02 = str;
        this.A00 = i;
        if (!TextUtils.isEmpty(str2)) {
            A01 = A01(91, 5, 56);
        } else {
            A01 = A01(86, 5, 36);
        }
        this.A01 = A01;
    }

    private C1086Te A00(String str) {
        C1086Te c1086Te = new C1086Te(str);
        c1086Te.A07(A02());
        c1086Te.A05(1);
        return c1086Te;
    }

    private JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(56, 14, 39), this.A00);
            jSONObject.put(A01(70, 13, 99), this.A02);
            jSONObject.put(A01(40, 16, 55), this.A01);
        } catch (JSONException e) {
            Log.w(A01(0, 9, 24), A01(9, 31, 21), e);
        }
        return jSONObject;
    }

    public final void A04(int i, String str) {
        C1669ge sdkContext = T7.A00();
        if (sdkContext != null) {
            sdkContext.A08().ABC(A01(83, 3, 54), i, A00(str));
        }
    }
}
