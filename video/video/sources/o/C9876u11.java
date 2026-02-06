package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.C4170Ru0;

@Deprecated
/* renamed from: o.u11 */
/* loaded from: classes2.dex */
public final class C9876u11<T> {
    public static final int j = 0;
    public final LD a;
    public final InterfaceC5285bG0 b;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;
    public final ArrayDeque<Runnable> e;
    public final ArrayDeque<Runnable> f;
    public final Object g;
    @InterfaceC8710pF0("releasedLock")
    public boolean h;
    public boolean i;

    /* renamed from: o.u11$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void invoke(T t);
    }

    /* renamed from: o.u11$b */
    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(T t, C4170Ru0 c4170Ru0);
    }

    /* renamed from: o.u11$c */
    /* loaded from: classes2.dex */
    public static final class c<T> {
        public final T a;
        public C4170Ru0.b b = new C4170Ru0.b();
        public boolean c;
        public boolean d;

        public c(T t) {
            this.a = t;
        }

        public void a(int i, a<T> aVar) {
            if (!this.d) {
                if (i != -1) {
                    this.b.a(i);
                }
                this.c = true;
                aVar.invoke(this.a);
            }
        }

        public void b(b<T> bVar) {
            if (!this.d && this.c) {
                C4170Ru0 e = this.b.e();
                this.b = new C4170Ru0.b();
                this.c = false;
                bVar.a(this.a, e);
            }
        }

        public void c(b<T> bVar) {
            this.d = true;
            if (this.c) {
                this.c = false;
                bVar.a(this.a, this.b.e());
            }
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public C9876u11(Looper looper, LD ld, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, ld, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, aVar);
        }
    }

    public static /* synthetic */ boolean b(C9876u11 c9876u11, Message message) {
        return c9876u11.h(message);
    }

    public void c(T t) {
        C9542sf.g(t);
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        o();
        this.d.clear();
    }

    @OB
    public C9876u11<T> e(Looper looper, LD ld, b<T> bVar) {
        return new C9876u11<>(this.d, looper, ld, bVar, this.i);
    }

    @OB
    public C9876u11<T> f(Looper looper, b<T> bVar) {
        return e(looper, this.a, bVar);
    }

    public void g() {
        o();
        if (!this.f.isEmpty()) {
            if (!this.b.d(0)) {
                InterfaceC5285bG0 interfaceC5285bG0 = this.b;
                interfaceC5285bG0.j(interfaceC5285bG0.c(0));
            }
            boolean isEmpty = this.e.isEmpty();
            this.e.addAll(this.f);
            this.f.clear();
            if (isEmpty) {
                while (!this.e.isEmpty()) {
                    this.e.peekFirst().run();
                    this.e.removeFirst();
                }
            }
        }
    }

    public final boolean h(Message message) {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().b(this.c);
            if (this.b.d(0)) {
                return true;
            }
        }
        return true;
    }

    public void i(final int i, final a<T> aVar) {
        o();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: o.t11
            @Override // java.lang.Runnable
            public final void run() {
                C9876u11.a(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    public void j() {
        o();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().c(this.c);
        }
        this.d.clear();
    }

    public void k(T t) {
        o();
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.a.equals(t)) {
                next.c(this.c);
                this.d.remove(next);
            }
        }
    }

    public void l(int i, a<T> aVar) {
        i(i, aVar);
        g();
    }

    @Deprecated
    public void m(boolean z) {
        this.i = z;
    }

    public int n() {
        o();
        return this.d.size();
    }

    public final void o() {
        boolean z;
        if (!this.i) {
            return;
        }
        if (Thread.currentThread() == this.b.h().getThread()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
    }

    public C9876u11(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, LD ld, b<T> bVar, boolean z) {
        this.a = ld;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.g = new Object();
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.b = ld.d(looper, new Handler.Callback() { // from class: o.s11
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return C9876u11.b(C9876u11.this, message);
            }
        });
        this.i = z;
    }
}
