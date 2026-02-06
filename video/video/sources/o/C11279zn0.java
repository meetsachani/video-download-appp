package o;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.zn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11279zn0 {
    public static final Pattern a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");
    public static final TimeZone b = new C6745hE0(false, 0, 0);

    public static TimeZone a() {
        return b;
    }

    public static TimeZone b(String str) {
        if (!"Z".equals(str) && !"UTC".equals(str)) {
            Matcher matcher = a.matcher(str);
            if (matcher.matches()) {
                int d = d(matcher.group(2));
                int d2 = d(matcher.group(4));
                if (d == 0 && d2 == 0) {
                    return b;
                }
                return new C6745hE0(e(matcher.group(1)), d, d2);
            }
            return null;
        }
        return b;
    }

    public static TimeZone c(String str) {
        TimeZone b2 = b(str);
        if (b2 != null) {
            return b2;
        }
        return TimeZone.getTimeZone(str);
    }

    public static int d(String str) {
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    public static boolean e(String str) {
        if (str == null || str.charAt(0) != '-') {
            return false;
        }
        return true;
    }
}
