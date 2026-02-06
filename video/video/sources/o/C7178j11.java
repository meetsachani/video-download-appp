package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.BE2;
import o.C9740tS0;
import o.IC0;

/* renamed from: o.j11  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7178j11 extends IC0<C7178j11, b> implements InterfaceC7421k11 {
    private static final C7178j11 DEFAULT_INSTANCE;
    private static volatile InterfaceC3892Oy1<C7178j11> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private C9740tS0.k<BE2> values_ = IC0.G1();

    /* renamed from: o.j11$a */
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

    /* renamed from: o.j11$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C7178j11, b> implements InterfaceC7421k11 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.InterfaceC7421k11
        public List<BE2> Y0() {
            return Collections.unmodifiableList(((C7178j11) this.Y).Y0());
        }

        public b Y1(Iterable<? extends BE2> iterable) {
            P1();
            ((C7178j11) this.Y).I2(iterable);
            return this;
        }

        public b Z1(int i, BE2.b bVar) {
            P1();
            ((C7178j11) this.Y).J2(i, bVar);
            return this;
        }

        public b a2(int i, BE2 be2) {
            P1();
            ((C7178j11) this.Y).K2(i, be2);
            return this;
        }

        public b b2(BE2.b bVar) {
            P1();
            ((C7178j11) this.Y).L2(bVar);
            return this;
        }

        public b c2(BE2 be2) {
            P1();
            ((C7178j11) this.Y).M2(be2);
            return this;
        }

        public b d2() {
            P1();
            ((C7178j11) this.Y).N2();
            return this;
        }

        public b e2(int i) {
            P1();
            ((C7178j11) this.Y).i3(i);
            return this;
        }

        public b f2(int i, BE2.b bVar) {
            P1();
            ((C7178j11) this.Y).j3(i, bVar);
            return this;
        }

        public b g2(int i, BE2 be2) {
            P1();
            ((C7178j11) this.Y).k3(i, be2);
            return this;
        }

        @Override // o.InterfaceC7421k11
        public BE2 h1(int i) {
            return ((C7178j11) this.Y).h1(i);
        }

        @Override // o.InterfaceC7421k11
        public int m0() {
            return ((C7178j11) this.Y).m0();
        }

        public b() {
            super(C7178j11.DEFAULT_INSTANCE);
        }
    }

    static {
        C7178j11 c7178j11 = new C7178j11();
        DEFAULT_INSTANCE = c7178j11;
        IC0.w2(C7178j11.class, c7178j11);
    }

    public static C7178j11 P2() {
        return DEFAULT_INSTANCE;
    }

    public static b S2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b T2(C7178j11 c7178j11) {
        return DEFAULT_INSTANCE.w1(c7178j11);
    }

    public static C7178j11 U2(InputStream inputStream) throws IOException {
        return (C7178j11) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C7178j11 V2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C7178j11) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C7178j11 W2(InputStream inputStream) throws IOException {
        return (C7178j11) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C7178j11 X2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C7178j11) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C7178j11 Y2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C7178j11) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C7178j11 Z2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C7178j11) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C7178j11 a3(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C7178j11) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C7178j11 b3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C7178j11) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C7178j11 c3(KE ke) throws IOException {
        return (C7178j11) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C7178j11 e3(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C7178j11) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C7178j11 f3(byte[] bArr) throws C9258rT0 {
        return (C7178j11) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C7178j11 g3(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C7178j11) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C7178j11> h3() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C7178j11();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", BE2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C7178j11> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C7178j11.class) {
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

    public final void I2(Iterable<? extends BE2> iterable) {
        O2();
        AbstractC5713d2.a0(iterable, this.values_);
    }

    public final void J2(int i, BE2.b bVar) {
        O2();
        this.values_.add(i, bVar.build());
    }

    public final void K2(int i, BE2 be2) {
        be2.getClass();
        O2();
        this.values_.add(i, be2);
    }

    public final void L2(BE2.b bVar) {
        O2();
        this.values_.add(bVar.build());
    }

    public final void M2(BE2 be2) {
        be2.getClass();
        O2();
        this.values_.add(be2);
    }

    public final void N2() {
        this.values_ = IC0.G1();
    }

    public final void O2() {
        if (!this.values_.X2()) {
            this.values_ = IC0.W1(this.values_);
        }
    }

    public FE2 Q2(int i) {
        return this.values_.get(i);
    }

    public List<? extends FE2> R2() {
        return this.values_;
    }

    @Override // o.InterfaceC7421k11
    public List<BE2> Y0() {
        return this.values_;
    }

    @Override // o.InterfaceC7421k11
    public BE2 h1(int i) {
        return this.values_.get(i);
    }

    public final void i3(int i) {
        O2();
        this.values_.remove(i);
    }

    public final void j3(int i, BE2.b bVar) {
        O2();
        this.values_.set(i, bVar.build());
    }

    public final void k3(int i, BE2 be2) {
        be2.getClass();
        O2();
        this.values_.set(i, be2);
    }

    @Override // o.InterfaceC7421k11
    public int m0() {
        return this.values_.size();
    }
}
