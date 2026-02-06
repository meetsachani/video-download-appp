package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class JJ implements InterfaceC1456dB {
    public static byte[] A01;
    public static String[] A02 = {"j0Llx0J1MSgFmdDCajgZS", "WqPPZqRc0dX4AocYH9RDHKNy8FKfctFv", "x4SSjhhb9i0sKdnf0Wf5s", "xtX3gCAokrJDAeXWoUYA8plxhmXwCeOm", "uRKBJqZuIeGTpbClJ99Pe9ZmQekDyja2", "rD1ESZhEMARN2moY0NiI8P2eIcx2KKt8", "vMF11DxP2anc735da3YXnRmNGLge", "xeUiMncNmqcgkFgn7eafy8FxNu3C"};
    public final /* synthetic */ AnonymousClass62 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "mcgN6rOfJkIrJEn9BPtko0s6E0JP";
            strArr2[7] = "7NujJgKdrQLNFT4Mmbwt8V3uSlrM";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, C3307Iz.f0, 88, C8077mf.E, 10, C8077mf.C, C8077mf.m, C8077mf.r, C8077mf.G, 28, 28, C8077mf.p, 9, 52, C8077mf.G, 2, C8077mf.p, 28};
    }

    static {
        A01();
    }

    public JJ(AnonymousClass62 anonymousClass62) {
        this.A00 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1456dB
    public final void AFU() {
        C1669ge context = T7.A00();
        if (context != null) {
            context.A08().ABC(A00(10, 8, 127), AbstractC1085Td.A2g, new C1086Te(A00(0, 10, 108)));
        }
    }
}
