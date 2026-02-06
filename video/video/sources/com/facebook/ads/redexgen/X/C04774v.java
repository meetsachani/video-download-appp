package com.facebook.ads.redexgen.X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import o.C8206nB;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.4v  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04774v {
    public static byte[] A03;
    public static String[] A04 = {"RlBAQ9etSzb6rKOU0OwTULVtudJYJZp0", "XAmGWsEC26u1mjqUpAPP", "gKAOne2sLRpvkAzkWDtxdYOHT1y3K7xN", "iu", "f0TxnfWyKi4JtHzbatu6pF78XF274ljv", "5Aw1jR83b8etF7", "lH1Eai5bIm9O9MK22LfAWzb", "DxY4VOe5grYAJX95lLrlpegM3yyEwSTm"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{64, 103, Byte.MAX_VALUE, 104, 101, 96, 109, C3307Iz.a0, 92, 93, 79, 36, 49, C3307Iz.a0, 122, 108, QC1.w, 124, 108, 103, 106, 108, C3307Iz.a0, 106, 102, 103, 125, 96, 103, 124, 104, 125, 96, 102, 103, C3307Iz.a0, 107, 112, 125, 108, 51, C3307Iz.a0, 88, Byte.MAX_VALUE, 103, 112, 125, QC1.w, 117, 49, 68, 69, 87, 60, C3307Iz.a0, 49, 98, 116, 96, 100, 116, Byte.MAX_VALUE, 114, 116, 49, 119, QC1.w, 99, 98, 101, 49, 115, 104, 101, 116, C3307Iz.c0, 49, 2, 57, C3307Iz.Y, 118, 52, ED2.a, 34, 118, 56, 57, 34, 118, C3307Iz.d0, 51, 36, 57, 108, 118, C3307Iz.Y, C8077mf.G, 0, 6, 3, 3, 28, 1, 7, C8077mf.z, C8077mf.A, 83, C8077mf.r, C8077mf.E, C8077mf.u, 1, 0, C8077mf.z, 7, 73, 83};
    }

    static {
        A04();
        A06 = new char[]{C8206nB.d, '\n'};
        A07 = new char[]{'\n'};
        A05 = C1840jW.A05(AbstractC1879k9.A01, AbstractC1879k9.A05, AbstractC1879k9.A02, AbstractC1879k9.A03, AbstractC1879k9.A04);
    }

    public C04774v() {
        this.A00 = C5C.A07;
    }

    public C04774v(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C04774v(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C04774v(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    private char A00(Charset charset, char[] cArr) {
        char A01;
        int i;
        if ((charset.equals(AbstractC1879k9.A05) || charset.equals(AbstractC1879k9.A01)) && A07() >= 1) {
            A01 = AbstractC2186pN.A01(AbstractC2306rc.A00(this.A00[this.A02]));
            i = 1;
        } else if ((charset.equals(AbstractC1879k9.A02) || charset.equals(AbstractC1879k9.A03)) && A07() >= 2) {
            A01 = AbstractC2186pN.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i = 2;
        } else if (!charset.equals(AbstractC1879k9.A04) || A07() < 2) {
            return (char) 0;
        } else {
            A01 = AbstractC2186pN.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i = 2;
        }
        if (AbstractC2186pN.A04(cArr, A01)) {
            this.A02 += i;
            char character = AbstractC2186pN.A01(A01);
            return character;
        }
        return (char) 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0018 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A01(Charset charset) {
        int i;
        if (charset.equals(AbstractC1879k9.A05) || charset.equals(AbstractC1879k9.A01)) {
            i = 1;
        } else if (charset.equals(AbstractC1879k9.A02) || charset.equals(AbstractC1879k9.A04) || charset.equals(AbstractC1879k9.A03)) {
            i = 2;
        } else {
            throw new IllegalArgumentException(A03(95, 21, 50) + charset);
        }
        for (int i2 = this.A02; i2 < i - (i - 1); i2 += i) {
            if ((charset.equals(AbstractC1879k9.A05) || charset.equals(AbstractC1879k9.A01)) && C5C.A16(this.A00[i2])) {
                return i2;
            }
            if ((charset.equals(AbstractC1879k9.A02) || charset.equals(AbstractC1879k9.A03)) && this.A00[i2] == 0 && C5C.A16(this.A00[i2 + 1])) {
                return i2;
            }
            if (charset.equals(AbstractC1879k9.A04) && this.A00[i2 + 1] == 0 && C5C.A16(this.A00[i2])) {
                return i2;
            }
        }
        int stride = this.A01;
        return stride;
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String A02(char c) {
        if (A07() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < stringLimit) {
            int stringLimit = this.A00[i];
            if (stringLimit == c) {
                break;
            }
            i++;
        }
        byte[] bArr = this.A00;
        int i2 = this.A02;
        int stringLimit2 = this.A02;
        String A0r = C5C.A0r(bArr, i2, i - stringLimit2);
        this.A02 = i;
        int i3 = this.A02;
        int stringLimit3 = this.A01;
        if (i3 < stringLimit3) {
            int stringLimit4 = this.A02;
            this.A02 = stringLimit4 + 1;
        }
        return A0r;
    }

    private void A05(Charset charset) {
        if (A00(charset, A06) == '\r') {
            A00(charset, A07);
        }
    }

    public final double A06() {
        return Double.longBitsToDouble(A0P());
    }

    public final int A07() {
        return this.A01 - this.A02;
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A00[this.A02] & 255;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | (bArr4[i7] & 255);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & 255);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | ((bArr4[i7] & 255) << 24);
    }

    public final int A0F() {
        int A0E = A0E();
        if (A0E >= 0) {
            return A0E;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 8);
    }

    public final int A0H() {
        int b2 = A0I();
        int b1 = A0I();
        int b4 = A0I();
        int b3 = A0I();
        int b22 = (b2 << 21) | (b1 << 14);
        int b12 = b4 << 7;
        return b22 | b12 | b3;
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | (bArr2[i3] & 255);
        int result = this.A02;
        this.A02 = result + 2;
        return i4;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & 255);
    }

    public final int A0L() {
        int A0C = A0C();
        if (A0C >= 0) {
            return A0C;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j = (bArr[i] & 255) | ((bArr2[i2] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j2 = j | ((bArr3[i3] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j3 = j2 | ((bArr4[i4] & 255) << 24);
        byte[] bArr5 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j4 = j3 | ((bArr5[i5] & 255) << 32);
        byte[] bArr6 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j5 = j4 | ((bArr6[i6] & 255) << 40);
        byte[] bArr7 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j6 = j5 | ((bArr7[i7] & 255) << 48);
        byte[] bArr8 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j6 | ((255 & bArr8[i8]) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j = (bArr[i] & 255) | ((bArr2[i2] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j2 = j | ((bArr3[i3] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j2 | ((255 & bArr4[i4]) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j = ((bArr[i] & 255) << 56) | ((bArr2[i2] & 255) << 48);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j2 = j | ((bArr3[i3] & 255) << 40);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j3 = j2 | ((bArr4[i4] & 255) << 32);
        byte[] bArr5 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j4 = j3 | ((bArr5[i5] & 255) << 24);
        byte[] bArr6 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j5 = j4 | ((bArr6[i6] & 255) << 16);
        byte[] bArr7 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j6 = j5 | ((bArr7[i7] & 255) << 8);
        byte[] bArr8 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j6 | (255 & bArr8[i8]);
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j = ((bArr[i] & 255) << 24) | ((bArr2[i2] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j2 = j | ((bArr3[i3] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j2 | (255 & bArr4[i4]);
    }

    public final long A0R() {
        long A0P = A0P();
        if (A0P >= 0) {
            return A0P;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0P);
    }

    public final long A0S() {
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j = bArr[length];
        int i2 = 7;
        while (A04[3].length() != 11) {
            A04[0] = "oMNWSgm03bScuVXxVZmUeRStw4NVi0TN";
            if (i2 >= 0) {
                int length2 = 1 << i2;
                long value = length2;
                int length3 = ((value & j) > 0L ? 1 : ((value & j) == 0L ? 0 : -1));
                if (length3 == 0) {
                    if (i2 < 6) {
                        int length4 = 1 << i2;
                        j &= length4 - 1;
                        i = 7 - i2;
                    } else if (i2 == 7) {
                        i = 1;
                    }
                } else {
                    i2--;
                }
            }
            if (i != 0) {
                int i3 = 1;
                while (i3 < i) {
                    byte[] bArr2 = this.A00;
                    int length5 = this.A02;
                    byte b = bArr2[length5 + i3];
                    if ((b & C2638Cg0.o7) == 128) {
                        int length6 = b & ED2.a;
                        j = (j << 6) | length6;
                        if (A04[3].length() != 11) {
                            A04[2] = "QkYn4WhdN3Bc00ITVAtZ7M0H0JKEG2qx";
                            i3++;
                        } else {
                            i3++;
                        }
                    } else {
                        throw new NumberFormatException(A03(0, 42, 72) + j);
                    }
                }
                int length7 = this.A02;
                this.A02 = length7 + i;
                return j;
            }
            throw new NumberFormatException(A03(42, 35, 80) + j);
        }
        throw new RuntimeException();
    }

    public final String A0T() {
        return A0Y(AbstractC1879k9.A05);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i) {
        if (i == 0) {
            return A03(0, 0, 97);
        }
        int i2 = i;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i2--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0r = C5C.A0r(bArr, stringLength4, i2);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i;
        return A0r;
    }

    public final String A0W(int i) {
        return A0X(i, AbstractC1879k9.A05);
    }

    public final String A0X(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final String A0Y(Charset charset) {
        AbstractC04543y.A09(A05.contains(charset), A03(95, 21, 50) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC1879k9.A01)) {
            A0Z();
        }
        int A01 = A01(charset);
        int lineLimit = this.A02;
        String A0X = A0X(A01 - lineLimit, charset);
        int i = this.A02;
        int lineLimit2 = this.A01;
        if (i == lineLimit2) {
            return A0X;
        }
        A05(charset);
        return A0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return AbstractC1879k9.A05;
        } else if (A07() >= 2) {
            if (this.A00[this.A02] == -2) {
                byte[] bArr = this.A00;
                int i = this.A02;
                if (A04[0].charAt(23) != 't') {
                    throw new RuntimeException();
                }
                A04[1] = "9QZAaK9H1E15SkUu26Oe";
                if (bArr[i + 1] == -1) {
                    this.A02 += 2;
                    return AbstractC1879k9.A03;
                }
            }
            if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return AbstractC1879k9.A04;
            }
            return null;
        } else {
            return null;
        }
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | ((bArr2[i3] & 255) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    public final void A0c(int i) {
        if (i > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i);
        }
    }

    public final void A0d(int i) {
        A0j(A08() < i ? new byte[i] : this.A00, i);
        String[] strArr = A04;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A04[3] = "3F79npZxDc4PfqkC8vfulVLdM";
    }

    public final void A0e(int i) {
        AbstractC04543y.A07(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0f(int i) {
        boolean z;
        if (i >= 0) {
            int i2 = this.A01;
            String[] strArr = A04;
            if (strArr[4].charAt(20) != strArr[7].charAt(20)) {
                throw new RuntimeException();
            }
            A04[3] = "UMwuHioqOI4Z";
            if (i <= i2) {
                z = true;
                AbstractC04543y.A07(z);
                this.A02 = i;
            }
        }
        z = false;
        AbstractC04543y.A07(z);
        this.A02 = i;
    }

    public final void A0g(int i) {
        A0f(this.A02 + i);
    }

    public final void A0h(C04764u c04764u, int i) {
        A0k(c04764u.A00, 0, i);
        c04764u.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}
