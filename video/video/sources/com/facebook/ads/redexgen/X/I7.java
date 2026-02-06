package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class I7 extends AbstractRunnableC1160Wc {
    public static byte[] A02;
    public static String[] A03 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ C5S A00;
    public final /* synthetic */ C4A A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{51, 4, C8077mf.A, C8077mf.A, C8077mf.x, 3, C8077mf.B, 31, C8077mf.z, 81, C8077mf.B, 31, C8077mf.y, C8077mf.x, C8077mf.A, C8077mf.B, 31, C8077mf.B, 5, C8077mf.x, C8077mf.G, 8};
    }

    static {
        A01();
    }

    public I7(C5S c5s, C4A c4a) {
        this.A00 = c5s;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C0710Ek c0710Ek;
        C0710Ek c0710Ek2;
        c0710Ek = this.A00.A0S;
        if (c0710Ek.getState() == EnumC1615fm.A02) {
            c0710Ek2 = this.A00.A0S;
            int currentPositionInMillis = c0710Ek2.getCurrentPositionInMillis();
            if (A03[2].length() != 8) {
                throw new RuntimeException();
            }
            A03[7] = "iv52OwD8pgB4ao6bV3eWAeQD9PjHFRbz";
            if (currentPositionInMillis == A00()) {
                this.A00.A0S(A00(0, 22, 57));
            }
        }
    }
}
