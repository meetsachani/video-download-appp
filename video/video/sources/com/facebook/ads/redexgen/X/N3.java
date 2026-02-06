package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class N3 {
    public static byte[] A04;
    public boolean A00;
    @Nullable
    public final N4 A01;
    public final C1673gi A02;
    public final C1618fp A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, C3307Iz.X, C3307Iz.Z, C8077mf.D, 40, 40, C8077mf.H, 36, 35, -43, C3307Iz.V, 36, 28, 28, C8077mf.D, C8077mf.C};
    }

    public abstract void A08(Map<String, String> map);

    public N3(C1673gi c1673gi, N4 n4, C1618fp c1618fp) {
        this.A02 = c1673gi;
        this.A01 = n4;
        this.A03 = c1618fp;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new C1330b9().A03(this.A03).A05();
        A08(extraData);
        this.A00 = true;
        XI.A04(this.A02, A00(0, 17, 60));
        N4 n4 = this.A01;
    }
}
