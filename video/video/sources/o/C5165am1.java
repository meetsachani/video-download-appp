package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.am1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5165am1 {
    public static final InterfaceC7846lm1 a = C9674tB2.b(new C11242ze(0, 0));

    public static <K, V> InterfaceC7846lm1<K, V> a(InterfaceC7846lm1<K, V> interfaceC7846lm1) {
        if (interfaceC7846lm1 == null) {
            return a;
        }
        return interfaceC7846lm1;
    }

    public static <K, V> InterfaceC7846lm1<K, V> b() {
        return a;
    }

    public static <K, V> Collection<V> c(InterfaceC7846lm1<K, V> interfaceC7846lm1, K k) {
        if (interfaceC7846lm1 != null) {
            return interfaceC7846lm1.get(k);
        }
        return null;
    }

    public static <K, V> InterfaceC2958Fk<V> d(InterfaceC7846lm1<K, V> interfaceC7846lm1, K k) {
        if (interfaceC7846lm1 != null) {
            Collection<V> collection = interfaceC7846lm1.get(k);
            if (collection instanceof InterfaceC2958Fk) {
                return (InterfaceC2958Fk) collection;
            }
            return new C7480kG0(collection);
        }
        return null;
    }

    public static <K, V> List<V> e(InterfaceC7846lm1<K, V> interfaceC7846lm1, K k) {
        if (interfaceC7846lm1 != null) {
            Collection<V> collection = interfaceC7846lm1.get(k);
            if (collection instanceof List) {
                return (List) collection;
            }
            return new ArrayList(collection);
        }
        return null;
    }

    public static <K, V> Set<V> f(InterfaceC7846lm1<K, V> interfaceC7846lm1, K k) {
        if (interfaceC7846lm1 != null) {
            Collection<V> collection = interfaceC7846lm1.get(k);
            if (collection instanceof Set) {
                return (Set) collection;
            }
            return new HashSet(collection);
        }
        return null;
    }

    public static boolean g(InterfaceC7846lm1<?, ?> interfaceC7846lm1) {
        if (interfaceC7846lm1 != null && !interfaceC7846lm1.isEmpty()) {
            return false;
        }
        return true;
    }

    public static <K, V> InterfaceC7664l11<K, V> h() {
        return new C11242ze();
    }

    public static <K, V> InterfaceC10613x22<K, V> i() {
        return new C10667xG0();
    }

    public static <K, V> InterfaceC7846lm1<K, V> j(InterfaceC7846lm1<K, V> interfaceC7846lm1, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        return C9840ts2.e(interfaceC7846lm1, interfaceC3287Is2, interfaceC3287Is22);
    }

    public static <K, V> InterfaceC7846lm1<K, V> k(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        return C9674tB2.b(interfaceC7846lm1);
    }
}
