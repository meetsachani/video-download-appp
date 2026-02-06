package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.S92;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1335bE implements InterfaceC0900Lu {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, C2638Cg0.n7, -47, -47, -56, C2638Cg0.A7, -99, -125, C2638Cg0.E7, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, C2638Cg0.x7, -60, -60, -69, C2638Cg0.q7, -75, C2638Cg0.q7, C2638Cg0.s7, -67, -67, -69, -70, C2638Cg0.t7, -43, C2638Cg0.z7, C2638Cg0.z7, C2638Cg0.s7, -52, -65, -52, C2638Cg0.A7, C2638Cg0.u7, C2638Cg0.u7, C2638Cg0.v7, C2638Cg0.z7, C2638Cg0.u7, -65, C2638Cg0.y7, C2638Cg0.A7, -60, C2638Cg0.s7};
    }

    public C1335bE(T8 t8) {
        this.A00 = t8;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z, int i2) {
        C1086Te c1086Te = new C1086Te(A00(4, 6, 44));
        c1086Te.A07(jSONObject);
        c1086Te.A05(1);
        c1086Te.A09(z);
        c1086Te.A04(i2);
        try {
            jSONObject.put(A00(33, 13, 62), TX.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i2);
        } catch (JSONException unused2) {
        }
        this.A00.A08().ABD(A00(27, 6, 13), i + S92.y, c1086Te);
        if (this.A00.A05().AAO()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i + A00(1, 3, 118) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC0902Lw enumC0902Lw) {
        for (EnumC0902Lw enumC0902Lw2 : ZJ.A06) {
            if (enumC0902Lw2.equals(enumC0902Lw)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0900Lu
    public final void ABE(EnumC0902Lw enumC0902Lw, JSONObject jSONObject, int i) {
        A02(enumC0902Lw.A03(), enumC0902Lw.toString(), jSONObject, A03(enumC0902Lw), i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0900Lu
    public final void ABs(int i, JSONObject jSONObject, int i2) {
        A02(i, A00(18, 9, 111) + i, jSONObject, false, i2);
    }
}
