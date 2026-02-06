package o;

import java.util.Formattable;
import java.util.Formatter;

@Deprecated
/* renamed from: o.Lx0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3595Lx0 {
    public static final String a = "%s";

    public static Formatter a(CharSequence charSequence, Formatter formatter, int i, int i2, int i3) {
        return c(charSequence, formatter, i, i2, i3, ' ', null);
    }

    public static Formatter b(CharSequence charSequence, Formatter formatter, int i, int i2, int i3, char c) {
        return c(charSequence, formatter, i, i2, i3, c, null);
    }

    public static Formatter c(CharSequence charSequence, Formatter formatter, int i, int i2, int i3, char c, CharSequence charSequence2) {
        boolean z;
        int i4;
        boolean z2 = true;
        if (charSequence2 != null && i3 >= 0 && charSequence2.length() > i3) {
            z = false;
        } else {
            z = true;
        }
        C11147zE2.B(z, "Specified ellipsis '%1$s' exceeds precision of %2$s", charSequence2, Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(charSequence);
        if (i3 >= 0 && i3 < charSequence.length()) {
            CharSequence charSequence3 = (CharSequence) C11304zt1.t(charSequence2, "");
            sb.replace(i3 - charSequence3.length(), charSequence.length(), charSequence3.toString());
        }
        if ((i & 1) != 1) {
            z2 = false;
        }
        for (int length = sb.length(); length < i2; length++) {
            if (z2) {
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
