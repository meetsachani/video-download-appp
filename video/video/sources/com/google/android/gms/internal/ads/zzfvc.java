package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfvc {
    public static int a(int i, int i2, String str) {
        String b;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            b = zzfvt.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            b = zzfvt.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(b);
    }

    public static int b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(n(i, i2, "index"));
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object d(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfvt.b(str, obj2));
    }

    public static void e(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void f(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void g(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfvt.b(str, Character.valueOf(c)));
    }

    public static void h(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfvt.b(str, Long.valueOf(j)));
    }

    public static void i(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfvt.b(str, obj));
    }

    public static void j(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfvt.b(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void k(int i, int i2, int i3) {
        String n;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                n = zzfvt.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                n = n(i2, i3, "end index");
            }
        } else {
            n = n(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(n);
    }

    public static void l(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void m(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static String n(int i, int i2, String str) {
        if (i < 0) {
            return zzfvt.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzfvt.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
