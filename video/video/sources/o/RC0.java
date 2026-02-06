package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class RC0 extends TT1 {
    public static final Pattern f = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    @Override // o.TT1
    /* renamed from: q */
    public QC0 k(QT1 qt1) {
        Matcher matcher = f.matcher(TT1.c(qt1));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d && parseDouble >= -90.0d) {
                double parseDouble2 = Double.parseDouble(matcher.group(2));
                if (parseDouble2 <= 180.0d && parseDouble2 >= -180.0d) {
                    double d = 0.0d;
                    if (matcher.group(3) != null) {
                        double parseDouble3 = Double.parseDouble(matcher.group(3));
                        if (parseDouble3 < 0.0d) {
                            return null;
                        }
                        d = parseDouble3;
                    }
                    return new QC0(parseDouble, parseDouble2, d, group);
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
