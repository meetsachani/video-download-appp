package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import o.MW0;

/* renamed from: o.zv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11313zv2 {
    public static int A(Object obj) {
        if (obj instanceof InterfaceC6976iB0) {
            return ((InterfaceC6976iB0) obj).getArity();
        }
        if (obj instanceof FA0) {
            return 0;
        }
        if (obj instanceof HA0) {
            return 1;
        }
        if (obj instanceof VA0) {
            return 2;
        }
        if (obj instanceof XA0) {
            return 3;
        }
        if (obj instanceof ZA0) {
            return 4;
        }
        if (obj instanceof InterfaceC5265bB0) {
            return 5;
        }
        if (obj instanceof InterfaceC5507cB0) {
            return 6;
        }
        if (obj instanceof InterfaceC5750dB0) {
            return 7;
        }
        if (obj instanceof InterfaceC5992eB0) {
            return 8;
        }
        if (obj instanceof InterfaceC6235fB0) {
            return 9;
        }
        if (obj instanceof GA0) {
            return 10;
        }
        if (obj instanceof IA0) {
            return 11;
        }
        if (obj instanceof JA0) {
            return 12;
        }
        if (obj instanceof KA0) {
            return 13;
        }
        if (obj instanceof LA0) {
            return 14;
        }
        if (obj instanceof MA0) {
            return 15;
        }
        if (obj instanceof NA0) {
            return 16;
        }
        if (obj instanceof OA0) {
            return 17;
        }
        if (obj instanceof PA0) {
            return 18;
        }
        if (obj instanceof QA0) {
            return 19;
        }
        if (obj instanceof SA0) {
            return 20;
        }
        if (obj instanceof TA0) {
            return 21;
        }
        if (obj instanceof UA0) {
            return 22;
        }
        return -1;
    }

    public static boolean B(Object obj, int i) {
        if ((obj instanceof InterfaceC5022aB0) && A(obj) == i) {
            return true;
        }
        return false;
    }

    public static boolean C(Object obj) {
        if (obj instanceof Collection) {
            if (!(obj instanceof GW0) || (obj instanceof HW0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean D(Object obj) {
        if (obj instanceof Iterable) {
            if (!(obj instanceof GW0) || (obj instanceof IW0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean E(Object obj) {
        if (obj instanceof Iterator) {
            if (!(obj instanceof GW0) || (obj instanceof JW0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean F(Object obj) {
        if (obj instanceof List) {
            if (!(obj instanceof GW0) || (obj instanceof KW0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean G(Object obj) {
        if (obj instanceof ListIterator) {
            if (!(obj instanceof GW0) || (obj instanceof LW0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean H(Object obj) {
        if (obj instanceof Map) {
            if (!(obj instanceof GW0) || (obj instanceof MW0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean I(Object obj) {
        if (obj instanceof Map.Entry) {
            if (!(obj instanceof GW0) || (obj instanceof MW0.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean J(Object obj) {
        if (obj instanceof Set) {
            if (!(obj instanceof GW0) || (obj instanceof RW0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static <T extends Throwable> T K(T t) {
        return (T) C6562gT0.B(t, C11313zv2.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        N(name + " cannot be cast to " + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof GW0) && !(obj instanceof HW0)) {
            M(obj, "kotlin.collections.MutableCollection");
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof GW0) && !(obj instanceof HW0)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof GW0) && !(obj instanceof IW0)) {
            M(obj, "kotlin.collections.MutableIterable");
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof GW0) && !(obj instanceof IW0)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof GW0) && !(obj instanceof JW0)) {
            M(obj, "kotlin.collections.MutableIterator");
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof GW0) && !(obj instanceof JW0)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof GW0) && !(obj instanceof KW0)) {
            M(obj, "kotlin.collections.MutableList");
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof GW0) && !(obj instanceof KW0)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof GW0) && !(obj instanceof LW0)) {
            M(obj, "kotlin.collections.MutableListIterator");
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof GW0) && !(obj instanceof LW0)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof GW0) && !(obj instanceof MW0)) {
            M(obj, "kotlin.collections.MutableMap");
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof GW0) && !(obj instanceof MW0)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof GW0) && !(obj instanceof MW0.a)) {
            M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof GW0) && !(obj instanceof MW0.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof GW0) && !(obj instanceof RW0)) {
            M(obj, "kotlin.collections.MutableSet");
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof GW0) && !(obj instanceof RW0)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i) {
        if (obj != null && !B(obj, i)) {
            M(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Object r(Object obj, int i, String str) {
        if (obj != null && !B(obj, i)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }
}
