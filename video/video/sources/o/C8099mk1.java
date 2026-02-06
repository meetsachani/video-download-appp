package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.FE1;
import o.JQ1;

/* renamed from: o.mk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8099mk1 {
    public final C5650cm1 a;
    public final a b;

    /* renamed from: o.mk1$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Map<Class<?>, C0308a<?>> a = new HashMap();

        /* renamed from: o.mk1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0308a<Model> {
            public final List<InterfaceC7595kk1<Model, ?>> a;

            public C0308a(List<InterfaceC7595kk1<Model, ?>> list) {
                this.a = list;
            }
        }

        public void a() {
            this.a.clear();
        }

        public <Model> List<InterfaceC7595kk1<Model, ?>> b(Class<Model> cls) {
            C0308a<?> c0308a = this.a.get(cls);
            if (c0308a == null) {
                return null;
            }
            return (List<InterfaceC7595kk1<Model, ?>>) c0308a.a;
        }

        public <Model> void c(Class<Model> cls, List<InterfaceC7595kk1<Model, ?>> list) {
            if (this.a.put(cls, new C0308a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C8099mk1(FE1.a<List<Throwable>> aVar) {
        this(new C5650cm1(aVar));
    }

    public static <A> Class<A> c(A a2) {
        return (Class<A>) a2.getClass();
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1) {
        this.a.b(cls, cls2, interfaceC7838lk1);
        this.b.a();
    }

    public synchronized <Model, Data> InterfaceC7595kk1<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        return this.a.d(cls, cls2);
    }

    public synchronized List<Class<?>> d(Class<?> cls) {
        return this.a.g(cls);
    }

    public <A> List<InterfaceC7595kk1<A, ?>> e(A a2) {
        List<InterfaceC7595kk1<A, ?>> f = f(c(a2));
        if (!f.isEmpty()) {
            int size = f.size();
            List<InterfaceC7595kk1<A, ?>> list = Collections.EMPTY_LIST;
            boolean z = true;
            for (int i = 0; i < size; i++) {
                InterfaceC7595kk1<A, ?> interfaceC7595kk1 = f.get(i);
                if (interfaceC7595kk1.a(a2)) {
                    if (z) {
                        list = new ArrayList<>(size - i);
                        z = false;
                    }
                    list.add(interfaceC7595kk1);
                }
            }
            if (!list.isEmpty()) {
                return list;
            }
            throw new JQ1.c(a2, f);
        }
        throw new JQ1.c(a2);
    }

    public final synchronized <A> List<InterfaceC7595kk1<A, ?>> f(Class<A> cls) {
        List<InterfaceC7595kk1<A, ?>> b;
        b = this.b.b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.a.c(cls));
            this.b.c(cls, b);
        }
        return b;
    }

    public synchronized <Model, Data> void g(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1) {
        this.a.i(cls, cls2, interfaceC7838lk1);
        this.b.a();
    }

    public synchronized <Model, Data> void h(Class<Model> cls, Class<Data> cls2) {
        j(this.a.j(cls, cls2));
        this.b.a();
    }

    public synchronized <Model, Data> void i(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1) {
        j(this.a.k(cls, cls2, interfaceC7838lk1));
        this.b.a();
    }

    public final <Model, Data> void j(List<InterfaceC7838lk1<? extends Model, ? extends Data>> list) {
        for (InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1 : list) {
            interfaceC7838lk1.d();
        }
    }

    public C8099mk1(C5650cm1 c5650cm1) {
        this.b = new a();
        this.a = c5650cm1;
    }
}
