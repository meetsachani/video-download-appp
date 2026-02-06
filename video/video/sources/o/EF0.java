package o;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import o.C10833xx0;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class EF0 implements InterfaceC8545oa0 {
    public static final int q = 0;
    public static final int r = 179;
    public static final int s = 181;
    public static final int t = 184;
    public static final int u = 178;
    public static final double[] v = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public InterfaceC10568wr2 b;
    @InterfaceC11300zs1
    public final C9196rD2 c;
    @InterfaceC11300zs1
    public final C3012Fy1 d;
    @InterfaceC11300zs1
    public final C9088qo1 e;
    public final boolean[] f;
    public final a g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f447o;
    public boolean p;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final byte[] e = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (!this.a) {
                return;
            }
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.b;
            if (length < i4 + i3) {
                this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.d, this.b, i3);
            this.b += i3;
        }

        public boolean b(int i, int i2) {
            if (this.a) {
                int i3 = this.b - i2;
                this.b = i3;
                if (this.c == 0 && i == 181) {
                    this.c = i3;
                } else {
                    this.a = false;
                    return true;
                }
            } else if (i == 179) {
                this.a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    public EF0() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<C10833xx0, Long> f(a aVar, String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        int i3;
        byte[] copyOf = Arrays.copyOf(aVar.d, aVar.b);
        byte b = copyOf[5];
        int i4 = ((copyOf[4] & 255) << 4) | ((b & 255) >> 4);
        int i5 = ((b & C8077mf.q) << 8) | (copyOf[6] & 255);
        int i6 = (copyOf[7] & 240) >> 4;
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 4) {
                    f2 = 1.0f;
                    C10833xx0 G = new C10833xx0.b().U(str).g0(C4128Rj1.s).n0(i4).S(i5).c0(f2).V(Collections.singletonList(copyOf)).G();
                    i2 = (copyOf[7] & C8077mf.q) - 1;
                    if (i2 >= 0) {
                        double[] dArr = v;
                        if (i2 < dArr.length) {
                            double d = dArr[i2];
                            byte b2 = copyOf[aVar.c + 9];
                            int i7 = (b2 & 96) >> 5;
                            if (i7 != (b2 & 31)) {
                                d *= (i7 + 1.0d) / (i3 + 1);
                            }
                            j = (long) (1000000.0d / d);
                            return Pair.create(G, Long.valueOf(j));
                        }
                    }
                    j = 0;
                    return Pair.create(G, Long.valueOf(j));
                }
                f = i5 * 121;
                i = i4 * 100;
            } else {
                f = i5 * 16;
                i = i4 * 9;
            }
        } else {
            f = i5 * 4;
            i = i4 * 3;
        }
        f2 = f / i;
        C10833xx0 G2 = new C10833xx0.b().U(str).g0(C4128Rj1.s).n0(i4).S(i5).c0(f2).V(Collections.singletonList(copyOf)).G();
        i2 = (copyOf[7] & C8077mf.q) - 1;
        if (i2 >= 0) {
        }
        j = 0;
        return Pair.create(G2, Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    @Override // o.InterfaceC8545oa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(C3012Fy1 c3012Fy1) {
        int i;
        long j;
        boolean z;
        int i2;
        int i3;
        C9542sf.k(this.b);
        int f = c3012Fy1.f();
        int g = c3012Fy1.g();
        byte[] e = c3012Fy1.e();
        this.h += c3012Fy1.a();
        this.b.e(c3012Fy1, c3012Fy1.a());
        while (true) {
            int c = C9337ro1.c(e, f, g, this.f);
            if (c == g) {
                break;
            }
            int i4 = c + 3;
            int i5 = c3012Fy1.e()[i4] & 255;
            int i6 = c - f;
            boolean z2 = false;
            if (!this.j) {
                if (i6 > 0) {
                    this.g.a(e, f, c);
                }
                if (i6 < 0) {
                    i3 = -i6;
                } else {
                    i3 = 0;
                }
                if (this.g.b(i5, i3)) {
                    Pair<C10833xx0, Long> f2 = f(this.g, (String) C9542sf.g(this.a));
                    this.b.a((C10833xx0) f2.first);
                    this.k = ((Long) f2.second).longValue();
                    this.j = true;
                }
            }
            C9088qo1 c9088qo1 = this.e;
            if (c9088qo1 != null) {
                if (i6 > 0) {
                    c9088qo1.a(e, f, c);
                    i2 = 0;
                } else {
                    i2 = -i6;
                }
                if (this.e.b(i2)) {
                    C9088qo1 c9088qo12 = this.e;
                    ((C3012Fy1) TD2.o(this.d)).W(this.e.d, C9337ro1.q(c9088qo12.d, c9088qo12.e));
                    ((C9196rD2) TD2.o(this.c)).a(this.n, this.d);
                }
                if (i5 == 178 && c3012Fy1.e()[c + 2] == 1) {
                    this.e.e(i5);
                }
            }
            if (i5 != 0 && i5 != 179) {
                if (i5 == 184) {
                    this.f447o = true;
                }
                i = g;
            } else {
                int i7 = g - c;
                if (this.p && this.j) {
                    long j2 = this.n;
                    if (j2 != C10323vs.b) {
                        i = g;
                        this.b.b(j2, this.f447o ? 1 : 0, ((int) (this.h - this.m)) - i7, i7, null);
                        if (!this.i && !this.p) {
                            z = true;
                        } else {
                            this.m = this.h - i7;
                            j = this.l;
                            if (j == C10323vs.b) {
                                long j3 = this.n;
                                if (j3 != C10323vs.b) {
                                    j = j3 + this.k;
                                } else {
                                    j = -9223372036854775807L;
                                }
                            }
                            this.n = j;
                            this.f447o = false;
                            this.l = C10323vs.b;
                            z = true;
                            this.i = true;
                        }
                        if (i5 == 0) {
                            z2 = z;
                        }
                        this.p = z2;
                    }
                }
                i = g;
                if (!this.i) {
                }
                this.m = this.h - i7;
                j = this.l;
                if (j == C10323vs.b) {
                }
                this.n = j;
                this.f447o = false;
                this.l = C10323vs.b;
                z = true;
                this.i = true;
                if (i5 == 0) {
                }
                this.p = z2;
            }
            g = i;
            f = i4;
        }
        if (!this.j) {
            this.g.a(e, f, g);
        }
        C9088qo1 c9088qo13 = this.e;
        if (c9088qo13 != null) {
            c9088qo13.a(e, f, g);
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        C9337ro1.a(this.f);
        this.g.c();
        C9088qo1 c9088qo1 = this.e;
        if (c9088qo1 != null) {
            c9088qo1.d();
        }
        this.h = 0L;
        this.i = false;
        this.l = C10323vs.b;
        this.n = C10323vs.b;
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.a = eVar.b();
        this.b = interfaceC4518Vj0.b(eVar.c(), 2);
        C9196rD2 c9196rD2 = this.c;
        if (c9196rD2 != null) {
            c9196rD2.b(interfaceC4518Vj0, eVar);
        }
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        this.l = j;
    }

    public EF0(@InterfaceC11300zs1 C9196rD2 c9196rD2) {
        this.c = c9196rD2;
        this.f = new boolean[4];
        this.g = new a(128);
        if (c9196rD2 != null) {
            this.e = new C9088qo1(178, 128);
            this.d = new C3012Fy1();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = C10323vs.b;
        this.n = C10323vs.b;
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
