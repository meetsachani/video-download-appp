package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import o.C3051Gi2;
import o.C3679Mt;
import o.C6618gi2;
import o.D10;

/* renamed from: o.gi2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6618gi2 {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final AbstractC4008Qd2 g;
    public int h;
    public int i;
    public C8335ni2 j;
    public C3051Gi2 l;
    public a m;
    public boolean k = false;
    public final Set<Runnable> n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    public boolean f752o = false;

    /* renamed from: o.gi2$a */
    /* loaded from: classes.dex */
    public static class a extends D10 {
        public final InterfaceFutureC8411o11<Surface> p;
        public C3679Mt.a<Surface> q;
        public D10 r;

        public a(Size size, int i) {
            super(size, i);
            this.p = C3679Mt.a(new C3679Mt.c() { // from class: o.fi2
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C6618gi2.a.r(C6618gi2.a.this, aVar);
                }
            });
        }

        public static /* synthetic */ Object r(a aVar, C3679Mt.a aVar2) {
            aVar.q = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // o.D10
        public InterfaceFutureC8411o11<Surface> p() {
            return this.p;
        }

        public boolean s() {
            C5901do2.c();
            if (this.r == null && !n()) {
                return true;
            }
            return false;
        }

        public boolean t() {
            if (this.r != null) {
                return true;
            }
            return false;
        }

        public boolean u(final D10 d10, Runnable runnable) throws D10.a {
            boolean z;
            C5901do2.c();
            C10907yF1.l(d10);
            D10 d102 = this.r;
            boolean z2 = false;
            if (d102 == d10) {
                return false;
            }
            if (d102 == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            C10907yF1.b(h().equals(d10.h()), "The provider's size must match the parent");
            if (i() == d10.i()) {
                z2 = true;
            }
            C10907yF1.b(z2, "The provider's format must match the parent");
            C10907yF1.o(!n(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.r = d10;
            C7221jC0.j(d10.j(), this.q);
            d10.m();
            k().h4(new Runnable() { // from class: o.ei2
                @Override // java.lang.Runnable
                public final void run() {
                    D10.this.e();
                }
            }, C5211ay.b());
            d10.f().h4(runnable, C5211ay.f());
            return true;
        }
    }

    public C6618gi2(int i, int i2, AbstractC4008Qd2 abstractC4008Qd2, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = abstractC4008Qd2;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.m = new a(abstractC4008Qd2.e(), i2);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 a(C6618gi2 c6618gi2, final a aVar, int i, Size size, Rect rect, int i2, boolean z, InterfaceC7402jx interfaceC7402jx, Surface surface) {
        c6618gi2.getClass();
        C10907yF1.l(surface);
        try {
            aVar.m();
            C8335ni2 c8335ni2 = new C8335ni2(surface, c6618gi2.v(), i, c6618gi2.g.e(), size, rect, i2, z, interfaceC7402jx, c6618gi2.b);
            c8335ni2.j().h4(new Runnable() { // from class: o.di2
                @Override // java.lang.Runnable
                public final void run() {
                    C6618gi2.a.this.e();
                }
            }, C5211ay.b());
            c6618gi2.j = c8335ni2;
            return C7221jC0.h(c8335ni2);
        } catch (D10.a e) {
            return C7221jC0.f(e);
        }
    }

    public static /* synthetic */ void b(final C6618gi2 c6618gi2) {
        c6618gi2.getClass();
        C5211ay.f().execute(new Runnable() { // from class: o.bi2
            @Override // java.lang.Runnable
            public final void run() {
                C6618gi2.c(C6618gi2.this);
            }
        });
    }

    public static /* synthetic */ void c(C6618gi2 c6618gi2) {
        if (!c6618gi2.f752o) {
            c6618gi2.y();
        }
    }

    public static /* synthetic */ void d(C6618gi2 c6618gi2, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (c6618gi2.i != i) {
            c6618gi2.i = i;
            z = true;
        } else {
            z = false;
        }
        if (c6618gi2.h != i2) {
            c6618gi2.h = i2;
        } else {
            z2 = z;
        }
        if (z2) {
            c6618gi2.A();
        }
    }

    public final void A() {
        C5901do2.c();
        C3051Gi2 c3051Gi2 = this.l;
        if (c3051Gi2 != null) {
            c3051Gi2.v(C3051Gi2.h.g(this.d, this.i, this.h, w(), this.b, this.e));
        }
    }

    public void B(D10 d10) throws D10.a {
        C5901do2.c();
        h();
        this.m.u(d10, new RunnableC4803Yh2(this));
    }

    public void C(int i) {
        D(i, -1);
    }

    public void D(final int i, final int i2) {
        C5901do2.g(new Runnable() { // from class: o.ai2
            @Override // java.lang.Runnable
            public final void run() {
                C6618gi2.d(C6618gi2.this, i, i2);
            }
        });
    }

    public void f(Runnable runnable) {
        C5901do2.c();
        h();
        this.n.add(runnable);
    }

    public final void g() {
        C10907yF1.o(!this.k, "Consumer can only be linked once.");
        this.k = true;
    }

    public final void h() {
        C10907yF1.o(!this.f752o, "Edge is already closed.");
    }

    public final void i() {
        C5901do2.c();
        m();
        this.f752o = true;
    }

    public InterfaceFutureC8411o11<InterfaceC7588ki2> j(final Size size, final int i, final Rect rect, final int i2, final boolean z, final InterfaceC7402jx interfaceC7402jx) {
        C5901do2.c();
        h();
        g();
        final a aVar = this.m;
        return C7221jC0.o(aVar.j(), new InterfaceC2829Ef() { // from class: o.ci2
            @Override // o.InterfaceC2829Ef
            public final InterfaceFutureC8411o11 apply(Object obj) {
                return C6618gi2.a(C6618gi2.this, aVar, i, size, rect, i2, z, interfaceC7402jx, (Surface) obj);
            }
        }, C5211ay.f());
    }

    public C3051Gi2 k(InterfaceC7402jx interfaceC7402jx) {
        C5901do2.c();
        h();
        C3051Gi2 c3051Gi2 = new C3051Gi2(this.g.e(), interfaceC7402jx, this.g.b(), this.g.c(), new Runnable() { // from class: o.Xh2
            @Override // java.lang.Runnable
            public final void run() {
                C6618gi2.b(C6618gi2.this);
            }
        });
        try {
            final D10 m = c3051Gi2.m();
            if (this.m.u(m, new RunnableC4803Yh2(this))) {
                InterfaceFutureC8411o11<Void> k = this.m.k();
                Objects.requireNonNull(m);
                k.h4(new Runnable() { // from class: o.Zh2
                    @Override // java.lang.Runnable
                    public final void run() {
                        D10.this.d();
                    }
                }, C5211ay.b());
            }
            this.l = c3051Gi2;
            A();
            return c3051Gi2;
        } catch (RuntimeException e) {
            c3051Gi2.w();
            throw e;
        } catch (D10.a e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        }
    }

    public final void l() {
        C5901do2.c();
        h();
        m();
    }

    public final void m() {
        C5901do2.c();
        this.m.d();
        C8335ni2 c8335ni2 = this.j;
        if (c8335ni2 != null) {
            c8335ni2.o();
            this.j = null;
        }
    }

    public Rect n() {
        return this.d;
    }

    public D10 o() {
        C5901do2.c();
        h();
        g();
        return this.m;
    }

    public D10 p() {
        return this.m;
    }

    public int q() {
        return this.a;
    }

    public boolean r() {
        return this.e;
    }

    public int s() {
        return this.i;
    }

    public Matrix t() {
        return this.b;
    }

    public AbstractC4008Qd2 u() {
        return this.g;
    }

    public int v() {
        return this.f;
    }

    public boolean w() {
        return this.c;
    }

    public boolean x() {
        return this.m.t();
    }

    public void y() {
        C5901do2.c();
        h();
        if (!this.m.s()) {
            m();
            this.k = false;
            this.m = new a(this.g.e(), this.a);
            for (Runnable runnable : this.n) {
                runnable.run();
            }
        }
    }

    public boolean z() {
        return this.f752o;
    }
}
