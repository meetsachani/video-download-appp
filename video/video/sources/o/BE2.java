package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.C4016Qf2;
import o.C7178j11;
import o.IC0;

/* loaded from: classes.dex */
public final class BE2 extends IC0<BE2, b> implements FE2 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final BE2 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC3892Oy1<BE2> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

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
    public static final class b extends IC0.b<BE2, b> implements FE2 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.FE2
        public boolean J0() {
            return ((BE2) this.Y).J0();
        }

        @Override // o.FE2
        public double N0() {
            return ((BE2) this.Y).N0();
        }

        @Override // o.FE2
        public String R0() {
            return ((BE2) this.Y).R0();
        }

        @Override // o.FE2
        public int T0() {
            return ((BE2) this.Y).T0();
        }

        @Override // o.FE2
        public EnumC10082us1 V0() {
            return ((BE2) this.Y).V0();
        }

        public b Y1() {
            P1();
            ((BE2) this.Y).S2();
            return this;
        }

        public b Z1() {
            P1();
            ((BE2) this.Y).T2();
            return this;
        }

        public b a2() {
            P1();
            ((BE2) this.Y).U2();
            return this;
        }

        public b b2() {
            P1();
            ((BE2) this.Y).V2();
            return this;
        }

        @Override // o.FE2
        public boolean c0() {
            return ((BE2) this.Y).c0();
        }

        public b c2() {
            P1();
            ((BE2) this.Y).W2();
            return this;
        }

        public b d2() {
            P1();
            ((BE2) this.Y).X2();
            return this;
        }

        public b e2() {
            P1();
            ((BE2) this.Y).Y2();
            return this;
        }

        @Override // o.FE2
        public boolean f1() {
            return ((BE2) this.Y).f1();
        }

        public b f2(C7178j11 c7178j11) {
            P1();
            ((BE2) this.Y).a3(c7178j11);
            return this;
        }

        public b g2(C4016Qf2 c4016Qf2) {
            P1();
            ((BE2) this.Y).b3(c4016Qf2);
            return this;
        }

        public b h2(boolean z) {
            P1();
            ((BE2) this.Y).t3(z);
            return this;
        }

        @Override // o.FE2
        public C7178j11 j0() {
            return ((BE2) this.Y).j0();
        }

        public b j2(C7178j11.b bVar) {
            P1();
            ((BE2) this.Y).u3(bVar);
            return this;
        }

        public b k2(C7178j11 c7178j11) {
            P1();
            ((BE2) this.Y).v3(c7178j11);
            return this;
        }

        @Override // o.FE2
        public AbstractC8616os l0() {
            return ((BE2) this.Y).l0();
        }

        public b m2(EnumC10082us1 enumC10082us1) {
            P1();
            ((BE2) this.Y).w3(enumC10082us1);
            return this;
        }

        public b n2(int i) {
            P1();
            ((BE2) this.Y).x3(i);
            return this;
        }

        @Override // o.FE2
        public C4016Qf2 o0() {
            return ((BE2) this.Y).o0();
        }

        public b o2(double d) {
            P1();
            ((BE2) this.Y).z3(d);
            return this;
        }

        @Override // o.FE2
        public c p0() {
            return ((BE2) this.Y).p0();
        }

        public b p2(String str) {
            P1();
            ((BE2) this.Y).A3(str);
            return this;
        }

        public b q2(AbstractC8616os abstractC8616os) {
            P1();
            ((BE2) this.Y).C3(abstractC8616os);
            return this;
        }

        public b r2(C4016Qf2.b bVar) {
            P1();
            ((BE2) this.Y).E3(bVar);
            return this;
        }

        public b s2(C4016Qf2 c4016Qf2) {
            P1();
            ((BE2) this.Y).H3(c4016Qf2);
            return this;
        }

        public b() {
            super(BE2.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);
        
        public final int X;

        c(int i) {
            this.X = i;
        }

        public static c e(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Deprecated
        public static c g(int i) {
            return e(i);
        }

        public int k() {
            return this.X;
        }
    }

    static {
        BE2 be2 = new BE2();
        DEFAULT_INSTANCE = be2;
        IC0.w2(BE2.class, be2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    public static BE2 Z2() {
        return DEFAULT_INSTANCE;
    }

    public static b c3() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b e3(BE2 be2) {
        return DEFAULT_INSTANCE.w1(be2);
    }

    public static BE2 f3(InputStream inputStream) throws IOException {
        return (BE2) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static BE2 g3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (BE2) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static BE2 h3(InputStream inputStream) throws IOException {
        return (BE2) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static BE2 i3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (BE2) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static BE2 j3(ByteBuffer byteBuffer) throws C9258rT0 {
        return (BE2) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BE2 k3(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (BE2) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static BE2 l3(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (BE2) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static BE2 m3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (BE2) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static BE2 n3(KE ke) throws IOException {
        return (BE2) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static BE2 o3(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (BE2) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static BE2 p3(byte[] bArr) throws C9258rT0 {
        return (BE2) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static BE2 r3(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (BE2) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<BE2> s3() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new BE2();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", C4016Qf2.class, C7178j11.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<BE2> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (BE2.class) {
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

    public final void A3(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    public final void C3(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.kindCase_ = 3;
        this.kind_ = abstractC8616os.B0();
    }

    public final void E3(C4016Qf2.b bVar) {
        this.kind_ = bVar.build();
        this.kindCase_ = 5;
    }

    public final void H3(C4016Qf2 c4016Qf2) {
        c4016Qf2.getClass();
        this.kind_ = c4016Qf2;
        this.kindCase_ = 5;
    }

    @Override // o.FE2
    public boolean J0() {
        if (this.kindCase_ == 6) {
            return true;
        }
        return false;
    }

    @Override // o.FE2
    public double N0() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // o.FE2
    public String R0() {
        if (this.kindCase_ == 3) {
            return (String) this.kind_;
        }
        return "";
    }

    public final void S2() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // o.FE2
    public int T0() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public final void U2() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // o.FE2
    public EnumC10082us1 V0() {
        if (this.kindCase_ == 1) {
            EnumC10082us1 e = EnumC10082us1.e(((Integer) this.kind_).intValue());
            if (e == null) {
                return EnumC10082us1.UNRECOGNIZED;
            }
            return e;
        }
        return EnumC10082us1.NULL_VALUE;
    }

    public final void V2() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void W2() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void X2() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void Y2() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void a3(C7178j11 c7178j11) {
        c7178j11.getClass();
        if (this.kindCase_ == 6 && this.kind_ != C7178j11.P2()) {
            this.kind_ = C7178j11.T2((C7178j11) this.kind_).U1(c7178j11).i2();
        } else {
            this.kind_ = c7178j11;
        }
        this.kindCase_ = 6;
    }

    public final void b3(C4016Qf2 c4016Qf2) {
        c4016Qf2.getClass();
        if (this.kindCase_ == 5 && this.kind_ != C4016Qf2.A2()) {
            this.kind_ = C4016Qf2.F2((C4016Qf2) this.kind_).U1(c4016Qf2).i2();
        } else {
            this.kind_ = c4016Qf2;
        }
        this.kindCase_ = 5;
    }

    @Override // o.FE2
    public boolean c0() {
        if (this.kindCase_ == 5) {
            return true;
        }
        return false;
    }

    @Override // o.FE2
    public boolean f1() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // o.FE2
    public C7178j11 j0() {
        if (this.kindCase_ == 6) {
            return (C7178j11) this.kind_;
        }
        return C7178j11.P2();
    }

    @Override // o.FE2
    public AbstractC8616os l0() {
        String str;
        if (this.kindCase_ == 3) {
            str = (String) this.kind_;
        } else {
            str = "";
        }
        return AbstractC8616os.H(str);
    }

    @Override // o.FE2
    public C4016Qf2 o0() {
        if (this.kindCase_ == 5) {
            return (C4016Qf2) this.kind_;
        }
        return C4016Qf2.A2();
    }

    @Override // o.FE2
    public c p0() {
        return c.e(this.kindCase_);
    }

    public final void t3(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    public final void u3(C7178j11.b bVar) {
        this.kind_ = bVar.build();
        this.kindCase_ = 6;
    }

    public final void v3(C7178j11 c7178j11) {
        c7178j11.getClass();
        this.kind_ = c7178j11;
        this.kindCase_ = 6;
    }

    public final void w3(EnumC10082us1 enumC10082us1) {
        enumC10082us1.getClass();
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(enumC10082us1.k());
    }

    public final void x3(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    public final void z3(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }
}
