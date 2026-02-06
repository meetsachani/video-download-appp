package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import o.C10323vs;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.lL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1950lL implements InterfaceC0875Kv {
    public static byte[] A0B;
    public static String[] A0C = {"Sri33Nkjg2q1UfSTa8c1c4poMbcRpRLi", "09hX7cFAjusi8bmxYUkedKuhTIWBBFyj", "9Nq5ciBjH0E2wAdqO8kDicSSF4ASqfED", "QsWxT4gaPPGppGCvyiz5txfiFuAY8zGx", "IfMd", "WTVPPiGNk6qIrjWgxgkH9oFnGfUzUO7U", "kZSjpU6etDs1IBDvrqsQrqQjBcHBIo8z", "H6v3RmW3GvMpIK1G5kWvIHPLiCmsEM1C"};
    public static final float[] A0D;
    public long A00;
    public long A01;
    public InterfaceC0780Hd A02;
    public C0879Kz A03;
    public String A04;
    public boolean A05;
    public final C04774v A06;
    public final C0878Ky A07;
    public final L4 A08;
    public final LJ A09;
    public final boolean[] A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 69);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{66, 56, 60, 57, 88, 111, 107, 110, 111, QC1.w, C8077mf.u, 53, C3307Iz.e0, 58, 55, 50, ED2.a, 123, 58, 40, C3307Iz.c0, 62, 56, 47, 123, C3307Iz.a0, 58, 47, 50, 52, 125, 90, 66, 85, 88, 93, 80, C8077mf.x, 66, 91, 68, 107, 93, 90, 87, 70, 81, 89, 81, 90, 64, 107, 64, 93, 89, 81, 107, 70, 81, 71, 91, 88, 65, 64, 93, 91, 90, 77, 118, 112, 121, 118, 124, 116, 125, 124, 56, 110, 113, 124, 125, 119, 56, 119, 122, 114, 125, 123, 108, 56, 116, 121, 97, 125, 106, 56, 107, 112, 121, 104, 125, C3307Iz.e0, 50, ED2.a, 62, 52, 116, 54, C3307Iz.c0, 111, C3307Iz.e0, 118, 62, 40};
    }

    static {
        A02();
        A0D = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    }

    public C1950lL() {
        this(null);
    }

    public C1950lL(LJ lj) {
        this.A09 = lj;
        this.A0A = new boolean[4];
        this.A07 = new C0878Ky(128);
        this.A00 = C10323vs.b;
        if (lj != null) {
            this.A08 = new L4(178, 128);
            this.A06 = new C04774v();
            return;
        }
        this.A08 = null;
        this.A06 = null;
    }

    public static C2242qI A00(C0878Ky c0878Ky, int i, String str) {
        float f;
        byte[] copyOf = Arrays.copyOf(c0878Ky.A02, c0878Ky.A00);
        C04764u c04764u = new C04764u(copyOf);
        c04764u.A0A(i);
        c04764u.A0A(4);
        c04764u.A07();
        c04764u.A09(8);
        if (c04764u.A0H()) {
            c04764u.A09(4);
            c04764u.A09(3);
        }
        int A04 = c04764u.A04(4);
        String A01 = A01(10, 20, 30);
        String A012 = A01(0, 10, 79);
        if (A04 == 15) {
            int A042 = c04764u.A04(8);
            String[] strArr = A0C;
            if (strArr[1].charAt(10) != strArr[6].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "pNVnHJusVCsmPjFYzkWaaBxpUvIALZFH";
            strArr2[6] = "5W5bueKBkmsFSlOt61KpehVGJe26nslO";
            int A043 = c04764u.A04(8);
            if (A043 == 0) {
                AbstractC04624g.A07(A012, A01);
                f = 1.0f;
            } else {
                f = A042 / A043;
            }
        } else if (A04 < A0D.length) {
            f = A0D[A04];
        } else {
            AbstractC04624g.A07(A012, A01);
            f = 1.0f;
        }
        if (c04764u.A0H()) {
            c04764u.A09(2);
            c04764u.A09(1);
            boolean A0H = c04764u.A0H();
            if (A0C[2].charAt(24) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr3 = A0C;
            strArr3[1] = "a7iwuG0S7TsvBO2g0yc87XIFTOWCV0GN";
            strArr3[6] = "G4F0gcHQBssTN40k2zdU8kwKQEhYA5ZF";
            if (A0H) {
                c04764u.A09(15);
                c04764u.A07();
                c04764u.A09(15);
                c04764u.A07();
                c04764u.A09(15);
                c04764u.A07();
                c04764u.A09(3);
                c04764u.A09(11);
                c04764u.A07();
                c04764u.A09(15);
                c04764u.A07();
            }
        }
        if (c04764u.A04(2) != 0) {
            AbstractC04624g.A07(A012, A01(67, 34, 93));
        }
        c04764u.A07();
        int A044 = c04764u.A04(16);
        c04764u.A07();
        if (c04764u.A0H()) {
            if (A044 == 0) {
                AbstractC04624g.A07(A012, A01(30, 37, 113));
            } else {
                int i2 = 0;
                for (int i3 = A044 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                c04764u.A09(i2);
            }
        }
        c04764u.A07();
        int videoObjectLayerWidth = c04764u.A04(13);
        c04764u.A07();
        int A045 = c04764u.A04(13);
        c04764u.A07();
        c04764u.A07();
        return new C04212p().A0y(str).A11(A01(101, 13, 30)).A0r(videoObjectLayerWidth).A0f(A045).A0Y(f).A12(Collections.singletonList(copyOf)).A14();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        throw new java.lang.RuntimeException();
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5A(C04774v c04774v) {
        AbstractC04543y.A02(this.A03);
        AbstractC04543y.A02(this.A02);
        int A09 = c04774v.A09();
        int A0A = c04774v.A0A();
        byte[] A0l = c04774v.A0l();
        long j = this.A01;
        int offset = c04774v.A07();
        this.A01 = j + offset;
        InterfaceC0780Hd interfaceC0780Hd = this.A02;
        int offset2 = c04774v.A07();
        interfaceC0780Hd.AIr(c04774v, offset2);
        while (true) {
            int lengthToStartCode = HS.A04(A0l, A09, A0A, this.A0A);
            if (lengthToStartCode == A0A) {
                if (!this.A05) {
                    C0878Ky c0878Ky = this.A07;
                    int limit = A0C[7].charAt(0);
                    if (limit != 51) {
                        A0C[4] = "80MY";
                        c0878Ky.A03(A0l, A09, A0A);
                    }
                }
                this.A03.A03(A0l, A09, A0A);
                if (this.A08 != null) {
                    this.A08.A02(A0l, A09, A0A);
                    return;
                }
                return;
            }
            int offset3 = lengthToStartCode + 3;
            int startCodeValue = c04774v.A0l()[offset3] & 255;
            int i = lengthToStartCode - A09;
            if (!this.A05) {
                if (i > 0) {
                    this.A07.A03(A0l, A09, lengthToStartCode);
                }
                int limit2 = i < 0 ? -i : 0;
                if (this.A07.A04(startCodeValue, limit2)) {
                    InterfaceC0780Hd interfaceC0780Hd2 = this.A02;
                    C0878Ky c0878Ky2 = this.A07;
                    String[] strArr = A0C;
                    String str = strArr[1];
                    String str2 = strArr[6];
                    int limit3 = str.charAt(10);
                    int offset4 = str2.charAt(10);
                    if (limit3 != offset4) {
                        break;
                    }
                    String[] strArr2 = A0C;
                    strArr2[1] = "jCMcU5kX01siyiD9Xw2jZ38LNAQD3esf";
                    strArr2[6] = "NTL8nbB45bsjwa3rfW6th5wXRcuqzfwM";
                    int limit4 = this.A07.A01;
                    interfaceC0780Hd2.A6e(A00(c0878Ky2, limit4, (String) AbstractC04543y.A01(this.A04)));
                    this.A05 = true;
                }
            }
            this.A03.A03(A0l, A09, lengthToStartCode);
            if (this.A08 != null) {
                int i2 = 0;
                if (i > 0) {
                    L4 l4 = this.A08;
                    int limit5 = A0C[4].length();
                    if (limit5 != 4) {
                        break;
                    }
                    A0C[2] = "pGtfbhZ8gA4Y3zya71EFVTXhFPoVLYfI";
                    l4.A02(A0l, A09, lengthToStartCode);
                } else {
                    i2 = -i;
                }
                if (this.A08.A04(i2)) {
                    byte[] bArr = this.A08.A01;
                    int offset5 = this.A08.A00;
                    ((C04774v) C5C.A0f(this.A06)).A0j(this.A08.A01, HS.A02(bArr, offset5));
                    ((LJ) C5C.A0f(this.A09)).A02(this.A00, this.A06);
                }
                if (startCodeValue == 178) {
                    int offset6 = lengthToStartCode + 2;
                    if (c04774v.A0l()[offset6] == 1) {
                        this.A08.A01(startCodeValue);
                    }
                }
            }
            int i3 = A0A - lengthToStartCode;
            this.A03.A02(this.A01 - i3, i3, this.A05);
            this.A03.A01(startCodeValue, this.A00);
            A09 = lengthToStartCode + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void A5c(HA ha, LG lg) {
        lg.A05();
        this.A04 = lg.A04();
        this.A02 = ha.AKS(lg.A03(), 2);
        this.A03 = new C0879Kz(this.A02);
        if (this.A09 != null) {
            this.A09.A03(ha, lg);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGq(long j, int i) {
        if (j != C10323vs.b) {
            this.A00 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AJ5() {
        HS.A0H(this.A0A);
        this.A07.A02();
        if (this.A03 != null) {
            this.A03.A00();
        }
        if (this.A08 != null) {
            this.A08.A00();
        }
        if (A0C[4].length() != 4) {
            throw new RuntimeException();
        }
        A0C[2] = "KHBnxT5PT6gCJIZCrRbgphkbFp7MF5Ts";
        this.A01 = 0L;
        this.A00 = C10323vs.b;
    }
}
