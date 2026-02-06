package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.dS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1473dS implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"aSVeS7GSTPGzGlwxFERzGOUaCHJkzI2z", "LLGylRAhThVIhIHAbih9tPBDCPjYJ3wk", "dAcv7uC7M3KkKHminzJu7oFLvmyzwOeo", "9GvayoE6VvkK0xgQDuyzQgqlx5rjdrnu", "wDDK", "nNoIeo5hKMcMuIwTTSmTqlLWYr2HGCGs", "Kjjrp4DquliSLC6MHV0dGTx7o2b6nbq3", "WO7dkLjdWbLrsRFVrNnfWInSuw6lOMDM"};
    public final /* synthetic */ C5F A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[0].charAt(19) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "ZS6NMOZ5iivoiIhrEAHYVVuLQariJbL8";
            strArr[5] = "6wgrAttfPWhTSI4WoHgDbqlH426fwJ7f";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 70);
            i4++;
        }
    }

    public static void A01() {
        byte[] bArr = {C2638Cg0.w7, C2638Cg0.s7, C2638Cg0.s7, C2638Cg0.q7, -72, -73, -56};
        if (A02[0].charAt(19) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "vsVzmfSe1AoNrvloOTDnivjLsCV7rctR";
        strArr[7] = "zSqcVhdNlZdzdn2RltwvtxLuLIPpuSoH";
        A01 = bArr;
    }

    static {
        A01();
    }

    public View$OnClickListenerC1473dS(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C1422cd c1422cd;
        InterfaceC1493dm interfaceC1493dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (!z) {
                c1422cd = this.A00.A0H;
                c1422cd.A02(A00(0, 7, 16));
                interfaceC1493dm = this.A00.A0Z;
                interfaceC1493dm.ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
