package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC3540Li1;

/* loaded from: classes.dex */
public abstract class KE {
    public static final int f = 4096;
    public static final int g = 100;
    public static final int h = Integer.MAX_VALUE;
    public int a;
    public int b;
    public int c;
    public LE d;
    public boolean e;

    /* loaded from: classes.dex */
    public static final class b extends KE {
        public final byte[] i;
        public final boolean j;
        public int k;
        public int l;
        public int m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f509o;
        public boolean p;
        public int q;

        @Override // o.KE
        public int A() throws IOException {
            return L();
        }

        @Override // o.KE
        public long B() throws IOException {
            return M();
        }

        @Override // o.KE
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // o.KE
        public <T extends InterfaceC3540Li1> T D(int i, InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                T x = interfaceC3892Oy1.x(this, c3151Hj0);
                a(IM2.c(i, 4));
                this.a--;
                return x;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public void E(int i, InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                aVar.y3(this, c3151Hj0);
                a(IM2.c(i, 4));
                this.a--;
                return;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public int F() throws IOException {
            return N();
        }

        @Override // o.KE
        public long G() throws IOException {
            return Q();
        }

        @Override // o.KE
        public <T extends InterfaceC3540Li1> T H(InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException {
            int N = N();
            if (this.a < this.b) {
                int t = t(N);
                this.a++;
                T x = interfaceC3892Oy1.x(this, c3151Hj0);
                a(0);
                this.a--;
                s(t);
                return x;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public void I(InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException {
            int N = N();
            if (this.a < this.b) {
                int t = t(N);
                this.a++;
                aVar.y3(this, c3151Hj0);
                a(0);
                this.a--;
                s(t);
                return;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public byte J() throws IOException {
            int i = this.m;
            if (i != this.k) {
                byte[] bArr = this.i;
                this.m = i + 1;
                return bArr[i];
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public byte[] K(int i) throws IOException {
            if (i > 0) {
                int i2 = this.k;
                int i3 = this.m;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.m = i4;
                    return Arrays.copyOfRange(this.i, i3, i4);
                }
            }
            if (i <= 0) {
                if (i == 0) {
                    return C9740tS0.d;
                }
                throw C9258rT0.g();
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public int L() throws IOException {
            int i = this.m;
            if (this.k - i >= 4) {
                byte[] bArr = this.i;
                this.m = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public long M() throws IOException {
            int i = this.m;
            if (this.k - i >= 8) {
                byte[] bArr = this.i;
                this.m = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public int N() throws IOException {
            int i;
            int i2 = this.m;
            int i3 = this.k;
            if (i3 != i2) {
                byte[] bArr = this.i;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.m = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << C8077mf.p) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << C8077mf.y);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.m = i5;
                    return i;
                }
            }
            return (int) R();
        }

        @Override // o.KE
        public long Q() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.m;
            int i2 = this.k;
            if (i2 != i) {
                byte[] bArr = this.i;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.m = i3;
                    return b;
                } else if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << C8077mf.p) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << C8077mf.y);
                            if (i9 < 0) {
                                i4 = i8;
                                j = (-2080896) ^ i9;
                            } else {
                                long j4 = i9;
                                i4 = i + 5;
                                long j5 = j4 ^ (bArr[i8] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j6 = j5 ^ (bArr[i4] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j5 = j6 ^ (bArr[i10] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j6 = j5 ^ (bArr[i4] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                    i4 = i10;
                                }
                                j = j5 ^ j3;
                            }
                        }
                    }
                    this.m = i4;
                    return j;
                }
            }
            return R();
        }

        @Override // o.KE
        public long R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = J();
                j |= (J & Byte.MAX_VALUE) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.KE
        public int S() throws IOException {
            return L();
        }

        @Override // o.KE
        public long T() throws IOException {
            return M();
        }

        @Override // o.KE
        public int U() throws IOException {
            return KE.b(N());
        }

        @Override // o.KE
        public long V() throws IOException {
            return KE.c(Q());
        }

        @Override // o.KE
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                int i = this.k;
                int i2 = this.m;
                if (N <= i - i2) {
                    String str = new String(this.i, i2, N, C9740tS0.a);
                    this.m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw C9258rT0.g();
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public String X() throws IOException {
            int N = N();
            if (N > 0) {
                int i = this.k;
                int i2 = this.m;
                if (N <= i - i2) {
                    String h = BD2.h(this.i, i2, N);
                    this.m += N;
                    return h;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw C9258rT0.g();
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public int Y() throws IOException {
            if (i()) {
                this.f509o = 0;
                return 0;
            }
            int N = N();
            this.f509o = N;
            if (IM2.a(N) != 0) {
                return this.f509o;
            }
            throw C9258rT0.c();
        }

        @Override // o.KE
        public int Z() throws IOException {
            return N();
        }

        @Override // o.KE
        public void a(int i) throws C9258rT0 {
            if (this.f509o == i) {
                return;
            }
            throw C9258rT0.b();
        }

        @Override // o.KE
        public long a0() throws IOException {
            return Q();
        }

        @Override // o.KE
        @Deprecated
        public void b0(int i, InterfaceC3540Li1.a aVar) throws IOException {
            E(i, aVar, C3151Hj0.d());
        }

        @Override // o.KE
        public void c0() {
            this.n = this.m;
        }

        @Override // o.KE
        public void e(boolean z) {
            this.p = z;
        }

        @Override // o.KE
        public int f() {
            int i = this.q;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - h();
        }

        @Override // o.KE
        public int g() {
            return this.f509o;
        }

        @Override // o.KE
        public boolean g0(int i) throws IOException {
            int b = IM2.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    k0(4);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            return false;
                        }
                        i0();
                        a(IM2.c(IM2.a(i), 4));
                        return true;
                    }
                    k0(N());
                    return true;
                }
                k0(8);
                return true;
            }
            n0();
            return true;
        }

        @Override // o.KE
        public int h() {
            return this.m - this.n;
        }

        @Override // o.KE
        public boolean h0(int i, ME me) throws IOException {
            int b = IM2.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    int L = L();
                                    me.Z1(i);
                                    me.C1(L);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            return false;
                        }
                        me.Z1(i);
                        j0(me);
                        int c = IM2.c(IM2.a(i), 4);
                        a(c);
                        me.Z1(c);
                        return true;
                    }
                    AbstractC8616os x = x();
                    me.Z1(i);
                    me.z1(x);
                    return true;
                }
                long M = M();
                me.Z1(i);
                me.D1(M);
                return true;
            }
            long G = G();
            me.Z1(i);
            me.i2(G);
            return true;
        }

        @Override // o.KE
        public boolean i() throws IOException {
            if (this.m == this.k) {
                return true;
            }
            return false;
        }

        @Override // o.KE
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // o.KE
        public void j0(ME me) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, me));
        }

        @Override // o.KE
        public void k0(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.k;
                int i3 = this.m;
                if (i <= i2 - i3) {
                    this.m = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C9258rT0.g();
            }
            throw C9258rT0.l();
        }

        public final void m0() {
            int i = this.k + this.l;
            this.k = i;
            int i2 = i - this.n;
            int i3 = this.q;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.l = i4;
                this.k = i - i4;
                return;
            }
            this.l = 0;
        }

