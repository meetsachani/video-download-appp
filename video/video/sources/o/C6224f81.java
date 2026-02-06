package o;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.f81  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6224f81 {
    public static final SortedMap a = IB2.d(new TreeMap());
    public static final String b = "    ";

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: o.f81$a */
    /* loaded from: classes4.dex */
    public static class a<K, V> extends I1<K, V> {
        public a(Map map) {
            super(map);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: o.f81$b */
    /* loaded from: classes4.dex */
    public static class b<K, V> extends AbstractC7670l3<K, V> {
        public b(SortedMap sortedMap) {
            super(sortedMap);
        }
    }

    public static <K> long A(Map<? super K, ?> map, K k) {
        Long y = y(map, k);
        if (y == null) {
            return 0L;
        }
        return y.longValue();
    }

    public static <K> long B(Map<? super K, ?> map, K k, long j) {
        Long y = y(map, k);
        if (y == null) {
            return j;
        }
        return y.longValue();
    }

    public static <K> Map<?, ?> C(Map<? super K, ?> map, K k) {
        Object obj;
        if (map != null && (obj = map.get(k)) != null && (obj instanceof Map)) {
            return (Map) obj;
        }
        return null;
    }

    public static <K> Map<?, ?> D(Map<? super K, ?> map, K k, Map<?, ?> map2) {
        Map<?, ?> C = C(map, k);
        if (C == null) {
            return map2;
        }
        return C;
    }

    public static <K> Number E(Map<? super K, ?> map, K k) {
        Object obj;
        if (map != null && (obj = map.get(k)) != null) {
            if (obj instanceof Number) {
                return (Number) obj;
            }
            if (obj instanceof String) {
                try {
                    return NumberFormat.getInstance().parse((String) obj);
                } catch (ParseException unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static <K> Number F(Map<? super K, ?> map, K k, Number number) {
        Number E = E(map, k);
        if (E == null) {
            return number;
        }
        return E;
    }

    public static <K, V> V G(Map<? super K, V> map, K k) {
        if (map != null) {
            return map.get(k);
        }
        return null;
    }

    public static <K, V> V H(Map<K, V> map, K k, V v) {
        V v2;
        if (map != null && (v2 = map.get(k)) != null) {
            return v2;
        }
        return v;
    }

    public static <K> Short I(Map<? super K, ?> map, K k) {
        Number E = E(map, k);
        if (E == null) {
            return null;
        }
        if (E instanceof Short) {
            return (Short) E;
        }
        return Short.valueOf(E.shortValue());
    }

    public static <K> Short J(Map<? super K, ?> map, K k, Short sh) {
        Short I = I(map, k);
        if (I == null) {
            return sh;
        }
        return I;
    }

    public static <K> short K(Map<? super K, ?> map, K k) {
        Short I = I(map, k);
        if (I == null) {
            return (short) 0;
        }
        return I.shortValue();
    }

    public static <K> short L(Map<? super K, ?> map, K k, short s) {
        Short I = I(map, k);
        if (I == null) {
            return s;
        }
        return I.shortValue();
    }

    public static <K> String M(Map<? super K, ?> map, K k) {
        Object obj;
        if (map != null && (obj = map.get(k)) != null) {
            return obj.toString();
        }
        return null;
    }

    public static <K> String N(Map<? super K, ?> map, K k, String str) {
        String M = M(map, k);
        if (M == null) {
            return str;
        }
        return M;
    }

    public static <K, V> Map<V, K> O(Map<K, V> map) {
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        return hashMap;
    }

    public static boolean P(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean Q(Map<?, ?> map) {
        return !P(map);
    }

    public static <K, V> WT0<K, V> R(Map<K, V> map) {
        if (map != null) {
            if (map instanceof WT0) {
                return (WT0) map;
            }
            return new a(map);
        }
        throw new NullPointerException("Map must not be null");
    }

    public static <K, V> YT0<K, V> S(SortedMap<K, V> sortedMap) {
        if (sortedMap != null) {
            if (sortedMap instanceof YT0) {
                return (YT0) sortedMap;
            }
            return new b(sortedMap);
        }
        throw new NullPointerException("Map must not be null");
    }

    public static <K, V> WT0<K, V> T(Map<K, V> map, InterfaceC5641ck0<? extends V> interfaceC5641ck0) {
        return C5113aZ0.c(map, interfaceC5641ck0);
    }

    public static <K, V> WT0<K, V> U(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        return C5113aZ0.d(map, interfaceC3287Is2);
    }

    public static <K, V> SortedMap<K, V> V(SortedMap<K, V> sortedMap, InterfaceC5641ck0<? extends V> interfaceC5641ck0) {
        return C5598cZ0.f(sortedMap, interfaceC5641ck0);
    }

    public static <K, V> SortedMap<K, V> W(SortedMap<K, V> sortedMap, InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        return C5598cZ0.g(sortedMap, interfaceC3287Is2);
    }

    @Deprecated
    public static <K, V> C6876hm1<K, V> X(Map<K, ? super Collection<V>> map) {
        return C6876hm1.i(map);
    }

    @Deprecated
    public static <K, V, C extends Collection<V>> C6876hm1<K, V> Y(Map<K, C> map, Class<C> cls) {
        return C6876hm1.j(map, cls);
    }

    @Deprecated
    public static <K, V, C extends Collection<V>> C6876hm1<K, V> Z(Map<K, C> map, InterfaceC5641ck0<C> interfaceC5641ck0) {
        return C6876hm1.k(map, interfaceC5641ck0);
    }

    public static void a(PrintStream printStream, Object obj, Map<?, ?> map) {
        u0(printStream, obj, map, new ArrayDeque(), true);
    }

    public static <K, V> InterfaceC9369rw1<K, V> a0(Map<K, V> map) {
        return X01.j(map);
    }

    public static <K, V> Map<K, V> b(Map<K, V> map) {
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        return map;
    }

    public static <K, V> void b0(Map<K, V> map, Iterable<? extends V> iterable, InterfaceC3287Is2<V, K> interfaceC3287Is2) {
        c0(map, iterable, interfaceC3287Is2, C3874Os2.p());
    }

    public static <K, V> WT0<K, V> c(Map<K, V> map) {
        return C2596Bu0.c(map);
    }

    public static <K, V, E> void c0(Map<K, V> map, Iterable<? extends E> iterable, InterfaceC3287Is2<E, K> interfaceC3287Is2, InterfaceC3287Is2<E, V> interfaceC3287Is22) {
        for (E e : iterable) {
            map.put(interfaceC3287Is2.a(e), interfaceC3287Is22.a(e));
        }
    }

    public static <K, V> SortedMap<K, V> d(SortedMap<K, V> sortedMap) {
        return C2792Du0.d(sortedMap);
    }

    public static <K, V> void d0(InterfaceC4818Yl1<K, V> interfaceC4818Yl1, Iterable<? extends V> iterable, InterfaceC3287Is2<V, K> interfaceC3287Is2) {
        e0(interfaceC4818Yl1, iterable, interfaceC3287Is2, C3874Os2.p());
    }

    public static <K> Boolean e(Map<? super K, ?> map, K k) {
        Object obj;
        if (map != null && (obj = map.get(k)) != null) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof String) {
                return Boolean.valueOf((String) obj);
            }
            if (obj instanceof Number) {
                if (((Number) obj).intValue() != 0) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            return null;
        }
        return null;
    }

    public static <K, V, E> void e0(InterfaceC4818Yl1<K, V> interfaceC4818Yl1, Iterable<? extends E> iterable, InterfaceC3287Is2<E, K> interfaceC3287Is2, InterfaceC3287Is2<E, V> interfaceC3287Is22) {
        for (E e : iterable) {
            interfaceC4818Yl1.put(interfaceC3287Is2.a(e), interfaceC3287Is22.a(e));
        }
    }

    public static <K> Boolean f(Map<? super K, ?> map, K k, Boolean bool) {
        Boolean e = e(map, k);
        if (e == null) {
            return bool;
        }
        return e;
    }

    public static <K, V> WT0<K, V> f0(Map<K, V> map, KF1<? super K> kf1, KF1<? super V> kf12) {
        return ZF1.e(map, kf1, kf12);
    }

    public static <K> boolean g(Map<? super K, ?> map, K k) {
        return Boolean.TRUE.equals(e(map, k));
    }

    public static <K, V> SortedMap<K, V> g0(SortedMap<K, V> sortedMap, KF1<? super K> kf1, KF1<? super V> kf12) {
        return C6997iG1.i(sortedMap, kf1, kf12);
    }

    public static <K> boolean h(Map<? super K, ?> map, K k, boolean z) {
        Boolean e = e(map, k);
        if (e == null) {
            return z;
        }
        return e.booleanValue();
    }

    public static void h0(PrintStream printStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print("    ");
        }
    }

    public static <K> Byte i(Map<? super K, ?> map, K k) {
        Number E = E(map, k);
        if (E == null) {
            return null;
        }
        if (E instanceof Byte) {
            return (Byte) E;
        }
        return Byte.valueOf(E.byteValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> i0(Map<K, V> map, Object[] objArr) {
        if (map != 0) {
            if (objArr != null && objArr.length != 0) {
                int i = 0;
                Object obj = objArr[0];
                if (obj instanceof Map.Entry) {
                    int length = objArr.length;
                    while (i < length) {
                        Map.Entry entry = (Map.Entry) objArr[i];
                        map.put(entry.getKey(), entry.getValue());
                        i++;
                    }
                } else if (obj instanceof JX0) {
                    int length2 = objArr.length;
                    while (i < length2) {
                        JX0 jx0 = (JX0) objArr[i];
                        map.put(jx0.getKey(), jx0.getValue());
                        i++;
                    }
                } else if (obj instanceof Object[]) {
                    for (int i2 = 0; i2 < objArr.length; i2++) {
                        Object[] objArr2 = (Object[]) objArr[i2];
                        if (objArr2 != null && objArr2.length >= 2) {
                            map.put(objArr2[0], objArr2[1]);
                        } else {
                            throw new IllegalArgumentException("Invalid array element: " + i2);
                        }
                    }
                } else {
                    while (i < objArr.length - 1) {
                        int i3 = i + 1;
                        Object obj2 = objArr[i];
                        i += 2;
                        map.put(obj2, objArr[i3]);
                    }
                }
            }
            return map;
        }
        throw new NullPointerException("The map must not be null");
    }

    public static <K> Byte j(Map<? super K, ?> map, K k, Byte b2) {
        Byte i = i(map, k);
        if (i == null) {
            return b2;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K> void j0(Map<? super K, Object> map, K k, Object obj) throws NullPointerException {
        if (obj == null) {
            obj = "";
        }
        map.put(k, obj);
    }

    public static <K> byte k(Map<? super K, ?> map, K k) {
        Byte i = i(map, k);
        if (i == null) {
            return (byte) 0;
        }
        return i.byteValue();
    }

    public static int k0(Map<?, ?> map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static <K> byte l(Map<? super K, ?> map, K k, byte b2) {
        Byte i = i(map, k);
        if (i == null) {
            return b2;
        }
        return i.byteValue();
    }

    public static <K, V> Map<K, V> l0(Map<K, V> map) {
        return Collections.synchronizedMap(map);
    }

    public static <K> Double m(Map<? super K, ?> map, K k) {
        Number E = E(map, k);
        if (E == null) {
            return null;
        }
        if (E instanceof Double) {
            return (Double) E;
        }
        return Double.valueOf(E.doubleValue());
    }

    public static <K, V> SortedMap<K, V> m0(SortedMap<K, V> sortedMap) {
        return Collections.synchronizedSortedMap(sortedMap);
    }

    public static <K> Double n(Map<? super K, ?> map, K k, Double d) {
        Double m = m(map, k);
        if (m == null) {
            return d;
        }
        return m;
    }

    public static Map<String, Object> n0(ResourceBundle resourceBundle) {
        Enumeration<String> keys = resourceBundle.getKeys();
        HashMap hashMap = new HashMap();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            hashMap.put(nextElement, resourceBundle.getObject(nextElement));
        }
        return hashMap;
    }

    public static <K> double o(Map<? super K, ?> map, K k) {
        Double m = m(map, k);
        if (m == null) {
            return 0.0d;
        }
        return m.doubleValue();
    }

    public static <K, V> Properties o0(Map<K, V> map) {
        Properties properties = new Properties();
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                properties.put(entry.getKey(), entry.getValue());
            }
        }
        return properties;
    }

    public static <K> double p(Map<? super K, ?> map, K k, double d) {
        Double m = m(map, k);
        if (m == null) {
            return d;
        }
        return m.doubleValue();
    }

    public static <K, V> WT0<K, V> p0(Map<K, V> map, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        return C9354rs2.j(map, interfaceC3287Is2, interfaceC3287Is22);
    }

    public static <K> Float q(Map<? super K, ?> map, K k) {
        Number E = E(map, k);
        if (E == null) {
            return null;
        }
        if (E instanceof Float) {
            return (Float) E;
        }
        return Float.valueOf(E.floatValue());
    }

    public static <K, V> SortedMap<K, V> q0(SortedMap<K, V> sortedMap, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        return C2688Cs2.m(sortedMap, interfaceC3287Is2, interfaceC3287Is22);
    }

    public static <K> Float r(Map<? super K, ?> map, K k, Float f) {
        Float q = q(map, k);
        if (q == null) {
            return f;
        }
        return q;
    }

    public static <K, V> Map<K, V> r0(Map<? extends K, ? extends V> map) {
        return C7966mB2.c(map);
    }

    public static <K> float s(Map<? super K, ?> map, K k) {
        Float q = q(map, k);
        if (q == null) {
            return 0.0f;
        }
        return q.floatValue();
    }

    public static <K, V> SortedMap<K, V> s0(SortedMap<K, ? extends V> sortedMap) {
        return IB2.d(sortedMap);
    }

    public static <K> float t(Map<? super K, ?> map, K k, float f) {
        Float q = q(map, k);
        if (q == null) {
            return f;
        }
        return q.floatValue();
    }

    public static void t0(PrintStream printStream, Object obj, Map<?, ?> map) {
        u0(printStream, obj, map, new ArrayDeque(), false);
    }

    public static <K> int u(Map<? super K, ?> map, K k) {
        Integer w = w(map, k);
        if (w == null) {
            return 0;
        }
        return w.intValue();
    }

    public static void u0(PrintStream printStream, Object obj, Map<?, ?> map, Deque<Map<?, ?>> deque, boolean z) {
        String str;
        h0(printStream, deque.size());
        if (map == null) {
            if (obj != null) {
                printStream.print(obj);
                printStream.print(" = ");
            }
            printStream.println("null");
            return;
        }
        if (obj != null) {
            printStream.print(obj);
            printStream.println(" = ");
        }
        h0(printStream, deque.size());
        printStream.println("{");
        deque.addLast(map);
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Map) && !deque.contains(value)) {
                if (key == null) {
                    key = "null";
                }
                u0(printStream, key, (Map) value, deque, z);
            } else {
                h0(printStream, deque.size());
                printStream.print(key);
                printStream.print(" = ");
                int x = ZT0.x(deque, QF1.h(value));
                if (x == -1) {
                    printStream.print(value);
                } else if (deque.size() - 1 == x) {
                    printStream.print("(this Map)");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(ancestor[");
                    sb.append(((deque.size() - 1) - x) - 1);
                    sb.append("] Map)");
                    printStream.print(sb.toString());
                }
                if (z && value != null) {
                    printStream.print(' ');
                    printStream.println(value.getClass().getName());
                } else {
                    printStream.println();
                }
            }
        }
        deque.removeLast();
        h0(printStream, deque.size());
        if (z) {
            str = "} " + map.getClass().getName();
        } else {
            str = "}";
        }
        printStream.println(str);
    }

    public static <K> int v(Map<? super K, ?> map, K k, int i) {
        Integer w = w(map, k);
        if (w == null) {
            return i;
        }
        return w.intValue();
    }

    public static <K> Integer w(Map<? super K, ?> map, K k) {
        Number E = E(map, k);
        if (E == null) {
            return null;
        }
        if (E instanceof Integer) {
            return (Integer) E;
        }
        return Integer.valueOf(E.intValue());
    }

    public static <K> Integer x(Map<? super K, ?> map, K k, Integer num) {
        Integer w = w(map, k);
        if (w == null) {
            return num;
        }
        return w;
    }

    public static <K> Long y(Map<? super K, ?> map, K k) {
        Number E = E(map, k);
        if (E == null) {
            return null;
        }
        if (E instanceof Long) {
            return (Long) E;
        }
        return Long.valueOf(E.longValue());
    }

    public static <K> Long z(Map<? super K, ?> map, K k, Long l) {
        Long y = y(map, k);
        if (y == null) {
            return l;
        }
        return y;
    }
}
