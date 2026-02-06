package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.IC0;

/* renamed from: o.La0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3507La0 extends IC0<C3507La0, b> implements InterfaceC6090eb0 {
    private static final C3507La0 DEFAULT_INSTANCE;
    private static volatile InterfaceC3892Oy1<C3507La0> PARSER;

    /* renamed from: o.La0$a */
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

    /* renamed from: o.La0$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C3507La0, b> implements InterfaceC6090eb0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C3507La0.DEFAULT_INSTANCE);
        }
    }

    static {
        C3507La0 c3507La0 = new C3507La0();
        DEFAULT_INSTANCE = c3507La0;
        IC0.w2(C3507La0.class, c3507La0);
    }

    public static b A2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b B2(C3507La0 c3507La0) {
        return DEFAULT_INSTANCE.w1(c3507La0);
    }

    public static C3507La0 C2(InputStream inputStream) throws IOException {
        return (C3507La0) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C3507La0 D2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C3507La0) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C3507La0 E2(InputStream inputStream) throws IOException {
        return (C3507La0) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C3507La0 F2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C3507La0) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C3507La0 G2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C3507La0) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C3507La0 H2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C3507La0) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C3507La0 I2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C3507La0) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C3507La0 J2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C3507La0) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C3507La0 K2(KE ke) throws IOException {
        return (C3507La0) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C3507La0 L2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C3507La0) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C3507La0 M2(byte[] bArr) throws C9258rT0 {
        return (C3507La0) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C3507La0 N2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C3507La0) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C3507La0> O2() {
        return DEFAULT_INSTANCE.k1();
    }

    public static C3507La0 z2() {
        return DEFAULT_INSTANCE;
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C3507La0();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C3507La0> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C3507La0.class) {
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
}
