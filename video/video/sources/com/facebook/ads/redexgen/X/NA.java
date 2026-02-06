package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;
import o.C8077mf;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class NA extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC1878k8 A00;
    public N9 A01;
    public C1673gi A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{QC1.w, 66, 78, 76, C8077mf.q, 71, 64, 66, 68, 67, 78, 78, 74, C8077mf.q, 64, 69, 82, C8077mf.q, 67, 64, 79, 79, 68, 83, C8077mf.q, 66, 77, 72, 66, 74, 68, 69};
    }

    public NA(C1673gi c1673gi, String str, InterfaceC1878k8 interfaceC1878k8, N9 n9) {
        this.A02 = c1673gi;
        this.A03 = str;
        this.A01 = n9;
        this.A00 = interfaceC1878k8;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        P2.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        P2.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ADC(this.A00);
        }
    }
}
