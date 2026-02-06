package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class Ox2 extends TT1 {
    public static final Pattern f = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");
    public static final Pattern g = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    public static boolean q(String str) {
        if (str.contains(C4500Ve2.b)) {
            return false;
        }
        Matcher matcher = f.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = g.matcher(str);
        if (!matcher2.find() || matcher2.start() != 0) {
            return false;
        }
        return true;
    }

    @Override // o.TT1
    /* renamed from: r */
    public Nx2 k(QT1 qt1) {
        String c = TT1.c(qt1);
        if (!c.startsWith("URL:") && !c.startsWith("URI:")) {
            String trim = c.trim();
            if (!q(trim)) {
                return null;
            }
            return new Nx2(trim, null);
        }
        return new Nx2(c.substring(4).trim(), null);
    }
}
