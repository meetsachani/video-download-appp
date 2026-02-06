package o;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.C7025iN1;

/* renamed from: o.zD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11143zD2 {
    public static final String a = "UTC";
    public static AtomicReference<C4831Yo2> b = new AtomicReference<>();

    @TargetApi(24)
    public static DateFormat A(Locale locale) {
        return d("yMMMM", locale);
    }

    @TargetApi(24)
    public static DateFormat B(Locale locale) {
        return d("yMMMMEEEEd", locale);
    }

    @InterfaceC5670cr1
    public static String C(@InterfaceC5670cr1 String str) {
        int b2 = b(str, "yY", 1, 0);
        if (b2 >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b3 = b(str, "EMd", 1, b2);
        if (b3 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(b(str, str2, -1, b2) + 1, b3), C4500Ve2.b).trim();
    }

    public static void D(@InterfaceC11300zs1 C4831Yo2 c4831Yo2) {
        b.set(c4831Yo2);
    }

    public static long a(long j) {
        Calendar x = x();
        x.setTimeInMillis(j);
        return f(x).getTimeInMillis();
    }

    public static int b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 >= 0 && i2 < str.length()) {
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return d("MMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat d(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(w());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    @InterfaceC5670cr1
    public static String e(@InterfaceC5670cr1 String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    public static Calendar f(Calendar calendar) {
        Calendar y = y(calendar);
        Calendar x = x();
        x.set(y.get(1), y.get(2), y.get(5));
        return x;
    }

    public static SimpleDateFormat g() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(e(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(u());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String h(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C7025iN1.m.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C7025iN1.m.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C7025iN1.m.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", C5738d80.b);
        }
        return pattern.replace("d", string3).replace("M", string2).replace(C5738d80.b, string);
    }

    public static java.text.DateFormat i(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(u());
        return dateInstance;
    }

    public static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }

    public static java.text.DateFormat k(Locale locale) {
        return i(0, locale);
    }

    public static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    public static java.text.DateFormat m(Locale locale) {
        return i(2, locale);
    }

    public static java.text.DateFormat n() {
        return o(Locale.getDefault());
    }

    public static java.text.DateFormat o(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m(locale);
        simpleDateFormat.applyPattern(C(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    @TargetApi(24)
    public static DateFormat p(Locale locale) {
        return d("MMMMEEEEd", locale);
    }

    public static java.text.DateFormat q(@InterfaceC5670cr1 java.text.DateFormat dateFormat) {
        java.text.DateFormat dateFormat2 = (java.text.DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(u());
        return dateFormat2;
    }

    public static SimpleDateFormat r(String str) {
        return s(str, Locale.getDefault());
    }

    public static SimpleDateFormat s(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(u());
        return simpleDateFormat;
    }

    public static C4831Yo2 t() {
        C4831Yo2 c4831Yo2 = b.get();
        if (c4831Yo2 == null) {
            return C4831Yo2.e();
        }
        return c4831Yo2;
    }

    public static TimeZone u() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar v() {
        Calendar c = t().c();
        c.set(11, 0);
        c.set(12, 0);
        c.set(13, 0);
        c.set(14, 0);
        c.setTimeZone(u());
        return c;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone w() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar x() {
        return y(null);
    }

    public static Calendar y(@InterfaceC11300zs1 Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(u());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat z(Locale locale) {
        return d("yMMMd", locale);
    }
}
