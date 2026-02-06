package o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public class XE1 {
    public static String a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i);
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    public static String b(int i) {
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "h:mm a";
                }
                throw new IllegalArgumentException("Unknown DateFormat style: " + i);
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    public static DateFormat c(int i, int i2) {
        return new SimpleDateFormat(a(i) + C4500Ve2.b + b(i2), Locale.US);
    }
}
