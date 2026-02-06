package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class IM2 {
    public static final int a = 4;
    public static final int b = 8;
    public static final int c = 5;
    public static final int d = 10;
    public static final int e = 10;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 3;
    public static final int m = 7;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f497o = 2;
    public static final int p = 3;
    public static final int q = c(1, 3);
    public static final int r = c(1, 4);
    public static final int s = c(2, 0);
    public static final int t = c(3, 2);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.Y0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.Z0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.a1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.b1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.c1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.d1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.e1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.i1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[b.j1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[b.l1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[b.m1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[b.n1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[b.o1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[b.f1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[b.g1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[b.h1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[b.k1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

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
    public static class b {
        public static final b Y0;
        public static final b Z;
        public static final b Z0;
        public static final b a1;
        public static final b b1;
        public static final b c1;
        public static final b d1;
        public static final b e1;
        public static final b f1;
        public static final b g1;
        public static final b h1;
        public static final b i1;
        public static final b j1;
        public static final b k1;
        public static final b l1;
        public static final b m1;
        public static final b n1;
        public static final b o1;
        public static final /* synthetic */ b[] p1;
        public final c X;
        public final int Y;

        /* loaded from: classes.dex */
        public enum a extends b {
            public a(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }

            @Override // o.IM2.b
            public boolean h() {
                return false;
            }
        }

        /* renamed from: o.IM2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum C0190b extends b {
            public C0190b(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }

            @Override // o.IM2.b
            public boolean h() {
                return false;
            }
        }

        /* loaded from: classes.dex */
        public enum c extends b {
            public c(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }

            @Override // o.IM2.b
            public boolean h() {
                return false;
            }
        }

        /* loaded from: classes.dex */
        public enum d extends b {
            public d(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }

            @Override // o.IM2.b
            public boolean h() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            Z = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            Y0 = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            Z0 = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            a1 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            b1 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            c1 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            d1 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            e1 = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f1 = aVar;
            c cVar3 = c.MESSAGE;
            C0190b c0190b = new C0190b("GROUP", 9, cVar3, 3);
            g1 = c0190b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            h1 = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            i1 = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            j1 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            k1 = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            l1 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            m1 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            n1 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            o1 = bVar14;
            p1 = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0190b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public /* synthetic */ b(String str, int i, c cVar, int i2, a aVar) {
            this(str, i, cVar, i2);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) p1.clone();
        }

        public c e() {
            return this.X;
        }

        public int g() {
            return this.Y;
        }

        public boolean h() {
            return true;
        }

        public b(String str, int i, c cVar, int i2) {
            this.X = cVar;
            this.Y = i2;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC8616os.Z0),
        ENUM(null),
        MESSAGE(null);
        
        public final Object X;

        c(Object obj) {
            this.X = obj;
        }

        public Object e() {
            return this.X;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class d {
        public static final d X;
        public static final d Y;
        public static final /* synthetic */ d[] Y0;
        public static final d Z;

        /* loaded from: classes.dex */
        public enum a extends d {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.IM2.d
            public Object e(KE ke) throws IOException {
                return ke.W();
            }
        }

        /* loaded from: classes.dex */
        public enum b extends d {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.IM2.d
            public Object e(KE ke) throws IOException {
                return ke.X();
            }
        }

        /* loaded from: classes.dex */
        public enum c extends d {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // o.IM2.d
            public Object e(KE ke) throws IOException {
                return ke.x();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            X = aVar;
            b bVar = new b("STRICT", 1);
            Y = bVar;
            c cVar = new c("LAZY", 2);
            Z = cVar;
            Y0 = new d[]{aVar, bVar, cVar};
        }

        public d(String str, int i) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) Y0.clone();
        }

        public abstract Object e(KE ke) throws IOException;

        public /* synthetic */ d(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static int a(int i2) {
        return i2 >>> 3;
    }

    public static int b(int i2) {
        return i2 & 7;
    }

    public static int c(int i2, int i3) {
        return (i2 << 3) | i3;
    }

    public static Object d(KE ke, b bVar, d dVar) throws IOException {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(ke.y());
            case 2:
                return Float.valueOf(ke.C());
            case 3:
                return Long.valueOf(ke.G());
            case 4:
                return Long.valueOf(ke.a0());
            case 5:
                return Integer.valueOf(ke.F());
            case 6:
                return Long.valueOf(ke.B());
            case 7:
                return Integer.valueOf(ke.A());
            case 8:
                return Boolean.valueOf(ke.u());
            case 9:
                return ke.x();
            case 10:
                return Integer.valueOf(ke.Z());
            case 11:
                return Integer.valueOf(ke.S());
            case 12:
                return Long.valueOf(ke.T());
            case 13:
                return Integer.valueOf(ke.U());
            case 14:
                return Long.valueOf(ke.V());
            case 15:
                return dVar.e(ke);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
