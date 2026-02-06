package org.jsoup.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.jsoup.internal.Functions;

/* loaded from: classes4.dex */
public final class Functions {
    public static final Function a = new Function() { // from class: o.rB0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Functions.a(obj);
        }
    };
    public static final Function b = new Function() { // from class: o.AB0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Functions.c(obj);
        }
    };
    public static final Function c = new Function() { // from class: o.CB0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Functions.d(obj);
        }
    };
    public static final Function d = new Function() { // from class: o.EB0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Functions.b(obj);
        }
    };

    private Functions() {
    }

    public static /* synthetic */ Object a(Object obj) {
        return new ArrayList();
    }

    public static /* synthetic */ Object b(Object obj) {
        return new IdentityHashMap();
    }

    public static /* synthetic */ Object c(Object obj) {
        return new HashSet();
    }

    public static /* synthetic */ Object d(Object obj) {
        return new HashMap();
    }

    public static <T, K, V> Function<T, IdentityHashMap<K, V>> e() {
        return d;
    }

    public static <T, U> Function<T, List<U>> f() {
        return a;
    }

    public static <T, K, V> Function<T, Map<K, V>> g() {
        return c;
    }

    public static <T, U> Function<T, Set<U>> h() {
        return b;
    }
}
