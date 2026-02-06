package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Z0 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class EU0 {
    public static final EU0 Y0;
    public static final EU0 Z0;
    public static final EU0 a1;
    public static final EU0 b1;
    public static final EU0 c1;
    public static final EU0 d1;
    public static final EU0 e1;
    public static final EU0 f1;
    public static final EU0 g1;
    public static final EU0 h1;
    public static final /* synthetic */ EU0[] i1;
    public final Class<?> X;
    public final Class<?> Y;
    public final Object Z;

    static {
        EU0 eu0 = new EU0("VOID", 0, Void.class, Void.class, null);
        Y0 = eu0;
        Class cls = Integer.TYPE;
        EU0 eu02 = new EU0("INT", 1, cls, Integer.class, 0);
        Z0 = eu02;
        EU0 eu03 = new EU0("LONG", 2, Long.TYPE, Long.class, 0L);
        a1 = eu03;
        EU0 eu04 = new EU0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        b1 = eu04;
        EU0 eu05 = new EU0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        c1 = eu05;
        EU0 eu06 = new EU0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        d1 = eu06;
        EU0 eu07 = new EU0("STRING", 6, String.class, String.class, "");
        e1 = eu07;
        EU0 eu08 = new EU0("BYTE_STRING", 7, AbstractC8616os.class, AbstractC8616os.class, AbstractC8616os.Z0);
        f1 = eu08;
        EU0 eu09 = new EU0("ENUM", 8, cls, Integer.class, null);
        g1 = eu09;
        EU0 eu010 = new EU0("MESSAGE", 9, Object.class, Object.class, null);
        h1 = eu010;
        i1 = new EU0[]{eu0, eu02, eu03, eu04, eu05, eu06, eu07, eu08, eu09, eu010};
    }

    public EU0(String str, int i, Class cls, Class cls2, Object obj) {
        this.X = cls;
        this.Y = cls2;
        this.Z = obj;
    }

    public static EU0 valueOf(String str) {
        return (EU0) Enum.valueOf(EU0.class, str);
    }

    public static EU0[] values() {
        return (EU0[]) i1.clone();
    }

    public Class<?> e() {
        return this.Y;
    }

    public Object g() {
        return this.Z;
    }

    public Class<?> h() {
        return this.X;
    }

    public boolean i(Class<?> cls) {
        return this.X.isAssignableFrom(cls);
    }
}
