package o;

import android.os.Looper;
import android.text.TextUtils;

@Deprecated
/* renamed from: o.sf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9542sf {
    @JK1
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @JK1
    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @JK1
    public static int c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    @JK1
    public static void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Not in applications main thread");
    }

    @InterfaceC8557od0({"#1"})
    @JK1
    public static String e(@InterfaceC11300zs1 String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @InterfaceC8557od0({"#1"})
    @JK1
    public static String f(@InterfaceC11300zs1 String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @InterfaceC8557od0({"#1"})
    @JK1
    public static <T> T g(@InterfaceC11300zs1 T t) {
        t.getClass();
        return t;
    }

    @InterfaceC8557od0({"#1"})
    @JK1
    public static <T> T h(@InterfaceC11300zs1 T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @JK1
    public static void i(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    @JK1
    public static void j(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    @InterfaceC8557od0({"#1"})
    @JK1
    public static <T> T k(@InterfaceC11300zs1 T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @InterfaceC8557od0({"#1"})
    @JK1
    public static <T> T l(@InterfaceC11300zs1 T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
