package o;

import java.util.Objects;

/* renamed from: o.Ct1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2691Ct1 {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static int c(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T d(T t) {
        t.getClass();
        return t;
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String f(Object obj, String str) {
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }
}
