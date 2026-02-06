package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: o.w22  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10370w22 {
    public static final Set a = Collections.EMPTY_SET;
    public static final SortedSet b = MB2.h(new TreeSet());

    public static int a(Collection collection) {
        int i = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            if (obj != null) {
                i += obj.hashCode();
            }
        }
        return i;
    }

    public static boolean b(Collection collection, Collection collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection != null && collection2 != null && collection.size() == collection2.size()) {
            return collection.containsAll(collection2);
        }
        return false;
    }

    public static Set c(Set set) {
        return C5226b11.i(set);
    }

    public static Set d(Set set, JF1 jf1) {
        return C6256fG1.h(set, jf1);
    }

    public static SortedSet e(SortedSet sortedSet, JF1 jf1) {
        return C7724lG1.j(sortedSet, jf1);
    }

    public static Set f(Set set) {
        return C4520Vj2.e(set);
    }

    public static SortedSet g(SortedSet sortedSet) {
        return C4811Yj2.e(sortedSet);
    }

    public static Set h(Set set, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return C11301zs2.i(set, interfaceC3189Hs2);
    }

    public static SortedSet i(SortedSet sortedSet, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return C2993Fs2.j(sortedSet, interfaceC3189Hs2);
    }

    public static Set j(Set set, Class cls) {
        return C6917hw2.a(set, cls);
    }

    public static SortedSet k(SortedSet sortedSet, Class cls) {
        return C7644kw2.a(sortedSet, cls);
    }

    public static Set l(Set set) {
        return DB2.f(set);
    }

    public static SortedSet m(SortedSet sortedSet) {
        return MB2.h(sortedSet);
    }
}
