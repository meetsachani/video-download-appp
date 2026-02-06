package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C4102Rd;
import o.C6562gT0;
import o.C9516sY;

/* loaded from: classes.dex */
public abstract class c<T> {
    public final Executor a;
    public final LiveData<T> b;
    public final LiveData<T> c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final Runnable f;
    public final Runnable g;

    /* loaded from: classes.dex */
    public static final class a extends LiveData<T> {
        public final /* synthetic */ c<T> m;

        public a(c<T> cVar) {
            this.m = cVar;
        }

        @Override // androidx.lifecycle.LiveData
        public void m() {
            this.m.e().execute(this.m.f);
        }
    }

    public c() {
        this(null, 1, null);
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }

    public static final void k(c cVar) {
        C6562gT0.p(cVar, "this$0");
        boolean h = cVar.h().h();
        if (cVar.d.compareAndSet(false, true) && h) {
            cVar.a.execute(cVar.f);
        }
    }

    public static final void l(c cVar) {
        C6562gT0.p(cVar, "this$0");
        do {
            boolean z = false;
            if (cVar.e.compareAndSet(false, true)) {
                T t = null;
                boolean z2 = false;
                while (cVar.d.compareAndSet(true, false)) {
                    try {
                        t = (T) cVar.c();
                        z2 = true;
                    } catch (Throwable th) {
                        cVar.e.set(false);
                        throw th;
                    }
                }
                if (z2) {
                    cVar.h().o(t);
                }
                cVar.e.set(false);
                z = z2;
            }
            if (!z) {
                return;
            }
        } while (cVar.d.get());
    }

    public abstract T c();

    public final AtomicBoolean d() {
        return this.e;
    }

    public final Executor e() {
        return this.a;
    }

    public final AtomicBoolean f() {
        return this.d;
    }

    public LiveData<T> h() {
        return this.c;
    }

    public void j() {
        C4102Rd.h().b(this.g);
    }

    public c(Executor executor) {
        C6562gT0.p(executor, "executor");
        this.a = executor;
        a aVar = new a(this);
        this.b = aVar;
        this.c = aVar;
        this.d = new AtomicBoolean(true);
        this.e = new AtomicBoolean(false);
        this.f = new Runnable() { // from class: o.dJ
            @Override // java.lang.Runnable
            public final void run() {
                androidx.lifecycle.c.l(androidx.lifecycle.c.this);
            }
        };
        this.g = new Runnable() { // from class: o.eJ
            @Override // java.lang.Runnable
            public final void run() {
                androidx.lifecycle.c.k(androidx.lifecycle.c.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(Executor executor, int i, C9516sY c9516sY) {
        this(executor);
        if ((i & 1) != 0) {
            executor = C4102Rd.g();
            C6562gT0.o(executor, "getIOThreadExecutor()");
        }
    }
}
