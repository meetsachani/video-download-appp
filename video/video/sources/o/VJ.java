package o;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public final class VJ {

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, C9637t21 c9637t21) {
            configuration.setLocales((LocaleList) c9637t21.n());
        }
    }

    public static C9637t21 a(Configuration configuration) {
        return C9637t21.o(a.a(configuration));
    }

    public static void b(Configuration configuration, C9637t21 c9637t21) {
        a.b(configuration, c9637t21);
    }
}
