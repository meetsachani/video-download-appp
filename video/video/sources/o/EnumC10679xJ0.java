package o;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* renamed from: o.xJ0 */
/* loaded from: classes4.dex */
public enum EnumC10679xJ0 {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", EnumC2674Cp0.m().y());
    
    private static final long serialVersionUID = -6343169151696340687L;
    public final String X;
    public final transient boolean Y;

    EnumC10679xJ0(String str, boolean z) {
        this.X = str;
        this.Y = z;
    }

    public static /* synthetic */ boolean e(String str, EnumC10679xJ0 enumC10679xJ0) {
        return enumC10679xJ0.q().equals(str);
    }

    public static /* synthetic */ IllegalArgumentException g(String str) {
        return new IllegalArgumentException("Illegal IOCase name: " + str);
    }

    public static EnumC10679xJ0 p(final String str) {
        return (EnumC10679xJ0) Stream.of((Object[]) values()).filter(new Predicate() { // from class: o.vJ0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumC10679xJ0.e(str, (EnumC10679xJ0) obj);
            }
        }).findFirst().orElseThrow(new Supplier() { // from class: o.wJ0
            @Override // java.util.function.Supplier
            public final Object get() {
                return EnumC10679xJ0.g(str);
            }
        });
    }

    private Object readResolve() {
        return p(this.X);
    }

    public static boolean s(EnumC10679xJ0 enumC10679xJ0) {
        if (enumC10679xJ0 != null && enumC10679xJ0.r()) {
            return true;
        }
        return false;
    }

    public static EnumC10679xJ0 t(EnumC10679xJ0 enumC10679xJ0, EnumC10679xJ0 enumC10679xJ02) {
        if (enumC10679xJ0 != null) {
            return enumC10679xJ0;
        }
        return enumC10679xJ02;
    }

    public int i(String str, String str2) {
        Objects.requireNonNull(str, "str1");
        Objects.requireNonNull(str2, "str2");
        if (this.Y) {
            return str.compareTo(str2);
        }
        return str.compareToIgnoreCase(str2);
    }

    public boolean j(String str, String str2) {
        if (str != null && str2 != null) {
            int length = str2.length();
            return str.regionMatches(!this.Y, str.length() - length, str2, 0, length);
        }
        return false;
    }

    public boolean l(String str, String str2) {
        if (str != str2) {
            if (str != null) {
                if (this.Y) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                    return true;
                } else if (!str.equalsIgnoreCase(str2)) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int m(String str, int i, String str2) {
        int length;
        if (str != null && str2 != null && (length = str.length() - str2.length()) >= i) {
            while (i <= length) {
                if (n(str, i, str2)) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        return -1;
    }

    public boolean n(String str, int i, String str2) {
        if (str != null && str2 != null && str.regionMatches(!this.Y, i, str2, 0, str2.length())) {
            return true;
        }
        return false;
    }

    public boolean o(String str, String str2) {
        if (str != null && str2 != null && str.regionMatches(!this.Y, 0, str2, 0, str2.length())) {
            return true;
        }
        return false;
    }

    public String q() {
        return this.X;
    }

    public boolean r() {
        return this.Y;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.X;
    }
}
