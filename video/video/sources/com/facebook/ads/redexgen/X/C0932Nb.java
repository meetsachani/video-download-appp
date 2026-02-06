package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0932Nb implements Serializable {
    public static byte[] A03 = null;
    public static final long serialVersionUID = 6010729991575063286L;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{C8077mf.C, C8077mf.z, C8077mf.D, C8077mf.B, C8077mf.C, C3307Iz.X, 89, 86, 80, 2, -12, -17, -1, -13};
    }

    public C0932Nb(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public static C0932Nb A00(JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString(A01(6, 3, 111))) == null) {
            return null;
        }
        return new C0932Nb(optString, jSONObject.optInt(A01(9, 5, 22), 0), jSONObject.optInt(A01(0, 6, 60), 0));
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }
}
