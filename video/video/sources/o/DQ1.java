package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class DQ1 implements InterfaceC4073Qu0 {
    public static final /* synthetic */ DQ1[] e1;
    public static final /* synthetic */ InterfaceC3127Hd0 f1;
    public final int X;
    public final int Y;
    public static final DQ1 Z = new DQ1("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final DQ1 Y0 = new DQ1("MULTILINE", 1, 8, 0, 2, null);
    public static final DQ1 Z0 = new DQ1("LITERAL", 2, 16, 0, 2, null);
    public static final DQ1 a1 = new DQ1("UNIX_LINES", 3, 1, 0, 2, null);
    public static final DQ1 b1 = new DQ1("COMMENTS", 4, 4, 0, 2, null);
    public static final DQ1 c1 = new DQ1("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final DQ1 d1 = new DQ1("CANON_EQ", 6, 128, 0, 2, null);

    static {
        DQ1[] g = g();
        e1 = g;
        f1 = C3323Jd0.c(g);
    }

    public DQ1(String str, int i, int i2, int i3) {
        super(str, i);
        this.X = i2;
        this.Y = i3;
    }

    public static final /* synthetic */ DQ1[] g() {
        return new DQ1[]{Z, Y0, Z0, a1, b1, c1, d1};
    }

    @NotNull
    public static InterfaceC3127Hd0<DQ1> h() {
        return f1;
    }

    public static DQ1 valueOf(String str) {
        return (DQ1) Enum.valueOf(DQ1.class, str);
    }

    public static DQ1[] values() {
        return (DQ1[]) e1.clone();
    }

    @Override // o.InterfaceC4073Qu0
    public int e() {
        return this.Y;
    }

    @Override // o.InterfaceC4073Qu0
    public int getValue() {
        return this.X;
    }

    public /* synthetic */ DQ1(String str, int i, int i2, int i3, int i4, C9516sY c9516sY) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }
}
