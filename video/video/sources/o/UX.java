package o;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import o.AbstractC6044eO0;
import o.AbstractC7373jp2;
import o.C9876u11;
import o.HD1;
import o.InterfaceC7583kh1;
import o.J8;

@Deprecated
/* loaded from: classes2.dex */
public class UX implements F8 {
    public final LD X;
    public final AbstractC7373jp2.b Y;
    public final a Y0;
    public final AbstractC7373jp2.d Z;
    public final SparseArray<J8.b> Z0;
    public C9876u11<J8> a1;
    public HD1 b1;
    public InterfaceC5285bG0 c1;
    public boolean d1;

    /* loaded from: classes2.dex */
    public static final class a {
        public final AbstractC7373jp2.b a;
        public AbstractC5317bO0<InterfaceC7583kh1.b> b = AbstractC5317bO0.L();
        public AbstractC6044eO0<InterfaceC7583kh1.b, AbstractC7373jp2> c = AbstractC6044eO0.u();
        @InterfaceC11300zs1
        public InterfaceC7583kh1.b d;
        public InterfaceC7583kh1.b e;
        public InterfaceC7583kh1.b f;

        public a(AbstractC7373jp2.b bVar) {
            this.a = bVar;
        }

        @InterfaceC11300zs1
        public static InterfaceC7583kh1.b c(HD1 hd1, AbstractC5317bO0<InterfaceC7583kh1.b> abstractC5317bO0, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, AbstractC7373jp2.b bVar2) {
            Object t;
            int i;
            AbstractC7373jp2 e1 = hd1.e1();
            int C1 = hd1.C1();
            if (e1.x()) {
                t = null;
            } else {
                t = e1.t(C1);
            }
            if (!hd1.O() && !e1.x()) {
                i = e1.k(C1, bVar2).h(TD2.j1(hd1.getCurrentPosition()) - bVar2.t());
            } else {
                i = -1;
            }
            int i2 = i;
            for (int i3 = 0; i3 < abstractC5317bO0.size(); i3++) {
                InterfaceC7583kh1.b bVar3 = abstractC5317bO0.get(i3);
                if (i(bVar3, t, hd1.O(), hd1.R0(), hd1.G1(), i2)) {
                    return bVar3;
                }
            }
            if (!abstractC5317bO0.isEmpty() || bVar == null || !i(bVar, t, hd1.O(), hd1.R0(), hd1.G1(), i2)) {
                return null;
            }
            return bVar;
        }

        public static boolean i(InterfaceC7583kh1.b bVar, @InterfaceC11300zs1 Object obj, boolean z, int i, int i2, int i3) {
            if (!bVar.a.equals(obj)) {
                return false;
            }
            if (!z || bVar.b != i || bVar.c != i2) {
                if (z || bVar.b != -1 || bVar.e != i3) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public final void b(AbstractC6044eO0.b<InterfaceC7583kh1.b, AbstractC7373jp2> bVar, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar2, AbstractC7373jp2 abstractC7373jp2) {
            if (bVar2 != null) {
                if (abstractC7373jp2.g(bVar2.a) != -1) {
                    bVar.i(bVar2, abstractC7373jp2);
                    return;
                }
                AbstractC7373jp2 abstractC7373jp22 = this.c.get(bVar2);
                if (abstractC7373jp22 != null) {
                    bVar.i(bVar2, abstractC7373jp22);
                }
            }
        }

        @InterfaceC11300zs1
        public InterfaceC7583kh1.b d() {
            return this.d;
        }

        @InterfaceC11300zs1
        public InterfaceC7583kh1.b e() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (InterfaceC7583kh1.b) C5098aU0.w(this.b);
        }

        @InterfaceC11300zs1
        public AbstractC7373jp2 f(InterfaceC7583kh1.b bVar) {
            return this.c.get(bVar);
        }

        @InterfaceC11300zs1
        public InterfaceC7583kh1.b g() {
            return this.e;
        }

        @InterfaceC11300zs1
        public InterfaceC7583kh1.b h() {
            return this.f;
        }

        public void j(HD1 hd1) {
            this.d = c(hd1, this.b, this.e, this.a);
        }

        public void k(List<InterfaceC7583kh1.b> list, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, HD1 hd1) {
            this.b = AbstractC5317bO0.F(list);
            if (!list.isEmpty()) {
                this.e = list.get(0);
                this.f = (InterfaceC7583kh1.b) C9542sf.g(bVar);
            }
            if (this.d == null) {
                this.d = c(hd1, this.b, this.e, this.a);
            }
            m(hd1.e1());
        }

        public void l(HD1 hd1) {
            this.d = c(hd1, this.b, this.e, this.a);
            m(hd1.e1());
        }

        public final void m(AbstractC7373jp2 abstractC7373jp2) {
            AbstractC6044eO0.b<InterfaceC7583kh1.b, AbstractC7373jp2> b = AbstractC6044eO0.b();
            if (this.b.isEmpty()) {
                b(b, this.e, abstractC7373jp2);
                if (!C2593Bt1.a(this.f, this.e)) {
                    b(b, this.f, abstractC7373jp2);
                }
                if (!C2593Bt1.a(this.d, this.e) && !C2593Bt1.a(this.d, this.f)) {
                    b(b, this.d, abstractC7373jp2);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    b(b, this.b.get(i), abstractC7373jp2);
                }
                if (!this.b.contains(this.d)) {
                    b(b, this.d, abstractC7373jp2);
                }
            }
            this.c = b.d();
        }
    }

