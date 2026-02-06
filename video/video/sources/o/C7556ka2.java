package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.IC0;

/* renamed from: o.ka2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7556ka2 extends IC0<C7556ka2, b> implements InterfaceC7799la2 {
    private static final C7556ka2 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC3892Oy1<C7556ka2> PARSER;
    private String fileName_ = "";

    /* renamed from: o.ka2$a */
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

    /* renamed from: o.ka2$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C7556ka2, b> implements InterfaceC7799la2 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.InterfaceC7799la2
        public AbstractC8616os S0() {
            return ((C7556ka2) this.Y).S0();
        }

        public b Y1() {
            P1();
            ((C7556ka2) this.Y).C2();
            return this;
        }

        public b Z1(String str) {
            P1();
            ((C7556ka2) this.Y).T2(str);
            return this;
        }

        public b a2(AbstractC8616os abstractC8616os) {
            P1();
            ((C7556ka2) this.Y).U2(abstractC8616os);
            return this;
        }

        @Override // o.InterfaceC7799la2
        public String getFileName() {
            return ((C7556ka2) this.Y).getFileName();
        }

        public b() {
            super(C7556ka2.DEFAULT_INSTANCE);
        }
    }

    static {
        C7556ka2 c7556ka2 = new C7556ka2();
        DEFAULT_INSTANCE = c7556ka2;
        IC0.w2(C7556ka2.class, c7556ka2);
    }

    public static C7556ka2 D2() {
        return DEFAULT_INSTANCE;
    }

    public static b E2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b F2(C7556ka2 c7556ka2) {
        return DEFAULT_INSTANCE.w1(c7556ka2);
    }

    public static C7556ka2 G2(InputStream inputStream) throws IOException {
        return (C7556ka2) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C7556ka2 H2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C7556ka2) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C7556ka2 I2(InputStream inputStream) throws IOException {
        return (C7556ka2) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C7556ka2 J2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C7556ka2) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C7556ka2 K2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C7556ka2) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C7556ka2 L2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C7556ka2) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C7556ka2 M2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C7556ka2) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C7556ka2 N2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C7556ka2) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C7556ka2 O2(KE ke) throws IOException {
        return (C7556ka2) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C7556ka2 P2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C7556ka2) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C7556ka2 Q2(byte[] bArr) throws C9258rT0 {
        return (C7556ka2) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C7556ka2 R2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C7556ka2) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C7556ka2> S2() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C7556ka2();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C7556ka2> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C7556ka2.class) {
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

    public final void C2() {
        this.fileName_ = D2().getFileName();
    }

    @Override // o.InterfaceC7799la2
    public AbstractC8616os S0() {
        return AbstractC8616os.H(this.fileName_);
    }

    public final void T2(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    public final void U2(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.fileName_ = abstractC8616os.B0();
    }

    @Override // o.InterfaceC7799la2
    public String getFileName() {
        return this.fileName_;
    }
}
