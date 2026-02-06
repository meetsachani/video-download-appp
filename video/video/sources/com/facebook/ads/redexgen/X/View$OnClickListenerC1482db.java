package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.db  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1482db implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass55 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{115, 104, 104, 107, 101, 102, 117};
    }

    public View$OnClickListenerC1482db(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC1493dm interfaceC1493dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0D;
            if (!z) {
                this.A00.A0t(A00(0, 7, 8));
                interfaceC1493dm = this.A00.A0Z;
                interfaceC1493dm.ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
