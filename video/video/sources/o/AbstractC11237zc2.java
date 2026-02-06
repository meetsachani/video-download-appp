package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC2789Dt1;

/* renamed from: o.zc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11237zc2<T> implements InterfaceC2789Dt1<T> {
    public static final int g = 0;
    public final AtomicReference<Object> b;
    public final Object a = new Object();
    public int c = 0;
    public boolean d = false;
    public final Map<InterfaceC2789Dt1.a<? super T>, b<T>> e = new HashMap();
    public final CopyOnWriteArraySet<b<T>> f = new CopyOnWriteArraySet<>();

    /* renamed from: o.zc2$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static a b(Throwable th) {
            return new C9315rj(th);
        }

        public abstract Throwable a();
    }

    /* renamed from: o.zc2$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Runnable {
        public static final Object c1 = new Object();
        public static final int d1 = -1;
        public final Executor X;
        public final InterfaceC2789Dt1.a<? super T> Y;
        public final AtomicReference<Object> Y0;
        public final AtomicBoolean Z = new AtomicBoolean(true);
        public Object Z0 = c1;
        public int a1 = -1;
        public boolean b1 = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, InterfaceC2789Dt1.a<? super T> aVar) {
            this.Y0 = atomicReference;
            this.X = executor;
            this.Y = aVar;
        }

        public void a() {
            this.Z.set(false);
        }

        public void b(int i) {
            synchronized (this) {
                try {
                    if (!this.Z.get()) {
                        return;
                    }
                    if (i <= this.a1) {
                        return;
                    }
                    this.a1 = i;
                    if (this.b1) {
                        return;
                    }
                    this.b1 = true;
                    try {
                        this.X.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.b1 = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.Z.get()) {
                        this.b1 = false;
                        return;
                    }
                    Object obj = this.Y0.get();
                    int i = this.a1;
                    while (true) {
                        if (!Objects.equals(this.Z0, obj)) {
                            this.Z0 = obj;
                            if (obj instanceof a) {
                                this.Y.onError(((a) obj).a());
                            } else {
                                this.Y.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i == this.a1 || !this.Z.get()) {
                                    break;
                                }
                                obj = this.Y0.get();
                                i = this.a1;
                            } finally {
                            }
                        }
                    }
                    this.b1 = false;
                } finally {
                }
            }
        }
    }

    public AbstractC11237zc2(Object obj, boolean z) {
        if (z) {
            C10907yF1.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.b = new AtomicReference<>(a.b((Throwable) obj));
            return;
        }
        this.b = new AtomicReference<>(obj);
    }

    @Override // o.InterfaceC2789Dt1
    public InterfaceFutureC8411o11<T> a() {
        Object obj = this.b.get();
        if (obj instanceof a) {
            return C7221jC0.f(((a) obj).a());
        }
        return C7221jC0.h(obj);
    }

    @Override // o.InterfaceC2789Dt1
    public void b(Executor executor, InterfaceC2789Dt1.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.a) {
            e(aVar);
            bVar = new b<>(this.b, executor, aVar);
            this.e.put(aVar, bVar);
            this.f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // o.InterfaceC2789Dt1
    public void d(InterfaceC2789Dt1.a<? super T> aVar) {
        synchronized (this.a) {
            e(aVar);
        }
    }

    public final void e(InterfaceC2789Dt1.a<? super T> aVar) {
        b<T> remove = this.e.remove(aVar);
        if (remove != null) {
            remove.a();
            this.f.remove(remove);
        }
    }

    public void f(T t) {
        h(t);
    }

    public void g(Throwable th) {
        h(a.b(th));
    }

    public final void h(Object obj) {
        Iterator<b<T>> it;
        int i;
        synchronized (this.a) {
            try {
                if (Objects.equals(this.b.getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.c + 1;
                this.c = i2;
                if (this.d) {
                    return;
                }
                this.d = true;
                Iterator<b<T>> it2 = this.f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i2);
                    } else {
                        synchronized (this.a) {
                            try {
                                if (this.c == i2) {
                                    this.d = false;
                                    return;
                                } else {
                                    it = this.f.iterator();
                                    i = this.c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }
}
