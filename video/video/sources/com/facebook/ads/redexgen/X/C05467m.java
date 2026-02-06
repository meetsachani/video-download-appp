package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import o.C3307Iz;
import o.ED2;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7m  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05467m extends AbstractC1847jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{52, 59, C3307Iz.f0, 51, C3307Iz.d0, ED2.a};
    }

    public C05467m(List<NR> list) {
        super(list);
    }

    public static C05467m A00(JSONObject jSONObject, C1673gi c1673gi) {
        C05467m c05467m = new C05467m(AbstractC1847jd.A08(jSONObject, c1673gi, new C1837jR()));
        c05467m.A2I(jSONObject);
        c05467m.A1N(A01(0, 6, 107));
        return c05467m;
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
