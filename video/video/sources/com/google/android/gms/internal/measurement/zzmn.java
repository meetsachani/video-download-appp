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
public class zzmn {
    public static final zzmn Y0;
    public static final zzmn Z;
    public static final zzmn Z0;
    public static final zzmn a1;
    public static final zzmn b1;
    public static final zzmn c1;
    public static final zzmn d1;
    public static final zzmn e1;
    public static final zzmn f1;
    public static final zzmn g1;
    public static final zzmn h1;
    public static final zzmn i1;
    public static final zzmn j1;
    public static final zzmn k1;
    public static final zzmn l1;
    public static final zzmn m1;
    public static final zzmn n1;
    public static final zzmn o1;
    public static final /* synthetic */ zzmn[] p1;
    public final zzmx X;
    public final int Y;

    static {
        zzmn zzmnVar = new zzmn("DOUBLE", 0, zzmx.DOUBLE, 1);
        Z = zzmnVar;
        zzmn zzmnVar2 = new zzmn("FLOAT", 1, zzmx.FLOAT, 5);
        Y0 = zzmnVar2;
        zzmx zzmxVar = zzmx.LONG;
        zzmn zzmnVar3 = new zzmn("INT64", 2, zzmxVar, 0);
        Z0 = zzmnVar3;
        zzmn zzmnVar4 = new zzmn("UINT64", 3, zzmxVar, 0);
        a1 = zzmnVar4;
        zzmx zzmxVar2 = zzmx.INT;
        zzmn zzmnVar5 = new zzmn("INT32", 4, zzmxVar2, 0);
        b1 = zzmnVar5;
        zzmn zzmnVar6 = new zzmn("FIXED64", 5, zzmxVar, 1);
        c1 = zzmnVar6;
        zzmn zzmnVar7 = new zzmn("FIXED32", 6, zzmxVar2, 5);
        d1 = zzmnVar7;
        zzmn zzmnVar8 = new zzmn("BOOL", 7, zzmx.BOOLEAN, 0);
        e1 = zzmnVar8;
        zzmm zzmmVar = new zzmm("STRING", zzmx.STRING);
        f1 = zzmmVar;
        zzmx zzmxVar3 = zzmx.MESSAGE;
        zzmo zzmoVar = new zzmo("GROUP", zzmxVar3);
        g1 = zzmoVar;
        zzmq zzmqVar = new zzmq("MESSAGE", zzmxVar3);
        h1 = zzmqVar;
        zzms zzmsVar = new zzms("BYTES", zzmx.BYTE_STRING);
        i1 = zzmsVar;
        zzmn zzmnVar9 = new zzmn("UINT32", 12, zzmxVar2, 0);
        j1 = zzmnVar9;
        zzmn zzmnVar10 = new zzmn("ENUM", 13, zzmx.ENUM, 0);
        k1 = zzmnVar10;
        zzmn zzmnVar11 = new zzmn("SFIXED32", 14, zzmxVar2, 5);
        l1 = zzmnVar11;
        zzmn zzmnVar12 = new zzmn("SFIXED64", 15, zzmxVar, 1);
        m1 = zzmnVar12;
        zzmn zzmnVar13 = new zzmn("SINT32", 16, zzmxVar2, 0);
        n1 = zzmnVar13;
        zzmn zzmnVar14 = new zzmn("SINT64", 17, zzmxVar, 0);
        o1 = zzmnVar14;
        p1 = new zzmn[]{zzmnVar, zzmnVar2, zzmnVar3, zzmnVar4, zzmnVar5, zzmnVar6, zzmnVar7, zzmnVar8, zzmmVar, zzmoVar, zzmqVar, zzmsVar, zzmnVar9, zzmnVar10, zzmnVar11, zzmnVar12, zzmnVar13, zzmnVar14};
    }

    public static zzmn[] values() {
        return (zzmn[]) p1.clone();
    }

    public final int a() {
        return this.Y;
    }

    public final zzmx e() {
        return this.X;
    }

    public zzmn(String str, int i, zzmx zzmxVar, int i2) {
        this.X = zzmxVar;
        this.Y = i2;
    }
}
