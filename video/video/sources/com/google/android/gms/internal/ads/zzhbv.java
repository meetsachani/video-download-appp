package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Y0 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzhbv {
    public static final zzhbv Y;
    public static final zzhbv Y0;
    public static final zzhbv Z;
    public static final zzhbv Z0;
    public static final zzhbv a1;
    public static final zzhbv b1;
    public static final zzhbv c1;
    public static final zzhbv d1;
    public static final zzhbv e1;
    public static final zzhbv f1;
    public static final zzhbv g1;
    public static final zzhbv h1;
    public static final zzhbv i1;
    public static final zzhbv j1;
    public static final zzhbv k1;
    public static final zzhbv l1;
    public static final zzhbv m1;
    public static final zzhbv n1;
    public static final /* synthetic */ zzhbv[] o1;
    public final zzhbw X;

    static {
        zzhbv zzhbvVar = new zzhbv("DOUBLE", 0, zzhbw.DOUBLE, 1);
        Y = zzhbvVar;
        zzhbv zzhbvVar2 = new zzhbv("FLOAT", 1, zzhbw.FLOAT, 5);
        Z = zzhbvVar2;
        zzhbw zzhbwVar = zzhbw.LONG;
        zzhbv zzhbvVar3 = new zzhbv("INT64", 2, zzhbwVar, 0);
        Y0 = zzhbvVar3;
        zzhbv zzhbvVar4 = new zzhbv("UINT64", 3, zzhbwVar, 0);
        Z0 = zzhbvVar4;
        zzhbw zzhbwVar2 = zzhbw.INT;
        zzhbv zzhbvVar5 = new zzhbv("INT32", 4, zzhbwVar2, 0);
        a1 = zzhbvVar5;
        zzhbv zzhbvVar6 = new zzhbv("FIXED64", 5, zzhbwVar, 1);
        b1 = zzhbvVar6;
        zzhbv zzhbvVar7 = new zzhbv("FIXED32", 6, zzhbwVar2, 5);
        c1 = zzhbvVar7;
        zzhbv zzhbvVar8 = new zzhbv("BOOL", 7, zzhbw.BOOLEAN, 0);
        d1 = zzhbvVar8;
        zzhbv zzhbvVar9 = new zzhbv("STRING", 8, zzhbw.STRING, 2);
        e1 = zzhbvVar9;
        zzhbw zzhbwVar3 = zzhbw.MESSAGE;
        zzhbv zzhbvVar10 = new zzhbv("GROUP", 9, zzhbwVar3, 3);
        f1 = zzhbvVar10;
        zzhbv zzhbvVar11 = new zzhbv("MESSAGE", 10, zzhbwVar3, 2);
        g1 = zzhbvVar11;
        zzhbv zzhbvVar12 = new zzhbv("BYTES", 11, zzhbw.BYTE_STRING, 2);
        h1 = zzhbvVar12;
        zzhbv zzhbvVar13 = new zzhbv("UINT32", 12, zzhbwVar2, 0);
        i1 = zzhbvVar13;
        zzhbv zzhbvVar14 = new zzhbv("ENUM", 13, zzhbw.ENUM, 0);
        j1 = zzhbvVar14;
        zzhbv zzhbvVar15 = new zzhbv("SFIXED32", 14, zzhbwVar2, 5);
        k1 = zzhbvVar15;
        zzhbv zzhbvVar16 = new zzhbv("SFIXED64", 15, zzhbwVar, 1);
        l1 = zzhbvVar16;
        zzhbv zzhbvVar17 = new zzhbv("SINT32", 16, zzhbwVar2, 0);
        m1 = zzhbvVar17;
        zzhbv zzhbvVar18 = new zzhbv("SINT64", 17, zzhbwVar, 0);
        n1 = zzhbvVar18;
        o1 = new zzhbv[]{zzhbvVar, zzhbvVar2, zzhbvVar3, zzhbvVar4, zzhbvVar5, zzhbvVar6, zzhbvVar7, zzhbvVar8, zzhbvVar9, zzhbvVar10, zzhbvVar11, zzhbvVar12, zzhbvVar13, zzhbvVar14, zzhbvVar15, zzhbvVar16, zzhbvVar17, zzhbvVar18};
    }

    public zzhbv(String str, int i, zzhbw zzhbwVar, int i2) {
        this.X = zzhbwVar;
    }

    public static zzhbv[] values() {
        return (zzhbv[]) o1.clone();
    }

    public final zzhbw e() {
        return this.X;
    }
}
