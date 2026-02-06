package o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class J61<T> {
    public static final String e = "lottie.testing.directExecutor";
    public static Executor f;
    public final Set<InterfaceC10871y61<T>> a;
    public final Set<InterfaceC10871y61<Throwable>> b;
    public final Handler c;
    public volatile H61<T> d;

    /* loaded from: classes.dex */
    public static class a<T> extends FutureTask<H61<T>> {
        public J61<T> X;

        public a(J61<T> j61, Callable<H61<T>> callable) {
            super(callable);
            this.X = j61;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (!isCancelled()) {
                    try {
                        this.X.l(get());
                    } catch (InterruptedException | ExecutionException e) {
                        this.X.l(new H61(e));
                    }
                }
            } finally {
                this.X = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty(e))) {
            f = new D6();
        } else {
            f = Executors.newCachedThreadPool(new L61());
        }
    }

    public J61(Callable<H61<T>> callable) {
        this(callable, false);
    }

    public static /* synthetic */ void a(J61 j61) {
        j61.h();
    }

    public synchronized J61<T> c(InterfaceC10871y61<Throwable> interfaceC10871y61) {
        try {
            H61<T> h61 = this.d;
            if (h61 != null && h61.a() != null) {
                interfaceC10871y61.onResult(h61.a());
            }
            this.b.add(interfaceC10871y61);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized J61<T> d(InterfaceC10871y61<T> interfaceC10871y61) {
        try {
            H61<T> h61 = this.d;
            if (h61 != null && h61.b() != null) {
                interfaceC10871y61.onResult(h61.b());
            }
            this.a.add(interfaceC10871y61);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public H61<T> e() {
        return this.d;
    }

    public final synchronized void f(Throwable th) {
        ArrayList<InterfaceC10871y61> arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            C7190j41.f("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (InterfaceC10871y61 interfaceC10871y61 : arrayList) {
            interfaceC10871y61.onResult(th);
        }
    }

    public final void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.c.post(new Runnable() { // from class: o.I61
                @Override // java.lang.Runnable
                public final void run() {
                    J61.a(J61.this);
                }
            });
        }
    }

    public final void h() {
        H61<T> h61 = this.d;
        if (h61 == null) {
            return;
        }
        if (h61.b() != null) {
            i(h61.b());
        } else {
            f(h61.a());
        }
    }

    public final synchronized void i(T t) {
        for (InterfaceC10871y61 interfaceC10871y61 : new ArrayList(this.a)) {
            interfaceC10871y61.onResult(t);
        }
    }

    public synchronized J61<T> j(InterfaceC10871y61<Throwable> interfaceC10871y61) {
        this.b.remove(interfaceC10871y61);
        return this;
    }

    public synchronized J61<T> k(InterfaceC10871y61<T> interfaceC10871y61) {
        this.a.remove(interfaceC10871y61);
        return this;
    }

    public final void l(H61<T> h61) {
        if (this.d == null) {
            this.d = h61;
            g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public J61(T t) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        l(new H61<>(t));
    }

    public J61(Callable<H61<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th) {
                l(new H61<>(th));
                return;
            }
        }
        f.execute(new a(this, callable));
    }
}
