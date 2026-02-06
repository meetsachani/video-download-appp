package o;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: o.vF1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10175vF1 {
    public static void a(boolean z) {
        b(z, "");
    }

    public static void b(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static String c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T extends Collection<Y>, Y> T d(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static <T> T e(T t) {
        return (T) f(t, "Argument must not be null");
    }

    public static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
