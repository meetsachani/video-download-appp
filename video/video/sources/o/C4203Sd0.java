package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.C4174Rv1;
import o.C9740tS0;
import o.IC0;

/* renamed from: o.Sd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4203Sd0 extends IC0<C4203Sd0, b> implements InterfaceC4300Td0 {
    private static final C4203Sd0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC3892Oy1<C4203Sd0> PARSER;
    private int number_;
    private String name_ = "";
    private C9740tS0.k<C4174Rv1> options_ = IC0.G1();

    /* renamed from: o.Sd0$a */
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

    /* renamed from: o.Sd0$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C4203Sd0, b> implements InterfaceC4300Td0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b Y1(Iterable<? extends C4174Rv1> iterable) {
            P1();
            ((C4203Sd0) this.Y).N2(iterable);
            return this;
        }

        public b Z1(int i, C4174Rv1.b bVar) {
            P1();
            ((C4203Sd0) this.Y).O2(i, bVar);
            return this;
        }

        public b a2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C4203Sd0) this.Y).P2(i, c4174Rv1);
            return this;
        }

        @Override // o.InterfaceC4300Td0
        public AbstractC8616os b() {
            return ((C4203Sd0) this.Y).b();
        }

        public b b2(C4174Rv1.b bVar) {
            P1();
            ((C4203Sd0) this.Y).Q2(bVar);
            return this;
        }

        @Override // o.InterfaceC4300Td0
        public List<C4174Rv1> c() {
            return Collections.unmodifiableList(((C4203Sd0) this.Y).c());
        }

        public b c2(C4174Rv1 c4174Rv1) {
            P1();
            ((C4203Sd0) this.Y).R2(c4174Rv1);
            return this;
        }

        @Override // o.InterfaceC4300Td0
        public int d() {
            return ((C4203Sd0) this.Y).d();
        }

        public b d2() {
            P1();
            ((C4203Sd0) this.Y).S2();
            return this;
        }

        @Override // o.InterfaceC4300Td0
        public C4174Rv1 e(int i) {
            return ((C4203Sd0) this.Y).e(i);
        }

        public b e2() {
            P1();
            ((C4203Sd0) this.Y).T2();
            return this;
        }

        public b f2() {
            P1();
            ((C4203Sd0) this.Y).U2();
            return this;
        }

        public b g2(int i) {
            P1();
            ((C4203Sd0) this.Y).p3(i);
            return this;
        }

        @Override // o.InterfaceC4300Td0
        public String getName() {
            return ((C4203Sd0) this.Y).getName();
        }

        public b h2(String str) {
            P1();
            ((C4203Sd0) this.Y).r3(str);
            return this;
        }

        public b j2(AbstractC8616os abstractC8616os) {
            P1();
            ((C4203Sd0) this.Y).s3(abstractC8616os);
            return this;
        }

        @Override // o.InterfaceC4300Td0
        public int k() {
            return ((C4203Sd0) this.Y).k();
        }

        public b k2(int i) {
            P1();
            ((C4203Sd0) this.Y).t3(i);
            return this;
        }

        public b m2(int i, C4174Rv1.b bVar) {
            P1();
            ((C4203Sd0) this.Y).u3(i, bVar);
            return this;
        }

        public b n2(int i, C4174Rv1 c4174Rv1) {
            P1();
            ((C4203Sd0) this.Y).v3(i, c4174Rv1);
            return this;
        }

        public b() {
            super(C4203Sd0.DEFAULT_INSTANCE);
        }
    }

    static {
        C4203Sd0 c4203Sd0 = new C4203Sd0();
        DEFAULT_INSTANCE = c4203Sd0;
        IC0.w2(C4203Sd0.class, c4203Sd0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2(Iterable<? extends C4174Rv1> iterable) {
        V2();
        AbstractC5713d2.a0(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2(int i, C4174Rv1.b bVar) {
        V2();
        this.options_.add(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        V2();
        this.options_.add(i, c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2(C4174Rv1.b bVar) {
        V2();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2(C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        V2();
        this.options_.add(c4174Rv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2() {
        this.name_ = W2().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2() {
        this.options_ = IC0.G1();
    }

    private void V2() {
        if (!this.options_.X2()) {
            this.options_ = IC0.W1(this.options_);
        }
    }

    public static C4203Sd0 W2() {
        return DEFAULT_INSTANCE;
    }

    public static b Z2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b a3(C4203Sd0 c4203Sd0) {
        return DEFAULT_INSTANCE.w1(c4203Sd0);
    }

    public static C4203Sd0 b3(InputStream inputStream) throws IOException {
        return (C4203Sd0) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C4203Sd0 c3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C4203Sd0) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C4203Sd0 e3(InputStream inputStream) throws IOException {
        return (C4203Sd0) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C4203Sd0 f3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C4203Sd0) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C4203Sd0 g3(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C4203Sd0) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C4203Sd0 h3(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4203Sd0) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C4203Sd0 i3(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C4203Sd0) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C4203Sd0 j3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4203Sd0) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C4203Sd0 k3(KE ke) throws IOException {
        return (C4203Sd0) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C4203Sd0 l3(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C4203Sd0) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C4203Sd0 m3(byte[] bArr) throws C9258rT0 {
        return (C4203Sd0) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C4203Sd0 n3(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4203Sd0) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C4203Sd0> o3() {
        return DEFAULT_INSTANCE.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(int i) {
        V2();
        this.options_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(AbstractC8616os abstractC8616os) {
        abstractC8616os.getClass();
        AbstractC5713d2.e0(abstractC8616os);
        this.name_ = abstractC8616os.B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(int i, C4174Rv1.b bVar) {
        V2();
        this.options_.set(i, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(int i, C4174Rv1 c4174Rv1) {
        c4174Rv1.getClass();
        V2();
        this.options_.set(i, c4174Rv1);
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C4203Sd0();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", C4174Rv1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C4203Sd0> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C4203Sd0.class) {
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

    public final void T2() {
        this.number_ = 0;
    }

    public InterfaceC4371Tv1 X2(int i) {
        return this.options_.get(i);
    }

    public List<? extends InterfaceC4371Tv1> Y2() {
        return this.options_;
    }

    @Override // o.InterfaceC4300Td0
    public AbstractC8616os b() {
        return AbstractC8616os.H(this.name_);
    }

    @Override // o.InterfaceC4300Td0
    public List<C4174Rv1> c() {
        return this.options_;
    }

    @Override // o.InterfaceC4300Td0
    public int d() {
        return this.options_.size();
    }

    @Override // o.InterfaceC4300Td0
    public C4174Rv1 e(int i) {
        return this.options_.get(i);
    }

    @Override // o.InterfaceC4300Td0
    public String getName() {
        return this.name_;
    }

    @Override // o.InterfaceC4300Td0
    public int k() {
        return this.number_;
    }

    public final void t3(int i) {
        this.number_ = i;
    }
}
