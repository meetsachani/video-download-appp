package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class IA {
    public static final /* synthetic */ IA[] C1;
    public static final /* synthetic */ InterfaceC3127Hd0 D1;
    @NotNull
    public static final a Z;
    public final int X;
    @NotNull
    public final String Y;
    public static final IA Y0 = new IA("UNASSIGNED", 0, 0, "Cn");
    public static final IA Z0 = new IA("UPPERCASE_LETTER", 1, 1, "Lu");
    public static final IA a1 = new IA("LOWERCASE_LETTER", 2, 2, AbstractC3550Ll.R2);
    public static final IA b1 = new IA("TITLECASE_LETTER", 3, 3, "Lt");
    public static final IA c1 = new IA("MODIFIER_LETTER", 4, 4, "Lm");
    public static final IA d1 = new IA("OTHER_LETTER", 5, 5, "Lo");
    public static final IA e1 = new IA("NON_SPACING_MARK", 6, 6, "Mn");
    public static final IA f1 = new IA("ENCLOSING_MARK", 7, 7, "Me");
    public static final IA g1 = new IA("COMBINING_SPACING_MARK", 8, 8, "Mc");
    public static final IA h1 = new IA("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
    public static final IA i1 = new IA("LETTER_NUMBER", 10, 10, "Nl");
    public static final IA j1 = new IA("OTHER_NUMBER", 11, 11, "No");
    public static final IA k1 = new IA("SPACE_SEPARATOR", 12, 12, "Zs");
    public static final IA l1 = new IA("LINE_SEPARATOR", 13, 13, "Zl");
    public static final IA m1 = new IA("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
    public static final IA n1 = new IA("CONTROL", 15, 15, "Cc");
    public static final IA o1 = new IA("FORMAT", 16, 16, "Cf");
    public static final IA p1 = new IA("PRIVATE_USE", 17, 18, "Co");
    public static final IA q1 = new IA("SURROGATE", 18, 19, "Cs");
    public static final IA r1 = new IA("DASH_PUNCTUATION", 19, 20, "Pd");
    public static final IA s1 = new IA("START_PUNCTUATION", 20, 21, "Ps");
    public static final IA t1 = new IA("END_PUNCTUATION", 21, 22, "Pe");
    public static final IA u1 = new IA("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    public static final IA v1 = new IA("OTHER_PUNCTUATION", 23, 24, "Po");
    public static final IA w1 = new IA("MATH_SYMBOL", 24, 25, "Sm");
    public static final IA x1 = new IA("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final IA y1 = new IA("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final IA z1 = new IA("OTHER_SYMBOL", 27, 28, "So");
    public static final IA A1 = new IA("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final IA B1 = new IA("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final IA a(int i) {
            if (i >= 0 && i < 17) {
                return (IA) IA.i().get(i);
            }
            if (18 <= i && i < 31) {
                return (IA) IA.i().get(i - 1);
            }
            throw new IllegalArgumentException("Category #" + i + " is not defined.");
        }

        public a() {
        }
    }

    static {
        IA[] e = e();
        C1 = e;
        D1 = C3323Jd0.c(e);
        Z = new a(null);
    }

    public IA(String str, int i, int i2, String str2) {
        this.X = i2;
        this.Y = str2;
    }

    public static final /* synthetic */ IA[] e() {
        return new IA[]{Y0, Z0, a1, b1, c1, d1, e1, f1, g1, h1, i1, j1, k1, l1, m1, n1, o1, p1, q1, r1, s1, t1, u1, v1, w1, x1, y1, z1, A1, B1};
    }

    @NotNull
    public static InterfaceC3127Hd0<IA> i() {
        return D1;
    }

    public static IA valueOf(String str) {
        return (IA) Enum.valueOf(IA.class, str);
    }

    public static IA[] values() {
        return (IA[]) C1.clone();
    }

    public final boolean g(char c) {
        if (Character.getType(c) == this.X) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String h() {
        return this.Y;
    }

    public final int j() {
        return this.X;
    }
}
