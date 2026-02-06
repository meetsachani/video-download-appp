package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.C9740tS0;
import o.IC0;

/* renamed from: o.ro0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9336ro0 extends IC0<C9336ro0, b> implements InterfaceC9579so0 {
    private static final C9336ro0 DEFAULT_INSTANCE;
    private static volatile InterfaceC3892Oy1<C9336ro0> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private C9740tS0.k<String> paths_ = IC0.G1();

    /* renamed from: o.ro0$a */
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

    /* renamed from: o.ro0$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C9336ro0, b> implements InterfaceC9579so0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.InterfaceC9579so0
        public List<String> H() {
            return Collections.unmodifiableList(((C9336ro0) this.Y).H());
        }

        @Override // o.InterfaceC9579so0
        public int K() {
            return ((C9336ro0) this.Y).K();
        }

        @Override // o.InterfaceC9579so0
        public AbstractC8616os P(int i) {
            return ((C9336ro0) this.Y).P(i);
        }

        public b Y1(Iterable<String> iterable) {
            P1();
            ((C9336ro0) this.Y).E2(iterable);
            return this;
        }

        public b Z1(String str) {
            P1();
            ((C9336ro0) this.Y).F2(str);
            return this;
        }

        public b a2(AbstractC8616os abstractC8616os) {
            P1();
            ((C9336ro0) this.Y).G2(abstractC8616os);
            return this;
        }

        public b b2() {
            P1();
            ((C9336ro0) this.Y).H2();
            return this;
        }

        public b c2(int i, String str) {
            P1();
            ((C9336ro0) this.Y).Z2(i, str);
            return this;
        }

        @Override // o.InterfaceC9579so0
        public String i1(int i) {
            return ((C9336ro0) this.Y).i1(i);
        }

        public b() {
            super(C9336ro0.DEFAULT_INSTANCE);
        }
    }

    static {
        C9336ro0 c9336ro0 = new C9336ro0();
        DEFAULT_INSTANCE = c9336ro0;
        IC0.w2(C9336ro0.class, c9336ro0);
    }

    public static C9336ro0 J2() {
        return DEFAULT_INSTANCE;
    }

    public static b K2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b L2(C9336ro0 c9336ro0) {
        return DEFAULT_INSTANCE.w1(c9336ro0);
    }

    public static C9336ro0 M2(InputStream inputStream) throws IOException {
        return (C9336ro0) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C9336ro0 N2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C9336ro0) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C9336ro0 O2(InputStream inputStream) throws IOException {
        return (C9336ro0) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C9336ro0 P2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C9336ro0) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C9336ro0 Q2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C9336ro0) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C9336ro0 R2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C9336ro0) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C9336ro0 S2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C9336ro0) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C9336ro0 T2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C9336ro0) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C9336ro0 U2(KE ke) throws IOException {
        return (C9336ro0) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C9336ro0 V2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C9336ro0) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C9336ro0 W2(byte[] bArr) throws C9258rT0 {
        return (C9336ro0) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C9336ro0 X2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C9336ro0) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C9336ro0> Y2() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C9336ro0();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C9336ro0> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C9336ro0.class) {
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

    public final void E2(Iterable<String> iterable) {
        I2();
        AbstractC5713d2.a0(iterable, this.paths_);
    }

    public final void F2(String str) {
        str.getClass();
        I2();
        this.paths_.add(str);
    }

    public final void G2(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        I2();
        this.paths_.add(abstractC8616os.B0());
    }

    @Override // o.InterfaceC9579so0
    public List<String> H() {
        return this.paths_;
    }

    public final void H2() {
        this.paths_ = IC0.G1();
    }

    public final void I2() {
        if (!this.paths_.X2()) {
            this.paths_ = IC0.W1(this.paths_);
        }
    }

    @Override // o.InterfaceC9579so0
    public int K() {
        return this.paths_.size();
    }

    @Override // o.InterfaceC9579so0
    public AbstractC8616os P(int i) {
        return AbstractC8616os.H(this.paths_.get(i));
    }

    public final void Z2(int i, String str) {
        str.getClass();
        I2();
        this.paths_.set(i, str);
    }

    @Override // o.InterfaceC9579so0
    public String i1(int i) {
        return this.paths_.get(i);
    }
}
