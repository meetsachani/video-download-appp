package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public class R1 implements InterfaceC1166Wi {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-100, -104, -105, C2638Cg0.x7, -70, -65, -69, -60, -71, -69, -92, -69, C2638Cg0.w7, C2638Cg0.y7, C2638Cg0.s7, -56, C2638Cg0.p7, -48, -23, -26, -23, -22, -14, -23, -101, -32, -13, -34, -32, -21, -17, -28, -22, -23, -87};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1166Wi
    public final void AAx(int i, Throwable th) {
        Log.e(A00(0, 17, 58), A00(17, 18, 95), th);
    }
}
