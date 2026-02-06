package o;

import java.util.Arrays;

/* renamed from: o.gT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6562gT0 {

    @InterfaceC6480g82(version = "1.4")
    /* renamed from: o.gT0$a */
    /* loaded from: classes3.dex */
    public static class a {
    }

    public static <T extends Throwable> T A(T t) {
        return (T) B(t, C6562gT0.class.getName());
    }

    public static <T extends Throwable> T B(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static String C(String str, Object obj) {
        return str + obj;
    }

    public static void D() {
        throw ((AssertionError) A(new AssertionError()));
    }

    public static void E(String str) {
        throw ((AssertionError) A(new AssertionError(str)));
    }

    public static void F() {
        throw ((IllegalArgumentException) A(new IllegalArgumentException()));
    }

    public static void G(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(str)));
    }

    public static void H() {
        throw ((IllegalStateException) A(new IllegalStateException()));
    }

    public static void I(String str) {
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    @InterfaceC6480g82(version = "1.4")
    public static void J() {
        throw ((NullPointerException) A(new NullPointerException()));
    }

    @InterfaceC6480g82(version = "1.4")
    public static void K(String str) {
        throw ((NullPointerException) A(new NullPointerException(str)));
    }

    public static void L() {
        throw ((TX0) A(new TX0()));
    }

    public static void M(String str) {
        throw ((TX0) A(new TX0(str)));
    }

    public static void N(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(v(str))));
    }

    public static void O(String str) {
        throw ((NullPointerException) A(new NullPointerException(v(str))));
    }

    public static void P() {
        Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        throw ((C5505cA2) A(new C5505cA2(str)));
    }

    public static void S(String str) {
        R("lateinit property " + str + " has not been initialized");
    }

    @InterfaceC6480g82(version = "1.1")
    public static boolean a(double d, Double d2) {
        if (d2 != null && d == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.1")
    public static boolean b(float f, Float f2) {
        if (f2 != null && f == f2.floatValue()) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.1")
    public static boolean c(Double d, double d2) {
        if (d != null && d.doubleValue() == d2) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.1")
    public static boolean d(Double d, Double d2) {
        if (d == null) {
            if (d2 != null) {
                return false;
            }
            return true;
        } else if (d2 == null || d.doubleValue() != d2.doubleValue()) {
            return false;
        } else {
            return true;
        }
    }

    @InterfaceC6480g82(version = "1.1")
    public static boolean e(Float f, float f2) {
        if (f != null && f.floatValue() == f2) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.1")
    public static boolean f(Float f, Float f2) {
        if (f == null) {
            if (f2 != null) {
                return false;
            }
            return true;
        } else if (f2 == null || f.floatValue() != f2.floatValue()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(str + " must not be null")));
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    public static void j(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Field specified as non-null is null: " + str + UE.h + str2)));
    }

    public static void k(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + replace + " is not found. Please update the Kotlin runtime to the latest version", e)));
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + replace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e)));
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            J();
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            K(str);
        }
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) A(new NullPointerException(str + " must not be null")));
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            O(str);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            N(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    public static void s(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Method specified as non-null returned null: " + str + UE.h + str2)));
    }

    public static int t(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static int u(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public static String v(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C6562gT0.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + UE.h + methodName + ", parameter " + str;
    }

    public static void w() {
        P();
    }

    public static void x(String str) {
        Q(str);
    }

    public static void y(int i, String str) {
        P();
    }

    public static void z(int i, String str, String str2) {
        Q(str2);
    }
}
