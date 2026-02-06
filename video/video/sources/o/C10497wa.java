package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.C10046uj1;
import o.C4174Rv1;
import o.C5400bk1;
import o.C7556ka2;
import o.C9740tS0;
import o.IC0;

/* renamed from: o.wa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10497wa extends IC0<C10497wa, b> implements InterfaceC2421Ab {
    private static final C10497wa DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC3892Oy1<C10497wa> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private C7556ka2 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private C9740tS0.k<C10046uj1> methods_ = IC0.G1();
    private C9740tS0.k<C4174Rv1> options_ = IC0.G1();
    private String version_ = "";
    private C9740tS0.k<C5400bk1> mixins_ = IC0.G1();

    /* renamed from: o.wa$a */
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

    /* renamed from: o.wa$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C10497wa, b> implements InterfaceC2421Ab {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(int i, C10046uj1.b bVar) {
            P1();
            ((C10497wa) this.Y).w4(i, bVar);
            return this;
        }

        public b B2(int i, C10046uj1 c10046uj1) {
            P1();
            ((C10497wa) this.Y).x4(i, c10046uj1);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public AbstractC8616os C0() {
            return ((C10497wa) this.Y).C0();
        }

        public b C2(int i, C5400bk1.b bVar) {
            P1();
            ((C10497wa) this.Y).y4(i, bVar);
            return this;
        }

        public b D2(int i, C5400bk1 c5400bk1) {
            P1();
            ((C10497wa) this.Y).z4(i, c5400bk1);
            return this;
        }

        public b E2(String str) {
            P1();
            ((C10497wa) this.Y).A4(str);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public int F0() {
            return ((C10497wa) this.Y).F0();
        }

        public b F2(AbstractC8616os abstractC8616os) {
            P1();
            ((C10497wa) this.Y).B4(abstractC8616os);
            return this;
        }

        public b G2(int i, C4174Rv1.b bVar) {
            P1();
            ((C10497wa) this.Y).C4(i, bVar);
            return this;
        }

        public b H2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C10497wa) this.Y).D4(i, c4174Rv1);
            return this;
        }

        public b I2(C7556ka2.b bVar) {
            P1();
            ((C10497wa) this.Y).E4(bVar);
            return this;
        }

        public b J2(C7556ka2 c7556ka2) {
            P1();
            ((C10497wa) this.Y).F4(c7556ka2);
            return this;
        }

        public b K2(EnumC6128ek2 enumC6128ek2) {
            P1();
            ((C10497wa) this.Y).G4(enumC6128ek2);
            return this;
        }

        public b L2(int i) {
            P1();
            ((C10497wa) this.Y).H4(i);
            return this;
        }

        public b M2(String str) {
            P1();
            ((C10497wa) this.Y).I4(str);
            return this;
        }

        public b N2(AbstractC8616os abstractC8616os) {
            P1();
            ((C10497wa) this.Y).J4(abstractC8616os);
            return this;
        }

        public b Y1(Iterable<? extends C10046uj1> iterable) {
            P1();
            ((C10497wa) this.Y).o3(iterable);
            return this;
        }

        public b Z1(Iterable<? extends C5400bk1> iterable) {
            P1();
            ((C10497wa) this.Y).p3(iterable);
            return this;
        }

        public b a2(Iterable<? extends C4174Rv1> iterable) {
            P1();
            ((C10497wa) this.Y).r3(iterable);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public AbstractC8616os b() {
            return ((C10497wa) this.Y).b();
        }

        public b b2(int i, C10046uj1.b bVar) {
            P1();
            ((C10497wa) this.Y).s3(i, bVar);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public List<C4174Rv1> c() {
            return Collections.unmodifiableList(((C10497wa) this.Y).c());
        }

        public b c2(int i, C10046uj1 c10046uj1) {
            P1();
            ((C10497wa) this.Y).t3(i, c10046uj1);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public int d() {
            return ((C10497wa) this.Y).d();
        }

        @Override // o.InterfaceC2421Ab
        public String d0() {
            return ((C10497wa) this.Y).d0();
        }

        public b d2(C10046uj1.b bVar) {
            P1();
            ((C10497wa) this.Y).u3(bVar);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public C4174Rv1 e(int i) {
            return ((C10497wa) this.Y).e(i);
        }

        public b e2(C10046uj1 c10046uj1) {
            P1();
            ((C10497wa) this.Y).v3(c10046uj1);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public EnumC6128ek2 f() {
            return ((C10497wa) this.Y).f();
        }

        @Override // o.InterfaceC2421Ab
        public List<C5400bk1> f0() {
            return Collections.unmodifiableList(((C10497wa) this.Y).f0());
        }

        public b f2(int i, C5400bk1.b bVar) {
            P1();
            ((C10497wa) this.Y).w3(i, bVar);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public int g() {
            return ((C10497wa) this.Y).g();
        }

        @Override // o.InterfaceC2421Ab
        public C10046uj1 g0(int i) {
            return ((C10497wa) this.Y).g0(i);
        }

        public b g2(int i, C5400bk1 c5400bk1) {
            P1();
            ((C10497wa) this.Y).x3(i, c5400bk1);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public String getName() {
            return ((C10497wa) this.Y).getName();
        }

        @Override // o.InterfaceC2421Ab
        public boolean h() {
            return ((C10497wa) this.Y).h();
        }

        @Override // o.InterfaceC2421Ab
        public List<C10046uj1> h0() {
            return Collections.unmodifiableList(((C10497wa) this.Y).h0());
        }

        public b h2(C5400bk1.b bVar) {
            P1();
            ((C10497wa) this.Y).z3(bVar);
            return this;
        }

        @Override // o.InterfaceC2421Ab
        public C7556ka2 i() {
            return ((C10497wa) this.Y).i();
        }

        @Override // o.InterfaceC2421Ab
        public int i0() {
            return ((C10497wa) this.Y).i0();
        }

        @Override // o.InterfaceC2421Ab
        public C5400bk1 j1(int i) {
            return ((C10497wa) this.Y).j1(i);
        }

        public b j2(C5400bk1 c5400bk1) {
            P1();
            ((C10497wa) this.Y).A3(c5400bk1);
            return this;
        }

        public b k2(int i, C4174Rv1.b bVar) {
            P1();
            ((C10497wa) this.Y).C3(i, bVar);
            return this;
        }

        public b m2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C10497wa) this.Y).E3(i, c4174Rv1);
            return this;
        }

        public b n2(C4174Rv1.b bVar) {
            P1();
            ((C10497wa) this.Y).H3(bVar);
            return this;
        }

        public b o2(C4174Rv1 c4174Rv1) {
            P1();
            ((C10497wa) this.Y).I3(c4174Rv1);
            return this;
        }

        public b p2() {
            P1();
            ((C10497wa) this.Y).J3();
            return this;
        }

        public b q2() {
            P1();
            ((C10497wa) this.Y).K3();
            return this;
        }

        public b r2() {
            P1();
            ((C10497wa) this.Y).L3();
            return this;
        }

        public b s2() {
            P1();
            ((C10497wa) this.Y).M3();
            return this;
        }

        public b t2() {
            P1();
            ((C10497wa) this.Y).N3();
            return this;
        }

        public b u2() {
            P1();
            ((C10497wa) this.Y).O3();
            return this;
        }

        public b v2() {
            P1();
            ((C10497wa) this.Y).P3();
            return this;
        }

        public b w2(C7556ka2 c7556ka2) {
            P1();
            ((C10497wa) this.Y).c4(c7556ka2);
            return this;
        }

        public b x2(int i) {
            P1();
            ((C10497wa) this.Y).t4(i);
            return this;
        }

        public b y2(int i) {
            P1();
            ((C10497wa) this.Y).u4(i);
            return this;
        }

        public b z2(int i) {
            P1();
            ((C10497wa) this.Y).v4(i);
            return this;
        }

        public b() {
            super(C10497wa.DEFAULT_INSTANCE);
        }
    }

    static {
        C10497wa c10497wa = new C10497wa();
        DEFAULT_INSTANCE = c10497wa;
        IC0.w2(C10497wa.class, c10497wa);
    }

    public static C10497wa U3() {
        return DEFAULT_INSTANCE;
    }

    public static b d4() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b e4(C10497wa c10497wa) {
        return DEFAULT_INSTANCE.w1(c10497wa);
    }

    public static C10497wa f4(InputStream inputStream) throws IOException {
        return (C10497wa) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C10497wa g4(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C10497wa) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C10497wa i4(InputStream inputStream) throws IOException {
        return (C10497wa) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C10497wa j4(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C10497wa) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C10497wa k4(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C10497wa) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C10497wa l4(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C10497wa) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C10497wa m4(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C10497wa) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C10497wa n4(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C10497wa) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C10497wa o4(KE ke) throws IOException {
        return (C10497wa) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C10497wa p4(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C10497wa) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C10497wa q4(byte[] bArr) throws C9258rT0 {
        return (C10497wa) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C10497wa r4(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C10497wa) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C10497wa> s4() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C10497wa();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", C10046uj1.class, "options_", C4174Rv1.class, "version_", "sourceContext_", "mixins_", C5400bk1.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C10497wa> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C10497wa.class) {
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

    public final void A3(C5400bk1 c5400bk1) {
        c5400bk1.getClass();
        S3();
        this.mixins_.add(c5400bk1);
    }

    public final void A4(String str) {
        str.getClass();
        this.name_ = str;
    }

    public final void B4(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.name_ = abstractC8616os.B0();
    }

    @Override // o.InterfaceC2421Ab
    public AbstractC8616os C0() {
        return AbstractC8616os.H(this.version_);
    }

    public final void C3(int i, C4174Rv1.b bVar) {
        T3();
        this.options_.add(i, bVar.build());
    }

    public final void C4(int i, C4174Rv1.b bVar) {
        T3();
        this.options_.set(i, bVar.build());
    }

    public final void D4(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        T3();
        this.options_.set(i, c4174Rv1);
    }

    public final void E3(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        T3();
        this.options_.add(i, c4174Rv1);
    }

    public final void E4(C7556ka2.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    @Override // o.InterfaceC2421Ab
    public int F0() {
        return this.methods_.size();
    }

    public final void F4(C7556ka2 c7556ka2) {
        c7556ka2.getClass();
        this.sourceContext_ = c7556ka2;
    }

    public final void G4(EnumC6128ek2 enumC6128ek2) {
        enumC6128ek2.getClass();
        this.syntax_ = enumC6128ek2.k();
    }

    public final void H3(C4174Rv1.b bVar) {
        T3();
        this.options_.add(bVar.build());
    }

    public final void H4(int i) {
        this.syntax_ = i;
    }

    public final void I3(C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        T3();
        this.options_.add(c4174Rv1);
    }

    public final void I4(String str) {
        str.getClass();
        this.version_ = str;
    }

    public final void J3() {
        this.methods_ = IC0.G1();
    }

    public final void J4(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.version_ = abstractC8616os.B0();
    }

    public final void K3() {
        this.mixins_ = IC0.G1();
    }

    public final void L3() {
        this.name_ = U3().getName();
    }

    public final void M3() {
        this.options_ = IC0.G1();
    }

    public final void N3() {
        this.sourceContext_ = null;
    }

    public final void O3() {
        this.syntax_ = 0;
    }

    public final void P3() {
        this.version_ = U3().d0();
    }

    public final void R3() {
        if (!this.methods_.X2()) {
            this.methods_ = IC0.W1(this.methods_);
        }
    }

    public final void S3() {
        if (!this.mixins_.X2()) {
            this.mixins_ = IC0.W1(this.mixins_);
        }
    }

    public final void T3() {
        if (!this.options_.X2()) {
            this.options_ = IC0.W1(this.options_);
        }
    }

    public InterfaceC10778xj1 W3(int i) {
        return this.methods_.get(i);
    }

    public List<? extends InterfaceC10778xj1> X3() {
        return this.methods_;
    }

    public InterfaceC5642ck1 Y3(int i) {
        return this.mixins_.get(i);
    }

    public List<? extends InterfaceC5642ck1> Z3() {
        return this.mixins_;
    }

    public InterfaceC4371Tv1 a4(int i) {
        return this.options_.get(i);
    }

    @Override // o.InterfaceC2421Ab
    public AbstractC8616os b() {
        return AbstractC8616os.H(this.name_);
    }

    public List<? extends InterfaceC4371Tv1> b4() {
        return this.options_;
    }

    @Override // o.InterfaceC2421Ab
    public List<C4174Rv1> c() {
        return this.options_;
    }

    public final void c4(C7556ka2 c7556ka2) {
        c7556ka2.getClass();
        C7556ka2 c7556ka22 = this.sourceContext_;
        if (c7556ka22 != null && c7556ka22 != C7556ka2.D2()) {
            this.sourceContext_ = C7556ka2.F2(this.sourceContext_).U1(c7556ka2).i2();
        } else {
            this.sourceContext_ = c7556ka2;
        }
    }

    @Override // o.InterfaceC2421Ab
    public int d() {
        return this.options_.size();
    }

    @Override // o.InterfaceC2421Ab
    public String d0() {
        return this.version_;
    }

    @Override // o.InterfaceC2421Ab
    public C4174Rv1 e(int i) {
        return this.options_.get(i);
    }

    @Override // o.InterfaceC2421Ab
    public EnumC6128ek2 f() {
        EnumC6128ek2 e = EnumC6128ek2.e(this.syntax_);
        if (e == null) {
            return EnumC6128ek2.UNRECOGNIZED;
        }
        return e;
    }

    @Override // o.InterfaceC2421Ab
    public List<C5400bk1> f0() {
        return this.mixins_;
    }

    @Override // o.InterfaceC2421Ab
    public int g() {
        return this.syntax_;
    }

    @Override // o.InterfaceC2421Ab
    public C10046uj1 g0(int i) {
        return this.methods_.get(i);
    }

    @Override // o.InterfaceC2421Ab
    public String getName() {
        return this.name_;
    }

    @Override // o.InterfaceC2421Ab
    public boolean h() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC2421Ab
    public List<C10046uj1> h0() {
        return this.methods_;
    }

    @Override // o.InterfaceC2421Ab
    public C7556ka2 i() {
        C7556ka2 c7556ka2 = this.sourceContext_;
        if (c7556ka2 == null) {
            return C7556ka2.D2();
        }
        return c7556ka2;
    }

    @Override // o.InterfaceC2421Ab
    public int i0() {
        return this.mixins_.size();
    }

    @Override // o.InterfaceC2421Ab
    public C5400bk1 j1(int i) {
        return this.mixins_.get(i);
    }

    public final void o3(Iterable<? extends C10046uj1> iterable) {
        R3();
        AbstractC5713d2.a0(iterable, this.methods_);
    }

    public final void p3(Iterable<? extends C5400bk1> iterable) {
        S3();
        AbstractC5713d2.a0(iterable, this.mixins_);
    }

    public final void r3(Iterable<? extends C4174Rv1> iterable) {
        T3();
        AbstractC5713d2.a0(iterable, this.options_);
    }

    public final void s3(int i, C10046uj1.b bVar) {
        R3();
        this.methods_.add(i, bVar.build());
    }

    public final void t3(int i, C10046uj1 c10046uj1) {
        c10046uj1.getClass();
        R3();
        this.methods_.add(i, c10046uj1);
    }

    public final void t4(int i) {
        R3();
        this.methods_.remove(i);
    }

    public final void u3(C10046uj1.b bVar) {
        R3();
        this.methods_.add(bVar.build());
    }

    public final void u4(int i) {
        S3();
        this.mixins_.remove(i);
    }

    public final void v3(C10046uj1 c10046uj1) {
        c10046uj1.getClass();
        R3();
        this.methods_.add(c10046uj1);
    }

    public final void v4(int i) {
        T3();
        this.options_.remove(i);
    }

    public final void w3(int i, C5400bk1.b bVar) {
        S3();
        this.mixins_.add(i, bVar.build());
    }

    public final void w4(int i, C10046uj1.b bVar) {
        R3();
        this.methods_.set(i, bVar.build());
    }

    public final void x3(int i, C5400bk1 c5400bk1) {
        c5400bk1.getClass();
        S3();
        this.mixins_.add(i, c5400bk1);
    }

    public final void x4(int i, C10046uj1 c10046uj1) {
        c10046uj1.getClass();
        R3();
        this.methods_.set(i, c10046uj1);
    }

    public final void y4(int i, C5400bk1.b bVar) {
        S3();
        this.mixins_.set(i, bVar.build());
    }

    public final void z3(C5400bk1.b bVar) {
        S3();
        this.mixins_.add(bVar.build());
    }

    public final void z4(int i, C5400bk1 c5400bk1) {
        c5400bk1.getClass();
        S3();
        this.mixins_.set(i, c5400bk1);
    }
}
