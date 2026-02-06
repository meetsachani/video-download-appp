package o;

import android.os.Build;
import android.os.LocaleList;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.util.Locale;

/* renamed from: o.t21  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9637t21 {
    public static final C9637t21 b = a(new Locale[0]);
    public final InterfaceC10123v21 a;

    /* renamed from: o.t21$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale) {
            for (Locale locale2 : a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String c = WI0.c(locale);
            if (c.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            }
            return c.equals(WI0.c(locale2));
        }
    }

    /* renamed from: o.t21$b */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public C9637t21(InterfaceC10123v21 interfaceC10123v21) {
        this.a = interfaceC10123v21;
    }

    public static C9637t21 a(Locale... localeArr) {
        return o(b.a(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains(CrashlyticsReportPersistence.m)) {
            String[] split2 = str.split(CrashlyticsReportPersistence.m, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + C6566gU0.g);
    }

    public static C9637t21 c(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = a.a(split[i]);
            }
            return a(localeArr);
        }
        return g();
    }

    public static C9637t21 e() {
        return o(b.b());
    }

    public static C9637t21 f() {
        return o(b.c());
    }

    public static C9637t21 g() {
        return b;
    }

    public static boolean k(Locale locale, Locale locale2) {
        boolean matchesLanguageAndScript;
        if (Build.VERSION.SDK_INT >= 33) {
            matchesLanguageAndScript = LocaleList.matchesLanguageAndScript(locale, locale2);
            return matchesLanguageAndScript;
        }
        return a.c(locale, locale2);
    }

    public static C9637t21 o(LocaleList localeList) {
        return new C9637t21(new C10369w21(localeList));
    }

    @Deprecated
    public static C9637t21 p(Object obj) {
        return o((LocaleList) obj);
    }

    public Locale d(int i) {
        return this.a.get(i);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9637t21) && this.a.equals(((C9637t21) obj).a)) {
            return true;
        }
        return false;
    }

    public Locale h(String[] strArr) {
        return this.a.d(strArr);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int i(Locale locale) {
        return this.a.a(locale);
    }

    public boolean j() {
        return this.a.isEmpty();
    }

    public int l() {
        return this.a.size();
    }

    public String m() {
        return this.a.b();
    }

    public Object n() {
        return this.a.c();
    }

    public String toString() {
        return this.a.toString();
    }
}
