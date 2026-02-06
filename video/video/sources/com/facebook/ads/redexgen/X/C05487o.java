package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import o.ED2;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05487o extends AbstractC1847jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{ED2.a, 60, 51, 51, 56, 47};
    }

    public C05487o(List<NR> list) {
        super(list);
    }

    public static C05487o A00(JSONObject jSONObject, C1673gi c1673gi) {
        C05487o c05487o = new C05487o(AbstractC1847jd.A08(jSONObject, c1673gi, new C1845jb()));
        c05487o.A2I(jSONObject);
        c05487o.A1N(A01(0, 6, 6));
        return c05487o;
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final int A0o() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final int A0p() {
        return 0;
    }
}
