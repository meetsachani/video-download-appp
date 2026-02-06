package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.C4174Rv1;
import o.C9740tS0;
import o.IC0;

/* renamed from: o.uj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10046uj1 extends IC0<C10046uj1, b> implements InterfaceC10778xj1 {
    private static final C10046uj1 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile InterfaceC3892Oy1<C10046uj1> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private C9740tS0.k<C4174Rv1> options_ = IC0.G1();

    /* renamed from: o.uj1$a */
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

    /* renamed from: o.uj1$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C10046uj1, b> implements InterfaceC10778xj1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.InterfaceC10778xj1
        public boolean O() {
            return ((C10046uj1) this.Y).O();
        }

        public b Y1(Iterable<? extends C4174Rv1> iterable) {
            P1();
            ((C10046uj1) this.Y).Y2(iterable);
            return this;
        }

        public b Z1(int i, C4174Rv1.b bVar) {
            P1();
            ((C10046uj1) this.Y).Z2(i, bVar);
            return this;
        }

        public b a2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C10046uj1) this.Y).a3(i, c4174Rv1);
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public AbstractC8616os b() {
            return ((C10046uj1) this.Y).b();
        }

        @Override // o.InterfaceC10778xj1
        public String b0() {
            return ((C10046uj1) this.Y).b0();
        }

        public b b2(C4174Rv1.b bVar) {
            P1();
            ((C10046uj1) this.Y).b3(bVar);
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public List<C4174Rv1> c() {
            return Collections.unmodifiableList(((C10046uj1) this.Y).c());
        }

        @Override // o.InterfaceC10778xj1
        public boolean c1() {
            return ((C10046uj1) this.Y).c1();
        }

        public b c2(C4174Rv1 c4174Rv1) {
            P1();
            ((C10046uj1) this.Y).c3(c4174Rv1);
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public int d() {
            return ((C10046uj1) this.Y).d();
        }

        public b d2() {
            P1();
            ((C10046uj1) this.Y).e3();
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public C4174Rv1 e(int i) {
            return ((C10046uj1) this.Y).e(i);
        }

        public b e2() {
            P1();
            ((C10046uj1) this.Y).f3();
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public EnumC6128ek2 f() {
            return ((C10046uj1) this.Y).f();
        }

        public b f2() {
            P1();
            ((C10046uj1) this.Y).g3();
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public int g() {
            return ((C10046uj1) this.Y).g();
        }

        public b g2() {
            P1();
            ((C10046uj1) this.Y).h3();
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public String getName() {
            return ((C10046uj1) this.Y).getName();
        }

        public b h2() {
            P1();
            ((C10046uj1) this.Y).i3();
            return this;
        }

        public b j2() {
            P1();
            ((C10046uj1) this.Y).j3();
            return this;
        }

        public b k2() {
            P1();
            ((C10046uj1) this.Y).k3();
            return this;
        }

        public b m2(int i) {
            P1();
            ((C10046uj1) this.Y).K3(i);
            return this;
        }

        public b n2(String str) {
            P1();
            ((C10046uj1) this.Y).L3(str);
            return this;
        }

        public b o2(AbstractC8616os abstractC8616os) {
            P1();
            ((C10046uj1) this.Y).M3(abstractC8616os);
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public AbstractC8616os p1() {
            return ((C10046uj1) this.Y).p1();
        }

        public b p2(int i, C4174Rv1.b bVar) {
            P1();
            ((C10046uj1) this.Y).N3(i, bVar);
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public String q0() {
            return ((C10046uj1) this.Y).q0();
        }

        public b q2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C10046uj1) this.Y).O3(i, c4174Rv1);
            return this;
        }

        public b r2(boolean z) {
            P1();
            ((C10046uj1) this.Y).P3(z);
            return this;
        }

        public b s2(String str) {
            P1();
            ((C10046uj1) this.Y).R3(str);
            return this;
        }

        public b t2(AbstractC8616os abstractC8616os) {
            P1();
            ((C10046uj1) this.Y).S3(abstractC8616os);
            return this;
        }

        public b u2(boolean z) {
            P1();
            ((C10046uj1) this.Y).T3(z);
            return this;
        }

        @Override // o.InterfaceC10778xj1
        public AbstractC8616os v() {
            return ((C10046uj1) this.Y).v();
        }

        public b v2(String str) {
            P1();
            ((C10046uj1) this.Y).U3(str);
            return this;
        }

        public b w2(AbstractC8616os abstractC8616os) {
            P1();
            ((C10046uj1) this.Y).W3(abstractC8616os);
            return this;
        }

        public b x2(EnumC6128ek2 enumC6128ek2) {
            P1();
            ((C10046uj1) this.Y).X3(enumC6128ek2);
            return this;
        }

        public b y2(int i) {
            P1();
            ((C10046uj1) this.Y).Y3(i);
            return this;
        }

        public b() {
            super(C10046uj1.DEFAULT_INSTANCE);
        }
    }

    static {
        C10046uj1 c10046uj1 = new C10046uj1();
        DEFAULT_INSTANCE = c10046uj1;
        IC0.w2(C10046uj1.class, c10046uj1);
    }

    public static C10046uj1 A3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C10046uj1) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C10046uj1 C3(KE ke) throws IOException {
        return (C10046uj1) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C10046uj1 E3(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C10046uj1) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C10046uj1 H3(byte[] bArr) throws C9258rT0 {
        return (C10046uj1) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C10046uj1 I3(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C10046uj1) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C10046uj1> J3() {
        return DEFAULT_INSTANCE.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(int i) {
        l3();
        this.options_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.name_ = abstractC8616os.B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(int i, C4174Rv1.b bVar) {
        l3();
        this.options_.set(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        l3();
        this.options_.set(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(EnumC6128ek2 enumC6128ek2) {
        enumC6128ek2.getClass();
        this.syntax_ = enumC6128ek2.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2(Iterable<? extends C4174Rv1> iterable) {
        l3();
        AbstractC5713d2.a0(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(int i) {
        this.syntax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2(int i, C4174Rv1.b bVar) {
        l3();
        this.options_.add(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        l3();
        this.options_.add(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3(C4174Rv1.b bVar) {
        l3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        l3();
        this.options_.add(c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.name_ = m3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        this.options_ = IC0.G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.syntax_ = 0;
    }

    private void l3() {
        if (!this.options_.X2()) {
            this.options_ = IC0.W1(this.options_);
        }
    }

    public static C10046uj1 m3() {
        return DEFAULT_INSTANCE;
    }

    public static b p3() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b r3(C10046uj1 c10046uj1) {
        return DEFAULT_INSTANCE.w1(c10046uj1);
    }

    public static C10046uj1 s3(InputStream inputStream) throws IOException {
        return (C10046uj1) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C10046uj1 t3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C10046uj1) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C10046uj1 u3(InputStream inputStream) throws IOException {
        return (C10046uj1) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C10046uj1 v3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C10046uj1) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C10046uj1 w3(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C10046uj1) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C10046uj1 x3(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C10046uj1) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C10046uj1 z3(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C10046uj1) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C10046uj1();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", C4174Rv1.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C10046uj1> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C10046uj1.class) {
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

    @Override // o.InterfaceC10778xj1
    public boolean O() {
        return this.requestStreaming_;
    }

    public final void P3(boolean z) {
        this.requestStreaming_ = z;
    }

    public final void R3(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    public final void S3(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.requestTypeUrl_ = abstractC8616os.B0();
    }

    public final void T3(boolean z) {
        this.responseStreaming_ = z;
    }

    public final void U3(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    public final void W3(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.responseTypeUrl_ = abstractC8616os.B0();
    }

    @Override // o.InterfaceC10778xj1
    public AbstractC8616os b() {
        return AbstractC8616os.H(this.name_);
    }

    @Override // o.InterfaceC10778xj1
    public String b0() {
        return this.requestTypeUrl_;
    }

    @Override // o.InterfaceC10778xj1
    public List<C4174Rv1> c() {
        return this.options_;
    }

    @Override // o.InterfaceC10778xj1
    public boolean c1() {
        return this.responseStreaming_;
    }

    @Override // o.InterfaceC10778xj1
    public int d() {
        return this.options_.size();
    }

    @Override // o.InterfaceC10778xj1
    public C4174Rv1 e(int i) {
        return this.options_.get(i);
    }

    @Override // o.InterfaceC10778xj1
    public EnumC6128ek2 f() {
        EnumC6128ek2 e = EnumC6128ek2.e(this.syntax_);
        if (e == null) {
            return EnumC6128ek2.UNRECOGNIZED;
        }
        return e;
    }

    @Override // o.InterfaceC10778xj1
    public int g() {
        return this.syntax_;
    }

    public final void g3() {
        this.requestStreaming_ = false;
    }

    @Override // o.InterfaceC10778xj1
    public String getName() {
        return this.name_;
    }

    public final void h3() {
        this.requestTypeUrl_ = m3().b0();
    }

    public final void i3() {
        this.responseStreaming_ = false;
    }

    public final void j3() {
        this.responseTypeUrl_ = m3().q0();
    }

    public InterfaceC4371Tv1 n3(int i) {
        return this.options_.get(i);
    }

    public List<? extends InterfaceC4371Tv1> o3() {
        return this.options_;
    }

    @Override // o.InterfaceC10778xj1
    public AbstractC8616os p1() {
        return AbstractC8616os.H(this.responseTypeUrl_);
    }

    @Override // o.InterfaceC10778xj1
    public String q0() {
        return this.responseTypeUrl_;
    }

    @Override // o.InterfaceC10778xj1
    public AbstractC8616os v() {
        return AbstractC8616os.H(this.requestTypeUrl_);
    }
}
