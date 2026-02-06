package o;

import android.util.Size;
import o.T12;

/* renamed from: o.Ev  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2892Ev implements T12.d {
    public static final C2892Ev a = new C2892Ev();

    @Override // o.T12.d
    public void a(Size size, InterfaceC6743hD2<?> interfaceC6743hD2, T12.b bVar) {
        T12 z = interfaceC6743hD2.z(null);
        HJ s0 = C5932dw1.s0();
        int m = T12.a().m();
        if (z != null) {
            m = z.m();
            bVar.b(z.b());
            bVar.d(z.j());
            bVar.c(z.h());
            s0 = z.e();
        }
        bVar.x(s0);
        if (interfaceC6743hD2 instanceof WG1) {
            ZG1.b(size, bVar);
        }
        C2598Bv c2598Bv = new C2598Bv(interfaceC6743hD2);
        bVar.z(c2598Bv.x0(m));
        bVar.f(c2598Bv.y0(C3884Ow.c()));
        bVar.m(c2598Bv.B0(C6914hw.c()));
        bVar.e(C3402Jy.d(c2598Bv.A0(C6169ev.c())));
        C2569Bn1 u0 = C2569Bn1.u0();
        u0.h0(C2598Bv.R, c2598Bv.u0(C4663Ww.e()));
        u0.h0(C2598Bv.T, c2598Bv.z0(null));
        u0.h0(C2598Bv.N, Long.valueOf(c2598Bv.C0(-1L)));
        bVar.h(u0);
        bVar.h(c2598Bv.v0());
    }
}
