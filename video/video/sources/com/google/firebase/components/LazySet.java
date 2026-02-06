package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class LazySet<T> implements Provider<Set<T>> {
    public volatile Set<T> b = null;
    public volatile Set<Provider<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    public LazySet(Collection<Provider<T>> collection) {
        this.a.addAll(collection);
    }

    public static LazySet<?> b(Collection<Provider<?>> collection) {
        return new LazySet<>((Set) collection);
    }

    public synchronized void a(Provider<T> provider) {
        try {
            if (this.b == null) {
                this.a.add(provider);
            } else {
                this.b.add(provider.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.firebase.inject.Provider
    /* renamed from: c */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    public final synchronized void d() {
        try {
            for (Provider<T> provider : this.a) {
                this.b.add(provider.get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
