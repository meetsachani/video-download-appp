package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes2.dex */
public final class CK2 {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");
    public static final String b = "WEBVTT";

    @InterfaceC11300zs1
    public static Matcher a(C3012Fy1 c3012Fy1) {
        String u;
        while (true) {
            String u2 = c3012Fy1.u();
            if (u2 != null) {
                if (a.matcher(u2).matches()) {
                    do {
                        u = c3012Fy1.u();
                        if (u != null) {
                        }
                    } while (!u.isEmpty());
                } else {
                    Matcher matcher = C10928yK2.f.matcher(u2);
                    if (matcher.matches()) {
                        return matcher;
                    }
                }
            } else {
                return null;
            }
        }
    }

    public static boolean b(C3012Fy1 c3012Fy1) {
        String u = c3012Fy1.u();
        if (u != null && u.startsWith(b)) {
            return true;
        }
        return false;
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) throws NumberFormatException {
        String[] K1 = TD2.K1(str, "\\.");
        long j = 0;
        for (String str2 : TD2.J1(K1[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (K1.length == 2) {
            j2 += Long.parseLong(K1[1]);
        }
        return j2 * 1000;
    }

    public static void e(C3012Fy1 c3012Fy1) throws C3989Py1 {
        int f = c3012Fy1.f();
        if (b(c3012Fy1)) {
            return;
        }
        c3012Fy1.Y(f);
        throw C3989Py1.a("Expected WEBVTT. Got " + c3012Fy1.u(), null);
    }
}
