package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.tB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC9671tB implements InterfaceC9428sB {
    public static final EnumC9671tB X;
    public static final EnumC9671tB Y;
    public static final EnumC9671tB Y0;
    public static final EnumC9671tB Z;
    public static final EnumC9671tB Z0;
    public static final EnumC9671tB a1;
    public static final EnumC9671tB b1;
    public static final /* synthetic */ EnumC9671tB[] c1;

    /* renamed from: o.tB$a */
    /* loaded from: classes4.dex */
    public enum a extends EnumC9671tB {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // o.InterfaceC9428sB
        public boolean test(int i) {
            return Character.isLetter(i);
        }
    }

    static {
        a aVar = new a("LETTERS", 0);
        X = aVar;
        EnumC9671tB enumC9671tB = new EnumC9671tB("DIGITS", 1) { // from class: o.tB.b
            @Override // o.InterfaceC9428sB
            public boolean test(int i) {
                return Character.isDigit(i);
            }
        };
        Y = enumC9671tB;
        EnumC9671tB enumC9671tB2 = new EnumC9671tB("ARABIC_NUMERALS", 2) { // from class: o.tB.c
            @Override // o.InterfaceC9428sB
            public boolean test(int i) {
                if (i >= 48 && i <= 57) {
                    return true;
                }
                return false;
            }
        };
        Z = enumC9671tB2;
        EnumC9671tB enumC9671tB3 = new EnumC9671tB("ASCII_LOWERCASE_LETTERS", 3) { // from class: o.tB.d
            @Override // o.InterfaceC9428sB
            public boolean test(int i) {
                if (i >= 97 && i <= 122) {
                    return true;
                }
                return false;
            }
        };
        Y0 = enumC9671tB3;
        EnumC9671tB enumC9671tB4 = new EnumC9671tB("ASCII_UPPERCASE_LETTERS", 4) { // from class: o.tB.e
            @Override // o.InterfaceC9428sB
            public boolean test(int i) {
                if (i >= 65 && i <= 90) {
                    return true;
                }
                return false;
            }
        };
        Z0 = enumC9671tB4;
        EnumC9671tB enumC9671tB5 = new EnumC9671tB("ASCII_LETTERS", 5) { // from class: o.tB.f
            @Override // o.InterfaceC9428sB
            public boolean test(int i) {
                if (!EnumC9671tB.Y0.test(i) && !EnumC9671tB.Z0.test(i)) {
                    return false;
                }
                return true;
            }
        };
        a1 = enumC9671tB5;
        EnumC9671tB enumC9671tB6 = new EnumC9671tB("ASCII_ALPHA_NUMERALS", 6) { // from class: o.tB.g
            @Override // o.InterfaceC9428sB
            public boolean test(int i) {
                if (!EnumC9671tB.Y0.test(i) && !EnumC9671tB.Z0.test(i) && !EnumC9671tB.Z.test(i)) {
                    return false;
                }
                return true;
            }
        };
        b1 = enumC9671tB6;
        c1 = new EnumC9671tB[]{aVar, enumC9671tB, enumC9671tB2, enumC9671tB3, enumC9671tB4, enumC9671tB5, enumC9671tB6};
    }

    public EnumC9671tB(String str, int i) {
    }

    public static EnumC9671tB valueOf(String str) {
        return (EnumC9671tB) Enum.valueOf(EnumC9671tB.class, str);
    }

    public static EnumC9671tB[] values() {
        return (EnumC9671tB[]) c1.clone();
    }

    public /* synthetic */ EnumC9671tB(String str, int i, a aVar) {
        this(str, i);
    }
}
