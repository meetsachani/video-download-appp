package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.room.c;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C4102Rd;
import o.C9987uT0;
import o.VU1;

/* loaded from: classes.dex */
public class e<T> extends LiveData<T> {
    public final VU1 m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final Callable<T> f64o;
    public final C9987uT0 p;
    public final c.AbstractC0048c q;
    public final AtomicBoolean r = new AtomicBoolean(true);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final AtomicBoolean t = new AtomicBoolean(false);
    public final Runnable u = new a();
    public final Runnable v = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (e.this.t.compareAndSet(false, true)) {
                e.this.m.l().b(e.this.q);
            }
            do {
                if (e.this.s.compareAndSet(false, true)) {
                    T t = null;
                    z = false;
                    while (e.this.r.compareAndSet(true, false)) {
                        try {
                            try {
                                t = e.this.f64o.call();
                                z = true;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        } finally {
                            e.this.s.set(false);
                        }
                    }
                    if (z) {
                        e.this.o(t);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (e.this.r.get());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean h = e.this.h();
            if (e.this.r.compareAndSet(false, true) && h) {
                e.this.t().execute(e.this.u);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends c.AbstractC0048c {
        public c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0048c
        public void b(Set<String> set) {
            C4102Rd.h().b(e.this.v);
        }
    }

    public e(VU1 vu1, C9987uT0 c9987uT0, boolean z, Callable<T> callable, String[] strArr) {
        this.m = vu1;
        this.n = z;
        this.f64o = callable;
        this.p = c9987uT0;
        this.q = new c(strArr);
    }

    @Override // androidx.lifecycle.LiveData
    public void m() {
        super.m();
        this.p.b(this);
        t().execute(this.u);
    }

    @Override // androidx.lifecycle.LiveData
    public void n() {
        super.n();
        this.p.c(this);
    }

    public Executor t() {
        if (this.n) {
            return this.m.p();
        }
        return this.m.n();
    }
}
