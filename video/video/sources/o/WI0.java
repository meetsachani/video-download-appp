package o;

import android.icu.util.ULocale;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public final class WI0 {
    public static final String a = "ICUCompat";
    public static Method b;
    public static Method c;

    /* loaded from: classes.dex */
    public static class a {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    public static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = c;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w(a, e);
        } catch (InvocationTargetException e2) {
            Log.w(a, e2);
        }
        return locale2;
    }

    public static String b(String str) {
        try {
            Method method = b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w(a, e);
        } catch (InvocationTargetException e2) {
            Log.w(a, e2);
        }
        return null;
    }

    public static String c(Locale locale) {
        return b.c(b.a(b.b(locale)));
    }
}
