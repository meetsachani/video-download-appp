package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.C8544oa;
import o.IC0;

/* renamed from: o.Rv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4174Rv1 extends IC0<C4174Rv1, b> implements InterfaceC4371Tv1 {
    private static final C4174Rv1 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC3892Oy1<C4174Rv1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private C8544oa value_;

    /* renamed from: o.Rv1$a */
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

    /* renamed from: o.Rv1$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C4174Rv1, b> implements InterfaceC4371Tv1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.InterfaceC4371Tv1
        public boolean M0() {
            return ((C4174Rv1) this.Y).M0();
        }

        public b Y1() {
            P1();
            ((C4174Rv1) this.Y).G2();
            return this;
        }

        public b Z1() {
            P1();
            ((C4174Rv1) this.Y).H2();
            return this;
        }

        public b a2(C8544oa c8544oa) {
            P1();
            ((C4174Rv1) this.Y).J2(c8544oa);
            return this;
        }

        @Override // o.InterfaceC4371Tv1
        public AbstractC8616os b() {
            return ((C4174Rv1) this.Y).b();
        }

        public b b2(String str) {
            P1();
            ((C4174Rv1) this.Y).Z2(str);
            return this;
        }

        public b c2(AbstractC8616os abstractC8616os) {
            P1();
            ((C4174Rv1) this.Y).a3(abstractC8616os);
            return this;
        }

        public b d2(C8544oa.b bVar) {
            P1();
            ((C4174Rv1) this.Y).b3(bVar);
            return this;
        }

        public b e2(C8544oa c8544oa) {
            P1();
            ((C4174Rv1) this.Y).c3(c8544oa);
            return this;
        }

        @Override // o.InterfaceC4371Tv1
        public String getName() {
            return ((C4174Rv1) this.Y).getName();
        }

        @Override // o.InterfaceC4371Tv1
        public C8544oa getValue() {
            return ((C4174Rv1) this.Y).getValue();
        }

        public b() {
            super(C4174Rv1.DEFAULT_INSTANCE);
        }
    }

    static {
        C4174Rv1 c4174Rv1 = new C4174Rv1();
        DEFAULT_INSTANCE = c4174Rv1;
        IC0.w2(C4174Rv1.class, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2() {
        this.name_ = I2().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H2() {
        this.value_ = null;
    }

    public static C4174Rv1 I2() {
        return DEFAULT_INSTANCE;
    }

    public static b K2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b L2(C4174Rv1 c4174Rv1) {
        return DEFAULT_INSTANCE.w1(c4174Rv1);
    }

    public static C4174Rv1 M2(InputStream inputStream) throws IOException {
        return (C4174Rv1) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C4174Rv1 N2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C4174Rv1) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C4174Rv1 O2(InputStream inputStream) throws IOException {
        return (C4174Rv1) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C4174Rv1 P2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C4174Rv1) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C4174Rv1 Q2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C4174Rv1) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C4174Rv1 R2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4174Rv1) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C4174Rv1 S2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C4174Rv1) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C4174Rv1 T2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4174Rv1) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C4174Rv1 U2(KE ke) throws IOException {
        return (C4174Rv1) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C4174Rv1 V2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C4174Rv1) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C4174Rv1 W2(byte[] bArr) throws C9258rT0 {
        return (C4174Rv1) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C4174Rv1 X2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4174Rv1) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C4174Rv1> Y2() {
        return DEFAULT_INSTANCE.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.name_ = abstractC8616os.B0();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C4174Rv1();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C4174Rv1> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C4174Rv1.class) {
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

    public final void J2(C8544oa c8544oa) {
        c8544oa.getClass();
        C8544oa c8544oa2 = this.value_;
        if (c8544oa2 != null && c8544oa2 != C8544oa.G2()) {
            this.value_ = C8544oa.I2(this.value_).U1(c8544oa).i2();
        } else {
            this.value_ = c8544oa;
        }
    }

    @Override // o.InterfaceC4371Tv1
    public boolean M0() {
        if (this.value_ != null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4371Tv1
    public AbstractC8616os b() {
        return AbstractC8616os.H(this.name_);
    }

    public final void b3(C8544oa.b bVar) {
        this.value_ = bVar.build();
    }

    public final void c3(C8544oa c8544oa) {
        c8544oa.getClass();
        this.value_ = c8544oa;
    }

    @Override // o.InterfaceC4371Tv1
    public String getName() {
        return this.name_;
    }

    @Override // o.InterfaceC4371Tv1
    public C8544oa getValue() {
        C8544oa c8544oa = this.value_;
        if (c8544oa == null) {
            return C8544oa.G2();
        }
        return c8544oa;
    }
}
