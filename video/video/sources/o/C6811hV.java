package o;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.hV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6811hV {
    public static final TimeZone a = C11279zn0.a();
    public static final C8840pn0 b;
    @Deprecated
    public static final C8840pn0 c;
    public static final C8840pn0 d;
    @Deprecated
    public static final C8840pn0 e;
    public static final C8840pn0 f;
    @Deprecated
    public static final C8840pn0 g;
    @Deprecated
    public static final C8840pn0 h;
    @Deprecated
    public static final C8840pn0 i;
    @Deprecated
    public static final C8840pn0 j;
    public static final C8840pn0 k;
    @Deprecated
    public static final C8840pn0 l;
    public static final C8840pn0 m;
    @Deprecated
    public static final C8840pn0 n;

    /* renamed from: o  reason: collision with root package name */
    public static final C8840pn0 f761o;

    static {
        C8840pn0 y = C8840pn0.y("yyyy-MM-dd'T'HH:mm:ss");
        b = y;
        c = y;
        C8840pn0 y2 = C8840pn0.y("yyyy-MM-dd'T'HH:mm:ssZZ");
        d = y2;
        e = y2;
        C8840pn0 y3 = C8840pn0.y("yyyy-MM-dd");
        f = y3;
        g = y3;
        h = C8840pn0.y("yyyy-MM-ddZZ");
        i = C8840pn0.y("'T'HH:mm:ss");
        j = C8840pn0.y("'T'HH:mm:ssZZ");
        C8840pn0 y4 = C8840pn0.y("HH:mm:ss");
        k = y4;
        l = y4;
        C8840pn0 y5 = C8840pn0.y("HH:mm:ssZZ");
        m = y5;
        n = y5;
        f761o = C8840pn0.z("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    public static String a(long j2, String str) {
        return l(new Date(j2), str, null, null);
    }

    public static String b(long j2, String str, Locale locale) {
        return l(new Date(j2), str, null, locale);
    }

    public static String c(long j2, String str, TimeZone timeZone) {
        return l(new Date(j2), str, timeZone, null);
    }

    public static String d(long j2, String str, TimeZone timeZone, Locale locale) {
        return l(new Date(j2), str, timeZone, locale);
    }

    public static String e(Calendar calendar, String str) {
        return h(calendar, str, null, null);
    }

    public static String f(Calendar calendar, String str, Locale locale) {
        return h(calendar, str, null, locale);
    }

    public static String g(Calendar calendar, String str, TimeZone timeZone) {
        return h(calendar, str, timeZone, null);
    }

    public static String h(Calendar calendar, String str, TimeZone timeZone, Locale locale) {
        return C8840pn0.B(str, timeZone, locale).n(calendar);
    }

    public static String i(Date date, String str) {
        return l(date, str, null, null);
    }

    public static String j(Date date, String str, Locale locale) {
        return l(date, str, null, locale);
    }

    public static String k(Date date, String str, TimeZone timeZone) {
        return l(date, str, timeZone, null);
    }

    public static String l(Date date, String str, TimeZone timeZone, Locale locale) {
        return C8840pn0.B(str, timeZone, locale).i(date);
    }

    public static String m(long j2, String str) {
        return l(new Date(j2), str, a, null);
    }

    public static String n(long j2, String str, Locale locale) {
        return l(new Date(j2), str, a, locale);
    }

    public static String o(Date date, String str) {
        return l(date, str, a, null);
    }

    public static String p(Date date, String str, Locale locale) {
        return l(date, str, a, locale);
    }
}
