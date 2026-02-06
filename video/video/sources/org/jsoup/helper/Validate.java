package org.jsoup.helper;

/* loaded from: classes4.dex */
public final class Validate {
    private Validate() {
    }

    public static boolean a(String str) {
        f(str);
        return false;
    }

    @Deprecated
    public static Object b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new ValidationException("Object must not be null");
    }

    @Deprecated
    public static Object c(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new ValidationException(String.format(str, objArr));
    }

    public static <T> T d(T t) {
        if (t != null) {
            return t;
        }
        throw new ValidationException("Object must not be null");
    }

    public static <T> T e(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new ValidationException(String.format(str, objArr));
    }

    public static void f(String str) {
        throw new ValidationException(str);
    }

    public static void g(String str, Object... objArr) {
        throw new ValidationException(String.format(str, objArr));
    }

    public static void h(boolean z) {
        if (!z) {
            return;
        }
        throw new ValidationException("Must be false");
    }

    public static void i(boolean z, String str) {
        if (!z) {
            return;
        }
        throw new ValidationException(str);
    }

    public static void j(boolean z) {
        if (z) {
            return;
        }
        throw new ValidationException("Must be true");
    }

    public static void k(boolean z, String str) {
        if (z) {
            return;
        }
        throw new ValidationException(str);
    }

    public static void l(Object[] objArr) {
        m(objArr, "Array must not contain any null objects");
    }

    public static void m(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new ValidationException(str);
            }
        }
    }

    public static void n(String str) {
        if (str != null && str.length() != 0) {
            return;
        }
        throw new ValidationException("String must not be empty");
    }

    public static void o(String str, String str2) {
        if (str != null && str.length() != 0) {
            return;
        }
        throw new ValidationException(str2);
    }

    public static void p(String str, String str2) {
        if (str != null && str.length() != 0) {
            return;
        }
        throw new ValidationException(String.format("The '%s' parameter must not be empty.", str2));
    }

    public static void q(Object obj) {
        if (obj != null) {
            return;
        }
        throw new ValidationException("Object must not be null");
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new ValidationException(str);
    }

    public static void s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new ValidationException(String.format("The parameter '%s' must not be null.", str));
    }

    public static void t(String str) {
        throw new IllegalStateException(str);
    }
}
