package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.C4174Rv1;
import o.C4203Sd0;
import o.C7556ka2;
import o.C9740tS0;
import o.IC0;

/* renamed from: o.Ed0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2822Ed0 extends IC0<C2822Ed0, b> implements InterfaceC3812Od0 {
    private static final C2822Ed0 DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC3892Oy1<C2822Ed0> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private C7556ka2 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private C9740tS0.k<C4203Sd0> enumvalue_ = IC0.G1();
    private C9740tS0.k<C4174Rv1> options_ = IC0.G1();

    /* renamed from: o.Ed0$a */
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

    /* renamed from: o.Ed0$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C2822Ed0, b> implements InterfaceC3812Od0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(EnumC6128ek2 enumC6128ek2) {
            P1();
            ((C2822Ed0) this.Y).g4(enumC6128ek2);
            return this;
        }

        public b B2(int i) {
            P1();
            ((C2822Ed0) this.Y).i4(i);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public C4203Sd0 I(int i) {
            return ((C2822Ed0) this.Y).I(i);
        }

        @Override // o.InterfaceC3812Od0
        public List<C4203Sd0> M() {
            return Collections.unmodifiableList(((C2822Ed0) this.Y).M());
        }

        @Override // o.InterfaceC3812Od0
        public int W0() {
            return ((C2822Ed0) this.Y).W0();
        }

        public b Y1(Iterable<? extends C4203Sd0> iterable) {
            P1();
            ((C2822Ed0) this.Y).b3(iterable);
            return this;
        }

        public b Z1(Iterable<? extends C4174Rv1> iterable) {
            P1();
            ((C2822Ed0) this.Y).c3(iterable);
            return this;
        }

        public b a2(int i, C4203Sd0.b bVar) {
            P1();
            ((C2822Ed0) this.Y).e3(i, bVar);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public AbstractC8616os b() {
            return ((C2822Ed0) this.Y).b();
        }

        public b b2(int i, C4203Sd0 c4203Sd0) {
            P1();
            ((C2822Ed0) this.Y).f3(i, c4203Sd0);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public List<C4174Rv1> c() {
            return Collections.unmodifiableList(((C2822Ed0) this.Y).c());
        }

        public b c2(C4203Sd0.b bVar) {
            P1();
            ((C2822Ed0) this.Y).g3(bVar);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public int d() {
            return ((C2822Ed0) this.Y).d();
        }

        public b d2(C4203Sd0 c4203Sd0) {
            P1();
            ((C2822Ed0) this.Y).h3(c4203Sd0);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public C4174Rv1 e(int i) {
            return ((C2822Ed0) this.Y).e(i);
        }

        public b e2(int i, C4174Rv1.b bVar) {
            P1();
            ((C2822Ed0) this.Y).i3(i, bVar);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public EnumC6128ek2 f() {
            return ((C2822Ed0) this.Y).f();
        }

        public b f2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C2822Ed0) this.Y).j3(i, c4174Rv1);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public int g() {
            return ((C2822Ed0) this.Y).g();
        }

        public b g2(C4174Rv1.b bVar) {
            P1();
            ((C2822Ed0) this.Y).k3(bVar);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public String getName() {
            return ((C2822Ed0) this.Y).getName();
        }

        @Override // o.InterfaceC3812Od0
        public boolean h() {
            return ((C2822Ed0) this.Y).h();
        }

        public b h2(C4174Rv1 c4174Rv1) {
            P1();
            ((C2822Ed0) this.Y).l3(c4174Rv1);
            return this;
        }

        @Override // o.InterfaceC3812Od0
        public C7556ka2 i() {
            return ((C2822Ed0) this.Y).i();
        }

        public b j2() {
            P1();
            ((C2822Ed0) this.Y).m3();
            return this;
        }

        public b k2() {
            P1();
            ((C2822Ed0) this.Y).n3();
            return this;
        }

        public b m2() {
            P1();
            ((C2822Ed0) this.Y).o3();
            return this;
        }

        public b n2() {
            P1();
            ((C2822Ed0) this.Y).p3();
            return this;
        }

        public b o2() {
            P1();
            ((C2822Ed0) this.Y).r3();
            return this;
        }

        public b p2(C7556ka2 c7556ka2) {
            P1();
            ((C2822Ed0) this.Y).A3(c7556ka2);
            return this;
        }

        public b q2(int i) {
            P1();
            ((C2822Ed0) this.Y).W3(i);
            return this;
        }

        public b r2(int i) {
            P1();
            ((C2822Ed0) this.Y).X3(i);
            return this;
        }

        public b s2(int i, C4203Sd0.b bVar) {
            P1();
            ((C2822Ed0) this.Y).Y3(i, bVar);
            return this;
        }

        public b t2(int i, C4203Sd0 c4203Sd0) {
            P1();
            ((C2822Ed0) this.Y).Z3(i, c4203Sd0);
            return this;
        }

        public b u2(String str) {
            P1();
            ((C2822Ed0) this.Y).a4(str);
            return this;
        }

        public b v2(AbstractC8616os abstractC8616os) {
            P1();
            ((C2822Ed0) this.Y).b4(abstractC8616os);
            return this;
        }

        public b w2(int i, C4174Rv1.b bVar) {
            P1();
            ((C2822Ed0) this.Y).c4(i, bVar);
            return this;
        }

        public b x2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C2822Ed0) this.Y).d4(i, c4174Rv1);
            return this;
        }

        public b y2(C7556ka2.b bVar) {
            P1();
            ((C2822Ed0) this.Y).e4(bVar);
            return this;
        }

        public b z2(C7556ka2 c7556ka2) {
            P1();
            ((C2822Ed0) this.Y).f4(c7556ka2);
            return this;
        }

        public b() {
            super(C2822Ed0.DEFAULT_INSTANCE);
        }
    }

    static {
        C2822Ed0 c2822Ed0 = new C2822Ed0();
        DEFAULT_INSTANCE = c2822Ed0;
        IC0.w2(C2822Ed0.class, c2822Ed0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(C7556ka2 c7556ka2) {
        c7556ka2.getClass();
        C7556ka2 c7556ka22 = this.sourceContext_;
        if (c7556ka22 != null && c7556ka22 != C7556ka2.D2()) {
            this.sourceContext_ = C7556ka2.F2(this.sourceContext_).U1(c7556ka2).i2();
        } else {
            this.sourceContext_ = c7556ka2;
        }
    }

    public static b C3() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b E3(C2822Ed0 c2822Ed0) {
        return DEFAULT_INSTANCE.w1(c2822Ed0);
    }

    public static C2822Ed0 H3(InputStream inputStream) throws IOException {
        return (C2822Ed0) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C2822Ed0 I3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C2822Ed0) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C2822Ed0 J3(InputStream inputStream) throws IOException {
        return (C2822Ed0) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C2822Ed0 K3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C2822Ed0) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C2822Ed0 L3(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C2822Ed0) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C2822Ed0 M3(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C2822Ed0) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C2822Ed0 N3(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C2822Ed0) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C2822Ed0 O3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C2822Ed0) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C2822Ed0 P3(KE ke) throws IOException {
        return (C2822Ed0) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C2822Ed0 R3(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C2822Ed0) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C2822Ed0 S3(byte[] bArr) throws C9258rT0 {
        return (C2822Ed0) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C2822Ed0 T3(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C2822Ed0) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C2822Ed0> U3() {
        return DEFAULT_INSTANCE.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(int i) {
        t3();
        this.options_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.name_ = abstractC8616os.B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(Iterable<? extends C4174Rv1> iterable) {
        t3();
        AbstractC5713d2.a0(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(int i, C4174Rv1.b bVar) {
        t3();
        this.options_.set(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        t3();
        this.options_.set(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(C7556ka2.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(C7556ka2 c7556ka2) {
        c7556ka2.getClass();
        this.sourceContext_ = c7556ka2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(EnumC6128ek2 enumC6128ek2) {
        enumC6128ek2.getClass();
        this.syntax_ = enumC6128ek2.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(int i, C4174Rv1.b bVar) {
        t3();
        this.options_.add(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(int i) {
        this.syntax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        t3();
        this.options_.add(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(C4174Rv1.b bVar) {
        t3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        t3();
        this.options_.add(c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        this.name_ = u3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        this.options_ = IC0.G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3() {
        this.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.syntax_ = 0;
    }

    private void t3() {
        if (!this.options_.X2()) {
            this.options_ = IC0.W1(this.options_);
        }
    }

    public static C2822Ed0 u3() {
        return DEFAULT_INSTANCE;
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C2822Ed0();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", C4203Sd0.class, "options_", C4174Rv1.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C2822Ed0> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C2822Ed0.class) {
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

    @Override // o.InterfaceC3812Od0
    public C4203Sd0 I(int i) {
        return this.enumvalue_.get(i);
    }

    @Override // o.InterfaceC3812Od0
    public List<C4203Sd0> M() {
        return this.enumvalue_;
    }

    @Override // o.InterfaceC3812Od0
    public int W0() {
        return this.enumvalue_.size();
    }

    public final void W3(int i) {
        s3();
        this.enumvalue_.remove(i);
    }

    public final void Y3(int i, C4203Sd0.b bVar) {
        s3();
        this.enumvalue_.set(i, bVar.build());
    }

    public final void Z3(int i, C4203Sd0 c4203Sd0) {
        c4203Sd0.getClass();
        s3();
        this.enumvalue_.set(i, c4203Sd0);
    }

    @Override // o.InterfaceC3812Od0
    public AbstractC8616os b() {
        return AbstractC8616os.H(this.name_);
    }

    public final void b3(Iterable<? extends C4203Sd0> iterable) {
        s3();
        AbstractC5713d2.a0(iterable, this.enumvalue_);
    }

    @Override // o.InterfaceC3812Od0
    public List<C4174Rv1> c() {
        return this.options_;
    }

    @Override // o.InterfaceC3812Od0
    public int d() {
        return this.options_.size();
    }

    @Override // o.InterfaceC3812Od0
    public C4174Rv1 e(int i) {
        return this.options_.get(i);
    }

    public final void e3(int i, C4203Sd0.b bVar) {
        s3();
        this.enumvalue_.add(i, bVar.build());
    }

    @Override // o.InterfaceC3812Od0
    public EnumC6128ek2 f() {
        EnumC6128ek2 e = EnumC6128ek2.e(this.syntax_);
        if (e == null) {
            return EnumC6128ek2.UNRECOGNIZED;
        }
        return e;
    }

    public final void f3(int i, C4203Sd0 c4203Sd0) {
        c4203Sd0.getClass();
        s3();
        this.enumvalue_.add(i, c4203Sd0);
    }

    @Override // o.InterfaceC3812Od0
    public int g() {
        return this.syntax_;
    }

    public final void g3(C4203Sd0.b bVar) {
        s3();
        this.enumvalue_.add(bVar.build());
    }

    @Override // o.InterfaceC3812Od0
    public String getName() {
        return this.name_;
    }

    @Override // o.InterfaceC3812Od0
    public boolean h() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public final void h3(C4203Sd0 c4203Sd0) {
        c4203Sd0.getClass();
        s3();
        this.enumvalue_.add(c4203Sd0);
    }

    @Override // o.InterfaceC3812Od0
    public C7556ka2 i() {
        C7556ka2 c7556ka2 = this.sourceContext_;
        if (c7556ka2 == null) {
            return C7556ka2.D2();
        }
        return c7556ka2;
    }

    public final void m3() {
        this.enumvalue_ = IC0.G1();
    }

    public final void s3() {
        if (!this.enumvalue_.X2()) {
            this.enumvalue_ = IC0.W1(this.enumvalue_);
        }
    }

    public InterfaceC4300Td0 v3(int i) {
        return this.enumvalue_.get(i);
    }

    public List<? extends InterfaceC4300Td0> w3() {
        return this.enumvalue_;
    }

    public InterfaceC4371Tv1 x3(int i) {
        return this.options_.get(i);
    }

    public List<? extends InterfaceC4371Tv1> z3() {
        return this.options_;
    }
}
