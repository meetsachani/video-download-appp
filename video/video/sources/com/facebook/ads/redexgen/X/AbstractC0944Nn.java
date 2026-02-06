package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.C9680tD0;
import o.ED2;
import o.FF0;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0944Nn {
    public static byte[] A00;

    static {
        A0H();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A0H() {
        A00 = new byte[]{C8077mf.q, 56, 59, ED2.a, 49, -20, 13, 48, 57, 101, 100, 106, 95, 100, 107, 91, C8077mf.z, 77, 87, 106, 89, 94, 95, 100, 93, 1, C3307Iz.e0, C3307Iz.d0, 50, C3307Iz.Z, C3307Iz.d0, 51, 35, -34, C3307Iz.Z, C3307Iz.d0, -34, C8077mf.C, 49, 35, C3307Iz.V, 49, C8077mf.E, -34, 50, C3307Iz.e0, -34, C8077mf.C, 31, C3307Iz.f0, C3307Iz.f0, C8077mf.E, 0, C3307Iz.d0, C3307Iz.c0, 49, C3307Iz.Y, C3307Iz.c0, 50, 34, -35, 49, C3307Iz.d0, -35, C8077mf.B, C8077mf.H, C3307Iz.e0, C3307Iz.e0, C8077mf.D, C2638Cg0.n7, 4, 3, 9, -2, 3, 10, -6, -75, C8077mf.n, -10, 9, -8, -3, -2, 3, -4, -75, 9, 4, -75, 7, -6, -8, -6, -2, C8077mf.m, -6, -75, -10, 3, -75, -2, 3, C2638Cg0.q7, -4, -10, 2, -6, -75, 7, -6, C8077mf.n, -10, 7, -7, -65, -21, -22, -16, -27, -22, -15, C2638Cg0.C7, -100, -13, -35, -16, -33, -28, -27, -22, -29, -100, -16, -21, -100, -18, C2638Cg0.C7, -33, C2638Cg0.C7, -27, -14, C2638Cg0.C7, -100, -9, -19, -15, -35, -22, -16, -27, -16, -11, -7, -9, -33, -15, -18, -18, C2638Cg0.C7, -22, -33, -11, -7, -42, -9, -20, -11, -16, -11, -18, -89, -16, -11, -89, -30, -6, -20, -22, -6, -28, -6, 40, 73, 62, 71, 66, 71, 64, -7, 66, 71, 7, 7, 7, -24, -5, 13, -9, 8, -6, -74, -1, 4, -74, -15, 9, -5, -7, 9, -13, 9, C8077mf.D, 50, 48, 55, 68, 92, 90, 97, 17, 82, 85, C8077mf.q, C3307Iz.Z, C3307Iz.X, C3307Iz.d0, -36, C8077mf.G, 32, -36, C3307Iz.X, 42, -36, C8077mf.A, 47, C3307Iz.V, 31, 47, C8077mf.C, C3307Iz.a0, 70, 69, 68, 73, 69, 72, 59, 58, C3307Iz.e0, 65, 64, 59, 47, 56, 53, 47, 55, C3307Iz.c0, 53, 58, C3307Iz.c0, 68, 4, C8077mf.B, C8077mf.A, C8077mf.u, 6, C8077mf.q, C8077mf.n, 6, C8077mf.p, 2, C8077mf.u, 19, 8, 17, C8077mf.n, 17, 10, 65, 74, 77, 81, 67, C4715Xk.i, ED2.a, 66, -23, -11, -12, -6, -17, -12, -5, -21, -27, -6, -11, -27, -25, -10, -10, C2638Cg0.C7, -19, -20, -14, -25, -20, -13, -29, -35, -14, -19, -35, -33, -18, -18, -35, -25, -20, -35, -10, C8077mf.p, C8077mf.D, C8077mf.C, 31, C8077mf.x, C8077mf.C, 32, C8077mf.r, 10, 34, C8077mf.n, 31, C8077mf.p, 19, C8077mf.x, C8077mf.C, C8077mf.u, 32, C3307Iz.d0, C3307Iz.c0, 49, C3307Iz.Y, C3307Iz.c0, 50, 34, 28, 52, C8077mf.H, 49, 32, C3307Iz.X, C3307Iz.Y, C3307Iz.c0, 36, 28, 35, C3307Iz.d0, 47, 28, 47, 34, 52, C8077mf.H, 47, C3307Iz.V, 95, 93, 102, 93, 106, 97, 91, 87, 106, 93, 111, 89, 106, 92, 17, C8077mf.q, C8077mf.B, C8077mf.q, 28, 19, 13, 9, C8077mf.H, C8077mf.q, 34, C8077mf.H, -8, -2, -18, -23, -13, -19, -7, -8, -23, -3, -2, 3, -10, -17, 88, 94, 78, 73, 94, 79, 98, 94, 98, 85, 103, 81, 98, 84, 79, 89, 94, 79, 104, 1, -7, -9, -2, -6, -14, -16, -9, -26, -24, -21, 68, 60, 58, 65, 48, 58, ED2.a, 48, 73, C3307Iz.d0, C3307Iz.a0, 40, C3307Iz.Z, C3307Iz.d0, 40, C3307Iz.c0, C8077mf.H, C8077mf.G};
    }

    public static C0940Nj A00(JSONObject jSONObject) {
        return new C0939Ni().A06(A0A(jSONObject)).A07(A09(jSONObject)).A05(A0B(jSONObject)).A04(A06(jSONObject)).A08();
    }

    public static C0949Ns A01(JSONObject jSONObject) {
        return new C0948Nr().A0F(A0D(jSONObject)).A0J(A0G(jSONObject)).A0I(A0F(jSONObject)).A0H(A0E(jSONObject)).A0E(A08(jSONObject)).A0D(A07(jSONObject)).A0A(jSONObject.optInt(A02(394, 14, 17), 0)).A0G(A0C(jSONObject)).A0C(A05(jSONObject)).A0B(A04(jSONObject)).A0K();
    }

    public static String A03(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(240, 9, 93);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(447, 9, 64), A02);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(164, 18, 14);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(C9680tD0.j, 14, 83), A02);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(FF0.q, 13, 96);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(263, 17, 42), A02);
    }

    public static String A06(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(0, 8, 83);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(280, 8, 101), A02);
    }

    public static String A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(25, 27, 69);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(303, 20, 5), A02);
    }

    public static String A08(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(52, 17, 68);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(288, 15, 13), A02);
    }

    public static String A09(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(115, 49, 3);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(340, 28, 68), A02);
    }

    public static String A0A(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(69, 46, 28);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(368, 14, 127), A02);
    }

    public static String A0B(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(8, 17, 125);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(323, 17, 50), A02);
    }

    public static String A0C(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(0, 0, 60);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(408, 8, 113), A02);
    }

    public static String A0D(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(195, 17, 29);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(416, 11, 119), A02);
    }

    public static String A0E(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(223, 17, 67);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(438, 9, 88), A02);
    }

    public static String A0F(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(216, 7, 120);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(431, 7, 14), A02);
    }

    public static String A0G(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String A02 = A02(212, 4, 78);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(427, 4, 21), A02);
    }
}
