package o;

import java.util.concurrent.Executor;

/* renamed from: o.Rd */
/* loaded from: classes.dex */
public class C4102Rd extends AbstractC3846Ol2 {
    public static volatile C4102Rd c;
    public static final Executor d = new Executor() { // from class: o.Pd
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C4102Rd.e(runnable);
        }
    };
    public static final Executor e = new Executor() { // from class: o.Qd
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C4102Rd.f(runnable);
        }
    };
    public AbstractC3846Ol2 a;
    public final AbstractC3846Ol2 b;

    public C4102Rd() {
        W00 w00 = new W00();
        this.b = w00;
        this.a = w00;
    }

    public static /* synthetic */ void e(Runnable runnable) {
        h().d(runnable);
    }

    public static /* synthetic */ void f(Runnable runnable) {
        h().a(runnable);
    }

    public static Executor g() {
        return e;
    }

    public static C4102Rd h() {
        if (c != null) {
            return c;
        }
        synchronized (C4102Rd.class) {
            try {
                if (c == null) {
                    c = new C4102Rd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static Executor i() {
        return d;
    }

    @Override // o.AbstractC3846Ol2
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // o.AbstractC3846Ol2
    public boolean c() {
        return this.a.c();
    }

    @Override // o.AbstractC3846Ol2
    public void d(Runnable runnable) {
        this.a.d(runnable);
    }

    public void j(AbstractC3846Ol2 abstractC3846Ol2) {
        if (abstractC3846Ol2 == null) {
            abstractC3846Ol2 = this.b;
        }
        this.a = abstractC3846Ol2;
    }
}
