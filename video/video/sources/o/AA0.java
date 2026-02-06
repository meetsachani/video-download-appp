package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AA0 {
    public final Executor a;
    public final FA0<C7458kA2> b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public final List<FA0<C7458kA2>> g;
    public final Runnable h;

    public AA0(Executor executor, FA0<C7458kA2> fa0) {
        C6562gT0.p(executor, "executor");
        C6562gT0.p(fa0, "reportFullyDrawn");
        this.a = executor;
        this.b = fa0;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new Runnable() { // from class: o.zA0
            @Override // java.lang.Runnable
            public final void run() {
                AA0.a(AA0.this);
            }
        };
    }

    public static /* synthetic */ void a(AA0 aa0) {
        i(aa0);
    }

    public static final void i(AA0 aa0) {
        synchronized (aa0.c) {
            try {
                aa0.e = false;
                if (aa0.d == 0 && !aa0.f) {
                    aa0.b.invoke();
                    aa0.d();
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(FA0<C7458kA2> fa0) {
        boolean z;
        C6562gT0.p(fa0, "callback");
        synchronized (this.c) {
            if (this.f) {
                z = true;
            } else {
                this.g.add(fa0);
                z = false;
            }
        }
        if (z) {
            fa0.invoke();
        }
    }

    public final void c() {
        synchronized (this.c) {
            try {
                if (!this.f) {
                    this.d++;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator<T> it = this.g.iterator();
                while (it.hasNext()) {
                    ((FA0) it.next()).invoke();
                }
                this.g.clear();
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }

    public final void f() {
        if (!this.e && this.d == 0) {
            this.e = true;
            this.a.execute(this.h);
        }
    }

    public final void g(FA0<C7458kA2> fa0) {
        C6562gT0.p(fa0, "callback");
        synchronized (this.c) {
            this.g.remove(fa0);
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    public final void h() {
        int i;
        synchronized (this.c) {
            try {
                if (!this.f && (i = this.d) > 0) {
                    this.d = i - 1;
                    f();
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
