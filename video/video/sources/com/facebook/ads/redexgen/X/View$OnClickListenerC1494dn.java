package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;

/* renamed from: com.facebook.ads.redexgen.X.dn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1494dn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C04794x A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C3307Iz.Z, 42, C3307Iz.f0, C3307Iz.c0, 42, C4715Xk.i};
    }

    public View$OnClickListenerC1494dn(C04794x c04794x) {
        this.A00 = c04794x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1386c3 abstractC1386c3;
        AbstractC1386c3 abstractC1386c32;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1386c3 = this.A00.A00;
            if (abstractC1386c3 != null) {
                abstractC1386c32 = this.A00.A00;
                abstractC1386c32.A1B(A00(0, 6, 53));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
