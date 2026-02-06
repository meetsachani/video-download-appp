package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.C3852On0;
import o.C4174Rv1;
import o.C7556ka2;
import o.C9740tS0;
import o.IC0;

/* renamed from: o.mv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8144mv2 extends IC0<C8144mv2, b> implements Dv2 {
    private static final C8144mv2 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile InterfaceC3892Oy1<C8144mv2> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private C7556ka2 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private C9740tS0.k<C3852On0> fields_ = IC0.G1();
    private C9740tS0.k<String> oneofs_ = IC0.G1();
    private C9740tS0.k<C4174Rv1> options_ = IC0.G1();

    /* renamed from: o.mv2$a */
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

    /* renamed from: o.mv2$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C8144mv2, b> implements Dv2 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.Dv2
        public C3852On0 A0(int i) {
            return ((C8144mv2) this.Y).A0(i);
        }

        public b A2(int i, String str) {
            P1();
            ((C8144mv2) this.Y).n4(i, str);
            return this;
        }

        public b B2(int i, C4174Rv1.b bVar) {
            P1();
            ((C8144mv2) this.Y).o4(i, bVar);
            return this;
        }

        public b C2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C8144mv2) this.Y).p4(i, c4174Rv1);
            return this;
        }

        public b D2(C7556ka2.b bVar) {
            P1();
            ((C8144mv2) this.Y).q4(bVar);
            return this;
        }

        @Override // o.Dv2
        public List<C3852On0> E() {
            return Collections.unmodifiableList(((C8144mv2) this.Y).E());
        }

        public b E2(C7556ka2 c7556ka2) {
            P1();
            ((C8144mv2) this.Y).r4(c7556ka2);
            return this;
        }

        public b F2(EnumC6128ek2 enumC6128ek2) {
            P1();
            ((C8144mv2) this.Y).s4(enumC6128ek2);
            return this;
        }

        public b G2(int i) {
            P1();
            ((C8144mv2) this.Y).t4(i);
            return this;
        }

        @Override // o.Dv2
        public String L0(int i) {
            return ((C8144mv2) this.Y).L0(i);
        }

        @Override // o.Dv2
        public AbstractC8616os R(int i) {
            return ((C8144mv2) this.Y).R(i);
        }

        @Override // o.Dv2
        public int X() {
            return ((C8144mv2) this.Y).X();
        }

        public b Y1(Iterable<? extends C3852On0> iterable) {
            P1();
            ((C8144mv2) this.Y).h3(iterable);
            return this;
        }

        public b Z1(Iterable<String> iterable) {
            P1();
            ((C8144mv2) this.Y).i3(iterable);
            return this;
        }

        public b a2(Iterable<? extends C4174Rv1> iterable) {
            P1();
            ((C8144mv2) this.Y).j3(iterable);
            return this;
        }

        @Override // o.Dv2
        public AbstractC8616os b() {
            return ((C8144mv2) this.Y).b();
        }

        public b b2(int i, C3852On0.b bVar) {
            P1();
            ((C8144mv2) this.Y).k3(i, bVar);
            return this;
        }

        @Override // o.Dv2
        public List<C4174Rv1> c() {
            return Collections.unmodifiableList(((C8144mv2) this.Y).c());
        }

        public b c2(int i, C3852On0 c3852On0) {
            P1();
            ((C8144mv2) this.Y).l3(i, c3852On0);
            return this;
        }

        @Override // o.Dv2
        public int d() {
            return ((C8144mv2) this.Y).d();
        }

        public b d2(C3852On0.b bVar) {
            P1();
            ((C8144mv2) this.Y).m3(bVar);
            return this;
        }

        @Override // o.Dv2
        public C4174Rv1 e(int i) {
            return ((C8144mv2) this.Y).e(i);
        }

        public b e2(C3852On0 c3852On0) {
            P1();
            ((C8144mv2) this.Y).n3(c3852On0);
            return this;
        }

        @Override // o.Dv2
        public EnumC6128ek2 f() {
            return ((C8144mv2) this.Y).f();
        }

        public b f2(String str) {
            P1();
            ((C8144mv2) this.Y).o3(str);
            return this;
        }

        @Override // o.Dv2
        public int g() {
            return ((C8144mv2) this.Y).g();
        }

        public b g2(AbstractC8616os abstractC8616os) {
            P1();
            ((C8144mv2) this.Y).p3(abstractC8616os);
            return this;
        }

        @Override // o.Dv2
        public String getName() {
            return ((C8144mv2) this.Y).getName();
        }

        @Override // o.Dv2
        public boolean h() {
            return ((C8144mv2) this.Y).h();
        }

        public b h2(int i, C4174Rv1.b bVar) {
            P1();
            ((C8144mv2) this.Y).r3(i, bVar);
            return this;
        }

        @Override // o.Dv2
        public C7556ka2 i() {
            return ((C8144mv2) this.Y).i();
        }

        public b j2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C8144mv2) this.Y).s3(i, c4174Rv1);
            return this;
        }

        public b k2(C4174Rv1.b bVar) {
            P1();
            ((C8144mv2) this.Y).t3(bVar);
            return this;
        }

        @Override // o.Dv2
        public int l() {
            return ((C8144mv2) this.Y).l();
        }

        public b m2(C4174Rv1 c4174Rv1) {
            P1();
            ((C8144mv2) this.Y).u3(c4174Rv1);
            return this;
        }

        public b n2() {
            P1();
            ((C8144mv2) this.Y).v3();
            return this;
        }

        public b o2() {
            P1();
            ((C8144mv2) this.Y).w3();
            return this;
        }

        public b p2() {
            P1();
            ((C8144mv2) this.Y).x3();
            return this;
        }

        public b q2() {
            P1();
            ((C8144mv2) this.Y).z3();
            return this;
        }

        public b r2() {
            P1();
            ((C8144mv2) this.Y).A3();
            return this;
        }

        public b s2() {
            P1();
            ((C8144mv2) this.Y).C3();
            return this;
        }

        public b t2(C7556ka2 c7556ka2) {
            P1();
            ((C8144mv2) this.Y).O3(c7556ka2);
            return this;
        }

        @Override // o.Dv2
        public List<String> u() {
            return Collections.unmodifiableList(((C8144mv2) this.Y).u());
        }

        public b u2(int i) {
            P1();
            ((C8144mv2) this.Y).g4(i);
            return this;
        }

        public b v2(int i) {
            P1();
            ((C8144mv2) this.Y).i4(i);
            return this;
        }

        public b w2(int i, C3852On0.b bVar) {
            P1();
            ((C8144mv2) this.Y).j4(i, bVar);
            return this;
        }

        public b x2(int i, C3852On0 c3852On0) {
            P1();
            ((C8144mv2) this.Y).k4(i, c3852On0);
            return this;
        }

        public b y2(String str) {
            P1();
            ((C8144mv2) this.Y).l4(str);
            return this;
        }

        public b z2(AbstractC8616os abstractC8616os) {
            P1();
            ((C8144mv2) this.Y).m4(abstractC8616os);
            return this;
        }

        public b() {
            super(C8144mv2.DEFAULT_INSTANCE);
        }
    }

    static {
        C8144mv2 c8144mv2 = new C8144mv2();
        DEFAULT_INSTANCE = c8144mv2;
        IC0.w2(C8144mv2.class, c8144mv2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        this.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3() {
        this.syntax_ = 0;
    }

    private void I3() {
        if (!this.options_.X2()) {
            this.options_ = IC0.W1(this.options_);
        }
    }

    public static C8144mv2 J3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(C7556ka2 c7556ka2) {
        c7556ka2.getClass();
        C7556ka2 c7556ka22 = this.sourceContext_;
        if (c7556ka22 != null && c7556ka22 != C7556ka2.D2()) {
            this.sourceContext_ = C7556ka2.F2(this.sourceContext_).U1(c7556ka2).i2();
        } else {
            this.sourceContext_ = c7556ka2;
        }
    }

    public static b P3() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b R3(C8144mv2 c8144mv2) {
        return DEFAULT_INSTANCE.w1(c8144mv2);
    }

    public static C8144mv2 S3(InputStream inputStream) throws IOException {
        return (C8144mv2) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C8144mv2 T3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C8144mv2) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C8144mv2 U3(InputStream inputStream) throws IOException {
        return (C8144mv2) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C8144mv2 W3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C8144mv2) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C8144mv2 X3(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C8144mv2) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C8144mv2 Y3(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C8144mv2) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C8144mv2 Z3(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C8144mv2) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C8144mv2 a4(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C8144mv2) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C8144mv2 b4(KE ke) throws IOException {
        return (C8144mv2) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C8144mv2 c4(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C8144mv2) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C8144mv2 d4(byte[] bArr) throws C9258rT0 {
        return (C8144mv2) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C8144mv2 e4(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C8144mv2) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C8144mv2> f4() {
        return DEFAULT_INSTANCE.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(int i) {
        I3();
        this.options_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(Iterable<? extends C4174Rv1> iterable) {
        I3();
        AbstractC5713d2.a0(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.name_ = abstractC8616os.B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4(int i, C4174Rv1.b bVar) {
        I3();
        this.options_.set(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        I3();
        this.options_.set(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q4(C7556ka2.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(int i, C4174Rv1.b bVar) {
        I3();
        this.options_.add(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r4(C7556ka2 c7556ka2) {
        c7556ka2.getClass();
        this.sourceContext_ = c7556ka2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        I3();
        this.options_.add(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s4(EnumC6128ek2 enumC6128ek2) {
        enumC6128ek2.getClass();
        this.syntax_ = enumC6128ek2.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(C4174Rv1.b bVar) {
        I3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t4(int i) {
        this.syntax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        I3();
        this.options_.add(c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3() {
        this.name_ = J3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3() {
        this.options_ = IC0.G1();
    }

    @Override // o.Dv2
    public C3852On0 A0(int i) {
        return this.fields_.get(i);
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C8144mv2();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", C3852On0.class, "oneofs_", "options_", C4174Rv1.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C8144mv2> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C8144mv2.class) {
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

    @Override // o.Dv2
    public List<C3852On0> E() {
        return this.fields_;
    }

    public final void E3() {
        if (!this.fields_.X2()) {
            this.fields_ = IC0.W1(this.fields_);
        }
    }

    public final void H3() {
        if (!this.oneofs_.X2()) {
            this.oneofs_ = IC0.W1(this.oneofs_);
        }
    }

    public InterfaceC10554wo0 K3(int i) {
        return this.fields_.get(i);
    }

    @Override // o.Dv2
    public String L0(int i) {
        return this.oneofs_.get(i);
    }

    public List<? extends InterfaceC10554wo0> L3() {
        return this.fields_;
    }

    public InterfaceC4371Tv1 M3(int i) {
        return this.options_.get(i);
    }

    public List<? extends InterfaceC4371Tv1> N3() {
        return this.options_;
    }

    @Override // o.Dv2
    public AbstractC8616os R(int i) {
        return AbstractC8616os.H(this.oneofs_.get(i));
    }

    @Override // o.Dv2
    public int X() {
        return this.oneofs_.size();
    }

    @Override // o.Dv2
    public AbstractC8616os b() {
        return AbstractC8616os.H(this.name_);
    }

    @Override // o.Dv2
    public List<C4174Rv1> c() {
        return this.options_;
    }

    @Override // o.Dv2
    public int d() {
        return this.options_.size();
    }

    @Override // o.Dv2
    public C4174Rv1 e(int i) {
        return this.options_.get(i);
    }

    @Override // o.Dv2
    public EnumC6128ek2 f() {
        EnumC6128ek2 e = EnumC6128ek2.e(this.syntax_);
        if (e == null) {
            return EnumC6128ek2.UNRECOGNIZED;
        }
        return e;
    }

    @Override // o.Dv2
    public int g() {
        return this.syntax_;
    }

    public final void g4(int i) {
        E3();
        this.fields_.remove(i);
    }

    @Override // o.Dv2
    public String getName() {
        return this.name_;
    }

    @Override // o.Dv2
    public boolean h() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public final void h3(Iterable<? extends C3852On0> iterable) {
        E3();
        AbstractC5713d2.a0(iterable, this.fields_);
    }

    @Override // o.Dv2
    public C7556ka2 i() {
        C7556ka2 c7556ka2 = this.sourceContext_;
        if (c7556ka2 == null) {
            return C7556ka2.D2();
        }
        return c7556ka2;
    }

    public final void i3(Iterable<String> iterable) {
        H3();
        AbstractC5713d2.a0(iterable, this.oneofs_);
    }

    public final void j4(int i, C3852On0.b bVar) {
        E3();
        this.fields_.set(i, bVar.build());
    }

    public final void k3(int i, C3852On0.b bVar) {
        E3();
        this.fields_.add(i, bVar.build());
    }

    public final void k4(int i, C3852On0 c3852On0) {
        c3852On0.getClass();
        E3();
        this.fields_.set(i, c3852On0);
    }

    @Override // o.Dv2
    public int l() {
        return this.fields_.size();
    }

    public final void l3(int i, C3852On0 c3852On0) {
        c3852On0.getClass();
        E3();
        this.fields_.add(i, c3852On0);
    }

    public final void m3(C3852On0.b bVar) {
        E3();
        this.fields_.add(bVar.build());
    }

    public final void n3(C3852On0 c3852On0) {
        c3852On0.getClass();
        E3();
        this.fields_.add(c3852On0);
    }

    public final void n4(int i, String str) {
        str.getClass();
        H3();
        this.oneofs_.set(i, str);
    }

    public final void o3(String str) {
        str.getClass();
        H3();
        this.oneofs_.add(str);
    }

    public final void p3(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        H3();
        this.oneofs_.add(abstractC8616os.B0());
    }

    @Override // o.Dv2
    public List<String> u() {
        return this.oneofs_;
    }

    public final void v3() {
        this.fields_ = IC0.G1();
    }

    public final void x3() {
        this.oneofs_ = IC0.G1();
    }
}
