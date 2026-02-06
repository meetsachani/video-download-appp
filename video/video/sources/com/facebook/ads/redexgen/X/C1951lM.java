package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import o.C10323vs;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.lM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1951lM implements InterfaceC0875Kv {
    public static byte[] A0G;
    public static String[] A0H = {"cAtU07tvAHmpQwteCa8pEQH5gF5iUcfh", "Hjeg7grS71Jm6r5NKbmR8o7Al25NvLrB", "8TbkpeEOwiN436cBQhp4NSePMq1Z0ZNp", "wFA3Sleqv", "yws6lvEdJf3TdH9okNAymdfPd8aH69ii", "xvx7jE251jeLUpmQ5JTTtAODp7RTPAZj", "flKrm8KbmQNj7vJDUwRTOfFPMCPuTaKn", "2PQM5lIFNms8BVmrvHkuPmbcHqu7a2gR"};
    public static final double[] A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0780Hd A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C04774v A0B;
    public final C0876Kw A0C;
    public final L4 A0D;
    public final LJ A0E;
    public final boolean[] A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<C2242qI, Long> A00(C0876Kw c0876Kw, String str) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] copyOf = Arrays.copyOf(c0876Kw.A02, c0876Kw.A00);
        int i5 = copyOf[4] & 255;
        int i6 = copyOf[5] & 255;
        int i7 = (i5 << 4) | (i6 >> 4);
        int i8 = ((i6 & 15) << 8) | (copyOf[6] & 255);
        float f = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                float f2 = i8 * 4;
                float f3 = i7 * 3;
                if (A0H[2].charAt(3) == 'k') {
                    A0H[1] = "IKG5315UEoYuWi8w79ZvxkF28jax6fmF";
                    f = f2 / f3;
                    C2242qI A14 = new C04212p().A0y(str).A11(A01(0, 11, 62)).A0r(i7).A0f(i8).A0Y(f).A12(Collections.singletonList(copyOf)).A14();
                    j = 0;
                    i = (copyOf[7] & C8077mf.q) - 1;
                    if (i >= 0 && i < A0I.length) {
                        double d = A0I[i];
                        i2 = c0876Kw.A01;
                        i3 = (copyOf[i2 + 9] & 96) >> 5;
                        if (i3 != (copyOf[i2 + 9] & 31)) {
                            double d2 = i3;
                            if (A0H[2].charAt(3) == 'k') {
                                String[] strArr = A0H;
                                strArr[5] = "rAMAKKtXIRKmVhmwxuLKv06bcSnWRDth";
                                strArr[7] = "TlBzrdA8FTcPVEmXq7DzDEHR3QnpW5Am";
                                d *= (d2 + 1.0d) / (i4 + 1);
                            }
                        }
                        j = (long) (1000000.0d / d);
                    }
                    return Pair.create(A14, Long.valueOf(j));
                }
                throw new RuntimeException();
            case 3:
                f = (i8 * 16) / (i7 * 9);
                C2242qI A142 = new C04212p().A0y(str).A11(A01(0, 11, 62)).A0r(i7).A0f(i8).A0Y(f).A12(Collections.singletonList(copyOf)).A14();
                j = 0;
                i = (copyOf[7] & C8077mf.q) - 1;
                if (i >= 0) {
                    double d3 = A0I[i];
                    i2 = c0876Kw.A01;
                    i3 = (copyOf[i2 + 9] & 96) >> 5;
                    if (i3 != (copyOf[i2 + 9] & 31)) {
                    }
                    j = (long) (1000000.0d / d3);
                    break;
                }
                return Pair.create(A142, Long.valueOf(j));
            case 4:
                f = (i8 * 121) / (i7 * 100);
                C2242qI A1422 = new C04212p().A0y(str).A11(A01(0, 11, 62)).A0r(i7).A0f(i8).A0Y(f).A12(Collections.singletonList(copyOf)).A14();
                j = 0;
                i = (copyOf[7] & C8077mf.q) - 1;
                if (i >= 0) {
                }
                return Pair.create(A1422, Long.valueOf(j));
            default:
                C2242qI A14222 = new C04212p().A0y(str).A11(A01(0, 11, 62)).A0r(i7).A0f(i8).A0Y(f).A12(Collections.singletonList(copyOf)).A14();
                j = 0;
                i = (copyOf[7] & C8077mf.q) - 1;
                if (i >= 0) {
                }
                return Pair.create(A14222, Long.valueOf(j));
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {50, C3307Iz.e0, 32, C3307Iz.V, C3307Iz.c0, 107, C3307Iz.a0, 52, C3307Iz.V, 35, 118};
        if (A0H[4].charAt(19) != 'y') {
            throw new RuntimeException();
        }
        A0H[2] = "5b4kHrs0qMccPUXJRINIqLrMs4aEtqXr";
        A0G = bArr;
    }

    static {
        A02();
        A0I = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public C1951lM() {
        this(null);
    }

    public C1951lM(LJ lj) {
        this.A0E = lj;
        this.A0F = new boolean[4];
        this.A0C = new C0876Kw(128);
        if (lj != null) {
            this.A0D = new L4(178, 128);
            this.A0B = new C04774v();
        } else {
            this.A0D = null;
            this.A0B = null;
        }
        this.A01 = C10323vs.b;
        this.A03 = C10323vs.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
        if (r3 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0117, code lost:
        r2 = (r23.A03 > o.C10323vs.b ? 1 : (r23.A03 == o.C10323vs.b ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:
        if (r2 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
        r13 = r23.A09;
        r14 = (int) (r23.A04 - r23.A02);
        r2 = r23.A05;
        r0 = r23.A03;
        r4 = o.C10323vs.b;
        r13 = r13 ? 1 : 0;
        r2.AIu(r0, r13, r14 - r11, r11, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ae, code lost:
        if (r3 != false) goto L42;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5A(C04774v c04774v) {
        long j;
        AbstractC04543y.A02(this.A05);
        int startCodeOffset = c04774v.A09();
        int A0A = c04774v.A0A();
        byte[] A0l = c04774v.A0l();
        this.A04 += c04774v.A07();
        this.A05.AIr(c04774v, c04774v.A07());
        while (true) {
            int lengthToStartCode = HS.A04(A0l, startCodeOffset, A0A, this.A0F);
            if (lengthToStartCode == A0A) {
                boolean z = this.A07;
                String[] strArr = A0H;
                String str = strArr[6];
                String str2 = strArr[3];
                int offset = str.length();
                if (offset != str2.length()) {
                    A0H[1] = "ooUhAAd1UFU3ZsdgbXiiZIdc17zvx9JT";
                    if (!z) {
                        this.A0C.A01(A0l, startCodeOffset, A0A);
                    }
                    if (this.A0D != null) {
                        this.A0D.A02(A0l, startCodeOffset, A0A);
                        return;
                    }
                    return;
                }
            } else {
                int i = c04774v.A0l()[lengthToStartCode + 3] & 255;
                int i2 = lengthToStartCode - startCodeOffset;
                if (!this.A07) {
                    if (i2 > 0) {
                        this.A0C.A01(A0l, startCodeOffset, lengthToStartCode);
                    }
                    int offset2 = i2 < 0 ? -i2 : 0;
                    if (this.A0C.A02(i, offset2)) {
                        Pair<C2242qI, Long> A00 = A00(this.A0C, (String) AbstractC04543y.A01(this.A06));
                        this.A05.A6e((C2242qI) A00.first);
                        this.A00 = ((Long) A00.second).longValue();
                        this.A07 = true;
                    }
                }
                if (this.A0D != null) {
                    int offset3 = 0;
                    if (i2 > 0) {
                        this.A0D.A02(A0l, startCodeOffset, lengthToStartCode);
                    } else {
                        offset3 = -i2;
                    }
                    if (this.A0D.A04(offset3)) {
                        ((C04774v) C5C.A0f(this.A0B)).A0j(this.A0D.A01, HS.A02(this.A0D.A01, this.A0D.A00));
                        ((LJ) C5C.A0f(this.A0E)).A02(this.A03, this.A0B);
                    }
                    if (i == 178 && c04774v.A0l()[lengthToStartCode + 2] == 1) {
                        this.A0D.A01(i);
                    }
                }
                if (i == 0 || i == 179) {
                    int i3 = A0A - lengthToStartCode;
                    boolean z2 = this.A08;
                    long j2 = C10323vs.b;
                    if (z2) {
                        boolean z3 = this.A07;
                        int offset4 = A0H[2].charAt(3);
                        if (offset4 == 107) {
                            A0H[4] = "I3q7BGa2d1yxMNRbgKUy1FZhwbtqEBv0";
                        }
                    }
                    boolean z4 = this.A0A;
                    String[] strArr2 = A0H;
                    if (strArr2[6].length() == strArr2[3].length()) {
                        break;
                    }
                    A0H[1] = "M1cTpkEI0lqbwMedLRZ4APYv7Db9TSYf";
                    if (!z4 || this.A08) {
                        this.A02 = this.A04 - i3;
                        if (this.A01 != j2) {
                            j = this.A01;
                        } else if (this.A03 != j2) {
                            long j3 = this.A03;
                            int offset5 = A0H[0].charAt(10);
                            if (offset5 != 109) {
                                j = this.A00 + j3;
                            } else {
                                A0H[0] = "FNyxia2DuWmH1fHrZAJ70vL24BcjBrNj";
                                j = this.A00 + j3;
                            }
                        } else {
                            j = j2;
                        }
                        this.A03 = j;
                        this.A09 = false;
                        this.A01 = j2;
                        this.A0A = true;
                    }
                    this.A08 = i == 0;
                } else if (i == 184) {
                    this.A09 = true;
                }
                startCodeOffset = lengthToStartCode + 3;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void A5c(HA ha, LG lg) {
        lg.A05();
        this.A06 = lg.A04();
        this.A05 = ha.AKS(lg.A03(), 2);
        if (this.A0E != null) {
            this.A0E.A03(ha, lg);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGq(long j, int i) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AJ5() {
        HS.A0H(this.A0F);
        this.A0C.A00();
        if (this.A0D != null) {
            L4 l4 = this.A0D;
            if (A0H[1].length() != 32) {
                throw new RuntimeException();
            }
            A0H[0] = "joVCJevLOtmtIagsqVBvfxemqq2mA7LA";
            l4.A00();
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = C10323vs.b;
        this.A03 = C10323vs.b;
    }
}
