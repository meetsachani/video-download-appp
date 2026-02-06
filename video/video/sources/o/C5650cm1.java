package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.FE1;
import o.InterfaceC7595kk1;
import o.JQ1;

/* renamed from: o.cm1 */
/* loaded from: classes.dex */
public class C5650cm1 {
    public static final c e = new c();
    public static final InterfaceC7595kk1<Object, Object> f = new a();
    public final List<b<?, ?>> a;
    public final c b;
    public final Set<b<?, ?>> c;
    public final FE1.a<List<Throwable>> d;

    /* renamed from: o.cm1$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC7595kk1<Object, Object> {
        @Override // o.InterfaceC7595kk1
        public boolean a(Object obj) {
            return false;
        }

        @Override // o.InterfaceC7595kk1
        public InterfaceC7595kk1.a<Object> b(Object obj, int i, int i2, C5448bw1 c5448bw1) {
            return null;
        }
    }

    /* renamed from: o.cm1$b */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;
        public final InterfaceC7838lk1<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1) {
            this.a = cls;
            this.b = cls2;
            this.c = interfaceC7838lk1;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            if (a(cls) && this.b.isAssignableFrom(cls2)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.cm1$c */
    /* loaded from: classes.dex */
    public static class c {
        public <Model, Data> C5408bm1<Model, Data> a(List<InterfaceC7595kk1<Model, Data>> list, FE1.a<List<Throwable>> aVar) {
            return new C5408bm1<>(list, aVar);
        }
    }

    public C5650cm1(FE1.a<List<Throwable>> aVar) {
        this(aVar, e);
    }

    public static <Model, Data> InterfaceC7595kk1<Model, Data> f() {
        return (InterfaceC7595kk1<Model, Data>) f;
    }

    public final <Model, Data> void a(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1, boolean z) {
        int i;
        b<?, ?> bVar = new b<>(cls, cls2, interfaceC7838lk1);
        List<b<?, ?>> list = this.a;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, bVar);
    }

    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1) {
        a(cls, cls2, interfaceC7838lk1, true);
    }

    public synchronized <Model> List<InterfaceC7595kk1<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.a) {
                if (!this.c.contains(bVar) && bVar.a(cls)) {
                    this.c.add(bVar);
                    arrayList.add(e(bVar));
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized <Model, Data> InterfaceC7595kk1<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.c.add(bVar);
                    arrayList.add(e(bVar));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.b.a(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                return (InterfaceC7595kk1) arrayList.get(0);
            } else if (z) {
                return f();
            } else {
                throw new JQ1.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final <Model, Data> InterfaceC7595kk1<Model, Data> e(b<?, ?> bVar) {
        return (InterfaceC7595kk1) C10175vF1.e(bVar.c.e(this));
    }

    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    public final <Model, Data> InterfaceC7838lk1<Model, Data> h(b<?, ?> bVar) {
        return (InterfaceC7838lk1<Model, Data>) bVar.c;
    }

    public synchronized <Model, Data> void i(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1) {
        a(cls, cls2, interfaceC7838lk1, false);
    }

    public synchronized <Model, Data> List<InterfaceC7838lk1<? extends Model, ? extends Data>> j(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> List<InterfaceC7838lk1<? extends Model, ? extends Data>> k(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1) {
        List<InterfaceC7838lk1<? extends Model, ? extends Data>> j;
        j = j(cls, cls2);
        b(cls, cls2, interfaceC7838lk1);
        return j;
    }

    public C5650cm1(FE1.a<List<Throwable>> aVar, c cVar) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = aVar;
        this.b = cVar;
    }
}
