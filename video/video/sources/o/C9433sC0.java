package o;

import java.util.Locale;

/* renamed from: o.sC0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9433sC0 {
    public final Locale a;

    public C9433sC0(Locale locale) {
        if (locale != null) {
            this.a = locale;
            return;
        }
        throw new IllegalArgumentException("Locale must not be null");
    }

    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            String lowerCase = charSequence.toString().toLowerCase(this.a);
            String lowerCase2 = charSequence2.toString().toLowerCase(this.a);
            int i = Integer.MIN_VALUE;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < lowerCase2.length(); i4++) {
                char charAt = lowerCase2.charAt(i4);
                boolean z = false;
                while (i3 < lowerCase.length() && !z) {
                    if (charAt == lowerCase.charAt(i3)) {
                        int i5 = i2 + 1;
                        if (i + 1 == i3) {
                            i5 = i2 + 3;
                        }
                        i2 = i5;
                        z = true;
                        i = i3;
                    }
                    i3++;
                }
            }
            return Integer.valueOf(i2);
        }
        throw new IllegalArgumentException("CharSequences must not be null");
    }

    public Locale b() {
        return this.a;
    }
}
