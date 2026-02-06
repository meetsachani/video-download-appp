package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Z uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class F00 {
    public static final F00 Y0;
    public static final F00 Z;
    public static final F00 Z0;
    public static final F00 a1;
    public static final F00 b1;
    public static final F00 c1;
    public static final F00 d1;
    public static final F00 e1;
    public static final F00 f1;
    public static final F00 g1;
    public static final F00 h1;
    public static final F00 i1;
    public static final F00 j1;
    public static final F00 k1;
    public static final F00 l1;
    public static final F00 m1;
    public static final F00 n1;
    public static final /* synthetic */ F00[] o1;
    public final String X;
    public final InterfaceC10759xe2 Y;

    static {
        C2730De2 c2730De2 = C2730De2.a;
        F00 f00 = new F00("BASE64_DECODER", 0, C2730De2.g, c2730De2.e());
        Z = f00;
        F00 f002 = new F00("BASE64_ENCODER", 1, C2730De2.h, c2730De2.f());
        Y0 = f002;
        F00 f003 = new F00("CONST", 2, C2730De2.i, c2730De2.j());
        Z0 = f003;
        F00 f004 = new F00("DATE", 3, C2730De2.j, c2730De2.k());
        a1 = f004;
        F00 f005 = new F00("DNS", 4, C2730De2.k, c2730De2.l());
        b1 = f005;
        F00 f006 = new F00("ENVIRONMENT", 5, C2730De2.l, c2730De2.m());
        c1 = f006;
        F00 f007 = new F00("FILE", 6, "file", c2730De2.n());
        d1 = f007;
        F00 f008 = new F00("JAVA", 7, C2730De2.n, c2730De2.t());
        e1 = f008;
        F00 f009 = new F00("LOCAL_HOST", 8, C2730De2.f442o, c2730De2.u());
        f1 = f009;
        F00 f0010 = new F00("PROPERTIES", 9, C2730De2.p, c2730De2.x());
        g1 = f0010;
        F00 f0011 = new F00("RESOURCE_BUNDLE", 10, C2730De2.q, c2730De2.y());
        h1 = f0011;
        F00 f0012 = new F00("SCRIPT", 11, C2730De2.r, c2730De2.A());
        i1 = f0012;
        F00 f0013 = new F00("SYSTEM_PROPERTIES", 12, "sys", c2730De2.B());
        j1 = f0013;
        F00 f0014 = new F00("URL", 13, "url", c2730De2.G());
        k1 = f0014;
        F00 f0015 = new F00("URL_DECODER", 14, C2730De2.u, c2730De2.E());
        l1 = f0015;
        F00 f0016 = new F00("URL_ENCODER", 15, C2730De2.v, c2730De2.F());
        m1 = f0016;
        F00 f0017 = new F00("XML", 16, C2730De2.w, c2730De2.H());
        n1 = f0017;
        o1 = new F00[]{f00, f002, f003, f004, f005, f006, f007, f008, f009, f0010, f0011, f0012, f0013, f0014, f0015, f0016, f0017};
    }

    public F00(String str, int i, String str2, InterfaceC10759xe2 interfaceC10759xe2) {
        this.X = str2;
        this.Y = interfaceC10759xe2;
    }

    public static F00 valueOf(String str) {
        return (F00) Enum.valueOf(F00.class, str);
    }

    public static F00[] values() {
        return (F00[]) o1.clone();
    }

    public String e() {
        return this.X;
    }

    public InterfaceC10759xe2 g() {
        return this.Y;
    }
}
