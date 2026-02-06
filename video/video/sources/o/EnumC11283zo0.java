package o;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum a1 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: o.zo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11283zo0 {
    public static final EnumC11283zo0 A1;
    public static final EnumC11283zo0 B1;
    public static final EnumC11283zo0 C1;
    public static final EnumC11283zo0 D1;
    public static final EnumC11283zo0 E1;
    public static final EnumC11283zo0 F1;
    public static final EnumC11283zo0 G1;
    public static final EnumC11283zo0 H1;
    public static final EnumC11283zo0 I1;
    public static final EnumC11283zo0 J1;
    public static final EnumC11283zo0 K1;
    public static final EnumC11283zo0 L1;
    public static final EnumC11283zo0 M1;
    public static final EnumC11283zo0 N1;
    public static final EnumC11283zo0 O1;
    public static final EnumC11283zo0 P1;
    public static final EnumC11283zo0 Q1;
    public static final EnumC11283zo0 R1;
    public static final EnumC11283zo0 S1;
    public static final EnumC11283zo0 T1;
    public static final EnumC11283zo0 U1;
    public static final EnumC11283zo0 V1;
    public static final EnumC11283zo0 W1;
    public static final EnumC11283zo0 X1;
    public static final EnumC11283zo0 Y1;
    public static final EnumC11283zo0[] Z1;
    public static final EnumC11283zo0 a1;
    public static final Type[] a2;
    public static final EnumC11283zo0 b1;
    public static final /* synthetic */ EnumC11283zo0[] b2;
    public static final EnumC11283zo0 c1;
    public static final EnumC11283zo0 d1;
    public static final EnumC11283zo0 e1;
    public static final EnumC11283zo0 f1;
    public static final EnumC11283zo0 g1;
    public static final EnumC11283zo0 h1;
    public static final EnumC11283zo0 i1;
    public static final EnumC11283zo0 j1;
    public static final EnumC11283zo0 k1;
    public static final EnumC11283zo0 l1;
    public static final EnumC11283zo0 m1;
    public static final EnumC11283zo0 n1;
    public static final EnumC11283zo0 o1;
    public static final EnumC11283zo0 p1;
    public static final EnumC11283zo0 q1;
    public static final EnumC11283zo0 r1;
    public static final EnumC11283zo0 s1;
    public static final EnumC11283zo0 t1;
    public static final EnumC11283zo0 u1;
    public static final EnumC11283zo0 v1;
    public static final EnumC11283zo0 w1;
    public static final EnumC11283zo0 x1;
    public static final EnumC11283zo0 y1;
    public static final EnumC11283zo0 z1;
    public final EU0 X;
    public final int Y;
    public final Class<?> Y0;
    public final b Z;
    public final boolean Z0;

    /* renamed from: o.zo0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EU0.values().length];
            b = iArr;
            try {
                iArr[EU0.f1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[EU0.h1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[EU0.e1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.zo0$b */
    /* loaded from: classes.dex */
    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        public final boolean X;

        b(boolean z) {
            this.X = z;
        }

        public boolean e() {
            return this.X;
        }
    }

    static {
        b bVar = b.SCALAR;
        EU0 eu0 = EU0.c1;
        EnumC11283zo0 enumC11283zo0 = new EnumC11283zo0("DOUBLE", 0, 0, bVar, eu0);
        a1 = enumC11283zo0;
        EU0 eu02 = EU0.b1;
        EnumC11283zo0 enumC11283zo02 = new EnumC11283zo0("FLOAT", 1, 1, bVar, eu02);
        b1 = enumC11283zo02;
        EU0 eu03 = EU0.a1;
        EnumC11283zo0 enumC11283zo03 = new EnumC11283zo0("INT64", 2, 2, bVar, eu03);
        c1 = enumC11283zo03;
        EnumC11283zo0 enumC11283zo04 = new EnumC11283zo0("UINT64", 3, 3, bVar, eu03);
        d1 = enumC11283zo04;
        EU0 eu04 = EU0.Z0;
        EnumC11283zo0 enumC11283zo05 = new EnumC11283zo0("INT32", 4, 4, bVar, eu04);
        e1 = enumC11283zo05;
        EnumC11283zo0 enumC11283zo06 = new EnumC11283zo0("FIXED64", 5, 5, bVar, eu03);
        f1 = enumC11283zo06;
        EnumC11283zo0 enumC11283zo07 = new EnumC11283zo0("FIXED32", 6, 6, bVar, eu04);
        g1 = enumC11283zo07;
        EU0 eu05 = EU0.d1;
        EnumC11283zo0 enumC11283zo08 = new EnumC11283zo0("BOOL", 7, 7, bVar, eu05);
        h1 = enumC11283zo08;
        EU0 eu06 = EU0.e1;
        EnumC11283zo0 enumC11283zo09 = new EnumC11283zo0("STRING", 8, 8, bVar, eu06);
        i1 = enumC11283zo09;
        EU0 eu07 = EU0.h1;
        EnumC11283zo0 enumC11283zo010 = new EnumC11283zo0("MESSAGE", 9, 9, bVar, eu07);
        j1 = enumC11283zo010;
        EU0 eu08 = EU0.f1;
        EnumC11283zo0 enumC11283zo011 = new EnumC11283zo0("BYTES", 10, 10, bVar, eu08);
        k1 = enumC11283zo011;
        EnumC11283zo0 enumC11283zo012 = new EnumC11283zo0("UINT32", 11, 11, bVar, eu04);
        l1 = enumC11283zo012;
        EU0 eu09 = EU0.g1;
        EnumC11283zo0 enumC11283zo013 = new EnumC11283zo0("ENUM", 12, 12, bVar, eu09);
        m1 = enumC11283zo013;
        EnumC11283zo0 enumC11283zo014 = new EnumC11283zo0("SFIXED32", 13, 13, bVar, eu04);
        n1 = enumC11283zo014;
        EnumC11283zo0 enumC11283zo015 = new EnumC11283zo0("SFIXED64", 14, 14, bVar, eu03);
        o1 = enumC11283zo015;
        EnumC11283zo0 enumC11283zo016 = new EnumC11283zo0("SINT32", 15, 15, bVar, eu04);
        p1 = enumC11283zo016;
        EnumC11283zo0 enumC11283zo017 = new EnumC11283zo0("SINT64", 16, 16, bVar, eu03);
        q1 = enumC11283zo017;
        EnumC11283zo0 enumC11283zo018 = new EnumC11283zo0("GROUP", 17, 17, bVar, eu07);
        r1 = enumC11283zo018;
        b bVar2 = b.VECTOR;
        EnumC11283zo0 enumC11283zo019 = new EnumC11283zo0("DOUBLE_LIST", 18, 18, bVar2, eu0);
        s1 = enumC11283zo019;
        EnumC11283zo0 enumC11283zo020 = new EnumC11283zo0("FLOAT_LIST", 19, 19, bVar2, eu02);
        t1 = enumC11283zo020;
        EnumC11283zo0 enumC11283zo021 = new EnumC11283zo0("INT64_LIST", 20, 20, bVar2, eu03);
        u1 = enumC11283zo021;
        EnumC11283zo0 enumC11283zo022 = new EnumC11283zo0("UINT64_LIST", 21, 21, bVar2, eu03);
        v1 = enumC11283zo022;
        EnumC11283zo0 enumC11283zo023 = new EnumC11283zo0("INT32_LIST", 22, 22, bVar2, eu04);
        w1 = enumC11283zo023;
        EnumC11283zo0 enumC11283zo024 = new EnumC11283zo0("FIXED64_LIST", 23, 23, bVar2, eu03);
        x1 = enumC11283zo024;
        EnumC11283zo0 enumC11283zo025 = new EnumC11283zo0("FIXED32_LIST", 24, 24, bVar2, eu04);
        y1 = enumC11283zo025;
        EnumC11283zo0 enumC11283zo026 = new EnumC11283zo0("BOOL_LIST", 25, 25, bVar2, eu05);
        z1 = enumC11283zo026;
        EnumC11283zo0 enumC11283zo027 = new EnumC11283zo0("STRING_LIST", 26, 26, bVar2, eu06);
        A1 = enumC11283zo027;
        EnumC11283zo0 enumC11283zo028 = new EnumC11283zo0("MESSAGE_LIST", 27, 27, bVar2, eu07);
        B1 = enumC11283zo028;
        EnumC11283zo0 enumC11283zo029 = new EnumC11283zo0("BYTES_LIST", 28, 28, bVar2, eu08);
        C1 = enumC11283zo029;
        EnumC11283zo0 enumC11283zo030 = new EnumC11283zo0("UINT32_LIST", 29, 29, bVar2, eu04);
        D1 = enumC11283zo030;
        EnumC11283zo0 enumC11283zo031 = new EnumC11283zo0("ENUM_LIST", 30, 30, bVar2, eu09);
        E1 = enumC11283zo031;
        EnumC11283zo0 enumC11283zo032 = new EnumC11283zo0("SFIXED32_LIST", 31, 31, bVar2, eu04);
        F1 = enumC11283zo032;
        EnumC11283zo0 enumC11283zo033 = new EnumC11283zo0("SFIXED64_LIST", 32, 32, bVar2, eu03);
        G1 = enumC11283zo033;
        EnumC11283zo0 enumC11283zo034 = new EnumC11283zo0("SINT32_LIST", 33, 33, bVar2, eu04);
        H1 = enumC11283zo034;
        EnumC11283zo0 enumC11283zo035 = new EnumC11283zo0("SINT64_LIST", 34, 34, bVar2, eu03);
        I1 = enumC11283zo035;
        b bVar3 = b.PACKED_VECTOR;
        EnumC11283zo0 enumC11283zo036 = new EnumC11283zo0("DOUBLE_LIST_PACKED", 35, 35, bVar3, eu0);
        J1 = enumC11283zo036;
        EnumC11283zo0 enumC11283zo037 = new EnumC11283zo0("FLOAT_LIST_PACKED", 36, 36, bVar3, eu02);
        K1 = enumC11283zo037;
        EnumC11283zo0 enumC11283zo038 = new EnumC11283zo0("INT64_LIST_PACKED", 37, 37, bVar3, eu03);
        L1 = enumC11283zo038;
        EnumC11283zo0 enumC11283zo039 = new EnumC11283zo0("UINT64_LIST_PACKED", 38, 38, bVar3, eu03);
        M1 = enumC11283zo039;
        EnumC11283zo0 enumC11283zo040 = new EnumC11283zo0("INT32_LIST_PACKED", 39, 39, bVar3, eu04);
        N1 = enumC11283zo040;
        EnumC11283zo0 enumC11283zo041 = new EnumC11283zo0("FIXED64_LIST_PACKED", 40, 40, bVar3, eu03);
        O1 = enumC11283zo041;
        EnumC11283zo0 enumC11283zo042 = new EnumC11283zo0("FIXED32_LIST_PACKED", 41, 41, bVar3, eu04);
        P1 = enumC11283zo042;
        EnumC11283zo0 enumC11283zo043 = new EnumC11283zo0("BOOL_LIST_PACKED", 42, 42, bVar3, eu05);
        Q1 = enumC11283zo043;
        EnumC11283zo0 enumC11283zo044 = new EnumC11283zo0("UINT32_LIST_PACKED", 43, 43, bVar3, eu04);
        R1 = enumC11283zo044;
        EnumC11283zo0 enumC11283zo045 = new EnumC11283zo0("ENUM_LIST_PACKED", 44, 44, bVar3, eu09);
        S1 = enumC11283zo045;
        EnumC11283zo0 enumC11283zo046 = new EnumC11283zo0("SFIXED32_LIST_PACKED", 45, 45, bVar3, eu04);
        T1 = enumC11283zo046;
        EnumC11283zo0 enumC11283zo047 = new EnumC11283zo0("SFIXED64_LIST_PACKED", 46, 46, bVar3, eu03);
        U1 = enumC11283zo047;
        EnumC11283zo0 enumC11283zo048 = new EnumC11283zo0("SINT32_LIST_PACKED", 47, 47, bVar3, eu04);
        V1 = enumC11283zo048;
        EnumC11283zo0 enumC11283zo049 = new EnumC11283zo0("SINT64_LIST_PACKED", 48, 48, bVar3, eu03);
        W1 = enumC11283zo049;
        EnumC11283zo0 enumC11283zo050 = new EnumC11283zo0("GROUP_LIST", 49, 49, bVar2, eu07);
        X1 = enumC11283zo050;
        EnumC11283zo0 enumC11283zo051 = new EnumC11283zo0(XH0.L, 50, 50, b.MAP, EU0.Y0);
        Y1 = enumC11283zo051;
        b2 = new EnumC11283zo0[]{enumC11283zo0, enumC11283zo02, enumC11283zo03, enumC11283zo04, enumC11283zo05, enumC11283zo06, enumC11283zo07, enumC11283zo08, enumC11283zo09, enumC11283zo010, enumC11283zo011, enumC11283zo012, enumC11283zo013, enumC11283zo014, enumC11283zo015, enumC11283zo016, enumC11283zo017, enumC11283zo018, enumC11283zo019, enumC11283zo020, enumC11283zo021, enumC11283zo022, enumC11283zo023, enumC11283zo024, enumC11283zo025, enumC11283zo026, enumC11283zo027, enumC11283zo028, enumC11283zo029, enumC11283zo030, enumC11283zo031, enumC11283zo032, enumC11283zo033, enumC11283zo034, enumC11283zo035, enumC11283zo036, enumC11283zo037, enumC11283zo038, enumC11283zo039, enumC11283zo040, enumC11283zo041, enumC11283zo042, enumC11283zo043, enumC11283zo044, enumC11283zo045, enumC11283zo046, enumC11283zo047, enumC11283zo048, enumC11283zo049, enumC11283zo050, enumC11283zo051};
        a2 = new Type[0];
        EnumC11283zo0[] values = values();
        Z1 = new EnumC11283zo0[values.length];
        for (EnumC11283zo0 enumC11283zo052 : values) {
            Z1[enumC11283zo052.Y] = enumC11283zo052;
        }
    }

    public EnumC11283zo0(String str, int i, int i2, b bVar, EU0 eu0) {
        int i3;
        this.Y = i2;
        this.Z = bVar;
        this.X = eu0;
        int i4 = a.a[bVar.ordinal()];
        boolean z = true;
        if (i4 != 1) {
            if (i4 != 2) {
                this.Y0 = null;
            } else {
                this.Y0 = eu0.e();
            }
        } else {
            this.Y0 = eu0.e();
        }
        this.Z0 = (bVar != b.SCALAR || (i3 = a.b[eu0.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : false;
    }

    public static EnumC11283zo0 e(int i) {
        if (i >= 0) {
            EnumC11283zo0[] enumC11283zo0Arr = Z1;
            if (i < enumC11283zo0Arr.length) {
                return enumC11283zo0Arr[i];
            }
            return null;
        }
        return null;
    }

    public static Type g(Class<?> cls) {
        Type[] genericInterfaces;
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    public static Type i(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls != List.class) {
                Type g = g(cls);
                if (g instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) g;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                for (int i3 = 0; i3 < typeParameters.length; i3++) {
                                    if (type == typeParameters[i3]) {
                                        actualTypeArguments[i2] = typeArr[i3];
                                    }
                                }
                                throw new RuntimeException("Unable to find replacement for " + type);
                            }
                            throw new RuntimeException("Type array mismatch");
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = a2;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            Class<?> cls2 = interfaces[i];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else if (typeArr.length == 1) {
                return typeArr[0];
            } else {
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    public static EnumC11283zo0 valueOf(String str) {
        return (EnumC11283zo0) Enum.valueOf(EnumC11283zo0.class, str);
    }

    public static EnumC11283zo0[] values() {
        return (EnumC11283zo0[]) b2.clone();
    }

    public boolean A5() {
        return b.PACKED_VECTOR.equals(this.Z);
    }

    public EU0 h() {
        return this.X;
    }

    public int j() {
        return this.Y;
    }

    public boolean l() {
        return this.Z.e();
    }

    public boolean m() {
        if (this.Z == b.MAP) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.Z0;
    }

    public boolean o() {
        if (this.Z == b.SCALAR) {
            return true;
        }
        return false;
    }

    public boolean p(Field field) {
        if (b.VECTOR.equals(this.Z)) {
            return q(field);
        }
        return this.X.h().isAssignableFrom(field.getType());
    }

    public final boolean q(Field field) {
        Class<?> type = field.getType();
        if (!this.X.h().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = a2;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type i = i(type, typeArr);
        if (!(i instanceof Class)) {
            return true;
        }
        return this.Y0.isAssignableFrom((Class) i);
    }
}
