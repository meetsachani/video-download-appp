package o;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class BB {
    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final String A(char c) {
        String valueOf = String.valueOf(c);
        C6562gT0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        C6562gT0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final String B(char c, @NotNull Locale locale) {
        C6562gT0.p(locale, "locale");
        String valueOf = String.valueOf(c);
        C6562gT0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        C6562gT0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final char C(char c) {
        return Character.toUpperCase(c);
    }

    @HK1
    public static int a(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C11197zR0(2, 36));
    }

    public static final int b(char c, int i) {
        return Character.digit((int) c, i);
    }

    @NotNull
    public static final IA c(char c) {
        return IA.Z.a(Character.getType(c));
    }

    @NotNull
    public static final NA d(char c) {
        return NA.Y.b(Character.getDirectionality(c));
    }

    @XP0
    public static final boolean e(char c) {
        return Character.isDefined(c);
    }

    @XP0
    public static final boolean f(char c) {
        return Character.isDigit(c);
    }

    @XP0
    public static final boolean g(char c) {
        return Character.isHighSurrogate(c);
    }

    @XP0
    public static final boolean h(char c) {
        return Character.isISOControl(c);
    }

    @XP0
    public static final boolean i(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @XP0
    public static final boolean j(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @XP0
    public static final boolean k(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @XP0
    public static final boolean l(char c) {
        return Character.isLetter(c);
    }

    @XP0
    public static final boolean m(char c) {
        return Character.isLetterOrDigit(c);
    }

    @XP0
    public static final boolean n(char c) {
        return Character.isLowSurrogate(c);
    }

    @XP0
    public static final boolean o(char c) {
        return Character.isLowerCase(c);
    }

    @XP0
    public static final boolean p(char c) {
        return Character.isTitleCase(c);
    }

    @XP0
    public static final boolean q(char c) {
        return Character.isUpperCase(c);
    }

    public static final boolean r(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final String s(char c) {
        String valueOf = String.valueOf(c);
        C6562gT0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        C6562gT0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final String t(char c, @NotNull Locale locale) {
        C6562gT0.p(locale, "locale");
        String valueOf = String.valueOf(c);
        C6562gT0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        C6562gT0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final char u(char c) {
        return Character.toLowerCase(c);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final String v(char c, @NotNull Locale locale) {
        C6562gT0.p(locale, "locale");
        String B = B(c, locale);
        if (B.length() > 1) {
            if (c != 329) {
                char charAt = B.charAt(0);
                C6562gT0.n(B, "null cannot be cast to non-null type java.lang.String");
                String substring = B.substring(1);
                C6562gT0.o(substring, "substring(...)");
                C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                C6562gT0.o(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
        } else {
            String valueOf = String.valueOf(c);
            C6562gT0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            C6562gT0.o(upperCase, "toUpperCase(...)");
            if (C6562gT0.g(B, upperCase)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        }
        return B;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final char w(char c) {
        return Character.toTitleCase(c);
    }

    @XP0
    @InterfaceC9150r20(message = "Use lowercaseChar() instead.", replaceWith = @IR1(expression = "lowercaseChar()", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.5")
    public static final char x(char c) {
        return Character.toLowerCase(c);
    }

    @XP0
    @InterfaceC9150r20(message = "Use titlecaseChar() instead.", replaceWith = @IR1(expression = "titlecaseChar()", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.5")
    public static final char y(char c) {
        return Character.toTitleCase(c);
    }

    @XP0
    @InterfaceC9150r20(message = "Use uppercaseChar() instead.", replaceWith = @IR1(expression = "uppercaseChar()", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.5")
    public static final char z(char c) {
        return Character.toUpperCase(c);
    }
}
