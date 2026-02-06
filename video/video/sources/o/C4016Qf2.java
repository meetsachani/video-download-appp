package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import o.IC0;
import o.IM2;

/* renamed from: o.Qf2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4016Qf2 extends IC0<C4016Qf2, b> implements InterfaceC4213Sf2 {
    private static final C4016Qf2 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC3892Oy1<C4016Qf2> PARSER;
    private Q71<String, BE2> fields_ = Q71.g();

    /* renamed from: o.Qf2$a */
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

    /* renamed from: o.Qf2$b */
    /* loaded from: classes.dex */
    public static final class b extends IC0.b<C4016Qf2, b> implements InterfaceC4213Sf2 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o.InterfaceC4213Sf2
        public Map<String, BE2> I0() {
            return Collections.unmodifiableMap(((C4016Qf2) this.Y).I0());
        }

        @Override // o.InterfaceC4213Sf2
        public boolean K0(String str) {
            str.getClass();
            return ((C4016Qf2) this.Y).I0().containsKey(str);
        }

        @Override // o.InterfaceC4213Sf2
        @Deprecated
        public Map<String, BE2> Q() {
            return I0();
        }

        public b Y1() {
            P1();
            ((C4016Qf2) this.Y).B2().clear();
            return this;
        }

        public b Z1(Map<String, BE2> map) {
            P1();
            ((C4016Qf2) this.Y).B2().putAll(map);
            return this;
        }

        public b a2(String str, BE2 be2) {
            str.getClass();
            be2.getClass();
            P1();
            ((C4016Qf2) this.Y).B2().put(str, be2);
            return this;
        }

        public b b2(String str) {
            str.getClass();
            P1();
            ((C4016Qf2) this.Y).B2().remove(str);
            return this;
        }

        @Override // o.InterfaceC4213Sf2
        public int l() {
            return ((C4016Qf2) this.Y).I0().size();
        }

        @Override // o.InterfaceC4213Sf2
        public BE2 o1(String str, BE2 be2) {
            str.getClass();
            Map<String, BE2> I0 = ((C4016Qf2) this.Y).I0();
            if (I0.containsKey(str)) {
                return I0.get(str);
            }
            return be2;
        }

        @Override // o.InterfaceC4213Sf2
        public BE2 q1(String str) {
            str.getClass();
            Map<String, BE2> I0 = ((C4016Qf2) this.Y).I0();
            if (I0.containsKey(str)) {
                return I0.get(str);
            }
            throw new IllegalArgumentException();
        }

        public b() {
            super(C4016Qf2.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.Qf2$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final O71<String, BE2> a = O71.f(IM2.b.f1, "", IM2.b.h1, BE2.Z2());
    }

    static {
        C4016Qf2 c4016Qf2 = new C4016Qf2();
        DEFAULT_INSTANCE = c4016Qf2;
        IC0.w2(C4016Qf2.class, c4016Qf2);
    }

    public static C4016Qf2 A2() {
        return DEFAULT_INSTANCE;
    }

    public static b E2() {
        return DEFAULT_INSTANCE.v1();
    }

    public static b F2(C4016Qf2 c4016Qf2) {
        return DEFAULT_INSTANCE.w1(c4016Qf2);
    }

    public static C4016Qf2 G2(InputStream inputStream) throws IOException {
        return (C4016Qf2) IC0.b2(DEFAULT_INSTANCE, inputStream);
    }

    public static C4016Qf2 H2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C4016Qf2) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C4016Qf2 I2(InputStream inputStream) throws IOException {
        return (C4016Qf2) IC0.d2(DEFAULT_INSTANCE, inputStream);
    }

    public static C4016Qf2 J2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
        return (C4016Qf2) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
    }

    public static C4016Qf2 K2(ByteBuffer byteBuffer) throws C9258rT0 {
        return (C4016Qf2) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C4016Qf2 L2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4016Qf2) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
    }

    public static C4016Qf2 M2(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (C4016Qf2) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
    }

    public static C4016Qf2 N2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4016Qf2) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
    }

    public static C4016Qf2 O2(KE ke) throws IOException {
        return (C4016Qf2) IC0.k2(DEFAULT_INSTANCE, ke);
    }

    public static C4016Qf2 P2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        return (C4016Qf2) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
    }

    public static C4016Qf2 Q2(byte[] bArr) throws C9258rT0 {
        return (C4016Qf2) IC0.n2(DEFAULT_INSTANCE, bArr);
    }

    public static C4016Qf2 R2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (C4016Qf2) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
    }

    public static InterfaceC3892Oy1<C4016Qf2> S2() {
        return DEFAULT_INSTANCE.k1();
    }

    @Override // o.IC0
    public final Object A1(IC0.i iVar, Object obj, Object obj2) {
        InterfaceC3892Oy1 interfaceC3892Oy1;
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return new C4016Qf2();
            case 2:
                return new b(null);
            case 3:
                return IC0.Y1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3892Oy1<C4016Qf2> interfaceC3892Oy12 = PARSER;
                if (interfaceC3892Oy12 == null) {
                    synchronized (C4016Qf2.class) {
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

    public final Map<String, BE2> B2() {
        return D2();
    }

    public final Q71<String, BE2> C2() {
        return this.fields_;
    }

    public final Q71<String, BE2> D2() {
        if (!this.fields_.l()) {
            this.fields_ = this.fields_.o();
        }
        return this.fields_;
    }

    @Override // o.InterfaceC4213Sf2
    public Map<String, BE2> I0() {
        return Collections.unmodifiableMap(C2());
    }

    @Override // o.InterfaceC4213Sf2
    public boolean K0(String str) {
        str.getClass();
        return C2().containsKey(str);
    }

    @Override // o.InterfaceC4213Sf2
    @Deprecated
    public Map<String, BE2> Q() {
        return I0();
    }

    @Override // o.InterfaceC4213Sf2
    public int l() {
        return C2().size();
    }

    @Override // o.InterfaceC4213Sf2
    public BE2 o1(String str, BE2 be2) {
        str.getClass();
        Q71<String, BE2> C2 = C2();
        if (C2.containsKey(str)) {
            return C2.get(str);
        }
        return be2;
    }

    @Override // o.InterfaceC4213Sf2
    public BE2 q1(String str) {
        str.getClass();
        Q71<String, BE2> C2 = C2();
        if (C2.containsKey(str)) {
            return C2.get(str);
        }
        throw new IllegalArgumentException();
    }
}
