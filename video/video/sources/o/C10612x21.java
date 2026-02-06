package o;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: o.x21  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10612x21 {

    /* renamed from: o.x21$a */
    /* loaded from: classes.dex */
    public static class a {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: o.x21$b */
    /* loaded from: classes.dex */
    public static class b {
        public static C9637t21 a(Configuration configuration) {
            return C9637t21.c(configuration.getLocales().toLanguageTags());
        }
    }

    /* renamed from: o.x21$c */
    /* loaded from: classes.dex */
    public static class c {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    public static C9637t21 a(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object c2 = c(context);
            if (c2 != null) {
                return C9637t21.o(c.a(c2));
            }
            return C9637t21.g();
        }
        return C9637t21.c(C9042qd.b(context));
    }

    public static C9637t21 b(Configuration configuration) {
        return b.a(configuration);
    }

    public static Object c(Context context) {
        return context.getSystemService("locale");
    }

    public static C9637t21 d(Context context) {
        C9637t21 g = C9637t21.g();
        if (Build.VERSION.SDK_INT >= 33) {
            Object c2 = c(context);
            if (c2 != null) {
                return C9637t21.o(c.b(c2));
            }
            return g;
        }
        return b(Resources.getSystem().getConfiguration());
    }
}