    public UX(LD ld) {
        this.X = (LD) C9542sf.g(ld);
        this.a1 = new C9876u11<>(TD2.d0(), ld, new C9876u11.b() { // from class: o.nX
            @Override // o.C9876u11.b
            public final void a(Object obj, C4170Ru0 c4170Ru0) {
                UX.E0((J8) obj, c4170Ru0);
            }
        });
        AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
        this.Y = bVar;
        this.Z = new AbstractC7373jp2.d();
        this.Y0 = new a(bVar);
        this.Z0 = new SparseArray<>();
    }

    public static /* synthetic */ void C1(J8.b bVar, C10833xx0 c10833xx0, C9996uW c9996uW, J8 j8) {
        j8.d0(bVar, c10833xx0);
        j8.t(bVar, c10833xx0, c9996uW);
    }

    public static /* synthetic */ void D1(J8.b bVar, C10833xx0 c10833xx0, C9996uW c9996uW, J8 j8) {
        j8.l0(bVar, c10833xx0);
        j8.w(bVar, c10833xx0, c9996uW);
    }

    public static /* synthetic */ void E0(J8 j8, C4170Ru0 c4170Ru0) {
    }

    public static /* synthetic */ void I1(J8.b bVar, int i, HD1.k kVar, HD1.k kVar2, J8 j8) {
        j8.X(bVar, i);
        j8.P(bVar, kVar, kVar2, i);
    }

    public static /* synthetic */ void K1(J8.b bVar, String str, long j, long j2, J8 j8) {
        j8.F(bVar, str, j);
        j8.I(bVar, str, j2, j);
    }

    public static /* synthetic */ void L1(J8.b bVar, String str, long j, long j2, J8 j8) {
        j8.Y(bVar, str, j);
        j8.Z(bVar, str, j2, j);
    }

    public static /* synthetic */ void V0(J8.b bVar, int i, J8 j8) {
        j8.S(bVar);
        j8.p(bVar, i);
    }

    public static /* synthetic */ void a1(J8.b bVar, PG2 pg2, J8 j8) {
        j8.w0(bVar, pg2);
        j8.k0(bVar, pg2.X, pg2.Y, pg2.Z, pg2.Y0);
    }

    public static /* synthetic */ void h1(J8.b bVar, boolean z, J8 j8) {
        j8.i(bVar, z);
        j8.U(bVar, z);
    }

    @Override // o.HD1.g
    public final void A(final DD1 dd1) {
        final J8.b O1 = O1();
        X1(O1, 12, new C9876u11.a() { // from class: o.RW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).n0(J8.b.this, dd1);
            }
        });
    }

