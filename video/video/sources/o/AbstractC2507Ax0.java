package o;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.Ax0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2507Ax0<F extends Format> {
    public static final int b = -1;
    public static final ConcurrentMap<a, String> c = new ConcurrentHashMap(7);
    public final ConcurrentMap<a, F> a = new ConcurrentHashMap(7);

    /* renamed from: o.Ax0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public final Object[] a;
        public final int b;

        public a(Object... objArr) {
            this.a = objArr;
            this.b = a(objArr);
        }

        public static int a(Object[] objArr) {
            return 31 + Arrays.hashCode(objArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return Arrays.deepEquals(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.b;
        }
    }

    public static String g(Integer num, Integer num2, Locale locale) {
        DateFormat dateTimeInstance;
        Locale m = G21.m(locale);
        a aVar = new a(num, num2, m);
        ConcurrentMap<a, String> concurrentMap = c;
        String str = concurrentMap.get(aVar);
        if (str == null) {
            try {
                if (num == null) {
                    dateTimeInstance = DateFormat.getTimeInstance(num2.intValue(), m);
                } else if (num2 == null) {
                    dateTimeInstance = DateFormat.getDateInstance(num.intValue(), m);
                } else {
                    dateTimeInstance = DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), m);
                }
                String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
                String putIfAbsent = concurrentMap.putIfAbsent(aVar, pattern);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return pattern;
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("No date time pattern for locale: " + m);
            }
        }
        return str;
    }

    public abstract F a(String str, TimeZone timeZone, Locale locale);

    public F b(int i, TimeZone timeZone, Locale locale) {
        return d(Integer.valueOf(i), null, timeZone, locale);
    }

    public F c(int i, int i2, TimeZone timeZone, Locale locale) {
        return d(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }

    public final F d(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        Locale m = G21.m(locale);
        return f(g(num, num2, m), timeZone, m);
    }

    public F e() {
        return c(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public F f(String str, TimeZone timeZone, Locale locale) {
        C11147zE2.V(str, "pattern", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        Locale m = G21.m(locale);
        a aVar = new a(str, timeZone, m);
        F f = this.a.get(aVar);
        if (f == null) {
            F a2 = a(str, timeZone, m);
            F putIfAbsent = this.a.putIfAbsent(aVar, a2);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return a2;
        }
        return f;
    }

    public F h(int i, TimeZone timeZone, Locale locale) {
        return d(null, Integer.valueOf(i), timeZone, locale);
    }
}
