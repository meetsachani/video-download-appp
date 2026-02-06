package o;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C10833xx0;
import o.FL0;
import o.GX1;
import o.InterfaceC4410Ug1;
import o.InterfaceC8921q70;
import o.InterfaceC9309rh1;
import o.KZ1;
import o.M11;
import o.OU;
import o.R11;

@Deprecated
/* renamed from: o.pJ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8727pJ1 implements InterfaceC4410Ug1, InterfaceC4518Vj0, R11.b<a>, R11.f, GX1.d {
    public static final long H1 = 10000;
    public static final Map<String, String> I1 = K();
    public static final C10833xx0 J1 = new C10833xx0.b().U("icy").g0(C4128Rj1.M0).G();
    public boolean A1;
    public long B1;
    public boolean D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public final Uri X;
    public final FU Y;
    public final M11 Y0;
    public final InterfaceC9170r70 Z;
    public final InterfaceC9309rh1.a Z0;
    public final InterfaceC8921q70.a a1;
    public final b b1;
    public final InterfaceC10877y8 c1;
    @InterfaceC11300zs1
    public final String d1;
    public final long e1;
    public final InterfaceC7493kJ1 g1;
    @InterfaceC11300zs1
    public InterfaceC4410Ug1.a l1;
    @InterfaceC11300zs1
    public HL0 m1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public e s1;
    public KZ1 t1;
    public boolean v1;
    public boolean x1;
    public boolean y1;
    public int z1;
    public final R11 f1 = new R11("ProgressiveMediaPeriod");
    public final CJ h1 = new CJ();
    public final Runnable i1 = new Runnable() { // from class: o.lJ1
        @Override // java.lang.Runnable
        public final void run() {
            C8727pJ1.this.S();
        }
    };
    public final Runnable j1 = new Runnable() { // from class: o.mJ1
        @Override // java.lang.Runnable
        public final void run() {
            C8727pJ1.w(C8727pJ1.this);
        }
    };
    public final Handler k1 = TD2.C();
    public d[] o1 = new d[0];
    public GX1[] n1 = new GX1[0];
    public long C1 = C10323vs.b;
    public long u1 = C10323vs.b;
    public int w1 = 1;

    /* renamed from: o.pJ1$a */
    /* loaded from: classes2.dex */
    public final class a implements R11.e, FL0.a {
        public final Uri b;
        public final C4004Qc2 c;
        public final InterfaceC7493kJ1 d;
        public final InterfaceC4518Vj0 e;
        public final CJ f;
        public volatile boolean h;
        public long j;
        @InterfaceC11300zs1
        public InterfaceC10568wr2 l;
        public boolean m;
        public final KE1 g = new KE1();
        public boolean i = true;
        public final long a = N11.a();
        public OU k = i(0);

        public a(Uri uri, FU fu, InterfaceC7493kJ1 interfaceC7493kJ1, InterfaceC4518Vj0 interfaceC4518Vj0, CJ cj) {
            this.b = uri;
            this.c = new C4004Qc2(fu);
            this.d = interfaceC7493kJ1;
            this.e = interfaceC4518Vj0;
            this.f = cj;
        }

        @Override // o.R11.e
        public void a() throws IOException {
            int i = 0;
            while (i == 0 && !this.h) {
                try {
                    long j = this.g.a;
                    OU i2 = i(j);
                    this.k = i2;
                    long a = this.c.a(i2);
                    if (a != -1) {
                        a += j;
                        C8727pJ1.this.X();
                    }
                    long j2 = a;
                    C8727pJ1.this.m1 = HL0.a(this.c.b());
                    CU cu = this.c;
                    if (C8727pJ1.this.m1 != null && C8727pJ1.this.m1.a1 != -1) {
                        cu = new FL0(this.c, C8727pJ1.this.m1.a1, this);
                        InterfaceC10568wr2 P = C8727pJ1.this.P();
                        this.l = P;
                        P.a(C8727pJ1.J1);
                    }
                    this.d.e(cu, this.b, this.c.b(), j, j2, this.e);
                    if (C8727pJ1.this.m1 != null) {
                        this.d.c();
                    }
                    if (this.i) {
                        this.d.a(j, this.j);
                        this.i = false;
                    }
                    while (i == 0 && !this.h) {
                        try {
                            this.f.a();
                            i = this.d.b(this.g);
                            long d = this.d.d();
                            if (d > C8727pJ1.this.e1 + j) {
                                this.f.d();
                                C8727pJ1.this.k1.post(C8727pJ1.this.j1);
                                j = d;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.d.d() != -1) {
                        this.g.a = this.d.d();
                    }
                    NU.a(this.c);
                } catch (Throwable th) {
                    if (i != 1 && this.d.d() != -1) {
                        this.g.a = this.d.d();
                    }
                    NU.a(this.c);
                    throw th;
                }
            }
        }

        @Override // o.FL0.a
        public void b(C3012Fy1 c3012Fy1) {
            long max;
            if (!this.m) {
                max = this.j;
            } else {
                max = Math.max(C8727pJ1.this.O(true), this.j);
            }
            long j = max;
            int a = c3012Fy1.a();
            InterfaceC10568wr2 interfaceC10568wr2 = (InterfaceC10568wr2) C9542sf.g(this.l);
            interfaceC10568wr2.e(c3012Fy1, a);
            interfaceC10568wr2.b(j, 1, a, 0, null);
            this.m = true;
        }

        @Override // o.R11.e
        public void c() {
            this.h = true;
        }

        public final OU i(long j) {
            return new OU.b().j(this.b).i(j).g(C8727pJ1.this.d1).c(6).f(C8727pJ1.I1).a();
        }

        public final void j(long j, long j2) {
            this.g.a = j;
            this.j = j2;
            this.i = true;
            this.m = false;
        }
    }

    /* renamed from: o.pJ1$b */
    /* loaded from: classes2.dex */
    public interface b {
        void O(long j, boolean z, boolean z2);
    }

    /* renamed from: o.pJ1$c */
    /* loaded from: classes2.dex */
    public final class c implements IX1 {
        public final int X;

        public c(int i) {
            this.X = i;
        }

        @Override // o.IX1
        public void b() throws IOException {
            C8727pJ1.this.W(this.X);
        }

        @Override // o.IX1
        public boolean isReady() {
            return C8727pJ1.this.R(this.X);
        }

        @Override // o.IX1
        public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            return C8727pJ1.this.c0(this.X, c2899Ex0, c9267rW, i);
        }

        @Override // o.IX1
        public int n(long j) {
            return C8727pJ1.this.g0(this.X, j);
        }
    }

    /* renamed from: o.pJ1$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public final int a;
        public final boolean b;

        public d(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a == dVar.a && this.b == dVar.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    /* renamed from: o.pJ1$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public final C10079ur2 a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(C10079ur2 c10079ur2, boolean[] zArr) {
            this.a = c10079ur2;
            this.b = zArr;
            int i = c10079ur2.X;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    public C8727pJ1(Uri uri, FU fu, InterfaceC7493kJ1 interfaceC7493kJ1, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar, M11 m11, InterfaceC9309rh1.a aVar2, b bVar, InterfaceC10877y8 interfaceC10877y8, @InterfaceC11300zs1 String str, int i) {
        this.X = uri;
        this.Y = fu;
        this.Z = interfaceC9170r70;
        this.a1 = aVar;
        this.Y0 = m11;
        this.Z0 = aVar2;
        this.b1 = bVar;
        this.c1 = interfaceC10877y8;
        this.d1 = str;
        this.e1 = i;
        this.g1 = interfaceC7493kJ1;
    }

    public static Map<String, String> K() {
        HashMap hashMap = new HashMap();
        hashMap.put(HL0.b1, "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private boolean Q() {
        if (this.C1 != C10323vs.b) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void w(C8727pJ1 c8727pJ1) {
        if (!c8727pJ1.G1) {
            ((InterfaceC4410Ug1.a) C9542sf.g(c8727pJ1.l1)).l(c8727pJ1);
        }
    }

    @InterfaceC8557od0({"trackState", "seekMap"})
    public final void I() {
        C9542sf.i(this.q1);
        C9542sf.g(this.s1);
        C9542sf.g(this.t1);
    }

    public final boolean J(a aVar, int i) {
        KZ1 kz1;
        if (!this.A1 && ((kz1 = this.t1) == null || kz1.i() == C10323vs.b)) {
            if (this.q1 && !i0()) {
                this.D1 = true;
                return false;
            }
            this.y1 = this.q1;
            this.B1 = 0L;
            this.E1 = 0;
            for (GX1 gx1 : this.n1) {
                gx1.W();
            }
            aVar.j(0L, 0L);
            return true;
        }
        this.E1 = i;
        return true;
    }

    public final int L() {
        int i = 0;
        for (GX1 gx1 : this.n1) {
            i += gx1.I();
        }
        return i;
    }

    public final long O(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.n1.length; i++) {
            if (z || ((e) C9542sf.g(this.s1)).c[i]) {
                j = Math.max(j, this.n1[i].B());
            }
        }
        return j;
    }

    public InterfaceC10568wr2 P() {
        return b0(new d(0, true));
    }

    public boolean R(int i) {
        if (!i0() && this.n1[i].M(this.F1)) {
            return true;
        }
        return false;
    }

    public final void S() {
        boolean z;
        C4224Si1 a2;
        if (!this.G1 && !this.q1 && this.p1 && this.t1 != null) {
            for (GX1 gx1 : this.n1) {
                if (gx1.H() == null) {
                    return;
                }
            }
            this.h1.d();
            int length = this.n1.length;
            C9593sr2[] c9593sr2Arr = new C9593sr2[length];
            boolean[] zArr = new boolean[length];
            for (int i = 0; i < length; i++) {
                C10833xx0 c10833xx0 = (C10833xx0) C9542sf.g(this.n1[i].H());
                String str = c10833xx0.g1;
                boolean p = C4128Rj1.p(str);
                if (!p && !C4128Rj1.t(str)) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[i] = z;
                this.r1 = z | this.r1;
                HL0 hl0 = this.m1;
                if (hl0 != null) {
                    if (p || this.o1[i].b) {
                        C4224Si1 c4224Si1 = c10833xx0.e1;
                        if (c4224Si1 == null) {
                            a2 = new C4224Si1(hl0);
                        } else {
                            a2 = c4224Si1.a(hl0);
                        }
                        c10833xx0 = c10833xx0.b().Z(a2).G();
                    }
                    if (p && c10833xx0.a1 == -1 && c10833xx0.b1 == -1 && hl0.X != -1) {
                        c10833xx0 = c10833xx0.b().I(hl0.X).G();
                    }
                }
                c9593sr2Arr[i] = new C9593sr2(Integer.toString(i), c10833xx0.c(this.Z.d(c10833xx0)));
            }
            this.s1 = new e(new C10079ur2(c9593sr2Arr), zArr);
            this.q1 = true;
            ((InterfaceC4410Ug1.a) C9542sf.g(this.l1)).j(this);
        }
    }

    public final void T(int i) {
        I();
        e eVar = this.s1;
        boolean[] zArr = eVar.d;
        if (!zArr[i]) {
            C10833xx0 c2 = eVar.a.b(i).c(0);
            this.Z0.h(C4128Rj1.l(c2.g1), c2, 0, null, this.B1);
            zArr[i] = true;
        }
    }

    public final void U(int i) {
        I();
        boolean[] zArr = this.s1.b;
        if (this.D1 && zArr[i]) {
            if (!this.n1[i].M(false)) {
                this.C1 = 0L;
                this.D1 = false;
                this.y1 = true;
                this.B1 = 0L;
                this.E1 = 0;
                for (GX1 gx1 : this.n1) {
                    gx1.W();
                }
                ((InterfaceC4410Ug1.a) C9542sf.g(this.l1)).l(this);
            }
        }
    }

    public void V() throws IOException {
        this.f1.a(this.Y0.a(this.w1));
    }

    public void W(int i) throws IOException {
        this.n1[i].O();
        V();
    }

    public final void X() {
        this.k1.post(new Runnable() { // from class: o.nJ1
            @Override // java.lang.Runnable
            public final void run() {
                C8727pJ1.this.A1 = true;
            }
        });
    }

    @Override // o.R11.b
    /* renamed from: Y */
    public void M(a aVar, long j, long j2, boolean z) {
        C4004Qc2 c4004Qc2 = aVar.c;
        N11 n11 = new N11(aVar.a, aVar.k, c4004Qc2.y(), c4004Qc2.z(), j, j2, c4004Qc2.m());
        this.Y0.c(aVar.a);
        this.Z0.k(n11, 1, -1, null, 0, null, aVar.j, this.u1);
        if (!z) {
            for (GX1 gx1 : this.n1) {
                gx1.W();
            }
            if (this.z1 > 0) {
                ((InterfaceC4410Ug1.a) C9542sf.g(this.l1)).l(this);
            }
        }
    }

    @Override // o.R11.b
    /* renamed from: Z */
    public void t(a aVar, long j, long j2) {
        KZ1 kz1;
        long j3;
        if (this.u1 == C10323vs.b && (kz1 = this.t1) != null) {
            boolean h = kz1.h();
            long O = O(true);
            if (O == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = O + 10000;
            }
            this.u1 = j3;
            this.b1.O(j3, h, this.v1);
        }
        C4004Qc2 c4004Qc2 = aVar.c;
        N11 n11 = new N11(aVar.a, aVar.k, c4004Qc2.y(), c4004Qc2.z(), j, j2, c4004Qc2.m());
        this.Y0.c(aVar.a);
        this.Z0.n(n11, 1, -1, null, 0, null, aVar.j, this.u1);
        this.F1 = true;
        ((InterfaceC4410Ug1.a) C9542sf.g(this.l1)).l(this);
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        if (this.f1.k() && this.h1.e()) {
            return true;
        }
        return false;
    }

    @Override // o.R11.b
    /* renamed from: a0 */
    public R11.c N(a aVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        a aVar2;
        R11.c cVar;
        C4004Qc2 c4004Qc2 = aVar.c;
        N11 n11 = new N11(aVar.a, aVar.k, c4004Qc2.y(), c4004Qc2.z(), j, j2, c4004Qc2.m());
        long d2 = this.Y0.d(new M11.d(n11, new C10519wf1(1, -1, null, 0, null, TD2.b2(aVar.j), TD2.b2(this.u1)), iOException, i));
        if (d2 == C10323vs.b) {
            cVar = R11.l;
            aVar2 = aVar;
        } else {
            int L = L();
            if (L > this.E1) {
                z = true;
            } else {
                z = false;
            }
            aVar2 = aVar;
            if (J(aVar2, L)) {
                cVar = R11.i(z, d2);
            } else {
                cVar = R11.k;
            }
        }
        boolean c2 = cVar.c();
        this.Z0.p(n11, 1, -1, null, 0, null, aVar2.j, this.u1, iOException, !c2);
        if (!c2) {
            this.Y0.c(aVar2.a);
        }
        return cVar;
    }

    @Override // o.InterfaceC4518Vj0
    public InterfaceC10568wr2 b(int i, int i2) {
        return b0(new d(i, false));
    }

    public final InterfaceC10568wr2 b0(d dVar) {
        int length = this.n1.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.o1[i])) {
                return this.n1[i];
            }
        }
        GX1 l = GX1.l(this.c1, this.Z, this.a1);
        l.e0(this);
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.o1, i2);
        dVarArr[length] = dVar;
        this.o1 = (d[]) TD2.p(dVarArr);
        GX1[] gx1Arr = (GX1[]) Arrays.copyOf(this.n1, i2);
        gx1Arr[length] = l;
        this.n1 = (GX1[]) TD2.p(gx1Arr);
        return l;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        return f();
    }

    public int c0(int i, C2899Ex0 c2899Ex0, C9267rW c9267rW, int i2) {
        if (i0()) {
            return -3;
        }
        T(i);
        int T = this.n1[i].T(c2899Ex0, c9267rW, i2, this.F1);
        if (T == -3) {
            U(i);
        }
        return T;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        if (!this.F1 && !this.f1.j() && !this.D1) {
            if (!this.q1 || this.z1 != 0) {
                boolean f = this.h1.f();
                if (!this.f1.k()) {
                    h0();
                    return true;
                }
                return f;
            }
            return false;
        }
        return false;
    }

    public void d0() {
        if (this.q1) {
            for (GX1 gx1 : this.n1) {
                gx1.S();
            }
        }
        this.f1.m(this);
        this.k1.removeCallbacksAndMessages(null);
        this.l1 = null;
        this.G1 = true;
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        I();
        if (!this.t1.h()) {
            return 0L;
        }
        KZ1.a e2 = this.t1.e(j);
        return lz1.a(j, e2.a.a, e2.b.a);
    }

    public final boolean e0(boolean[] zArr, long j) {
        int length = this.n1.length;
        for (int i = 0; i < length; i++) {
            if (!this.n1[i].a0(j, false) && (zArr[i] || !this.r1)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        long j;
        I();
        if (this.F1 || this.z1 == 0) {
            return Long.MIN_VALUE;
        }
        if (Q()) {
            return this.C1;
        }
        if (this.r1) {
            int length = this.n1.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e eVar = this.s1;
                if (eVar.b[i] && eVar.c[i] && !this.n1[i].L()) {
                    j = Math.min(j, this.n1[i].B());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = O(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.B1;
        }
        return j;
    }

    public final void f0(KZ1 kz1) {
        KZ1 bVar;
        boolean z;
        if (this.m1 == null) {
            bVar = kz1;
        } else {
            bVar = new KZ1.b(C10323vs.b);
        }
        this.t1 = bVar;
        this.u1 = kz1.i();
        int i = 1;
        if (!this.A1 && kz1.i() == C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        this.v1 = z;
        if (z) {
            i = 7;
        }
        this.w1 = i;
        this.b1.O(this.u1, kz1.h(), this.v1);
        if (!this.q1) {
            S();
        }
    }

    public int g0(int i, long j) {
        if (i0()) {
            return 0;
        }
        T(i);
        GX1 gx1 = this.n1[i];
        int G = gx1.G(j, this.F1);
        gx1.f0(G);
        if (G == 0) {
            U(i);
        }
        return G;
    }

    public final void h0() {
        a aVar = new a(this.X, this.Y, this.g1, this, this.h1);
        if (this.q1) {
            C9542sf.i(Q());
            long j = this.u1;
            if (j == C10323vs.b || this.C1 <= j) {
                aVar.j(((KZ1) C9542sf.g(this.t1)).e(this.C1).a.b, this.C1);
                for (GX1 gx1 : this.n1) {
                    gx1.c0(this.C1);
                }
                this.C1 = C10323vs.b;
            } else {
                this.F1 = true;
                this.C1 = C10323vs.b;
                return;
            }
        }
        this.E1 = L();
        this.Z0.t(new N11(aVar.a, aVar.k, this.f1.n(aVar, this, this.Y0.a(this.w1))), 1, -1, null, 0, null, aVar.j, this.u1);
    }

    @Override // o.InterfaceC4410Ug1
    public long i(long j) {
        I();
        boolean[] zArr = this.s1.b;
        if (!this.t1.h()) {
            j = 0;
        }
        int i = 0;
        this.y1 = false;
        this.B1 = j;
        if (Q()) {
            this.C1 = j;
            return j;
        }
        if (this.w1 == 7 || !e0(zArr, j)) {
            this.D1 = false;
            this.C1 = j;
            this.F1 = false;
            if (this.f1.k()) {
                GX1[] gx1Arr = this.n1;
                int length = gx1Arr.length;
                while (i < length) {
                    gx1Arr[i].s();
                    i++;
                }
                this.f1.g();
                return j;
            }
            this.f1.h();
            GX1[] gx1Arr2 = this.n1;
            int length2 = gx1Arr2.length;
            while (i < length2) {
                gx1Arr2[i].W();
                i++;
            }
        }
        return j;
    }

    public final boolean i0() {
        if (!this.y1 && !Q()) {
            return false;
        }
        return true;
    }

    @Override // o.GX1.d
    public void j(C10833xx0 c10833xx0) {
        this.k1.post(this.i1);
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        if (this.y1) {
            if (this.F1 || L() > this.E1) {
                this.y1 = false;
                return this.B1;
            }
            return C10323vs.b;
        }
        return C10323vs.b;
    }

    @Override // o.R11.f
    public void l() {
        for (GX1 gx1 : this.n1) {
            gx1.U();
        }
        this.g1.g();
    }

    @Override // o.InterfaceC4410Ug1
    public void m() throws IOException {
        V();
        if (this.F1 && !this.q1) {
            throw C3989Py1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // o.InterfaceC4518Vj0
    public void n() {
        this.p1 = true;
        this.k1.post(this.i1);
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        this.l1 = aVar;
        this.h1.f();
        h0();
    }

    @Override // o.InterfaceC4518Vj0
    public void p(final KZ1 kz1) {
        this.k1.post(new Runnable() { // from class: o.oJ1
            @Override // java.lang.Runnable
            public final void run() {
                C8727pJ1.this.f0(kz1);
            }
        });
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        I();
        return this.s1.a;
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
        I();
        if (!Q()) {
            boolean[] zArr = this.s1.c;
            int length = this.n1.length;
            for (int i = 0; i < length; i++) {
                this.n1[i].r(j, z, zArr[i]);
            }
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        boolean z;
        InterfaceC6859hi0 interfaceC6859hi0;
        boolean z2;
        boolean z3;
        I();
        e eVar = this.s1;
        C10079ur2 c10079ur2 = eVar.a;
        boolean[] zArr3 = eVar.c;
        int i = this.z1;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC6859hi0Arr.length; i3++) {
            IX1 ix1 = ix1Arr[i3];
            if (ix1 != null && (interfaceC6859hi0Arr[i3] == null || !zArr[i3])) {
                int i4 = ((c) ix1).X;
                C9542sf.i(zArr3[i4]);
                this.z1--;
                zArr3[i4] = false;
                ix1Arr[i3] = null;
            }
        }
        if (!this.x1 ? j != 0 : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < interfaceC6859hi0Arr.length; i5++) {
            if (ix1Arr[i5] == null && (interfaceC6859hi0 = interfaceC6859hi0Arr[i5]) != null) {
                if (interfaceC6859hi0.length() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9542sf.i(z2);
                if (interfaceC6859hi0.g(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C9542sf.i(z3);
                int c2 = c10079ur2.c(interfaceC6859hi0.n());
                C9542sf.i(!zArr3[c2]);
                this.z1++;
                zArr3[c2] = true;
                ix1Arr[i5] = new c(c2);
                zArr2[i5] = true;
                if (!z) {
                    GX1 gx1 = this.n1[c2];
                    if (!gx1.a0(j, true) && gx1.E() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.z1 == 0) {
            this.D1 = false;
            this.y1 = false;
            if (this.f1.k()) {
                GX1[] gx1Arr = this.n1;
                int length = gx1Arr.length;
                while (i2 < length) {
                    gx1Arr[i2].s();
                    i2++;
                }
                this.f1.g();
            } else {
                GX1[] gx1Arr2 = this.n1;
                int length2 = gx1Arr2.length;
                while (i2 < length2) {
                    gx1Arr2[i2].W();
                    i2++;
                }
            }
        } else if (z) {
            j = i(j);
            while (i2 < ix1Arr.length) {
                if (ix1Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.x1 = true;
        return j;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
    }
}