    @Override // o.F8
    public final void B(final C10833xx0 c10833xx0, @InterfaceC11300zs1 final C9996uW c9996uW) {
        final J8.b U1 = U1();
        X1(U1, 1017, new C9876u11.a() { // from class: o.hX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                UX.D1(J8.b.this, c10833xx0, c9996uW, (J8) obj);
            }
        });
    }

    @Override // o.F8
    public final void C(final int i, final long j) {
        final J8.b T1 = T1();
        X1(T1, 1018, new C9876u11.a() { // from class: o.xX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).T(J8.b.this, i, j);
            }
        });
    }

    @Override // o.F8
    public final void D(final C10833xx0 c10833xx0, @InterfaceC11300zs1 final C9996uW c9996uW) {
        final J8.b U1 = U1();
        X1(U1, 1009, new C9876u11.a() { // from class: o.MW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                UX.C1(J8.b.this, c10833xx0, c9996uW, (J8) obj);
            }
        });
    }

    @Override // o.F8
    public final void E(final C8775pW c8775pW) {
        final J8.b T1 = T1();
        X1(T1, 1020, new C9876u11.a() { // from class: o.vX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).D(J8.b.this, c8775pW);
            }
        });
    }

    @Override // o.F8
    public final void F(final Object obj, final long j) {
        final J8.b U1 = U1();
        X1(U1, 26, new C9876u11.a() { // from class: o.FW
            @Override // o.C9876u11.a
            public final void invoke(Object obj2) {
                ((J8) obj2).E(J8.b.this, obj, j);
            }
        });
    }

    @Override // o.HD1.g
    public void G(final C8274nS c8274nS) {
        final J8.b O1 = O1();
        X1(O1, 27, new C9876u11.a() { // from class: o.fX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).B(J8.b.this, c8274nS);
            }
        });
    }

    @Override // o.F8
    public final void H(final Exception exc) {
        final J8.b U1 = U1();
        X1(U1, J8.i0, new C9876u11.a() { // from class: o.KW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).K(J8.b.this, exc);
            }
        });
    }

    @Override // o.F8
    public final void I(final int i, final long j, final long j2) {
        final J8.b U1 = U1();
        X1(U1, 1011, new C9876u11.a() { // from class: o.NW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).p0(J8.b.this, i, j, j2);
            }
        });
    }

    @Override // o.F8
    public final void J(final long j, final int i) {
        final J8.b T1 = T1();
        X1(T1, 1021, new C9876u11.a() { // from class: o.BX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).Q(J8.b.this, j, i);
            }
        });
    }

    @Override // o.HD1.g
    public final void K(final int i) {
        final J8.b O1 = O1();
        X1(O1, 6, new C9876u11.a() { // from class: o.zX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).h(J8.b.this, i);
            }
        });
    }

    @Override // o.HD1.g
    public void M(final C3773Nr2 c3773Nr2) {
        final J8.b O1 = O1();
        X1(O1, 2, new C9876u11.a() { // from class: o.wX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).u0(J8.b.this, c3773Nr2);
            }
        });
    }

    @Override // o.HD1.g
    public final void N(final int i) {
        final J8.b U1 = U1();
        X1(U1, 21, new C9876u11.a() { // from class: o.VW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).o(J8.b.this, i);
            }
        });
    }

    @Override // o.HD1.g
    public final void O(final int i) {
        final J8.b O1 = O1();
        X1(O1, 4, new C9876u11.a() { // from class: o.jX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).v(J8.b.this, i);
            }
        });
    }

    public final J8.b O1() {
        return P1(this.Y0.d());
    }

    @Override // o.F8
    public final void P() {
        if (!this.d1) {
            final J8.b O1 = O1();
            this.d1 = true;
            X1(O1, -1, new C9876u11.a() { // from class: o.UW
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((J8) obj).b0(J8.b.this);
                }
            });
        }
    }

    public final J8.b P1(@InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        AbstractC7373jp2 f;
        C9542sf.g(this.b1);
        if (bVar == null) {
            f = null;
        } else {
            f = this.Y0.f(bVar);
        }
        if (bVar != null && f != null) {
            return Q1(f, f.m(bVar.a, this.Y).Z, bVar);
        }
        int c2 = this.b1.c2();
        AbstractC7373jp2 e1 = this.b1.e1();
        if (c2 >= e1.w()) {
            e1 = AbstractC7373jp2.X;
        }
        return Q1(e1, c2, null);
    }

    @Override // o.HD1.g
    public final void Q(final boolean z) {
        final J8.b O1 = O1();
        X1(O1, 9, new C9876u11.a() { // from class: o.LW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).u(J8.b.this, z);
            }
        });
    }

    @HS1({"player"})
    public final J8.b Q1(AbstractC7373jp2 abstractC7373jp2, int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        InterfaceC7583kh1.b bVar2;
        boolean z;
        if (abstractC7373jp2.x()) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        long b = this.X.b();
        if (abstractC7373jp2.equals(this.b1.e1()) && i == this.b1.c2()) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (bVar2 != null && bVar2.c()) {
            if (z && this.b1.R0() == bVar2.b && this.b1.G1() == bVar2.c) {
                j = this.b1.getCurrentPosition();
            }
        } else if (z) {
            j = this.b1.P1();
        } else if (!abstractC7373jp2.x()) {
            j = abstractC7373jp2.u(i, this.Z).d();
        }
        return new J8.b(b, abstractC7373jp2, i, bVar2, j, this.b1.e1(), this.b1.c2(), this.Y0.d(), this.b1.getCurrentPosition(), this.b1.R());
    }

    @Override // o.HD1.g
    public final void R(final HD1.k kVar, final HD1.k kVar2, final int i) {
        if (i == 1) {
            this.d1 = false;
        }
        this.Y0.j((HD1) C9542sf.g(this.b1));
        final J8.b O1 = O1();
        X1(O1, 11, new C9876u11.a() { // from class: o.EX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                UX.I1(J8.b.this, i, kVar, kVar2, (J8) obj);
            }
        });
    }

    public final J8.b R1() {
        return P1(this.Y0.e());
    }

    @Override // o.HD1.g
    public final void S(final AD1 ad1) {
        final J8.b V1 = V1(ad1);
        X1(V1, 10, new C9876u11.a() { // from class: o.dX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).e(J8.b.this, ad1);
            }
        });
    }

    public final J8.b S1(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        C9542sf.g(this.b1);
        if (bVar != null) {
            if (this.Y0.f(bVar) != null) {
                return P1(bVar);
            }
            return Q1(AbstractC7373jp2.X, i, bVar);
        }
        AbstractC7373jp2 e1 = this.b1.e1();
        if (i >= e1.w()) {
            e1 = AbstractC7373jp2.X;
        }
        return Q1(e1, i, null);
    }

    @Override // o.HD1.g
    public final void T(AbstractC7373jp2 abstractC7373jp2, final int i) {
        this.Y0.l((HD1) C9542sf.g(this.b1));
        final J8.b O1 = O1();
        X1(O1, 0, new C9876u11.a() { // from class: o.HX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).t0(J8.b.this, i);
            }
        });
    }

    public final J8.b T1() {
        return P1(this.Y0.g());
    }

    @Override // o.HD1.g
    public void U(final int i, final boolean z) {
        final J8.b O1 = O1();
        X1(O1, 30, new C9876u11.a() { // from class: o.MX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).o0(J8.b.this, i, z);
            }
        });
    }

    public final J8.b U1() {
        return P1(this.Y0.h());
    }

    @Override // o.HD1.g
    public void V(final long j) {
        final J8.b O1 = O1();
        X1(O1, 16, new C9876u11.a() { // from class: o.EW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).A0(J8.b.this, j);
            }
        });
    }

    public final J8.b V1(@InterfaceC11300zs1 AD1 ad1) {
        C4604Wg1 c4604Wg1;
        if ((ad1 instanceof C3824Og0) && (c4604Wg1 = ((C3824Og0) ad1).U1) != null) {
            return P1(new InterfaceC7583kh1.b(c4604Wg1));
        }
        return O1();
    }

    @Override // o.F8
    @InterfaceC2591Bt
    public void W(J8 j8) {
        this.a1.k(j8);
    }

    public final void W1() {
        final J8.b O1 = O1();
        X1(O1, J8.h0, new C9876u11.a() { // from class: o.aX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).f(J8.b.this);
            }
        });
        this.a1.j();
    }

    @Override // o.HD1.g
    public final void X(final C9546sg c9546sg) {
        final J8.b U1 = U1();
        X1(U1, 20, new C9876u11.a() { // from class: o.IW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).l(J8.b.this, c9546sg);
            }
        });
    }

    public final void X1(J8.b bVar, int i, C9876u11.a<J8> aVar) {
        this.Z0.put(i, bVar);
        this.a1.l(i, aVar);
    }

    @Override // o.HD1.g
    public void Y(final C11005yf1 c11005yf1) {
        final J8.b O1 = O1();
        X1(O1, 15, new C9876u11.a() { // from class: o.YW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).j(J8.b.this, c11005yf1);
            }
        });
    }

    @Deprecated
    public void Y1(boolean z) {
        this.a1.m(z);
    }

    @Override // o.HD1.g
    public final void a(final boolean z) {
        final J8.b U1 = U1();
        X1(U1, 23, new C9876u11.a() { // from class: o.GW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).x0(J8.b.this, z);
            }
        });
    }

    @Override // o.HD1.g
    public final void a0(final int i, final int i2) {
        final J8.b U1 = U1();
        X1(U1, 24, new C9876u11.a() { // from class: o.bX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).d(J8.b.this, i, i2);
            }
        });
    }

    @Override // o.F8
    public final void b(final Exception exc) {
        final J8.b U1 = U1();
        X1(U1, 1014, new C9876u11.a() { // from class: o.AX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).f0(J8.b.this, exc);
            }
        });
    }

    @Override // o.HD1.g
    public void b0(final HD1.c cVar) {
        final J8.b O1 = O1();
        X1(O1, 13, new C9876u11.a() { // from class: o.gX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).R(J8.b.this, cVar);
            }
        });
    }

    @Override // o.F8
    public final void c(final String str) {
        final J8.b U1 = U1();
        X1(U1, 1019, new C9876u11.a() { // from class: o.OX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).k(J8.b.this, str);
            }
        });
    }

    @Override // o.F8
    public final void d(final String str, final long j, final long j2) {
        final J8.b U1 = U1();
        X1(U1, 1016, new C9876u11.a() { // from class: o.lX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                UX.L1(J8.b.this, str, j2, j, (J8) obj);
            }
        });
    }

    @Override // o.InterfaceC8921q70
    public final void d0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1023, new C9876u11.a() { // from class: o.mX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).L(J8.b.this);
            }
        });
    }

    @Override // o.InterfaceC8921q70
    public final void e(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, J8.f0, new C9876u11.a() { // from class: o.QX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).h0(J8.b.this);
            }
        });
    }

    @Override // o.F8
    public final void f(final C8775pW c8775pW) {
        final J8.b U1 = U1();
        X1(U1, 1007, new C9876u11.a() { // from class: o.FX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).s(J8.b.this, c8775pW);
            }
        });
    }

    @Override // o.InterfaceC9309rh1
    public final void f0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final N11 n11, final C10519wf1 c10519wf1) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1000, new C9876u11.a() { // from class: o.GX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).c0(J8.b.this, n11, c10519wf1);
            }
        });
    }

    @Override // o.HD1.g
    public final void f1(final int i) {
        final J8.b O1 = O1();
        X1(O1, 8, new C9876u11.a() { // from class: o.rX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).y(J8.b.this, i);
            }
        });
    }

    @Override // o.F8
    @InterfaceC2591Bt
    public void g() {
        ((InterfaceC5285bG0) C9542sf.k(this.c1)).k(new Runnable() { // from class: o.QW
            @Override // java.lang.Runnable
            public final void run() {
                UX.this.W1();
            }
        });
    }

    @Override // o.HD1.g
    public void g0(@InterfaceC11300zs1 final AD1 ad1) {
        final J8.b V1 = V1(ad1);
        X1(V1, 10, new C9876u11.a() { // from class: o.yX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).e0(J8.b.this, ad1);
            }
        });
    }

    @Override // o.InterfaceC3643Mk.a
    public final void h(final int i, final long j, final long j2) {
        final J8.b R1 = R1();
        X1(R1, 1006, new C9876u11.a() { // from class: o.kX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).z0(J8.b.this, i, j, j2);
            }
        });
    }

    @Override // o.InterfaceC9309rh1
    public final void h0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final N11 n11, final C10519wf1 c10519wf1, final IOException iOException, final boolean z) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1003, new C9876u11.a() { // from class: o.cX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).r0(J8.b.this, n11, c10519wf1, iOException, z);
            }
        });
    }

    @Override // o.InterfaceC9309rh1
    public final void i(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final C10519wf1 c10519wf1) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1005, new C9876u11.a() { // from class: o.CX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).z(J8.b.this, c10519wf1);
            }
        });
    }

    @Override // o.HD1.g
    public final void i0(final boolean z) {
        final J8.b O1 = O1();
        X1(O1, 3, new C9876u11.a() { // from class: o.RX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                UX.h1(J8.b.this, z, (J8) obj);
            }
        });
    }

    @Override // o.HD1.g
    public final void j0(final float f) {
        final J8.b U1 = U1();
        X1(U1, 22, new C9876u11.a() { // from class: o.JX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).m0(J8.b.this, f);
            }
        });
    }

    @Override // o.HD1.g
    public void k0(final C2989Fr2 c2989Fr2) {
        final J8.b O1 = O1();
        X1(O1, 19, new C9876u11.a() { // from class: o.oX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).H(J8.b.this, c2989Fr2);
            }
        });
    }

    @Override // o.InterfaceC8921q70
    public final void l(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final int i2) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, J8.b0, new C9876u11.a() { // from class: o.IX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                UX.V0(J8.b.this, i2, (J8) obj);
            }
        });
    }

    @Override // o.F8
    @InterfaceC2591Bt
    public void l0(final HD1 hd1, Looper looper) {
        boolean z;
        if (this.b1 != null && !this.Y0.b.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.i(z);
        this.b1 = (HD1) C9542sf.g(hd1);
        this.c1 = this.X.d(looper, null);
        this.a1 = this.a1.f(looper, new C9876u11.b() { // from class: o.WW
            @Override // o.C9876u11.b
            public final void a(Object obj, C4170Ru0 c4170Ru0) {
                J8 j8 = (J8) obj;
                j8.g0(hd1, new J8.c(c4170Ru0, UX.this.Z0));
            }
        });
    }

    @Override // o.InterfaceC9309rh1
    public final void m0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final N11 n11, final C10519wf1 c10519wf1) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1002, new C9876u11.a() { // from class: o.TX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).v0(J8.b.this, n11, c10519wf1);
            }
        });
    }

    @Override // o.InterfaceC8921q70
    public final void n(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final Exception exc) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1024, new C9876u11.a() { // from class: o.DX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).x(J8.b.this, exc);
            }
        });
    }

    @Override // o.InterfaceC8921q70
    public final void n0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, J8.g0, new C9876u11.a() { // from class: o.tX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).a(J8.b.this);
            }
        });
    }

    @Override // o.F8
    @InterfaceC2591Bt
    public void o0(J8 j8) {
        C9542sf.g(j8);
        this.a1.c(j8);
    }

    @Override // o.InterfaceC9309rh1
    public final void p(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final C10519wf1 c10519wf1) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1004, new C9876u11.a() { // from class: o.XW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).A(J8.b.this, c10519wf1);
            }
        });
    }

    @Override // o.HD1.g
    public void p0(final C11005yf1 c11005yf1) {
        final J8.b O1 = O1();
        X1(O1, 14, new C9876u11.a() { // from class: o.PW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).N(J8.b.this, c11005yf1);
            }
        });
    }

    @Override // o.F8
    public final void q(final String str) {
        final J8.b U1 = U1();
        X1(U1, 1012, new C9876u11.a() { // from class: o.qX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).q(J8.b.this, str);
            }
        });
    }

    @Override // o.HD1.g
    public final void q0(final boolean z, final int i) {
        final J8.b O1 = O1();
        X1(O1, -1, new C9876u11.a() { // from class: o.TW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).J(J8.b.this, z, i);
            }
        });
    }

    @Override // o.F8
    public final void r(final String str, final long j, final long j2) {
        final J8.b U1 = U1();
        X1(U1, 1008, new C9876u11.a() { // from class: o.OW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                UX.K1(J8.b.this, str, j2, j, (J8) obj);
            }
        });
    }

    @Override // o.HD1.g
    public void r0(final Q20 q20) {
        final J8.b O1 = O1();
        X1(O1, 29, new C9876u11.a() { // from class: o.LX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).C(J8.b.this, q20);
            }
        });
    }

    @Override // o.HD1.g
    public final void s(final C4224Si1 c4224Si1) {
        final J8.b O1 = O1();
        X1(O1, 28, new C9876u11.a() { // from class: o.NX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).g(J8.b.this, c4224Si1);
            }
        });
    }

    @Override // o.F8
    public final void s0(List<InterfaceC7583kh1.b> list, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        this.Y0.k(list, bVar, (HD1) C9542sf.g(this.b1));
    }

    @Override // o.HD1.g
    public final void t(final PG2 pg2) {
        final J8.b U1 = U1();
        X1(U1, 25, new C9876u11.a() { // from class: o.SX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                UX.a1(J8.b.this, pg2, (J8) obj);
            }
        });
    }

    @Override // o.HD1.g
    public void t0(final long j) {
        final J8.b O1 = O1();
        X1(O1, 17, new C9876u11.a() { // from class: o.DW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).n(J8.b.this, j);
            }
        });
    }

    @Override // o.HD1.g
    public void u(final List<C7284jS> list) {
        final J8.b O1 = O1();
        X1(O1, 27, new C9876u11.a() { // from class: o.uX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).y0(J8.b.this, list);
            }
        });
    }

    @Override // o.InterfaceC8921q70
    public final void u0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1025, new C9876u11.a() { // from class: o.KX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).W(J8.b.this);
            }
        });
    }

    @Override // o.F8
    public final void v(final long j) {
        final J8.b U1 = U1();
        X1(U1, 1010, new C9876u11.a() { // from class: o.sX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).j0(J8.b.this, j);
            }
        });
    }

    @Override // o.HD1.g
    public void v0(final long j) {
        final J8.b O1 = O1();
        X1(O1, 18, new C9876u11.a() { // from class: o.PX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).O(J8.b.this, j);
            }
        });
    }

    @Override // o.F8
    public final void w(final Exception exc) {
        final J8.b U1 = U1();
        X1(U1, J8.j0, new C9876u11.a() { // from class: o.JW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).c(J8.b.this, exc);
            }
        });
    }

    @Override // o.HD1.g
    public final void w0(final boolean z, final int i) {
        final J8.b O1 = O1();
        X1(O1, 5, new C9876u11.a() { // from class: o.ZW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).b(J8.b.this, z, i);
            }
        });
    }

    @Override // o.F8
    public final void x(final C8775pW c8775pW) {
        final J8.b T1 = T1();
        X1(T1, 1013, new C9876u11.a() { // from class: o.pX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).q0(J8.b.this, c8775pW);
            }
        });
    }

    @Override // o.HD1.g
    public final void x0(@InterfaceC11300zs1 final C8322nf1 c8322nf1, final int i) {
        final J8.b O1 = O1();
        X1(O1, 1, new C9876u11.a() { // from class: o.eX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).M(J8.b.this, c8322nf1, i);
            }
        });
    }

    @Override // o.InterfaceC9309rh1
    public final void y(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final N11 n11, final C10519wf1 c10519wf1) {
        final J8.b S1 = S1(i, bVar);
        X1(S1, 1001, new C9876u11.a() { // from class: o.SW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).G(J8.b.this, n11, c10519wf1);
            }
        });
    }

    @Override // o.HD1.g
    public void y0(final boolean z) {
        final J8.b O1 = O1();
        X1(O1, 7, new C9876u11.a() { // from class: o.HW
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).a0(J8.b.this, z);
            }
        });
    }

    @Override // o.F8
    public final void z(final C8775pW c8775pW) {
        final J8.b U1 = U1();
        X1(U1, 1015, new C9876u11.a() { // from class: o.iX
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((J8) obj).s0(J8.b.this, c8775pW);
            }
        });
    }

    @Override // o.HD1.g
    public void Z() {
    }

    @Override // o.HD1.g
    public void L(boolean z) {
    }

    @Override // o.HD1.g
    public void e0(int i) {
    }

    @Override // o.HD1.g
    public void c0(HD1 hd1, HD1.f fVar) {
    }
}
