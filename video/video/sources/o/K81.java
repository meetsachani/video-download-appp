package o;

import android.util.Pair;
import o.AbstractC7373jp2;
import o.InterfaceC7583kh1;

@Deprecated
/* loaded from: classes2.dex */
public final class K81 extends JN2 {
    public final boolean h1;
    public final AbstractC7373jp2.d i1;
    public final AbstractC7373jp2.b j1;
    public a k1;
    @InterfaceC11300zs1
    public J81 l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3696My0 {
        public static final Object d1 = new Object();
        @InterfaceC11300zs1
        public final Object b1;
        @InterfaceC11300zs1
        public final Object c1;

        public a(AbstractC7373jp2 abstractC7373jp2, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
            super(abstractC7373jp2);
            this.b1 = obj;
            this.c1 = obj2;
        }

        public static a C(C8322nf1 c8322nf1) {
            return new a(new b(c8322nf1), AbstractC7373jp2.d.m1, d1);
        }

        public static a D(AbstractC7373jp2 abstractC7373jp2, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
            return new a(abstractC7373jp2, obj, obj2);
        }

        public a B(AbstractC7373jp2 abstractC7373jp2) {
            return new a(abstractC7373jp2, this.b1, this.c1);
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public int g(Object obj) {
            Object obj2;
            AbstractC7373jp2 abstractC7373jp2 = this.a1;
            if (d1.equals(obj) && (obj2 = this.c1) != null) {
                obj = obj2;
            }
            return abstractC7373jp2.g(obj);
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            this.a1.l(i, bVar, z);
            if (TD2.g(bVar.Y, this.c1) && z) {
                bVar.Y = d1;
            }
            return bVar;
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public Object t(int i) {
            Object t = this.a1.t(i);
            if (TD2.g(t, this.c1)) {
                return d1;
            }
            return t;
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            this.a1.v(i, dVar, j);
            if (TD2.g(dVar.X, this.b1)) {
                dVar.X = AbstractC7373jp2.d.m1;
            }
            return dVar;
        }
    }

    @InterfaceC5056aJ2
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC7373jp2 {
        public final C8322nf1 a1;

        public b(C8322nf1 c8322nf1) {
            this.a1 = c8322nf1;
        }

        @Override // o.AbstractC7373jp2
        public int g(Object obj) {
            if (obj == a.d1) {
                return 0;
            }
            return -1;
        }

        @Override // o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            Integer num;
            Object obj = null;
            if (z) {
                num = 0;
            } else {
                num = null;
            }
            if (z) {
                obj = a.d1;
            }
            bVar.z(num, obj, 0, C10323vs.b, 0L, J6.g1, true);
            return bVar;
        }

        @Override // o.AbstractC7373jp2
        public int n() {
            return 1;
        }

        @Override // o.AbstractC7373jp2
        public Object t(int i) {
            return a.d1;
        }

        @Override // o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            dVar.l(AbstractC7373jp2.d.m1, this.a1, null, C10323vs.b, C10323vs.b, C10323vs.b, false, true, null, 0L, C10323vs.b, 0, 0, 0L);
            dVar.g1 = true;
            return dVar;
        }

        @Override // o.AbstractC7373jp2
        public int w() {
            return 1;
        }
    }

