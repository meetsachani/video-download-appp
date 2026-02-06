package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.cS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1411cS implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ KE A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C3307Iz.Z, 34, 34, 35, 50, C3307Iz.Z, 47, 42, 53};
    }

    public View$OnClickListenerC1411cS(KE ke) {
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
                c1422cd.A02(A00(0, 9, 108));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
