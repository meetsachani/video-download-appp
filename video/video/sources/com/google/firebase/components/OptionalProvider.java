package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    public static final Deferred.DeferredHandler<Object> c = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.d
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void a(Provider provider) {
            OptionalProvider.d(provider);
        }
    };
    public static final Provider<Object> d = new Provider() { // from class: com.google.firebase.components.e
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return OptionalProvider.b();
        }
    };
    @InterfaceC8710pF0("this")
    public Deferred.DeferredHandler<T> a;
    public volatile Provider<T> b;

    public OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.a = deferredHandler;
        this.b = provider;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.a(provider);
        deferredHandler2.a(provider);
    }

    public static /* synthetic */ void d(Provider provider) {
    }

    public static <T> OptionalProvider<T> e() {
        return new OptionalProvider<>(c, d);
    }

    public static <T> OptionalProvider<T> f(Provider<T> provider) {
        return new OptionalProvider<>(null, provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void a(@InterfaceC5670cr1 final Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.b;
        Provider<Object> provider4 = d;
        if (provider3 != provider4) {
            deferredHandler.a(provider3);
            return;
        }
        synchronized (this) {
            provider = this.b;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler<T> deferredHandler2 = this.a;
                this.a = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.f
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void a(Provider provider5) {
                        OptionalProvider.c(Deferred.DeferredHandler.this, deferredHandler, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.a(provider);
        }
    }

    public void g(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.b == d) {
            synchronized (this) {
                deferredHandler = this.a;
                this.a = null;
                this.b = provider;
            }
            deferredHandler.a(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.b.get();
    }
}
