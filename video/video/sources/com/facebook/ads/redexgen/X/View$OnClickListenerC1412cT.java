package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.cT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1412cT implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ KE A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C2638Cg0.t7, C2638Cg0.p7, C2638Cg0.p7, -66, -76, -77, -60};
    }

    public View$OnClickListenerC1412cT(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C1422cd c1422cd;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0M;
            if (!z) {
                c1422cd = this.A00.A0K;
                c1422cd.A02(A00(0, 7, 17));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
