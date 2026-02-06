package o;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class F21 {
    public static final String a = "F21";
    public static final String[] b = {"BS", "BZ", "KY", "PR", "PW", "US"};

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            DateFormat.HourCycle[] values;
            DateFormat.HourCycle hourCycle;
            int ordinal;
            DateFormat.HourCycle hourCycle2;
            int ordinal2;
            DateFormat.HourCycle hourCycle3;
            int ordinal3;
            DateFormat.HourCycle hourCycle4;
            int ordinal4;
            values = DateFormat.HourCycle.values();
            int[] iArr = new int[values.length];
            a = iArr;
            try {
                hourCycle4 = DateFormat.HourCycle.HOUR_CYCLE_11;
                ordinal4 = hourCycle4.ordinal();
                iArr[ordinal4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                hourCycle3 = DateFormat.HourCycle.HOUR_CYCLE_12;
                ordinal3 = hourCycle3.ordinal();
                iArr2[ordinal3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                hourCycle2 = DateFormat.HourCycle.HOUR_CYCLE_23;
                ordinal2 = hourCycle2.ordinal();
                iArr3[ordinal2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = a;
                hourCycle = DateFormat.HourCycle.HOUR_CYCLE_24;
                ordinal = hourCycle.ordinal();
                iArr4[ordinal] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static String a(Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        public static Locale b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static String a(Locale locale) {
            return b(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        public static String b(DateFormat.HourCycle hourCycle) {
            int i = a.a[hourCycle.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return "";
                        }
                        return f.e;
                    }
                    return f.d;
                }
                return f.c;
            }
            return f.b;
        }

        public static String c(Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            if (identifier.startsWith(g.c)) {
                return g.c;
            }
            return identifier;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static final String a = "ca";
        public static final String b = "chinese";
        public static final String c = "dangi";
        public static final String d = "gregorian";
        public static final String e = "hebrew";
        public static final String f = "indian";
        public static final String g = "islamic";
        public static final String h = "islamic-civil";
        public static final String i = "islamic-rgsa";
        public static final String j = "islamic-tbla";
        public static final String k = "islamic-umalqura";
        public static final String l = "persian";
        public static final String m = "";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static final String a = "fw";
        public static final String b = "sun";
        public static final String c = "mon";
        public static final String d = "tue";
        public static final String e = "wed";
        public static final String f = "thu";
        public static final String g = "fri";
        public static final String h = "sat";
        public static final String i = "";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static final String a = "hc";
        public static final String b = "h11";
        public static final String c = "h12";
        public static final String d = "h23";
        public static final String e = "h24";
        public static final String f = "";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static final String a = "mu";
        public static final String b = "celsius";
        public static final String c = "fahrenhe";
        public static final String d = "kelvin";
        public static final String e = "";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }
    }

    public static String a(Locale locale) {
        return p(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    public static String b(Locale locale) {
        if (android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains(C5738d80.e)) {
            return f.d;
        }
        return f.c;
    }

    public static String c() {
        return f(true);
    }

    public static String d(Locale locale) {
        return e(locale, true);
    }

    public static String e(Locale locale, boolean z) {
        String v = v(d.a, "", locale, z);
        if (v != null) {
            return v;
        }
        return b.a(locale);
    }

    public static String f(boolean z) {
        return e(b.b(), z);
    }

    public static Locale g() {
        return Locale.getDefault();
    }

    public static String h() {
        return k(true);
    }

    public static String i(Locale locale) {
        return j(locale, true);
    }

    public static String j(Locale locale, boolean z) {
        String v = v(e.a, "", locale, z);
        if (v != null) {
            return v;
        }
        return a(locale);
    }

    public static String k(boolean z) {
        return j(b.b(), z);
    }

    public static String l() {
        return o(true);
    }

    public static String m(Locale locale) {
        return n(locale, true);
    }

    public static String n(Locale locale, boolean z) {
        String v = v(f.a, "", locale, z);
        if (v != null) {
            return v;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a(locale);
        }
        return b(locale);
    }

    public static String o(boolean z) {
        return n(b.b(), z);
    }

    public static String p(int i) {
        String[] strArr = {e.b, e.c, e.d, e.e, e.f, e.g, e.h};
        if (i >= 1 && i <= 7) {
            return strArr[i - 1];
        }
        return "";
    }

    public static String q(Locale locale) {
        if (Arrays.binarySearch(b, locale.getCountry()) >= 0) {
            return g.c;
        }
        return g.b;
    }

    public static String r() {
        return u(true);
    }

    public static String s(Locale locale) {
        return t(locale, true);
    }

    public static String t(Locale locale, boolean z) {
        String v = v(g.a, "", locale, z);
        if (v != null) {
            return v;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return c.c(locale);
        }
        return q(locale);
    }

    public static String u(boolean z) {
        return t(b.b(), z);
    }

    public static String v(String str, String str2, Locale locale, boolean z) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (!z) {
            return str2;
        }
        return null;
    }
}
