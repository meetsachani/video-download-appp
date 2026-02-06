package o;

import java.util.Arrays;
import java.util.Collections;
import o.C10833xx0;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class FF0 implements InterfaceC8545oa0 {
    public static final String l = "H263Reader";
    public static final int m = 176;
    public static final int n = 178;

    /* renamed from: o  reason: collision with root package name */
    public static final int f453o = 179;
    public static final int p = 181;
    public static final int q = 182;
    public static final int r = 31;
    public static final int s = -1;
    public static final float[] t = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public static final int u = 0;
    @InterfaceC11300zs1
    public final C9196rD2 a;
    @InterfaceC11300zs1
    public final C3012Fy1 b;
    public final boolean[] c;
    public final a d;
    @InterfaceC11300zs1
    public final C9088qo1 e;
    public b f;
    public long g;
    public String h;
    public InterfaceC10568wr2 i;
    public boolean j;
    public long k;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final byte[] f = {0, 0, 1};
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
        public static final int k = 4;
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int i2) {
            this.e = new byte[i2];
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (!this.a) {
                return;
            }
            int i4 = i3 - i2;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i5 = this.c;
            if (length < i5 + i4) {
                this.e = Arrays.copyOf(bArr2, (i5 + i4) * 2);
            }
            System.arraycopy(bArr, i2, this.e, this.c, i4);
            this.c += i4;
        }

        public boolean b(int i2, int i3) {
            int i4 = this.b;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                if (i2 == 179 || i2 == 181) {
                                    this.c -= i3;
                                    this.a = false;
                                    return true;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if ((i2 & 240) != 32) {
                            I31.n(FF0.l, "Unexpected start code value");
                            c();
                        } else {
                            this.d = this.c;
                            this.b = 4;
                        }
                    } else if (i2 > 31) {
                        I31.n(FF0.l, "Unexpected start code value");
                        c();
                    } else {
                        this.b = 3;
                    }
                } else if (i2 != 181) {
                    I31.n(FF0.l, "Unexpected start code value");
                    c();
                } else {
                    this.b = 2;
                }
            } else if (i2 == 176) {
                this.b = 1;
                this.a = true;
            }
            byte[] bArr = f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static final int i = 1;
        public static final int j = 0;
        public final InterfaceC10568wr2 a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(InterfaceC10568wr2 interfaceC10568wr2) {
            this.a = interfaceC10568wr2;
        }

        public void a(byte[] bArr, int i2, int i3) {
            boolean z;
            if (this.c) {
                int i4 = this.f;
                int i5 = (i2 + 1) - i4;
                if (i5 < i3) {
                    if (((bArr[i5] & C2638Cg0.o7) >> 6) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.d = z;
                    this.c = false;
                    return;
                }
                this.f = i4 + (i3 - i2);
            }
        }

        public void b(long j2, int i2, boolean z) {
            if (this.e == 182 && z && this.b) {
                long j3 = this.h;
                if (j3 != C10323vs.b) {
                    this.a.b(j3, this.d ? 1 : 0, (int) (j2 - this.g), i2, null);
                }
            }
            if (this.e != 179) {
                this.g = j2;
            }
        }

        public void c(int i2, long j2) {
            boolean z;
            this.e = i2;
            this.d = false;
            boolean z2 = true;
            if (i2 != 182 && i2 != 179) {
                z = false;
            } else {
                z = true;
            }
            this.b = z;
            if (i2 != 182) {
                z2 = false;
            }
            this.c = z2;
            this.f = 0;
            this.h = j2;
        }

        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    public FF0() {
        this(null);
    }

    public static C10833xx0 f(a aVar, int i, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.e, aVar.c);
        C2903Ey1 c2903Ey1 = new C2903Ey1(copyOf);
        c2903Ey1.t(i);
        c2903Ey1.t(4);
        c2903Ey1.r();
        c2903Ey1.s(8);
        if (c2903Ey1.g()) {
            c2903Ey1.s(4);
            c2903Ey1.s(3);
        }
        int h = c2903Ey1.h(4);
        float f = 1.0f;
        if (h == 15) {
            int h2 = c2903Ey1.h(8);
            int h3 = c2903Ey1.h(8);
            if (h3 == 0) {
                I31.n(l, "Invalid aspect ratio");
            } else {
                f = h2 / h3;
            }
        } else {
            float[] fArr = t;
            if (h < fArr.length) {
                f = fArr[h];
            } else {
                I31.n(l, "Invalid aspect ratio");
            }
        }
        if (c2903Ey1.g()) {
            c2903Ey1.s(2);
            c2903Ey1.s(1);
            if (c2903Ey1.g()) {
                c2903Ey1.s(15);
                c2903Ey1.r();
                c2903Ey1.s(15);
                c2903Ey1.r();
                c2903Ey1.s(15);
                c2903Ey1.r();
                c2903Ey1.s(3);
                c2903Ey1.s(11);
                c2903Ey1.r();
                c2903Ey1.s(15);
                c2903Ey1.r();
            }
        }
        if (c2903Ey1.h(2) != 0) {
            I31.n(l, "Unhandled video object layer shape");
        }
        c2903Ey1.r();
        int h4 = c2903Ey1.h(16);
        c2903Ey1.r();
        if (c2903Ey1.g()) {
            if (h4 == 0) {
                I31.n(l, "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                c2903Ey1.s(i2);
            }
        }
        c2903Ey1.r();
        int h5 = c2903Ey1.h(13);
        c2903Ey1.r();
        int h6 = c2903Ey1.h(13);
        c2903Ey1.r();
        c2903Ey1.r();
        return new C10833xx0.b().U(str).g0(C4128Rj1.p).n0(h5).S(h6).c0(f).V(Collections.singletonList(copyOf)).G();
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        int i;
        C9542sf.k(this.f);
        C9542sf.k(this.i);
        int f = c3012Fy1.f();
        int g = c3012Fy1.g();
        byte[] e = c3012Fy1.e();
        this.g += c3012Fy1.a();
        this.i.e(c3012Fy1, c3012Fy1.a());
        while (true) {
            int c = C9337ro1.c(e, f, g, this.c);
            if (c == g) {
                break;
            }
            int i2 = c + 3;
            int i3 = c3012Fy1.e()[i2] & 255;
            int i4 = c - f;
            int i5 = 0;
            if (!this.j) {
                if (i4 > 0) {
                    this.d.a(e, f, c);
                }
                if (i4 < 0) {
                    i = -i4;
                } else {
                    i = 0;
                }
                if (this.d.b(i3, i)) {
                    InterfaceC10568wr2 interfaceC10568wr2 = this.i;
                    a aVar = this.d;
                    interfaceC10568wr2.a(f(aVar, aVar.d, (String) C9542sf.g(this.h)));
                    this.j = true;
                }
            }
            this.f.a(e, f, c);
            C9088qo1 c9088qo1 = this.e;
            if (c9088qo1 != null) {
                if (i4 > 0) {
                    c9088qo1.a(e, f, c);
                } else {
                    i5 = -i4;
                }
                if (this.e.b(i5)) {
                    C9088qo1 c9088qo12 = this.e;
                    ((C3012Fy1) TD2.o(this.b)).W(this.e.d, C9337ro1.q(c9088qo12.d, c9088qo12.e));
                    ((C9196rD2) TD2.o(this.a)).a(this.k, this.b);
                }
                if (i3 == 178 && c3012Fy1.e()[c + 2] == 1) {
                    this.e.e(i3);
                }
            }
            int i6 = g - c;
            this.f.b(this.g - i6, i6, this.j);
            this.f.c(i3, this.k);
            f = i2;
        }
        if (!this.j) {
            this.d.a(e, f, g);
        }
        this.f.a(e, f, g);
        C9088qo1 c9088qo13 = this.e;
        if (c9088qo13 != null) {
            c9088qo13.a(e, f, g);
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        C9337ro1.a(this.c);
        this.d.c();
        b bVar = this.f;
        if (bVar != null) {
            bVar.d();
        }
        C9088qo1 c9088qo1 = this.e;
        if (c9088qo1 != null) {
            c9088qo1.d();
        }
        this.g = 0L;
        this.k = C10323vs.b;
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.h = eVar.b();
        InterfaceC10568wr2 b2 = interfaceC4518Vj0.b(eVar.c(), 2);
        this.i = b2;
        this.f = new b(b2);
        C9196rD2 c9196rD2 = this.a;
        if (c9196rD2 != null) {
            c9196rD2.b(interfaceC4518Vj0, eVar);
        }
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if (j != C10323vs.b) {
            this.k = j;
        }
    }

    public FF0(@InterfaceC11300zs1 C9196rD2 c9196rD2) {
        this.a = c9196rD2;
        this.c = new boolean[4];
        this.d = new a(128);
        this.k = C10323vs.b;
        if (c9196rD2 != null) {
            this.e = new C9088qo1(178, 128);
            this.b = new C3012Fy1();
            return;
        }
        this.e = null;
        this.b = null;
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
