package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.QC1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ti  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1090Ti {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{C8077mf.A, 52, 60, 60, 50, 53, 60, 123, C8077mf.y, 62, 47, C3307Iz.d0, 52, C3307Iz.a0, 48, 123, C8077mf.H, C3307Iz.e0, 62, 53, 47, 34, 51, 52, C3307Iz.Z, 50, 47, C3307Iz.a0, 40, 96, 119, 119, 106, 119, 32, 60, 60, 56, C8077mf.A, 59, 60, C3307Iz.a0, 60, C4715Xk.i, 59, C8077mf.A, C3307Iz.c0, C3307Iz.Z, C3307Iz.d0, C3307Iz.e0, 98, 105, QC1.w, 123, 99, 126, 103, C3307Iz.a0, 56, 32, 53, 54, 56, C4715Xk.i, 6, 42, 48, 35, 60, 55, 48, C3307Iz.X, 54, 48, C8077mf.E, 48, C3307Iz.e0, C3307Iz.a0, C3307Iz.V, 40, C3307Iz.e0, 49, 50, 60, 57, 2, C3307Iz.f0, 52, C3307Iz.Z, 56};
    }

    public static JSONObject A01(T8 t8, long j, long j2, long j3, long j4, int i, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j);
                try {
                    jSONObject.put(A00(21, 8, 54), j2 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j3);
                        try {
                            jSONObject.put(A00(79, 11, 45), j4);
                            try {
                                jSONObject.put(A00(34, 16, 56), i);
                                if (exc != null) {
                                    jSONObject.put(A00(29, 5, 117), exc.getMessage());
                                }
                            } catch (JSONException e) {
                                e = e;
                                t8.A08().A4I(e);
                                return jSONObject;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                    }
                } catch (JSONException e4) {
                    e = e4;
                }
            } catch (JSONException e5) {
                e = e5;
            }
        } catch (JSONException e6) {
            e = e6;
        }
        return jSONObject;
    }

    public static void A03(T8 t8, long j, long j2, long j3, long j4, int i, Exception exc) {
        C1086Te c1086Te = new C1086Te(A00(0, 21, 43));
        c1086Te.A05(1);
        c1086Te.A07(A01(t8, j, j2, j3, j4, i, exc));
        t8.A08().ACA(A00(50, 7, 124), AbstractC1085Td.A20, c1086Te);
    }
}
