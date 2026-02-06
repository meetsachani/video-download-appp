package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public class Lazy<T> implements Provider<T> {
    public static final Object c = new Object();
    public volatile Object a;
    public volatile Provider<T> b;

    public Lazy(T t) {
        this.a = c;
        this.a = t;
    }

    @InterfaceC5056aJ2
    public boolean a() {
        if (this.a != c) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t;
        T t2 = (T) this.a;
        Object obj = c;
        if (t2 == obj) {
            synchronized (this) {
                try {
                    t = (T) this.a;
                    if (t == obj) {
                        t = this.b.get();
                        this.a = t;
                        this.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return t;
        }
        return t2;
    }

    public Lazy(Provider<T> provider) {
        this.a = c;
        this.b = provider;
    }
}
