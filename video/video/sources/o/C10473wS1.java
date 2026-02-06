package o;

import androidx.camera.core.f;
import java.util.Objects;
import o.AbstractC2464Al2;
import o.C3679Mt;

/* renamed from: o.wS1 */
/* loaded from: classes.dex */
public class C10473wS1 implements InterfaceC9569sl2 {
    public final AbstractC2464Al2 a;
    public final AbstractC2464Al2.a b;
    public C3679Mt.a<Void> e;
    public C3679Mt.a<Void> f;
    public InterfaceFutureC8411o11<Void> h;
    public boolean g = false;
    public final InterfaceFutureC8411o11<Void> c = C3679Mt.a(new C3679Mt.c() { // from class: o.uS1
        {
            C10473wS1.this = this;
        }

        @Override // o.C3679Mt.c
        public final Object a(C3679Mt.a aVar) {
            return C10473wS1.f(C10473wS1.this, aVar);
        }
    });
    public final InterfaceFutureC8411o11<Void> d = C3679Mt.a(new C3679Mt.c() { // from class: o.vS1
        {
            C10473wS1.this = this;
        }

        @Override // o.C3679Mt.c
        public final Object a(C3679Mt.a aVar) {
            return C10473wS1.g(C10473wS1.this, aVar);
        }
    });

    public C10473wS1(AbstractC2464Al2 abstractC2464Al2, AbstractC2464Al2.a aVar) {
        this.a = abstractC2464Al2;
        this.b = aVar;
    }

    public static /* synthetic */ Object f(C10473wS1 c10473wS1, C3679Mt.a aVar) {
        c10473wS1.e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object g(C10473wS1 c10473wS1, C3679Mt.a aVar) {
        c10473wS1.f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // o.InterfaceC9569sl2
    public void a(f.m mVar) {
        C5901do2.c();
        if (this.g) {
            return;
        }
        k();
        n();
        this.a.s(mVar);
    }

    @Override // o.InterfaceC9569sl2
    public void b(androidx.camera.core.g gVar) {
        C5901do2.c();
        if (this.g) {
            return;
        }
        k();
        n();
        this.a.t(gVar);
    }

    @Override // o.InterfaceC9569sl2
    public void c(DM0 dm0) {
        C5901do2.c();
        if (this.g) {
            return;
        }
        k();
        n();
        o(dm0);
    }

    @Override // o.InterfaceC9569sl2
    public void d() {
        C5901do2.c();
        if (this.g) {
            return;
        }
        this.e.c(null);
    }

    @Override // o.InterfaceC9569sl2
    public void e(DM0 dm0) {
        C5901do2.c();
        if (!this.g) {
            boolean d = this.a.d();
            if (!d) {
                o(dm0);
            }
            n();
            this.e.f(dm0);
            if (d) {
                this.b.a(this.a);
            }
        }
    }

    public final void h(DM0 dm0) {
        C5901do2.c();
        this.g = true;
        InterfaceFutureC8411o11<Void> interfaceFutureC8411o11 = this.h;
        Objects.requireNonNull(interfaceFutureC8411o11);
        interfaceFutureC8411o11.cancel(true);
        this.e.f(dm0);
        this.f.c(null);
    }

    public void i(DM0 dm0) {
        C5901do2.c();
        if (this.d.isDone()) {
            return;
        }
        h(dm0);
        o(dm0);
    }

    @Override // o.InterfaceC9569sl2
    public boolean isAborted() {
        return this.g;
    }

    public void j() {
        C5901do2.c();
        if (this.d.isDone()) {
            return;
        }
        h(new DM0(3, "The request is aborted silently and retried.", null));
        this.b.a(this.a);
    }

    public final void k() {
        C10907yF1.o(this.c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public InterfaceFutureC8411o11<Void> l() {
        C5901do2.c();
        return this.c;
    }

    public InterfaceFutureC8411o11<Void> m() {
        C5901do2.c();
        return this.d;
    }

    public final void n() {
        C10907yF1.o(!this.d.isDone(), "The callback can only complete once.");
        this.f.c(null);
    }

    public final void o(DM0 dm0) {
        C5901do2.c();
        this.a.r(dm0);
    }

    public void p(InterfaceFutureC8411o11<Void> interfaceFutureC8411o11) {
        boolean z;
        C5901do2.c();
        if (this.h == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "CaptureRequestFuture can only be set once.");
        this.h = interfaceFutureC8411o11;
    }
}
