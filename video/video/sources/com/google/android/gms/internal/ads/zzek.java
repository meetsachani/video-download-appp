package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;
import o.C8206nB;
import o.ED2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzek {
    public static final char[] d = {C8206nB.d, '\n'};
    public static final char[] e = {'\n'};
    public static final zzfyh f = zzfyh.K(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public byte[] a;
    public int b;
    public int c;

    public zzek(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public static int q(int i, int i2, int i3, int i4) {
        return zzgbf.e((byte) 0, zzgbi.a(((i & 7) << 2) | ((i2 & 48) >> 4)), zzgbi.a(((i3 & 60) >> 2) | ((i2 & 15) << 4)), zzgbi.a((i4 & 63) | ((i3 & 3) << 6)));
    }

    public static int r(Charset charset) {
        zzdc.e(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            return 2;
        }
        return 1;
    }

    public static boolean t(byte b) {
        return (b & C2638Cg0.o7) == 128;
    }

    public final int A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public final int B() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        this.b = i + 3;
        return (bArr[i3] & 255) | (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
    }

    public final int C() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        int i5 = (bArr[i2] & 255) << 8;
        return ((bArr[i4] & 255) << 24) | i5 | (bArr[i] & 255) | ((bArr[i3] & 255) << 16);
    }

    public final int D() {
        int C = C();
        if (C >= 0) {
            return C;
        }
        throw new IllegalStateException("Top bit not zero: " + C);
    }

    public final int E() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final int F() {
        return (G() << 21) | (G() << 14) | (G() << 7) | G();
    }

    public final int G() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int H() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        this.b = i + 4;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final int I() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        this.b = i + 3;
        return (bArr[i3] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
    }

    public final int J() {
        int A = A();
        if (A >= 0) {
            return A;
        }
        throw new IllegalStateException("Top bit not zero: " + A);
    }

    public final int K() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final long L() {
        int i;
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i2 + 2;
        this.b = i4;
        long j = bArr[i3];
        int i5 = i2 + 3;
        this.b = i5;
        long j2 = bArr[i4];
        int i6 = i2 + 4;
        this.b = i6;
        long j3 = bArr[i5];
        int i7 = i2 + 5;
        this.b = i7;
        long j4 = bArr[i6];
        int i8 = i2 + 6;
        this.b = i8;
        long j5 = bArr[i7];
        this.b = i2 + 7;
        long j6 = bArr[i8];
        this.b = i2 + 8;
        return ((bArr[i] & 255) << 56) | (255 & bArr[i2]) | ((j & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((j5 & 255) << 40) | ((j6 & 255) << 48);
    }

    public final long M() {
        int i;
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i2 + 2;
        this.b = i4;
        long j = bArr[i3];
        this.b = i2 + 3;
        long j2 = bArr[i4];
        this.b = i2 + 4;
        return ((bArr[i] & 255) << 24) | (bArr[i2] & 255) | ((j & 255) << 8) | ((j2 & 255) << 16);
    }

    public final long N() {
        int i;
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i2 + 2;
        this.b = i4;
        long j = bArr[i3];
        int i5 = i2 + 3;
        this.b = i5;
        long j2 = bArr[i4];
        int i6 = i2 + 4;
        this.b = i6;
        long j3 = bArr[i5];
        int i7 = i2 + 5;
        this.b = i7;
        long j4 = bArr[i6];
        int i8 = i2 + 6;
        this.b = i8;
        long j5 = bArr[i7];
        this.b = i2 + 7;
        long j6 = bArr[i8];
        this.b = i2 + 8;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 56) | ((j & 255) << 48) | ((j2 & 255) << 40) | ((j3 & 255) << 32) | ((j4 & 255) << 24) | ((j5 & 255) << 16) | ((j6 & 255) << 8);
    }

    public final long O() {
        int i;
        int i2;
        byte[] bArr = this.a;
        int i3 = this.b;
        int i4 = i3 + 1;
        this.b = i4;
        this.b = i3 + 2;
        long j = bArr[i4];
        this.b = i3 + 3;
        this.b = i3 + 4;
        return (bArr[i2] & 255) | ((bArr[i3] & 255) << 24) | ((j & 255) << 16) | ((bArr[i] & 255) << 8);
    }

    public final long P() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b != this.c) {
                long G = G();
                j |= (127 & G) << (i * 7);
                if ((G & 128) == 0) {
                    return j;
                }
            } else {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
        }
        return j;
    }

    public final long Q() {
        long N = N();
        if (N >= 0) {
            return N;
        }
        throw new IllegalStateException("Top bit not zero: " + N);
    }

    public final long R() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.a[this.b];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            for (i2 = 1; i2 < i; i2++) {
                if ((this.a[this.b + i2] & C2638Cg0.o7) == 128) {
                    j = (j << 6) | (b & ED2.a);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.b += i;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    @InterfaceC11300zs1
    public final String S(char c) {
        if (u() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String c2 = zzeu.c(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return c2;
    }

    @InterfaceC11300zs1
    public final String T(Charset charset) {
        zzdc.e(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (u() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            c();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzeu.m(this.a[i2])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.a;
                    if (bArr[i2] == 0 && zzeu.m(bArr[i2 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.a;
                    if (bArr2[i2 + 1] == 0 && zzeu.m(bArr2[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                i2 = i3;
                break;
            }
        }
        String b = b(i2 - this.b, charset);
        if (this.b != this.c && p(charset, d) == '\r') {
            p(charset, e);
        }
        return b;
    }

    public final String a(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.b;
        int i4 = (i3 + i) - 1;
        if (i4 < this.c && this.a[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        String c = zzeu.c(this.a, i3, i2);
        this.b += i;
        return c;
    }

    public final String b(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    @InterfaceC11300zs1
    public final Charset c() {
        if (u() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (u() >= 2) {
            byte[] bArr2 = this.a;
            int i2 = this.b;
            byte b = bArr2[i2];
            if (b == -2) {
                if (bArr2[i2 + 1] == -1) {
                    this.b = i2 + 2;
                    return StandardCharsets.UTF_16BE;
                }
                return null;
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.b = i2 + 2;
                return StandardCharsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final short d() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public final short e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final void f(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final void g(zzej zzejVar, int i) {
        h(zzejVar.a, 0, i);
        zzejVar.l(0);
    }

    public final void h(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void i(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        j(bArr, i);
    }

    public final void j(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void k(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        zzdc.d(z);
        this.c = i;
    }

    public final void l(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        zzdc.d(z);
        this.b = i;
    }

    public final void m(int i) {
        l(this.b + i);
    }

    public final byte[] n() {
        return this.a;
    }

    public final char o(ByteOrder byteOrder, int i) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.a;
            int i2 = this.b + i;
            return zzgbc.a(bArr[i2], bArr[i2 + 1]);
        }
        byte[] bArr2 = this.a;
        int i3 = this.b + i;
        return zzgbc.a(bArr2[i3 + 1], bArr2[i3]);
    }

    public final char p(Charset charset, char[] cArr) {
        int s;
        boolean z;
        if (u() >= r(charset) && (s = s(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(r0)) {
                long j = r0;
                char c = (char) j;
                if (c == j) {
                    z = true;
                } else {
                    z = false;
                }
                zzfvc.h(z, "Out of range: %s", j);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b += zzgbf.b(s & 255);
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int s(Charset charset) {
        ByteOrder byteOrder;
        int i;
        int i2;
        int i3;
        zzdc.e(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (u() >= r(charset)) {
            int i4 = 1;
            if (charset.equals(StandardCharsets.US_ASCII)) {
                byte b = this.a[this.b];
                if ((b & 128) == 0) {
                    i = b & 255;
                    return (i << 8) | i4;
                }
                return 0;
            }
            if (charset.equals(StandardCharsets.UTF_8)) {
                byte b2 = this.a[this.b];
                if ((b2 & 128) == 0) {
                    i2 = 1;
                } else if ((b2 & 224) == 192 && u() >= 2 && t(this.a[this.b + 1])) {
                    i2 = 2;
                } else {
                    if ((this.a[this.b] & 240) == 224 && u() >= 3) {
                        byte[] bArr = this.a;
                        int i5 = this.b;
                        if (t(bArr[i5 + 1]) && t(bArr[i5 + 2])) {
                            i2 = 3;
                        }
                    }
                    if ((this.a[this.b] & 248) == 240 && u() >= 4) {
                        byte[] bArr2 = this.a;
                        int i6 = this.b;
                        if (t(bArr2[i6 + 1]) && t(bArr2[i6 + 2]) && t(bArr2[i6 + 3])) {
                            i2 = 4;
                        }
                    }
                    i2 = 0;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                byte[] bArr3 = this.a;
                                int i7 = this.b;
                                i3 = q(bArr3[i7], bArr3[i7 + 1], bArr3[i7 + 2], bArr3[i7 + 3]);
                            }
                            return 0;
                        }
                        byte[] bArr4 = this.a;
                        int i8 = this.b;
                        i3 = q(0, bArr4[i8] & C8077mf.q, bArr4[i8 + 1], bArr4[i8 + 2]);
                    } else {
                        byte[] bArr5 = this.a;
                        int i9 = this.b;
                        i3 = q(0, 0, bArr5[i9], bArr5[i9 + 1]);
                    }
                } else {
                    i3 = this.a[this.b] & 255;
                }
                i4 = i2;
                i = i3;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                char o2 = o(byteOrder, 0);
                if (Character.isHighSurrogate(o2) && u() >= 4) {
                    i = Character.toCodePoint(o2, o(byteOrder, 2));
                    i4 = 4;
                } else {
                    i = o2;
                    i4 = 2;
                }
            }
            return (i << 8) | i4;
        }
        throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
    }

    public final int u() {
        return Math.max(this.c - this.b, 0);
    }

    public final int v() {
        return this.a.length;
    }

    public final int w() {
        return this.b;
    }

    public final int x() {
        return this.c;
    }

    public final int y(Charset charset) {
        int s = s(charset);
        if (s != 0) {
            return zzgbf.b(s >>> 8);
        }
        return 1114112;
    }

    public final int z() {
        return this.a[this.b] & 255;
    }

    public zzek() {
        this.a = zzeu.b;
    }

    public zzek(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public zzek(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
