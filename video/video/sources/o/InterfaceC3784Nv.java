package o;

import android.hardware.camera2.CaptureResult;
import o.C2540Bg0;
import o.C3686Mv;

/* renamed from: o.Nv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3784Nv {

    /* renamed from: o.Nv$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3784Nv {
        public static InterfaceC3784Nv j() {
            return new a();
        }

        @Override // o.InterfaceC3784Nv
        public C4133Rk2 a() {
            return C4133Rk2.b();
        }

        @Override // o.InterfaceC3784Nv
        public long c() {
            return -1L;
        }

        @Override // o.InterfaceC3784Nv
        public C3686Mv.e d() {
            return C3686Mv.e.UNKNOWN;
        }

        @Override // o.InterfaceC3784Nv
        public C3686Mv.c f() {
            return C3686Mv.c.UNKNOWN;
        }

        @Override // o.InterfaceC3784Nv
        public C3686Mv.d g() {
            return C3686Mv.d.UNKNOWN;
        }

        @Override // o.InterfaceC3784Nv
        public C3686Mv.b h() {
            return C3686Mv.b.UNKNOWN;
        }

        @Override // o.InterfaceC3784Nv
        public C3686Mv.a i() {
            return C3686Mv.a.UNKNOWN;
        }
    }

    C4133Rk2 a();

    default void b(C2540Bg0.b bVar) {
        bVar.h(d());
    }

    long c();

    C3686Mv.e d();

    default CaptureResult e() {
        return a.j().e();
    }

    C3686Mv.c f();

    C3686Mv.d g();

    C3686Mv.b h();

    C3686Mv.a i();
}
