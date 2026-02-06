package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.IC0;

/* loaded from: classes.dex */
public final class X70 extends IC0<X70, b> implements InterfaceC6478g80 {
    private static final X70 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC3892Oy1<X70> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

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

    /* loaded from: classes.dex */
    public static final class b extends IC0.b<X70, b> implements InterfaceC6478g80 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b Y1() {
            P1();
            ((X70) this.Y).D2();
            return this;
        }

        public b Z1() {
            P1();
            ((X70) this.Y).E2();
            return this;
        }

        public b a2(int i) {
            P1();
            ((X70) this.Y).V2(i);
            return this;
        }

        public b b2(long j) {
            P1();
            ((X70) this.Y).W2(j);
            return this;
        }

        @Override // o.InterfaceC6478g80
        public int j() {
            return ((X70) this.Y).j();
        }

        @Override // o.InterfaceC6478g80
        public long q() {
            return ((X70) this.Y).q();
        }

        public b() {
            super(X70.DEFAULT_INSTANCE);
        }
    }

    static {
        X70 x70 = new X70();
        DEFAULT_INSTANCE = x70;
        IC0.w2(X70.class, x70);
    }

    public static X70 F2() {
        return DEFAULT_INSTANCE;
    }

    public static b G2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b H2(X70 x70) {
        return DEFAULT_INSTANCE.w1(x70);
    }

    public static X70 I2(InputStream inputStream) throws IOException {
        return (X70) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static X70 J2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (X70) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static X70 K2(InputStream inputStream) throws IOException {
        return (X70) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static X70 L2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (X70) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static X70 M2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (X70) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static X70 N2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (X70) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static X70 O2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (X70) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static X70 P2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (X70) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static X70 Q2(KE ke) throws IOException {
        return (X70) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static X70 R2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (X70) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static X70 S2(byte[] bArr) throws C9258rT0 {
        return (X70) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static X70 T2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (X70) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<X70> U2() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new X70();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<X70> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (X70.class) {
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

    public final void D2() {
        this.nanos_ = 0;
    }

    public final void E2() {
        this.seconds_ = 0L;
    }

    public final void V2(int i) {
        this.nanos_ = i;
    }

    public final void W2(long j) {
        this.seconds_ = j;
    }

    @Override // o.InterfaceC6478g80
    public int j() {
        return this.nanos_;
    }

    @Override // o.InterfaceC6478g80
    public long q() {
        return this.seconds_;
    }
}
