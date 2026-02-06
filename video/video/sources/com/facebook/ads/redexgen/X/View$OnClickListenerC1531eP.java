package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.eP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1531eP implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1534eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, C8077mf.q, 5, 2, 0, 19, 5, C8077mf.u};
    }

    public View$OnClickListenerC1531eP(C1534eS c1534eS) {
        this.A00 = c1534eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr;
        View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            view$OnClickListenerC0871Kr = this.A00.A0l;
            if (view$OnClickListenerC0871Kr == null) {
                return;
            }
            view$OnClickListenerC0871Kr2 = this.A00.A0l;
            view$OnClickListenerC0871Kr2.A0E(A00(0, 8, 44));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
