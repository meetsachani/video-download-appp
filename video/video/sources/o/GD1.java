package o;

import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractC7373jp2;
import o.ED1;
import o.FD1;
import o.HD1;
import o.InterfaceC7583kh1;
import o.J8;

@Deprecated
/* loaded from: classes2.dex */
public final class GD1 implements J8, ED1.a {
    public PG2 A0;
    public final ED1 k0;
    public final Map<String, b> l0;
    public final Map<String, J8.b> m0;
    @InterfaceC11300zs1
    public final a n0;
    public final boolean o0;
    public final AbstractC7373jp2.b p0;
    public FD1 q0;
    @InterfaceC11300zs1
    public String r0;
    public long s0;
    public int t0;
    public int u0;
    @InterfaceC11300zs1
    public Exception v0;
    public long w0;
    public long x0;
    @InterfaceC11300zs1
    public C10833xx0 y0;
    @InterfaceC11300zs1
    public C10833xx0 z0;

    /* loaded from: classes2.dex */
    public interface a {
        void a(J8.b bVar, FD1 fd1);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public long A;
        public long B;
        public long C;
        public long D;
        public long E;
        public int F;
        public int G;
        public int H;
        public long I;
        public boolean J;
        public boolean K;
        public boolean L;
        public boolean M;
        public boolean N;
        public long O;
        @InterfaceC11300zs1
        public C10833xx0 P;
        @InterfaceC11300zs1
        public C10833xx0 Q;
        public long R;
        public long S;
        public float T;
        public final boolean a;
        public final long[] b = new long[16];
        public final List<FD1.c> c;
        public final List<long[]> d;
        public final List<FD1.b> e;
        public final List<FD1.b> f;
        public final List<FD1.a> g;
        public final List<FD1.a> h;
        public final boolean i;
        public long j;
        public boolean k;
        public boolean l;
        public boolean m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f466o;
        public int p;
        public int q;
        public long r;
        public int s;
        public long t;
        public long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;

        public b(boolean z, J8.b bVar) {
            List<FD1.c> list;
            List<long[]> list2;
            List<FD1.b> list3;
            List<FD1.b> list4;
            List<FD1.a> list5;
            List<FD1.a> list6;
            this.a = z;
            if (z) {
                list = new ArrayList<>();
            } else {
                list = Collections.EMPTY_LIST;
            }
            this.c = list;
            if (z) {
                list2 = new ArrayList<>();
            } else {
                list2 = Collections.EMPTY_LIST;
            }
            this.d = list2;
            if (z) {
                list3 = new ArrayList<>();
            } else {
                list3 = Collections.EMPTY_LIST;
            }
            this.e = list3;
            if (z) {
                list4 = new ArrayList<>();
            } else {
                list4 = Collections.EMPTY_LIST;
            }
            this.f = list4;
            if (z) {
                list5 = new ArrayList<>();
            } else {
                list5 = Collections.EMPTY_LIST;
            }
            this.g = list5;
            if (z) {
                list6 = new ArrayList<>();
            } else {
                list6 = Collections.EMPTY_LIST;
            }
            this.h = list6;
            boolean z2 = false;
            this.H = 0;
            this.I = bVar.a;
            this.j = C10323vs.b;
            this.r = C10323vs.b;
            InterfaceC7583kh1.b bVar2 = bVar.d;
            if (bVar2 != null && bVar2.c()) {
                z2 = true;
            }
            this.i = z2;
            this.u = -1L;
            this.t = -1L;
            this.s = -1;
            this.T = 1.0f;
        }

        public static boolean c(int i, int i2) {
            if ((i != 1 && i != 2 && i != 14) || i2 == 1 || i2 == 2 || i2 == 14 || i2 == 3 || i2 == 4 || i2 == 9 || i2 == 11) {
                return false;
            }
            return true;
        }

        public static boolean d(int i) {
            if (i != 4 && i != 7) {
                return false;
            }
            return true;
        }

        public static boolean e(int i) {
            if (i != 3 && i != 4 && i != 9) {
                return false;
            }
            return true;
        }

        public static boolean f(int i) {
            if (i != 6 && i != 7 && i != 10) {
                return false;
            }
            return true;
        }

