package o;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class HO2 {
    @NotNull
    public static final String a(char c) {
        String valueOf = String.valueOf(c);
        C6562gT0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        C6562gT0.o(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 1) {
            if (c == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            C6562gT0.n(upperCase, "null cannot be cast to non-null type java.lang.String");
            String substring = upperCase.substring(1);
            C6562gT0.o(substring, "substring(...)");
            C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            C6562gT0.o(lowerCase, "toLowerCase(...)");
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
