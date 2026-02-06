package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public class I1 implements InterfaceC1311aq {
    public static byte[] A01;
    public static String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ C5F A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 99);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.y, 19, 5, C8077mf.u, ED2.a, C8077mf.p, 1, C8077mf.z, 9, 7, 1, C8077mf.x, 9, C8077mf.q, C8077mf.p, ED2.a, 9, 1, 2};
    }

    static {
        A01();
    }

    public I1(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AF7(String str) {
        C1302ah c1302ah;
        C1302ah c1302ah2;
        this.A00.A0Q = false;
        c1302ah = this.A00.A0F;
        c1302ah.setProgress(100);
        c1302ah2 = this.A00.A0F;
        YB.A0O(c1302ah2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AF9(String str) {
        C1302ah c1302ah;
        M6 m6;
        boolean z;
        int i;
        this.A00.A0Q = true;
        c1302ah = this.A00.A0F;
        YB.A0O(c1302ah, 0);
        m6 = this.A00.A0E;
        m6.setUrl(str);
        z = this.A00.A0P;
        if (!z) {
            C5F c5f = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            i = c5f.A02;
            if (i > 1) {
                this.A00.A0P = true;
                this.A00.A0i(A00(0, 19, 3));
            }
        }
        C5F.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AFY(int i) {
        boolean z;
        C1302ah c1302ah;
        z = this.A00.A0Q;
        if (z) {
            c1302ah = this.A00.A0F;
            c1302ah.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AFb(String str) {
        M6 m6;
        m6 = this.A00.A0E;
        m6.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AFe() {
        ((AbstractC0812Ij) this.A00).A0B.ADJ(14);
    }
}