        public FD1 a(boolean z) {
            long[] jArr;
            ArrayList arrayList;
            int i;
            long j;
            int i2;
            List arrayList2;
            List arrayList3;
            List arrayList4;
            int i3;
            int i4;
            int i5;
            int i6;
            long[] jArr2 = this.b;
            List<long[]> list = this.d;
            if (!z) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long[] copyOf = Arrays.copyOf(this.b, 16);
                long max = Math.max(0L, elapsedRealtime - this.I);
                int i7 = this.H;
                copyOf[i7] = copyOf[i7] + max;
                j(elapsedRealtime);
                h(elapsedRealtime);
                g(elapsedRealtime);
                ArrayList arrayList5 = new ArrayList(this.d);
                if (this.a && this.H == 3) {
                    arrayList5.add(b(elapsedRealtime));
                }
                jArr = copyOf;
                arrayList = arrayList5;
            } else {
                jArr = jArr2;
                arrayList = list;
            }
            if (!this.m && this.k) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                j = C10323vs.b;
            } else {
                j = jArr[2];
            }
            long j2 = j;
            if (jArr[1] > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (z) {
                arrayList2 = this.e;
            } else {
                arrayList2 = new ArrayList(this.e);
            }
            List list2 = arrayList2;
            if (z) {
                arrayList3 = this.f;
            } else {
                arrayList3 = new ArrayList(this.f);
            }
            List list3 = arrayList3;
            if (z) {
                arrayList4 = this.c;
            } else {
                arrayList4 = new ArrayList(this.c);
            }
            List list4 = arrayList4;
            long j3 = this.j;
            boolean z2 = this.K;
            int i8 = !this.k ? 1 : 0;
            boolean z3 = this.l;
            int i9 = i ^ 1;
            int i10 = this.n;
            int i11 = this.f466o;
            int i12 = this.p;
            int i13 = this.q;
            long j4 = this.r;
            boolean z4 = this.i;
            long j5 = this.v;
            long j6 = this.w;
            long j7 = this.x;
            long j8 = this.y;
            long j9 = this.z;
            long j10 = this.A;
            int i14 = this.s;
            if (i14 == -1) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            long j11 = this.t;
            if (j11 == -1) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            long j12 = this.u;
            if (j12 == -1) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            long j13 = this.B;
            long j14 = this.C;
            long j15 = this.D;
            long j16 = this.E;
            int i15 = this.F;
            if (i15 > 0) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            return new FD1(1, jArr, list4, arrayList, j3, z2 ? 1 : 0, i8, z3 ? 1 : 0, i2, j2, i9, i10, i11, i12, i13, j4, z4 ? 1 : 0, list2, list3, j5, j6, j7, j8, j9, j10, i3, i4, i14, j11, i5, j12, j13, j14, j15, j16, i6, i15, this.G, this.g, this.h);
        }

        public final long[] b(long j) {
            List<long[]> list = this.d;
            long[] jArr = list.get(list.size() - 1);
            return new long[]{j, jArr[1] + (((float) (j - jArr[0])) * this.T)};
        }

        public final void g(long j) {
            C10833xx0 c10833xx0;
            int i;
            if (this.H == 3 && (c10833xx0 = this.Q) != null && (i = c10833xx0.c1) != -1) {
                long j2 = ((float) (j - this.S)) * this.T;
                this.z += j2;
                this.A += j2 * i;
            }
            this.S = j;
        }

        public final void h(long j) {
            C10833xx0 c10833xx0;
            if (this.H == 3 && (c10833xx0 = this.P) != null) {
                long j2 = ((float) (j - this.R)) * this.T;
                int i = c10833xx0.m1;
                if (i != -1) {
                    this.v += j2;
                    this.w += i * j2;
                }
                int i2 = c10833xx0.c1;
                if (i2 != -1) {
                    this.x += j2;
                    this.y += j2 * i2;
                }
            }
            this.R = j;
        }

        public final void i(J8.b bVar, @InterfaceC11300zs1 C10833xx0 c10833xx0) {
            int i;
            if (!TD2.g(this.Q, c10833xx0)) {
                g(bVar.a);
                if (c10833xx0 != null && this.u == -1 && (i = c10833xx0.c1) != -1) {
                    this.u = i;
                }
                this.Q = c10833xx0;
                if (this.a) {
                    this.f.add(new FD1.b(bVar, c10833xx0));
                }
            }
        }

        public final void j(long j) {
            if (f(this.H)) {
                long j2 = j - this.O;
                long j3 = this.r;
                if (j3 == C10323vs.b || j2 > j3) {
                    this.r = j2;
                }
            }
        }

