package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public final class NH extends BroadcastReceiver {
    public static byte[] A04;
    public static String[] A05 = {"Y8Z1", "Gib9", "71bezSKIJxKufdL13ppDGQvN3l", "amgHka60jBO0VGEiDWjvaQpooGEX1vUM", "ttT0jofZ4zWB5Dwx3mPNIXc", "eyh0I6c0vYFaGMFwnoeMEbyGHh2pIYmK", "GRZnv0m", "VfIH6aQ48NmkLcOtEQWPZe5uGeHooIii"};
    public C1864ju A00;
    public NG A01;
    public C1673gi A02;
    public String A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-12, C2638Cg0.t7, -46, -48, -111, C2638Cg0.v7, -60, C2638Cg0.t7, -56, C2638Cg0.s7, -46, -46, C2638Cg0.z7, -111, -60, C2638Cg0.u7, -42, -111, -47, -60, -41, -52, C2638Cg0.E7, -56, -111, -60, C2638Cg0.u7, C2638Cg0.q7, C2638Cg0.t7, C2638Cg0.A7, -52, C2638Cg0.t7, C2638Cg0.z7};
    }

    static {
        A01();
    }

    public NH(C1673gi c1673gi, String str, C1864ju c1864ju, NG ng) {
        this.A02 = c1673gi;
        this.A03 = str;
        this.A01 = ng;
        this.A00 = c1864ju;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 32, 35) + A00(0, 1, 122) + this.A03);
        P2.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        P2.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 122);
        String[] split = action.split(intentAction);
        if (split.length >= 1 && (str = split[0]) != null) {
            String[] strArr = A05;
            String str2 = strArr[0];
            String intentAction2 = strArr[1];
            if (str2.length() != intentAction2.length()) {
                throw new RuntimeException();
            }
            A05[7] = "UAhxU8HTiJONxaKo3zNJYg3uL8StvHDr";
            String intentAction3 = A00(1, 32, 35);
            if (intentAction3.equals(str)) {
                NG ng = this.A01;
                C1864ju c1864ju = this.A00;
                String[] strArr2 = A05;
                String str3 = strArr2[0];
                String intentAction4 = strArr2[1];
                if (str3.length() != intentAction4.length()) {
                    throw new RuntimeException();
                }
                A05[6] = "";
                ng.AEv(c1864ju);
            }
        }
    }
}
