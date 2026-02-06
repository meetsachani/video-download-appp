package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC4501Vf;
import o.C10833xx0;
import o.C4224Si1;
import o.C4598Wf;
import o.KZ1;

@Deprecated
/* renamed from: o.Bl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2561Bl1 implements InterfaceC4324Tj0, KZ1 {
    public static final InterfaceC4809Yj0 B = new InterfaceC4809Yj0() { // from class: o.Al1
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return C2561Bl1.l();
        }
    };
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final long M = 262144;
    public static final long N = 10485760;
    @InterfaceC11300zs1
    public C8103ml1 A;
    public final int d;
    public final C3012Fy1 e;
    public final C3012Fy1 f;
    public final C3012Fy1 g;
    public final C3012Fy1 h;
    public final ArrayDeque<AbstractC4501Vf.a> i;
    public final OZ1 j;
    public final List<C4224Si1.b> k;
    public int l;
    public int m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public int f421o;
    @InterfaceC11300zs1
    public C3012Fy1 p;
    public int q;
    public int r;
    public int s;
    public int t;
    public InterfaceC4518Vj0 u;
    public b[] v;
    public long[][] w;
    public int x;
    public long y;
    public int z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Bl1$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* renamed from: o.Bl1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final C8615or2 a;
        public final C10811xr2 b;
        public final InterfaceC10568wr2 c;
        @InterfaceC11300zs1
        public final Du2 d;
        public int e;

        public b(C8615or2 c8615or2, C10811xr2 c10811xr2, InterfaceC10568wr2 interfaceC10568wr2) {
            Du2 du2;
            this.a = c8615or2;
            this.b = c10811xr2;
            this.c = interfaceC10568wr2;
            if (C4128Rj1.U.equals(c8615or2.f.g1)) {
                du2 = new Du2();
            } else {
                du2 = null;
            }
            this.d = du2;
        }
    }

    public C2561Bl1() {
        this(0);
    }

    public static boolean D(int i) {
        if (i != 1836019574 && i != 1953653099 && i != 1835297121 && i != 1835626086 && i != 1937007212 && i != 1701082227 && i != 1835365473) {
            return false;
        }
        return true;
    }

    public static boolean E(int i) {
        if (i != 1835296868 && i != 1836476516 && i != 1751411826 && i != 1937011556 && i != 1937011827 && i != 1937011571 && i != 1668576371 && i != 1701606260 && i != 1937011555 && i != 1937011578 && i != 1937013298 && i != 1937007471 && i != 1668232756 && i != 1953196132 && i != 1718909296 && i != 1969517665 && i != 1801812339 && i != 1768715124) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ C8615or2 k(C8615or2 c8615or2) {
        return c8615or2;
    }

    public static /* synthetic */ InterfaceC4324Tj0[] l() {
        return new InterfaceC4324Tj0[]{new C2561Bl1()};
    }

    public static int m(int i) {
        if (i != 1751476579) {
            if (i != 1903435808) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public static long[][] n(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            jArr[i] = new long[bVarArr[i].b.b];
            jArr2[i] = bVarArr[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < bVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            C10811xr2 c10811xr2 = bVarArr[i3].b;
            j += c10811xr2.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = c10811xr2.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    public static int q(C10811xr2 c10811xr2, long j) {
        int a2 = c10811xr2.a(j);
        if (a2 == -1) {
            return c10811xr2.b(j);
        }
        return a2;
    }

    public static long s(C10811xr2 c10811xr2, long j, long j2) {
        int q = q(c10811xr2, j);
        if (q == -1) {
            return j2;
        }
        return Math.min(c10811xr2.c[q], j2);
    }

    public static int w(C3012Fy1 c3012Fy1) {
        c3012Fy1.Y(8);
        int m = m(c3012Fy1.s());
        if (m != 0) {
            return m;
        }
        c3012Fy1.Z(4);
        while (c3012Fy1.a() > 0) {
            int m2 = m(c3012Fy1.s());
            if (m2 != 0) {
                return m2;
            }
        }
        return 0;
    }

    public final boolean A(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        boolean z;
        long j = this.n - this.f421o;
        long position = interfaceC4421Uj0.getPosition() + j;
        C3012Fy1 c3012Fy1 = this.p;
        if (c3012Fy1 != null) {
            interfaceC4421Uj0.readFully(c3012Fy1.e(), this.f421o, (int) j);
            if (this.m == 1718909296) {
                this.z = w(c3012Fy1);
            } else if (!this.i.isEmpty()) {
                this.i.peek().e(new AbstractC4501Vf.b(this.m, c3012Fy1));
            }
        } else if (j < 262144) {
            interfaceC4421Uj0.t((int) j);
        } else {
            ke1.a = interfaceC4421Uj0.getPosition() + j;
            z = true;
            u(position);
            if (!z && this.l != 2) {
                return true;
            }
            return false;
        }
        z = false;
        u(position);
        if (!z) {
        }
        return false;
    }

    public final int B(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        int i;
        long position = interfaceC4421Uj0.getPosition();
        if (this.q == -1) {
            int r = r(position);
            this.q = r;
            if (r == -1) {
                return -1;
            }
        }
        b bVar = this.v[this.q];
        InterfaceC10568wr2 interfaceC10568wr2 = bVar.c;
        int i2 = bVar.e;
        C10811xr2 c10811xr2 = bVar.b;
        long j = c10811xr2.c[i2];
        int i3 = c10811xr2.d[i2];
        Du2 du2 = bVar.d;
        long j2 = (j - position) + this.r;
        if (j2 >= 0 && j2 < 262144) {
            if (bVar.a.g == 1) {
                j2 += 8;
                i3 -= 8;
            }
            interfaceC4421Uj0.t((int) j2);
            C8615or2 c8615or2 = bVar.a;
            if (c8615or2.j != 0) {
                byte[] e = this.f.e();
                e[0] = 0;
                e[1] = 0;
                e[2] = 0;
                int i4 = bVar.a.j;
                int i5 = 4 - i4;
                while (this.s < i3) {
                    int i6 = this.t;
                    if (i6 == 0) {
                        interfaceC4421Uj0.readFully(e, i5, i4);
                        this.r += i4;
                        this.f.Y(0);
                        int s = this.f.s();
                        if (s >= 0) {
                            this.t = s;
                            this.e.Y(0);
                            interfaceC10568wr2.e(this.e, 4);
                            this.s += 4;
                            i3 += i5;
                        } else {
                            throw C3989Py1.a("Invalid NAL length", null);
                        }
                    } else {
                        int c = interfaceC10568wr2.c(interfaceC4421Uj0, i6, false);
                        this.r += c;
                        this.s += c;
                        this.t -= c;
                    }
                }
            } else {
                if (C4128Rj1.T.equals(c8615or2.f.g1)) {
                    if (this.s == 0) {
                        M3.a(i3, this.g);
                        interfaceC10568wr2.e(this.g, 7);
                        this.s += 7;
                    }
                    i3 += 7;
                } else if (du2 != null) {
                    du2.d(interfaceC4421Uj0);
                }
                while (true) {
                    int i7 = this.s;
                    if (i7 >= i3) {
                        break;
                    }
                    int c2 = interfaceC10568wr2.c(interfaceC4421Uj0, i3 - i7, false);
                    this.r += c2;
                    this.s += c2;
                    this.t -= c2;
                }
            }
            int i8 = i3;
            C10811xr2 c10811xr22 = bVar.b;
            long j3 = c10811xr22.f[i2];
            int i9 = c10811xr22.g[i2];
            if (du2 != null) {
                i = 0;
                du2.c(interfaceC10568wr2, j3, i9, i8, 0, null);
                if (i2 + 1 == bVar.b.b) {
                    du2.a(interfaceC10568wr2, null);
                }
            } else {
                i = 0;
                interfaceC10568wr2.b(j3, i9, i8, 0, null);
            }
            bVar.e++;
            this.q = -1;
            this.r = i;
            this.s = i;
            this.t = i;
            return i;
        }
        ke1.a = j;
        return 1;
    }

    public final int C(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        int c = this.j.c(interfaceC4421Uj0, ke1, this.k);
        if (c == 1 && ke1.a == 0) {
            o();
        }
        return c;
    }

    public final void F(b bVar, long j) {
        C10811xr2 c10811xr2 = bVar.b;
        int a2 = c10811xr2.a(j);
        if (a2 == -1) {
            a2 = c10811xr2.b(j);
        }
        bVar.e = a2;
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        b[] bVarArr;
        this.i.clear();
        this.f421o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        if (j == 0) {
            if (this.l != 3) {
                o();
                return;
            }
            this.j.g();
            this.k.clear();
            return;
        }
        for (b bVar : this.v) {
            F(bVar, j2);
            Du2 du2 = bVar.d;
            if (du2 != null) {
                du2.b();
            }
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.u = interfaceC4518Vj0;
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z;
        if ((this.d & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return A92.e(interfaceC4421Uj0, z);
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        return p(j, -1);
    }

    @Override // o.KZ1
    public boolean h() {
        return true;
    }

    @Override // o.KZ1
    public long i() {
        return this.y;
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        while (true) {
            int i = this.l;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return C(interfaceC4421Uj0, ke1);
                        }
                        throw new IllegalStateException();
                    }
                    return B(interfaceC4421Uj0, ke1);
                } else if (A(interfaceC4421Uj0, ke1)) {
                    return 1;
                }
            } else if (!z(interfaceC4421Uj0)) {
                return -1;
            }
        }
    }

    public final void o() {
        this.l = 0;
        this.f421o = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KZ1.a p(long j, int i) {
        int i2;
        long j2;
        long j3;
        long j4;
        long j5;
        int b2;
        b[] bVarArr = this.v;
        if (bVarArr.length == 0) {
            return new KZ1.a(MZ1.c);
        }
        if (i != -1) {
            i2 = i;
        } else {
            i2 = this.x;
        }
        if (i2 != -1) {
            C10811xr2 c10811xr2 = bVarArr[i2].b;
            int q = q(c10811xr2, j);
            if (q == -1) {
                return new KZ1.a(MZ1.c);
            }
            j3 = c10811xr2.f[q];
            j2 = c10811xr2.c[q];
            if (j3 < j && q < c10811xr2.b - 1 && (b2 = c10811xr2.b(j)) != -1 && b2 != q) {
                j5 = c10811xr2.f[b2];
                j4 = c10811xr2.c[b2];
                if (i == -1) {
                    int i3 = 0;
                    while (true) {
                        b[] bVarArr2 = this.v;
                        if (i3 >= bVarArr2.length) {
                            break;
                        }
                        if (i3 != this.x) {
                            C10811xr2 c10811xr22 = bVarArr2[i3].b;
                            long s = s(c10811xr22, j3, j2);
                            if (j5 != C10323vs.b) {
                                j4 = s(c10811xr22, j5, j4);
                            }
                            j2 = s;
                        }
                        i3++;
                    }
                }
                MZ1 mz1 = new MZ1(j3, j2);
                if (j5 != C10323vs.b) {
                    return new KZ1.a(mz1);
                }
                return new KZ1.a(mz1, new MZ1(j5, j4));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -1;
        j5 = -9223372036854775807L;
        if (i == -1) {
        }
        MZ1 mz12 = new MZ1(j3, j2);
        if (j5 != C10323vs.b) {
        }
    }

    public final int r(long j) {
        boolean z;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z2 = true;
        long j3 = Long.MAX_VALUE;
        boolean z3 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.v;
            if (i3 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i3];
            int i4 = bVar.e;
            C10811xr2 c10811xr2 = bVar.b;
            if (i4 != c10811xr2.b) {
                long j5 = c10811xr2.c[i4];
                long j6 = ((long[][]) TD2.o(this.w))[i3][i4];
                long j7 = j5 - j;
                if (j7 >= 0 && j7 < 262144) {
                    z = false;
                } else {
                    z = true;
                }
                if ((!z && z3) || (z == z3 && j7 < j4)) {
                    z3 = z;
                    j3 = j6;
                    i2 = i3;
                    j4 = j7;
                }
                if (j6 < j2) {
                    z2 = z;
                    j2 = j6;
                    i = i3;
                }
            }
            i3++;
        }
        if (j2 != Long.MAX_VALUE && z2 && j3 >= j2 + 10485760) {
            return i;
        }
        return i2;
    }

    public final void t(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.g.U(8);
        interfaceC4421Uj0.x(this.g.e(), 0, 8);
        C4598Wf.f(this.g);
        interfaceC4421Uj0.t(this.g.f());
        interfaceC4421Uj0.i();
    }

    public final void u(long j) throws C3989Py1 {
        while (!this.i.isEmpty() && this.i.peek().E1 == j) {
            AbstractC4501Vf.a pop = this.i.pop();
            if (pop.a == 1836019574) {
                x(pop);
                this.i.clear();
                this.l = 2;
            } else if (!this.i.isEmpty()) {
                this.i.peek().d(pop);
            }
        }
        if (this.l != 2) {
            o();
        }
    }

    public final void v() {
        C4224Si1 c4224Si1;
        if (this.z == 2 && (this.d & 2) != 0) {
            InterfaceC10568wr2 b2 = this.u.b(0, 4);
            if (this.A == null) {
                c4224Si1 = null;
            } else {
                c4224Si1 = new C4224Si1(this.A);
            }
            b2.a(new C10833xx0.b().Z(c4224Si1).G());
            this.u.n();
            this.u.p(new KZ1.b(C10323vs.b));
        }
    }

    public final void x(AbstractC4501Vf.a aVar) throws C3989Py1 {
        boolean z;
        C4224Si1 c4224Si1;
        C4224Si1 c4224Si12;
        C4224Si1 c4224Si13;
        C4224Si1 c4224Si14;
        boolean z2;
        List<C10811xr2> list;
        int i;
        int i2;
        boolean z3;
        C4224Si1 c4224Si15;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (this.z == 1) {
            z = true;
        } else {
            z = false;
        }
        BC0 bc0 = new BC0();
        AbstractC4501Vf.b h = aVar.h(AbstractC4501Vf.e1);
        if (h != null) {
            C4598Wf.i C2 = C4598Wf.C(h);
            C4224Si1 c4224Si16 = C2.a;
            C4224Si1 c4224Si17 = C2.b;
            C4224Si1 c4224Si18 = C2.c;
            if (c4224Si16 != null) {
                bc0.c(c4224Si16);
            }
            c4224Si1 = c4224Si18;
            c4224Si12 = c4224Si16;
            c4224Si13 = c4224Si17;
        } else {
            c4224Si1 = null;
            c4224Si12 = null;
            c4224Si13 = null;
        }
        AbstractC4501Vf.a g = aVar.g(1835365473);
        if (g != null) {
            c4224Si14 = C4598Wf.o(g);
        } else {
            c4224Si14 = null;
        }
        C4224Si1 c4224Si19 = C4598Wf.q(((AbstractC4501Vf.b) C9542sf.g(aVar.h(AbstractC4501Vf.i0))).E1).a;
        if ((this.d & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C4224Si1 c4224Si110 = c4224Si14;
        List<C10811xr2> B2 = C4598Wf.B(aVar, bc0, C10323vs.b, null, z2, z, new YA0() { // from class: o.zl1
            @Override // o.YA0
            public final Object apply(Object obj) {
                return C2561Bl1.k((C8615or2) obj);
            }
        });
        int size = B2.size();
        long j = C10323vs.b;
        int i4 = 0;
        int i5 = -1;
        while (i4 < size) {
            C10811xr2 c10811xr2 = B2.get(i4);
            if (c10811xr2.b == 0) {
                list = B2;
                i = size;
                i3 = i5;
                z3 = true;
            } else {
                C8615or2 c8615or2 = c10811xr2.a;
                int i6 = i5;
                ArrayList arrayList2 = arrayList;
                long j2 = c8615or2.e;
                if (j2 == C10323vs.b) {
                    j2 = c10811xr2.h;
                }
                long max = Math.max(j, j2);
                list = B2;
                i = size;
                b bVar = new b(c8615or2, c10811xr2, this.u.b(i4, c8615or2.b));
                if (C4128Rj1.U.equals(c8615or2.f.g1)) {
                    i2 = c10811xr2.e * 16;
                } else {
                    i2 = c10811xr2.e + 30;
                }
                C10833xx0.b b2 = c8615or2.f.b();
                b2.Y(i2);
                if (c8615or2.b == 2 && j2 > 0) {
                    int i7 = c10811xr2.b;
                    z3 = true;
                    if (i7 > 1) {
                        b2.R(i7 / (((float) j2) / 1000000.0f));
                    }
                } else {
                    z3 = true;
                }
                C7834lj1.k(c8615or2.b, bc0, b2);
                int i8 = c8615or2.b;
                if (this.k.isEmpty()) {
                    c4224Si15 = null;
                } else {
                    c4224Si15 = new C4224Si1(this.k);
                }
                C7834lj1.l(i8, c4224Si12, c4224Si110, b2, c4224Si13, c4224Si15, c4224Si1, c4224Si19);
                bVar.c.a(b2.G());
                if (c8615or2.b == 2) {
                    i3 = i6;
                    if (i3 == -1) {
                        i3 = arrayList2.size();
                    }
                } else {
                    i3 = i6;
                }
                arrayList = arrayList2;
                arrayList.add(bVar);
                j = max;
            }
            i4++;
            i5 = i3;
            B2 = list;
            size = i;
        }
        this.x = i5;
        this.y = j;
        b[] bVarArr = (b[]) arrayList.toArray(new b[0]);
        this.v = bVarArr;
        this.w = n(bVarArr);
        this.u.n();
        this.u.p(this);
    }

    public final void y(long j) {
        if (this.m == 1836086884) {
            int i = this.f421o;
            this.A = new C8103ml1(0L, j, C10323vs.b, j + i, this.n - i);
        }
    }

    public final boolean z(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        AbstractC4501Vf.a peek;
        boolean z;
        boolean z2;
        if (this.f421o == 0) {
            if (!interfaceC4421Uj0.j(this.h.e(), 0, 8, true)) {
                v();
                return false;
            }
            this.f421o = 8;
            this.h.Y(0);
            this.n = this.h.N();
            this.m = this.h.s();
        }
        long j = this.n;
        if (j == 1) {
            interfaceC4421Uj0.readFully(this.h.e(), 8, 8);
            this.f421o += 8;
            this.n = this.h.Q();
        } else if (j == 0) {
            long length = interfaceC4421Uj0.getLength();
            if (length == -1 && (peek = this.i.peek()) != null) {
                length = peek.E1;
            }
            if (length != -1) {
                this.n = (length - interfaceC4421Uj0.getPosition()) + this.f421o;
            }
        }
        if (this.n >= this.f421o) {
            if (D(this.m)) {
                long position = interfaceC4421Uj0.getPosition();
                long j2 = this.n;
                int i = this.f421o;
                long j3 = (position + j2) - i;
                if (j2 != i && this.m == 1835365473) {
                    t(interfaceC4421Uj0);
                }
                this.i.push(new AbstractC4501Vf.a(this.m, j3));
                if (this.n == this.f421o) {
                    u(j3);
                } else {
                    o();
                }
            } else if (E(this.m)) {
                if (this.f421o == 8) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.i(z);
                if (this.n <= 2147483647L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9542sf.i(z2);
                C3012Fy1 c3012Fy1 = new C3012Fy1((int) this.n);
                System.arraycopy(this.h.e(), 0, c3012Fy1.e(), 0, 8);
                this.p = c3012Fy1;
                this.l = 1;
            } else {
                y(interfaceC4421Uj0.getPosition() - this.f421o);
                this.p = null;
                this.l = 1;
            }
            return true;
        }
        throw C3989Py1.e("Atom size less than header length (unsupported).");
    }

    public C2561Bl1(int i) {
        this.d = i;
        this.l = (i & 4) != 0 ? 3 : 0;
        this.j = new OZ1();
        this.k = new ArrayList();
        this.h = new C3012Fy1(16);
        this.i = new ArrayDeque<>();
        this.e = new C3012Fy1(C9337ro1.i);
        this.f = new C3012Fy1(4);
        this.g = new C3012Fy1();
        this.q = -1;
        this.u = InterfaceC4518Vj0.B;
        this.v = new b[0];
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
