package o;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Supplier;

/* renamed from: o.zt1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11304zt1 {
    public static final char a = '@';
    public static final a b = new a();

    /* renamed from: o.zt1$a */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        private Object readResolve() {
            return C11304zt1.b;
        }
    }

    public static String A(Object obj) {
        if (obj == null) {
            return null;
        }
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        StringBuilder sb = new StringBuilder(name.length() + 1 + hexString.length());
        sb.append(name);
        sb.append(a);
        sb.append(hexString);
        return sb.toString();
    }

    public static void B(Appendable appendable, Object obj) throws IOException {
        C11147zE2.V(obj, "object", new Object[0]);
        appendable.append(obj.getClass().getName()).append(a).append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void C(StringBuffer stringBuffer, Object obj) {
        C11147zE2.V(obj, "object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(stringBuffer.length() + name.length() + 1 + hexString.length());
        stringBuffer.append(name);
        stringBuffer.append(a);
        stringBuffer.append(hexString);
    }

    public static void D(StringBuilder sb, Object obj) {
        C11147zE2.V(obj, "object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        sb.ensureCapacity(sb.length() + name.length() + 1 + hexString.length());
        sb.append(name);
        sb.append(a);
        sb.append(hexString);
    }

    @Deprecated
    public static void E(C7325jd2 c7325jd2, Object obj) {
        C11147zE2.V(obj, "object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        c7325jd2.C0(c7325jd2.length() + name.length() + 1 + hexString.length());
        c7325jd2.j(name).append(a).j(hexString);
    }

    public static boolean F(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            if (((CharSequence) obj).length() == 0) {
                return true;
            }
            return false;
        } else if (obj.getClass().isArray()) {
            if (Array.getLength(obj) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        } else {
            if (!(obj instanceof Map)) {
                return false;
            }
            return ((Map) obj).isEmpty();
        }
    }

    public static boolean G(Object obj) {
        return !F(obj);
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T H(T... tArr) {
        T t = null;
        if (tArr != null) {
            for (T t2 : tArr) {
                if (s(t2, t, false) > 0) {
                    t = t2;
                }
            }
        }
        return t;
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T I(T... tArr) {
        C11147zE2.Q(tArr);
        C11147zE2.G(tArr);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    @SafeVarargs
    public static <T> T J(Comparator<T> comparator, T... tArr) {
        C11147zE2.R(tArr, "null/empty items", new Object[0]);
        C11147zE2.G(tArr);
        C11147zE2.V(comparator, "comparator", new Object[0]);
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T K(T... tArr) {
        T t = null;
        if (tArr != null) {
            for (T t2 : tArr) {
                if (s(t2, t, true) < 0) {
                    t = t2;
                }
            }
        }
        return t;
    }

    @SafeVarargs
    public static <T> T L(T... tArr) {
        if (!C4206Se.x1(tArr)) {
            return null;
        }
        HashMap hashMap = new HashMap(tArr.length);
        int i = 0;
        for (T t : tArr) {
            C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(t);
            if (c5654cn1 == null) {
                hashMap.put(t, new C5654cn1(1));
            } else {
                c5654cn1.s();
            }
        }
        while (true) {
            T t2 = null;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((C5654cn1) entry.getValue()).intValue();
                if (intValue == i) {
                    break;
                } else if (intValue > i) {
                    t2 = (T) entry.getKey();
                    i = intValue;
                }
            }
            return t2;
        }
    }

    public static boolean M(Object obj, Object obj2) {
        return !u(obj, obj2);
    }

    public static <T> T N(T t) {
        return (T) O(t, "object");
    }

    public static <T> T O(T t, String str) {
        Objects.requireNonNull(t, str);
        if (!F(t)) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    @Deprecated
    public static String P(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Deprecated
    public static String Q(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return obj.toString();
    }

    public static String R(Object obj, Supplier<String> supplier) {
        if (obj == null) {
            if (supplier == null) {
                return null;
            }
            return supplier.get();
        }
        return obj.toString();
    }

    public static void S(final Object obj, Duration duration) throws InterruptedException {
        obj.getClass();
        C9660t80.a(new InterfaceC4619Wk0() { // from class: o.yt1
            @Override // o.InterfaceC4619Wk0
            public final void accept(Object obj2, Object obj3) {
                obj.wait(((Long) obj2).longValue(), ((Integer) obj3).intValue());
            }
        }, C9660t80.g(duration));
    }

    public static byte j(int i) {
        if (i >= -128 && i <= 127) {
            return (byte) i;
        }
        throw new IllegalArgumentException("Supplied value must be a valid byte literal between -128 and 127: [" + i + C6566gU0.g);
    }

    public static short k(int i) {
        if (i >= -32768 && i <= 32767) {
            return (short) i;
        }
        throw new IllegalArgumentException("Supplied value must be a valid byte literal between -32768 and 32767: [" + i + C6566gU0.g);
    }

    public static boolean l(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(Object... objArr) {
        return !n(objArr);
    }

    public static boolean n(Object... objArr) {
        if (v(objArr) != null) {
            return true;
        }
        return false;
    }

    public static boolean o(Object... objArr) {
        return !l(objArr);
    }

    public static <T> T p(T t) {
        if (!(t instanceof Cloneable)) {
            return null;
        }
        if (t.getClass().isArray()) {
            Class<?> componentType = t.getClass().getComponentType();
            if (componentType.isPrimitive()) {
                int length = Array.getLength(t);
                T t2 = (T) Array.newInstance(componentType, length);
                while (true) {
                    int i = length - 1;
                    if (length > 0) {
                        Array.set(t2, i, Array.get(t, i));
                        length = i;
                    } else {
                        return t2;
                    }
                }
            } else {
                return (T) ((Object[]) t).clone();
            }
        } else {
            try {
                return (T) t.getClass().getMethod("clone", null).invoke(t, null);
            } catch (IllegalAccessException e) {
                throw new OD("Cannot clone Cloneable type " + t.getClass().getName(), e);
            } catch (NoSuchMethodException e2) {
                throw new OD("Cloneable type " + t.getClass().getName() + " has no clone method", e2);
            } catch (InvocationTargetException e3) {
                throw new OD("Exception cloning Cloneable type " + t.getClass().getName(), e3.getCause());
            }
        }
    }

    public static <T> T q(T t) {
        T t2 = (T) p(t);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public static <T extends Comparable<? super T>> int r(T t, T t2) {
        return s(t, t2, false);
    }

    public static <T extends Comparable<? super T>> int s(T t, T t2, boolean z) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            if (!z) {
                return -1;
            }
            return 1;
        } else if (t2 == null) {
            if (z) {
                return -1;
            }
            return 1;
        } else {
            return t.compareTo(t2);
        }
    }

    public static <T> T t(T t, T t2) {
        if (t != null) {
            return t;
        }
        return t2;
    }

    @Deprecated
    public static boolean u(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    @SafeVarargs
    public static <T> T v(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                if (t != null) {
                    return t;
                }
            }
            return null;
        }
        return null;
    }

    @SafeVarargs
    public static <T> T w(Supplier<T>... supplierArr) {
        T t;
        if (supplierArr != null) {
            for (Supplier<T> supplier : supplierArr) {
                if (supplier != null && (t = supplier.get()) != null) {
                    return t;
                }
            }
            return null;
        }
        return null;
    }

    public static <T> T x(T t, Supplier<T> supplier) {
        if (t != null) {
            return t;
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    @Deprecated
    public static int y(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Deprecated
    public static int z(Object... objArr) {
        int i = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                i = (i * 31) + y(obj);
            }
        }
        return i;
    }

    public static byte a(byte b2) {
        return b2;
    }

    public static char b(char c) {
        return c;
    }

    public static double c(double d) {
        return d;
    }

    public static float d(float f) {
        return f;
    }

    public static int e(int i) {
        return i;
    }

    public static long f(long j) {
        return j;
    }

    public static <T> T g(T t) {
        return t;
    }

    public static short h(short s) {
        return s;
    }

    public static boolean i(boolean z) {
        return z;
    }
}
