package com.facebook.ads.redexgen.X;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.qC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2236qC implements AnonymousClass24 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C2236qC A06 = new C04272v().A0A();
    public static final AnonymousClass23<AW> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.facebook.ads.redexgen.X.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            AW A0B;
            A0B = new C04272v().A06(bundle.getLong(C2236qC.A01(0), 0L)).A05(bundle.getLong(C2236qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C2236qC.A01(2), false)).A07(bundle.getBoolean(C2236qC.A01(3), false)).A09(bundle.getBoolean(C2236qC.A01(4), false)).A0B();
            return A0B;
        }
    };

    public C2236qC(C04272v c04272v) {
        this.A01 = C04272v.A00(c04272v);
        this.A00 = C04272v.A01(c04272v);
        this.A03 = C04272v.A02(c04272v);
        this.A02 = C04272v.A03(c04272v);
        this.A04 = C04272v.A04(c04272v);
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2236qC) {
            C2236qC c2236qC = (C2236qC) obj;
            return this.A01 == c2236qC.A01 && this.A00 == c2236qC.A00 && this.A03 == c2236qC.A03 && this.A02 == c2236qC.A02 && this.A04 == c2236qC.A04;
        }
        return false;
    }

    public final int hashCode() {
        int result = ((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31;
        int result2 = this.A03 ? 1 : 0;
        int result3 = this.A04 ? 1 : 0;
        return ((((result + result2) * 31) + (this.A02 ? 1 : 0)) * 31) + result3;
    }
}
