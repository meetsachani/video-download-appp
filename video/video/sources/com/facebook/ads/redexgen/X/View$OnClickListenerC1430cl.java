package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.cl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1430cl implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0836Ji A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.u, C8077mf.A, C8077mf.A, C8077mf.z, 7, C8077mf.u, C8077mf.D, 31, 0};
    }

    public View$OnClickListenerC1430cl(C0836Ji c0836Ji) {
        this.A00 = c0836Ji;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1390c7 c1390c7;
        C1390c7 c1390c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0p(A00(0, 9, 105));
            c1390c7 = this.A00.A0b;
            if (c1390c7.A0D() != null) {
                c1390c72 = this.A00.A0b;
                c1390c72.A0D().ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
