package o;

import com.google.android.gms.stats.CodePackage;
import java.util.List;

/* renamed from: o.pE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8708pE2 extends TT1 {
    public static String q(CharSequence charSequence, String str, boolean z) {
        List<String> t = C8221nE2.t(charSequence, str, z, false);
        if (t != null && !t.isEmpty()) {
            return t.get(0);
        }
        return null;
    }

    public static String[] r(CharSequence charSequence, String str, boolean z) {
        List<List<String>> u = C8221nE2.u(charSequence, str, z, false);
        if (u != null && !u.isEmpty()) {
            int size = u.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = u.get(i).get(0);
            }
            return strArr;
        }
        return null;
    }

    public static String t(String str) {
        if (str != null) {
            if (str.startsWith(C8192n71.b) || str.startsWith("MAILTO:")) {
                return str.substring(7);
            }
            return str;
        }
        return str;
    }

    @Override // o.TT1
    /* renamed from: s */
    public C10573wt k(QT1 qt1) {
        double parseDouble;
        double parseDouble2;
        String c = TT1.c(qt1);
        if (c.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String q = q("SUMMARY", c, true);
        String q2 = q("DTSTART", c, true);
        if (q2 == null) {
            return null;
        }
        String q3 = q("DTEND", c, true);
        String q4 = q("DURATION", c, true);
        String q5 = q(CodePackage.D, c, true);
        String t = t(q("ORGANIZER", c, true));
        String[] r = r("ATTENDEE", c, true);
        if (r != null) {
            for (int i = 0; i < r.length; i++) {
                r[i] = t(r[i]);
            }
        }
        String q6 = q(C9642t32.W, c, true);
        String q7 = q("GEO", c, true);
        if (q7 == null) {
            parseDouble = Double.NaN;
            parseDouble2 = Double.NaN;
        } else {
            int indexOf = q7.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                parseDouble = Double.parseDouble(q7.substring(0, indexOf));
                parseDouble2 = Double.parseDouble(q7.substring(indexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new C10573wt(q, q2, q3, q4, q5, t, r, q6, parseDouble, parseDouble2);
    }
}
