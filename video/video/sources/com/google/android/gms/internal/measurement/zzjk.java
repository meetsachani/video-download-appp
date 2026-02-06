package com.google.android.gms.internal.measurement;

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
/* loaded from: classes3.dex */
public final class zzjk {
    public static final zzjk Y0;
    public static final zzjk Z0;
    public static final zzjk a1;
    public static final zzjk b1;
    public static final zzjk c1;
    public static final zzjk d1;
    public static final zzjk e1;
    public static final zzjk f1;
    public static final zzjk g1;
    public static final zzjk h1;
    public static final /* synthetic */ zzjk[] i1;
    public final Class<?> X;
    public final Class<?> Y;
    public final Object Z;

    static {
        zzjk zzjkVar = new zzjk("VOID", 0, Void.class, Void.class, null);
        Y0 = zzjkVar;
        Class cls = Integer.TYPE;
        zzjk zzjkVar2 = new zzjk("INT", 1, cls, Integer.class, 0);
        Z0 = zzjkVar2;
        zzjk zzjkVar3 = new zzjk("LONG", 2, Long.TYPE, Long.class, 0L);
        a1 = zzjkVar3;
        zzjk zzjkVar4 = new zzjk("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        b1 = zzjkVar4;
        zzjk zzjkVar5 = new zzjk("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        c1 = zzjkVar5;
        zzjk zzjkVar6 = new zzjk("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        d1 = zzjkVar6;
        zzjk zzjkVar7 = new zzjk("STRING", 6, String.class, String.class, "");
        e1 = zzjkVar7;
        zzjk zzjkVar8 = new zzjk("BYTE_STRING", 7, zzhm.class, zzhm.class, zzhm.Y);
        f1 = zzjkVar8;
        zzjk zzjkVar9 = new zzjk("ENUM", 8, cls, Integer.class, null);
        g1 = zzjkVar9;
        zzjk zzjkVar10 = new zzjk("MESSAGE", 9, Object.class, Object.class, null);
        h1 = zzjkVar10;
        i1 = new zzjk[]{zzjkVar, zzjkVar2, zzjkVar3, zzjkVar4, zzjkVar5, zzjkVar6, zzjkVar7, zzjkVar8, zzjkVar9, zzjkVar10};
    }

    public zzjk(String str, int i, Class cls, Class cls2, Object obj) {
        this.X = cls;
        this.Y = cls2;
        this.Z = obj;
    }

    public static zzjk[] values() {
        return (zzjk[]) i1.clone();
    }

    public final Class<?> e() {
        return this.Y;
    }
}
