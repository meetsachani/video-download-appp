package o;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.g81  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6479g81 {
    public static final Map a = C8209nB2.a(new HashMap(1));
    public static final SortedMap b = JB2.b(new TreeMap());
    public static final String c = "    ";

    public static long A(Map map, Object obj, long j) {
        Long x = x(map, obj);
        if (x == null) {
            return j;
        }
        return x.longValue();
    }

    public static Map B(Map map, Object obj) {
        Object obj2;
        if (map != null && (obj2 = map.get(obj)) != null && (obj2 instanceof Map)) {
            return (Map) obj2;
        }
        return null;
    }

    public static Map C(Map map, Object obj, Map map2) {
        Map B = B(map, obj);
        if (B == null) {
            return map2;
        }
        return B;
    }

    public static Number D(Map map, Object obj) {
        Object obj2;
        if (map != null && (obj2 = map.get(obj)) != null) {
            if (obj2 instanceof Number) {
                return (Number) obj2;
            }
            if (obj2 instanceof String) {
                try {
                    return NumberFormat.getInstance().parse((String) obj2);
                } catch (ParseException unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static Number E(Map map, Object obj, Number number) {
        Number D = D(map, obj);
        if (D == null) {
            return number;
        }
        return D;
    }

    public static Object F(Map map, Object obj) {
        if (map != null) {
            return map.get(obj);
        }
        return null;
    }

    public static Object G(Map map, Object obj, Object obj2) {
        Object obj3;
        if (map != null && (obj3 = map.get(obj)) != null) {
            return obj3;
        }
        return obj2;
    }

    public static Short H(Map map, Object obj) {
        Number D = D(map, obj);
        if (D == null) {
            return null;
        }
        if (D instanceof Short) {
            return (Short) D;
        }
        return new Short(D.shortValue());
    }

    public static Short I(Map map, Object obj, Short sh) {
        Short H = H(map, obj);
        if (H == null) {
            return sh;
        }
        return H;
    }

    public static short J(Map map, Object obj) {
        Short H = H(map, obj);
        if (H == null) {
            return (short) 0;
        }
        return H.shortValue();
    }

    public static short K(Map map, Object obj, short s) {
        Short H = H(map, obj);
        if (H == null) {
            return s;
        }
        return H.shortValue();
    }

    public static String L(Map map, Object obj) {
        Object obj2;
        if (map != null && (obj2 = map.get(obj)) != null) {
            return obj2.toString();
        }
        return null;
    }

    public static String M(Map map, Object obj, String str) {
        String L = L(map, obj);
        if (L == null) {
            return str;
        }
        return L;
    }

    public static Map N(Map map) {
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        return hashMap;
    }

    public static boolean O(Map map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean P(Map map) {
        return !O(map);
    }

    public static Map Q(Map map, InterfaceC5399bk0 interfaceC5399bk0) {
        return C5356bZ0.a(map, interfaceC5399bk0);
    }

    public static Map R(Map map, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return C5356bZ0.b(map, interfaceC3189Hs2);
    }

    public static SortedMap S(SortedMap sortedMap, InterfaceC5399bk0 interfaceC5399bk0) {
        return C5841dZ0.c(sortedMap, interfaceC5399bk0);
    }

    public static SortedMap T(SortedMap sortedMap, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return C5841dZ0.d(sortedMap, interfaceC3189Hs2);
    }

    public static void U(Exception exc) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("INFO: Exception: ");
        stringBuffer.append(exc);
        printStream.println(stringBuffer.toString());
    }

    public static Map V(Map map) {
        return C7360jm1.d(map);
    }

    public static Map W(Map map, Class cls) {
        return C7360jm1.e(map, cls);
    }

    public static Map X(Map map, InterfaceC5399bk0 interfaceC5399bk0) {
        return C7360jm1.f(map, interfaceC5399bk0);
    }

    public static Map Y(Map map) {
        return W01.b(map);
    }

    public static Map Z(Map map, JF1 jf1, JF1 jf12) {
        return C5043aG1.c(map, jf1, jf12);
    }

    public static void a(PrintStream printStream, Object obj, Map map) {
        p0(printStream, obj, map, new C3815Oe(), true);
    }

    public static SortedMap a0(SortedMap sortedMap, JF1 jf1, JF1 jf12) {
        return C7238jG1.e(sortedMap, jf1, jf12);
    }

    public static Map b(Map map) {
        return C2694Cu0.a(map);
    }

    public static void b0(PrintStream printStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print("    ");
        }
    }

    public static SortedMap c(SortedMap sortedMap) {
        return C2890Eu0.b(sortedMap);
    }

    public static Map c0(Map map, Object[] objArr) {
        map.size();
        if (objArr != null && objArr.length != 0) {
            int i = 0;
            Object obj = objArr[0];
            if (obj instanceof Map.Entry) {
                while (i < objArr.length) {
                    Map.Entry entry = (Map.Entry) objArr[i];
                    map.put(entry.getKey(), entry.getValue());
                    i++;
                }
            } else if (obj instanceof KX0) {
                while (i < objArr.length) {
                    KX0 kx0 = (KX0) objArr[i];
                    map.put(kx0.getKey(), kx0.getValue());
                    i++;
                }
            } else if (obj instanceof Object[]) {
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    Object[] objArr2 = (Object[]) objArr[i2];
                    if (objArr2 != null && objArr2.length >= 2) {
                        map.put(objArr2[0], objArr2[1]);
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Invalid array element: ");
                        stringBuffer.append(i2);
                        throw new IllegalArgumentException(stringBuffer.toString());
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

    public static Boolean d(Map map, Object obj) {
        Object obj2;
        if (map != null && (obj2 = map.get(obj)) != null) {
            if (obj2 instanceof Boolean) {
                return (Boolean) obj2;
            }
            if (obj2 instanceof String) {
                return new Boolean((String) obj2);
            }
            if (obj2 instanceof Number) {
                if (((Number) obj2).intValue() != 0) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            return null;
        }
        return null;
    }

    public static void d0(Map map, Object obj, Object obj2) throws NullPointerException {
        if (obj2 == null) {
            map.put(obj, "");
        } else {
            map.put(obj, obj2);
        }
    }

    public static Boolean e(Map map, Object obj, Boolean bool) {
        Boolean d = d(map, obj);
        if (d == null) {
            return bool;
        }
        return d;
    }

    public static Map e0(Map map) {
        return Collections.synchronizedMap(map);
    }

    public static boolean f(Map map, Object obj) {
        Boolean d = d(map, obj);
        if (d == null) {
            return false;
        }
        return d.booleanValue();
    }

    public static Map f0(SortedMap sortedMap) {
        return Collections.synchronizedSortedMap(sortedMap);
    }

    public static boolean g(Map map, Object obj, boolean z) {
        Boolean d = d(map, obj);
        if (d == null) {
            return z;
        }
        return d.booleanValue();
    }

    public static Map g0(ResourceBundle resourceBundle) {
        Enumeration<String> keys = resourceBundle.getKeys();
        HashMap hashMap = new HashMap();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            hashMap.put(nextElement, resourceBundle.getObject(nextElement));
        }
        return hashMap;
    }

    public static Byte h(Map map, Object obj) {
        Number D = D(map, obj);
        if (D == null) {
            return null;
        }
        if (D instanceof Byte) {
            return (Byte) D;
        }
        return new Byte(D.byteValue());
    }

    public static Properties h0(Map map) {
        Properties properties = new Properties();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                properties.put(entry.getKey(), entry.getValue());
            }
        }
        return properties;
    }

    public static Byte i(Map map, Object obj, Byte b2) {
        Byte h = h(map, obj);
        if (h == null) {
            return b2;
        }
        return h;
    }

    public static Map i0(Map map, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        return C9597ss2.c(map, interfaceC3189Hs2, interfaceC3189Hs22);
    }

    public static byte j(Map map, Object obj) {
        Byte h = h(map, obj);
        if (h == null) {
            return (byte) 0;
        }
        return h.byteValue();
    }

    public static SortedMap j0(SortedMap sortedMap, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        return C2786Ds2.i(sortedMap, interfaceC3189Hs2, interfaceC3189Hs22);
    }

    public static byte k(Map map, Object obj, byte b2) {
        Byte h = h(map, obj);
        if (h == null) {
            return b2;
        }
        return h.byteValue();
    }

    public static Map k0(Map map, Class cls, Class cls2) {
        return C6674gw2.a(map, cls, cls2);
    }

    public static Double l(Map map, Object obj) {
        Number D = D(map, obj);
        if (D == null) {
            return null;
        }
        if (D instanceof Double) {
            return (Double) D;
        }
        return new Double(D.doubleValue());
    }

    public static SortedMap l0(SortedMap sortedMap, Class cls, Class cls2) {
        return C7401jw2.a(sortedMap, cls, cls2);
    }

    public static Double m(Map map, Object obj, Double d) {
        Double l = l(map, obj);
        if (l == null) {
            return d;
        }
        return l;
    }

    public static Map m0(Map map) {
        return C8209nB2.a(map);
    }

    public static double n(Map map, Object obj) {
        Double l = l(map, obj);
        if (l == null) {
            return 0.0d;
        }
        return l.doubleValue();
    }

    public static Map n0(SortedMap sortedMap) {
        return JB2.b(sortedMap);
    }

    public static double o(Map map, Object obj, double d) {
        Double l = l(map, obj);
        if (l == null) {
            return d;
        }
        return l.doubleValue();
    }

    public static void o0(PrintStream printStream, Object obj, Map map) {
        p0(printStream, obj, map, new C3815Oe(), false);
    }

    public static Float p(Map map, Object obj) {
        Number D = D(map, obj);
        if (D == null) {
            return null;
        }
        if (D instanceof Float) {
            return (Float) D;
        }
        return new Float(D.floatValue());
    }

    public static void p0(PrintStream printStream, Object obj, Map map, C3815Oe c3815Oe, boolean z) {
        String str;
        b0(printStream, c3815Oe.size());
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
        b0(printStream, c3815Oe.size());
        printStream.println("{");
        c3815Oe.f(map);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Map) && !c3815Oe.contains(value)) {
                if (key == null) {
                    key = "null";
                }
                p0(printStream, key, (Map) value, c3815Oe, z);
            } else {
                b0(printStream, c3815Oe.size());
                printStream.print(key);
                printStream.print(" = ");
                int indexOf = c3815Oe.indexOf(value);
                if (indexOf == -1) {
                    printStream.print(value);
                } else if (c3815Oe.size() - 1 == indexOf) {
                    printStream.print("(this Map)");
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("(ancestor[");
                    stringBuffer.append(((c3815Oe.size() - 1) - indexOf) - 1);
                    stringBuffer.append("] Map)");
                    printStream.print(stringBuffer.toString());
                }
                if (z && value != null) {
                    printStream.print(' ');
                    printStream.println(value.getClass().getName());
                } else {
                    printStream.println();
                }
            }
        }
        c3815Oe.pop();
        b0(printStream, c3815Oe.size());
        if (z) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("} ");
            stringBuffer2.append(map.getClass().getName());
            str = stringBuffer2.toString();
        } else {
            str = "}";
        }
        printStream.println(str);
    }

    public static Float q(Map map, Object obj, Float f) {
        Float p = p(map, obj);
        if (p == null) {
            return f;
        }
        return p;
    }

    public static float r(Map map, Object obj) {
        Float p = p(map, obj);
        if (p == null) {
            return 0.0f;
        }
        return p.floatValue();
    }

    public static float s(Map map, Object obj, float f) {
        Float p = p(map, obj);
        if (p == null) {
            return f;
        }
        return p.floatValue();
    }

    public static int t(Map map, Object obj) {
        Integer v = v(map, obj);
        if (v == null) {
            return 0;
        }
        return v.intValue();
    }

    public static int u(Map map, Object obj, int i) {
        Integer v = v(map, obj);
        if (v == null) {
            return i;
        }
        return v.intValue();
    }

    public static Integer v(Map map, Object obj) {
        Number D = D(map, obj);
        if (D == null) {
            return null;
        }
        if (D instanceof Integer) {
            return (Integer) D;
        }
        return new Integer(D.intValue());
    }

    public static Integer w(Map map, Object obj, Integer num) {
        Integer v = v(map, obj);
        if (v == null) {
            return num;
        }
        return v;
    }

    public static Long x(Map map, Object obj) {
        Number D = D(map, obj);
        if (D == null) {
            return null;
        }
        if (D instanceof Long) {
            return (Long) D;
        }
        return new Long(D.longValue());
    }

    public static Long y(Map map, Object obj, Long l) {
        Long x = x(map, obj);
        if (x == null) {
            return l;
        }
        return x;
    }

    public static long z(Map map, Object obj) {
        Long x = x(map, obj);
        if (x == null) {
            return 0L;
        }
        return x.longValue();
    }
}
