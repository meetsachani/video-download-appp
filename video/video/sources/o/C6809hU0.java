package o;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: o.hU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6809hU0 {
    public static final NS1 a = C4482Va0.X;
    public static final PS1 b = C5120ab0.X;
    public static final InterfaceC9127qw1 c = C6588gb0.X;
    public static final V71 d = C5848db0.X;
    public static final InterfaceC10098uw1 e = C7074ib0.X;
    public static /* synthetic */ Class f;

    public static InterfaceC10098uw1 A() {
        return e;
    }

    public static Iterator B(Iterator it, JF1 jf1) {
        if (it != null) {
            if (jf1 != null) {
                return new C4360Ts0(it, jf1);
            }
            throw new NullPointerException("Predicate must not be null");
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static ListIterator C(ListIterator listIterator, JF1 jf1) {
        if (listIterator != null) {
            if (jf1 != null) {
                return new C4554Vs0(listIterator, jf1);
            }
            throw new NullPointerException("Predicate must not be null");
        }
        throw new NullPointerException("ListIterator must not be null");
    }

    public static Iterator D(Object obj) {
        if (obj == null) {
            return w();
        }
        if (obj instanceof Iterator) {
            return (Iterator) obj;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).iterator();
        }
        if (obj instanceof Object[]) {
            return new C4846Ys1((Object[]) obj);
        }
        if (obj instanceof Enumeration) {
            return new C4494Vd0((Enumeration) obj);
        }
        if (obj instanceof Map) {
            return ((Map) obj).values().iterator();
        }
        if (obj instanceof Dictionary) {
            return new C4494Vd0(((Dictionary) obj).elements());
        }
        if (obj.getClass().isArray()) {
            return new C8316ne(obj);
        }
        try {
            Method method = obj.getClass().getMethod("iterator", null);
            Class cls = f;
            if (cls == null) {
                cls = s("java.util.Iterator");
                f = cls;
            }
            if (cls.isAssignableFrom(method.getReturnType())) {
                Iterator it = (Iterator) method.invoke(obj, null);
                if (it != null) {
                    return it;
                }
            }
        } catch (Exception unused) {
        }
        return H(obj);
    }

    public static NS1 E(Collection collection) {
        if (collection != null) {
            return new C8671p51(collection);
        }
        throw new NullPointerException("Collection must not be null");
    }

    public static PS1 F(List list) {
        if (list != null) {
            return new C9163r51(list);
        }
        throw new NullPointerException("List must not be null");
    }

    public static Iterator G(Object obj, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C7145it1(obj, interfaceC3189Hs2);
    }

    public static NS1 H(Object obj) {
        return new E82(obj);
    }

    public static ListIterator I(Object obj) {
        return new G82(obj);
    }

    public static Object[] J(Iterator it) {
        if (it != null) {
            return M(it, 100).toArray();
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static Object[] K(Iterator it, Class cls) {
        if (it != null) {
            if (cls != null) {
                List M = M(it, 100);
                return M.toArray((Object[]) Array.newInstance(cls, M.size()));
            }
            throw new NullPointerException("Array class must not be null");
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static List L(Iterator it) {
        return M(it, 10);
    }

    public static List M(Iterator it, int i) {
        if (it != null) {
            if (i >= 1) {
                ArrayList arrayList = new ArrayList(i);
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                return arrayList;
            }
            throw new IllegalArgumentException("Estimated size must be greater than 0");
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static ListIterator N(Iterator it) {
        if (it != null) {
            return new U01(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static Iterator O(Iterator it, InterfaceC3189Hs2 interfaceC3189Hs2) {
        if (it != null) {
            if (interfaceC3189Hs2 != null) {
                return new C4649Wr2(it, interfaceC3189Hs2);
            }
            throw new NullPointerException("Transformer must not be null");
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static Iterator P(Iterator it) {
        return C5752dB2.b(it);
    }

    public static ListIterator Q(ListIterator listIterator) {
        return C7219jB2.b(listIterator);
    }

    public static V71 R(V71 v71) {
        return C9188rB2.b(v71);
    }

    public static NS1 a(Object obj) {
        return new C8316ne(obj);
    }

    public static NS1 b(Object obj, int i) {
        return new C8316ne(obj, i);
    }

    public static NS1 c(Object obj, int i, int i2) {
        return new C8316ne(obj, i, i2);
    }

    public static NS1 d(Object[] objArr) {
        return new C4846Ys1(objArr);
    }

    public static NS1 e(Object[] objArr, int i) {
        return new C4846Ys1(objArr, i);
    }

    public static NS1 f(Object[] objArr, int i, int i2) {
        return new C4846Ys1(objArr, i, i2);
    }

    public static PS1 g(Object obj) {
        return new C10513we(obj);
    }

    public static PS1 h(Object obj, int i) {
        return new C10513we(obj, i);
    }

    public static PS1 i(Object obj, int i, int i2) {
        return new C10513we(obj, i, i2);
    }

    public static PS1 j(Object[] objArr) {
        return new C5193at1(objArr);
    }

    public static PS1 k(Object[] objArr, int i) {
        return new C5193at1(objArr, i);
    }

    public static PS1 l(Object[] objArr, int i, int i2) {
        return new C5193at1(objArr, i, i2);
    }

    public static Enumeration m(Iterator it) {
        if (it != null) {
            return new C6068eU0(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static Iterator n(Enumeration enumeration) {
        if (enumeration != null) {
            return new C4494Vd0(enumeration);
        }
        throw new NullPointerException("Enumeration must not be null");
    }

    public static Iterator o(Enumeration enumeration, Collection collection) {
        if (enumeration != null) {
            if (collection != null) {
                return new C4494Vd0(enumeration, collection);
            }
            throw new NullPointerException("Collection must not be null");
        }
        throw new NullPointerException("Enumeration must not be null");
    }

    public static Iterator p(Collection collection) {
        return new C5583cU0(collection);
    }

    public static Iterator q(Iterator it, Iterator it2) {
        return new C5583cU0(it, it2);
    }

    public static Iterator r(Iterator[] itArr) {
        return new C5583cU0(itArr);
    }

    public static /* synthetic */ Class s(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    public static Iterator t(Comparator comparator, Collection collection) {
        return new ZE(comparator, collection);
    }

    public static Iterator u(Comparator comparator, Iterator it, Iterator it2) {
        return new ZE(comparator, it, it2);
    }

    public static Iterator v(Comparator comparator, Iterator[] itArr) {
        return new ZE(comparator, itArr);
    }

    public static NS1 w() {
        return a;
    }

    public static PS1 x() {
        return b;
    }

    public static V71 y() {
        return d;
    }

    public static InterfaceC9127qw1 z() {
        return c;
    }
}
