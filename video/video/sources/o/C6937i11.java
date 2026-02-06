package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.i11  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6937i11 {
    public static final List a = Collections.EMPTY_LIST;

    public static List a(List list) {
        return C11307zu0.f(list);
    }

    public static int b(Collection collection) {
        int hashCode;
        if (collection == null) {
            return 0;
        }
        int i = 1;
        for (Object obj : collection) {
            int i2 = i * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i = i2 + hashCode;
        }
        return i;
    }

    public static List c(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (list.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean d(Collection collection, Collection collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection != null && collection2 != null && collection.size() == collection2.size()) {
            Iterator it = collection.iterator();
            Iterator it2 = collection2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                if (next == null) {
                    if (next2 != null) {
                        return false;
                    }
                } else if (!next.equals(next2)) {
                    return false;
                }
            }
            if (!it.hasNext() && !it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static List e(List list, InterfaceC5399bk0 interfaceC5399bk0) {
        return ZY0.f(list, interfaceC5399bk0);
    }

    public static List f(List list, JF1 jf1) {
        return XF1.j(list, jf1);
    }

    public static List g(Collection collection, Collection collection2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!collection2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List h(Collection collection, Collection collection2) {
        ArrayList arrayList = new ArrayList(Math.min(collection.size(), collection2.size()));
        for (Object obj : collection) {
            if (collection2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List i(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        for (Object obj : list2) {
            arrayList.remove(obj);
        }
        return arrayList;
    }

    public static List j(List list, List list2) {
        return i(n(list, list2), c(list, list2));
    }

    public static List k(List list) {
        return C3838Oj2.e(list);
    }

    public static List l(List list, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return C8619os2.k(list, interfaceC3189Hs2);
    }

    public static List m(List list, Class cls) {
        return C6419fw2.a(list, cls);
    }

    public static List n(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static List o(List list) {
        return C6978iB2.f(list);
    }
}
