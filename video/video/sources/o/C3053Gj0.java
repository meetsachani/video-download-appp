package o;

/* renamed from: o.Gj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3053Gj0 {
    public static final String a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";
    public static final Class<?> b = e();

    public static C3151Hj0 a() {
        if (b != null) {
            try {
                return c("newInstance");
            } catch (Exception unused) {
            }
        }
        return new C3151Hj0();
    }

    public static C3151Hj0 b() {
        if (b != null) {
            try {
                return c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C3151Hj0.g;
    }

    public static final C3151Hj0 c(String str) throws Exception {
        return (C3151Hj0) b.getDeclaredMethod(str, null).invoke(null, null);
    }

    public static boolean d(C3151Hj0 c3151Hj0) {
        Class<?> cls = b;
        if (cls != null && cls.isAssignableFrom(c3151Hj0.getClass())) {
            return true;
        }
        return false;
    }

    public static Class<?> e() {
        try {
            return Class.forName(a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
