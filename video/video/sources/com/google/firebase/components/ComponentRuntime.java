package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.C6515gH1;
import o.HT1;
import o.InterfaceC5056aJ2;
import o.InterfaceC6181ey;

/* loaded from: classes3.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {
    public static final Provider<Set<Object>> i = new Provider() { // from class: o.FI
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };
    public final Map<Component<?>, Provider<?>> a;
    public final Map<Qualified<?>, Provider<?>> b;
    public final Map<Qualified<?>, LazySet<?>> c;
    public final List<Provider<ComponentRegistrar>> d;
    public Set<String> e;
    public final EventBus f;
    public final AtomicReference<Boolean> g;
    public final ComponentRegistrarProcessor h;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public final Executor a;
        public final List<Provider<ComponentRegistrar>> b = new ArrayList();
        public final List<Component<?>> c = new ArrayList();
        public ComponentRegistrarProcessor d = ComponentRegistrarProcessor.a;

        public Builder(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @InterfaceC6181ey
        public Builder b(Component<?> component) {
            this.c.add(component);
            return this;
        }

        @InterfaceC6181ey
        public Builder c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new Provider() { // from class: o.HI
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.Builder.a(ComponentRegistrar.this);
                }
            });
            return this;
        }

        @InterfaceC6181ey
        public Builder d(Collection<Provider<ComponentRegistrar>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public ComponentRuntime e() {
            return new ComponentRuntime(this.a, this.b, this.c, this.d);
        }

        @InterfaceC6181ey
        public Builder f(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.d = componentRegistrarProcessor;
            return this;
        }
    }

    public static Iterable<Provider<ComponentRegistrar>> A(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new Provider() { // from class: o.EI
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.n(ComponentRegistrar.this);
                }
            });
        }
        return arrayList;
    }

    public static /* synthetic */ Object l(ComponentRuntime componentRuntime, Component component) {
        componentRuntime.getClass();
        return component.k().a(new RestrictedComponentContainer(component, componentRuntime));
    }

    public static /* synthetic */ ComponentRegistrar n(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public static Builder p(Executor executor) {
        return new Builder(executor);
    }

    public static <T> List<T> v(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<T> b(Qualified<T> qualified) {
        Preconditions.c(qualified, "Null interface requested.");
        return (Provider<T>) this.b.get(qualified);
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void c() {
        synchronized (this) {
            try {
                if (this.d.isEmpty()) {
                    return;
                }
                q(new ArrayList());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<Set<T>> f(Qualified<T> qualified) {
        LazySet<?> lazySet = this.c.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return (Provider<Set<T>>) i;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> j(Qualified<T> qualified) {
        Provider<T> b = b(qualified);
        if (b == null) {
            return OptionalProvider.e();
        }
        if (b instanceof OptionalProvider) {
            return (OptionalProvider) b;
        }
        return OptionalProvider.f(b);
    }

    public final void q(List<Component<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<Provider<ComponentRegistrar>> it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w(ComponentDiscovery.c, "Invalid component registrar.", e);
                }
            }
            Iterator<Component<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().m().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.e.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                CycleDetector.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                CycleDetector.a(arrayList2);
            }
            for (final Component<?> component : list) {
                this.a.put(component, new Lazy(new Provider() { // from class: o.GI
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return ComponentRuntime.l(ComponentRuntime.this, component);
                    }
                }));
            }
            arrayList.addAll(y(list));
            arrayList.addAll(z());
            x();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        w();
    }

    public final void r(Map<Component<?>, Provider<?>> map, boolean z) {
        for (Map.Entry<Component<?>, Provider<?>> entry : map.entrySet()) {
            Component<?> key = entry.getKey();
            Provider<?> value = entry.getValue();
            if (key.s() || (key.t() && z)) {
                value.get();
            }
        }
        this.f.f();
    }

    @InterfaceC5056aJ2
    public Collection<Component<?>> s() {
        return this.a.keySet();
    }

    @HT1({HT1.a.Z0})
    @InterfaceC5056aJ2
    public void t() {
        for (Provider<?> provider : this.a.values()) {
            provider.get();
        }
    }

    public void u(boolean z) {
        HashMap hashMap;
        if (!C6515gH1.a(this.g, null, Boolean.valueOf(z))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.a);
        }
        r(hashMap, z);
    }

    public final void w() {
        Boolean bool = this.g.get();
        if (bool != null) {
            r(this.a, bool.booleanValue());
        }
    }

    public final void x() {
        for (Component<?> component : this.a.keySet()) {
            for (Dependency dependency : component.j()) {
                if (dependency.h() && !this.c.containsKey(dependency.d())) {
                    this.c.put(dependency.d(), LazySet.b(Collections.EMPTY_SET));
                } else if (this.b.containsKey(dependency.d())) {
                    continue;
                } else if (!dependency.g()) {
                    if (!dependency.h()) {
                        this.b.put(dependency.d(), OptionalProvider.e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.d()));
                }
            }
        }
    }

    public final List<Runnable> y(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Component<?> component : list) {
            if (component.v()) {
                final Provider<?> provider = this.a.get(component);
                for (Qualified<? super Object> qualified : component.m()) {
                    if (!this.b.containsKey(qualified)) {
                        this.b.put(qualified, provider);
                    } else {
                        final OptionalProvider optionalProvider = (OptionalProvider) this.b.get(qualified);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                OptionalProvider.this.g(provider);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> z() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<Component<?>, Provider<?>> entry : this.a.entrySet()) {
            Component<?> key = entry.getKey();
            if (!key.v()) {
                Provider<?> value = entry.getValue();
                for (Qualified<? super Object> qualified : key.m()) {
                    if (!hashMap.containsKey(qualified)) {
                        hashMap.put(qualified, new HashSet());
                    }
                    ((Set) hashMap.get(qualified)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.c.containsKey(entry2.getKey())) {
                this.c.put((Qualified) entry2.getKey(), LazySet.b((Collection) entry2.getValue()));
            } else {
                final LazySet<?> lazySet = this.c.get(entry2.getKey());
                for (final Provider provider : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            LazySet.this.a(provider);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this(executor, A(iterable), Arrays.asList(componentArr), ComponentRegistrarProcessor.a);
    }

    public ComponentRuntime(Executor executor, Iterable<Provider<ComponentRegistrar>> iterable, Collection<Component<?>> collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference<>();
        EventBus eventBus = new EventBus(executor);
        this.f = eventBus;
        this.h = componentRegistrarProcessor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.y(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.y(this, ComponentLoader.class, new Class[0]));
        for (Component<?> component : collection) {
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.d = v(iterable);
        q(arrayList);
    }
}
