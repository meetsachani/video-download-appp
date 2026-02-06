package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C0373c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import o.InterfaceC6439g11;

/* renamed from: androidx.recyclerview.widget.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0374d<T> {
    public static final Executor h = new c();
    public final InterfaceC6439g11 a;
    public final C0373c<T> b;
    public Executor c;
    public final List<b<T>> d;
    public List<T> e;
    public List<T> f;
    public int g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List X;
        public final /* synthetic */ List Y;
        public final /* synthetic */ Runnable Y0;
        public final /* synthetic */ int Z;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0041a extends i.b {
            public C0041a() {
            }

            @Override // androidx.recyclerview.widget.i.b
            public boolean a(int i, int i2) {
                Object obj = a.this.X.get(i);
                Object obj2 = a.this.Y.get(i2);
                if (obj != null && obj2 != null) {
                    return C0374d.this.b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.i.b
            public boolean b(int i, int i2) {
                Object obj = a.this.X.get(i);
                Object obj2 = a.this.Y.get(i2);
                if (obj != null && obj2 != null) {
                    return C0374d.this.b.b().b(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.i.b
            public Object c(int i, int i2) {
                Object obj = a.this.X.get(i);
                Object obj2 = a.this.Y.get(i2);
                if (obj != null && obj2 != null) {
                    return C0374d.this.b.b().c(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.i.b
            public int d() {
                return a.this.Y.size();
            }

            @Override // androidx.recyclerview.widget.i.b
            public int e() {
                return a.this.X.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ i.e X;

            public b(i.e eVar) {
                this.X = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                C0374d c0374d = C0374d.this;
                if (c0374d.g == aVar.Z) {
                    c0374d.c(aVar.Y, this.X, aVar.Y0);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.X = list;
            this.Y = list2;
            this.Z = i;
            this.Y0 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0374d.this.c.execute(new b(i.b(new C0041a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    public static class c implements Executor {
        public final Handler X = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.X.post(runnable);
        }
    }

    public C0374d(RecyclerView.AbstractC0370h abstractC0370h, i.f<T> fVar) {
        this(new C0372b(abstractC0370h), new C0373c.a(fVar).a());
    }

    public void a(b<T> bVar) {
        this.d.add(bVar);
    }

    public List<T> b() {
        return this.f;
    }

    public void c(List<T> list, i.e eVar, Runnable runnable) {
        List<T> list2 = this.f;
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        eVar.e(this.a);
        d(list2, runnable);
    }

    public final void d(List<T> list, Runnable runnable) {
        for (b<T> bVar : this.d) {
            bVar.a(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void e(b<T> bVar) {
        this.d.remove(bVar);
    }

    public void f(List<T> list) {
        g(list, null);
    }

    public void g(List<T> list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            this.a.b(0, size);
            d(list3, runnable);
        } else if (list2 == null) {
            this.e = list;
            this.f = Collections.unmodifiableList(list);
            this.a.a(0, list.size());
            d(list3, runnable);
        } else {
            this.b.a().execute(new a(list2, list, i, runnable));
        }
    }

    public C0374d(InterfaceC6439g11 interfaceC6439g11, C0373c<T> c0373c) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.EMPTY_LIST;
        this.a = interfaceC6439g11;
        this.b = c0373c;
        if (c0373c.c() != null) {
            this.c = c0373c.c();
        } else {
            this.c = h;
        }
    }
}
