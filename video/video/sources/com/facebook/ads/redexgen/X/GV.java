package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class GV extends AbstractRunnableC1160Wc {
    public static byte[] A01;
    public static String[] A02 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C4V A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
            if (A02[5].length() != 5) {
                throw new RuntimeException();
            }
            A02[2] = "VyWbJGKy3Ebs7lO";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 1, C8077mf.n, 13, 7, 72, 6, 13, C8077mf.H, 13, C8077mf.D, 72, C8077mf.E, 28, 9, C8077mf.D, 28, 13, C8077mf.n, 72, C8077mf.B, 4, 9, 17, 1, 6, C8077mf.q};
    }

    static {
        A01();
    }

    public GV(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        boolean z;
        z = this.A00.A0F;
        if (!z) {
            this.A00.A0Q(A00(0, 27, 102));
        }
    }
}
