package o;

import android.util.Size;
import androidx.camera.core.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.C3597Ly;
import o.C4281Sy;
import o.T12;

/* renamed from: o.fN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6283fN0 {
    public static final byte g = 100;
    public static final byte h = 95;
    public static final C3139Hg0 i = new C3139Hg0();
    public final BM0 a;
    public final C3597Ly b;
    public final C4281Sy c;
    public final C7207j82 d;
    public final C9701tI1 e;
    public final C4281Sy.b f;

    public C6283fN0(BM0 bm0, Size size) {
        this(bm0, size, null, false);
    }

    public void a() {
        C5901do2.c();
        this.c.g();
        this.d.g();
        this.e.g();
    }

    public final C2702Cx b(InterfaceC3108Gy interfaceC3108Gy, AbstractC2464Al2 abstractC2464Al2, InterfaceC9569sl2 interfaceC9569sl2) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(interfaceC3108Gy.hashCode());
        List<InterfaceC6185ez> a = interfaceC3108Gy.a();
        Objects.requireNonNull(a);
        for (InterfaceC6185ez interfaceC6185ez : a) {
            C3597Ly.a aVar = new C3597Ly.a();
            aVar.w(this.b.i());
            aVar.e(this.b.f());
            aVar.a(abstractC2464Al2.o());
            aVar.f(this.f.h());
            if (this.f.d() == 256) {
                if (i.a()) {
                    aVar.d(C3597Ly.j, Integer.valueOf(abstractC2464Al2.m()));
                }
                aVar.d(C3597Ly.k, Integer.valueOf(h(abstractC2464Al2)));
            }
            aVar.e(interfaceC6185ez.a().f());
            aVar.g(valueOf, Integer.valueOf(interfaceC6185ez.getId()));
            aVar.c(this.f.a());
            arrayList.add(aVar.h());
        }
        return new C2702Cx(arrayList, interfaceC9569sl2);
    }

    public final InterfaceC3108Gy c() {
        InterfaceC3108Gy u0 = this.a.u0(C3206Hy.c());
        Objects.requireNonNull(u0);
        return u0;
    }

    public final C9944uI1 d(InterfaceC3108Gy interfaceC3108Gy, AbstractC2464Al2 abstractC2464Al2, InterfaceC9569sl2 interfaceC9569sl2, InterfaceFutureC8411o11<Void> interfaceFutureC8411o11) {
        return new C9944uI1(interfaceC3108Gy, abstractC2464Al2.k(), abstractC2464Al2.g(), abstractC2464Al2.m(), abstractC2464Al2.i(), abstractC2464Al2.n(), interfaceC9569sl2, interfaceFutureC8411o11);
    }

    public C4377Tx1<C2702Cx, C9944uI1> e(AbstractC2464Al2 abstractC2464Al2, InterfaceC9569sl2 interfaceC9569sl2, InterfaceFutureC8411o11<Void> interfaceFutureC8411o11) {
        C5901do2.c();
        InterfaceC3108Gy c = c();
        return new C4377Tx1<>(b(c, abstractC2464Al2, interfaceC9569sl2), d(c, abstractC2464Al2, interfaceC9569sl2, interfaceFutureC8411o11));
    }

    public T12.b f(Size size) {
        T12.b s = T12.b.s(this.a, size);
        s.i(this.f.h());
        return s;
    }

    public boolean g() {
        return this.c.h().j() instanceof androidx.camera.core.j;
    }

    public int h(AbstractC2464Al2 abstractC2464Al2) {
        boolean z;
        if (abstractC2464Al2.j() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean g2 = C5433bs2.g(abstractC2464Al2.g(), this.f.g());
        if (z && g2) {
            if (abstractC2464Al2.f() == 0) {
                return 100;
            }
            return 95;
        }
        return abstractC2464Al2.i();
    }

    public int i() {
        C5901do2.c();
        return this.c.e();
    }

    public C4281Sy j() {
        return this.c;
    }

    public final int k() {
        Integer num = (Integer) this.a.h(BM0.O, null);
        if (num != null) {
            return num.intValue();
        }
        return 256;
    }

    public C9701tI1 l() {
        return this.e;
    }

    public void m(DM0 dm0) {
        C5901do2.c();
        this.f.b().accept(dm0);
    }

    public void n(b.a aVar) {
        C5901do2.c();
        this.c.n(aVar);
    }

    public void o(C9944uI1 c9944uI1) {
        C5901do2.c();
        this.f.f().accept(c9944uI1);
    }

    public C6283fN0(BM0 bm0, Size size, AbstractC4078Qw abstractC4078Qw, boolean z) {
        C5901do2.c();
        this.a = bm0;
        this.b = C3597Ly.a.j(bm0).h();
        C4281Sy c4281Sy = new C4281Sy();
        this.c = c4281Sy;
        C7207j82 c7207j82 = new C7207j82();
        this.d = c7207j82;
        Executor X = bm0.X(C5211ay.d());
        Objects.requireNonNull(X);
        C9701tI1 c9701tI1 = new C9701tI1(X, abstractC4078Qw != null ? new ES0(abstractC4078Qw) : null);
        this.e = c9701tI1;
        C4281Sy.b j = C4281Sy.b.j(size, bm0.t(), k(), z, bm0.A0());
        this.f = j;
        c9701tI1.a(c7207j82.a(c4281Sy.a(j)));
    }
}
