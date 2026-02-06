package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1461dG implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C1464dJ A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{13, C3307Iz.V, 59, 34, 42, 110, 32, C3307Iz.V, 58, 110, 62, 47, 60, C4715Xk.i, C3307Iz.c0, 110, C4715Xk.i, C3307Iz.c0, 60, 56, C3307Iz.c0, 60, 110, 35, C3307Iz.c0, C4715Xk.i, C4715Xk.i, 47, C3307Iz.a0, C3307Iz.c0, 72, Byte.MAX_VALUE, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, C3307Iz.e0, 125, 108, Byte.MAX_VALUE, 126, 100, 99, 106, C3307Iz.e0, 71, 94, 66, 67, C3307Iz.e0, 100, 99, C3307Iz.e0, 125, 98, 126, 121, 64, 104, 126, 126, 108, 106, 104, C3307Iz.e0, 87, 67, 66, 94, 125, 83, 79, 53, 40, 36, 34, 49, C8077mf.q, 52, 49, 36, 49, C8077mf.p, 3, 10, 31, 58, 60};
    }

    public RunnableC1461dG(C1464dJ c1464dJ, String str) {
        this.A00 = c1464dJ;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1444cz c1444cz;
        String str;
        C1444cz c1444cz2;
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(EnumC1462dH.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                    return;
                }
                c1444cz2 = this.A00.A04;
                c1444cz2.A04(AbstractC1085Td.A11, A00(0, 30, 47));
            } catch (JSONException e) {
                c1444cz = this.A00.A04;
                c1444cz.A04(AbstractC1085Td.A15, A00(30, 34, 108) + e.getMessage());
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
