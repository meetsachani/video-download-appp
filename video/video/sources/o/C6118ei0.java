package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC3283Ir2;
import o.AbstractC5317bO0;
import o.AbstractC7373jp2;
import o.C3144Hh1;
import o.C4224Si1;
import o.C8322nf1;
import o.GZ;
import o.InterfaceC10469wR1;
import o.InterfaceC10712xR1;
import o.InterfaceC4410Ug1;
import o.InterfaceC7201j70;
import o.InterfaceC7583kh1;
import o.OD1;

@Deprecated
/* renamed from: o.ei0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6118ei0 implements Handler.Callback, InterfaceC4410Ug1.a, AbstractC3283Ir2.a, C3144Hh1.d, GZ.a, OD1.a {
    public static final String M1 = "ExoPlayerImplInternal";
    public static final int N1 = 0;
    public static final int O1 = 1;
    public static final int P1 = 2;
    public static final int Q1 = 3;
    public static final int R1 = 4;
    public static final int S1 = 5;
    public static final int T1 = 6;
    public static final int U1 = 7;
    public static final int V1 = 8;
    public static final int W1 = 9;
    public static final int X1 = 10;
    public static final int Y1 = 11;
    public static final int Z1 = 12;
    public static final int a2 = 13;
    public static final int b2 = 14;
    public static final int c2 = 15;
    public static final int d2 = 16;
    public static final int e2 = 17;
    public static final int f2 = 18;
    public static final int g2 = 19;
    public static final int h2 = 20;
    public static final int i2 = 21;
    public static final int j2 = 22;
    public static final int k2 = 23;
    public static final int l2 = 24;
    public static final int m2 = 25;
    public static final int n2 = 26;
    public static final int o2 = 10;
    public static final int p2 = 1000;
    public static final long q2 = 4000;
    public static final long r2 = 500000;
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public int E1;
    @InterfaceC11300zs1
    public h F1;
    public long G1;
    public int H1;
    public boolean I1;
    @InterfaceC11300zs1
    public C3824Og0 J1;
    public long K1;
    public long L1 = C10323vs.b;
    public final InterfaceC10469wR1[] X;
    public final Set<InterfaceC10469wR1> Y;
    public final AbstractC3283Ir2 Y0;
    public final InterfaceC10712xR1[] Z;
    public final C3381Jr2 Z0;
    public final L11 a1;
    public final InterfaceC3643Mk b1;
    public final InterfaceC5285bG0 c1;
    @InterfaceC11300zs1
    public final HandlerThread d1;
    public final Looper e1;
    public final AbstractC7373jp2.d f1;
    public final AbstractC7373jp2.b g1;
    public final long h1;
    public final boolean i1;
    public final GZ j1;
    public final ArrayList<d> k1;
    public final LD l1;
    public final f m1;
    public final C4905Zg1 n1;
    public final C3144Hh1 o1;
    public final K11 p1;
    public final long q1;
    public LZ1 r1;
    public BD1 s1;
    public e t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public int z1;

    /* renamed from: o.ei0$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC10469wR1.c {
        public a() {
        }

        @Override // o.InterfaceC10469wR1.c
        public void a() {
            C6118ei0.this.C1 = true;
        }

        @Override // o.InterfaceC10469wR1.c
        public void b() {
            C6118ei0.this.c1.m(2);
        }
    }

    /* renamed from: o.ei0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final List<C3144Hh1.c> a;
        public final U52 b;
        public final int c;
        public final long d;

        public /* synthetic */ b(List list, U52 u52, int i, long j, a aVar) {
            this(list, u52, i, j);
        }

        public b(List<C3144Hh1.c> list, U52 u52, int i, long j) {
            this.a = list;
            this.b = u52;
            this.c = i;
            this.d = j;
        }
    }

    /* renamed from: o.ei0$c */
    /* loaded from: classes2.dex */
    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final U52 d;

        public c(int i, int i2, int i3, U52 u52) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = u52;
        }
    }

    /* renamed from: o.ei0$d */
    /* loaded from: classes2.dex */
    public static final class d implements Comparable<d> {
        public final OD1 X;
        public int Y;
        @InterfaceC11300zs1
        public Object Y0;
        public long Z;

        public d(OD1 od1) {
            this.X = od1;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(d dVar) {
            boolean z;
            boolean z2;
            Object obj = this.Y0;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (dVar.Y0 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (obj == null) {
                    return 1;
                }
                return -1;
            } else if (obj == null) {
                return 0;
            } else {
                int i = this.Y - dVar.Y;
                if (i != 0) {
                    return i;
                }
                return TD2.u(this.Z, dVar.Z);
            }
        }

        public void g(int i, long j, Object obj) {
            this.Y = i;
            this.Z = j;
            this.Y0 = obj;
        }
    }

    /* renamed from: o.ei0$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public boolean a;
        public BD1 b;
        public int c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;

        public e(BD1 bd1) {
            this.b = bd1;
        }

        public void b(int i) {
            boolean z;
            boolean z2 = this.a;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.a = z2 | z;
            this.c += i;
        }

        public void c(int i) {
            this.a = true;
            this.f = true;
            this.g = i;
        }

        public void d(BD1 bd1) {
            boolean z;
            boolean z2 = this.a;
            if (this.b != bd1) {
                z = true;
            } else {
                z = false;
            }
            this.a = z2 | z;
            this.b = bd1;
        }

        public void e(int i) {
            boolean z = true;
            if (this.d && this.e != 5) {
                if (i != 5) {
                    z = false;
                }
                C9542sf.a(z);
                return;
            }
            this.a = true;
            this.d = true;
            this.e = i;
        }
    }

    /* renamed from: o.ei0$f */
    /* loaded from: classes2.dex */
    public interface f {
        void a(e eVar);
    }

    /* renamed from: o.ei0$g */
    /* loaded from: classes2.dex */
    public static final class g {
        public final InterfaceC7583kh1.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(InterfaceC7583kh1.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    /* renamed from: o.ei0$h */
    /* loaded from: classes2.dex */
    public static final class h {
        public final AbstractC7373jp2 a;
        public final int b;
        public final long c;

        public h(AbstractC7373jp2 abstractC7373jp2, int i, long j) {
            this.a = abstractC7373jp2;
            this.b = i;
            this.c = j;
        }
    }

    public C6118ei0(InterfaceC10469wR1[] interfaceC10469wR1Arr, AbstractC3283Ir2 abstractC3283Ir2, C3381Jr2 c3381Jr2, L11 l11, InterfaceC3643Mk interfaceC3643Mk, int i, boolean z, F8 f8, LZ1 lz1, K11 k11, long j, boolean z2, Looper looper, LD ld, f fVar, ND1 nd1, Looper looper2) {
        this.m1 = fVar;
        this.X = interfaceC10469wR1Arr;
        this.Y0 = abstractC3283Ir2;
        this.Z0 = c3381Jr2;
        this.a1 = l11;
        this.b1 = interfaceC3643Mk;
        this.z1 = i;
        this.A1 = z;
        this.r1 = lz1;
        this.p1 = k11;
        this.q1 = j;
        this.K1 = j;
        this.v1 = z2;
        this.l1 = ld;
        this.h1 = l11.b();
        this.i1 = l11.a();
        BD1 k = BD1.k(c3381Jr2);
        this.s1 = k;
        this.t1 = new e(k);
        this.Z = new InterfaceC10712xR1[interfaceC10469wR1Arr.length];
        InterfaceC10712xR1.f d3 = abstractC3283Ir2.d();
        for (int i3 = 0; i3 < interfaceC10469wR1Arr.length; i3++) {
            interfaceC10469wR1Arr[i3].o(i3, nd1);
            this.Z[i3] = interfaceC10469wR1Arr[i3].x();
            if (d3 != null) {
                this.Z[i3].s(d3);
            }
        }
        this.j1 = new GZ(this, ld);
        this.k1 = new ArrayList<>();
        this.Y = C10856y22.z();
        this.f1 = new AbstractC7373jp2.d();
        this.g1 = new AbstractC7373jp2.b();
        abstractC3283Ir2.e(this, interfaceC3643Mk);
        this.I1 = true;
        InterfaceC5285bG0 d4 = ld.d(looper, null);
        this.n1 = new C4905Zg1(f8, d4);
        this.o1 = new C3144Hh1(this, f8, d4, nd1);
        if (looper2 != null) {
            this.d1 = null;
            this.e1 = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.d1 = handlerThread;
            handlerThread.start();
            this.e1 = handlerThread.getLooper();
        }
        this.c1 = ld.d(this.e1, this);
    }

    public static g A0(AbstractC7373jp2 abstractC7373jp2, BD1 bd1, @InterfaceC11300zs1 h hVar, C4905Zg1 c4905Zg1, int i, boolean z, AbstractC7373jp2.d dVar, AbstractC7373jp2.b bVar) {
        long j;
        long j3;
        long j4;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        AbstractC7373jp2 abstractC7373jp22;
        AbstractC7373jp2.b bVar2;
        long j5;
        boolean z6;
        long j6;
        int i5;
        boolean z7;
        boolean z8;
        boolean z9;
        if (abstractC7373jp2.x()) {
            return new g(BD1.l(), 0L, C10323vs.b, false, true, false);
        }
        InterfaceC7583kh1.b bVar3 = bd1.b;
        Object obj = bVar3.a;
        boolean V = V(bd1, bVar);
        if (!bd1.b.c() && !V) {
            j = bd1.r;
        } else {
            j = bd1.c;
        }
        long j7 = j;
        boolean z10 = false;
        if (hVar != null) {
            Pair<Object, Long> B0 = B0(abstractC7373jp2, hVar, true, i, z, dVar, bVar);
            if (B0 == null) {
                i3 = abstractC7373jp2.f(z);
                j4 = j7;
                j3 = -9223372036854775807L;
                z7 = false;
                z8 = false;
                z9 = true;
            } else {
                if (hVar.c == C10323vs.b) {
                    i3 = abstractC7373jp2.m(B0.first, bVar).Z;
                    j4 = j7;
                    z7 = false;
                } else {
                    obj = B0.first;
                    j4 = ((Long) B0.second).longValue();
                    i3 = -1;
                    z7 = true;
                }
                j3 = -9223372036854775807L;
                if (bd1.e == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = false;
            }
            z4 = z7;
            z2 = z8;
            z3 = z9;
        } else {
            j3 = -9223372036854775807L;
            if (bd1.a.x()) {
                i3 = abstractC7373jp2.f(z);
            } else if (abstractC7373jp2.g(obj) == -1) {
                Object C0 = C0(dVar, bVar, i, z, obj, bd1.a, abstractC7373jp2);
                if (C0 == null) {
                    i4 = abstractC7373jp2.f(z);
                    z5 = true;
                } else {
                    i4 = abstractC7373jp2.m(C0, bVar).Z;
                    z5 = false;
                }
                i3 = i4;
                obj = obj;
                j4 = j7;
                z3 = z5;
                z2 = false;
                z4 = false;
            } else if (j7 == C10323vs.b) {
                i3 = abstractC7373jp2.m(obj, bVar).Z;
                obj = obj;
            } else if (V) {
                bd1.a.m(bVar3.a, bVar);
                if (bd1.a.u(bVar.Z, dVar).j1 == bd1.a.g(bVar3.a)) {
                    Pair<Object, Long> q = abstractC7373jp2.q(dVar, bVar, abstractC7373jp2.m(obj, bVar).Z, bVar.t() + j7);
                    obj = q.first;
                    j4 = ((Long) q.second).longValue();
                } else {
                    obj = obj;
                    j4 = j7;
                }
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = true;
            } else {
                obj = obj;
                j4 = j7;
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            j4 = j7;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (i3 != -1) {
            abstractC7373jp22 = abstractC7373jp2;
            Pair<Object, Long> q3 = abstractC7373jp22.q(dVar, bVar, i3, C10323vs.b);
            bVar2 = bVar;
            obj = q3.first;
            j4 = ((Long) q3.second).longValue();
            j5 = j3;
        } else {
            abstractC7373jp22 = abstractC7373jp2;
            bVar2 = bVar;
            j5 = j4;
        }
        InterfaceC7583kh1.b F = c4905Zg1.F(abstractC7373jp22, obj, j4);
        int i6 = F.e;
        if (i6 != -1 && ((i5 = bVar3.e) == -1 || i6 < i5)) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (bVar3.a.equals(obj) && !bVar3.c() && !F.c() && z6) {
            z10 = true;
        }
        InterfaceC7583kh1.b bVar4 = F;
        boolean R = R(V, bVar3, j7, bVar4, abstractC7373jp22.m(obj, bVar2), j5);
        if (z10 || R) {
            bVar4 = bVar3;
        }
        if (bVar4.c()) {
            if (bVar4.equals(bVar3)) {
                j4 = bd1.r;
            } else {
                abstractC7373jp22.m(bVar4.a, bVar2);
                if (bVar4.c == bVar2.q(bVar4.b)) {
                    j6 = bVar2.k();
                } else {
                    j6 = 0;
                }
                j4 = j6;
            }
        }
        return new g(bVar4, j4, j5, z2, z3, z4);
    }

    @InterfaceC11300zs1
    public static Pair<Object, Long> B0(AbstractC7373jp2 abstractC7373jp2, h hVar, boolean z, int i, boolean z2, AbstractC7373jp2.d dVar, AbstractC7373jp2.b bVar) {
        Pair<Object, Long> q;
        AbstractC7373jp2 abstractC7373jp22;
        Object C0;
        AbstractC7373jp2 abstractC7373jp23 = hVar.a;
        if (abstractC7373jp2.x()) {
            return null;
        }
        if (abstractC7373jp23.x()) {
            abstractC7373jp23 = abstractC7373jp2;
        }
        try {
            q = abstractC7373jp23.q(dVar, bVar, hVar.b, hVar.c);
            abstractC7373jp22 = abstractC7373jp23;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC7373jp2.equals(abstractC7373jp22)) {
            return q;
        }
        if (abstractC7373jp2.g(q.first) != -1) {
            if (abstractC7373jp22.m(q.first, bVar).a1 && abstractC7373jp22.u(bVar.Z, dVar).j1 == abstractC7373jp22.g(q.first)) {
                return abstractC7373jp2.q(dVar, bVar, abstractC7373jp2.m(q.first, bVar).Z, hVar.c);
            }
            return q;
        }
        if (z && (C0 = C0(dVar, bVar, i, z2, q.first, abstractC7373jp22, abstractC7373jp2)) != null) {
            return abstractC7373jp2.q(dVar, bVar, abstractC7373jp2.m(C0, bVar).Z, C10323vs.b);
        }
        return null;
    }

    @InterfaceC11300zs1
    public static Object C0(AbstractC7373jp2.d dVar, AbstractC7373jp2.b bVar, int i, boolean z, Object obj, AbstractC7373jp2 abstractC7373jp2, AbstractC7373jp2 abstractC7373jp22) {
        int g3 = abstractC7373jp2.g(obj);
        int n = abstractC7373jp2.n();
        int i3 = 0;
        int i4 = g3;
        int i5 = -1;
        while (i3 < n && i5 == -1) {
            AbstractC7373jp2.d dVar2 = dVar;
            AbstractC7373jp2.b bVar2 = bVar;
            int i6 = i;
            boolean z2 = z;
            AbstractC7373jp2 abstractC7373jp23 = abstractC7373jp2;
            i4 = abstractC7373jp23.i(i4, bVar2, dVar2, i6, z2);
            if (i4 == -1) {
                break;
            }
            i5 = abstractC7373jp22.g(abstractC7373jp23.t(i4));
            i3++;
            abstractC7373jp2 = abstractC7373jp23;
            bVar = bVar2;
            dVar = dVar2;
            i = i6;
            z = z2;
        }
        if (i5 == -1) {
            return null;
        }
        return abstractC7373jp22.t(i5);
    }

    public static boolean R(boolean z, InterfaceC7583kh1.b bVar, long j, InterfaceC7583kh1.b bVar2, AbstractC7373jp2.b bVar3, long j3) {
        if (!z && j == j3 && bVar.a.equals(bVar2.a)) {
            if (bVar.c() && bVar3.x(bVar.b)) {
                if (bVar3.l(bVar.b, bVar.c) == 4 || bVar3.l(bVar.b, bVar.c) == 2) {
                    return false;
                }
                return true;
            } else if (bVar2.c() && bVar3.x(bVar2.b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean T(InterfaceC10469wR1 interfaceC10469wR1) {
        if (interfaceC10469wR1.getState() != 0) {
            return true;
        }
        return false;
    }

    public static boolean V(BD1 bd1, AbstractC7373jp2.b bVar) {
        InterfaceC7583kh1.b bVar2 = bd1.b;
        AbstractC7373jp2 abstractC7373jp2 = bd1.a;
        if (!abstractC7373jp2.x() && !abstractC7373jp2.m(bVar2.a, bVar).a1) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void f(C6118ei0 c6118ei0, OD1 od1) {
        c6118ei0.getClass();
        try {
            c6118ei0.o(od1);
        } catch (C3824Og0 e3) {
            I31.e(M1, "Unexpected error delivering message on external thread.", e3);
            throw new RuntimeException(e3);
        }
    }

    private void n0() {
        u0(true, false, true, false);
        o0();
        this.a1.h();
        i1(1);
        HandlerThread handlerThread = this.d1;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.u1 = true;
            notifyAll();
        }
    }

    public static void x0(AbstractC7373jp2 abstractC7373jp2, d dVar, AbstractC7373jp2.d dVar2, AbstractC7373jp2.b bVar) {
        long j;
        int i = abstractC7373jp2.u(abstractC7373jp2.m(dVar.Y0, bVar).Z, dVar2).k1;
        Object obj = abstractC7373jp2.l(i, bVar, true).Y;
        long j3 = bVar.Y0;
        if (j3 != C10323vs.b) {
            j = j3 - 1;
        } else {
            j = Long.MAX_VALUE;
        }
        dVar.g(i, j, obj);
    }

    public static boolean y0(d dVar, AbstractC7373jp2 abstractC7373jp2, AbstractC7373jp2 abstractC7373jp22, int i, boolean z, AbstractC7373jp2.d dVar2, AbstractC7373jp2.b bVar) {
        long j1;
        Object obj = dVar.Y0;
        if (obj == null) {
            if (dVar.X.h() == Long.MIN_VALUE) {
                j1 = C10323vs.b;
            } else {
                j1 = TD2.j1(dVar.X.h());
            }
            Pair<Object, Long> B0 = B0(abstractC7373jp2, new h(dVar.X.j(), dVar.X.f(), j1), false, i, z, dVar2, bVar);
            if (B0 == null) {
                return false;
            }
            dVar.g(abstractC7373jp2.g(B0.first), ((Long) B0.second).longValue(), B0.first);
            if (dVar.X.h() == Long.MIN_VALUE) {
                x0(abstractC7373jp2, dVar, dVar2, bVar);
            }
            return true;
        }
        int g3 = abstractC7373jp2.g(obj);
        if (g3 == -1) {
            return false;
        }
        if (dVar.X.h() == Long.MIN_VALUE) {
            x0(abstractC7373jp2, dVar, dVar2, bVar);
            return true;
        }
        dVar.Y = g3;
        abstractC7373jp22.m(dVar.Y0, bVar);
        if (bVar.a1 && abstractC7373jp22.u(bVar.Z, dVar2).j1 == abstractC7373jp22.g(dVar.Y0)) {
            Pair<Object, Long> q = abstractC7373jp2.q(dVar2, bVar, abstractC7373jp2.m(dVar.Y0, bVar).Z, dVar.Z + bVar.t());
            dVar.g(abstractC7373jp2.g(q.first), ((Long) q.second).longValue(), q.first);
        }
        return true;
    }

    public static C10833xx0[] z(InterfaceC6859hi0 interfaceC6859hi0) {
        int i;
        if (interfaceC6859hi0 != null) {
            i = interfaceC6859hi0.length();
        } else {
            i = 0;
        }
        C10833xx0[] c10833xx0Arr = new C10833xx0[i];
        for (int i3 = 0; i3 < i; i3++) {
            c10833xx0Arr[i3] = interfaceC6859hi0.a(i3);
        }
        return c10833xx0Arr;
    }

    @Override // o.GZ.a
    public void A(DD1 dd1) {
        this.c1.f(16, dd1).a();
    }

    public final long B(AbstractC7373jp2 abstractC7373jp2, Object obj, long j) {
        abstractC7373jp2.u(abstractC7373jp2.m(obj, this.g1).Z, this.f1);
        AbstractC7373jp2.d dVar = this.f1;
        if (dVar.a1 != C10323vs.b && dVar.k()) {
            AbstractC7373jp2.d dVar2 = this.f1;
            if (dVar2.d1) {
                return TD2.j1(dVar2.c() - this.f1.a1) - (j + this.g1.t());
            }
        }
        return C10323vs.b;
    }

    public final long C() {
        C4507Vg1 s = this.n1.s();
        if (s == null) {
            return 0L;
        }
        long l = s.l();
        if (!s.d) {
            return l;
        }
        int i = 0;
        while (true) {
            InterfaceC10469wR1[] interfaceC10469wR1Arr = this.X;
            if (i < interfaceC10469wR1Arr.length) {
                if (T(interfaceC10469wR1Arr[i]) && this.X[i].e() == s.c[i]) {
                    long E = this.X[i].E();
                    if (E == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    l = Math.max(E, l);
                }
                i++;
            } else {
                return l;
            }
        }
    }

    public final Pair<InterfaceC7583kh1.b, Long> D(AbstractC7373jp2 abstractC7373jp2) {
        long j = 0;
        if (abstractC7373jp2.x()) {
            return Pair.create(BD1.l(), 0L);
        }
        Pair<Object, Long> q = abstractC7373jp2.q(this.f1, this.g1, abstractC7373jp2.f(this.A1), C10323vs.b);
        InterfaceC7583kh1.b F = this.n1.F(abstractC7373jp2, q.first, 0L);
        long longValue = ((Long) q.second).longValue();
        if (F.c()) {
            abstractC7373jp2.m(F.a, this.g1);
            if (F.c == this.g1.q(F.b)) {
                j = this.g1.k();
            }
            longValue = j;
        }
        return Pair.create(F, Long.valueOf(longValue));
    }

    public final void D0(long j, long j3) {
        this.c1.n(2, j + j3);
    }

    public Looper E() {
        return this.e1;
    }

    public void E0(AbstractC7373jp2 abstractC7373jp2, int i, long j) {
        this.c1.f(3, new h(abstractC7373jp2, i, j)).a();
    }

    public final long F() {
        return G(this.s1.p);
    }

    public final void F0(boolean z) throws C3824Og0 {
        InterfaceC7583kh1.b bVar = this.n1.r().f.a;
        long I0 = I0(bVar, this.s1.r, true, false);
        if (I0 != this.s1.r) {
            BD1 bd1 = this.s1;
            this.s1 = O(bVar, I0, bd1.c, bd1.d, z, 5);
        }
    }

    public final long G(long j) {
        C4507Vg1 l = this.n1.l();
        if (l == null) {
            return 0L;
        }
        return Math.max(0L, j - l.y(this.G1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:20|(7:(12:52|53|(1:77)(1:59)|60|61|62|63|(1:73)|70|71|11|12)(1:22)|35|36|37|10|11|12)|23|24|(1:26)(1:48)|27|28|(1:30)|31|32|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014b, code lost:
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014d, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(h hVar) throws C3824Og0 {
        long longValue;
        long j;
        InterfaceC7583kh1.b F;
        long j3;
        boolean z;
        long j4;
        boolean z2;
        InterfaceC7583kh1.b bVar;
        long j5;
        InterfaceC7583kh1.b bVar2;
        long j6;
        BD1 bd1;
        int i;
        int i3;
        long j7;
        InterfaceC7583kh1.b bVar3;
        long j8;
        boolean z3;
        long H0;
        BD1 bd12;
        AbstractC7373jp2 abstractC7373jp2;
        InterfaceC7583kh1.b bVar4;
        long j9;
        C6118ei0 c6118ei0 = this;
        c6118ei0.t1.b(1);
        Pair<Object, Long> B0 = B0(c6118ei0.s1.a, hVar, true, c6118ei0.z1, c6118ei0.A1, c6118ei0.f1, c6118ei0.g1);
        boolean z4 = false;
        try {
            if (B0 == null) {
                Pair<InterfaceC7583kh1.b, Long> D = c6118ei0.D(c6118ei0.s1.a);
                F = (InterfaceC7583kh1.b) D.first;
                longValue = ((Long) D.second).longValue();
                z = !c6118ei0.s1.a.x();
                j4 = -9223372036854775807L;
            } else {
                Object obj = B0.first;
                longValue = ((Long) B0.second).longValue();
                if (hVar.c == C10323vs.b) {
                    j = -9223372036854775807L;
                } else {
                    j = longValue;
                }
                F = c6118ei0.n1.F(c6118ei0.s1.a, obj, longValue);
                if (F.c()) {
                    c6118ei0.s1.a.m(F.a, c6118ei0.g1);
                    if (c6118ei0.g1.q(F.b) == F.c) {
                        longValue = c6118ei0.g1.k();
                    } else {
                        longValue = 0;
                    }
                    z = true;
                    j4 = j;
                } else {
                    j3 = 0;
                    if (hVar.c == C10323vs.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j4 = j;
                    if (!c6118ei0.s1.a.x()) {
                        c6118ei0.F1 = hVar;
                    } else if (B0 == null) {
                        if (c6118ei0.s1.e != 1) {
                            c6118ei0.i1(4);
                        }
                        c6118ei0.u0(false, true, false, true);
                    } else {
                        try {
                            if (F.equals(c6118ei0.s1.b)) {
                                try {
                                    C4507Vg1 r = c6118ei0.n1.r();
                                    if (r != null && r.d && longValue != j3) {
                                        j6 = r.a.e(longValue, c6118ei0.r1);
                                    } else {
                                        j6 = longValue;
                                    }
                                    bVar2 = F;
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = z;
                                    bVar2 = F;
                                }
                                try {
                                    if (TD2.b2(j6) != TD2.b2(c6118ei0.s1.r) || ((i = (bd1 = c6118ei0.s1).e) != 2 && i != 3)) {
                                        z2 = z;
                                    }
                                    long j10 = bd1.r;
                                    i3 = 2;
                                    z2 = z;
                                    j7 = j10;
                                    bVar3 = bVar2;
                                    j8 = j10;
                                    c6118ei0.s1 = c6118ei0.O(bVar3, j8, j4, j7, z2, i3);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = z;
                                    bVar = bVar2;
                                    j5 = longValue;
                                    c6118ei0.s1 = c6118ei0.O(bVar, j5, j4, j5, z2, 2);
                                    throw th;
                                }
                            }
                            z2 = z;
                            bVar2 = F;
                            j6 = longValue;
                            c6118ei0.w1(abstractC7373jp2, bVar4, abstractC7373jp2, bd12.b, j9, true);
                            bVar3 = bVar4;
                            j4 = j9;
                            j8 = H0;
                            i3 = 2;
                            j7 = j8;
                            c6118ei0 = this;
                            c6118ei0.s1 = c6118ei0.O(bVar3, j8, j4, j7, z2, i3);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            bVar = bVar4;
                            j4 = j9;
                            j5 = H0;
                            c6118ei0.s1 = c6118ei0.O(bVar, j5, j4, j5, z2, 2);
                            throw th;
                        }
                        if (c6118ei0.s1.e == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        H0 = c6118ei0.H0(bVar2, j6, z3);
                        if (longValue != H0) {
                            z4 = true;
                        }
                        z2 |= z4;
                        bd12 = c6118ei0.s1;
                        abstractC7373jp2 = bd12.a;
                        bVar4 = bVar2;
                        j9 = j4;
                    }
                    z2 = z;
                    bVar3 = F;
                    j8 = longValue;
                    i3 = 2;
                    j7 = j8;
                    c6118ei0 = this;
                    c6118ei0.s1 = c6118ei0.O(bVar3, j8, j4, j7, z2, i3);
                    return;
                }
            }
            if (!c6118ei0.s1.a.x()) {
            }
            z2 = z;
            bVar3 = F;
            j8 = longValue;
            i3 = 2;
            j7 = j8;
            c6118ei0 = this;
            c6118ei0.s1 = c6118ei0.O(bVar3, j8, j4, j7, z2, i3);
            return;
        } catch (Throwable th4) {
            th = th4;
            z2 = z;
            bVar = F;
        }
        j3 = 0;
    }

    public final void H(InterfaceC4410Ug1 interfaceC4410Ug1) {
        if (!this.n1.y(interfaceC4410Ug1)) {
            return;
        }
        this.n1.B(this.G1);
        W();
    }

    public final long H0(InterfaceC7583kh1.b bVar, long j, boolean z) throws C3824Og0 {
        boolean z2;
        if (this.n1.r() != this.n1.s()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return I0(bVar, j, z2, z);
    }

    public final void I(IOException iOException, int i) {
        C3824Og0 l = C3824Og0.l(iOException, i);
        C4507Vg1 r = this.n1.r();
        if (r != null) {
            l = l.i(r.f.a);
        }
        I31.e(M1, "Playback error", l);
        q1(false, false);
        this.s1 = this.s1.f(l);
    }

    public final long I0(InterfaceC7583kh1.b bVar, long j, boolean z, boolean z2) throws C3824Og0 {
        r1();
        this.x1 = false;
        if (z2 || this.s1.e == 3) {
            i1(2);
        }
        C4507Vg1 r = this.n1.r();
        C4507Vg1 c4507Vg1 = r;
        while (c4507Vg1 != null && !bVar.equals(c4507Vg1.f.a)) {
            c4507Vg1 = c4507Vg1.j();
        }
        if (z || r != c4507Vg1 || (c4507Vg1 != null && c4507Vg1.z(j) < 0)) {
            for (InterfaceC10469wR1 interfaceC10469wR1 : this.X) {
                p(interfaceC10469wR1);
            }
            if (c4507Vg1 != null) {
                while (this.n1.r() != c4507Vg1) {
                    this.n1.b();
                }
                this.n1.C(c4507Vg1);
                c4507Vg1.x(1000000000000L);
                s();
            }
        }
        if (c4507Vg1 != null) {
            this.n1.C(c4507Vg1);
            if (!c4507Vg1.d) {
                c4507Vg1.f = c4507Vg1.f.b(j);
            } else if (c4507Vg1.e) {
                j = c4507Vg1.a.i(j);
                c4507Vg1.a.r(j - this.h1, this.i1);
            }
            w0(j);
            W();
        } else {
            this.n1.f();
            w0(j);
        }
        J(false);
        this.c1.m(2);
        return j;
    }

    public final void J(boolean z) {
        InterfaceC7583kh1.b bVar;
        long i;
        C4507Vg1 l = this.n1.l();
        if (l == null) {
            bVar = this.s1.b;
        } else {
            bVar = l.f.a;
        }
        boolean equals = this.s1.k.equals(bVar);
        if (!equals) {
            this.s1 = this.s1.c(bVar);
        }
        BD1 bd1 = this.s1;
        if (l == null) {
            i = bd1.r;
        } else {
            i = l.i();
        }
        bd1.p = i;
        this.s1.q = F();
        if ((!equals || z) && l != null && l.d) {
            t1(l.f.a, l.n(), l.o());
        }
    }

    public final void J0(OD1 od1) throws C3824Og0 {
        if (od1.h() == C10323vs.b) {
            K0(od1);
        } else if (this.s1.a.x()) {
            this.k1.add(new d(od1));
        } else {
            d dVar = new d(od1);
            AbstractC7373jp2 abstractC7373jp2 = this.s1.a;
            if (y0(dVar, abstractC7373jp2, abstractC7373jp2, this.z1, this.A1, this.f1, this.g1)) {
                this.k1.add(dVar);
                Collections.sort(this.k1);
                return;
            }
            od1.m(false);
        }
    }

    public final void K(AbstractC7373jp2 abstractC7373jp2, boolean z) throws C3824Og0 {
        boolean z2;
        int i;
        InterfaceC7583kh1.b bVar;
        long j;
        AbstractC7373jp2 abstractC7373jp22;
        long j3;
        long j4;
        boolean z3;
        int i3;
        AbstractC7373jp2 abstractC7373jp23;
        long j5;
        boolean z4;
        long j6;
        int i4;
        AbstractC7373jp2 abstractC7373jp24;
        g A0 = A0(abstractC7373jp2, this.s1, this.F1, this.n1, this.z1, this.A1, this.f1, this.g1);
        InterfaceC7583kh1.b bVar2 = A0.a;
        long j7 = A0.c;
        boolean z5 = A0.d;
        long j8 = A0.b;
        int i5 = 1;
        if (this.s1.b.equals(bVar2) && j8 == this.s1.r) {
            z2 = false;
        } else {
            z2 = true;
        }
        AbstractC7373jp2 abstractC7373jp25 = null;
        try {
            if (A0.e) {
                if (this.s1.e != 1) {
                    i1(4);
                }
                u0(false, false, false, true);
            }
            try {
                if (!z2) {
                    try {
                        try {
                            i = 4;
                            try {
                                i5 = -1;
                            } catch (Throwable th) {
                                th = th;
                                abstractC7373jp25 = abstractC7373jp2;
                                i5 = -1;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            abstractC7373jp25 = abstractC7373jp2;
                            i5 = -1;
                            i = 4;
                        }
                        try {
                            abstractC7373jp23 = abstractC7373jp2;
                            if (!this.n1.J(abstractC7373jp2, this.G1, C())) {
                                F0(false);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC7373jp25 = abstractC7373jp2;
                            bVar = bVar2;
                            j = j7;
                            abstractC7373jp22 = abstractC7373jp25;
                            BD1 bd1 = this.s1;
                            AbstractC7373jp2 abstractC7373jp26 = bd1.a;
                            InterfaceC7583kh1.b bVar3 = bd1.b;
                            if (A0.f) {
                                j3 = j8;
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            w1(abstractC7373jp22, bVar, abstractC7373jp26, bVar3, j3, false);
                            if (z2 || j != this.s1.c) {
                                BD1 bd12 = this.s1;
                                Object obj = bd12.b.a;
                                AbstractC7373jp2 abstractC7373jp27 = bd12.a;
                                if (z2 && z && !abstractC7373jp27.x() && !abstractC7373jp27.m(obj, this.g1).a1) {
                                    j4 = j;
                                    z3 = true;
                                } else {
                                    j4 = j;
                                    z3 = false;
                                }
                                long j9 = this.s1.d;
                                if (abstractC7373jp22.g(obj) == i5) {
                                    i3 = i;
                                } else {
                                    i3 = 3;
                                }
                                this.s1 = O(bVar, j8, j4, j9, z3, i3);
                            }
                            v0();
                            z0(abstractC7373jp22, this.s1.a);
                            this.s1 = this.s1.j(abstractC7373jp22);
                            if (!abstractC7373jp22.x()) {
                                this.F1 = null;
                            }
                            J(false);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        abstractC7373jp25 = abstractC7373jp2;
                        i5 = -1;
                        i = 4;
                    }
                } else {
                    abstractC7373jp23 = abstractC7373jp2;
                    i5 = -1;
                    i = 4;
                    if (!abstractC7373jp23.x()) {
                        for (C4507Vg1 r = this.n1.r(); r != null; r = r.j()) {
                            if (r.f.a.equals(bVar2)) {
                                r.f = this.n1.t(abstractC7373jp23, r.f);
                                r.A();
                            }
                        }
                        j8 = H0(bVar2, j8, z5);
                    }
                }
                BD1 bd13 = this.s1;
                AbstractC7373jp2 abstractC7373jp28 = bd13.a;
                InterfaceC7583kh1.b bVar4 = bd13.b;
                if (A0.f) {
                    j5 = j8;
                } else {
                    j5 = -9223372036854775807L;
                }
                w1(abstractC7373jp23, bVar2, abstractC7373jp28, bVar4, j5, false);
                if (!z2 && j7 == this.s1.c) {
                    abstractC7373jp24 = abstractC7373jp23;
                } else {
                    BD1 bd14 = this.s1;
                    Object obj2 = bd14.b.a;
                    AbstractC7373jp2 abstractC7373jp29 = bd14.a;
                    if (z2 && z && !abstractC7373jp29.x() && !abstractC7373jp29.m(obj2, this.g1).a1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j10 = this.s1.d;
                    if (abstractC7373jp23.g(obj2) == i5) {
                        j6 = j7;
                        i4 = i;
                    } else {
                        j6 = j7;
                        i4 = 3;
                    }
                    abstractC7373jp24 = abstractC7373jp23;
                    this.s1 = O(bVar2, j8, j6, j10, z4, i4);
                }
                v0();
                z0(abstractC7373jp24, this.s1.a);
                this.s1 = this.s1.j(abstractC7373jp24);
                if (!abstractC7373jp24.x()) {
                    this.F1 = null;
                }
                J(false);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            i5 = -1;
            i = 4;
            bVar = bVar2;
            j = j7;
            abstractC7373jp22 = abstractC7373jp2;
        }
    }

    public final void K0(OD1 od1) throws C3824Og0 {
        if (od1.e() == this.e1) {
            o(od1);
            int i = this.s1.e;
            if (i != 3 && i != 2) {
                return;
            }
            this.c1.m(2);
            return;
        }
        this.c1.f(15, od1).a();
    }

    public final void L(InterfaceC4410Ug1 interfaceC4410Ug1) throws C3824Og0 {
        if (!this.n1.y(interfaceC4410Ug1)) {
            return;
        }
        C4507Vg1 l = this.n1.l();
        l.p(this.j1.h().X, this.s1.a);
        t1(l.f.a, l.n(), l.o());
        if (l == this.n1.r()) {
            w0(l.f.b);
            s();
            BD1 bd1 = this.s1;
            InterfaceC7583kh1.b bVar = bd1.b;
            long j = l.f.b;
            this.s1 = O(bVar, j, bd1.c, j, false, 5);
        }
        W();
    }

    public final void L0(final OD1 od1) {
        Looper e3 = od1.e();
        if (!e3.getThread().isAlive()) {
            I31.n("TAG", "Trying to send message on a dead thread.");
            od1.m(false);
            return;
        }
        this.l1.d(e3, null).k(new Runnable() { // from class: o.di0
            @Override // java.lang.Runnable
            public final void run() {
                C6118ei0.f(C6118ei0.this, od1);
            }
        });
    }

    public final void M(DD1 dd1, float f3, boolean z, boolean z2) throws C3824Og0 {
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        if (z) {
            if (z2) {
                this.t1.b(1);
            }
            this.s1 = this.s1.g(dd1);
        }
        x1(dd1.X);
        for (InterfaceC10469wR1 interfaceC10469wR1 : this.X) {
            if (interfaceC10469wR1 != null) {
                interfaceC10469wR1.A(f3, dd1.X);
            }
        }
    }

    public final void M0(long j) {
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        for (InterfaceC10469wR1 interfaceC10469wR1 : this.X) {
            if (interfaceC10469wR1.e() != null) {
                N0(interfaceC10469wR1, j);
            }
        }
    }

    public final void N(DD1 dd1, boolean z) throws C3824Og0 {
        M(dd1, dd1.X, true, z);
    }

    public final void N0(InterfaceC10469wR1 interfaceC10469wR1, long j) {
        interfaceC10469wR1.m();
        if (interfaceC10469wR1 instanceof C4241Sm2) {
            ((C4241Sm2) interfaceC10469wR1).n0(j);
        }
    }

    @OB
    public final BD1 O(InterfaceC7583kh1.b bVar, long j, long j3, long j4, boolean z, int i) {
        boolean z2;
        List list;
        C10079ur2 c10079ur2;
        C3381Jr2 c3381Jr2;
        C10079ur2 n;
        C3381Jr2 o3;
        if (!this.I1 && j == this.s1.r && bVar.equals(this.s1.b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.I1 = z2;
        v0();
        BD1 bd1 = this.s1;
        C10079ur2 c10079ur22 = bd1.h;
        C3381Jr2 c3381Jr22 = bd1.i;
        List list2 = bd1.j;
        if (this.o1.u()) {
            C4507Vg1 r = this.n1.r();
            if (r == null) {
                n = C10079ur2.Z0;
            } else {
                n = r.n();
            }
            if (r == null) {
                o3 = this.Z0;
            } else {
                o3 = r.o();
            }
            List x = x(o3.c);
            if (r != null) {
                C4701Xg1 c4701Xg1 = r.f;
                if (c4701Xg1.c != j3) {
                    r.f = c4701Xg1.a(j3);
                }
            }
            c10079ur2 = n;
            c3381Jr2 = o3;
            list = x;
        } else {
            if (!bVar.equals(this.s1.b)) {
                c10079ur22 = C10079ur2.Z0;
                c3381Jr22 = this.Z0;
                list2 = AbstractC5317bO0.L();
            }
            list = list2;
            c10079ur2 = c10079ur22;
            c3381Jr2 = c3381Jr22;
        }
        if (z) {
            this.t1.e(i);
        }
        return this.s1.d(bVar, j, j3, j4, F(), c10079ur2, c3381Jr2, list);
    }

    public synchronized boolean O0(boolean z) {
        if (!this.u1 && this.e1.getThread().isAlive()) {
            if (z) {
                this.c1.i(13, 1, 0).a();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.c1.e(13, 0, 0, atomicBoolean).a();
            y1(new InterfaceC8331nh2() { // from class: o.bi0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.K1);
            return atomicBoolean.get();
        }
        return true;
    }

    public final boolean P(InterfaceC10469wR1 interfaceC10469wR1, C4507Vg1 c4507Vg1) {
        C4507Vg1 j = c4507Vg1.j();
        if (c4507Vg1.f.f && j.d) {
            if ((interfaceC10469wR1 instanceof C4241Sm2) || (interfaceC10469wR1 instanceof C7106ij1) || interfaceC10469wR1.E() >= j.m()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void P0(boolean z, @InterfaceC11300zs1 AtomicBoolean atomicBoolean) {
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        if (this.B1 != z) {
            this.B1 = z;
            if (!z) {
                for (InterfaceC10469wR1 interfaceC10469wR1 : this.X) {
                    if (!T(interfaceC10469wR1) && this.Y.remove(interfaceC10469wR1)) {
                        interfaceC10469wR1.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final boolean Q() {
        C4507Vg1 s = this.n1.s();
        if (!s.d) {
            return false;
        }
        int i = 0;
        while (true) {
            InterfaceC10469wR1[] interfaceC10469wR1Arr = this.X;
            if (i < interfaceC10469wR1Arr.length) {
                InterfaceC10469wR1 interfaceC10469wR1 = interfaceC10469wR1Arr[i];
                IX1 ix1 = s.c[i];
                if (interfaceC10469wR1.e() != ix1 || (ix1 != null && !interfaceC10469wR1.k() && !P(interfaceC10469wR1, s))) {
                    break;
                }
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    public final void Q0(DD1 dd1) {
        this.c1.o(16);
        this.j1.f(dd1);
    }

    public final void R0(b bVar) throws C3824Og0 {
        this.t1.b(1);
        if (bVar.c != -1) {
            this.F1 = new h(new QD1(bVar.a, bVar.b), bVar.c, bVar.d);
        }
        K(this.o1.E(bVar.a, bVar.b), false);
    }

    public final boolean S() {
        C4507Vg1 l = this.n1.l();
        if (l == null || l.k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public void S0(List<C3144Hh1.c> list, int i, long j, U52 u52) {
        this.c1.f(17, new b(list, u52, i, j, null)).a();
    }

    public final void T0(boolean z) {
        if (z != this.D1) {
            this.D1 = z;
            if (!z && this.s1.f415o) {
                this.c1.m(2);
            }
        }
    }

    public final boolean U() {
        C4507Vg1 r = this.n1.r();
        long j = r.f.e;
        if (r.d) {
            if (j == C10323vs.b || this.s1.r < j || !l1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void U0(boolean z) {
        this.c1.i(23, z ? 1 : 0, 0).a();
    }

    public final void V0(boolean z) throws C3824Og0 {
        this.v1 = z;
        v0();
        if (this.w1 && this.n1.s() != this.n1.r()) {
            F0(true);
            J(false);
        }
    }

    public final void W() {
        boolean k1 = k1();
        this.y1 = k1;
        if (k1) {
            this.n1.l().d(this.G1);
        }
        s1();
    }

    public void W0(boolean z, int i) {
        this.c1.i(1, z ? 1 : 0, i).a();
    }

    public final void X() {
        this.t1.d(this.s1);
        if (this.t1.a) {
            this.m1.a(this.t1);
            this.t1 = new e(this.s1);
        }
    }

    public final void X0(boolean z, int i, boolean z2, int i3) throws C3824Og0 {
        this.t1.b(z2 ? 1 : 0);
        this.t1.c(i3);
        this.s1 = this.s1.e(z, i);
        this.x1 = false;
        h0(z);
        if (!l1()) {
            r1();
            v1();
            return;
        }
        int i4 = this.s1.e;
        if (i4 == 3) {
            o1();
            this.c1.m(2);
        } else if (i4 == 2) {
            this.c1.m(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[LOOP:1: B:29:0x0079->B:39:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0078 -> B:29:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(long j, long j3) throws C3824Og0 {
        d dVar;
        d dVar2;
        long j4;
        int i;
        d dVar3;
        if (!this.k1.isEmpty() && !this.s1.b.c()) {
            if (this.I1) {
                j--;
                this.I1 = false;
            }
            BD1 bd1 = this.s1;
            int g3 = bd1.a.g(bd1.b.a);
            int min = Math.min(this.H1, this.k1.size());
            if (min > 0) {
                dVar = this.k1.get(min - 1);
            } else {
                dVar = null;
            }
            while (dVar != null) {
                int i3 = dVar.Y;
                if (i3 <= g3 && (i3 != g3 || dVar.Z <= j)) {
                    break;
                }
                int i4 = min - 1;
                if (i4 > 0) {
                    dVar3 = this.k1.get(min - 2);
                } else {
                    dVar3 = null;
                }
                dVar = dVar3;
                min = i4;
            }
            if (min < this.k1.size()) {
                dVar2 = this.k1.get(min);
                while (dVar2 != null && dVar2.Y0 != null) {
                    i = dVar2.Y;
                    if (i < g3 && (i != g3 || dVar2.Z > j)) {
                        break;
                    }
                    min++;
                    if (min >= this.k1.size()) {
                        dVar2 = this.k1.get(min);
                    }
                }
                while (dVar2 != null && dVar2.Y0 != null && dVar2.Y == g3) {
                    j4 = dVar2.Z;
                    if (j4 > j || j4 > j3) {
                        break;
                        break;
                    }
                    try {
                        K0(dVar2.X);
                        if (dVar2.X.d() && !dVar2.X.l()) {
                            min++;
                        } else {
                            this.k1.remove(min);
                        }
                        if (min >= this.k1.size()) {
                            dVar2 = this.k1.get(min);
                        } else {
                            dVar2 = null;
                        }
                    } catch (Throwable th) {
                        if (dVar2.X.d() || dVar2.X.l()) {
                            this.k1.remove(min);
                        }
                        throw th;
                    }
                }
                this.H1 = min;
            }
            dVar2 = null;
            while (dVar2 != null) {
                i = dVar2.Y;
                if (i < g3) {
                }
                min++;
                if (min >= this.k1.size()) {
                }
            }
            while (dVar2 != null) {
                j4 = dVar2.Z;
                if (j4 > j) {
                    break;
                }
                K0(dVar2.X);
                if (dVar2.X.d()) {
                }
                this.k1.remove(min);
                if (min >= this.k1.size()) {
                }
            }
            this.H1 = min;
        }
    }

    public void Y0(DD1 dd1) {
        this.c1.f(4, dd1).a();
    }

    public final void Z() throws C3824Og0 {
        C4701Xg1 q;
        this.n1.B(this.G1);
        if (this.n1.H() && (q = this.n1.q(this.G1, this.s1)) != null) {
            C4507Vg1 g3 = this.n1.g(this.Z, this.Y0, this.a1.e(), this.o1, q, this.Z0);
            g3.a.o(this, q.b);
            if (this.n1.r() == g3) {
                w0(q.b);
            }
            J(false);
        }
        if (this.y1) {
            this.y1 = S();
            s1();
            return;
        }
        W();
    }

    public final void Z0(DD1 dd1) throws C3824Og0 {
        Q0(dd1);
        N(this.j1.h(), true);
    }

    @Override // o.AbstractC3283Ir2.a
    public void a(InterfaceC10469wR1 interfaceC10469wR1) {
        this.c1.m(26);
    }

    public final void a0() throws C3824Og0 {
        boolean z;
        boolean z2 = false;
        while (j1()) {
            if (z2) {
                X();
            }
            C4507Vg1 c4507Vg1 = (C4507Vg1) C9542sf.g(this.n1.b());
            if (this.s1.b.a.equals(c4507Vg1.f.a.a)) {
                InterfaceC7583kh1.b bVar = this.s1.b;
                if (bVar.b == -1) {
                    InterfaceC7583kh1.b bVar2 = c4507Vg1.f.a;
                    if (bVar2.b == -1 && bVar.e != bVar2.e) {
                        z = true;
                        C4701Xg1 c4701Xg1 = c4507Vg1.f;
                        InterfaceC7583kh1.b bVar3 = c4701Xg1.a;
                        long j = c4701Xg1.b;
                        this.s1 = O(bVar3, j, c4701Xg1.c, j, !z, 0);
                        v0();
                        v1();
                        z2 = true;
                    }
                }
            }
            z = false;
            C4701Xg1 c4701Xg12 = c4507Vg1.f;
            InterfaceC7583kh1.b bVar32 = c4701Xg12.a;
            long j3 = c4701Xg12.b;
            this.s1 = O(bVar32, j3, c4701Xg12.c, j3, !z, 0);
            v0();
            v1();
            z2 = true;
        }
    }

    public void a1(int i) {
        this.c1.i(11, i, 0).a();
    }

    @Override // o.AbstractC3283Ir2.a
    public void b() {
        this.c1.m(10);
    }

    public final void b0() throws C3824Og0 {
        long j;
        boolean z;
        C4507Vg1 s = this.n1.s();
        if (s != null) {
            int i = 0;
            if (s.j() != null && !this.w1) {
                if (Q()) {
                    if (s.j().d || this.G1 >= s.j().m()) {
                        C3381Jr2 o3 = s.o();
                        C4507Vg1 c3 = this.n1.c();
                        C3381Jr2 o4 = c3.o();
                        AbstractC7373jp2 abstractC7373jp2 = this.s1.a;
                        w1(abstractC7373jp2, c3.f.a, abstractC7373jp2, s.f.a, C10323vs.b, false);
                        if (c3.d && c3.a.k() != C10323vs.b) {
                            M0(c3.m());
                            return;
                        }
                        for (int i3 = 0; i3 < this.X.length; i3++) {
                            boolean c4 = o3.c(i3);
                            boolean c5 = o4.c(i3);
                            if (c4 && !this.X[i3].v()) {
                                if (this.Z[i3].d() == -2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C10955yR1 c10955yR1 = o3.b[i3];
                                C10955yR1 c10955yR12 = o4.b[i3];
                                if (!c5 || !c10955yR12.equals(c10955yR1) || z) {
                                    N0(this.X[i3], c3.m());
                                }
                            }
                        }
                    }
                }
            } else if (s.f.i || this.w1) {
                while (true) {
                    InterfaceC10469wR1[] interfaceC10469wR1Arr = this.X;
                    if (i < interfaceC10469wR1Arr.length) {
                        InterfaceC10469wR1 interfaceC10469wR1 = interfaceC10469wR1Arr[i];
                        IX1 ix1 = s.c[i];
                        if (ix1 != null && interfaceC10469wR1.e() == ix1 && interfaceC10469wR1.k()) {
                            long j3 = s.f.e;
                            if (j3 != C10323vs.b && j3 != Long.MIN_VALUE) {
                                j = s.l() + s.f.e;
                            } else {
                                j = -9223372036854775807L;
                            }
                            N0(interfaceC10469wR1, j);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void b1(int i) throws C3824Og0 {
        this.z1 = i;
        if (!this.n1.K(this.s1.a, i)) {
            F0(true);
        }
        J(false);
    }

    @Override // o.C3144Hh1.d
    public void c() {
        this.c1.m(22);
    }

    public final void c0() throws C3824Og0 {
        C4507Vg1 s = this.n1.s();
        if (s != null && this.n1.r() != s && !s.g && r0()) {
            s();
        }
    }

    public void c1(LZ1 lz1) {
        this.c1.f(5, lz1).a();
    }

    @Override // o.OD1.a
    public synchronized void d(OD1 od1) {
        if (!this.u1 && this.e1.getThread().isAlive()) {
            this.c1.f(14, od1).a();
            return;
        }
        I31.n(M1, "Ignoring messages sent after release.");
        od1.m(false);
    }

    public final void d0() throws C3824Og0 {
        K(this.o1.j(), true);
    }

    public final void d1(LZ1 lz1) {
        this.r1 = lz1;
    }

    public final void e0(c cVar) throws C3824Og0 {
        this.t1.b(1);
        K(this.o1.x(cVar.a, cVar.b, cVar.c, cVar.d), false);
    }

    public void e1(boolean z) {
        this.c1.i(12, z ? 1 : 0, 0).a();
    }

    public void f0(int i, int i3, int i4, U52 u52) {
        this.c1.f(19, new c(i, i3, i4, u52)).a();
    }

    public final void f1(boolean z) throws C3824Og0 {
        this.A1 = z;
        if (!this.n1.L(this.s1.a, z)) {
            F0(true);
        }
        J(false);
    }

    public final void g0() {
        InterfaceC6859hi0[] interfaceC6859hi0Arr;
        for (C4507Vg1 r = this.n1.r(); r != null; r = r.j()) {
            for (InterfaceC6859hi0 interfaceC6859hi0 : r.o().c) {
                if (interfaceC6859hi0 != null) {
                    interfaceC6859hi0.k();
                }
            }
        }
    }

    public void g1(U52 u52) {
        this.c1.f(21, u52).a();
    }

    public final void h0(boolean z) {
        InterfaceC6859hi0[] interfaceC6859hi0Arr;
        for (C4507Vg1 r = this.n1.r(); r != null; r = r.j()) {
            for (InterfaceC6859hi0 interfaceC6859hi0 : r.o().c) {
                if (interfaceC6859hi0 != null) {
                    interfaceC6859hi0.p(z);
                }
            }
        }
    }

    public final void h1(U52 u52) throws C3824Og0 {
        this.t1.b(1);
        K(this.o1.F(u52), false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i;
        C4507Vg1 s;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 0:
                    l0();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    X0(z, message.arg2, true, 1);
                    break;
                case 2:
                    q();
                    break;
                case 3:
                    G0((h) message.obj);
                    break;
                case 4:
                    Z0((DD1) message.obj);
                    break;
                case 5:
                    d1((LZ1) message.obj);
                    break;
                case 6:
                    q1(false, true);
                    break;
                case 7:
                    n0();
                    return true;
                case 8:
                    L((InterfaceC4410Ug1) message.obj);
                    break;
                case 9:
                    H((InterfaceC4410Ug1) message.obj);
                    break;
                case 10:
                    s0();
                    break;
                case 11:
                    b1(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    f1(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    P0(z3, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    J0((OD1) message.obj);
                    break;
                case 15:
                    L0((OD1) message.obj);
                    break;
                case 16:
                    N((DD1) message.obj, false);
                    break;
                case 17:
                    R0((b) message.obj);
                    break;
                case 18:
                    i((b) message.obj, message.arg1);
                    break;
                case 19:
                    e0((c) message.obj);
                    break;
                case 20:
                    p0(message.arg1, message.arg2, (U52) message.obj);
                    break;
                case 21:
                    h1((U52) message.obj);
                    break;
                case 22:
                    d0();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    V0(z4);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    T0(z5);
                    break;
                case 25:
                    m();
                    break;
                case 26:
                    t0();
                    break;
                default:
                    return false;
            }
        } catch (LU e3) {
            I(e3, e3.X);
        } catch (C3824Og0 e4) {
            e = e4;
            if (e.P1 == 1 && (s = this.n1.s()) != null) {
                e = e.i(s.f.a);
            }
            if (e.V1 && this.J1 == null) {
                I31.o(M1, "Recoverable renderer error", e);
                this.J1 = e;
                InterfaceC5285bG0 interfaceC5285bG0 = this.c1;
                interfaceC5285bG0.j(interfaceC5285bG0.f(25, e));
            } else {
                C3824Og0 c3824Og0 = this.J1;
                if (c3824Og0 != null) {
                    c3824Og0.addSuppressed(e);
                    e = this.J1;
                }
                I31.e(M1, "Playback error", e);
                if (e.P1 == 1 && this.n1.r() != this.n1.s()) {
                    while (this.n1.r() != this.n1.s()) {
                        this.n1.b();
                    }
                    C4701Xg1 c4701Xg1 = ((C4507Vg1) C9542sf.g(this.n1.r())).f;
                    InterfaceC7583kh1.b bVar = c4701Xg1.a;
                    long j = c4701Xg1.b;
                    this.s1 = O(bVar, j, c4701Xg1.c, j, true, 0);
                }
                q1(true, false);
                this.s1 = this.s1.f(e);
            }
        } catch (C3989Py1 e5) {
            int i4 = e5.Y;
            if (i4 == 1) {
                if (e5.X) {
                    i = 3001;
                } else {
                    i = AD1.n1;
                }
            } else {
                if (i4 == 4) {
                    if (e5.X) {
                        i = AD1.m1;
                    } else {
                        i = AD1.o1;
                    }
                }
                I(e5, i3);
            }
            i3 = i;
            I(e5, i3);
        } catch (C4041Qm e6) {
            I(e6, 1002);
        } catch (InterfaceC7201j70.a e7) {
            I(e7, e7.X);
        } catch (IOException e8) {
            I(e8, 2000);
        } catch (RuntimeException e9) {
            C3824Og0 n = C3824Og0.n(e9, ((e9 instanceof IllegalStateException) || (e9 instanceof IllegalArgumentException)) ? 1004 : 1004);
            I31.e(M1, "Playback error", n);
            q1(true, false);
            this.s1 = this.s1.f(n);
        }
        X();
        return true;
    }

    public final void i(b bVar, int i) throws C3824Og0 {
        this.t1.b(1);
        C3144Hh1 c3144Hh1 = this.o1;
        if (i == -1) {
            i = c3144Hh1.s();
        }
        K(c3144Hh1.f(i, bVar.a, bVar.b), false);
    }

    public final void i0() {
        InterfaceC6859hi0[] interfaceC6859hi0Arr;
        for (C4507Vg1 r = this.n1.r(); r != null; r = r.j()) {
            for (InterfaceC6859hi0 interfaceC6859hi0 : r.o().c) {
                if (interfaceC6859hi0 != null) {
                    interfaceC6859hi0.v();
                }
            }
        }
    }

    public final void i1(int i) {
        BD1 bd1 = this.s1;
        if (bd1.e != i) {
            if (i != 2) {
                this.L1 = C10323vs.b;
            }
            this.s1 = bd1.h(i);
        }
    }

    @Override // o.InterfaceC4410Ug1.a
    public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
        this.c1.f(8, interfaceC4410Ug1).a();
    }

    @Override // o.G02.a
    /* renamed from: j0 */
    public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
        this.c1.f(9, interfaceC4410Ug1).a();
    }

    public final boolean j1() {
        C4507Vg1 r;
        C4507Vg1 j;
        if (!l1() || this.w1 || (r = this.n1.r()) == null || (j = r.j()) == null || this.G1 < j.m() || !j.g) {
            return false;
        }
        return true;
    }

    public void k(int i, List<C3144Hh1.c> list, U52 u52) {
        this.c1.e(18, i, 0, new b(list, u52, -1, C10323vs.b, null)).a();
    }

    public void k0() {
        this.c1.c(0).a();
    }

    public final boolean k1() {
        long y;
        if (!S()) {
            return false;
        }
        C4507Vg1 l = this.n1.l();
        long G = G(l.k());
        if (l == this.n1.r()) {
            y = l.y(this.G1);
        } else {
            y = l.y(this.G1) - l.f.b;
        }
        long j = y;
        boolean i = this.a1.i(j, G, this.j1.h().X);
        if (!i && G < r2) {
            if (this.h1 > 0 || this.i1) {
                this.n1.r().a.r(this.s1.r, false);
                return this.a1.i(j, G, this.j1.h().X);
            }
            return i;
        }
        return i;
    }

    public final void l0() {
        int i;
        this.t1.b(1);
        u0(false, false, false, true);
        this.a1.onPrepared();
        if (this.s1.a.x()) {
            i = 4;
        } else {
            i = 2;
        }
        i1(i);
        this.o1.y(this.b1.e());
        this.c1.m(2);
    }

    public final boolean l1() {
        BD1 bd1 = this.s1;
        if (bd1.l && bd1.m == 0) {
            return true;
        }
        return false;
    }

    public final void m() throws C3824Og0 {
        t0();
    }

    public synchronized boolean m0() {
        if (!this.u1 && this.e1.getThread().isAlive()) {
            this.c1.m(7);
            y1(new InterfaceC8331nh2() { // from class: o.ci0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(C6118ei0.this.u1);
                    return valueOf;
                }
            }, this.q1);
            return this.u1;
        }
        return true;
    }

    public final boolean m1(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        if (this.E1 == 0) {
            return U();
        }
        if (!z) {
            return false;
        }
        if (!this.s1.g) {
            return true;
        }
        C4507Vg1 r = this.n1.r();
        if (n1(this.s1.a, r.f.a)) {
            j = this.p1.c();
        } else {
            j = C10323vs.b;
        }
        long j3 = j;
        C4507Vg1 l = this.n1.l();
        if (l.q() && l.f.i) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l.f.a.c() && !l.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && !z3 && !this.a1.g(this.s1.a, r.f.a, F(), this.j1.h().X, this.x1, j3)) {
            return false;
        }
        return true;
    }

    public final boolean n1(AbstractC7373jp2 abstractC7373jp2, InterfaceC7583kh1.b bVar) {
        if (!bVar.c() && !abstractC7373jp2.x()) {
            abstractC7373jp2.u(abstractC7373jp2.m(bVar.a, this.g1).Z, this.f1);
            if (this.f1.k()) {
                AbstractC7373jp2.d dVar = this.f1;
                if (dVar.d1 && dVar.a1 != C10323vs.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(OD1 od1) throws C3824Og0 {
        if (od1.l()) {
            return;
        }
        try {
            od1.i().t(od1.k(), od1.g());
        } finally {
            od1.m(true);
        }
    }

    public final void o0() {
        for (int i = 0; i < this.X.length; i++) {
            this.Z[i].i();
            this.X[i].g();
        }
    }

    public final void o1() throws C3824Og0 {
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        this.x1 = false;
        this.j1.e();
        for (InterfaceC10469wR1 interfaceC10469wR1 : this.X) {
            if (T(interfaceC10469wR1)) {
                interfaceC10469wR1.start();
            }
        }
    }

    public final void p(InterfaceC10469wR1 interfaceC10469wR1) throws C3824Og0 {
        if (!T(interfaceC10469wR1)) {
            return;
        }
        this.j1.a(interfaceC10469wR1);
        u(interfaceC10469wR1);
        interfaceC10469wR1.b();
        this.E1--;
    }

    public final void p0(int i, int i3, U52 u52) throws C3824Og0 {
        this.t1.b(1);
        K(this.o1.C(i, i3, u52), false);
    }

    public void p1() {
        this.c1.c(6).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() throws C3824Og0, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        BD1 bd1;
        int i;
        boolean z6;
        boolean z7;
        boolean z8;
        long c3 = this.l1.c();
        this.c1.o(2);
        u1();
        int i3 = this.s1.e;
        if (i3 != 1 && i3 != 4) {
            C4507Vg1 r = this.n1.r();
            if (r == null) {
                D0(c3, 10L);
                return;
            }
            C7624kr2.a("doSomeWork");
            v1();
            if (r.d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                r.a.r(this.s1.r - this.h1, this.i1);
                z = true;
                z2 = true;
                int i4 = 0;
                while (true) {
                    InterfaceC10469wR1[] interfaceC10469wR1Arr = this.X;
                    if (i4 >= interfaceC10469wR1Arr.length) {
                        break;
                    }
                    InterfaceC10469wR1 interfaceC10469wR1 = interfaceC10469wR1Arr[i4];
                    if (T(interfaceC10469wR1)) {
                        interfaceC10469wR1.D(this.G1, elapsedRealtime);
                        if (z && interfaceC10469wR1.c()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (r.c[i4] != interfaceC10469wR1.e()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6 && interfaceC10469wR1.k()) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (!z6 && !z7 && !interfaceC10469wR1.isReady() && !interfaceC10469wR1.c()) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z2 && z8) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z8) {
                            interfaceC10469wR1.u();
                        }
                    }
                    i4++;
                }
            } else {
                r.a.m();
                z = true;
                z2 = true;
            }
            long j = r.f.e;
            if (z && r.d && (j == C10323vs.b || j <= this.s1.r)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.w1) {
                this.w1 = false;
                X0(false, this.s1.m, false, 5);
            }
            if (z3 && r.f.i) {
                i1(4);
                r1();
            } else if (this.s1.e == 2 && m1(z2)) {
                i1(3);
                this.J1 = null;
                if (l1()) {
                    o1();
                }
            } else if (this.s1.e == 3 && (this.E1 != 0 ? !z2 : !U())) {
                this.x1 = l1();
                i1(2);
                if (this.x1) {
                    i0();
                    this.p1.d();
                }
                r1();
            }
            if (this.s1.e == 2) {
                int i5 = 0;
                while (true) {
                    InterfaceC10469wR1[] interfaceC10469wR1Arr2 = this.X;
                    if (i5 >= interfaceC10469wR1Arr2.length) {
                        break;
                    }
                    if (T(interfaceC10469wR1Arr2[i5]) && this.X[i5].e() == r.c[i5]) {
                        this.X[i5].u();
                    }
                    i5++;
                }
                BD1 bd12 = this.s1;
                if (!bd12.g && bd12.q < r2 && S()) {
                    if (this.L1 == C10323vs.b) {
                        this.L1 = this.l1.b();
                    } else if (this.l1.b() - this.L1 >= q2) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                    if (!l1() && this.s1.e == 3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!this.D1 && this.C1 && z4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    bd1 = this.s1;
                    if (bd1.f415o != z5) {
                        this.s1 = bd1.i(z5);
                    }
                    this.C1 = false;
                    if (!z5 && (i = this.s1.e) != 4) {
                        if (z4 && i != 2) {
                            if (i == 3 && this.E1 != 0) {
                                D0(c3, 1000L);
                            }
                        } else {
                            D0(c3, 10L);
                        }
                    }
                    C7624kr2.c();
                }
            }
            this.L1 = C10323vs.b;
            if (!l1()) {
            }
            z4 = false;
            if (!this.D1) {
            }
            z5 = false;
            bd1 = this.s1;
            if (bd1.f415o != z5) {
            }
            this.C1 = false;
            if (!z5) {
                if (z4) {
                }
                D0(c3, 10L);
            }
            C7624kr2.c();
        }
    }

    public void q0(int i, int i3, U52 u52) {
        this.c1.e(20, i, i3, u52).a();
    }

    public final void q1(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.B1) {
            z3 = false;
        } else {
            z3 = true;
        }
        u0(z3, false, true, false);
        this.t1.b(z2 ? 1 : 0);
        this.a1.f();
        i1(1);
    }

    public final void r(int i, boolean z) throws C3824Og0 {
        boolean z2;
        boolean z3;
        boolean z4;
        InterfaceC10469wR1 interfaceC10469wR1 = this.X[i];
        if (!T(interfaceC10469wR1)) {
            C4507Vg1 s = this.n1.s();
            if (s == this.n1.r()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C3381Jr2 o3 = s.o();
            C10955yR1 c10955yR1 = o3.b[i];
            C10833xx0[] z5 = z(o3.c[i]);
            if (l1() && this.s1.e == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.E1++;
            this.Y.add(interfaceC10469wR1);
            interfaceC10469wR1.j(c10955yR1, z5, s.c[i], this.G1, z4, z2, s.m(), s.l());
            interfaceC10469wR1.t(11, new a());
            this.j1.b(interfaceC10469wR1);
            if (z3) {
                interfaceC10469wR1.start();
            }
        }
    }

    public final boolean r0() throws C3824Og0 {
        boolean z;
        C4507Vg1 s = this.n1.s();
        C3381Jr2 o3 = s.o();
        int i = 0;
        boolean z2 = false;
        while (true) {
            InterfaceC10469wR1[] interfaceC10469wR1Arr = this.X;
            if (i < interfaceC10469wR1Arr.length) {
                InterfaceC10469wR1 interfaceC10469wR1 = interfaceC10469wR1Arr[i];
                if (T(interfaceC10469wR1)) {
                    if (interfaceC10469wR1.e() != s.c[i]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!o3.c(i) || z) {
                        if (!interfaceC10469wR1.v()) {
                            interfaceC10469wR1.C(z(o3.c[i]), s.c[i], s.m(), s.l());
                        } else if (interfaceC10469wR1.c()) {
                            p(interfaceC10469wR1);
                        } else {
                            z2 = true;
                        }
                    }
                }
                i++;
            } else {
                return !z2;
            }
        }
    }

    public final void r1() throws C3824Og0 {
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        this.j1.g();
        for (InterfaceC10469wR1 interfaceC10469wR1 : this.X) {
            if (T(interfaceC10469wR1)) {
                u(interfaceC10469wR1);
            }
        }
    }

    public final void s() throws C3824Og0 {
        t(new boolean[this.X.length]);
    }

    public final void s0() throws C3824Og0 {
        int i;
        boolean z;
        float f3 = this.j1.h().X;
        C4507Vg1 s = this.n1.s();
        boolean z2 = true;
        for (C4507Vg1 r = this.n1.r(); r != null && r.d; r = r.j()) {
            C3381Jr2 v = r.v(f3, this.s1.a);
            if (!v.a(r.o())) {
                if (z2) {
                    C4507Vg1 r3 = this.n1.r();
                    boolean C = this.n1.C(r3);
                    boolean[] zArr = new boolean[this.X.length];
                    long b3 = r3.b(v, this.s1.r, C, zArr);
                    BD1 bd1 = this.s1;
                    if (bd1.e != 4 && b3 != bd1.r) {
                        z = true;
                    } else {
                        z = false;
                    }
                    BD1 bd12 = this.s1;
                    i = 4;
                    this.s1 = O(bd12.b, b3, bd12.c, bd12.d, z, 5);
                    if (z) {
                        w0(b3);
                    }
                    boolean[] zArr2 = new boolean[this.X.length];
                    int i3 = 0;
                    while (true) {
                        InterfaceC10469wR1[] interfaceC10469wR1Arr = this.X;
                        if (i3 >= interfaceC10469wR1Arr.length) {
                            break;
                        }
                        InterfaceC10469wR1 interfaceC10469wR1 = interfaceC10469wR1Arr[i3];
                        boolean T = T(interfaceC10469wR1);
                        zArr2[i3] = T;
                        IX1 ix1 = r3.c[i3];
                        if (T) {
                            if (ix1 != interfaceC10469wR1.e()) {
                                p(interfaceC10469wR1);
                            } else if (zArr[i3]) {
                                interfaceC10469wR1.F(this.G1);
                            }
                        }
                        i3++;
                    }
                    t(zArr2);
                } else {
                    i = 4;
                    this.n1.C(r);
                    if (r.d) {
                        r.a(v, Math.max(r.f.b, r.y(this.G1)), false);
                    }
                }
                J(true);
                if (this.s1.e != i) {
                    W();
                    v1();
                    this.c1.m(2);
                    return;
                }
                return;
            }
            if (r == s) {
                z2 = false;
            }
        }
    }

    public final void s1() {
        boolean z;
        C4507Vg1 l = this.n1.l();
        if (!this.y1 && (l == null || !l.a.a())) {
            z = false;
        } else {
            z = true;
        }
        BD1 bd1 = this.s1;
        if (z != bd1.g) {
            this.s1 = bd1.b(z);
        }
    }

    public final void t(boolean[] zArr) throws C3824Og0 {
        C4507Vg1 s = this.n1.s();
        C3381Jr2 o3 = s.o();
        for (int i = 0; i < this.X.length; i++) {
            if (!o3.c(i) && this.Y.remove(this.X[i])) {
                this.X[i].reset();
            }
        }
        for (int i3 = 0; i3 < this.X.length; i3++) {
            if (o3.c(i3)) {
                r(i3, zArr[i3]);
            }
        }
        s.g = true;
    }

    public final void t0() throws C3824Og0 {
        s0();
        F0(true);
    }

    public final void t1(InterfaceC7583kh1.b bVar, C10079ur2 c10079ur2, C3381Jr2 c3381Jr2) {
        this.a1.c(this.s1.a, bVar, this.X, c10079ur2, c3381Jr2.c);
    }

    public final void u(InterfaceC10469wR1 interfaceC10469wR1) {
        if (interfaceC10469wR1.getState() == 2) {
            interfaceC10469wR1.stop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        AbstractC7373jp2 abstractC7373jp2;
        AbstractC7373jp2 abstractC7373jp22;
        InterfaceC7583kh1.b bVar;
        C10079ur2 c10079ur2;
        C3381Jr2 c3381Jr2;
        List list;
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        this.c1.o(2);
        C3824Og0 c3824Og0 = null;
        this.J1 = null;
        this.x1 = false;
        this.j1.g();
        this.G1 = 1000000000000L;
        for (InterfaceC10469wR1 interfaceC10469wR1 : this.X) {
            try {
                p(interfaceC10469wR1);
            } catch (RuntimeException | C3824Og0 e3) {
                I31.e(M1, "Disable failed.", e3);
            }
        }
        if (z) {
            for (InterfaceC10469wR1 interfaceC10469wR12 : this.X) {
                if (this.Y.remove(interfaceC10469wR12)) {
                    try {
                        interfaceC10469wR12.reset();
                    } catch (RuntimeException e4) {
                        I31.e(M1, "Reset failed.", e4);
                    }
                }
            }
        }
        this.E1 = 0;
        BD1 bd1 = this.s1;
        InterfaceC7583kh1.b bVar2 = bd1.b;
        long j3 = bd1.r;
        if (!this.s1.b.c() && !V(this.s1, this.g1)) {
            j = this.s1.r;
        } else {
            j = this.s1.c;
        }
        if (z2) {
            this.F1 = null;
            Pair<InterfaceC7583kh1.b, Long> D = D(this.s1.a);
            bVar2 = (InterfaceC7583kh1.b) D.first;
            j3 = ((Long) D.second).longValue();
            boolean equals = bVar2.equals(this.s1.b);
            j = C10323vs.b;
            if (!equals) {
                z5 = true;
                long j4 = j3;
                long j5 = j;
                this.n1.f();
                this.y1 = false;
                abstractC7373jp2 = this.s1.a;
                if (z3 && (abstractC7373jp2 instanceof QD1)) {
                    abstractC7373jp2 = ((QD1) abstractC7373jp2).M(this.o1.r());
                    if (bVar2.b != -1) {
                        abstractC7373jp2.m(bVar2.a, this.g1);
                        if (abstractC7373jp2.u(this.g1.Z, this.f1).k()) {
                            abstractC7373jp22 = abstractC7373jp2;
                            bVar = new InterfaceC7583kh1.b(bVar2.a, bVar2.d);
                            BD1 bd12 = this.s1;
                            int i = bd12.e;
                            if (!z4) {
                                c3824Og0 = bd12.f;
                            }
                            C3824Og0 c3824Og02 = c3824Og0;
                            if (z5) {
                                c10079ur2 = C10079ur2.Z0;
                            } else {
                                c10079ur2 = bd12.h;
                            }
                            C10079ur2 c10079ur22 = c10079ur2;
                            if (z5) {
                                c3381Jr2 = this.Z0;
                            } else {
                                c3381Jr2 = bd12.i;
                            }
                            C3381Jr2 c3381Jr22 = c3381Jr2;
                            if (z5) {
                                list = AbstractC5317bO0.L();
                            } else {
                                list = bd12.j;
                            }
                            List list2 = list;
                            BD1 bd13 = this.s1;
                            this.s1 = new BD1(abstractC7373jp22, bVar, j5, j4, i, c3824Og02, false, c10079ur22, c3381Jr22, list2, bVar, bd13.l, bd13.m, bd13.n, j4, 0L, j4, 0L, false);
                            if (z3) {
                                this.o1.A();
                                return;
                            }
                            return;
                        }
                    }
                }
                abstractC7373jp22 = abstractC7373jp2;
                bVar = bVar2;
                BD1 bd122 = this.s1;
                int i3 = bd122.e;
                if (!z4) {
                }
                C3824Og0 c3824Og022 = c3824Og0;
                if (z5) {
                }
                C10079ur2 c10079ur222 = c10079ur2;
                if (z5) {
                }
                C3381Jr2 c3381Jr222 = c3381Jr2;
                if (z5) {
                }
                List list22 = list;
                BD1 bd132 = this.s1;
                this.s1 = new BD1(abstractC7373jp22, bVar, j5, j4, i3, c3824Og022, false, c10079ur222, c3381Jr222, list22, bVar, bd132.l, bd132.m, bd132.n, j4, 0L, j4, 0L, false);
                if (z3) {
                }
            }
        }
        z5 = false;
        long j42 = j3;
        long j52 = j;
        this.n1.f();
        this.y1 = false;
        abstractC7373jp2 = this.s1.a;
        if (z3) {
            abstractC7373jp2 = ((QD1) abstractC7373jp2).M(this.o1.r());
            if (bVar2.b != -1) {
            }
        }
        abstractC7373jp22 = abstractC7373jp2;
        bVar = bVar2;
        BD1 bd1222 = this.s1;
        int i32 = bd1222.e;
        if (!z4) {
        }
        C3824Og0 c3824Og0222 = c3824Og0;
        if (z5) {
        }
        C10079ur2 c10079ur2222 = c10079ur2;
        if (z5) {
        }
        C3381Jr2 c3381Jr2222 = c3381Jr2;
        if (z5) {
        }
        List list222 = list;
        BD1 bd1322 = this.s1;
        this.s1 = new BD1(abstractC7373jp22, bVar, j52, j42, i32, c3824Og0222, false, c10079ur2222, c3381Jr2222, list222, bVar, bd1322.l, bd1322.m, bd1322.n, j42, 0L, j42, 0L, false);
        if (z3) {
        }
    }

    public final void u1() throws C3824Og0 {
        if (!this.s1.a.x() && this.o1.u()) {
            Z();
            b0();
            c0();
            a0();
        }
    }

    public void v(long j) {
        this.K1 = j;
    }

    public final void v0() {
        boolean z;
        C4507Vg1 r = this.n1.r();
        if (r != null && r.f.h && this.v1) {
            z = true;
        } else {
            z = false;
        }
        this.w1 = z;
    }

    public final void v1() throws C3824Og0 {
        long j;
        boolean z;
        C4507Vg1 r = this.n1.r();
        if (r != null) {
            if (r.d) {
                j = r.a.k();
            } else {
                j = -9223372036854775807L;
            }
            if (j != C10323vs.b) {
                w0(j);
                if (j != this.s1.r) {
                    BD1 bd1 = this.s1;
                    long j3 = j;
                    this.s1 = O(bd1.b, j3, bd1.c, j3, true, 5);
                }
            } else {
                GZ gz = this.j1;
                if (r != this.n1.s()) {
                    z = true;
                } else {
                    z = false;
                }
                long i = gz.i(z);
                this.G1 = i;
                long y = r.y(i);
                Y(this.s1.r, y);
                this.s1.o(y);
            }
            this.s1.p = this.n1.l().i();
            this.s1.q = F();
            BD1 bd12 = this.s1;
            if (bd12.l && bd12.e == 3 && n1(bd12.a, bd12.b) && this.s1.n.X == 1.0f) {
                float b3 = this.p1.b(y(), F());
                if (this.j1.h().X != b3) {
                    Q0(this.s1.n.c(b3));
                    M(this.s1.n, this.j1.h().X, false, false);
                }
            }
        }
    }

    public void w(boolean z) {
        this.c1.i(24, z ? 1 : 0, 0).a();
    }

    public final void w0(long j) throws C3824Og0 {
        long z;
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        C4507Vg1 r = this.n1.r();
        if (r == null) {
            z = j + 1000000000000L;
        } else {
            z = r.z(j);
        }
        this.G1 = z;
        this.j1.c(z);
        for (InterfaceC10469wR1 interfaceC10469wR1 : this.X) {
            if (T(interfaceC10469wR1)) {
                interfaceC10469wR1.F(this.G1);
            }
        }
        g0();
    }

    public final void w1(AbstractC7373jp2 abstractC7373jp2, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp22, InterfaceC7583kh1.b bVar2, long j, boolean z) throws C3824Og0 {
        Object obj;
        DD1 dd1;
        if (!n1(abstractC7373jp2, bVar)) {
            if (bVar.c()) {
                dd1 = DD1.Y0;
            } else {
                dd1 = this.s1.n;
            }
            if (!this.j1.h().equals(dd1)) {
                Q0(dd1);
                M(this.s1.n, dd1.X, false, false);
                return;
            }
            return;
        }
        abstractC7373jp2.u(abstractC7373jp2.m(bVar.a, this.g1).Z, this.f1);
        this.p1.a((C8322nf1.g) TD2.o(this.f1.f1));
        if (j != C10323vs.b) {
            this.p1.e(B(abstractC7373jp2, bVar.a, j));
            return;
        }
        Object obj2 = this.f1.X;
        if (!abstractC7373jp22.x()) {
            obj = abstractC7373jp22.u(abstractC7373jp22.m(bVar2.a, this.g1).Z, this.f1).X;
        } else {
            obj = null;
        }
        if (TD2.g(obj, obj2) && !z) {
            return;
        }
        this.p1.e(C10323vs.b);
    }

    public final AbstractC5317bO0<C4224Si1> x(InterfaceC6859hi0[] interfaceC6859hi0Arr) {
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        boolean z = false;
        for (InterfaceC6859hi0 interfaceC6859hi0 : interfaceC6859hi0Arr) {
            if (interfaceC6859hi0 != null) {
                C4224Si1 c4224Si1 = interfaceC6859hi0.a(0).e1;
                if (c4224Si1 == null) {
                    aVar.g(new C4224Si1(new C4224Si1.b[0]));
                } else {
                    aVar.g(c4224Si1);
                    z = true;
                }
            }
        }
        if (z) {
            return aVar.e();
        }
        return AbstractC5317bO0.L();
    }

    public final void x1(float f3) {
        InterfaceC6859hi0[] interfaceC6859hi0Arr;
        for (C4507Vg1 r = this.n1.r(); r != null; r = r.j()) {
            for (InterfaceC6859hi0 interfaceC6859hi0 : r.o().c) {
                if (interfaceC6859hi0 != null) {
                    interfaceC6859hi0.i(f3);
                }
            }
        }
    }

    public final long y() {
        BD1 bd1 = this.s1;
        return B(bd1.a, bd1.b.a, bd1.r);
    }

    public final synchronized void y1(InterfaceC8331nh2<Boolean> interfaceC8331nh2, long j) {
        long b3 = this.l1.b() + j;
        boolean z = false;
        while (!interfaceC8331nh2.get().booleanValue() && j > 0) {
            try {
                this.l1.e();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = b3 - this.l1.b();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void z0(AbstractC7373jp2 abstractC7373jp2, AbstractC7373jp2 abstractC7373jp22) {
        if (abstractC7373jp2.x() && abstractC7373jp22.x()) {
            return;
        }
        int size = this.k1.size() - 1;
        while (size >= 0) {
            AbstractC7373jp2 abstractC7373jp23 = abstractC7373jp2;
            AbstractC7373jp2 abstractC7373jp24 = abstractC7373jp22;
            if (!y0(this.k1.get(size), abstractC7373jp23, abstractC7373jp24, this.z1, this.A1, this.f1, this.g1)) {
                this.k1.get(size).X.m(false);
                this.k1.remove(size);
            }
            size--;
            abstractC7373jp2 = abstractC7373jp23;
            abstractC7373jp22 = abstractC7373jp24;
        }
        Collections.sort(this.k1);
    }
}
