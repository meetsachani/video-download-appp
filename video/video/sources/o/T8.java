package o;

/* loaded from: classes.dex */
public final class T8 {
    public static final Class<?> a = a("libcore.io.Memory");
    public static final boolean b;

    static {
        boolean z;
        if (a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        b = z;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return a;
    }

    public static boolean c() {
        if (a != null && !b) {
            return true;
        }
        return false;
    }
}
