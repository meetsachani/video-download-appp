package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.C4174Rv1;
import o.C9740tS0;
import o.IC0;

/* renamed from: o.On0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3852On0 extends IC0<C3852On0, b> implements InterfaceC10554wo0 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final C3852On0 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile InterfaceC3892Oy1<C3852On0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private C9740tS0.k<C4174Rv1> options_ = IC0.G1();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* renamed from: o.On0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IC0.i.values().length];
            a = iArr;
            try {
                iArr[IC0.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IC0.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IC0.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IC0.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IC0.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IC0.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IC0.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.On0$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C3852On0, b> implements InterfaceC10554wo0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.InterfaceC10554wo0
        public c A() {
            return ((C3852On0) this.Y).A();
        }

        public b A2(int i) {
            P1();
            ((C3852On0) this.Y).j4(i);
            return this;
        }

        public b B2(int i) {
            P1();
            ((C3852On0) this.Y).k4(i);
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public boolean C() {
            return ((C3852On0) this.Y).C();
        }

        public b C2(int i, C4174Rv1.b bVar) {
            P1();
            ((C3852On0) this.Y).l4(i, bVar);
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public AbstractC8616os D() {
            return ((C3852On0) this.Y).D();
        }

        public b D2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C3852On0) this.Y).m4(i, c4174Rv1);
            return this;
        }

        public b E2(boolean z) {
            P1();
            ((C3852On0) this.Y).n4(z);
            return this;
        }

        public b F2(String str) {
            P1();
            ((C3852On0) this.Y).o4(str);
            return this;
        }

        public b G2(AbstractC8616os abstractC8616os) {
            P1();
            ((C3852On0) this.Y).p4(abstractC8616os);
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public int L() {
            return ((C3852On0) this.Y).L();
        }

        @Override // o.InterfaceC10554wo0
        public int S() {
            return ((C3852On0) this.Y).S();
        }

        public b Y1(Iterable<? extends C4174Rv1> iterable) {
            P1();
            ((C3852On0) this.Y).h3(iterable);
            return this;
        }

        public b Z1(int i, C4174Rv1.b bVar) {
            P1();
            ((C3852On0) this.Y).i3(i, bVar);
            return this;
        }

        public b a2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C3852On0) this.Y).j3(i, c4174Rv1);
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public AbstractC8616os b() {
            return ((C3852On0) this.Y).b();
        }

        public b b2(C4174Rv1.b bVar) {
            P1();
            ((C3852On0) this.Y).k3(bVar);
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public List<C4174Rv1> c() {
            return Collections.unmodifiableList(((C3852On0) this.Y).c());
        }

        public b c2(C4174Rv1 c4174Rv1) {
            P1();
            ((C3852On0) this.Y).l3(c4174Rv1);
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public int d() {
            return ((C3852On0) this.Y).d();
        }

        @Override // o.InterfaceC10554wo0
        public String d1() {
            return ((C3852On0) this.Y).d1();
        }

        public b d2() {
            P1();
            ((C3852On0) this.Y).m3();
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public C4174Rv1 e(int i) {
            return ((C3852On0) this.Y).e(i);
        }

        @Override // o.InterfaceC10554wo0
        public int e1() {
            return ((C3852On0) this.Y).e1();
        }

        public b e2() {
            P1();
            ((C3852On0) this.Y).n3();
            return this;
        }

        public b f2() {
            P1();
            ((C3852On0) this.Y).o3();
            return this;
        }

        public b g2() {
            P1();
            ((C3852On0) this.Y).p3();
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public String getName() {
            return ((C3852On0) this.Y).getName();
        }

        public b h2() {
            P1();
            ((C3852On0) this.Y).r3();
            return this;
        }

        public b j2() {
            P1();
            ((C3852On0) this.Y).s3();
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public int k() {
            return ((C3852On0) this.Y).k();
        }

        public b k2() {
            P1();
            ((C3852On0) this.Y).t3();
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public AbstractC8616os m() {
            return ((C3852On0) this.Y).m();
        }

        public b m2() {
            P1();
            ((C3852On0) this.Y).u3();
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public d n() {
            return ((C3852On0) this.Y).n();
        }

        @Override // o.InterfaceC10554wo0
        public AbstractC8616os n1() {
            return ((C3852On0) this.Y).n1();
        }

        public b n2() {
            P1();
            ((C3852On0) this.Y).v3();
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public String o() {
            return ((C3852On0) this.Y).o();
        }

        public b o2() {
            P1();
            ((C3852On0) this.Y).w3();
            return this;
        }

        public b p2(int i) {
            P1();
            ((C3852On0) this.Y).X3(i);
            return this;
        }

        public b q2(c cVar) {
            P1();
            ((C3852On0) this.Y).Y3(cVar);
            return this;
        }

        @Override // o.InterfaceC10554wo0
        public String r() {
            return ((C3852On0) this.Y).r();
        }

        public b r2(int i) {
            P1();
            ((C3852On0) this.Y).Z3(i);
            return this;
        }

        public b s2(String str) {
            P1();
            ((C3852On0) this.Y).a4(str);
            return this;
        }

        public b t2(AbstractC8616os abstractC8616os) {
            P1();
            ((C3852On0) this.Y).b4(abstractC8616os);
            return this;
        }

        public b u2(String str) {
            P1();
            ((C3852On0) this.Y).c4(str);
            return this;
        }

        public b v2(AbstractC8616os abstractC8616os) {
            P1();
            ((C3852On0) this.Y).d4(abstractC8616os);
            return this;
        }

        public b w2(d dVar) {
            P1();
            ((C3852On0) this.Y).e4(dVar);
            return this;
        }

        public b x2(int i) {
            P1();
            ((C3852On0) this.Y).f4(i);
            return this;
        }

        public b y2(String str) {
            P1();
            ((C3852On0) this.Y).g4(str);
            return this;
        }

        public b z2(AbstractC8616os abstractC8616os) {
            P1();
            ((C3852On0) this.Y).i4(abstractC8616os);
            return this;
        }

        public b() {
            super(C3852On0.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.On0$c */
    /* loaded from: classes.dex */
    public enum c implements C9740tS0.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);
        
        public static final int b1 = 0;
        public static final int c1 = 1;
        public static final int d1 = 2;
        public static final int e1 = 3;
        public static final C9740tS0.d<c> f1 = new a();
        public final int X;

        /* renamed from: o.On0$c$a */
        /* loaded from: classes.dex */
        public static class a implements C9740tS0.d<c> {
            @Override // o.C9740tS0.d
            /* renamed from: b */
            public c a(int i) {
                return c.e(i);
            }
        }

        /* renamed from: o.On0$c$b */
        /* loaded from: classes.dex */
        public static final class b implements C9740tS0.e {
            public static final C9740tS0.e a = new b();

            @Override // o.C9740tS0.e
            public boolean a(int i) {
                if (c.e(i) != null) {
                    return true;
                }
                return false;
            }
        }

        c(int i) {
            this.X = i;
        }

        public static c e(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return CARDINALITY_REPEATED;
                    }
                    return CARDINALITY_REQUIRED;
                }
                return CARDINALITY_OPTIONAL;
            }
            return CARDINALITY_UNKNOWN;
        }

        public static C9740tS0.d<c> g() {
            return f1;
        }

        public static C9740tS0.e h() {
            return b.a;
        }

        @Deprecated
        public static c i(int i) {
            return e(i);
        }

        @Override // o.C9740tS0.c
        public final int k() {
            if (this != UNRECOGNIZED) {
                return this.X;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: o.On0$d */
    /* loaded from: classes.dex */
    public enum d implements C9740tS0.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);
        
        public static final int A1 = 10;
        public static final int B1 = 11;
        public static final int C1 = 12;
        public static final int D1 = 13;
        public static final int E1 = 14;
        public static final int F1 = 15;
        public static final int G1 = 16;
        public static final int H1 = 17;
        public static final int I1 = 18;
        public static final C9740tS0.d<d> J1 = new a();
        public static final int q1 = 0;
        public static final int r1 = 1;
        public static final int s1 = 2;
        public static final int t1 = 3;
        public static final int u1 = 4;
        public static final int v1 = 5;
        public static final int w1 = 6;
        public static final int x1 = 7;
        public static final int y1 = 8;
        public static final int z1 = 9;
        public final int X;

        /* renamed from: o.On0$d$a */
        /* loaded from: classes.dex */
        public static class a implements C9740tS0.d<d> {
            @Override // o.C9740tS0.d
            /* renamed from: b */
            public d a(int i) {
                return d.e(i);
            }
        }

        /* renamed from: o.On0$d$b */
        /* loaded from: classes.dex */
        public static final class b implements C9740tS0.e {
            public static final C9740tS0.e a = new b();

            @Override // o.C9740tS0.e
            public boolean a(int i) {
                if (d.e(i) != null) {
                    return true;
                }
                return false;
            }
        }

        d(int i) {
            this.X = i;
        }

        public static d e(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static C9740tS0.d<d> g() {
            return J1;
        }

        public static C9740tS0.e h() {
            return b.a;
        }

        @Deprecated
        public static d i(int i) {
            return e(i);
        }

        @Override // o.C9740tS0.c
        public final int k() {
            if (this != UNRECOGNIZED) {
                return this.X;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C3852On0 c3852On0 = new C3852On0();
        DEFAULT_INSTANCE = c3852On0;
        IC0.w2(C3852On0.class, c3852On0);
    }

    public static b E3() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b H3(C3852On0 c3852On0) {
        return DEFAULT_INSTANCE.w1(c3852On0);
    }

    public static C3852On0 I3(InputStream inputStream) throws IOException {
        return (C3852On0) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C3852On0 J3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C3852On0) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C3852On0 K3(InputStream inputStream) throws IOException {
        return (C3852On0) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C3852On0 L3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C3852On0) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C3852On0 M3(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C3852On0) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C3852On0 N3(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C3852On0) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C3852On0 O3(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C3852On0) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C3852On0 P3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C3852On0) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C3852On0 R3(KE ke) throws IOException {
        return (C3852On0) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C3852On0 S3(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C3852On0) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C3852On0 T3(byte[] bArr) throws C9258rT0 {
        return (C3852On0) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C3852On0 U3(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C3852On0) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C3852On0> W3() {
        return DEFAULT_INSTANCE.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(int i) {
        x3();
        this.options_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(Iterable<? extends C4174Rv1> iterable) {
        x3();
        AbstractC5713d2.a0(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(int i, C4174Rv1.b bVar) {
        x3();
        this.options_.add(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.name_ = abstractC8616os.B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        x3();
        this.options_.add(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(int i) {
        this.number_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(C4174Rv1.b bVar) {
        x3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        x3();
        this.options_.add(c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l4(int i, C4174Rv1.b bVar) {
        x3();
        this.options_.set(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        x3();
        this.options_.set(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.typeUrl_ = abstractC8616os.B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.name_ = z3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3() {
        this.options_ = IC0.G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3() {
        this.typeUrl_ = z3().o();
    }

    private void x3() {
        if (!this.options_.X2()) {
            this.options_ = IC0.W1(this.options_);
        }
    }

    public static C3852On0 z3() {
        return DEFAULT_INSTANCE;
    }

    @Override // o.InterfaceC10554wo0
    public c A() {
        c e = c.e(this.cardinality_);
        if (e == null) {
            return c.UNRECOGNIZED;
        }
        return e;
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C3852On0();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", C4174Rv1.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C3852On0> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C3852On0.class) {
                        try {
                            interfaceC3892Oy1 = PARSER;
                            if (interfaceC3892Oy1 == null) {
                                interfaceC3892Oy1 = new IC0.c(DEFAULT_INSTANCE);
                                PARSER = interfaceC3892Oy1;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return interfaceC3892Oy1;
                }
                return interfaceC3892Oy12;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public InterfaceC4371Tv1 A3(int i) {
        return this.options_.get(i);
    }

    @Override // o.InterfaceC10554wo0
    public boolean C() {
        return this.packed_;
    }

    public List<? extends InterfaceC4371Tv1> C3() {
        return this.options_;
    }

    @Override // o.InterfaceC10554wo0
    public AbstractC8616os D() {
        return AbstractC8616os.H(this.defaultValue_);
    }

    @Override // o.InterfaceC10554wo0
    public int L() {
        return this.oneofIndex_;
    }

    @Override // o.InterfaceC10554wo0
    public int S() {
        return this.cardinality_;
    }

    public final void Y3(c cVar) {
        cVar.getClass();
        this.cardinality_ = cVar.k();
    }

    public final void Z3(int i) {
        this.cardinality_ = i;
    }

    public final void a4(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    @Override // o.InterfaceC10554wo0
    public AbstractC8616os b() {
        return AbstractC8616os.H(this.name_);
    }

    public final void b4(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.defaultValue_ = abstractC8616os.B0();
    }

    @Override // o.InterfaceC10554wo0
    public List<C4174Rv1> c() {
        return this.options_;
    }

    public final void c4(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    @Override // o.InterfaceC10554wo0
    public int d() {
        return this.options_.size();
    }

    @Override // o.InterfaceC10554wo0
    public String d1() {
        return this.jsonName_;
    }

    public final void d4(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.jsonName_ = abstractC8616os.B0();
    }

    @Override // o.InterfaceC10554wo0
    public C4174Rv1 e(int i) {
        return this.options_.get(i);
    }

    @Override // o.InterfaceC10554wo0
    public int e1() {
        return this.kind_;
    }

    public final void e4(d dVar) {
        dVar.getClass();
        this.kind_ = dVar.k();
    }

    public final void f4(int i) {
        this.kind_ = i;
    }

    @Override // o.InterfaceC10554wo0
    public String getName() {
        return this.name_;
    }

    @Override // o.InterfaceC10554wo0
    public int k() {
        return this.number_;
    }

    public final void k4(int i) {
        this.oneofIndex_ = i;
    }

    @Override // o.InterfaceC10554wo0
    public AbstractC8616os m() {
        return AbstractC8616os.H(this.typeUrl_);
    }

    public final void m3() {
        this.cardinality_ = 0;
    }

    @Override // o.InterfaceC10554wo0
    public d n() {
        d e = d.e(this.kind_);
        if (e == null) {
            return d.UNRECOGNIZED;
        }
        return e;
    }

    @Override // o.InterfaceC10554wo0
    public AbstractC8616os n1() {
        return AbstractC8616os.H(this.jsonName_);
    }

    public final void n3() {
        this.defaultValue_ = z3().r();
    }

    public final void n4(boolean z) {
        this.packed_ = z;
    }

    @Override // o.InterfaceC10554wo0
    public String o() {
        return this.typeUrl_;
    }

    public final void o3() {
        this.jsonName_ = z3().d1();
    }

    public final void p3() {
        this.kind_ = 0;
    }

    @Override // o.InterfaceC10554wo0
    public String r() {
        return this.defaultValue_;
    }

    public final void t3() {
        this.oneofIndex_ = 0;
    }

    public final void v3() {
        this.packed_ = false;
    }
}
