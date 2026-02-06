package o;

import java.lang.reflect.Field;
import o.C9740tS0;

/* renamed from: o.bo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5415bo0 implements Comparable<C5415bo0> {
    public final Field X;
    public final EnumC11283zo0 Y;
    public final int Y0;
    public final Class<?> Z;
    public final Field Z0;
    public final int a1;
    public final boolean b1;
    public final boolean c1;
    public final C11312zv1 d1;
    public final Field e1;
    public final Class<?> f1;
    public final Object g1;
    public final C9740tS0.e h1;

    /* renamed from: o.bo0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC11283zo0.values().length];
            a = iArr;
            try {
                iArr[EnumC11283zo0.j1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC11283zo0.r1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC11283zo0.B1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC11283zo0.X1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: o.bo0$b */
    /* loaded from: classes.dex */
    public static final class b {
        public Field a;
        public EnumC11283zo0 b;
        public int c;
        public Field d;
        public int e;
        public boolean f;
        public boolean g;
        public C11312zv1 h;
        public Class<?> i;
        public Object j;
        public C9740tS0.e k;
        public Field l;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public C5415bo0 a() {
            C11312zv1 c11312zv1 = this.h;
            if (c11312zv1 != null) {
                return C5415bo0.l(this.c, this.b, c11312zv1, this.i, this.g, this.k);
            }
            Object obj = this.j;
            if (obj != null) {
                return C5415bo0.j(this.a, this.c, obj, this.k);
            }
            Field field = this.d;
            if (field != null) {
                if (this.f) {
                    return C5415bo0.p(this.a, this.c, this.b, field, this.e, this.g, this.k);
                }
                return C5415bo0.o(this.a, this.c, this.b, field, this.e, this.g, this.k);
            }
            C9740tS0.e eVar = this.k;
            if (eVar != null) {
                Field field2 = this.l;
                if (field2 == null) {
                    return C5415bo0.i(this.a, this.c, this.b, eVar);
                }
                return C5415bo0.n(this.a, this.c, this.b, eVar, field2);
            }
            Field field3 = this.l;
            if (field3 == null) {
                return C5415bo0.h(this.a, this.c, this.b, this.g);
            }
            return C5415bo0.m(this.a, this.c, this.b, field3);
        }

        public b b(Field field) {
            this.l = field;
            return this;
        }

        public b c(boolean z) {
            this.g = z;
            return this;
        }

        public b d(C9740tS0.e eVar) {
            this.k = eVar;
            return this;
        }

        public b e(Field field) {
            if (this.h == null) {
                this.a = field;
                return this;
            }
            throw new IllegalStateException("Cannot set field when building a oneof.");
        }

        public b f(int i) {
            this.c = i;
            return this;
        }

        public b g(Object obj) {
            this.j = obj;
            return this;
        }

        public b h(C11312zv1 c11312zv1, Class<?> cls) {
            if (this.a == null && this.d == null) {
                this.h = c11312zv1;
                this.i = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public b i(Field field, int i) {
            this.d = (Field) C9740tS0.e(field, "presenceField");
            this.e = i;
            return this;
        }

        public b j(boolean z) {
            this.f = z;
            return this;
        }

        public b k(EnumC11283zo0 enumC11283zo0) {
            this.b = enumC11283zo0;
            return this;
        }

        public b() {
        }
    }

    public C5415bo0(Field field, int i, EnumC11283zo0 enumC11283zo0, Class<?> cls, Field field2, int i2, boolean z, boolean z2, C11312zv1 c11312zv1, Class<?> cls2, Object obj, C9740tS0.e eVar, Field field3) {
        this.X = field;
        this.Y = enumC11283zo0;
        this.Z = cls;
        this.Y0 = i;
        this.Z0 = field2;
        this.a1 = i2;
        this.b1 = z;
        this.c1 = z2;
        this.d1 = c11312zv1;
        this.f1 = cls2;
        this.g1 = obj;
        this.h1 = eVar;
        this.e1 = field3;
    }

    public static boolean E(int i) {
        if (i != 0 && (i & (i - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static b G() {
        return new b(null);
    }

    public static void e(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    public static C5415bo0 h(Field field, int i, EnumC11283zo0 enumC11283zo0, boolean z) {
        e(i);
        C9740tS0.e(field, "field");
        C9740tS0.e(enumC11283zo0, "fieldType");
        if (enumC11283zo0 != EnumC11283zo0.B1 && enumC11283zo0 != EnumC11283zo0.X1) {
            return new C5415bo0(field, i, enumC11283zo0, null, null, 0, false, z, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static C5415bo0 i(Field field, int i, EnumC11283zo0 enumC11283zo0, C9740tS0.e eVar) {
        e(i);
        C9740tS0.e(field, "field");
        return new C5415bo0(field, i, enumC11283zo0, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static C5415bo0 j(Field field, int i, Object obj, C9740tS0.e eVar) {
        C9740tS0.e(obj, "mapDefaultEntry");
        e(i);
        C9740tS0.e(field, "field");
        return new C5415bo0(field, i, EnumC11283zo0.Y1, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static C5415bo0 l(int i, EnumC11283zo0 enumC11283zo0, C11312zv1 c11312zv1, Class<?> cls, boolean z, C9740tS0.e eVar) {
        e(i);
        C9740tS0.e(enumC11283zo0, "fieldType");
        C9740tS0.e(c11312zv1, "oneof");
        C9740tS0.e(cls, "oneofStoredType");
        if (enumC11283zo0.o()) {
            return new C5415bo0(null, i, enumC11283zo0, null, null, 0, false, z, c11312zv1, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + enumC11283zo0);
    }

    public static C5415bo0 m(Field field, int i, EnumC11283zo0 enumC11283zo0, Field field2) {
        e(i);
        C9740tS0.e(field, "field");
        C9740tS0.e(enumC11283zo0, "fieldType");
        if (enumC11283zo0 != EnumC11283zo0.B1 && enumC11283zo0 != EnumC11283zo0.X1) {
            return new C5415bo0(field, i, enumC11283zo0, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static C5415bo0 n(Field field, int i, EnumC11283zo0 enumC11283zo0, C9740tS0.e eVar, Field field2) {
        e(i);
        C9740tS0.e(field, "field");
        return new C5415bo0(field, i, enumC11283zo0, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static C5415bo0 o(Field field, int i, EnumC11283zo0 enumC11283zo0, Field field2, int i2, boolean z, C9740tS0.e eVar) {
        e(i);
        C9740tS0.e(field, "field");
        C9740tS0.e(enumC11283zo0, "fieldType");
        C9740tS0.e(field2, "presenceField");
        if (field2 != null && !E(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new C5415bo0(field, i, enumC11283zo0, null, field2, i2, false, z, null, null, null, eVar, null);
    }

    public static C5415bo0 p(Field field, int i, EnumC11283zo0 enumC11283zo0, Field field2, int i2, boolean z, C9740tS0.e eVar) {
        e(i);
        C9740tS0.e(field, "field");
        C9740tS0.e(enumC11283zo0, "fieldType");
        C9740tS0.e(field2, "presenceField");
        if (field2 != null && !E(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new C5415bo0(field, i, enumC11283zo0, null, field2, i2, true, z, null, null, null, eVar, null);
    }

    public static C5415bo0 q(Field field, int i, EnumC11283zo0 enumC11283zo0, Class<?> cls) {
        e(i);
        C9740tS0.e(field, "field");
        C9740tS0.e(enumC11283zo0, "fieldType");
        C9740tS0.e(cls, "messageClass");
        return new C5415bo0(field, i, enumC11283zo0, cls, null, 0, false, false, null, null, null, null, null);
    }

    public Field A() {
        return this.Z0;
    }

    public int B() {
        return this.a1;
    }

    public EnumC11283zo0 C() {
        return this.Y;
    }

    public boolean D() {
        return this.c1;
    }

    public boolean F() {
        return this.b1;
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C5415bo0 c5415bo0) {
        return this.Y0 - c5415bo0.Y0;
    }

    public Field r() {
        return this.e1;
    }

    public C9740tS0.e s() {
        return this.h1;
    }

    public Field t() {
        return this.X;
    }

    public int u() {
        return this.Y0;
    }

    public Class<?> v() {
        return this.Z;
    }

    public Object w() {
        return this.g1;
    }

    public Class<?> x() {
        int i = a.a[this.Y.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return null;
            }
            return this.Z;
        }
        Field field = this.X;
        if (field != null) {
            return field.getType();
        }
        return this.f1;
    }

    public C11312zv1 y() {
        return this.d1;
    }

    public Class<?> z() {
        return this.f1;
    }
}
