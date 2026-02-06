package o;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.uo0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC10065uo0 implements InterfaceC10308vo0 {
    public static final EnumC10065uo0 X = new a("IDENTITY", 0);
    public static final EnumC10065uo0 Y = new EnumC10065uo0("UPPER_CAMEL_CASE", 1) { // from class: o.uo0.b
        @Override // o.InterfaceC10308vo0
        public String g(Field field) {
            return EnumC10065uo0.j(field.getName());
        }
    };
    public static final EnumC10065uo0 Z = new EnumC10065uo0("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: o.uo0.c
        @Override // o.InterfaceC10308vo0
        public String g(Field field) {
            return EnumC10065uo0.j(EnumC10065uo0.i(field.getName(), ' '));
        }
    };
    public static final EnumC10065uo0 Y0 = new EnumC10065uo0("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: o.uo0.d
        @Override // o.InterfaceC10308vo0
        public String g(Field field) {
            return EnumC10065uo0.i(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };
    public static final EnumC10065uo0 Z0 = new EnumC10065uo0("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: o.uo0.e
        @Override // o.InterfaceC10308vo0
        public String g(Field field) {
            return EnumC10065uo0.i(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final EnumC10065uo0 a1 = new EnumC10065uo0("LOWER_CASE_WITH_DASHES", 5) { // from class: o.uo0.f
        @Override // o.InterfaceC10308vo0
        public String g(Field field) {
            return EnumC10065uo0.i(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final EnumC10065uo0 b1 = new EnumC10065uo0("LOWER_CASE_WITH_DOTS", 6) { // from class: o.uo0.g
        @Override // o.InterfaceC10308vo0
        public String g(Field field) {
            return EnumC10065uo0.i(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final /* synthetic */ EnumC10065uo0[] c1 = h();

    /* renamed from: o.uo0$a */
    /* loaded from: classes3.dex */
    public enum a extends EnumC10065uo0 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // o.InterfaceC10308vo0
        public String g(Field field) {
            return field.getName();
        }
    }

    public EnumC10065uo0(String str, int i) {
    }

    public static /* synthetic */ EnumC10065uo0[] h() {
        return new EnumC10065uo0[]{X, Y, Z, Y0, Z0, a1, b1};
    }

    public static String i(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String j(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                }
            } else {
                i++;
            }
        }
        return str;
    }

    public static EnumC10065uo0 valueOf(String str) {
        return (EnumC10065uo0) Enum.valueOf(EnumC10065uo0.class, str);
    }

    public static EnumC10065uo0[] values() {
        return (EnumC10065uo0[]) c1.clone();
    }

    public /* synthetic */ EnumC10065uo0(String str, int i, a aVar) {
        this(str, i);
    }
}
