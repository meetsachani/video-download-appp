package o;

import java.util.regex.Pattern;

/* renamed from: o.wa0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10498wa0 extends AbstractC10602x0 {
    public static final Pattern f = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    public static boolean s(String str) {
        if (str != null && f.matcher(str).matches() && str.indexOf(64) >= 0) {
            return true;
        }
        return false;
    }

    @Override // o.TT1
    /* renamed from: t */
    public C10009ua0 k(QT1 qt1) {
        String[] q;
        String c = TT1.c(qt1);
        if (!c.startsWith("MATMSG:") || (q = AbstractC10602x0.q("TO:", c, true)) == null) {
            return null;
        }
        for (String str : q) {
            if (!s(str)) {
                return null;
            }
        }
        return new C10009ua0(q, null, null, AbstractC10602x0.r("SUB:", c, false), AbstractC10602x0.r("BODY:", c, false));
    }
}