        public final void k(long j, long j2) {
            if (this.a) {
                if (this.H != 3) {
                    if (j2 != C10323vs.b) {
                        if (!this.d.isEmpty()) {
                            List<long[]> list = this.d;
                            long j3 = list.get(list.size() - 1)[1];
                            if (j3 != j2) {
                                this.d.add(new long[]{j, j3});
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (j2 != C10323vs.b) {
                    this.d.add(new long[]{j, j2});
                } else if (!this.d.isEmpty()) {
                    this.d.add(b(j));
                }
            }
        }

        public final void l(J8.b bVar, @InterfaceC11300zs1 C10833xx0 c10833xx0) {
            int i;
            int i2;
            if (!TD2.g(this.P, c10833xx0)) {
                h(bVar.a);
                if (c10833xx0 != null) {
                    if (this.s == -1 && (i2 = c10833xx0.m1) != -1) {
                        this.s = i2;
                    }
                    if (this.t == -1 && (i = c10833xx0.c1) != -1) {
                        this.t = i;
                    }
                }
                this.P = c10833xx0;
                if (this.a) {
                    this.e.add(new FD1.b(bVar, c10833xx0));
                }
            }
        }

        public void m(HD1 hd1, J8.b bVar, boolean z, long j, boolean z2, int i, boolean z3, boolean z4, @InterfaceC11300zs1 AD1 ad1, @InterfaceC11300zs1 Exception exc, long j2, long j3, @InterfaceC11300zs1 C10833xx0 c10833xx0, @InterfaceC11300zs1 C10833xx0 c10833xx02, @InterfaceC11300zs1 PG2 pg2) {
            long j4 = C10323vs.b;
            if (j != C10323vs.b) {
                k(bVar.a, j);
                this.J = true;
            }
            if (hd1.X() != 2) {
                this.J = false;
            }
            int X = hd1.X();
            if (X == 1 || X == 4 || z2) {
                this.L = false;
            }
            if (ad1 != null) {
                this.M = true;
                this.F++;
                if (this.a) {
                    this.g.add(new FD1.a(bVar, ad1));
                }
            } else if (hd1.c() == null) {
                this.M = false;
            }
            if (this.K && !this.L) {
                C3773Nr2 L0 = hd1.L0();
                if (!L0.f(2)) {
                    l(bVar, null);
                }
                if (!L0.f(1)) {
                    i(bVar, null);
                }
            }
            if (c10833xx0 != null) {
                l(bVar, c10833xx0);
            }
            if (c10833xx02 != null) {
                i(bVar, c10833xx02);
            }
            C10833xx0 c10833xx03 = this.P;
            if (c10833xx03 != null && c10833xx03.m1 == -1 && pg2 != null) {
                l(bVar, c10833xx03.b().n0(pg2.X).S(pg2.Y).G());
            }
            if (z4) {
                this.N = true;
            }
            if (z3) {
                this.E++;
            }
            this.D += i;
            this.B += j2;
            this.C += j3;
            if (exc != null) {
                this.G++;
                if (this.a) {
                    this.h.add(new FD1.a(bVar, exc));
                }
            }
            int q = q(hd1);
            float f = hd1.h().X;
            if (this.H != q || this.T != f) {
                long j5 = bVar.a;
                if (z) {
                    j4 = bVar.e;
                }
                k(j5, j4);
                h(bVar.a);
                g(bVar.a);
            }
            this.T = f;
            if (this.H != q) {
                r(q, bVar);
            }
        }

        public void n(J8.b bVar, boolean z, long j) {
            int i = 11;
            if (this.H != 11 && !z) {
                i = 15;
            }
            k(bVar.a, j);
            h(bVar.a);
            g(bVar.a);
            r(i, bVar);
        }

        public void o() {
            this.K = true;
        }

        public void p() {
            this.L = true;
            this.J = false;
        }

        public final int q(HD1 hd1) {
            int X = hd1.X();
            if (this.J && this.K) {
                return 5;
            }
            if (this.M) {
                return 13;
            }
            if (this.K) {
                if (this.L) {
                    return 14;
                }
                if (X == 4) {
                    return 11;
                }
                if (X == 2) {
                    int i = this.H;
                    if (i == 0 || i == 1 || i == 2 || i == 14) {
                        return 2;
                    }
                    if (!hd1.u1()) {
                        return 7;
                    }
                    if (hd1.Z0() != 0) {
                        return 10;
                    }
                    return 6;
                } else if (X == 3) {
                    if (!hd1.u1()) {
                        return 4;
                    }
                    if (hd1.Z0() == 0) {
                        return 3;
                    }
                    return 9;
                } else if (X == 1 && this.H != 0) {
                    return 12;
                } else {
                    return this.H;
                }
            }
            return this.N ? 1 : 0;
        }

        public final void r(int i, J8.b bVar) {
            boolean z;
            boolean z2 = false;
            if (bVar.a >= this.I) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            long j = bVar.a;
            long[] jArr = this.b;
            int i2 = this.H;
            jArr[i2] = jArr[i2] + (j - this.I);
            if (this.j == C10323vs.b) {
                this.j = j;
            }
            this.m |= c(i2, i);
            this.k |= e(i);
            boolean z3 = this.l;
            if (i == 11) {
                z2 = true;
            }
            this.l = z3 | z2;
            if (!d(this.H) && d(i)) {
                this.n++;
            }
            if (i == 5) {
                this.p++;
            }
            if (!f(this.H) && f(i)) {
                this.q++;
                this.O = bVar.a;
            }
            if (f(this.H) && this.H != 7 && i == 7) {
                this.f466o++;
            }
            j(bVar.a);
            this.H = i;
            this.I = bVar.a;
            if (this.a) {
                this.c.add(new FD1.c(bVar, i));
            }
        }
    }

    public GD1(boolean z, @InterfaceC11300zs1 a aVar) {
        this.n0 = aVar;
        this.o0 = z;
        C6932i00 c6932i00 = new C6932i00();
        this.k0 = c6932i00;
        this.l0 = new HashMap();
        this.m0 = new HashMap();
        this.q0 = FD1.e0;
        this.p0 = new AbstractC7373jp2.b();
        this.A0 = PG2.d1;
        c6932i00.c(this);
    }

    private void F0(J8.c cVar) {
        for (int i = 0; i < cVar.e(); i++) {
            int c = cVar.c(i);
            J8.b d = cVar.d(c);
            if (c == 0) {
                this.k0.f(d);
            } else if (c == 11) {
                this.k0.d(d, this.t0);
            } else {
                this.k0.g(d);
            }
        }
    }

    @Override // o.J8
    public void A(J8.b bVar, C10519wf1 c10519wf1) {
        int i = c10519wf1.b;
        if (i != 2 && i != 0) {
            if (i == 1) {
                this.z0 = c10519wf1.c;
                return;
            }
            return;
        }
        this.y0 = c10519wf1.c;
    }

    public final Pair<J8.b, Boolean> B0(J8.c cVar, String str) {
        InterfaceC7583kh1.b bVar;
        J8.b bVar2 = null;
        boolean z = false;
        for (int i = 0; i < cVar.e(); i++) {
            J8.b d = cVar.d(cVar.c(i));
            boolean h = this.k0.h(d, str);
            if (bVar2 == null || ((h && !z) || (h == z && d.a > bVar2.a))) {
                bVar2 = d;
                z = h;
            }
        }
        C9542sf.g(bVar2);
        if (!z && (bVar = bVar2.d) != null && bVar.c()) {
            long j = bVar2.b.m(bVar2.d.a, this.p0).j(bVar2.d.b);
            if (j == Long.MIN_VALUE) {
                j = this.p0.Y0;
            }
            long j2 = bVar2.a;
            AbstractC7373jp2 abstractC7373jp2 = bVar2.b;
            int i2 = bVar2.c;
            InterfaceC7583kh1.b bVar3 = bVar2.d;
            J8.b bVar4 = new J8.b(j2, abstractC7373jp2, i2, new InterfaceC7583kh1.b(bVar3.a, bVar3.d, bVar3.b), TD2.b2(j + this.p0.t()), bVar2.b, bVar2.g, bVar2.h, bVar2.i, bVar2.j);
            z = this.k0.h(bVar4, str);
            bVar2 = bVar4;
        }
        return Pair.create(bVar2, Boolean.valueOf(z));
    }

    public FD1 C0() {
        int i = 1;
        FD1[] fd1Arr = new FD1[this.l0.size() + 1];
        fd1Arr[0] = this.q0;
        for (b bVar : this.l0.values()) {
            fd1Arr[i] = bVar.a(false);
            i++;
        }
        return FD1.W(fd1Arr);
    }

    @InterfaceC11300zs1
    public FD1 D0() {
        b bVar;
        String a2 = this.k0.a();
        if (a2 == null) {
            bVar = null;
        } else {
            bVar = this.l0.get(a2);
        }
        if (bVar == null) {
            return null;
        }
        return bVar.a(false);
    }

    public final boolean E0(J8.c cVar, String str, int i) {
        if (cVar.a(i) && this.k0.h(cVar.d(i), str)) {
            return true;
        }
        return false;
    }

    @Override // o.J8
    public void P(J8.b bVar, HD1.k kVar, HD1.k kVar2, int i) {
        if (this.r0 == null) {
            this.r0 = this.k0.a();
            this.s0 = kVar.b1;
        }
        this.t0 = i;
    }

    @Override // o.J8
    public void T(J8.b bVar, int i, long j) {
        this.u0 = i;
    }

    @Override // o.ED1.a
    public void V(J8.b bVar, String str, boolean z) {
        long j;
        b bVar2 = (b) C9542sf.g(this.l0.remove(str));
        J8.b bVar3 = (J8.b) C9542sf.g(this.m0.remove(str));
        if (str.equals(this.r0)) {
            j = this.s0;
        } else {
            j = C10323vs.b;
        }
        bVar2.n(bVar, z, j);
        FD1 a2 = bVar2.a(true);
        this.q0 = FD1.W(this.q0, a2);
        a aVar = this.n0;
        if (aVar != null) {
            aVar.a(bVar3, a2);
        }
    }

    @Override // o.J8
    public void g0(HD1 hd1, J8.c cVar) {
        boolean z;
        long j;
        int i;
        AD1 ad1;
        Exception exc;
        long j2;
        C10833xx0 c10833xx0;
        C10833xx0 c10833xx02;
        PG2 pg2;
        if (cVar.e() != 0) {
            F0(cVar);
            Iterator<String> it = this.l0.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                Pair<J8.b, Boolean> B0 = B0(cVar, next);
                b bVar = this.l0.get(next);
                boolean E0 = E0(cVar, next, 11);
                boolean E02 = E0(cVar, next, 1018);
                boolean E03 = E0(cVar, next, 1011);
                boolean E04 = E0(cVar, next, 1000);
                boolean E05 = E0(cVar, next, 10);
                if (!E0(cVar, next, 1003) && !E0(cVar, next, 1024)) {
                    z = false;
                } else {
                    z = true;
                }
                boolean E06 = E0(cVar, next, 1006);
                boolean E07 = E0(cVar, next, 1004);
                boolean E08 = E0(cVar, next, 25);
                J8.b bVar2 = (J8.b) B0.first;
                boolean booleanValue = ((Boolean) B0.second).booleanValue();
                if (next.equals(this.r0)) {
                    j = this.s0;
                } else {
                    j = C10323vs.b;
                }
                if (E02) {
                    i = this.u0;
                } else {
                    i = 0;
                }
                if (E05) {
                    ad1 = hd1.c();
                } else {
                    ad1 = null;
                }
                if (z) {
                    exc = this.v0;
                } else {
                    exc = null;
                }
                long j3 = 0;
                Iterator<String> it2 = it;
                long j4 = j;
                if (E06) {
                    j2 = this.w0;
                } else {
                    j2 = 0;
                }
                long j5 = j2;
                if (E06) {
                    j3 = this.x0;
                }
                if (E07) {
                    c10833xx0 = this.y0;
                } else {
                    c10833xx0 = null;
                }
                if (E07) {
                    c10833xx02 = this.z0;
                } else {
                    c10833xx02 = null;
                }
                if (E08) {
                    pg2 = this.A0;
                } else {
                    pg2 = null;
                }
                bVar.m(hd1, bVar2, booleanValue, j4, E0, i, E03, E04, ad1, exc, j5, j3, c10833xx0, c10833xx02, pg2);
                it = it2;
            }
            this.y0 = null;
            this.z0 = null;
            this.r0 = null;
            if (cVar.a(J8.h0)) {
                this.k0.e(cVar.d(J8.h0));
            }
        }
    }

    @Override // o.ED1.a
    public void i0(J8.b bVar, String str) {
        ((b) C9542sf.g(this.l0.get(str))).o();
    }

    @Override // o.ED1.a
    public void m(J8.b bVar, String str) {
        this.l0.put(str, new b(this.o0, bVar));
        this.m0.put(str, bVar);
    }

    @Override // o.ED1.a
    public void r(J8.b bVar, String str, String str2) {
        ((b) C9542sf.g(this.l0.get(str))).p();
    }

    @Override // o.J8
    public void r0(J8.b bVar, N11 n11, C10519wf1 c10519wf1, IOException iOException, boolean z) {
        this.v0 = iOException;
    }

    @Override // o.J8
    public void w0(J8.b bVar, PG2 pg2) {
        this.A0 = pg2;
    }

    @Override // o.J8
    public void x(J8.b bVar, Exception exc) {
        this.v0 = exc;
    }

    @Override // o.J8
    public void z0(J8.b bVar, int i, long j, long j2) {
        this.w0 = i;
        this.x0 = j;
    }
}
