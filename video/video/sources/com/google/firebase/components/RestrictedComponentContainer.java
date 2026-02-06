package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RestrictedComponentContainer implements ComponentContainer {
    public final Set<Qualified<?>> a;
    public final Set<Qualified<?>> b;
    public final Set<Qualified<?>> c;
    public final Set<Qualified<?>> d;
    public final Set<Qualified<?>> e;
    public final Set<Class<?>> f;
    public final ComponentContainer g;

    /* loaded from: classes3.dex */
    public static class RestrictedPublisher implements Publisher {
        public final Set<Class<?>> a;
        public final Publisher b;

        public RestrictedPublisher(Set<Class<?>> set, Publisher publisher) {
            this.a = set;
            this.b = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public void c(Event<?> event) {
            if (this.a.contains(event.b())) {
                this.b.c(event);
                return;
            }
            throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event));
        }
    }

    public RestrictedComponentContainer(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.j()) {
            if (dependency.f()) {
                if (dependency.h()) {
                    hashSet4.add(dependency.d());
                } else {
                    hashSet.add(dependency.d());
                }
            } else if (dependency.e()) {
                hashSet3.add(dependency.d());
            } else if (dependency.h()) {
                hashSet5.add(dependency.d());
            } else {
                hashSet2.add(dependency.d());
            }
        }
        if (!component.n().isEmpty()) {
            hashSet.add(Qualified.b(Publisher.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = component.n();
        this.g = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T a(Class<T> cls) {
        if (this.a.contains(Qualified.b(cls))) {
            T t = (T) this.g.a(cls);
            if (!cls.equals(Publisher.class)) {
                return t;
            }
            return (T) new RestrictedPublisher(this.f, (Publisher) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> b(Qualified<T> qualified) {
        if (this.b.contains(qualified)) {
            return this.g.b(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> d(Class<T> cls) {
        return f(Qualified.b(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Set<T> e(Qualified<T> qualified) {
        if (this.d.contains(qualified)) {
            return this.g.e(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> f(Qualified<T> qualified) {
        if (this.e.contains(qualified)) {
            return this.g.f(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T g(Qualified<T> qualified) {
        if (this.a.contains(qualified)) {
            return (T) this.g.g(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> i(Class<T> cls) {
        return b(Qualified.b(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> j(Qualified<T> qualified) {
        if (this.c.contains(qualified)) {
            return this.g.j(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> k(Class<T> cls) {
        return j(Qualified.b(cls));
    }
}
