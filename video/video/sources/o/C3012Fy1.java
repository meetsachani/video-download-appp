package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

@Deprecated
/* renamed from: o.Fy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3012Fy1 {
    public static final char[] d = {C8206nB.d, '\n'};
    public static final char[] e = {'\n'};
    public static final AbstractC9481sO0<Charset> f = AbstractC9481sO0.Y(KB.a, KB.c, KB.f, KB.d, KB.e);
    public byte[] a;
    public int b;
    public int c;

    public C3012Fy1() {
        this.a = TD2.f;
    }

    public long A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return ((bArr[i4] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public int B() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.b = i + 3;
        return ((bArr[i3] & 255) << 16) | i4 | (bArr[i] & 255);
    }

    public int C() {
        int w = w();
        if (w >= 0) {
            return w;
        }
        throw new IllegalStateException("Top bit not zero: " + w);
    }

    public int D() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public long E() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        int i6 = i + 5;
        this.b = i6;
        long j2 = j | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return (bArr[i8] & 255) | j2 | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    @InterfaceC11300zs1
    public String F() {
        return p((char) 0);
    }

    public String G(int i) {
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
        String O = TD2.O(this.a, i3, i2);
        this.b += i;
        return O;
    }

    public short H() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public String I(int i) {
        return J(i, KB.c);
    }

    public String J(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int K() {
        return (L() << 21) | (L() << 14) | (L() << 7) | L();
    }

    public int L() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public int M() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.b = i + 4;
        return i3;
    }

    public long N() {
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

    public int O() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.b = i + 3;
        return (bArr[i3] & 255) | i4 | ((bArr[i] & 255) << 16);
    }

    public int P() {
        int s = s();
        if (s >= 0) {
            return s;
        }
        throw new IllegalStateException("Top bit not zero: " + s);
    }

    public long Q() {
        long E = E();
        if (E >= 0) {
            return E;
        }
        throw new IllegalStateException("Top bit not zero: " + E);
    }

    public int R() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public long S() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.a[this.b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.a[this.b + i] & C2638Cg0.o7) == 128) {
                    j = (j << 6) | (b & ED2.a);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    @InterfaceC11300zs1
    public Charset T() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return KB.c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.a;
            int i2 = this.b;
            byte b = bArr2[i2];
            if (b == -2 && bArr2[i2 + 1] == -1) {
                this.b = i2 + 2;
                return KB.d;
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.b = i2 + 2;
                return KB.e;
            } else {
                return null;
            }
        }
        return null;
    }

    public void U(int i) {
        byte[] bArr;
        if (b() < i) {
            bArr = new byte[i];
        } else {
            bArr = this.a;
        }
        W(bArr, i);
    }

    public void V(byte[] bArr) {
        W(bArr, bArr.length);
    }

    public void W(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void X(int i) {
        boolean z;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.c = i;
    }

    public void Y(int i) {
        boolean z;
        if (i >= 0 && i <= this.c) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.b = i;
    }

    public void Z(int i) {
        Y(this.b + i);
    }

    public int a() {
        return this.c - this.b;
    }

    public final void a0(Charset charset) {
        if (o(charset, d) == '\r') {
            o(charset, e);
        }
    }

    public int b() {
        return this.a.length;
    }

    public void c(int i) {
        if (i > b()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public final int d(Charset charset) {
        int i;
        if (!charset.equals(KB.c) && !charset.equals(KB.a)) {
            if (!charset.equals(KB.f) && !charset.equals(KB.e) && !charset.equals(KB.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        } else {
            i = 1;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(KB.c) || charset.equals(KB.a)) && TD2.V0(this.a[i2])) {
                    break;
                }
                if (charset.equals(KB.f) || charset.equals(KB.d)) {
                    byte[] bArr = this.a;
                    if (bArr[i2] == 0 && TD2.V0(bArr[i2 + 1])) {
                        break;
                    }
                }
                if (charset.equals(KB.e)) {
                    byte[] bArr2 = this.a;
                    if (bArr2[i2 + 1] == 0 && TD2.V0(bArr2[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                return i3;
            }
        }
        return i2;
    }

    public byte[] e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public char h() {
        byte[] bArr = this.a;
        int i = this.b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public char i(Charset charset) {
        boolean contains = f.contains(charset);
        C9542sf.b(contains, "Unsupported charset: " + charset);
        return (char) (j(charset) >> 16);
    }

    public final int j(Charset charset) {
        byte d2;
        char k;
        int i = 1;
        if ((charset.equals(KB.c) || charset.equals(KB.a)) && a() >= 1) {
            d2 = (byte) C11132zB.d(WB2.p(this.a[this.b]));
        } else {
            if ((charset.equals(KB.f) || charset.equals(KB.d)) && a() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                k = C11132zB.k(bArr[i2], bArr[i2 + 1]);
            } else if (charset.equals(KB.e) && a() >= 2) {
                byte[] bArr2 = this.a;
                int i3 = this.b;
                k = C11132zB.k(bArr2[i3 + 1], bArr2[i3]);
            } else {
                return 0;
            }
            d2 = (byte) k;
            i = 2;
        }
        return (C11132zB.d(d2) << 16) + i;
    }

    public int k() {
        return this.a[this.b] & 255;
    }

    public void l(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.a, this.b, i);
        this.b += i;
    }

    public void m(C2903Ey1 c2903Ey1, int i) {
        n(c2903Ey1.a, 0, i);
        c2903Ey1.q(0);
    }

    public void n(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char o(Charset charset, char[] cArr) {
        int j = j(charset);
        if (j != 0) {
            char c = (char) (j >> 16);
            if (C11132zB.h(cArr, c)) {
                this.b += j & 65535;
                return c;
            }
            return (char) 0;
        }
        return (char) 0;
    }

    @InterfaceC11300zs1
    public String p(char c) {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != c) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String O = TD2.O(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return O;
    }

    public double q() {
        return Double.longBitsToDouble(E());
    }

    public float r() {
        return Float.intBitsToFloat(s());
    }

    public int s() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = ((bArr[i2] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i5 = i + 3;
        this.b = i5;
        this.b = i + 4;
        return (bArr[i5] & 255) | i4 | ((bArr[i3] & 255) << 8);
    }

    public int t() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.b = i + 3;
        return (bArr[i3] & 255) | i4 | (((bArr[i] & 255) << 24) >> 8);
    }

    @InterfaceC11300zs1
    public String u() {
        return v(KB.c);
    }

    @InterfaceC11300zs1
    public String v(Charset charset) {
        boolean contains = f.contains(charset);
        C9542sf.b(contains, "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(KB.a)) {
            T();
        }
        String J = J(d(charset) - this.b, charset);
        if (this.b == this.c) {
            return J;
        }
        a0(charset);
        return J;
    }

    public int w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
        int i5 = i + 3;
        this.b = i5;
        this.b = i + 4;
        return ((bArr[i5] & 255) << 24) | i4 | ((bArr[i3] & 255) << 16);
    }

    public int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.b = i + 3;
        return ((bArr[i3] & 255) << 16) | i4 | (bArr[i] & 255);
    }

    public long y() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        long j = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        int i5 = i + 4;
        this.b = i5;
        long j2 = j | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        int i7 = i + 6;
        this.b = i7;
        long j3 = j2 | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return ((bArr[i8] & 255) << 56) | j3 | ((bArr[i7] & 255) << 48);
    }

    public short z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public C3012Fy1(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public C3012Fy1(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public C3012Fy1(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
