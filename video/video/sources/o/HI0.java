package o;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes2.dex */
public final class HI0 {
    public static final String a = "HttpUtil";
    public static final Pattern b = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern c = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @InterfaceC11300zs1
    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        long parseLong;
        if (!TextUtils.isEmpty(str)) {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                I31.d(a, "Unexpected Content-Length [" + str + C6566gU0.g);
            }
            if (TextUtils.isEmpty(str2)) {
                Matcher matcher = b.matcher(str2);
                if (matcher.matches()) {
                    try {
                        long parseLong2 = (Long.parseLong((String) C9542sf.g(matcher.group(2))) - Long.parseLong((String) C9542sf.g(matcher.group(1)))) + 1;
                        if (parseLong < 0) {
                            return parseLong2;
                        }
                        if (parseLong != parseLong2) {
                            I31.n(a, "Inconsistent headers [" + str + "] [" + str2 + C6566gU0.g);
                            return Math.max(parseLong, parseLong2);
                        }
                        return parseLong;
                    } catch (NumberFormatException unused2) {
                        I31.d(a, "Unexpected Content-Range [" + str2 + C6566gU0.g);
                        return parseLong;
                    }
                }
                return parseLong;
            }
            return parseLong;
        }
        parseLong = -1;
        if (TextUtils.isEmpty(str2)) {
        }
    }

    public static long c(@InterfaceC11300zs1 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = c.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        return Long.parseLong((String) C9542sf.g(matcher.group(1)));
    }
}