    public K81(InterfaceC7583kh1 interfaceC7583kh1, boolean z) {
        super(interfaceC7583kh1);
        boolean z2;
        if (z && interfaceC7583kh1.R()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h1 = z2;
        this.i1 = new AbstractC7373jp2.d();
        this.j1 = new AbstractC7373jp2.b();
        AbstractC7373jp2 S = interfaceC7583kh1.S();
        if (S != null) {
            this.k1 = a.D(S, null, null);
            this.o1 = true;
            return;
        }
        this.k1 = a.C(interfaceC7583kh1.k());
    }

    @Override // o.JN2
    @InterfaceC11300zs1
    public InterfaceC7583kh1.b F0(InterfaceC7583kh1.b bVar) {
        return bVar.a(Q0(bVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // o.JN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L0(AbstractC7373jp2 abstractC7373jp2) {
        long j;
        a D;
        J81 j81;
        InterfaceC7583kh1.b a2;
        a D2;
        if (this.n1) {
            this.k1 = this.k1.B(abstractC7373jp2);
            J81 j812 = this.l1;
            if (j812 != null) {
                T0(j812.p());
            }
        } else if (abstractC7373jp2.x()) {
            if (this.o1) {
                D2 = this.k1.B(abstractC7373jp2);
            } else {
                D2 = a.D(abstractC7373jp2, AbstractC7373jp2.d.m1, a.d1);
            }
            this.k1 = D2;
        } else {
            abstractC7373jp2.u(0, this.i1);
            long f = this.i1.f();
            Object obj = this.i1.X;
            J81 j813 = this.l1;
            if (j813 != null) {
                long t = j813.t();
                this.k1.m(this.l1.X.a, this.j1);
                long t2 = this.j1.t() + t;
                if (t2 != this.k1.u(0, this.i1).f()) {
                    j = t2;
                    Pair<Object, Long> q = abstractC7373jp2.q(this.i1, this.j1, 0, j);
                    Object obj2 = q.first;
                    long longValue = ((Long) q.second).longValue();
                    if (!this.o1) {
                        D = this.k1.B(abstractC7373jp2);
                    } else {
                        D = a.D(abstractC7373jp2, obj, obj2);
                    }
                    this.k1 = D;
                    j81 = this.l1;
                    if (j81 != null) {
                        T0(longValue);
                        InterfaceC7583kh1.b bVar = j81.X;
                        a2 = bVar.a(R0(bVar.a));
                        this.o1 = true;
                        this.n1 = true;
                        p0(this.k1);
                        if (a2 == null) {
                            ((J81) C9542sf.g(this.l1)).b(a2);
                            return;
                        }
                        return;
                    }
                }
            }
            j = f;
            Pair<Object, Long> q2 = abstractC7373jp2.q(this.i1, this.j1, 0, j);
            Object obj22 = q2.first;
            long longValue2 = ((Long) q2.second).longValue();
            if (!this.o1) {
            }
            this.k1 = D;
            j81 = this.l1;
            if (j81 != null) {
            }
        }
        a2 = null;
        this.o1 = true;
        this.n1 = true;
        p0(this.k1);
        if (a2 == null) {
        }
    }

    @Override // o.JN2
    public void N0() {
        if (!this.h1) {
            this.m1 = true;
            M0();
        }
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    /* renamed from: P0 */
    public J81 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        J81 j81 = new J81(bVar, interfaceC10877y8, j);
        j81.y(this.f1);
        if (this.n1) {
            j81.b(bVar.a(R0(bVar.a)));
            return j81;
        }
        this.l1 = j81;
        if (!this.m1) {
            this.m1 = true;
            M0();
        }
        return j81;
    }

    public final Object Q0(Object obj) {
        if (this.k1.c1 != null && this.k1.c1.equals(obj)) {
            return a.d1;
        }
        return obj;
    }

    public final Object R0(Object obj) {
        if (this.k1.c1 != null && obj.equals(a.d1)) {
            return this.k1.c1;
        }
        return obj;
    }

    public AbstractC7373jp2 S0() {
        return this.k1;
    }

    @HS1({"unpreparedMaskingMediaPeriod"})
    public final void T0(long j) {
        J81 j81 = this.l1;
        int g = this.k1.g(j81.X.a);
        if (g == -1) {
            return;
        }
        long j2 = this.k1.k(g, this.j1).Y0;
        if (j2 != C10323vs.b && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        j81.w(j);
    }

    @Override // o.TI, o.AbstractC10541wl
    public void q0() {
        this.n1 = false;
        this.m1 = false;
        super.q0();
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((J81) interfaceC4410Ug1).x();
        if (interfaceC4410Ug1 == this.l1) {
            this.l1 = null;
        }
    }

    @Override // o.TI, o.InterfaceC7583kh1
    public void Q() {
    }
}
