package o;

import o.C3686Mv;
import o.NU1;

/* loaded from: classes.dex */
public final class BO2 extends C3032Ge<androidx.camera.core.g> {
    public BO2(int i, NU1.a<androidx.camera.core.g> aVar) {
        super(i, aVar);
    }

    @Override // o.C3032Ge, o.NU1
    /* renamed from: d */
    public void c(androidx.camera.core.g gVar) {
        if (e(gVar.I4())) {
            super.c(gVar);
        } else {
            this.d.a(gVar);
        }
    }

    public final boolean e(YM0 ym0) {
        InterfaceC3784Nv a = C3978Pv.a(ym0);
        if ((a.f() != C3686Mv.c.LOCKED_FOCUSED && a.f() != C3686Mv.c.PASSIVE_FOCUSED) || a.i() != C3686Mv.a.CONVERGED || a.g() != C3686Mv.d.CONVERGED) {
            return false;
        }
        return true;
    }
}