        public final void n0() throws IOException {
            if (this.k - this.m >= 10) {
                o0();
            } else {
                p0();
            }
        }

        public final void o0() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.i;
                int i2 = this.m;
                this.m = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw C9258rT0.f();
        }

        public final void p0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.KE
        public void s(int i) {
            this.q = i;
            m0();
        }

        @Override // o.KE
        public int t(int i) throws C9258rT0 {
            if (i >= 0) {
                int h = i + h();
                int i2 = this.q;
                if (h <= i2) {
                    this.q = h;
                    m0();
                    return i2;
                }
                throw C9258rT0.l();
            }
            throw C9258rT0.g();
        }

        @Override // o.KE
        public boolean u() throws IOException {
            if (Q() != 0) {
                return true;
            }
            return false;
        }

        @Override // o.KE
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // o.KE
        public ByteBuffer w() throws IOException {
            ByteBuffer wrap;
            int N = N();
            if (N > 0) {
                int i = this.k;
                int i2 = this.m;
                if (N <= i - i2) {
                    if (!this.j && this.p) {
                        wrap = ByteBuffer.wrap(this.i, i2, N).slice();
                    } else {
                        wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.i, i2, i2 + N));
                    }
                    this.m += N;
                    return wrap;
                }
            }
            if (N == 0) {
                return C9740tS0.e;
            }
            if (N < 0) {
                throw C9258rT0.g();
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public AbstractC8616os x() throws IOException {
            AbstractC8616os G;
            int N = N();
            if (N > 0) {
                int i = this.k;
                int i2 = this.m;
                if (N <= i - i2) {
                    if (this.j && this.p) {
                        G = AbstractC8616os.G0(this.i, i2, N);
                    } else {
                        G = AbstractC8616os.G(this.i, i2, N);
                    }
                    this.m += N;
                    return G;
                }
            }
            if (N == 0) {
                return AbstractC8616os.Z0;
            }
            return AbstractC8616os.F0(K(N));
        }

        @Override // o.KE
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // o.KE
        public int z() throws IOException {
            return N();
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.q = Integer.MAX_VALUE;
            this.i = bArr;
            this.k = i2 + i;
            this.m = i;
            this.n = i;
            this.j = z;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends KE {
        public Iterable<ByteBuffer> i;
        public Iterator<ByteBuffer> j;
        public ByteBuffer k;
        public boolean l;
        public boolean m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f510o;
        public int p;
        public int q;
        public int r;
        public int s;
        public long t;
        public long u;
        public long v;
        public long w;

        private void p0() {
            int i = this.n + this.f510o;
            this.n = i;
            int i2 = i - this.s;
            int i3 = this.p;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f510o = i4;
                this.n = i - i4;
                return;
            }
            this.f510o = 0;
        }

        private void r0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.KE
        public int A() throws IOException {
            return L();
        }

        @Override // o.KE
        public long B() throws IOException {
            return M();
        }

        @Override // o.KE
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // o.KE
        public <T extends InterfaceC3540Li1> T D(int i, InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                T x = interfaceC3892Oy1.x(this, c3151Hj0);
                a(IM2.c(i, 4));
                this.a--;
                return x;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public void E(int i, InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                aVar.y3(this, c3151Hj0);
                a(IM2.c(i, 4));
                this.a--;
                return;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public int F() throws IOException {
            return N();
        }

        @Override // o.KE
        public long G() throws IOException {
            return Q();
        }

        @Override // o.KE
        public <T extends InterfaceC3540Li1> T H(InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException {
            int N = N();
            if (this.a < this.b) {
                int t = t(N);
                this.a++;
                T x = interfaceC3892Oy1.x(this, c3151Hj0);
                a(0);
                this.a--;
                s(t);
                return x;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public void I(InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException {
            int N = N();
            if (this.a < this.b) {
                int t = t(N);
                this.a++;
                aVar.y3(this, c3151Hj0);
                a(0);
                this.a--;
                s(t);
                return;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public byte J() throws IOException {
            if (m0() == 0) {
                n0();
            }
            long j = this.t;
            this.t = 1 + j;
            return TB2.y(j);
        }

        @Override // o.KE
        public byte[] K(int i) throws IOException {
            if (i >= 0) {
                long j = i;
                if (j <= m0()) {
                    byte[] bArr = new byte[i];
                    TB2.n(this.t, bArr, 0L, j);
                    this.t += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= q0()) {
                byte[] bArr2 = new byte[i];
                o0(bArr2, 0, i);
                return bArr2;
            } else if (i <= 0) {
                if (i == 0) {
                    return C9740tS0.d;
                }
                throw C9258rT0.g();
            } else {
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public int L() throws IOException {
            if (m0() >= 4) {
                long j = this.t;
                this.t = 4 + j;
                return ((TB2.y(j + 3) & 255) << 24) | (TB2.y(j) & 255) | ((TB2.y(1 + j) & 255) << 8) | ((TB2.y(2 + j) & 255) << 16);
            }
            return (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24);
        }

        @Override // o.KE
        public long M() throws IOException {
            char c;
            long J;
            byte J2;
            if (m0() >= 8) {
                long j = this.t;
                this.t = 8 + j;
                c = '8';
                J = (TB2.y(j) & 255) | ((TB2.y(1 + j) & 255) << 8) | ((TB2.y(2 + j) & 255) << 16) | ((TB2.y(3 + j) & 255) << 24) | ((TB2.y(4 + j) & 255) << 32) | ((TB2.y(5 + j) & 255) << 40) | ((TB2.y(6 + j) & 255) << 48);
                J2 = TB2.y(j + 7);
            } else {
                c = '8';
                J = (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24) | ((J() & 255) << 32) | ((J() & 255) << 40) | ((J() & 255) << 48);
                J2 = J();
            }
            return J | ((J2 & 255) << c);
        }

        @Override // o.KE
        public int N() throws IOException {
            int i;
            long j = this.t;
            if (this.w != j) {
                long j2 = j + 1;
                byte y = TB2.y(j);
                if (y >= 0) {
                    this.t++;
                    return y;
                } else if (this.w - this.t >= 10) {
                    long j3 = 2 + j;
                    int y2 = (TB2.y(j2) << 7) ^ y;
                    if (y2 < 0) {
                        i = y2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int y3 = (TB2.y(j3) << C8077mf.p) ^ y2;
                        if (y3 >= 0) {
                            i = y3 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int y4 = y3 ^ (TB2.y(j4) << C8077mf.y);
                            if (y4 < 0) {
                                i = (-2080896) ^ y4;
                            } else {
                                j4 = 5 + j;
                                byte y5 = TB2.y(j5);
                                int i2 = (y4 ^ (y5 << 28)) ^ 266354560;
                                if (y5 < 0) {
                                    j5 = 6 + j;
                                    if (TB2.y(j4) < 0) {
                                        j4 = 7 + j;
                                        if (TB2.y(j5) < 0) {
                                            j5 = 8 + j;
                                            if (TB2.y(j4) < 0) {
                                                j4 = 9 + j;
                                                if (TB2.y(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (TB2.y(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.t = j3;
                    return i;
                }
            }
            return (int) R();
        }

        @Override // o.KE
        public long Q() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.t;
            if (this.w != j4) {
                long j5 = j4 + 1;
                byte y = TB2.y(j4);
                if (y >= 0) {
                    this.t++;
                    return y;
                } else if (this.w - this.t >= 10) {
                    long j6 = 2 + j4;
                    int y2 = (TB2.y(j5) << 7) ^ y;
                    if (y2 < 0) {
                        j = y2 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int y3 = (TB2.y(j6) << C8077mf.p) ^ y2;
                        if (y3 >= 0) {
                            j = y3 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int y4 = y3 ^ (TB2.y(j7) << C8077mf.y);
                            if (y4 < 0) {
                                j = (-2080896) ^ y4;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long y5 = (TB2.y(j8) << 28) ^ y4;
                                if (y5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long y6 = y5 ^ (TB2.y(j9) << 35);
                                    if (y6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        y5 = y6 ^ (TB2.y(j10) << 42);
                                        if (y5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            y6 = y5 ^ (TB2.y(j9) << 49);
                                            if (y6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long y7 = (y6 ^ (TB2.y(j10) << 56)) ^ 71499008037633920L;
                                                if (y7 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (TB2.y(j9) >= 0) {
                                                        j6 = j11;
                                                        j = y7;
                                                    }
                                                } else {
                                                    j = y7;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ y6;
                                    j6 = j10;
                                }
                                j = j3 ^ y5;
                                j6 = j9;
                            }
                        }
                    }
                    this.t = j6;
                    return j;
                }
            }
            return R();
        }

        @Override // o.KE
        public long R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = J();
                j |= (J & Byte.MAX_VALUE) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.KE
        public int S() throws IOException {
            return L();
        }

        @Override // o.KE
        public long T() throws IOException {
            return M();
        }

        @Override // o.KE
        public int U() throws IOException {
            return KE.b(N());
        }

        @Override // o.KE
        public long V() throws IOException {
            return KE.c(Q());
        }

        @Override // o.KE
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                long j = N;
                long j2 = this.w;
                long j3 = this.t;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[N];
                    TB2.n(j3, bArr, 0L, j);
                    String str = new String(bArr, C9740tS0.a);
                    this.t += j;
                    return str;
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return new String(bArr2, C9740tS0.a);
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw C9258rT0.g();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public String X() throws IOException {
            int N = N();
            if (N > 0) {
                long j = N;
                long j2 = this.w;
                long j3 = this.t;
                if (j <= j2 - j3) {
                    String g = BD2.g(this.k, (int) (j3 - this.u), N);
                    this.t += j;
                    return g;
                }
            }
            if (N >= 0 && N <= q0()) {
                byte[] bArr = new byte[N];
                o0(bArr, 0, N);
                return BD2.h(bArr, 0, N);
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw C9258rT0.g();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public int Y() throws IOException {
            if (i()) {
                this.q = 0;
                return 0;
            }
            int N = N();
            this.q = N;
            if (IM2.a(N) != 0) {
                return this.q;
            }
            throw C9258rT0.c();
        }

        @Override // o.KE
        public int Z() throws IOException {
            return N();
        }

        @Override // o.KE
        public void a(int i) throws C9258rT0 {
            if (this.q == i) {
                return;
            }
            throw C9258rT0.b();
        }

        @Override // o.KE
        public long a0() throws IOException {
            return Q();
        }

        @Override // o.KE
        @Deprecated
        public void b0(int i, InterfaceC3540Li1.a aVar) throws IOException {
            E(i, aVar, C3151Hj0.d());
        }

        @Override // o.KE
        public void c0() {
            this.s = (int) ((this.r + this.t) - this.u);
        }

        @Override // o.KE
        public void e(boolean z) {
            this.m = z;
        }

        @Override // o.KE
        public int f() {
            int i = this.p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - h();
        }

        @Override // o.KE
        public int g() {
            return this.q;
        }

        @Override // o.KE
        public boolean g0(int i) throws IOException {
            int b = IM2.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    k0(4);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            return false;
                        }
                        i0();
                        a(IM2.c(IM2.a(i), 4));
                        return true;
                    }
                    k0(N());
                    return true;
                }
                k0(8);
                return true;
            }
            r0();
            return true;
        }

        @Override // o.KE
        public int h() {
            return (int) (((this.r - this.s) + this.t) - this.u);
        }

        @Override // o.KE
        public boolean h0(int i, ME me) throws IOException {
            int b = IM2.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    int L = L();
                                    me.Z1(i);
                                    me.C1(L);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            return false;
                        }
                        me.Z1(i);
                        j0(me);
                        int c = IM2.c(IM2.a(i), 4);
                        a(c);
                        me.Z1(c);
                        return true;
                    }
                    AbstractC8616os x = x();
                    me.Z1(i);
                    me.z1(x);
                    return true;
                }
                long M = M();
                me.Z1(i);
                me.D1(M);
                return true;
            }
            long G = G();
            me.Z1(i);
            me.i2(G);
            return true;
        }

        @Override // o.KE
        public boolean i() throws IOException {
            if ((this.r + this.t) - this.u == this.n) {
                return true;
            }
            return false;
        }

        @Override // o.KE
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // o.KE
        public void j0(ME me) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, me));
        }

        @Override // o.KE
        public void k0(int i) throws IOException {
            if (i >= 0 && i <= ((this.n - this.r) - this.t) + this.u) {
                while (i > 0) {
                    if (m0() == 0) {
                        n0();
                    }
                    int min = Math.min(i, (int) m0());
                    i -= min;
                    this.t += min;
                }
            } else if (i < 0) {
                throw C9258rT0.g();
            } else {
                throw C9258rT0.l();
            }
        }

        public final long m0() {
            return this.w - this.t;
        }

        public final void n0() throws C9258rT0 {
            if (this.j.hasNext()) {
                t0();
                return;
            }
            throw C9258rT0.l();
        }

        public final void o0(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= q0()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (m0() == 0) {
                        n0();
                    }
                    int min = Math.min(i3, (int) m0());
                    long j = min;
                    TB2.n(this.t, bArr, (i2 - i3) + i, j);
                    i3 -= min;
                    this.t += j;
                }
            } else if (i2 <= 0) {
                if (i2 == 0) {
                    return;
                }
                throw C9258rT0.g();
            } else {
                throw C9258rT0.l();
            }
        }

        public final int q0() {
            return (int) (((this.n - this.r) - this.t) + this.u);
        }

        @Override // o.KE
        public void s(int i) {
            this.p = i;
            p0();
        }

        public final ByteBuffer s0(int i, int i2) throws IOException {
            int position = this.k.position();
            int limit = this.k.limit();
            try {
                try {
                    this.k.position(i);
                    this.k.limit(i2);
                    return this.k.slice();
                } catch (IllegalArgumentException unused) {
                    throw C9258rT0.l();
                }
            } finally {
                this.k.position(position);
                this.k.limit(limit);
            }
        }

        @Override // o.KE
        public int t(int i) throws C9258rT0 {
            if (i >= 0) {
                int h = i + h();
                int i2 = this.p;
                if (h <= i2) {
                    this.p = h;
                    p0();
                    return i2;
                }
                throw C9258rT0.l();
            }
            throw C9258rT0.g();
        }

        public final void t0() {
            ByteBuffer next = this.j.next();
            this.k = next;
            this.r += (int) (this.t - this.u);
            long position = next.position();
            this.t = position;
            this.u = position;
            this.w = this.k.limit();
            long i = TB2.i(this.k);
            this.v = i;
            this.t += i;
            this.u += i;
            this.w += i;
        }

        @Override // o.KE
        public boolean u() throws IOException {
            if (Q() != 0) {
                return true;
            }
            return false;
        }

        @Override // o.KE
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // o.KE
        public ByteBuffer w() throws IOException {
            int N = N();
            if (N > 0) {
                long j = N;
                if (j <= m0()) {
                    if (!this.l && this.m) {
                        long j2 = this.t + j;
                        this.t = j2;
                        long j3 = this.v;
                        return s0((int) ((j2 - j3) - j), (int) (j2 - j3));
                    }
                    byte[] bArr = new byte[N];
                    TB2.n(this.t, bArr, 0L, j);
                    this.t += j;
                    return ByteBuffer.wrap(bArr);
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return ByteBuffer.wrap(bArr2);
            } else if (N == 0) {
                return C9740tS0.e;
            } else {
                if (N < 0) {
                    throw C9258rT0.g();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public AbstractC8616os x() throws IOException {
            int N = N();
            if (N > 0) {
                long j = N;
                long j2 = this.w;
                long j3 = this.t;
                if (j <= j2 - j3) {
                    if (this.l && this.m) {
                        int i = (int) (j3 - this.v);
                        AbstractC8616os E0 = AbstractC8616os.E0(s0(i, N + i));
                        this.t += j;
                        return E0;
                    }
                    byte[] bArr = new byte[N];
                    TB2.n(j3, bArr, 0L, j);
                    this.t += j;
                    return AbstractC8616os.F0(bArr);
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return AbstractC8616os.F0(bArr2);
            } else if (N == 0) {
                return AbstractC8616os.Z0;
            } else {
                if (N < 0) {
                    throw C9258rT0.g();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // o.KE
        public int z() throws IOException {
            return N();
        }

        public c(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.p = Integer.MAX_VALUE;
            this.n = i;
            this.i = iterable;
            this.j = iterable.iterator();
            this.l = z;
            this.r = 0;
            this.s = 0;
            if (i == 0) {
                this.k = C9740tS0.e;
                this.t = 0L;
                this.u = 0L;
                this.w = 0L;
                this.v = 0L;
                return;
            }
            t0();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends KE {
        public final InputStream i;
        public final byte[] j;
        public int k;
        public int l;
        public int m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f511o;
        public int p;
        public a q;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public class b implements a {
            public int a;
            public ByteArrayOutputStream b;

            public b() {
                this.a = d.this.m;
            }

            @Override // o.KE.d.a
            public void a() {
                if (this.b == null) {
                    this.b = new ByteArrayOutputStream();
                }
                this.b.write(d.this.j, this.a, d.this.m - this.a);
                this.a = 0;
            }

            public ByteBuffer b() {
                ByteArrayOutputStream byteArrayOutputStream = this.b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(d.this.j, this.a, d.this.m - this.a);
                }
                byteArrayOutputStream.write(d.this.j, this.a, d.this.m);
                return ByteBuffer.wrap(this.b.toByteArray());
            }
        }

        private void s0() {
            int i = this.k + this.l;
            this.k = i;
            int i2 = this.f511o + i;
            int i3 = this.p;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.l = i4;
                this.k = i - i4;
                return;
            }
            this.l = 0;
        }

        private void v0() throws IOException {
            if (this.k - this.m >= 10) {
                w0();
            } else {
                x0();
            }
        }

        private void w0() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.j;
                int i2 = this.m;
                this.m = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw C9258rT0.f();
        }

        private void x0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.KE
        public int A() throws IOException {
            return L();
        }

        @Override // o.KE
        public long B() throws IOException {
            return M();
        }

        @Override // o.KE
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // o.KE
        public <T extends InterfaceC3540Li1> T D(int i, InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                T x = interfaceC3892Oy1.x(this, c3151Hj0);
                a(IM2.c(i, 4));
                this.a--;
                return x;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public void E(int i, InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                aVar.y3(this, c3151Hj0);
                a(IM2.c(i, 4));
                this.a--;
                return;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public int F() throws IOException {
            return N();
        }

        @Override // o.KE
        public long G() throws IOException {
            return Q();
        }

        @Override // o.KE
        public <T extends InterfaceC3540Li1> T H(InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException {
            int N = N();
            if (this.a < this.b) {
                int t = t(N);
                this.a++;
                T x = interfaceC3892Oy1.x(this, c3151Hj0);
                a(0);
                this.a--;
                s(t);
                return x;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public void I(InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException {
            int N = N();
            if (this.a < this.b) {
                int t = t(N);
                this.a++;
                aVar.y3(this, c3151Hj0);
                a(0);
                this.a--;
                s(t);
                return;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public byte J() throws IOException {
            if (this.m == this.k) {
                t0(1);
            }
            byte[] bArr = this.j;
            int i = this.m;
            this.m = i + 1;
            return bArr[i];
        }

        @Override // o.KE
        public byte[] K(int i) throws IOException {
            int i2 = this.m;
            if (i <= this.k - i2 && i > 0) {
                int i3 = i + i2;
                this.m = i3;
                return Arrays.copyOfRange(this.j, i2, i3);
            }
            return p0(i, false);
        }

        @Override // o.KE
        public int L() throws IOException {
            int i = this.m;
            if (this.k - i < 4) {
                t0(4);
                i = this.m;
            }
            byte[] bArr = this.j;
            this.m = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // o.KE
        public long M() throws IOException {
            int i = this.m;
            if (this.k - i < 8) {
                t0(8);
                i = this.m;
            }
            byte[] bArr = this.j;
            this.m = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // o.KE
        public int N() throws IOException {
            int i;
            int i2 = this.m;
            int i3 = this.k;
            if (i3 != i2) {
                byte[] bArr = this.j;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.m = i4;
                    return b2;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << C8077mf.p) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << C8077mf.y);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b3 = bArr[i9];
                                int i11 = (i10 ^ (b3 << 28)) ^ 266354560;
                                if (b3 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.m = i5;
                    return i;
                }
            }
            return (int) R();
        }

        @Override // o.KE
        public long Q() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.m;
            int i2 = this.k;
            if (i2 != i) {
                byte[] bArr = this.j;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.m = i3;
                    return b2;
                } else if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b2;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << C8077mf.p) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << C8077mf.y);
                            if (i9 < 0) {
                                i4 = i8;
                                j = (-2080896) ^ i9;
                            } else {
                                long j4 = i9;
                                i4 = i + 5;
                                long j5 = j4 ^ (bArr[i8] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j6 = j5 ^ (bArr[i4] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j5 = j6 ^ (bArr[i10] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j6 = j5 ^ (bArr[i4] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                    i4 = i10;
                                }
                                j = j5 ^ j3;
                            }
                        }
                    }
                    this.m = i4;
                    return j;
                }
            }
            return R();
        }

        @Override // o.KE
        public long R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = J();
                j |= (J & Byte.MAX_VALUE) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.KE
        public int S() throws IOException {
            return L();
        }

        @Override // o.KE
        public long T() throws IOException {
            return M();
        }

        @Override // o.KE
        public int U() throws IOException {
            return KE.b(N());
        }

        @Override // o.KE
        public long V() throws IOException {
            return KE.c(Q());
        }

        @Override // o.KE
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                int i = this.k;
                int i2 = this.m;
                if (N <= i - i2) {
                    String str = new String(this.j, i2, N, C9740tS0.a);
                    this.m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= this.k) {
                t0(N);
                String str2 = new String(this.j, this.m, N, C9740tS0.a);
                this.m += N;
                return str2;
            }
            return new String(p0(N, false), C9740tS0.a);
        }

        @Override // o.KE
        public String X() throws IOException {
            byte[] p0;
            int N = N();
            int i = this.m;
            int i2 = this.k;
            if (N <= i2 - i && N > 0) {
                p0 = this.j;
                this.m = i + N;
            } else if (N == 0) {
                return "";
            } else {
                i = 0;
                if (N <= i2) {
                    t0(N);
                    p0 = this.j;
                    this.m = N;
                } else {
                    p0 = p0(N, false);
                }
            }
            return BD2.h(p0, i, N);
        }

        @Override // o.KE
        public int Y() throws IOException {
            if (i()) {
                this.n = 0;
                return 0;
            }
            int N = N();
            this.n = N;
            if (IM2.a(N) != 0) {
                return this.n;
            }
            throw C9258rT0.c();
        }

        @Override // o.KE
        public int Z() throws IOException {
            return N();
        }

        @Override // o.KE
        public void a(int i) throws C9258rT0 {
            if (this.n == i) {
                return;
            }
            throw C9258rT0.b();
        }

        @Override // o.KE
        public long a0() throws IOException {
            return Q();
        }

        @Override // o.KE
        @Deprecated
        public void b0(int i, InterfaceC3540Li1.a aVar) throws IOException {
            E(i, aVar, C3151Hj0.d());
        }

        @Override // o.KE
        public void c0() {
            this.f511o = -this.m;
        }

        @Override // o.KE
        public int f() {
            int i = this.p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f511o + this.m);
        }

        @Override // o.KE
        public int g() {
            return this.n;
        }

        @Override // o.KE
        public boolean g0(int i) throws IOException {
            int b2 = IM2.b(i);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 != 4) {
                                if (b2 == 5) {
                                    k0(4);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            return false;
                        }
                        i0();
                        a(IM2.c(IM2.a(i), 4));
                        return true;
                    }
                    k0(N());
                    return true;
                }
                k0(8);
                return true;
            }
            v0();
            return true;
        }

        @Override // o.KE
        public int h() {
            return this.f511o + this.m;
        }

        @Override // o.KE
        public boolean h0(int i, ME me) throws IOException {
            int b2 = IM2.b(i);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 != 4) {
                                if (b2 == 5) {
                                    int L = L();
                                    me.Z1(i);
                                    me.C1(L);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            return false;
                        }
                        me.Z1(i);
                        j0(me);
                        int c = IM2.c(IM2.a(i), 4);
                        a(c);
                        me.Z1(c);
                        return true;
                    }
                    AbstractC8616os x = x();
                    me.Z1(i);
                    me.z1(x);
                    return true;
                }
                long M = M();
                me.Z1(i);
                me.D1(M);
                return true;
            }
            long G = G();
            me.Z1(i);
            me.i2(G);
            return true;
        }

        @Override // o.KE
        public boolean i() throws IOException {
            if (this.m == this.k && !y0(1)) {
                return true;
            }
            return false;
        }

        @Override // o.KE
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // o.KE
        public void j0(ME me) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, me));
        }

        @Override // o.KE
        public void k0(int i) throws IOException {
            int i2 = this.k;
            int i3 = this.m;
            if (i <= i2 - i3 && i >= 0) {
                this.m = i3 + i;
            } else {
                u0(i);
            }
        }

        public final AbstractC8616os o0(int i) throws IOException {
            byte[] q0 = q0(i);
            if (q0 != null) {
                return AbstractC8616os.F(q0);
            }
            int i2 = this.m;
            int i3 = this.k;
            int i4 = i3 - i2;
            this.f511o += i3;
            this.m = 0;
            this.k = 0;
            List<byte[]> r0 = r0(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.j, i2, bArr, 0, i4);
            for (byte[] bArr2 : r0) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return AbstractC8616os.F0(bArr);
        }

        public final byte[] p0(int i, boolean z) throws IOException {
            byte[] q0 = q0(i);
            if (q0 != null) {
                if (z) {
                    return (byte[]) q0.clone();
                }
                return q0;
            }
            int i2 = this.m;
            int i3 = this.k;
            int i4 = i3 - i2;
            this.f511o += i3;
            this.m = 0;
            this.k = 0;
            List<byte[]> r0 = r0(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.j, i2, bArr, 0, i4);
            for (byte[] bArr2 : r0) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] q0(int i) throws IOException {
            if (i == 0) {
                return C9740tS0.d;
            }
            if (i >= 0) {
                int i2 = this.f511o;
                int i3 = this.m;
                int i4 = i2 + i3 + i;
                if (i4 - this.c <= 0) {
                    int i5 = this.p;
                    if (i4 <= i5) {
                        int i6 = this.k - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.i.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.j, this.m, bArr, 0, i6);
                        this.f511o += this.k;
                        this.m = 0;
                        this.k = 0;
                        while (i6 < i) {
                            int read = this.i.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f511o += read;
                                i6 += read;
                            } else {
                                throw C9258rT0.l();
                            }
                        }
                        return bArr;
                    }
                    k0((i5 - i2) - i3);
                    throw C9258rT0.l();
                }
                throw C9258rT0.k();
            }
            throw C9258rT0.g();
        }

        public final List<byte[]> r0(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.i.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f511o += read;
                        i2 += read;
                    } else {
                        throw C9258rT0.l();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        @Override // o.KE
        public void s(int i) {
            this.p = i;
            s0();
        }

        @Override // o.KE
        public int t(int i) throws C9258rT0 {
            if (i >= 0) {
                int i2 = i + this.f511o + this.m;
                int i3 = this.p;
                if (i2 <= i3) {
                    this.p = i2;
                    s0();
                    return i3;
                }
                throw C9258rT0.l();
            }
            throw C9258rT0.g();
        }

        public final void t0(int i) throws IOException {
            if (!y0(i)) {
                if (i > (this.c - this.f511o) - this.m) {
                    throw C9258rT0.k();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public boolean u() throws IOException {
            if (Q() != 0) {
                return true;
            }
            return false;
        }

        public final void u0(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f511o;
                int i3 = this.m;
                int i4 = i2 + i3 + i;
                int i5 = this.p;
                if (i4 <= i5) {
                    int i6 = 0;
                    if (this.q == null) {
                        this.f511o = i2 + i3;
                        this.k = 0;
                        this.m = 0;
                        i6 = this.k - i3;
                        while (i6 < i) {
                            try {
                                long j = i - i6;
                                long skip = this.i.skip(j);
                                int i7 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                                if (i7 >= 0 && skip <= j) {
                                    if (i7 == 0) {
                                        break;
                                    }
                                    i6 += (int) skip;
                                } else {
                                    throw new IllegalStateException(this.i.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                                }
                            } finally {
                                this.f511o += i6;
                                s0();
                            }
                        }
                    }
                    if (i6 < i) {
                        int i8 = this.k;
                        int i9 = i8 - this.m;
                        this.m = i8;
                        t0(1);
                        while (true) {
                            int i10 = i - i9;
                            int i11 = this.k;
                            if (i10 > i11) {
                                i9 += i11;
                                this.m = i11;
                                t0(1);
                            } else {
                                this.m = i10;
                                return;
                            }
                        }
                    }
                } else {
                    k0((i5 - i2) - i3);
                    throw C9258rT0.l();
                }
            } else {
                throw C9258rT0.g();
            }
        }

        @Override // o.KE
        public byte[] v() throws IOException {
            int N = N();
            int i = this.k;
            int i2 = this.m;
            if (N <= i - i2 && N > 0) {
                byte[] copyOfRange = Arrays.copyOfRange(this.j, i2, i2 + N);
                this.m += N;
                return copyOfRange;
            }
            return p0(N, false);
        }

        @Override // o.KE
        public ByteBuffer w() throws IOException {
            int N = N();
            int i = this.k;
            int i2 = this.m;
            if (N <= i - i2 && N > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.j, i2, i2 + N));
                this.m += N;
                return wrap;
            } else if (N == 0) {
                return C9740tS0.e;
            } else {
                return ByteBuffer.wrap(p0(N, true));
            }
        }

        @Override // o.KE
        public AbstractC8616os x() throws IOException {
            int N = N();
            int i = this.k;
            int i2 = this.m;
            if (N <= i - i2 && N > 0) {
                AbstractC8616os G = AbstractC8616os.G(this.j, i2, N);
                this.m += N;
                return G;
            } else if (N == 0) {
                return AbstractC8616os.Z0;
            } else {
                return o0(N);
            }
        }

        @Override // o.KE
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        public final boolean y0(int i) throws IOException {
            int i2 = this.m;
            if (i2 + i > this.k) {
                int i3 = this.c;
                int i4 = this.f511o;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.p) {
                    return false;
                }
                a aVar = this.q;
                if (aVar != null) {
                    aVar.a();
                }
                int i5 = this.m;
                if (i5 > 0) {
                    int i6 = this.k;
                    if (i6 > i5) {
                        byte[] bArr = this.j;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f511o += i5;
                    this.k -= i5;
                    this.m = 0;
                }
                InputStream inputStream = this.i;
                byte[] bArr2 = this.j;
                int i7 = this.k;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.f511o) - i7));
                if (read != 0 && read >= -1 && read <= this.j.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.k += read;
                    s0();
                    if (this.k >= i) {
                        return true;
                    }
                    return y0(i);
                }
                throw new IllegalStateException(this.i.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }

        @Override // o.KE
        public int z() throws IOException {
            return N();
        }

        public d(InputStream inputStream, int i) {
            super();
            this.p = Integer.MAX_VALUE;
            this.q = null;
            C9740tS0.e(inputStream, "input");
            this.i = inputStream;
            this.j = new byte[i];
            this.k = 0;
            this.m = 0;
            this.f511o = 0;
        }

        @Override // o.KE
        public void e(boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends KE {
        public final ByteBuffer i;
        public final boolean j;
        public final long k;
        public long l;
        public long m;
        public long n;

        /* renamed from: o  reason: collision with root package name */
        public int f512o;
        public int p;
        public boolean q;
        public int r;

        public static boolean n0() {
            return TB2.T();
        }

        private void o0() {
            long j = this.l + this.f512o;
            this.l = j;
            int i = (int) (j - this.n);
            int i2 = this.r;
            if (i > i2) {
                int i3 = i - i2;
                this.f512o = i3;
                this.l = j - i3;
                return;
            }
            this.f512o = 0;
        }

        private int p0() {
            return (int) (this.l - this.m);
        }

        private void q0() throws IOException {
            if (p0() >= 10) {
                r0();
            } else {
                s0();
            }
        }

        private void r0() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.m;
                this.m = 1 + j;
                if (TB2.y(j) >= 0) {
                    return;
                }
            }
            throw C9258rT0.f();
        }

        private void s0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.KE
        public int A() throws IOException {
            return L();
        }

        @Override // o.KE
        public long B() throws IOException {
            return M();
        }

        @Override // o.KE
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // o.KE
        public <T extends InterfaceC3540Li1> T D(int i, InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                T x = interfaceC3892Oy1.x(this, c3151Hj0);
                a(IM2.c(i, 4));
                this.a--;
                return x;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public void E(int i, InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                aVar.y3(this, c3151Hj0);
                a(IM2.c(i, 4));
                this.a--;
                return;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public int F() throws IOException {
            return N();
        }

        @Override // o.KE
        public long G() throws IOException {
            return Q();
        }

        @Override // o.KE
        public <T extends InterfaceC3540Li1> T H(InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException {
            int N = N();
            if (this.a < this.b) {
                int t = t(N);
                this.a++;
                T x = interfaceC3892Oy1.x(this, c3151Hj0);
                a(0);
                this.a--;
                s(t);
                return x;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public void I(InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException {
            int N = N();
            if (this.a < this.b) {
                int t = t(N);
                this.a++;
                aVar.y3(this, c3151Hj0);
                a(0);
                this.a--;
                s(t);
                return;
            }
            throw C9258rT0.i();
        }

        @Override // o.KE
        public byte J() throws IOException {
            long j = this.m;
            if (j != this.l) {
                this.m = 1 + j;
                return TB2.y(j);
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public byte[] K(int i) throws IOException {
            if (i >= 0 && i <= p0()) {
                byte[] bArr = new byte[i];
                long j = this.m;
                long j2 = i;
                t0(j, j + j2).get(bArr);
                this.m += j2;
                return bArr;
            } else if (i <= 0) {
                if (i == 0) {
                    return C9740tS0.d;
                }
                throw C9258rT0.g();
            } else {
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public int L() throws IOException {
            long j = this.m;
            if (this.l - j >= 4) {
                this.m = 4 + j;
                return ((TB2.y(j + 3) & 255) << 24) | (TB2.y(j) & 255) | ((TB2.y(1 + j) & 255) << 8) | ((TB2.y(2 + j) & 255) << 16);
            }
            throw C9258rT0.l();
        }

        @Override // o.KE
        public long M() throws IOException {
            long j = this.m;
            if (this.l - j >= 8) {
                this.m = 8 + j;
                return ((TB2.y(j + 7) & 255) << 56) | (TB2.y(j) & 255) | ((TB2.y(1 + j) & 255) << 8) | ((TB2.y(2 + j) & 255) << 16) | ((TB2.y(3 + j) & 255) << 24) | ((TB2.y(4 + j) & 255) << 32) | ((TB2.y(5 + j) & 255) << 40) | ((TB2.y(6 + j) & 255) << 48);
            }
            throw C9258rT0.l();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
            if (o.TB2.y(r3) < 0) goto L36;
         */
        @Override // o.KE
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int N() throws IOException {
            int i;
            long j = this.m;
            if (this.l != j) {
                long j2 = 1 + j;
                byte y = TB2.y(j);
                if (y >= 0) {
                    this.m = j2;
                    return y;
                } else if (this.l - j2 >= 9) {
                    long j3 = 2 + j;
                    int y2 = (TB2.y(j2) << 7) ^ y;
                    if (y2 < 0) {
                        i = y2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int y3 = y2 ^ (TB2.y(j3) << C8077mf.p);
                        if (y3 >= 0) {
                            i = y3 ^ 16256;
                        } else {
                            j3 = 4 + j;
                            int y4 = y3 ^ (TB2.y(j4) << C8077mf.y);
                            if (y4 < 0) {
                                i = (-2080896) ^ y4;
                            } else {
                                j4 = 5 + j;
                                byte y5 = TB2.y(j3);
                                int i2 = (y4 ^ (y5 << 28)) ^ 266354560;
                                if (y5 < 0) {
                                    j3 = 6 + j;
                                    if (TB2.y(j4) < 0) {
                                        j4 = 7 + j;
                                        if (TB2.y(j3) < 0) {
                                            j3 = 8 + j;
                                            if (TB2.y(j4) < 0) {
                                                j4 = j + 9;
                                                if (TB2.y(j3) < 0) {
                                                    j3 = 10 + j;
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                        }
                        j3 = j4;
                    }
                    this.m = j3;
                    return i;
                }
            }
            return (int) R();
        }

        @Override // o.KE
        public long Q() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.m;
            if (this.l != j4) {
                long j5 = 1 + j4;
                byte y = TB2.y(j4);
                if (y >= 0) {
                    this.m = j5;
                    return y;
                } else if (this.l - j5 >= 9) {
                    long j6 = 2 + j4;
                    int y2 = (TB2.y(j5) << 7) ^ y;
                    if (y2 < 0) {
                        i = y2 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int y3 = y2 ^ (TB2.y(j6) << C8077mf.p);
                        if (y3 >= 0) {
                            j = y3 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int y4 = y3 ^ (TB2.y(j7) << C8077mf.y);
                            if (y4 < 0) {
                                i = (-2080896) ^ y4;
                            } else {
                                long j8 = 5 + j4;
                                long y5 = y4 ^ (TB2.y(j6) << 28);
                                if (y5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long y6 = y5 ^ (TB2.y(j8) << 35);
                                    if (y6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        y5 = y6 ^ (TB2.y(j9) << 42);
                                        if (y5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            y6 = y5 ^ (TB2.y(j8) << 49);
                                            if (y6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long y7 = (y6 ^ (TB2.y(j9) << 56)) ^ 71499008037633920L;
                                                if (y7 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (TB2.y(j10) >= 0) {
                                                        j6 = j11;
                                                        j = y7;
                                                    }
                                                } else {
                                                    j = y7;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ y6;
                                    j6 = j9;
                                }
                                j = j3 ^ y5;
                                j6 = j8;
                            }
                        }
                        this.m = j6;
                        return j;
                    }
                    j = i;
                    this.m = j6;
                    return j;
                }
            }
            return R();
        }

        @Override // o.KE
        public long R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = J();
                j |= (J & Byte.MAX_VALUE) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.KE
        public int S() throws IOException {
            return L();
        }

        @Override // o.KE
        public long T() throws IOException {
            return M();
        }

        @Override // o.KE
        public int U() throws IOException {
            return KE.b(N());
        }

        @Override // o.KE
        public long V() throws IOException {
            return KE.c(Q());
        }

        @Override // o.KE
        public String W() throws IOException {
            int N = N();
            if (N > 0 && N <= p0()) {
                byte[] bArr = new byte[N];
                long j = N;
                TB2.n(this.m, bArr, 0L, j);
                String str = new String(bArr, C9740tS0.a);
                this.m += j;
                return str;
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw C9258rT0.g();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public String X() throws IOException {
            int N = N();
            if (N > 0 && N <= p0()) {
                String g = BD2.g(this.i, m0(this.m), N);
                this.m += N;
                return g;
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw C9258rT0.g();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public int Y() throws IOException {
            if (i()) {
                this.p = 0;
                return 0;
            }
            int N = N();
            this.p = N;
            if (IM2.a(N) != 0) {
                return this.p;
            }
            throw C9258rT0.c();
        }

        @Override // o.KE
        public int Z() throws IOException {
            return N();
        }

        @Override // o.KE
        public void a(int i) throws C9258rT0 {
            if (this.p == i) {
                return;
            }
            throw C9258rT0.b();
        }

        @Override // o.KE
        public long a0() throws IOException {
            return Q();
        }

        @Override // o.KE
        @Deprecated
        public void b0(int i, InterfaceC3540Li1.a aVar) throws IOException {
            E(i, aVar, C3151Hj0.d());
        }

        @Override // o.KE
        public void c0() {
            this.n = this.m;
        }

        @Override // o.KE
        public void e(boolean z) {
            this.q = z;
        }

        @Override // o.KE
        public int f() {
            int i = this.r;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - h();
        }

        @Override // o.KE
        public int g() {
            return this.p;
        }

        @Override // o.KE
        public boolean g0(int i) throws IOException {
            int b = IM2.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    k0(4);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            return false;
                        }
                        i0();
                        a(IM2.c(IM2.a(i), 4));
                        return true;
                    }
                    k0(N());
                    return true;
                }
                k0(8);
                return true;
            }
            q0();
            return true;
        }

        @Override // o.KE
        public int h() {
            return (int) (this.m - this.n);
        }

        @Override // o.KE
        public boolean h0(int i, ME me) throws IOException {
            int b = IM2.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    int L = L();
                                    me.Z1(i);
                                    me.C1(L);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            return false;
                        }
                        me.Z1(i);
                        j0(me);
                        int c = IM2.c(IM2.a(i), 4);
                        a(c);
                        me.Z1(c);
                        return true;
                    }
                    AbstractC8616os x = x();
                    me.Z1(i);
                    me.z1(x);
                    return true;
                }
                long M = M();
                me.Z1(i);
                me.D1(M);
                return true;
            }
            long G = G();
            me.Z1(i);
            me.i2(G);
            return true;
        }

        @Override // o.KE
        public boolean i() throws IOException {
            if (this.m == this.l) {
                return true;
            }
            return false;
        }

        @Override // o.KE
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // o.KE
        public void j0(ME me) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, me));
        }

        @Override // o.KE
        public void k0(int i) throws IOException {
            if (i >= 0 && i <= p0()) {
                this.m += i;
            } else if (i < 0) {
                throw C9258rT0.g();
            } else {
                throw C9258rT0.l();
            }
        }

        public final int m0(long j) {
            return (int) (j - this.k);
        }

        @Override // o.KE
        public void s(int i) {
            this.r = i;
            o0();
        }

        @Override // o.KE
        public int t(int i) throws C9258rT0 {
            if (i >= 0) {
                int h = i + h();
                int i2 = this.r;
                if (h <= i2) {
                    this.r = h;
                    o0();
                    return i2;
                }
                throw C9258rT0.l();
            }
            throw C9258rT0.g();
        }

        public final ByteBuffer t0(long j, long j2) throws IOException {
            int position = this.i.position();
            int limit = this.i.limit();
            try {
                try {
                    this.i.position(m0(j));
                    this.i.limit(m0(j2));
                    return this.i.slice();
                } catch (IllegalArgumentException unused) {
                    throw C9258rT0.l();
                }
            } finally {
                this.i.position(position);
                this.i.limit(limit);
            }
        }

        @Override // o.KE
        public boolean u() throws IOException {
            if (Q() != 0) {
                return true;
            }
            return false;
        }

        @Override // o.KE
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // o.KE
        public ByteBuffer w() throws IOException {
            int N = N();
            if (N > 0 && N <= p0()) {
                if (!this.j && this.q) {
                    long j = this.m;
                    long j2 = N;
                    ByteBuffer t0 = t0(j, j + j2);
                    this.m += j2;
                    return t0;
                }
                byte[] bArr = new byte[N];
                long j3 = N;
                TB2.n(this.m, bArr, 0L, j3);
                this.m += j3;
                return ByteBuffer.wrap(bArr);
            } else if (N == 0) {
                return C9740tS0.e;
            } else {
                if (N < 0) {
                    throw C9258rT0.g();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public AbstractC8616os x() throws IOException {
            int N = N();
            if (N > 0 && N <= p0()) {
                if (this.j && this.q) {
                    long j = this.m;
                    long j2 = N;
                    ByteBuffer t0 = t0(j, j + j2);
                    this.m += j2;
                    return AbstractC8616os.E0(t0);
                }
                byte[] bArr = new byte[N];
                long j3 = N;
                TB2.n(this.m, bArr, 0L, j3);
                this.m += j3;
                return AbstractC8616os.F0(bArr);
            } else if (N == 0) {
                return AbstractC8616os.Z0;
            } else {
                if (N < 0) {
                    throw C9258rT0.g();
                }
                throw C9258rT0.l();
            }
        }

        @Override // o.KE
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // o.KE
        public int z() throws IOException {
            return N();
        }

        public e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.r = Integer.MAX_VALUE;
            this.i = byteBuffer;
            long i = TB2.i(byteBuffer);
            this.k = i;
            this.l = byteBuffer.limit() + i;
            long position = i + byteBuffer.position();
            this.m = position;
            this.n = position;
            this.j = z;
        }
    }

    public static int O(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C9258rT0.l();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                if ((read2 & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C9258rT0.l();
            }
        }
        throw C9258rT0.f();
    }

    public static int P(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return O(read, inputStream);
        }
        throw C9258rT0.l();
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static KE j(InputStream inputStream) {
        return k(inputStream, 4096);
    }

    public static KE k(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                return p(C9740tS0.d);
            }
            return new d(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static KE l(Iterable<ByteBuffer> iterable) {
        if (!e.n0()) {
            return j(new UT0(iterable));
        }
        return m(iterable, false);
    }

    public static KE m(Iterable<ByteBuffer> iterable, boolean z) {
        boolean z2 = false;
        int i = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z2 |= true;
            } else if (byteBuffer.isDirect()) {
                z2 |= true;
            } else {
                z2 |= true;
            }
        }
        if (z2) {
            return new c(iterable, i, z);
        }
        return j(new UT0(iterable));
    }

    public static KE n(ByteBuffer byteBuffer) {
        return o(byteBuffer, false);
    }

    public static KE o(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return r(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && e.n0()) {
            return new e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return r(bArr, 0, remaining, true);
    }

    public static KE p(byte[] bArr) {
        return q(bArr, 0, bArr.length);
    }

    public static KE q(byte[] bArr, int i, int i2) {
        return r(bArr, i, i2, false);
    }

    public static KE r(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.t(i2);
            return bVar;
        } catch (C9258rT0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract float C() throws IOException;

    public abstract <T extends InterfaceC3540Li1> T D(int i, InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException;

    public abstract void E(int i, InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract <T extends InterfaceC3540Li1> T H(InterfaceC3892Oy1<T> interfaceC3892Oy1, C3151Hj0 c3151Hj0) throws IOException;

    public abstract void I(InterfaceC3540Li1.a aVar, C3151Hj0 c3151Hj0) throws IOException;

    public abstract byte J() throws IOException;

    public abstract byte[] K(int i) throws IOException;

    public abstract int L() throws IOException;

    public abstract long M() throws IOException;

    public abstract int N() throws IOException;

    public abstract long Q() throws IOException;

    public abstract long R() throws IOException;

    public abstract int S() throws IOException;

    public abstract long T() throws IOException;

    public abstract int U() throws IOException;

    public abstract long V() throws IOException;

    public abstract String W() throws IOException;

    public abstract String X() throws IOException;

    public abstract int Y() throws IOException;

    public abstract int Z() throws IOException;

    public abstract void a(int i) throws C9258rT0;

    public abstract long a0() throws IOException;

    @Deprecated
    public abstract void b0(int i, InterfaceC3540Li1.a aVar) throws IOException;

    public abstract void c0();

    public final void d() {
        this.e = true;
    }

    public final int d0(int i) {
        if (i >= 0) {
            int i2 = this.b;
            this.b = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    public abstract void e(boolean z);

    public final int e0(int i) {
        if (i >= 0) {
            int i2 = this.c;
            this.c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    public abstract int f();

    public final boolean f0() {
        return this.e;
    }

    public abstract int g();

    public abstract boolean g0(int i) throws IOException;

    public abstract int h();

    @Deprecated
    public abstract boolean h0(int i, ME me) throws IOException;

    public abstract boolean i() throws IOException;

    public abstract void i0() throws IOException;

    public abstract void j0(ME me) throws IOException;

    public abstract void k0(int i) throws IOException;

    public final void l0() {
        this.e = false;
    }

    public abstract void s(int i);

    public abstract int t(int i) throws C9258rT0;

    public abstract boolean u() throws IOException;

    public abstract byte[] v() throws IOException;

    public abstract ByteBuffer w() throws IOException;

    public abstract AbstractC8616os x() throws IOException;

    public abstract double y() throws IOException;

    public abstract int z() throws IOException;

    public KE() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
