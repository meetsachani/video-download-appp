package androidx.camera.view;

import androidx.camera.view.PreviewView;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC3393Jv;
import o.C3679Mt;
import o.C5211ay;
import o.C7221jC0;
import o.C7364jn1;
import o.C7433k41;
import o.InterfaceC2789Dt1;
import o.InterfaceC2829Ef;
import o.InterfaceC3784Nv;
import o.InterfaceC6420fx;
import o.InterfaceC6490gB0;
import o.InterfaceC6918hx;
import o.InterfaceC7402jx;
import o.InterfaceFutureC8411o11;
import o.XB0;
import o.YB0;

/* loaded from: classes.dex */
public final class a implements InterfaceC2789Dt1.a<InterfaceC7402jx.a> {
    public static final String g = "StreamStateObserver";
    public final InterfaceC6918hx a;
    public final C7364jn1<PreviewView.h> b;
    public PreviewView.h c;
    public final c d;
    public InterfaceFutureC8411o11<Void> e;
    public boolean f = false;

    /* renamed from: androidx.camera.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0016a implements XB0<Void> {
        public final /* synthetic */ List a;
        public final /* synthetic */ InterfaceC6420fx b;

        public C0016a(List list, InterfaceC6420fx interfaceC6420fx) {
            this.a = list;
            this.b = interfaceC6420fx;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            a.this.e = null;
            if (!this.a.isEmpty()) {
                for (AbstractC3393Jv abstractC3393Jv : this.a) {
                    ((InterfaceC6918hx) this.b).d(abstractC3393Jv);
                }
                this.a.clear();
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r2) {
            a.this.e = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AbstractC3393Jv {
        public final /* synthetic */ C3679Mt.a a;
        public final /* synthetic */ InterfaceC6420fx b;

        public b(C3679Mt.a aVar, InterfaceC6420fx interfaceC6420fx) {
            this.a = aVar;
            this.b = interfaceC6420fx;
        }

        @Override // o.AbstractC3393Jv
        public void b(InterfaceC3784Nv interfaceC3784Nv) {
            this.a.c(null);
            ((InterfaceC6918hx) this.b).d(this);
        }
    }

    public a(InterfaceC6918hx interfaceC6918hx, C7364jn1<PreviewView.h> c7364jn1, c cVar) {
        this.a = interfaceC6918hx;
        this.b = c7364jn1;
        this.d = cVar;
        synchronized (this) {
            this.c = c7364jn1.f();
        }
    }

    public static /* synthetic */ Object b(a aVar, InterfaceC6420fx interfaceC6420fx, List list, C3679Mt.a aVar2) {
        aVar.getClass();
        b bVar = new b(aVar2, interfaceC6420fx);
        list.add(bVar);
        ((InterfaceC6918hx) interfaceC6420fx).z(C5211ay.b(), bVar);
        return "waitForCaptureResult";
    }

    public static /* synthetic */ Void d(a aVar, Void r1) {
        aVar.getClass();
        aVar.i(PreviewView.h.STREAMING);
        return null;
    }

    public final void e() {
        InterfaceFutureC8411o11<Void> interfaceFutureC8411o11 = this.e;
        if (interfaceFutureC8411o11 != null) {
            interfaceFutureC8411o11.cancel(false);
            this.e = null;
        }
    }

    public void f() {
        e();
    }

    @Override // o.InterfaceC2789Dt1.a
    /* renamed from: g */
    public void a(InterfaceC7402jx.a aVar) {
        if (aVar != InterfaceC7402jx.a.CLOSING && aVar != InterfaceC7402jx.a.CLOSED && aVar != InterfaceC7402jx.a.RELEASING && aVar != InterfaceC7402jx.a.RELEASED) {
            if ((aVar == InterfaceC7402jx.a.OPENING || aVar == InterfaceC7402jx.a.OPEN || aVar == InterfaceC7402jx.a.PENDING_OPEN) && !this.f) {
                h(this.a);
                this.f = true;
                return;
            }
            return;
        }
        i(PreviewView.h.IDLE);
        if (this.f) {
            this.f = false;
            e();
        }
    }

    public final void h(InterfaceC6420fx interfaceC6420fx) {
        i(PreviewView.h.IDLE);
        ArrayList arrayList = new ArrayList();
        YB0 e = YB0.b(j(interfaceC6420fx, arrayList)).f(new InterfaceC2829Ef() { // from class: o.cH1
            @Override // o.InterfaceC2829Ef
            public final InterfaceFutureC8411o11 apply(Object obj) {
                InterfaceFutureC8411o11 k;
                Void r2 = (Void) obj;
                k = androidx.camera.view.a.this.d.k();
                return k;
            }
        }, C5211ay.b()).e(new InterfaceC6490gB0() { // from class: o.dH1
            @Override // o.InterfaceC6490gB0
            public final Object apply(Object obj) {
                return androidx.camera.view.a.d(androidx.camera.view.a.this, (Void) obj);
            }
        }, C5211ay.b());
        this.e = e;
        C7221jC0.b(e, new C0016a(arrayList, interfaceC6420fx), C5211ay.b());
    }

    public void i(PreviewView.h hVar) {
        synchronized (this) {
            try {
                if (this.c.equals(hVar)) {
                    return;
                }
                this.c = hVar;
                C7433k41.a(g, "Update Preview stream state to " + hVar);
                this.b.o(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceFutureC8411o11<Void> j(final InterfaceC6420fx interfaceC6420fx, final List<AbstractC3393Jv> list) {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.bH1
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return androidx.camera.view.a.b(androidx.camera.view.a.this, interfaceC6420fx, list, aVar);
            }
        });
    }

    @Override // o.InterfaceC2789Dt1.a
    public void onError(Throwable th) {
        f();
        i(PreviewView.h.IDLE);
    }
}
