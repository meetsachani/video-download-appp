package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* loaded from: classes3.dex */
public interface ComponentContainer {
    default <T> T a(Class<T> cls) {
        return (T) g(Qualified.b(cls));
    }

    <T> Provider<T> b(Qualified<T> qualified);

    default <T> Provider<Set<T>> d(Class<T> cls) {
        return f(Qualified.b(cls));
    }

    default <T> Set<T> e(Qualified<T> qualified) {
        return f(qualified).get();
    }

    <T> Provider<Set<T>> f(Qualified<T> qualified);

    default <T> T g(Qualified<T> qualified) {
        Provider<T> b = b(qualified);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    default <T> Set<T> h(Class<T> cls) {
        return e(Qualified.b(cls));
    }

    default <T> Provider<T> i(Class<T> cls) {
        return b(Qualified.b(cls));
    }

    <T> Deferred<T> j(Qualified<T> qualified);

    default <T> Deferred<T> k(Class<T> cls) {
        return j(Qualified.b(cls));
    }
}
