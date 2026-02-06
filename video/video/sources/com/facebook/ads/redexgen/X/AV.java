package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;
import o.C4715Xk;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class AV extends AbstractC2217pt {
    public static byte[] A01;
    public static final AnonymousClass23<AV> A02;
    public static final String A03;
    public final float A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{C8077mf.z, 3, C8077mf.x, 5, 3, 8, C8077mf.u, 70, C8077mf.m, 19, C8077mf.y, C8077mf.u, 70, 4, 3, 70, C8077mf.q, 8, 70, C8077mf.u, C8077mf.p, 3, 70, C8077mf.x, 7, 8, 1, 3, 70, 9, 0, 70, C4715Xk.i, 86, 74, 70, 87, 86, 86, 59};
    }

    static {
        A03();
        A03 = C5C.A0h(1);
        A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.q1
            @Override // com.facebook.ads.redexgen.X.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                AV A00;
                A00 = AV.A00(bundle);
                return A00;
            }
        };
    }

    public AV() {
        this.A00 = -1.0f;
    }

    public AV(float f) {
        AbstractC04543y.A09(f >= 0.0f && f <= 100.0f, A02(0, 40, 45));
        this.A00 = f;
    }

    public static AV A00(Bundle bundle) {
        AbstractC04543y.A07(bundle.getInt(AbstractC2217pt.A02, -1) == 1);
        float f = bundle.getFloat(A03, -1.0f);
        return f == -1.0f ? new AV() : new AV(f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AV) && this.A00 == ((AV) obj).A00;
    }

    public final int hashCode() {
        return CB.A00(Float.valueOf(this.A00));
    }
}
