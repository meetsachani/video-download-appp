package o;

import android.util.Log;
import androidx.camera.core.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import o.AbstractC2464Al2;

/* renamed from: o.wl2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10544wl2 implements b.a, AbstractC2464Al2.a {
    public static final String g = "TakePictureManager";
    public final CM0 b;
    public C6283fN0 c;
    public C10473wS1 d;
    public final List<C10473wS1> e;
    public final Deque<AbstractC2464Al2> a = new ArrayDeque();
    public boolean f = false;

    /* renamed from: o.wl2$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ C2702Cx a;

        public a(C2702Cx c2702Cx) {
            this.a = c2702Cx;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            if (this.a.b()) {
                return;
            }
            if (th instanceof DM0) {
                C10544wl2.this.c.m((DM0) th);
            } else {
                C10544wl2.this.c.m(new DM0(2, "Failed to submit capture request", th));
            }
            C10544wl2.this.b.c();
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
            C10544wl2.this.b.c();
        }
    }

    public C10544wl2(CM0 cm0) {
        C5901do2.c();
        this.b = cm0;
        this.e = new ArrayList();
    }

    public static /* synthetic */ void c(C10544wl2 c10544wl2) {
        c10544wl2.d = null;
        c10544wl2.i();
    }

    @Override // o.AbstractC2464Al2.a
    public void a(AbstractC2464Al2 abstractC2464Al2) {
        C5901do2.c();
        C7433k41.a(g, "Add a new request for retrying.");
        this.a.addFirst(abstractC2464Al2);
        i();
    }

    @Override // androidx.camera.core.b.a
    public void b(androidx.camera.core.g gVar) {
        C5211ay.f().execute(new Runnable() { // from class: o.vl2
            @Override // java.lang.Runnable
            public final void run() {
                C10544wl2.this.i();
            }
        });
    }

    public void e() {
        C5901do2.c();
        DM0 dm0 = new DM0(3, "Camera is closed.", null);
        for (AbstractC2464Al2 abstractC2464Al2 : this.a) {
            abstractC2464Al2.r(dm0);
        }
        this.a.clear();
        for (C10473wS1 c10473wS1 : new ArrayList(this.e)) {
            c10473wS1.i(dm0);
        }
    }

    public C6283fN0 f() {
        return this.c;
    }

    public List<C10473wS1> g() {
        return this.e;
    }

    public boolean h() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public void i() {
        C5901do2.c();
        Log.d(g, "Issue the next TakePictureRequest.");
        if (h()) {
            Log.d(g, "There is already a request in-flight.");
        } else if (this.f) {
            Log.d(g, "The class is paused.");
        } else if (this.c.i() == 0) {
            Log.d(g, "Too many acquire images. Close image to be able to process next.");
        } else {
            AbstractC2464Al2 poll = this.a.poll();
            if (poll == null) {
                Log.d(g, "No new request.");
                return;
            }
            C10473wS1 c10473wS1 = new C10473wS1(poll, this);
            o(c10473wS1);
            C4377Tx1<C2702Cx, C9944uI1> e = this.c.e(poll, c10473wS1, c10473wS1.l());
            C2702Cx c2702Cx = e.a;
            Objects.requireNonNull(c2702Cx);
            C9944uI1 c9944uI1 = e.b;
            Objects.requireNonNull(c9944uI1);
            this.c.o(c9944uI1);
            c10473wS1.p(n(c2702Cx));
        }
    }

    public void j(AbstractC2464Al2 abstractC2464Al2) {
        C5901do2.c();
        this.a.offer(abstractC2464Al2);
        i();
    }

    public void k() {
        C5901do2.c();
        this.f = true;
        C10473wS1 c10473wS1 = this.d;
        if (c10473wS1 != null) {
            c10473wS1.j();
        }
    }

    public void l() {
        C5901do2.c();
        this.f = false;
        i();
    }

    public void m(C6283fN0 c6283fN0) {
        C5901do2.c();
        this.c = c6283fN0;
        c6283fN0.n(this);
    }

    public final InterfaceFutureC8411o11<Void> n(C2702Cx c2702Cx) {
        C5901do2.c();
        this.b.b();
        InterfaceFutureC8411o11<Void> a2 = this.b.a(c2702Cx.a());
        C7221jC0.b(a2, new a(c2702Cx), C5211ay.f());
        return a2;
    }

    public final void o(final C10473wS1 c10473wS1) {
        C10907yF1.n(!h());
        this.d = c10473wS1;
        c10473wS1.l().h4(new Runnable() { // from class: o.tl2
            @Override // java.lang.Runnable
            public final void run() {
                C10544wl2.c(C10544wl2.this);
            }
        }, C5211ay.b());
        this.e.add(c10473wS1);
        c10473wS1.m().h4(new Runnable() { // from class: o.ul2
            @Override // java.lang.Runnable
            public final void run() {
                C10544wl2.this.e.remove(c10473wS1);
            }
        }, C5211ay.b());
    }
}
