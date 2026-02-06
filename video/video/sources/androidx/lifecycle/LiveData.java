package androidx.lifecycle;

import androidx.lifecycle.f;
import java.util.Iterator;
import java.util.Map;
import o.C10490wX1;
import o.C4102Rd;
import o.InterfaceC3583Lt1;
import o.KZ0;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final int k = -1;
    public static final Object l = new Object();
    public final Object a;
    public C10490wX1<InterfaceC3583Lt1<? super T>, LiveData<T>.c> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements i {
        public final KZ0 Z0;

        public LifecycleBoundObserver(KZ0 kz0, InterfaceC3583Lt1<? super T> interfaceC3583Lt1) {
            super(interfaceC3583Lt1);
            this.Z0 = kz0;
        }

        @Override // androidx.lifecycle.LiveData.c
        public void b() {
            this.Z0.b().d(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean c(KZ0 kz0) {
            if (this.Z0 == kz0) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean d() {
            return this.Z0.b().b().g(f.b.STARTED);
        }

        @Override // androidx.lifecycle.i
        public void i(KZ0 kz0, f.a aVar) {
            f.b b = this.Z0.b().b();
            if (b == f.b.DESTROYED) {
                LiveData.this.p(this.X);
                return;
            }
            f.b bVar = null;
            while (bVar != b) {
                a(d());
                bVar = b;
                b = this.Z0.b().b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.l;
            }
            LiveData.this.r(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(InterfaceC3583Lt1<? super T> interfaceC3583Lt1) {
            super(interfaceC3583Lt1);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean d() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {
        public final InterfaceC3583Lt1<? super T> X;
        public boolean Y;
        public int Z = -1;

        public c(InterfaceC3583Lt1<? super T> interfaceC3583Lt1) {
            this.X = interfaceC3583Lt1;
        }

        public void a(boolean z) {
            int i;
            if (z != this.Y) {
                this.Y = z;
                LiveData liveData = LiveData.this;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                liveData.c(i);
                if (this.Y) {
                    LiveData.this.e(this);
                }
            }
        }

        public void b() {
        }

        public boolean c(KZ0 kz0) {
            return false;
        }

        public abstract boolean d();
    }

    public LiveData(T t) {
        this.a = new Object();
        this.b = new C10490wX1<>();
        this.c = 0;
        this.f = l;
        this.j = new a();
        this.e = t;
        this.g = 0;
    }

    public static void b(String str) {
        if (C4102Rd.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i) {
        boolean z;
        boolean z2;
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 != i3) {
                    if (i2 == 0 && i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 > 0 && i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        m();
                    } else if (z2) {
                        n();
                    }
                    i2 = i3;
                } else {
                    this.d = false;
                    return;
                }
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    public final void d(LiveData<T>.c cVar) {
        if (cVar.Y) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i = cVar.Z;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            cVar.Z = i2;
            cVar.X.b((Object) this.e);
        }
    }

    public void e(LiveData<T>.c cVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                C10490wX1<InterfaceC3583Lt1<? super T>, LiveData<T>.c>.d f = this.b.f();
                while (f.hasNext()) {
                    d((c) f.next().getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public T f() {
        T t = (T) this.e;
        if (t != l) {
            return t;
        }
        return null;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (this.b.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.e != l) {
            return true;
        }
        return false;
    }

    public void k(KZ0 kz0, InterfaceC3583Lt1<? super T> interfaceC3583Lt1) {
        b("observe");
        if (kz0.b().b() != f.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kz0, interfaceC3583Lt1);
            LiveData<T>.c j = this.b.j(interfaceC3583Lt1, lifecycleBoundObserver);
            if (j != null && !j.c(kz0)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (j != null) {
                return;
            }
            kz0.b().a(lifecycleBoundObserver);
        }
    }

    public void l(InterfaceC3583Lt1<? super T> interfaceC3583Lt1) {
        b("observeForever");
        b bVar = new b(interfaceC3583Lt1);
        LiveData<T>.c j = this.b.j(interfaceC3583Lt1, bVar);
        if (!(j instanceof LifecycleBoundObserver)) {
            if (j != null) {
                return;
            }
            bVar.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void m() {
    }

    public void n() {
    }

    public void o(T t) {
        boolean z;
        synchronized (this.a) {
            if (this.f == l) {
                z = true;
            } else {
                z = false;
            }
            this.f = t;
        }
        if (!z) {
            return;
        }
        C4102Rd.h().d(this.j);
    }

    public void p(InterfaceC3583Lt1<? super T> interfaceC3583Lt1) {
        b("removeObserver");
        LiveData<T>.c k2 = this.b.k(interfaceC3583Lt1);
        if (k2 == null) {
            return;
        }
        k2.b();
        k2.a(false);
    }

    public void q(KZ0 kz0) {
        b("removeObservers");
        Iterator<Map.Entry<InterfaceC3583Lt1<? super T>, LiveData<T>.c>> it = this.b.iterator();
        while (it.hasNext()) {
            Map.Entry<InterfaceC3583Lt1<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().c(kz0)) {
                p(next.getKey());
            }
        }
    }

    public void r(T t) {
        b("setValue");
        this.g++;
        this.e = t;
        e(null);
    }

    public LiveData() {
        this.a = new Object();
        this.b = new C10490wX1<>();
        this.c = 0;
        Object obj = l;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }
}
