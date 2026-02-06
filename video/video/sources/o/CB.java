package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
/* loaded from: classes3.dex */
public class CB extends BB {
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final char D(int i) {
        if (i >= 0 && i < 10) {
            return (char) (i + 48);
        }
        throw new IllegalArgumentException("Int " + i + " is not a decimal digit");
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final char E(int i, int i2) {
        int i3;
        if (2 <= i2 && i2 < 37) {
            if (i >= 0 && i < i2) {
                if (i < 10) {
                    i3 = i + 48;
                } else {
                    i3 = ((char) (i + 65)) - '\n';
                }
                return (char) i3;
            }
            throw new IllegalArgumentException("Digit " + i + " does not represent a valid digit in radix " + i2);
        }
        throw new IllegalArgumentException("Invalid radix: " + i2 + ". Valid radix values are in range 2..36");
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static int F(char c) {
        int b = BB.b(c, 10);
        if (b >= 0) {
            return b;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final int G(char c, int i) {
        Integer I = I(c, i);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @Nullable
    public static final Integer H(char c) {
        Integer valueOf = Integer.valueOf(BB.b(c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @Nullable
    public static final Integer I(char c, int i) {
        BB.a(i);
        Integer valueOf = Integer.valueOf(BB.b(c, i));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean J(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean K(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return J(c, c2, z);
    }

    public static final boolean L(char c) {
        if (55296 > c || c >= 57344) {
            return false;
        }
        return true;
    }

    @XP0
    public static final String M(char c, String str) {
        C6562gT0.p(str, "other");
        return c + str;
    }

    @InterfaceC6480g82(version = "1.5")
    @NotNull
    public static final String N(char c) {
        return HO2.a(c);
    }
}
