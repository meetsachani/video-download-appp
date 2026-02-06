package o;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import o.C11306zu;
import o.C2598Bv;
import o.C3679Mt;
import o.C4475Uy;
import o.HJ;
import o.InterfaceC9367rw;

/* renamed from: o.ku  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7633ku {
    public static final String i = "Camera2CameraControl";
    public final C11306zu c;
    public final Executor d;
    public C3679Mt.a<Void> g;
    public boolean a = false;
    public boolean b = false;
    public final Object e = new Object();
    public C2598Bv.a f = new C2598Bv.a();
    public final C11306zu.c h = new C11306zu.c() { // from class: o.hu
        @Override // o.C11306zu.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            return C7633ku.e(C7633ku.this, totalCaptureResult);
        }
    };

    public C7633ku(C11306zu c11306zu, Executor executor) {
        this.c = c11306zu;
        this.d = executor;
    }

    public static /* synthetic */ Object c(final C7633ku c7633ku, final C3679Mt.a aVar) {
        c7633ku.d.execute(new Runnable() { // from class: o.du
            @Override // java.lang.Runnable
            public final void run() {
                C7633ku.this.t(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean e(C7633ku c7633ku, TotalCaptureResult totalCaptureResult) {
        C3679Mt.a<Void> aVar;
        Integer num;
        if (c7633ku.g != null) {
            Object tag = totalCaptureResult.getRequest().getTag();
            if ((tag instanceof C4133Rk2) && (num = (Integer) ((C4133Rk2) tag).d(i)) != null && num.equals(Integer.valueOf(c7633ku.g.hashCode()))) {
                aVar = c7633ku.g;
                c7633ku.g = null;
                if (aVar == null) {
                    aVar.c(null);
                    return false;
                }
                return false;
            }
        }
        aVar = null;
        if (aVar == null) {
        }
    }

    public static /* synthetic */ Object f(final C7633ku c7633ku, final C3679Mt.a aVar) {
        c7633ku.d.execute(new Runnable() { // from class: o.fu
            @Override // java.lang.Runnable
            public final void run() {
                C7633ku.this.t(aVar);
            }
        });
        return "setCaptureRequestOptions";
    }

    public static /* synthetic */ Object h(final C7633ku c7633ku, final C3679Mt.a aVar) {
        c7633ku.d.execute(new Runnable() { // from class: o.ju
            @Override // java.lang.Runnable
            public final void run() {
                C7633ku.this.t(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public static C7633ku m(InterfaceC9367rw interfaceC9367rw) {
        InterfaceC9610sw implementation = ((InterfaceC9610sw) interfaceC9367rw).getImplementation();
        C10907yF1.b(implementation instanceof C11306zu, "CameraControl doesn't contain Camera2 implementation.");
        return ((C11306zu) implementation).F();
    }

    public InterfaceFutureC8411o11<Void> i(C4475Uy c4475Uy) {
        j(c4475Uy);
        return C7221jC0.i(C3679Mt.a(new C3679Mt.c() { // from class: o.cu
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C7633ku.c(C7633ku.this, aVar);
            }
        }));
    }

    public final void j(C4475Uy c4475Uy) {
        synchronized (this.e) {
            try {
                for (HJ.a<?> aVar : c4475Uy.f()) {
                    this.f.e().h0(aVar, c4475Uy.j(aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceFutureC8411o11<Void> k() {
        l();
        return C7221jC0.i(C3679Mt.a(new C3679Mt.c() { // from class: o.iu
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C7633ku.h(C7633ku.this, aVar);
            }
        }));
    }

    public final void l() {
        synchronized (this.e) {
            this.f = new C2598Bv.a();
        }
    }

    public C2598Bv n() {
        C2598Bv build;
        synchronized (this.e) {
            try {
                if (this.g != null) {
                    this.f.e().h0(C2598Bv.S, Integer.valueOf(this.g.hashCode()));
                }
                build = this.f.build();
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public C11306zu.c o() {
        return this.h;
    }

    public C4475Uy p() {
        C4475Uy build;
        synchronized (this.e) {
            build = C4475Uy.a.h(this.f.build()).build();
        }
        return build;
    }

    public void q(final boolean z) {
        this.d.execute(new Runnable() { // from class: o.eu
            @Override // java.lang.Runnable
            public final void run() {
                C7633ku.this.r(z);
            }
        });
    }

    public final void r(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (z) {
                if (this.b) {
                    u();
                    return;
                }
                return;
            }
            C3679Mt.a<Void> aVar = this.g;
            if (aVar != null) {
                aVar.f(new InterfaceC9367rw.a("The camera control has became inactive."));
                this.g = null;
            }
        }
    }

    public InterfaceFutureC8411o11<Void> s(C4475Uy c4475Uy) {
        l();
        j(c4475Uy);
        return C7221jC0.i(C3679Mt.a(new C3679Mt.c() { // from class: o.gu
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C7633ku.f(C7633ku.this, aVar);
            }
        }));
    }

    public final void t(C3679Mt.a<Void> aVar) {
        this.b = true;
        C3679Mt.a<Void> aVar2 = this.g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.g = aVar;
        if (this.a) {
            u();
        }
        if (aVar2 != null) {
            aVar2.f(new InterfaceC9367rw.a("Camera2CameraControl was updated with new options."));
        }
    }

    public final void u() {
        this.c.h0();
        this.b = false;
    }
}
