package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public class G21 {
    public static final ConcurrentMap<String, List<Locale>> a = new ConcurrentHashMap();
    public static final ConcurrentMap<String, List<Locale>> b = new ConcurrentHashMap();

    /* loaded from: classes4.dex */
    public static class a {
        public static final List<Locale> a;
        public static final Set<Locale> b;

        static {
            ArrayList arrayList = new ArrayList(Arrays.asList(Locale.getAvailableLocales()));
            a = Collections.unmodifiableList(arrayList);
            b = Collections.unmodifiableSet(new HashSet(arrayList));
        }
    }

    public static List<Locale> a() {
        return a.a;
    }

    public static Set<Locale> b() {
        return a.b;
    }

    public static List<Locale> c(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        List<Locale> list = b.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            for (Locale locale : a()) {
                if (str.equals(locale.getLanguage()) && !locale.getCountry().isEmpty() && locale.getVariant().isEmpty()) {
                    arrayList.add(locale);
                }
            }
            List<Locale> unmodifiableList = Collections.unmodifiableList(arrayList);
            ConcurrentMap<String, List<Locale>> concurrentMap = b;
            concurrentMap.putIfAbsent(str, unmodifiableList);
            return concurrentMap.get(str);
        }
        return list;
    }

    public static boolean d(Locale locale) {
        return a().contains(locale);
    }

    public static boolean e(String str) {
        if (C4500Ve2.z0(str) && str.length() == 2) {
            return true;
        }
        return false;
    }

    public static boolean f(String str) {
        if (C4500Ve2.y0(str)) {
            if (str.length() == 2 || str.length() == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean g(String str) {
        if (C4500Ve2.O0(str) && str.length() == 3) {
            return true;
        }
        return false;
    }

    public static List<Locale> h(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        List<Locale> list = a.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            for (Locale locale : a()) {
                if (str.equals(locale.getCountry()) && locale.getVariant().isEmpty()) {
                    arrayList.add(locale);
                }
            }
            List<Locale> unmodifiableList = Collections.unmodifiableList(arrayList);
            ConcurrentMap<String, List<Locale>> concurrentMap = a;
            concurrentMap.putIfAbsent(str, unmodifiableList);
            return concurrentMap.get(str);
        }
        return list;
    }

    public static List<Locale> i(Locale locale) {
        return j(locale, locale);
    }

    public static List<Locale> j(Locale locale, Locale locale2) {
        ArrayList arrayList = new ArrayList(4);
        if (locale != null) {
            arrayList.add(locale);
            if (!locale.getVariant().isEmpty()) {
                arrayList.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            if (!locale.getCountry().isEmpty()) {
                arrayList.add(new Locale(locale.getLanguage(), ""));
            }
            if (!arrayList.contains(locale2)) {
                arrayList.add(locale2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Locale k(String str) {
        if (f(str)) {
            return new Locale(str);
        }
        String[] split = str.split(CrashlyticsReportPersistence.m, -1);
        String str2 = split[0];
        if (split.length == 2) {
            String str3 = split[1];
            if ((f(str2) && e(str3)) || g(str3)) {
                return new Locale(str2, str3);
            }
        } else if (split.length == 3) {
            String str4 = split[1];
            String str5 = split[2];
            if (f(str2) && ((str4.isEmpty() || e(str4) || g(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    public static Locale l(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (!str.contains("#")) {
            int length = str.length();
            if (length >= 2) {
                if (str.charAt(0) == '_') {
                    if (length >= 3) {
                        char charAt = str.charAt(1);
                        char charAt2 = str.charAt(2);
                        if (Character.isUpperCase(charAt) && Character.isUpperCase(charAt2)) {
                            if (length == 3) {
                                return new Locale("", str.substring(1, 3));
                            }
                            if (length >= 5) {
                                if (str.charAt(3) == '_') {
                                    return new Locale("", str.substring(1, 3), str.substring(4));
                                }
                                throw new IllegalArgumentException("Invalid locale format: " + str);
                            }
                            throw new IllegalArgumentException("Invalid locale format: " + str);
                        }
                        throw new IllegalArgumentException("Invalid locale format: " + str);
                    }
                    throw new IllegalArgumentException("Invalid locale format: " + str);
                }
                return k(str);
            }
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    public static Locale m(Locale locale) {
        if (locale != null) {
            return locale;
        }
        return Locale.getDefault();
    }
}
