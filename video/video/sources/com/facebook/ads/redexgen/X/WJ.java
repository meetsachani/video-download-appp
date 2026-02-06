package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class WJ implements InterfaceC1625fw {
    public static byte[] A01;
    public static String[] A02 = {"Pvxnryfp5C2YJ", "58Tt8xWVSP1vJRxeZG7By0J4DHdpZFgc", "d8fJjrUVSDGdkyzleHZclvn63G4sHX0L", "2vkexQ2kDfwHm", "C5INcofoFkRix0Rm4DG2QIlt8jox4BBj", "", "Y25u3HoHlGlpJYy8Y", "MTcvQGxX9nLrxfee4M1dH5SKsx5IsifC"};
    public final /* synthetic */ T8 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "YNZl3vrESdm0ZjqRAgqNuDMkNkDkDjcM";
            strArr[2] = "T4MR0Bp8ShJAOBNGhRUi97nIryoGWHBS";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.D, 56, 55, 126, C3307Iz.e0, 121, C4715Xk.i, 48, 42, C3307Iz.a0, 56, C3307Iz.e0, 58, 49, 121, 58, 54, C3307Iz.d0, 55, C3307Iz.e0, 60, C3307Iz.c0, 42, 119, 77, 96, 122, 121, 104, 125, 106, 97, 108, 109, C3307Iz.a0, 106, 102, 124, 103, 125, 108, 123, 122, C3307Iz.Z, C3307Iz.a0, 91, 108, 122, 121, 102, 103, 122, 108, 51, C3307Iz.a0};
    }

    static {
        A01();
    }

    public WJ(T8 t8) {
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1625fw
    public final void ADR(InterfaceC1623fu interfaceC1623fu) {
        if (this.A00.A05().AAO() && interfaceC1623fu != null) {
            String str = A00(24, 31, 44) + interfaceC1623fu.A73();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1625fw
    public final void ADq(Exception exc) {
        String str;
        if (this.A00.A05().AAO()) {
            str = VL.A01;
            Log.e(str, A00(0, 24, 124), exc);
        }
    }
}
