package o;

import java.util.List;
import java.util.Map;

/* renamed from: o.tf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9785tf {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new AssertionError();
    }

    public static void b(boolean z, String str) {
        if (z) {
            return;
        }
        throw new AssertionError(str);
    }

    public static <T> T c(int i, List<T> list) {
        boolean z;
        if (i >= 0 && i < list.size()) {
            z = true;
        } else {
            z = false;
        }
        b(z, "Index not in bound");
        return (T) f(list.get(i), "Null value");
    }

    public static <K, V> V d(K k, Map<K, V> map) {
        b(map.containsKey(k), "Key not found");
        return (V) f(map.get(k), "Null value");
    }

    public static <T> T e(@InterfaceC10571ws1 T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionError();
    }

    public static <T> T f(@InterfaceC10571ws1 T t, String str) {
        if (t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    public static AssertionError g() {
        throw new AssertionError();
    }

    public static AssertionError h(Exception exc) {
        throw new AssertionError(exc);
    }

    public static AssertionError i(String str) {
        throw new AssertionError(str);
    }

    public static void j(boolean z) {
    }

    public static <T> T l(@InterfaceC10571ws1 T t) {
        return t;
    }

    public static void k(boolean z, String str) {
    }

    public static <T> T m(@InterfaceC10571ws1 T t, String str) {
        return t;
    }

    public static <T> T n(@InterfaceC10571ws1 T t, String str) {
        return t;
    }
}
