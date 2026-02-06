package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.IC0;

/* renamed from: o.Ze2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4898Ze2 extends IC0<C4898Ze2, b> implements InterfaceC5138af2 {
    private static final C4898Ze2 DEFAULT_INSTANCE;
    private static volatile InterfaceC3892Oy1<C4898Ze2> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* renamed from: o.Ze2$a */
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

    /* renamed from: o.Ze2$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C4898Ze2, b> implements InterfaceC5138af2 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b Y1() {
            P1();
            ((C4898Ze2) this.Y).C2();
            return this;
        }

        public b Z1(String str) {
            P1();
            ((C4898Ze2) this.Y).U2(str);
            return this;
        }

        public b a2(AbstractC8616os abstractC8616os) {
            P1();
            ((C4898Ze2) this.Y).V2(abstractC8616os);
            return this;
        }

        @Override // o.InterfaceC5138af2
        public String getValue() {
            return ((C4898Ze2) this.Y).getValue();
        }

        @Override // o.InterfaceC5138af2
        public AbstractC8616os l1() {
            return ((C4898Ze2) this.Y).l1();
        }

        public b() {
            super(C4898Ze2.DEFAULT_INSTANCE);
        }
    }

    static {
        C4898Ze2 c4898Ze2 = new C4898Ze2();
        DEFAULT_INSTANCE = c4898Ze2;
        IC0.w2(C4898Ze2.class, c4898Ze2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C2() {
        this.value_ = D2().getValue();
    }

    public static C4898Ze2 D2() {
        return DEFAULT_INSTANCE;
    }

    public static b E2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b F2(C4898Ze2 c4898Ze2) {
        return DEFAULT_INSTANCE.w1(c4898Ze2);
    }

    public static C4898Ze2 G2(String str) {
        return E2().Z1(str).build();
    }

    public static C4898Ze2 H2(InputStream inputStream) throws IOException {
        return (C4898Ze2) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C4898Ze2 I2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C4898Ze2) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C4898Ze2 J2(InputStream inputStream) throws IOException {
        return (C4898Ze2) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C4898Ze2 K2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C4898Ze2) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C4898Ze2 L2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C4898Ze2) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C4898Ze2 M2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4898Ze2) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C4898Ze2 N2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C4898Ze2) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C4898Ze2 O2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4898Ze2) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C4898Ze2 P2(KE ke) throws IOException {
        return (C4898Ze2) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C4898Ze2 Q2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C4898Ze2) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C4898Ze2 R2(byte[] bArr) throws C9258rT0 {
        return (C4898Ze2) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C4898Ze2 S2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4898Ze2) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C4898Ze2> T2() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C4898Ze2();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C4898Ze2> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C4898Ze2.class) {
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

    public final void U2(String str) {
        str.getClass();
        this.value_ = str;
    }

    public final void V2(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.value_ = abstractC8616os.B0();
    }

    @Override // o.InterfaceC5138af2
    public String getValue() {
        return this.value_;
    }

    @Override // o.InterfaceC5138af2
    public AbstractC8616os l1() {
        return AbstractC8616os.H(this.value_);
    }
}
