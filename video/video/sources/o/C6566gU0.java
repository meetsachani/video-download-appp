package o;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: o.gU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6566gU0 {
    public static final MS1 a = C4579Wa0.X;
    public static final OS1 b = C4880Za0.X;
    public static final InterfaceC8877pw1 c = C6333fb0.X;
    public static final U71 d = C5605cb0.X;
    public static final InterfaceC9855tw1 e = C6831hb0.X;
    public static final String f = "[";
    public static final String g = "]";
    public static final String h = ", ";

    public static <E> MS1<E> A() {
        return C4579Wa0.c();
    }

    public static <E> OS1<E> B() {
        return C4880Za0.c();
    }

    public static <K, V> U71<K, V> C() {
        return C5605cb0.b();
    }

    public static <E> InterfaceC8877pw1<E> D() {
        return C6333fb0.b();
    }

    public static <K, V> InterfaceC9855tw1<K, V> E() {
        return C6831hb0.b();
    }

    public static <E> Iterator<E> F(Iterator<? extends E> it, KF1<? super E> kf1) {
        if (it != null) {
            if (kf1 != null) {
                return new C4263Ss0(it, kf1);
            }
            throw new NullPointerException("Predicate must not be null");
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> ListIterator<E> G(ListIterator<? extends E> listIterator, KF1<? super E> kf1) {
        if (listIterator != null) {
            if (kf1 != null) {
                return new C4457Us0(listIterator, kf1);
            }
            throw new NullPointerException("Predicate must not be null");
        }
        throw new NullPointerException("ListIterator must not be null");
    }

    public static <E> E H(Iterator<E> it, KF1<? super E> kf1) {
        if (kf1 != null) {
            if (it != null) {
                while (it.hasNext()) {
                    E next = it.next();
                    if (kf1.evaluate(next)) {
                        return next;
                    }
                }
                return null;
            }
            return null;
        }
        throw new NullPointerException("Predicate must not be null");
    }

    public static <E> E I(Iterator<E> it) {
        return (E) L(it, 0);
    }

    public static <E> void J(Iterator<E> it, InterfaceC8705pE<? super E> interfaceC8705pE) {
        if (interfaceC8705pE != null) {
            if (it != null) {
                while (it.hasNext()) {
                    interfaceC8705pE.a(it.next());
                }
                return;
            }
            return;
        }
        throw new NullPointerException("Closure must not be null");
    }

    public static <E> E K(Iterator<E> it, InterfaceC8705pE<? super E> interfaceC8705pE) {
        if (interfaceC8705pE != null) {
            if (it != null) {
                while (it.hasNext()) {
                    E next = it.next();
                    if (it.hasNext()) {
                        interfaceC8705pE.a(next);
                    } else {
                        return next;
                    }
                }
                return null;
            }
            return null;
        }
        throw new NullPointerException("Closure must not be null.");
    }

    public static <E> E L(Iterator<E> it, int i) {
        C6748hF.g(i);
        while (it.hasNext()) {
            i--;
            if (i == -1) {
                return it.next();
            }
            it.next();
        }
        throw new IndexOutOfBoundsException("Entry does not exist: " + i);
    }

    public static Iterator<?> M(Object obj) {
        if (obj == null) {
            return A();
        }
        if (obj instanceof Iterator) {
            return (Iterator) obj;
        }
        if (obj instanceof Iterable) {
            return ((Iterable) obj).iterator();
        }
        if (obj instanceof Object[]) {
            return new C4749Xs1((Object[]) obj);
        }
        if (obj instanceof Enumeration) {
            return new C4397Ud0((Enumeration) obj);
        }
        if (obj instanceof Map) {
            return ((Map) obj).values().iterator();
        }
        if (obj instanceof NodeList) {
            return new C4353Tq1((NodeList) obj);
        }
        if (obj instanceof Node) {
            return new C4353Tq1((Node) obj);
        }
        if (obj instanceof Dictionary) {
            return new C4397Ud0(((Dictionary) obj).elements());
        }
        if (obj.getClass().isArray()) {
            return new C8560oe(obj);
        }
        try {
            Method method = obj.getClass().getMethod("iterator", null);
            if (Iterator.class.isAssignableFrom(method.getReturnType())) {
                Iterator<?> it = (Iterator) method.invoke(obj, null);
                if (it != null) {
                    return it;
                }
            }
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return Y(obj);
    }

    public static <E> int N(Iterator<E> it, KF1<? super E> kf1) {
        if (kf1 != null) {
            if (it != null) {
                int i = 0;
                while (it.hasNext()) {
                    if (kf1.evaluate(it.next())) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            return -1;
        }
        throw new NullPointerException("Predicate must not be null");
    }

    public static boolean O(Iterator<?> it) {
        if (it != null && it.hasNext()) {
            return false;
        }
        return true;
    }

    public static <E> MS1<E> P(Collection<? extends E> collection) {
        if (collection != null) {
            return new C8427o51(collection);
        }
        throw new NullPointerException("Collection must not be null");
    }

    public static <E> OS1<E> Q(List<E> list) {
        if (list != null) {
            return new C8914q51(list);
        }
        throw new NullPointerException("List must not be null");
    }

    public static <E> boolean R(Iterator<E> it, KF1<? super E> kf1) {
        if (kf1 != null) {
            if (it != null) {
                while (it.hasNext()) {
                    if (!kf1.evaluate(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        throw new NullPointerException("Predicate must not be null");
    }

    public static <E> boolean S(Iterator<E> it, KF1<? super E> kf1) {
        if (N(it, kf1) != -1) {
            return true;
        }
        return false;
    }

    public static C4353Tq1 T(Node node) {
        if (node != null) {
            return new C4353Tq1(node);
        }
        throw new NullPointerException("Node must not be null");
    }

    public static C4353Tq1 U(NodeList nodeList) {
        if (nodeList != null) {
            return new C4353Tq1(nodeList);
        }
        throw new NullPointerException("NodeList must not be null");
    }

    public static <E> Iterator<E> V(E e2, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C6904ht1(e2, interfaceC3287Is2);
    }

    public static <E> Iterator<E> W(Iterator<? extends E> it) {
        return C8455oC1.d(it);
    }

    public static <E> Iterator<E> X(Iterator<? extends E> it) {
        return NK1.c(it);
    }

    public static <E> MS1<E> Y(E e2) {
        return new D82(e2);
    }

    public static <E> ListIterator<E> Z(E e2) {
        return new F82(e2);
    }

    public static <E> MS1<E> a(Object obj) {
        return new C8560oe(obj);
    }

    public static int a0(Iterator<?> it) {
        int i = 0;
        if (it != null) {
            while (it.hasNext()) {
                it.next();
                i++;
            }
        }
        return i;
    }

    public static <E> MS1<E> b(Object obj, int i) {
        return new C8560oe(obj, i);
    }

    public static <E> C5016a92<E> b0(Iterator<E> it, long j) {
        return new C5016a92<>(it, j);
    }

    public static <E> MS1<E> c(Object obj, int i, int i2) {
        return new C8560oe(obj, i, i2);
    }

    public static Object[] c0(Iterator<?> it) {
        if (it != null) {
            return f0(it, 100).toArray();
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> MS1<E> d(E... eArr) {
        return new C4749Xs1(eArr);
    }

    public static <E> E[] d0(Iterator<? extends E> it, Class<E> cls) {
        if (it != null) {
            if (cls != null) {
                List f0 = f0(it, 100);
                return (E[]) f0.toArray((Object[]) Array.newInstance((Class<?>) cls, f0.size()));
            }
            throw new NullPointerException("Array class must not be null");
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> MS1<E> e(E[] eArr, int i) {
        return new C4749Xs1(eArr, i);
    }

    public static <E> List<E> e0(Iterator<? extends E> it) {
        return f0(it, 10);
    }

    public static <E> MS1<E> f(E[] eArr, int i, int i2) {
        return new C4749Xs1(eArr, i, i2);
    }

    public static <E> List<E> f0(Iterator<? extends E> it, int i) {
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

    public static <E> OS1<E> g(Object obj) {
        return new C10267ve(obj);
    }

    public static <E> ListIterator<E> g0(Iterator<? extends E> it) {
        if (it != null) {
            return new T01(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> OS1<E> h(Object obj, int i) {
        return new C10267ve(obj, i);
    }

    public static <E> String h0(Iterator<E> it) {
        return j0(it, C3874Os2.r(), h, f, g);
    }

    public static <E> OS1<E> i(Object obj, int i, int i2) {
        return new C10267ve(obj, i, i2);
    }

    public static <E> String i0(Iterator<E> it, InterfaceC3287Is2<? super E, String> interfaceC3287Is2) {
        return j0(it, interfaceC3287Is2, h, f, g);
    }

    public static <E> OS1<E> j(E... eArr) {
        return new C4953Zs1(eArr);
    }

    public static <E> String j0(Iterator<E> it, InterfaceC3287Is2<? super E, String> interfaceC3287Is2, String str, String str2, String str3) {
        if (interfaceC3287Is2 != null) {
            if (str != null) {
                if (str2 != null) {
                    if (str3 != null) {
                        StringBuilder sb = new StringBuilder(str2);
                        if (it != null) {
                            while (it.hasNext()) {
                                sb.append(interfaceC3287Is2.a(it.next()));
                                sb.append(str);
                            }
                            if (sb.length() > str2.length()) {
                                sb.setLength(sb.length() - str.length());
                            }
                        }
                        sb.append(str3);
                        return sb.toString();
                    }
                    throw new NullPointerException("suffix may not be null");
                }
                throw new NullPointerException("prefix may not be null");
            }
            throw new NullPointerException("delimiter may not be null");
        }
        throw new NullPointerException("transformer may not be null");
    }

    public static <E> OS1<E> k(E[] eArr, int i) {
        return new C4953Zs1(eArr, i);
    }

    public static <I, O> Iterator<O> k0(Iterator<? extends I> it, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        if (it != null) {
            if (interfaceC3287Is2 != null) {
                return new C4552Vr2(it, interfaceC3287Is2);
            }
            throw new NullPointerException("Transformer must not be null");
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> OS1<E> l(E[] eArr, int i, int i2) {
        return new C4953Zs1(eArr, i, i2);
    }

    public static <E> Iterator<E> l0(Iterator<E> it) {
        return C5994eB2.b(it);
    }

    public static <E> Enumeration<E> m(Iterator<? extends E> it) {
        if (it != null) {
            return new C5826dU0(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> ListIterator<E> m0(ListIterator<E> listIterator) {
        return C7462kB2.b(listIterator);
    }

    public static <E> Iterable<E> n(Iterator<? extends E> it) {
        if (it != null) {
            return new C6311fU0(it, false);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <K, V> U71<K, V> n0(U71<K, V> u71) {
        return C8939qB2.b(u71);
    }

    public static <E> Iterator<E> o(Enumeration<? extends E> enumeration) {
        if (enumeration != null) {
            return new C4397Ud0(enumeration);
        }
        throw new NullPointerException("Enumeration must not be null");
    }

    public static <E> C8018mO2<E> o0(Iterator<? extends E> it, Iterator<? extends E> it2) {
        return new C8018mO2<>(it, it2);
    }

    public static <E> Iterator<E> p(Enumeration<? extends E> enumeration, Collection<? super E> collection) {
        if (enumeration != null) {
            if (collection != null) {
                return new C4397Ud0(enumeration, collection);
            }
            throw new NullPointerException("Collection must not be null");
        }
        throw new NullPointerException("Enumeration must not be null");
    }

    public static <E> C8018mO2<E> p0(Iterator<? extends E> it, Iterator<? extends E> it2, Iterator<? extends E> it3) {
        return new C8018mO2<>(it, it2, it3);
    }

    public static <E> Iterable<E> q(Iterator<? extends E> it) {
        if (it != null) {
            return new C6311fU0(it, true);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> C8018mO2<E> q0(Iterator<? extends E>... itArr) {
        return new C8018mO2<>(itArr);
    }

    public static <E> C9339rp<E> r(Iterator<? extends E> it, long j) {
        return s(it, 0L, j);
    }

    public static <E> C9339rp<E> s(Iterator<? extends E> it, long j, long j2) {
        return new C9339rp<>(it, j, j2);
    }

    public static <E> Iterator<E> t(Collection<Iterator<? extends E>> collection) {
        return new C5341bU0(collection);
    }

    public static <E> Iterator<E> u(Iterator<? extends E> it, Iterator<? extends E> it2) {
        return new C5341bU0(it, it2);
    }

    public static <E> Iterator<E> v(Iterator<? extends E>... itArr) {
        return new C5341bU0(itArr);
    }

    public static <E> Iterator<E> w(Comparator<? super E> comparator, Collection<Iterator<? extends E>> collection) {
        if (comparator == null) {
            comparator = C7726lH.a;
        }
        return new YE(comparator, collection);
    }

    public static <E> Iterator<E> x(Comparator<? super E> comparator, Iterator<? extends E> it, Iterator<? extends E> it2) {
        if (comparator == null) {
            comparator = C7726lH.a;
        }
        return new YE(comparator, it, it2);
    }

    public static <E> Iterator<E> y(Comparator<? super E> comparator, Iterator<? extends E>... itArr) {
        if (comparator == null) {
            comparator = C7726lH.a;
        }
        return new YE(comparator, itArr);
    }

    public static <E> boolean z(Iterator<E> it, Object obj) {
        return S(it, C5375be0.b(obj));
    }
}
