package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.eQ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1532eQ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1534eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.C, C8077mf.z, C8077mf.u, C8077mf.y, C8077mf.z, 35};
    }

    public View$OnClickListenerC1532eQ(C1534eS c1534eS) {
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
            view$OnClickListenerC0871Kr2.A0E(A00(0, 6, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
