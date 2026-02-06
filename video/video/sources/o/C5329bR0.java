package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.IC0;

/* renamed from: o.bR0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5329bR0 extends IC0<C5329bR0, b> implements InterfaceC5571cR0 {
    private static final C5329bR0 DEFAULT_INSTANCE;
    private static volatile InterfaceC3892Oy1<C5329bR0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* renamed from: o.bR0$a */
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

    /* renamed from: o.bR0$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C5329bR0, b> implements InterfaceC5571cR0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b Y1() {
            P1();
            ((C5329bR0) this.Y).B2();
            return this;
        }

        public b Z1(int i) {
            P1();
            ((C5329bR0) this.Y).T2(i);
            return this;
        }

        @Override // o.InterfaceC5571cR0
        public int getValue() {
            return ((C5329bR0) this.Y).getValue();
        }

        public b() {
            super(C5329bR0.DEFAULT_INSTANCE);
        }
    }

    static {
        C5329bR0 c5329bR0 = new C5329bR0();
        DEFAULT_INSTANCE = c5329bR0;
        IC0.w2(C5329bR0.class, c5329bR0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B2() {
        this.value_ = 0;
    }

    public static C5329bR0 C2() {
        return DEFAULT_INSTANCE;
    }

    public static b D2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b E2(C5329bR0 c5329bR0) {
        return DEFAULT_INSTANCE.w1(c5329bR0);
    }

    public static C5329bR0 F2(int i) {
        return D2().Z1(i).build();
    }

    public static C5329bR0 G2(InputStream inputStream) throws IOException {
        return (C5329bR0) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C5329bR0 H2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C5329bR0) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C5329bR0 I2(InputStream inputStream) throws IOException {
        return (C5329bR0) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C5329bR0 J2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C5329bR0) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C5329bR0 K2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C5329bR0) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C5329bR0 L2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C5329bR0) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C5329bR0 M2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C5329bR0) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C5329bR0 N2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C5329bR0) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C5329bR0 O2(KE ke) throws IOException {
        return (C5329bR0) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C5329bR0 P2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C5329bR0) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C5329bR0 Q2(byte[] bArr) throws C9258rT0 {
        return (C5329bR0) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C5329bR0 R2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C5329bR0) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C5329bR0> S2() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C5329bR0();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C5329bR0> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C5329bR0.class) {
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

    public final void T2(int i) {
        this.value_ = i;
    }

    @Override // o.InterfaceC5571cR0
    public int getValue() {
        return this.value_;
    }
}
