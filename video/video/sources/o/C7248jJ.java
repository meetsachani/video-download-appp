package o;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.IdentityHashMap;
import o.AbstractC5317bO0;
import o.AbstractC7373jp2;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.jJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7248jJ extends TI<Integer> {
    public static final int k1 = 0;
    public final C8322nf1 f1;
    public final AbstractC5317bO0<d> g1;
    public final IdentityHashMap<InterfaceC4410Ug1, d> h1;
    @InterfaceC11300zs1
    public Handler i1;
    public boolean j1;

    /* renamed from: o.jJ$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final AbstractC5317bO0.a<d> a = AbstractC5317bO0.r();
        public int b;
        @InterfaceC11300zs1
        public C8322nf1 c;
        @InterfaceC11300zs1
        public InterfaceC7583kh1.a d;

        @InterfaceC6181ey
        public b a(C8322nf1 c8322nf1) {
            return b(c8322nf1, C10323vs.b);
        }

        @InterfaceC6181ey
        public b b(C8322nf1 c8322nf1, long j) {
            C9542sf.g(c8322nf1);
            C9542sf.l(this.d, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return d(this.d.e(c8322nf1), j);
        }

        @InterfaceC6181ey
        public b c(InterfaceC7583kh1 interfaceC7583kh1) {
            return d(interfaceC7583kh1, C10323vs.b);
        }

        @InterfaceC6181ey
        public b d(InterfaceC7583kh1 interfaceC7583kh1, long j) {
            boolean z;
            C9542sf.g(interfaceC7583kh1);
            if ((interfaceC7583kh1 instanceof C8970qJ1) && j == C10323vs.b) {
                z = false;
            } else {
                z = true;
            }
            C9542sf.j(z, "Progressive media source must define an initial placeholder duration.");
            AbstractC5317bO0.a<d> aVar = this.a;
            int i = this.b;
            this.b = i + 1;
            aVar.g(new d(interfaceC7583kh1, i, TD2.j1(j)));
            return this;
        }

        public C7248jJ e() {
            boolean z;
            if (this.b > 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.b(z, "Must add at least one source to the concatenation.");
            if (this.c == null) {
                this.c = C8322nf1.d(Uri.EMPTY);
            }
            return new C7248jJ(this.c, this.a.e());
        }

        @InterfaceC6181ey
        public b f(C8322nf1 c8322nf1) {
            this.c = c8322nf1;
            return this;
        }

        @InterfaceC6181ey
        public b g(InterfaceC7583kh1.a aVar) {
            this.d = (InterfaceC7583kh1.a) C9542sf.g(aVar);
            return this;
        }

        @InterfaceC6181ey
        public b h(Context context) {
            return g(new JZ(context));
        }
    }

    /* renamed from: o.jJ$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC7373jp2 {
        public final C8322nf1 a1;
        public final AbstractC5317bO0<AbstractC7373jp2> b1;
        public final AbstractC5317bO0<Integer> c1;
        public final AbstractC5317bO0<Long> d1;
        public final boolean e1;
        public final boolean f1;
        public final long g1;
        public final long h1;
        @InterfaceC11300zs1
        public final Object i1;

        public c(C8322nf1 c8322nf1, AbstractC5317bO0<AbstractC7373jp2> abstractC5317bO0, AbstractC5317bO0<Integer> abstractC5317bO02, AbstractC5317bO0<Long> abstractC5317bO03, boolean z, boolean z2, long j, long j2, @InterfaceC11300zs1 Object obj) {
            this.a1 = c8322nf1;
            this.b1 = abstractC5317bO0;
            this.c1 = abstractC5317bO02;
            this.d1 = abstractC5317bO03;
            this.e1 = z;
            this.f1 = z2;
            this.g1 = j;
            this.h1 = j2;
            this.i1 = obj;
        }

        private int A(int i) {
            return TD2.k(this.c1, Integer.valueOf(i + 1), false, false);
        }

        @Override // o.AbstractC7373jp2
        public final int g(Object obj) {
            if ((obj instanceof Pair) && (((Pair) obj).first instanceof Integer)) {
                int H0 = C7248jJ.H0(obj);
                int g = this.b1.get(H0).g(C7248jJ.J0(obj));
                if (g == -1) {
                    return -1;
                }
                return this.c1.get(H0).intValue() + g;
            }
            return -1;
        }

        @Override // o.AbstractC7373jp2
        public final AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            int A = A(i);
            this.b1.get(A).l(i - this.c1.get(A).intValue(), bVar, z);
            bVar.Z = 0;
            bVar.Z0 = this.d1.get(i).longValue();
            if (z) {
                bVar.Y = C7248jJ.M0(A, C9542sf.g(bVar.Y));
            }
            return bVar;
        }

        @Override // o.AbstractC7373jp2
        public final AbstractC7373jp2.b m(Object obj, AbstractC7373jp2.b bVar) {
            int H0 = C7248jJ.H0(obj);
            Object J0 = C7248jJ.J0(obj);
            AbstractC7373jp2 abstractC7373jp2 = this.b1.get(H0);
            abstractC7373jp2.m(J0, bVar);
            bVar.Z = 0;
            bVar.Z0 = this.d1.get(this.c1.get(H0).intValue() + abstractC7373jp2.g(J0)).longValue();
            bVar.Y = obj;
            return bVar;
        }

        @Override // o.AbstractC7373jp2
        public int n() {
            return this.d1.size();
        }

        @Override // o.AbstractC7373jp2
        public final Object t(int i) {
            int A = A(i);
            return C7248jJ.M0(A, this.b1.get(A).t(i - this.c1.get(A).intValue()));
        }

        @Override // o.AbstractC7373jp2
        public final AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            return dVar.l(AbstractC7373jp2.d.m1, this.a1, this.i1, C10323vs.b, C10323vs.b, C10323vs.b, this.e1, this.f1, null, this.h1, this.g1, 0, n() - 1, -this.d1.get(0).longValue());
        }

        @Override // o.AbstractC7373jp2
        public int w() {
            return 1;
        }
    }

    /* renamed from: o.jJ$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public final K81 a;
        public final int b;
        public final long c;
        public int d;

        public d(InterfaceC7583kh1 interfaceC7583kh1, int i, long j) {
            this.a = new K81(interfaceC7583kh1, false);
            this.b = i;
            this.c = j;
        }
    }

    public static int H0(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    public static int I0(long j, int i) {
        return (int) (j % i);
    }

    public static Object J0(Object obj) {
        return ((Pair) obj).second;
    }

    public static long K0(long j, int i, int i2) {
        return (j * i) + i2;
    }

    public static Object M0(int i, Object obj) {
        return Pair.create(Integer.valueOf(i), obj);
    }

    public static long O0(long j, int i) {
        return j / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P0(Message message) {
        if (message.what == 0) {
            T0();
            return true;
        }
        return true;
    }

    public final void G0() {
        for (int i = 0; i < this.g1.size(); i++) {
            d dVar = this.g1.get(i);
            if (dVar.d == 0) {
                t0(Integer.valueOf(dVar.b));
            }
        }
    }

    @Override // o.TI
    @InterfaceC11300zs1
    /* renamed from: L0 */
    public InterfaceC7583kh1.b w0(Integer num, InterfaceC7583kh1.b bVar) {
        if (num.intValue() != I0(bVar.d, this.g1.size())) {
            return null;
        }
        return bVar.a(M0(num.intValue(), bVar.a)).b(O0(bVar.d, this.g1.size()));
    }

    @Override // o.TI
    /* renamed from: N0 */
    public int y0(Integer num, int i) {
        return 0;
    }

    @InterfaceC11300zs1
    public final c Q0() {
        Object obj;
        AbstractC7373jp2.b bVar;
        AbstractC5317bO0.a aVar;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        AbstractC7373jp2.d dVar = new AbstractC7373jp2.d();
        AbstractC7373jp2.b bVar2 = new AbstractC7373jp2.b();
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        AbstractC5317bO0.a r2 = AbstractC5317bO0.r();
        AbstractC5317bO0.a r3 = AbstractC5317bO0.r();
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        int i2 = 0;
        Object obj2 = null;
        int i3 = 0;
        long j = 0;
        boolean z7 = false;
        long j2 = 0;
        long j3 = 0;
        boolean z8 = false;
        while (i2 < this.g1.size()) {
            d dVar2 = this.g1.get(i2);
            AbstractC7373jp2 S0 = dVar2.a.S0();
            C9542sf.b(S0.x() ^ z4, "Can't concatenate empty child Timeline.");
            r.g(S0);
            r2.g(Integer.valueOf(i3));
            i3 += S0.n();
            int i4 = 0;
            while (i4 < S0.w()) {
                S0.u(i4, dVar);
                if (!z8) {
                    z8 = z4;
                    obj2 = dVar.Y0;
                }
                if (z5 && TD2.g(obj2, dVar.Y0)) {
                    z5 = z4;
                } else {
                    z5 = false;
                }
                AbstractC7373jp2 abstractC7373jp2 = S0;
                long j4 = dVar.i1;
                if (j4 == C10323vs.b) {
                    j4 = dVar2.c;
                    if (j4 == C10323vs.b) {
                        return null;
                    }
                }
                j2 += j4;
                if (dVar2.b == 0 && i4 == 0) {
                    i = i2;
                    j3 = dVar.h1;
                    j = -dVar.l1;
                } else {
                    i = i2;
                    if (dVar.l1 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C9542sf.b(z2, "Can't concatenate windows. A window has a non-zero offset in a period.");
                }
                if (!dVar.c1 && !dVar.g1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z6 &= z3;
                z7 |= dVar.d1;
                i4++;
                S0 = abstractC7373jp2;
                i2 = i;
                z4 = true;
            }
            AbstractC7373jp2 abstractC7373jp22 = S0;
            int i5 = i2;
            int n = abstractC7373jp22.n();
            int i6 = 0;
            while (i6 < n) {
                r3.g(Long.valueOf(j));
                AbstractC7373jp2 abstractC7373jp23 = abstractC7373jp22;
                abstractC7373jp23.k(i6, bVar2);
                long j5 = bVar2.Y0;
                if (j5 == C10323vs.b) {
                    bVar = bVar2;
                    if (n == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C9542sf.b(z, "Can't concatenate multiple periods with unknown duration in one window.");
                    long j6 = dVar.i1;
                    if (j6 == C10323vs.b) {
                        j6 = dVar2.c;
                    }
                    aVar = r;
                    j5 = j6 + dVar.l1;
                } else {
                    bVar = bVar2;
                    aVar = r;
                }
                j += j5;
                i6++;
                bVar2 = bVar;
                r = aVar;
                abstractC7373jp22 = abstractC7373jp23;
            }
            i2 = i5 + 1;
            z4 = true;
        }
        Object obj3 = obj2;
        C8322nf1 c8322nf1 = this.f1;
        AbstractC5317bO0 e = r.e();
        AbstractC5317bO0 e2 = r2.e();
        AbstractC5317bO0 e3 = r3.e();
        if (z5) {
            obj = obj3;
        } else {
            obj = null;
        }
        return new c(c8322nf1, e, e2, e3, z6, z7, j2, j3, obj);
    }

    @Override // o.TI
    /* renamed from: R0 */
    public void z0(Integer num, InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2) {
        S0();
    }

    @Override // o.InterfaceC7583kh1
    @InterfaceC11300zs1
    public AbstractC7373jp2 S() {
        return Q0();
    }

    public final void S0() {
        if (!this.j1) {
            ((Handler) C9542sf.g(this.i1)).obtainMessage(0).sendToTarget();
            this.j1 = true;
        }
    }

    public final void T0() {
        this.j1 = false;
        c Q0 = Q0();
        if (Q0 != null) {
            p0(Q0);
        }
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        d dVar = this.g1.get(H0(bVar.a));
        InterfaceC7583kh1.b b2 = bVar.a(J0(bVar.a)).b(K0(bVar.d, this.g1.size(), dVar.b));
        v0(Integer.valueOf(dVar.b));
        dVar.d++;
        J81 h = dVar.a.h(b2, interfaceC10877y8, j);
        this.h1.put(h, dVar);
        G0();
        return h;
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.f1;
    }

    @Override // o.TI, o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        super.k0(interfaceC4261Sr2);
        this.i1 = new Handler(new Handler.Callback() { // from class: o.iJ
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean P0;
                P0 = C7248jJ.this.P0(message);
                return P0;
            }
        });
        for (int i = 0; i < this.g1.size(); i++) {
            A0(Integer.valueOf(i), this.g1.get(i).a);
        }
        S0();
    }

    @Override // o.TI, o.AbstractC10541wl
    public void q0() {
        super.q0();
        Handler handler = this.i1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.i1 = null;
        }
        this.j1 = false;
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        d dVar;
        ((d) C9542sf.g(this.h1.remove(interfaceC4410Ug1))).a.s(interfaceC4410Ug1);
        dVar.d--;
        if (!this.h1.isEmpty()) {
            G0();
        }
    }

    public C7248jJ(C8322nf1 c8322nf1, AbstractC5317bO0<d> abstractC5317bO0) {
        this.f1 = c8322nf1;
        this.g1 = abstractC5317bO0;
        this.h1 = new IdentityHashMap<>();
    }

    @Override // o.TI, o.AbstractC10541wl
    public void g0() {
    }
}
