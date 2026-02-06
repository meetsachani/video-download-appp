package com.google.android.gms.internal.ads;

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
/* loaded from: classes2.dex */
public final class zzgzj {
    public static final zzgzj Y;
    public static final zzgzj Y0;
    public static final zzgzj Z;
    public static final zzgzj Z0;
    public static final zzgzj a1;
    public static final zzgzj b1;
    public static final zzgzj c1;
    public static final zzgzj d1;
    public static final zzgzj e1;
    public static final zzgzj f1;
    public static final /* synthetic */ zzgzj[] g1;
    public final Class X;

    static {
        zzgzj zzgzjVar = new zzgzj("VOID", 0, Void.class, Void.class, null);
        Y = zzgzjVar;
        Class cls = Integer.TYPE;
        zzgzj zzgzjVar2 = new zzgzj("INT", 1, cls, Integer.class, 0);
        Z = zzgzjVar2;
        zzgzj zzgzjVar3 = new zzgzj("LONG", 2, Long.TYPE, Long.class, 0L);
        Y0 = zzgzjVar3;
        zzgzj zzgzjVar4 = new zzgzj("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        Z0 = zzgzjVar4;
        zzgzj zzgzjVar5 = new zzgzj("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        a1 = zzgzjVar5;
        zzgzj zzgzjVar6 = new zzgzj("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        b1 = zzgzjVar6;
        zzgzj zzgzjVar7 = new zzgzj("STRING", 6, String.class, String.class, "");
        c1 = zzgzjVar7;
        zzgzj zzgzjVar8 = new zzgzj("BYTE_STRING", 7, zzgxk.class, zzgxk.class, zzgxk.Y);
        d1 = zzgzjVar8;
        zzgzj zzgzjVar9 = new zzgzj("ENUM", 8, cls, Integer.class, null);
        e1 = zzgzjVar9;
        zzgzj zzgzjVar10 = new zzgzj("MESSAGE", 9, Object.class, Object.class, null);
        f1 = zzgzjVar10;
        g1 = new zzgzj[]{zzgzjVar, zzgzjVar2, zzgzjVar3, zzgzjVar4, zzgzjVar5, zzgzjVar6, zzgzjVar7, zzgzjVar8, zzgzjVar9, zzgzjVar10};
    }

    public zzgzj(String str, int i, Class cls, Class cls2, Object obj) {
        this.X = cls2;
    }

    public static zzgzj[] values() {
        return (zzgzj[]) g1.clone();
    }

    public final Class e() {
        return this.X;
    }
}
