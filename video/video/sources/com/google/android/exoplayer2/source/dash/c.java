package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC10052ul;
import o.AbstractC2533Be1;
import o.AbstractC6044eO0;
import o.AbstractC6238fC;
import o.C10148v82;
import o.C10323vs;
import o.C10415wE;
import o.C10833xx0;
import o.C10901yE;
import o.C4041Qm;
import o.C4134Rl;
import o.C4331Tl;
import o.C6067eU;
import o.C6736hC;
import o.C6979iC;
import o.C7535kU;
import o.C7778lU;
import o.C8190n7;
import o.C9347rr;
import o.CL;
import o.EP0;
import o.FU;
import o.InterfaceC10186vI0;
import o.InterfaceC11300zs1;
import o.InterfaceC2631Ce1;
import o.InterfaceC4261Sr2;
import o.InterfaceC6493gC;
import o.InterfaceC6859hi0;
import o.InterfaceC7292jU;
import o.LZ1;
import o.M11;
import o.ND1;
import o.OB;
import o.OU;
import o.T11;
import o.TD2;
import o.XN1;
import o.ZR1;

@Deprecated
/* loaded from: classes2.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {
    public final T11 a;
    public final C4331Tl b;
    public final int[] c;
    public final int d;
    public final FU e;
    public final long f;
    public final int g;
    @InterfaceC11300zs1
    public final d.c h;
    @InterfaceC11300zs1
    public final C10415wE i;
    public final b[] j;
    public InterfaceC6859hi0 k;
    public C6067eU l;
    public int m;
    @InterfaceC11300zs1
    public IOException n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f161o;

    /* loaded from: classes2.dex */
    public static final class a implements a.InterfaceC0092a {
        public final FU.a a;
        public final int b;
        public final InterfaceC6493gC.a c;

        public a(FU.a aVar) {
            this(aVar, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0092a
        public com.google.android.exoplayer2.source.dash.a a(T11 t11, C6067eU c6067eU, C4331Tl c4331Tl, int i, int[] iArr, InterfaceC6859hi0 interfaceC6859hi0, int i2, long j, boolean z, List<C10833xx0> list, @InterfaceC11300zs1 d.c cVar, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, ND1 nd1, @InterfaceC11300zs1 C10415wE c10415wE) {
            FU a = this.a.a();
            if (interfaceC4261Sr2 != null) {
                a.s(interfaceC4261Sr2);
            }
            return new c(this.c, t11, c6067eU, c4331Tl, i, iArr, interfaceC6859hi0, i2, a, j, this.b, z, list, cVar, nd1, c10415wE);
        }

        public a(FU.a aVar, int i) {
            this(C9347rr.e1, aVar, i);
        }

        public a(InterfaceC6493gC.a aVar, FU.a aVar2, int i) {
            this.c = aVar;
            this.a = aVar2;
            this.b = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        @InterfaceC11300zs1
        public final InterfaceC6493gC a;
        public final ZR1 b;
        public final C4134Rl c;
        @InterfaceC11300zs1
        public final InterfaceC7292jU d;
        public final long e;
        public final long f;

        public b(long j, ZR1 zr1, C4134Rl c4134Rl, @InterfaceC11300zs1 InterfaceC6493gC interfaceC6493gC, long j2, @InterfaceC11300zs1 InterfaceC7292jU interfaceC7292jU) {
            this.e = j;
            this.b = zr1;
            this.c = c4134Rl;
            this.f = j2;
            this.a = interfaceC6493gC;
            this.d = interfaceC7292jU;
        }

        @OB
        public b b(long j, ZR1 zr1) throws C4041Qm {
            long h;
            long h2;
            InterfaceC7292jU b = this.b.b();
            InterfaceC7292jU b2 = zr1.b();
            if (b == null) {
                return new b(j, zr1, this.c, this.a, this.f, b);
            }
            if (!b.j()) {
                return new b(j, zr1, this.c, this.a, this.f, b2);
            }
            long i = b.i(j);
            if (i == 0) {
                return new b(j, zr1, this.c, this.a, this.f, b2);
            }
            long k = b.k();
            long c = b.c(k);
            long j2 = i + k;
            long j3 = j2 - 1;
            long c2 = b.c(j3) + b.d(j3, j);
            long k2 = b2.k();
            long c3 = b2.c(k2);
            long j4 = this.f;
            int i2 = (c2 > c3 ? 1 : (c2 == c3 ? 0 : -1));
            if (i2 == 0) {
                h = j2 - k2;
            } else if (i2 >= 0) {
                if (c3 < c) {
                    h2 = j4 - (b2.h(c, j) - k);
                    return new b(j, zr1, this.c, this.a, h2, b2);
                }
                h = b.h(c3, j) - k2;
            } else {
                throw new C4041Qm();
            }
            h2 = j4 + h;
            return new b(j, zr1, this.c, this.a, h2, b2);
        }

        @OB
        public b c(InterfaceC7292jU interfaceC7292jU) {
            return new b(this.e, this.b, this.c, this.a, this.f, interfaceC7292jU);
        }

        @OB
        public b d(C4134Rl c4134Rl) {
            return new b(this.e, this.b, c4134Rl, this.a, this.f, this.d);
        }

        public long e(long j) {
            return this.d.e(this.e, j) + this.f;
        }

        public long f() {
            return this.d.k() + this.f;
        }

        public long g(long j) {
            return (e(j) + this.d.l(this.e, j)) - 1;
        }

        public long h() {
            return this.d.i(this.e);
        }

        public long i(long j) {
            return k(j) + this.d.d(j - this.f, this.e);
        }

        public long j(long j) {
            return this.d.h(j, this.e) + this.f;
        }

        public long k(long j) {
            return this.d.c(j - this.f);
        }

        public XN1 l(long j) {
            return this.d.g(j - this.f);
        }

        public boolean m(long j, long j2) {
            if (this.d.j() || j2 == C10323vs.b || i(j) <= j2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0094c extends AbstractC10052ul {
        public final b e;
        public final long f;

        public C0094c(b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.e = bVar;
            this.f = j3;
        }

        @Override // o.InterfaceC2631Ce1
        public long a() {
            e();
            return this.e.k(f());
        }

        @Override // o.InterfaceC2631Ce1
        public long b() {
            e();
            return this.e.i(f());
        }

        @Override // o.InterfaceC2631Ce1
        public OU d() {
            int i;
            e();
            long f = f();
            XN1 l = this.e.l(f);
            if (this.e.m(f, this.f)) {
                i = 0;
            } else {
                i = 8;
            }
            b bVar = this.e;
            return C7535kU.b(bVar.b, bVar.c.a, l, i, AbstractC6044eO0.u());
        }
    }

    public c(InterfaceC6493gC.a aVar, T11 t11, C6067eU c6067eU, C4331Tl c4331Tl, int i, int[] iArr, InterfaceC6859hi0 interfaceC6859hi0, int i2, FU fu, long j, int i3, boolean z, List<C10833xx0> list, @InterfaceC11300zs1 d.c cVar, ND1 nd1, @InterfaceC11300zs1 C10415wE c10415wE) {
        this.a = t11;
        this.l = c6067eU;
        this.b = c4331Tl;
        this.c = iArr;
        this.k = interfaceC6859hi0;
        int i4 = i2;
        this.d = i4;
        this.e = fu;
        this.m = i;
        this.f = j;
        this.g = i3;
        d.c cVar2 = cVar;
        this.h = cVar2;
        this.i = c10415wE;
        long g = c6067eU.g(i);
        ArrayList<ZR1> o2 = o();
        this.j = new b[interfaceC6859hi0.length()];
        int i5 = 0;
        while (i5 < this.j.length) {
            ZR1 zr1 = o2.get(interfaceC6859hi0.g(i5));
            C4134Rl j2 = c4331Tl.j(zr1.d);
            b[] bVarArr = this.j;
            C4134Rl c4134Rl = j2 == null ? zr1.d.get(0) : j2;
            InterfaceC6493gC a2 = aVar.a(i4, zr1.c, z, list, cVar2, nd1);
            long j3 = g;
            bVarArr[i5] = new b(j3, zr1, c4134Rl, a2, 0L, zr1.b());
            i5++;
            cVar2 = cVar;
            g = j3;
            i4 = i2;
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void a(InterfaceC6859hi0 interfaceC6859hi0) {
        this.k = interfaceC6859hi0;
    }

    @Override // o.InterfaceC7706lC
    public void b() throws IOException {
        IOException iOException = this.n;
        if (iOException == null) {
            this.a.b();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void c(C6067eU c6067eU, int i) {
        try {
            this.l = c6067eU;
            this.m = i;
            long g = c6067eU.g(i);
            ArrayList<ZR1> o2 = o();
            for (int i2 = 0; i2 < this.j.length; i2++) {
                b[] bVarArr = this.j;
                bVarArr[i2] = bVarArr[i2].b(g, o2.get(this.k.g(i2)));
            }
        } catch (C4041Qm e) {
            this.n = e;
        }
    }

    @Override // o.InterfaceC7706lC
    public long e(long j, LZ1 lz1) {
        long j2;
        long j3 = j;
        b[] bVarArr = this.j;
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            b bVar = bVarArr[i];
            if (bVar.d != null) {
                long h = bVar.h();
                if (h != 0) {
                    long j4 = bVar.j(j3);
                    long k = bVar.k(j4);
                    if (k < j3 && (h == -1 || j4 < (bVar.f() + h) - 1)) {
                        j2 = bVar.k(j4 + 1);
                    } else {
                        j2 = k;
                    }
                    return lz1.a(j3, k, j2);
                }
            }
            i++;
            j3 = j;
        }
        return j;
    }

    @Override // o.InterfaceC7706lC
    public boolean f(AbstractC6238fC abstractC6238fC, boolean z, M11.d dVar, M11 m11) {
        M11.b b2;
        if (!z) {
            return false;
        }
        d.c cVar = this.h;
        if (cVar != null && cVar.j(abstractC6238fC)) {
            return true;
        }
        if (!this.l.d && (abstractC6238fC instanceof AbstractC2533Be1)) {
            IOException iOException = dVar.c;
            if ((iOException instanceof InterfaceC10186vI0.f) && ((InterfaceC10186vI0.f) iOException).c1 == 404) {
                b bVar = this.j[this.k.o(abstractC6238fC.d)];
                long h = bVar.h();
                if (h != -1 && h != 0) {
                    if (((AbstractC2533Be1) abstractC6238fC).g() > (bVar.f() + h) - 1) {
                        this.f161o = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.j[this.k.o(abstractC6238fC.d)];
        C4134Rl j = this.b.j(bVar2.b.d);
        if (j != null && !bVar2.c.equals(j)) {
            return true;
        }
        M11.a l = l(this.k, bVar2.b.d);
        if ((l.a(2) || l.a(1)) && (b2 = m11.b(l, dVar)) != null && l.a(b2.a)) {
            int i = b2.a;
            if (i == 2) {
                InterfaceC6859hi0 interfaceC6859hi0 = this.k;
                return interfaceC6859hi0.h(interfaceC6859hi0.o(abstractC6238fC.d), b2.b);
            } else if (i == 1) {
                this.b.e(bVar2.c, b2.b);
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC7706lC
    public void g() {
        for (b bVar : this.j) {
            InterfaceC6493gC interfaceC6493gC = bVar.a;
            if (interfaceC6493gC != null) {
                interfaceC6493gC.g();
            }
        }
    }

    @Override // o.InterfaceC7706lC
    public boolean h(long j, AbstractC6238fC abstractC6238fC, List<? extends AbstractC2533Be1> list) {
        if (this.n != null) {
            return false;
        }
        return this.k.e(j, abstractC6238fC, list);
    }

    @Override // o.InterfaceC7706lC
    public void i(AbstractC6238fC abstractC6238fC) {
        C6979iC d;
        if (abstractC6238fC instanceof EP0) {
            int o2 = this.k.o(((EP0) abstractC6238fC).d);
            b bVar = this.j[o2];
            if (bVar.d == null && (d = bVar.a.d()) != null) {
                this.j[o2] = bVar.c(new C7778lU(d, bVar.b.e));
            }
        }
        d.c cVar = this.h;
        if (cVar != null) {
            cVar.i(abstractC6238fC);
        }
    }

    @Override // o.InterfaceC7706lC
    public void j(long j, long j2, List<? extends AbstractC2533Be1> list, C6736hC c6736hC) {
        AbstractC2533Be1 abstractC2533Be1;
        C10901yE c10901yE;
        C6067eU c6067eU;
        boolean z;
        boolean z2;
        long j3;
        boolean z3;
        XN1 xn1;
        boolean z4;
        InterfaceC2631Ce1[] interfaceC2631Ce1Arr;
        long j4;
        int i;
        int i2;
        c cVar;
        AbstractC2533Be1 abstractC2533Be12;
        c cVar2 = this;
        if (cVar2.n == null) {
            long j5 = j2 - j;
            long j1 = TD2.j1(cVar2.l.a) + TD2.j1(cVar2.l.d(cVar2.m).b) + j2;
            d.c cVar3 = cVar2.h;
            if (cVar3 != null && cVar3.h(j1)) {
                return;
            }
            long j12 = TD2.j1(TD2.t0(cVar2.f));
            long n = cVar2.n(j12);
            XN1 xn12 = null;
            boolean z5 = true;
            if (list.isEmpty()) {
                abstractC2533Be1 = null;
            } else {
                abstractC2533Be1 = list.get(list.size() - 1);
            }
            int length = cVar2.k.length();
            InterfaceC2631Ce1[] interfaceC2631Ce1Arr2 = new InterfaceC2631Ce1[length];
            int i3 = 0;
            while (i3 < length) {
                b bVar = cVar2.j[i3];
                if (bVar.d == null) {
                    interfaceC2631Ce1Arr2[i3] = InterfaceC2631Ce1.a;
                    cVar = cVar2;
                    abstractC2533Be12 = abstractC2533Be1;
                    z4 = z5;
                    interfaceC2631Ce1Arr = interfaceC2631Ce1Arr2;
                    j4 = j5;
                    i2 = length;
                    i = i3;
                } else {
                    InterfaceC2631Ce1[] interfaceC2631Ce1Arr3 = interfaceC2631Ce1Arr2;
                    long e = bVar.e(j12);
                    z4 = z5;
                    interfaceC2631Ce1Arr = interfaceC2631Ce1Arr3;
                    AbstractC2533Be1 abstractC2533Be13 = abstractC2533Be1;
                    long g = bVar.g(j12);
                    j4 = j5;
                    i = i3;
                    i2 = length;
                    long p = cVar2.p(bVar, abstractC2533Be13, j2, e, g);
                    cVar = cVar2;
                    abstractC2533Be12 = abstractC2533Be13;
                    if (p < e) {
                        interfaceC2631Ce1Arr[i] = InterfaceC2631Ce1.a;
                    } else {
                        interfaceC2631Ce1Arr[i] = new C0094c(cVar.s(i), p, g, n);
                    }
                }
                i3 = i + 1;
                cVar2 = cVar;
                length = i2;
                abstractC2533Be1 = abstractC2533Be12;
                interfaceC2631Ce1Arr2 = interfaceC2631Ce1Arr;
                z5 = z4;
                j5 = j4;
            }
            c cVar4 = cVar2;
            AbstractC2533Be1 abstractC2533Be14 = abstractC2533Be1;
            boolean z6 = z5;
            long j6 = j5;
            cVar4.k.l(j, j6, cVar4.m(j12, j), list, interfaceC2631Ce1Arr2);
            int f = cVar4.k.f();
            C10415wE c10415wE = cVar4.i;
            if (c10415wE == null) {
                c10901yE = null;
            } else {
                c10901yE = new C10901yE(c10415wE, cVar4.k, j6, "d", cVar4.l.d);
            }
            b s = cVar4.s(f);
            InterfaceC6493gC interfaceC6493gC = s.a;
            if (interfaceC6493gC != null) {
                ZR1 zr1 = s.b;
                if (interfaceC6493gC.e() == null) {
                    xn1 = zr1.n();
                } else {
                    xn1 = null;
                }
                if (s.d == null) {
                    xn12 = zr1.m();
                }
                XN1 xn13 = xn12;
                if (xn1 != null || xn13 != null) {
                    c6736hC.a = cVar4.q(s, cVar4.e, cVar4.k.t(), cVar4.k.u(), cVar4.k.j(), xn1, xn13, c10901yE);
                    return;
                }
            }
            C10901yE c10901yE2 = c10901yE;
            long j7 = s.e;
            if (cVar4.l.d && cVar4.m == c6067eU.e() - 1) {
                z = z6;
            } else {
                z = false;
            }
            if (z && j7 == C10323vs.b) {
                z2 = false;
            } else {
                z2 = z6;
            }
            if (s.h() == 0) {
                c6736hC.b = z2;
                return;
            }
            long e2 = s.e(j12);
            long g2 = s.g(j12);
            if (z) {
                long i4 = s.i(g2);
                if (i4 + (i4 - s.k(g2)) >= j7) {
                    z3 = z6;
                } else {
                    z3 = false;
                }
                z2 &= z3;
            }
            boolean z7 = z2;
            long p2 = cVar4.p(s, abstractC2533Be14, j2, e2, g2);
            if (p2 < e2) {
                cVar4.n = new C4041Qm();
                return;
            }
            int i5 = (p2 > g2 ? 1 : (p2 == g2 ? 0 : -1));
            if (i5 <= 0 && (!cVar4.f161o || i5 < 0)) {
                if (z7 && s.k(p2) >= j7) {
                    c6736hC.b = z6;
                    return;
                }
                int min = (int) Math.min(cVar4.g, (g2 - p2) + 1);
                if (j7 != C10323vs.b) {
                    while (min > 1 && s.k((min + p2) - 1) >= j7) {
                        min--;
                    }
                }
                int i6 = min;
                if (list.isEmpty()) {
                    j3 = j2;
                } else {
                    j3 = -9223372036854775807L;
                }
                c6736hC.a = cVar4.r(s, cVar4.e, cVar4.d, cVar4.k.t(), cVar4.k.u(), cVar4.k.j(), p2, i6, j3, n, c10901yE2);
                return;
            }
            c6736hC.b = z7;
        }
    }

    @Override // o.InterfaceC7706lC
    public int k(long j, List<? extends AbstractC2533Be1> list) {
        if (this.n == null && this.k.length() >= 2) {
            return this.k.r(j, list);
        }
        return list.size();
    }

    public final M11.a l(InterfaceC6859hi0 interfaceC6859hi0, List<C4134Rl> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC6859hi0.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC6859hi0.d(i2, elapsedRealtime)) {
                i++;
            }
        }
        int f = C4331Tl.f(list);
        return new M11.a(f, f - this.b.g(list), length, i);
    }

    public final long m(long j, long j2) {
        if (this.l.d && this.j[0].h() != 0) {
            return Math.max(0L, Math.min(n(j), this.j[0].i(this.j[0].g(j))) - j2);
        }
        return C10323vs.b;
    }

    public final long n(long j) {
        C6067eU c6067eU = this.l;
        long j2 = c6067eU.a;
        if (j2 == C10323vs.b) {
            return C10323vs.b;
        }
        return j - TD2.j1(j2 + c6067eU.d(this.m).b);
    }

    public final ArrayList<ZR1> o() {
        List<C8190n7> list = this.l.d(this.m).c;
        ArrayList<ZR1> arrayList = new ArrayList<>();
        for (int i : this.c) {
            arrayList.addAll(list.get(i).c);
        }
        return arrayList;
    }

    public final long p(b bVar, @InterfaceC11300zs1 AbstractC2533Be1 abstractC2533Be1, long j, long j2, long j3) {
        if (abstractC2533Be1 != null) {
            return abstractC2533Be1.g();
        }
        return TD2.x(bVar.j(j), j2, j3);
    }

    public AbstractC6238fC q(b bVar, FU fu, C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 XN1 xn1, @InterfaceC11300zs1 XN1 xn12, @InterfaceC11300zs1 C10901yE c10901yE) {
        AbstractC6044eO0<String, String> a2;
        XN1 xn13 = xn1;
        ZR1 zr1 = bVar.b;
        if (xn13 != null) {
            XN1 a3 = xn13.a(xn12, bVar.c.a);
            if (a3 != null) {
                xn13 = a3;
            }
        } else {
            xn13 = xn12;
        }
        if (c10901yE == null) {
            a2 = AbstractC6044eO0.u();
        } else {
            a2 = c10901yE.e("i").a();
        }
        return new EP0(fu, C7535kU.b(zr1, bVar.c.a, xn13, 0, a2), c10833xx0, i, obj, bVar.a);
    }

    public AbstractC6238fC r(b bVar, FU fu, int i, C10833xx0 c10833xx0, int i2, Object obj, long j, int i3, long j2, long j3, @InterfaceC11300zs1 C10901yE c10901yE) {
        int i4;
        AbstractC6044eO0<String, String> a2;
        int i5;
        AbstractC6044eO0<String, String> a3;
        ZR1 zr1 = bVar.b;
        long k = bVar.k(j);
        XN1 l = bVar.l(j);
        if (bVar.a == null) {
            long i6 = bVar.i(j);
            if (bVar.m(j, j3)) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            if (c10901yE == null) {
                a3 = AbstractC6044eO0.u();
            } else {
                a3 = c10901yE.d(i6 - k).e(C10901yE.c(this.k)).a();
            }
            return new C10148v82(fu, C7535kU.b(zr1, bVar.c.a, l, i5, a3), c10833xx0, i2, obj, k, i6, j, i, c10833xx0);
        }
        int i7 = 1;
        int i8 = 1;
        while (i7 < i3) {
            XN1 a4 = l.a(bVar.l(j + i7), bVar.c.a);
            if (a4 == null) {
                break;
            }
            i8++;
            i7++;
            l = a4;
        }
        long j4 = (j + i8) - 1;
        int i9 = i8;
        long i10 = bVar.i(j4);
        long j5 = bVar.e;
        if (j5 == C10323vs.b || j5 > i10) {
            j5 = -9223372036854775807L;
        }
        if (bVar.m(j4, j3)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (c10901yE == null) {
            a2 = AbstractC6044eO0.u();
        } else {
            a2 = c10901yE.d(i10 - k).e(C10901yE.c(this.k)).a();
        }
        return new CL(fu, C7535kU.b(zr1, bVar.c.a, l, i4, a2), c10833xx0, i2, obj, k, i10, j2, j5, j, i9, -zr1.e, bVar.a);
    }

    public final b s(int i) {
        b bVar = this.j[i];
        C4134Rl j = this.b.j(bVar.b.d);
        if (j != null && !j.equals(bVar.c)) {
            b d = bVar.d(j);
            this.j[i] = d;
            return d;
        }
        return bVar;
    }
}
