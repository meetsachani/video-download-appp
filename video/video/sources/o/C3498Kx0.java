package o;

import java.util.Formattable;
import java.util.Formatter;

/* renamed from: o.Kx0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3498Kx0 {
    public static final String a = "%s";

    public static Formatter a(CharSequence charSequence, Formatter formatter, int i, int i2, int i3) {
        return c(charSequence, formatter, i, i2, i3, ' ', null);
    }

    public static Formatter b(CharSequence charSequence, Formatter formatter, int i, int i2, int i3, char c) {
        return c(charSequence, formatter, i, i2, i3, c, null);
    }

    public static Formatter c(CharSequence charSequence, Formatter formatter, int i, int i2, int i3, char c, CharSequence charSequence2) {
        int i4;
        if (charSequence2 != null && i3 >= 0 && charSequence2.length() > i3) {
            throw new IllegalArgumentException(String.format("Specified ellipsis '%s' exceeds precision of %s", charSequence2, Integer.valueOf(i3)));
        }
        StringBuilder sb = new StringBuilder(charSequence);
        if (i3 >= 0 && i3 < charSequence.length()) {
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            sb.replace(i3 - charSequence2.length(), charSequence.length(), charSequence2.toString());
        }
        boolean z = true;
        if ((i & 1) != 1) {
            z = false;
        }
        for (int length = sb.length(); length < i2; length++) {
            if (z) {
                i4 = length;
            } else {
                i4 = 0;
            }
            sb.insert(i4, c);
        }
        formatter.format(sb.toString(), new Object[0]);
        return formatter;
    }

    public static Formatter d(CharSequence charSequence, Formatter formatter, int i, int i2, int i3, CharSequence charSequence2) {
        return c(charSequence, formatter, i, i2, i3, ' ', charSequence2);
    }

    public static String e(Formattable formattable) {
        return String.format("%s", formattable);
    }
}
