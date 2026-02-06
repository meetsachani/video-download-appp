package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.cx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1442cx implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass67 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{36, C8077mf.A, C8077mf.u, 19, C8077mf.G};
    }

    public View$OnClickListenerC1442cx(AnonymousClass67 anonymousClass67) {
        this.A00 = anonymousClass67;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
