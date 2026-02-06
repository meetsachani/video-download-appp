package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.iF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6991iF {
    public static Integer a = new Integer(1);
    public static final Collection b = C5024aB2.e(new ArrayList());

    public static boolean A(Collection collection) {
        return !x(collection);
    }

    public static boolean B(Collection collection, Collection collection2) {
        if (collection.size() < collection2.size() && C(collection, collection2)) {
            return true;
        }
        return false;
    }

    public static boolean C(Collection collection, Collection collection2) {
        Map r = r(collection);
        Map r2 = r(collection2);
        for (Object obj : collection) {
            if (s(obj, r) > s(obj, r2)) {
                return false;
            }
        }
        return true;
    }

    public static int D(Collection collection) {
        if (collection != null) {
            if (collection instanceof InterfaceC7856lp) {
                return ((InterfaceC7856lp) collection).q();
            }
            try {
                return XA2.f(collection).q();
            } catch (IllegalArgumentException unused) {
                return -1;
            }
        }
        throw new NullPointerException("The collection must not be null");
    }

    public static Collection E(Collection collection, JF1 jf1) {
        return WF1.e(collection, jf1);
    }

    public static Collection F(Collection collection, Collection collection2) {
        return C6937i11.g(collection, collection2);
    }

    public static Collection G(Collection collection, Collection collection2) {
        return C6937i11.h(collection, collection2);
    }

    public static void H(Object[] objArr) {
        int length = objArr.length - 1;
        for (int i = 0; length > i; i++) {
            Object obj = objArr[length];
            objArr[length] = objArr[i];
            objArr[i] = obj;
            length--;
        }
    }

    public static Collection I(Collection collection, JF1 jf1) {
        ArrayList arrayList = new ArrayList(collection.size());
        J(collection, jf1, arrayList);
        return arrayList;
    }

    public static void J(Collection collection, JF1 jf1, Collection collection2) {
        if (collection != null && jf1 != null) {
            for (Object obj : collection) {
                if (jf1.evaluate(obj)) {
                    collection2.add(obj);
                }
            }
        }
    }

    public static Collection K(Collection collection, JF1 jf1) {
        ArrayList arrayList = new ArrayList(collection.size());
        L(collection, jf1, arrayList);
        return arrayList;
    }

    public static void L(Collection collection, JF1 jf1, Collection collection2) {
        if (collection != null && jf1 != null) {
            for (Object obj : collection) {
                if (!jf1.evaluate(obj)) {
                    collection2.add(obj);
                }
            }
        }
    }

    public static int M(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        int i = 0;
        if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                i++;
                it.next();
            }
            return i;
        } else if (obj instanceof Enumeration) {
            Enumeration enumeration = (Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                i++;
                enumeration.nextElement();
            }
            return i;
        } else if (obj != null) {
            try {
                return Array.getLength(obj);
            } catch (IllegalArgumentException unused) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unsupported object type: ");
                stringBuffer.append(obj.getClass().getName());
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        } else {
            throw new IllegalArgumentException("Unsupported object type: null");
        }
    }

    public static boolean N(Object obj) {
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof Object[]) {
            if (((Object[]) obj).length != 0) {
                return false;
            }
            return true;
        } else if (obj instanceof Iterator) {
            return !((Iterator) obj).hasNext();
        } else {
            if (obj instanceof Enumeration) {
                return !((Enumeration) obj).hasMoreElements();
            }
            if (obj != null) {
                try {
                    if (Array.getLength(obj) != 0) {
                        return false;
                    }
                    return true;
                } catch (IllegalArgumentException unused) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Unsupported object type: ");
                    stringBuffer.append(obj.getClass().getName());
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            }
            throw new IllegalArgumentException("Unsupported object type: null");
        }
    }

    public static Collection O(Collection collection, Collection collection2) {
        ArrayList arrayList = new ArrayList(collection);
        for (Object obj : collection2) {
            arrayList.remove(obj);
        }
        return arrayList;
    }

    public static Collection P(Collection collection) {
        return C3349Jj2.d(collection);
    }

    public static void Q(Collection collection, InterfaceC3189Hs2 interfaceC3189Hs2) {
        if (collection != null && interfaceC3189Hs2 != null) {
            if (collection instanceof List) {
                ListIterator listIterator = ((List) collection).listIterator();
                while (listIterator.hasNext()) {
                    listIterator.set(interfaceC3189Hs2.a(listIterator.next()));
                }
                return;
            }
            Collection f = f(collection, interfaceC3189Hs2);
            collection.clear();
            collection.addAll(f);
        }
    }

    public static Collection R(Collection collection, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return C8132ms2.e(collection, interfaceC3189Hs2);
    }

    public static Collection S(Collection collection, Class cls) {
        return C6176ew2.a(collection, cls);
    }

    public static Collection T(Collection collection, Collection collection2) {
        ArrayList arrayList = new ArrayList();
        Map r = r(collection);
        Map r2 = r(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int max = Math.max(s(obj, r), s(obj, r2));
            for (int i = 0; i < max; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Collection U(Collection collection) {
        return C5024aB2.e(collection);
    }

    public static void a(Collection collection, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            collection.add(enumeration.nextElement());
        }
    }

    public static void b(Collection collection, Iterator it) {
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void c(Collection collection, Object[] objArr) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static boolean d(Collection collection, Object obj) {
        if (obj == null) {
            return false;
        }
        return collection.add(obj);
    }

    public static int e(Object obj, Collection collection) {
        if (collection instanceof Set) {
            return collection.contains(obj) ? 1 : 0;
        }
        if (collection instanceof InterfaceC3056Gk) {
            return ((InterfaceC3056Gk) collection).I(obj);
        }
        int i = 0;
        if (obj == null) {
            for (Object obj2 : collection) {
                if (obj2 == null) {
                    i++;
                }
            }
            return i;
        }
        for (Object obj3 : collection) {
            if (obj.equals(obj3)) {
                i++;
            }
        }
        return i;
    }

    public static Collection f(Collection collection, InterfaceC3189Hs2 interfaceC3189Hs2) {
        ArrayList arrayList = new ArrayList(collection.size());
        g(collection, interfaceC3189Hs2, arrayList);
        return arrayList;
    }

    public static Collection g(Collection collection, InterfaceC3189Hs2 interfaceC3189Hs2, Collection collection2) {
        if (collection != null) {
            return i(collection.iterator(), interfaceC3189Hs2, collection2);
        }
        return collection2;
    }

    public static Collection h(Iterator it, InterfaceC3189Hs2 interfaceC3189Hs2) {
        ArrayList arrayList = new ArrayList();
        i(it, interfaceC3189Hs2, arrayList);
        return arrayList;
    }

    public static Collection i(Iterator it, InterfaceC3189Hs2 interfaceC3189Hs2, Collection collection) {
        if (it != null && interfaceC3189Hs2 != null) {
            while (it.hasNext()) {
                collection.add(interfaceC3189Hs2.a(it.next()));
            }
        }
        return collection;
    }

    public static boolean j(Collection collection, Collection collection2) {
        if (collection.size() < collection2.size()) {
            for (Object obj : collection) {
                if (collection2.contains(obj)) {
                    return true;
                }
            }
            return false;
        }
        for (Object obj2 : collection2) {
            if (collection.contains(obj2)) {
                return true;
            }
        }
        return false;
    }

    public static int k(Collection collection, JF1 jf1) {
        int i = 0;
        if (collection != null && jf1 != null) {
            for (Object obj : collection) {
                if (jf1.evaluate(obj)) {
                    i++;
                }
            }
        }
        return i;
    }

    public static Collection l(Collection collection, Collection collection2) {
        ArrayList arrayList = new ArrayList();
        Map r = r(collection);
        Map r2 = r(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int max = Math.max(s(obj, r), s(obj, r2)) - Math.min(s(obj, r), s(obj, r2));
            for (int i = 0; i < max; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean m(Collection collection, JF1 jf1) {
        if (collection != null && jf1 != null) {
            for (Object obj : collection) {
                if (jf1.evaluate(obj)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void n(Collection collection, JF1 jf1) {
        if (collection != null && jf1 != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!jf1.evaluate(it.next())) {
                    it.remove();
                }
            }
        }
    }

    public static Object o(Collection collection, JF1 jf1) {
        if (collection != null && jf1 != null) {
            for (Object obj : collection) {
                if (jf1.evaluate(obj)) {
                    return obj;
                }
            }
            return null;
        }
        return null;
    }

    public static void p(Collection collection, InterfaceC8948qE interfaceC8948qE) {
        if (collection != null && interfaceC8948qE != null) {
            for (Object obj : collection) {
                interfaceC8948qE.a(obj);
            }
        }
    }

    public static Object q(Object obj, int i) {
        if (i >= 0) {
            if (obj instanceof Map) {
                return q(((Map) obj).entrySet().iterator(), i);
            }
            if (obj instanceof List) {
                return ((List) obj).get(i);
            }
            if (obj instanceof Object[]) {
                return ((Object[]) obj)[i];
            }
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    i--;
                    if (i == -1) {
                        return it.next();
                    }
                    it.next();
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Entry does not exist: ");
                stringBuffer.append(i);
                throw new IndexOutOfBoundsException(stringBuffer.toString());
            } else if (obj instanceof Collection) {
                return q(((Collection) obj).iterator(), i);
            } else {
                if (obj instanceof Enumeration) {
                    Enumeration enumeration = (Enumeration) obj;
                    while (enumeration.hasMoreElements()) {
                        i--;
                        if (i == -1) {
                            return enumeration.nextElement();
                        }
                        enumeration.nextElement();
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Entry does not exist: ");
                    stringBuffer2.append(i);
                    throw new IndexOutOfBoundsException(stringBuffer2.toString());
                } else if (obj != null) {
                    try {
                        return Array.get(obj, i);
                    } catch (IllegalArgumentException unused) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Unsupported object type: ");
                        stringBuffer3.append(obj.getClass().getName());
                        throw new IllegalArgumentException(stringBuffer3.toString());
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported object type: null");
                }
            }
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("Index cannot be negative: ");
        stringBuffer4.append(i);
        throw new IndexOutOfBoundsException(stringBuffer4.toString());
    }

    public static Map r(Collection collection) {
        HashMap hashMap = new HashMap();
        for (Object obj : collection) {
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                hashMap.put(obj, a);
            } else {
                hashMap.put(obj, new Integer(num.intValue() + 1));
            }
        }
        return hashMap;
    }

    public static final int s(Object obj, Map map) {
        Integer num = (Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static Object t(Object obj, int i) {
        return u(obj, new Integer(i));
    }

    public static Object u(Object obj, Object obj2) {
        int i;
        boolean z = obj instanceof Map;
        if (z) {
            Map map = (Map) obj;
            if (map.containsKey(obj2)) {
                return map.get(obj2);
            }
        }
        if (obj2 instanceof Integer) {
            i = ((Integer) obj2).intValue();
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (z) {
                return v(((Map) obj).keySet().iterator(), i);
            }
            if (obj instanceof List) {
                return ((List) obj).get(i);
            }
            if (obj instanceof Object[]) {
                return ((Object[]) obj)[i];
            }
            if (obj instanceof Enumeration) {
                Enumeration enumeration = (Enumeration) obj;
                while (enumeration.hasMoreElements()) {
                    i--;
                    if (i == -1) {
                        return enumeration.nextElement();
                    }
                    enumeration.nextElement();
                }
                return obj;
            } else if (obj instanceof Iterator) {
                return v((Iterator) obj, i);
            } else {
                if (obj instanceof Collection) {
                    return v(((Collection) obj).iterator(), i);
                }
                return obj;
            }
        }
        return obj;
    }

    public static Object v(Iterator it, int i) {
        while (it.hasNext()) {
            i--;
            if (i == -1) {
                return it.next();
            }
            it.next();
        }
        return it;
    }

    public static Collection w(Collection collection, Collection collection2) {
        ArrayList arrayList = new ArrayList();
        Map r = r(collection);
        Map r2 = r(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int min = Math.min(s(obj, r), s(obj, r2));
            for (int i = 0; i < min; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean x(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean y(Collection collection, Collection collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Map r = r(collection);
        Map r2 = r(collection2);
        if (r.size() != r2.size()) {
            return false;
        }
        for (Object obj : r.keySet()) {
            if (s(obj, r) != s(obj, r2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean z(Collection collection) {
        if (collection != null) {
            if (collection instanceof InterfaceC7856lp) {
                return ((InterfaceC7856lp) collection).s();
            }
            try {
                return XA2.f(collection).s();
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        throw new NullPointerException("The collection must not be null");
    }
}
