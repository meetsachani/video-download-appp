package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.IC0;

/* renamed from: o.bk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5400bk1 extends IC0<C5400bk1, b> implements InterfaceC5642ck1 {
    private static final C5400bk1 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC3892Oy1<C5400bk1> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* renamed from: o.bk1$a */
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

    /* renamed from: o.bk1$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C5400bk1, b> implements InterfaceC5642ck1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b Y1() {
            P1();
            ((C5400bk1) this.Y).F2();
            return this;
        }

        public b Z1() {
            P1();
            ((C5400bk1) this.Y).G2();
            return this;
        }

        public b a2(String str) {
            P1();
            ((C5400bk1) this.Y).X2(str);
            return this;
        }

        @Override // o.InterfaceC5642ck1
        public AbstractC8616os b() {
            return ((C5400bk1) this.Y).b();
        }

        public b b2(AbstractC8616os abstractC8616os) {
            P1();
            ((C5400bk1) this.Y).Y2(abstractC8616os);
            return this;
        }

        public b c2(String str) {
            P1();
            ((C5400bk1) this.Y).Z2(str);
            return this;
        }

        public b d2(AbstractC8616os abstractC8616os) {
            P1();
            ((C5400bk1) this.Y).a3(abstractC8616os);
            return this;
        }

        @Override // o.InterfaceC5642ck1
        public String getName() {
            return ((C5400bk1) this.Y).getName();
        }

        @Override // o.InterfaceC5642ck1
        public String getRoot() {
            return ((C5400bk1) this.Y).getRoot();
        }

        @Override // o.InterfaceC5642ck1
        public AbstractC8616os t() {
            return ((C5400bk1) this.Y).t();
        }

        public b() {
            super(C5400bk1.DEFAULT_INSTANCE);
        }
    }

    static {
        C5400bk1 c5400bk1 = new C5400bk1();
        DEFAULT_INSTANCE = c5400bk1;
        IC0.w2(C5400bk1.class, c5400bk1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F2() {
        this.name_ = H2().getName();
    }

    public static C5400bk1 H2() {
        return DEFAULT_INSTANCE;
    }

    public static b I2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b J2(C5400bk1 c5400bk1) {
        return DEFAULT_INSTANCE.w1(c5400bk1);
    }

    public static C5400bk1 K2(InputStream inputStream) throws IOException {
        return (C5400bk1) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C5400bk1 L2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C5400bk1) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C5400bk1 M2(InputStream inputStream) throws IOException {
        return (C5400bk1) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C5400bk1 N2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C5400bk1) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C5400bk1 O2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C5400bk1) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C5400bk1 P2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C5400bk1) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C5400bk1 Q2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C5400bk1) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C5400bk1 R2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C5400bk1) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C5400bk1 S2(KE ke) throws IOException {
        return (C5400bk1) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C5400bk1 T2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C5400bk1) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C5400bk1 U2(byte[] bArr) throws C9258rT0 {
        return (C5400bk1) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C5400bk1 V2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C5400bk1) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C5400bk1> W2() {
        return DEFAULT_INSTANCE.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X2(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.name_ = abstractC8616os.B0();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C5400bk1();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C5400bk1> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C5400bk1.class) {
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

    public final void G2() {
        this.root_ = H2().getRoot();
    }

    public final void Z2(String str) {
        str.getClass();
        this.root_ = str;
    }

    public final void a3(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.root_ = abstractC8616os.B0();
    }

    @Override // o.InterfaceC5642ck1
    public AbstractC8616os b() {
        return AbstractC8616os.H(this.name_);
    }

    @Override // o.InterfaceC5642ck1
    public String getName() {
        return this.name_;
    }

    @Override // o.InterfaceC5642ck1
    public String getRoot() {
        return this.root_;
    }

    @Override // o.InterfaceC5642ck1
    public AbstractC8616os t() {
        return AbstractC8616os.H(this.root_);
    }
}
