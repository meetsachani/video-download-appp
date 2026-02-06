package com.google.firebase.components;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;

/* loaded from: classes3.dex */
public final class Component<T> {
    public final String a;
    public final Set<Qualified<? super T>> b;
    public final Set<Dependency> c;
    public final int d;
    public final int e;
    public final ComponentFactory<T> f;
    public final Set<Class<?>> g;

    public static /* synthetic */ Object a(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static /* synthetic */ Object e(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static <T> Builder<T> f(Qualified<T> qualified) {
        return new Builder<>(qualified, new Qualified[0]);
    }

    @SafeVarargs
    public static <T> Builder<T> g(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return new Builder<>(qualified, qualifiedArr);
    }

    public static <T> Builder<T> h(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> Builder<T> i(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    public static <T> Component<T> o(final T t, Qualified<T> qualified) {
        return q(qualified).f(new ComponentFactory() { // from class: o.XH
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return Component.e(t, componentContainer);
            }
        }).d();
    }

    public static <T> Component<T> p(final T t, Class<T> cls) {
        return r(cls).f(new ComponentFactory() { // from class: o.YH
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return Component.d(t, componentContainer);
            }
        }).d();
    }

    public static <T> Builder<T> q(Qualified<T> qualified) {
        return f(qualified).g();
    }

    public static <T> Builder<T> r(Class<T> cls) {
        return h(cls).g();
    }

    @Deprecated
    public static <T> Component<T> w(Class<T> cls, final T t) {
        return h(cls).f(new ComponentFactory() { // from class: o.ZH
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return Component.b(t, componentContainer);
            }
        }).d();
    }

    @SafeVarargs
    public static <T> Component<T> x(final T t, Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return g(qualified, qualifiedArr).f(new ComponentFactory() { // from class: o.WH
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return Component.c(t, componentContainer);
            }
        }).d();
    }

    @SafeVarargs
    public static <T> Component<T> y(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return i(cls, clsArr).f(new ComponentFactory() { // from class: o.aI
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return Component.a(t, componentContainer);
            }
        }).d();
    }

    public Set<Dependency> j() {
        return this.c;
    }

    public ComponentFactory<T> k() {
        return this.f;
    }

    @InterfaceC11300zs1
    public String l() {
        return this.a;
    }

    public Set<Qualified<? super T>> m() {
        return this.b;
    }

    public Set<Class<?>> n() {
        return this.g;
    }

    public boolean s() {
        if (this.d == 1) {
            return true;
        }
        return false;
    }

    public boolean t() {
        if (this.d == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public boolean u() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public boolean v() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public Component<T> z(ComponentFactory<T> componentFactory) {
        return new Component<>(this.a, this.b, this.c, this.d, this.e, componentFactory, this.g);
    }

    /* loaded from: classes3.dex */
    public static class Builder<T> {
        public String a;
        public final Set<Qualified<? super T>> b;
        public final Set<Dependency> c;
        public int d;
        public int e;
        public ComponentFactory<T> f;
        public final Set<Class<?>> g;

        @InterfaceC6181ey
        public Builder<T> b(Dependency dependency) {
            Preconditions.c(dependency, "Null dependency");
            k(dependency.d());
            this.c.add(dependency);
            return this;
        }

        @InterfaceC6181ey
        public Builder<T> c() {
            return j(1);
        }

        public Component<T> d() {
            boolean z;
            if (this.f != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.d(z, "Missing required property: factory.");
            return new Component<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }

        @InterfaceC6181ey
        public Builder<T> e() {
            return j(2);
        }

        @InterfaceC6181ey
        public Builder<T> f(ComponentFactory<T> componentFactory) {
            this.f = (ComponentFactory) Preconditions.c(componentFactory, "Null factory");
            return this;
        }

        @InterfaceC6181ey
        public final Builder<T> g() {
            this.e = 1;
            return this;
        }

        public Builder<T> h(@InterfaceC5670cr1 String str) {
            this.a = str;
            return this;
        }

        @InterfaceC6181ey
        public Builder<T> i(Class<?> cls) {
            this.g.add(cls);
            return this;
        }

        @InterfaceC6181ey
        public final Builder<T> j(int i) {
            boolean z;
            if (this.d == 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.d(z, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        public final void k(Qualified<?> qualified) {
            Preconditions.a(!this.b.contains(qualified), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public Builder(Class<T> cls, Class<? super T>... clsArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            Preconditions.c(cls, "Null interface");
            hashSet.add(Qualified.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                Preconditions.c(cls2, "Null interface");
                this.b.add(Qualified.b(cls2));
            }
        }

        @SafeVarargs
        public Builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            Preconditions.c(qualified, "Null interface");
            hashSet.add(qualified);
            for (Qualified<? super T> qualified2 : qualifiedArr) {
                Preconditions.c(qualified2, "Null interface");
            }
            Collections.addAll(this.b, qualifiedArr);
        }
    }

    public Component(@InterfaceC11300zs1 String str, Set<Qualified<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = componentFactory;
        this.g = Collections.unmodifiableSet(set3);
    }
}
