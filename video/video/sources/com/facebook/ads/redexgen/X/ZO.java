package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class ZO implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"Rngvbb3vMR3b56rBexb50Rjom5JamLMR", "BOyMrOLOVyOlAA7tdLfD", "PSvH7Ca0GqwbJXrw1OxZU20X4aHcam0S", "dzm7VVMnrqblx5opBv2tkfICkL24O513", "rKXY71", "THxRt8Yss0BlXBXFFRIVlNUaizFLAmop", "EnNQl89tpWVbcex4LtQ2YfadlOVOSM9k", "1aWdi1c8aZwiTk2zvtk8Xc2vTbtrER0G"};
    public final /* synthetic */ MI A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{0, C8077mf.y, 2, C8077mf.z, 31, 2, C8077mf.G, 51, 4, 17, 51, 28, C8077mf.C, 19, C8077mf.E};
    }

    static {
        A01();
    }

    public ZO(MI mi) {
        this.A00 = mi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1214Yh interfaceC1214Yh;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1214Yh = this.A00.A06;
            interfaceC1214Yh.A4j(A00(0, 15, 86));
        } catch (Throwable th) {
            WU.A00(th, this);
            String[] strArr = A02;
            if (strArr[7].charAt(31) == strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "qnEa0qqxoU4sFli1HS9Y3SbmuU3eBkbM";
            strArr2[0] = "NnijgEsxsjK8xKe1vFUOE7dsdCVZHTLh";
        }
    }
}
