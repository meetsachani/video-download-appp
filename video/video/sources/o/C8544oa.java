package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.IC0;

/* renamed from: o.oa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8544oa extends IC0<C8544oa, b> implements InterfaceC9030qa {
    private static final C8544oa DEFAULT_INSTANCE;
    private static volatile InterfaceC3892Oy1<C8544oa> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private AbstractC8616os value_ = AbstractC8616os.Z0;

    /* renamed from: o.oa$a */
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

    /* renamed from: o.oa$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C8544oa, b> implements InterfaceC9030qa {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b Y1() {
            P1();
            ((C8544oa) this.Y).E2();
            return this;
        }

        public b Z1() {
            P1();
            ((C8544oa) this.Y).F2();
            return this;
        }

        public b a2(String str) {
            P1();
            ((C8544oa) this.Y).W2(str);
            return this;
        }

        public b b2(AbstractC8616os abstractC8616os) {
            P1();
            ((C8544oa) this.Y).X2(abstractC8616os);
            return this;
        }

        public b c2(AbstractC8616os abstractC8616os) {
            P1();
            ((C8544oa) this.Y).Y2(abstractC8616os);
            return this;
        }

        @Override // o.InterfaceC9030qa
        public AbstractC8616os getValue() {
            return ((C8544oa) this.Y).getValue();
        }

        @Override // o.InterfaceC9030qa
        public AbstractC8616os m() {
            return ((C8544oa) this.Y).m();
        }

        @Override // o.InterfaceC9030qa
        public String o() {
            return ((C8544oa) this.Y).o();
        }

        public b() {
            super(C8544oa.DEFAULT_INSTANCE);
        }
    }

    static {
        C8544oa c8544oa = new C8544oa();
        DEFAULT_INSTANCE = c8544oa;
        IC0.w2(C8544oa.class, c8544oa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F2() {
        this.value_ = G2().getValue();
    }

    public static C8544oa G2() {
        return DEFAULT_INSTANCE;
    }

    public static b H2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b I2(C8544oa c8544oa) {
        return DEFAULT_INSTANCE.w1(c8544oa);
    }

    public static C8544oa J2(InputStream inputStream) throws IOException {
        return (C8544oa) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C8544oa K2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C8544oa) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C8544oa L2(InputStream inputStream) throws IOException {
        return (C8544oa) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C8544oa M2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C8544oa) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C8544oa N2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C8544oa) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C8544oa O2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C8544oa) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C8544oa P2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C8544oa) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C8544oa Q2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C8544oa) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C8544oa R2(KE ke) throws IOException {
        return (C8544oa) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C8544oa S2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C8544oa) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C8544oa T2(byte[] bArr) throws C9258rT0 {
        return (C8544oa) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C8544oa U2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C8544oa) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C8544oa> V2() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C8544oa();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C8544oa> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C8544oa.class) {
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

    public final void E2() {
        this.typeUrl_ = G2().o();
    }

    public final void W2(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void X2(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.typeUrl_ = abstractC8616os.B0();
    }

    public final void Y2(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        this.value_ = abstractC8616os;
    }

    @Override // o.InterfaceC9030qa
    public AbstractC8616os getValue() {
        return this.value_;
    }

    @Override // o.InterfaceC9030qa
    public AbstractC8616os m() {
        return AbstractC8616os.H(this.typeUrl_);
    }

    @Override // o.InterfaceC9030qa
    public String o() {
        return this.typeUrl_;
    }
}
