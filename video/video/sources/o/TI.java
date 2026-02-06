package o;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import o.InterfaceC7583kh1;
import o.InterfaceC8921q70;
import o.InterfaceC9309rh1;

@Deprecated
/* loaded from: classes2.dex */
public abstract class TI<T> extends AbstractC10541wl {
    public final HashMap<T, b<T>> c1 = new HashMap<>();
    @InterfaceC11300zs1
    public Handler d1;
    @InterfaceC11300zs1
    public InterfaceC4261Sr2 e1;

    /* loaded from: classes2.dex */
    public final class a implements InterfaceC9309rh1, InterfaceC8921q70 {
        @HA2
        public final T X;
        public InterfaceC9309rh1.a Y;
        public InterfaceC8921q70.a Z;

        public a(@HA2 T t) {
            this.Y = TI.this.b0(null);
            this.Z = TI.this.Y(null);
            this.X = t;
        }

        public final boolean a(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            InterfaceC7583kh1.b bVar2;
            if (bVar != null) {
                bVar2 = TI.this.w0(this.X, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int y0 = TI.this.y0(this.X, i);
            InterfaceC9309rh1.a aVar = this.Y;
            if (aVar.a != y0 || !TD2.g(aVar.b, bVar2)) {
                this.Y = TI.this.Z(y0, bVar2);
            }
            InterfaceC8921q70.a aVar2 = this.Z;
            if (aVar2.a != y0 || !TD2.g(aVar2.b, bVar2)) {
                this.Z = TI.this.X(y0, bVar2);
                return true;
            }
            return true;
        }

        @Override // o.InterfaceC8921q70
        public void d0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            if (a(i, bVar)) {
                this.Z.h();
            }
        }

        @Override // o.InterfaceC8921q70
        public void e(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            if (a(i, bVar)) {
                this.Z.i();
            }
        }

        @Override // o.InterfaceC9309rh1
        public void f0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
            if (a(i, bVar)) {
                this.Y.u(n11, h(c10519wf1));
            }
        }

        public final C10519wf1 h(C10519wf1 c10519wf1) {
            long x0 = TI.this.x0(this.X, c10519wf1.f);
            long x02 = TI.this.x0(this.X, c10519wf1.g);
            if (x0 == c10519wf1.f && x02 == c10519wf1.g) {
                return c10519wf1;
            }
            return new C10519wf1(c10519wf1.a, c10519wf1.b, c10519wf1.c, c10519wf1.d, c10519wf1.e, x0, x02);
        }

        @Override // o.InterfaceC9309rh1
        public void h0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1, IOException iOException, boolean z) {
            if (a(i, bVar)) {
                this.Y.r(n11, h(c10519wf1), iOException, z);
            }
        }

        @Override // o.InterfaceC9309rh1
        public void i(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, C10519wf1 c10519wf1) {
            if (a(i, bVar)) {
                this.Y.x(h(c10519wf1));
            }
        }

        @Override // o.InterfaceC8921q70
        public void l(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, int i2) {
            if (a(i, bVar)) {
                this.Z.k(i2);
            }
        }

        @Override // o.InterfaceC9309rh1
        public void m0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
            if (a(i, bVar)) {
                this.Y.l(n11, h(c10519wf1));
            }
        }

        @Override // o.InterfaceC8921q70
        public void n(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, Exception exc) {
            if (a(i, bVar)) {
                this.Z.l(exc);
            }
        }

        @Override // o.InterfaceC8921q70
        public void n0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            if (a(i, bVar)) {
                this.Z.m();
            }
        }

        @Override // o.InterfaceC9309rh1
        public void p(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, C10519wf1 c10519wf1) {
            if (a(i, bVar)) {
                this.Y.i(h(c10519wf1));
            }
        }

        @Override // o.InterfaceC8921q70
        public void u0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            if (a(i, bVar)) {
                this.Z.j();
            }
        }

        @Override // o.InterfaceC9309rh1
        public void y(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
            if (a(i, bVar)) {
                this.Y.o(n11, h(c10519wf1));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> {
        public final InterfaceC7583kh1 a;
        public final InterfaceC7583kh1.c b;
        public final TI<T>.a c;

        public b(InterfaceC7583kh1 interfaceC7583kh1, InterfaceC7583kh1.c cVar, TI<T>.a aVar) {
            this.a = interfaceC7583kh1;
            this.b = cVar;
            this.c = aVar;
        }
    }

    public final void A0(@HA2 final T t, InterfaceC7583kh1 interfaceC7583kh1) {
        C9542sf.a(!this.c1.containsKey(t));
        InterfaceC7583kh1.c cVar = new InterfaceC7583kh1.c() { // from class: o.SI
            @Override // o.InterfaceC7583kh1.c
            public final void L(InterfaceC7583kh1 interfaceC7583kh12, AbstractC7373jp2 abstractC7373jp2) {
                TI.this.z0(t, interfaceC7583kh12, abstractC7373jp2);
            }
        };
        a aVar = new a(t);
        this.c1.put(t, new b<>(interfaceC7583kh1, cVar, aVar));
        interfaceC7583kh1.V((Handler) C9542sf.g(this.d1), aVar);
        interfaceC7583kh1.m((Handler) C9542sf.g(this.d1), aVar);
        interfaceC7583kh1.G(cVar, this.e1, i0());
        if (!j0()) {
            interfaceC7583kh1.T(cVar);
        }
    }

    public final void B0(@HA2 T t) {
        b bVar = (b) C9542sf.g(this.c1.remove(t));
        bVar.a.u(bVar.b);
        bVar.a.U(bVar.c);
        bVar.a.o(bVar.c);
    }

    @Override // o.InterfaceC7583kh1
    @InterfaceC2591Bt
    public void Q() throws IOException {
        for (b<T> bVar : this.c1.values()) {
            bVar.a.Q();
        }
    }

    @Override // o.AbstractC10541wl
    @InterfaceC2591Bt
    public void e0() {
        for (b<T> bVar : this.c1.values()) {
            bVar.a.T(bVar.b);
        }
    }

    @Override // o.AbstractC10541wl
    @InterfaceC2591Bt
    public void g0() {
        for (b<T> bVar : this.c1.values()) {
            bVar.a.A(bVar.b);
        }
    }

    @Override // o.AbstractC10541wl
    @InterfaceC2591Bt
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        this.e1 = interfaceC4261Sr2;
        this.d1 = TD2.C();
    }

    @Override // o.AbstractC10541wl
    @InterfaceC2591Bt
    public void q0() {
        for (b<T> bVar : this.c1.values()) {
            bVar.a.u(bVar.b);
            bVar.a.U(bVar.c);
            bVar.a.o(bVar.c);
        }
        this.c1.clear();
    }

    public final void t0(@HA2 T t) {
        b bVar = (b) C9542sf.g(this.c1.get(t));
        bVar.a.T(bVar.b);
    }

    public final void v0(@HA2 T t) {
        b bVar = (b) C9542sf.g(this.c1.get(t));
        bVar.a.A(bVar.b);
    }

    public abstract void z0(@HA2 T t, InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2);

    @InterfaceC11300zs1
    public InterfaceC7583kh1.b w0(@HA2 T t, InterfaceC7583kh1.b bVar) {
        return bVar;
    }

    public long x0(@HA2 T t, long j) {
        return j;
    }

    public int y0(@HA2 T t, int i) {
        return i;
    }
}
