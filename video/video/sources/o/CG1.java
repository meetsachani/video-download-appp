package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C9740tS0;
import o.IC0;
import o.IM2;

/* loaded from: classes.dex */
public final class CG1 {

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
    public static final class b extends IC0<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        private static volatile InterfaceC3892Oy1<b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private Q71<String, f> preferences_ = Q71.g();

        /* loaded from: classes.dex */
        public static final class a extends IC0.b<b, a> implements c {
            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // o.CG1.c
            public boolean F(String str) {
                str.getClass();
                return ((b) this.Y).m1().containsKey(str);
            }

            @Override // o.CG1.c
            @Deprecated
            public Map<String, f> O0() {
                return m1();
            }

            @Override // o.CG1.c
            public f U(String str, f fVar) {
                str.getClass();
                Map<String, f> m1 = ((b) this.Y).m1();
                if (m1.containsKey(str)) {
                    return m1.get(str);
                }
                return fVar;
            }

            public a Y1() {
                P1();
                ((b) this.Y).B2().clear();
                return this;
            }

            public a Z1(Map<String, f> map) {
                P1();
                ((b) this.Y).B2().putAll(map);
                return this;
            }

            public a a2(String str, f fVar) {
                str.getClass();
                fVar.getClass();
                P1();
                ((b) this.Y).B2().put(str, fVar);
                return this;
            }

            @Override // o.CG1.c
            public f b1(String str) {
                str.getClass();
                Map<String, f> m1 = ((b) this.Y).m1();
                if (m1.containsKey(str)) {
                    return m1.get(str);
                }
                throw new IllegalArgumentException();
            }

            public a b2(String str) {
                str.getClass();
                P1();
                ((b) this.Y).B2().remove(str);
                return this;
            }

            @Override // o.CG1.c
            public Map<String, f> m1() {
                return Collections.unmodifiableMap(((b) this.Y).m1());
            }

            @Override // o.CG1.c
            public int y() {
                return ((b) this.Y).m1().size();
            }

            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: o.CG1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0167b {
            public static final O71<String, f> a = O71.f(IM2.b.f1, "", IM2.b.h1, f.Z2());
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            IC0.w2(b.class, bVar);
        }

        public static b A2() {
            return DEFAULT_INSTANCE;
        }

        public static a E2() {
            return DEFAULT_INSTANCE.v1();
        }

        public static a F2(b bVar) {
            return DEFAULT_INSTANCE.w1(bVar);
        }

        public static b G2(InputStream inputStream) throws IOException {
            return (b) IC0.b2(DEFAULT_INSTANCE, inputStream);
        }

        public static b H2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
            return (b) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
        }

        public static b I2(InputStream inputStream) throws IOException {
            return (b) IC0.d2(DEFAULT_INSTANCE, inputStream);
        }

        public static b J2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
            return (b) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
        }

        public static b K2(ByteBuffer byteBuffer) throws C9258rT0 {
            return (b) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b L2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (b) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
        }

        public static b M2(AbstractC8616os abstractC8616os) throws C9258rT0 {
            return (b) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
        }

        public static b N2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (b) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
        }

        public static b O2(KE ke) throws IOException {
            return (b) IC0.k2(DEFAULT_INSTANCE, ke);
        }

        public static b P2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
            return (b) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
        }

        public static b Q2(byte[] bArr) throws C9258rT0 {
            return (b) IC0.n2(DEFAULT_INSTANCE, bArr);
        }

        public static b R2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (b) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
        }

        public static InterfaceC3892Oy1<b> S2() {
            return DEFAULT_INSTANCE.k1();
        }

        @Override // o.IC0
        public final Object A1(IC0.i iVar, Object obj, Object obj2) {
            InterfaceC3892Oy1 interfaceC3892Oy1;
            switch (a.a[iVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return IC0.Y1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0167b.a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC3892Oy1<b> interfaceC3892Oy12 = PARSER;
                    if (interfaceC3892Oy12 == null) {
                        synchronized (b.class) {
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

        public final Map<String, f> B2() {
            return C2();
        }

        public final Q71<String, f> C2() {
            if (!this.preferences_.l()) {
                this.preferences_ = this.preferences_.o();
            }
            return this.preferences_;
        }

        public final Q71<String, f> D2() {
            return this.preferences_;
        }

        @Override // o.CG1.c
        public boolean F(String str) {
            str.getClass();
            return D2().containsKey(str);
        }

        @Override // o.CG1.c
        @Deprecated
        public Map<String, f> O0() {
            return m1();
        }

        @Override // o.CG1.c
        public f U(String str, f fVar) {
            str.getClass();
            Q71<String, f> D2 = D2();
            if (D2.containsKey(str)) {
                return D2.get(str);
            }
            return fVar;
        }

        @Override // o.CG1.c
        public f b1(String str) {
            str.getClass();
            Q71<String, f> D2 = D2();
            if (D2.containsKey(str)) {
                return D2.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // o.CG1.c
        public Map<String, f> m1() {
            return Collections.unmodifiableMap(D2());
        }

        @Override // o.CG1.c
        public int y() {
            return D2().size();
        }
    }

    /* loaded from: classes.dex */
    public interface c extends InterfaceC3637Mi1 {
        boolean F(String str);

        @Deprecated
        Map<String, f> O0();

        f U(String str, f fVar);

        f b1(String str);

        Map<String, f> m1();

        int y();
    }

    /* loaded from: classes.dex */
    public static final class d extends IC0<d, a> implements e {
        private static final d DEFAULT_INSTANCE;
        private static volatile InterfaceC3892Oy1<d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private C9740tS0.k<String> strings_ = IC0.G1();

        /* loaded from: classes.dex */
        public static final class a extends IC0.b<d, a> implements e {
            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // o.CG1.e
            public String X0(int i) {
                return ((d) this.Y).X0(i);
            }

            public a Y1(Iterable<String> iterable) {
                P1();
                ((d) this.Y).E2(iterable);
                return this;
            }

            public a Z1(String str) {
                P1();
                ((d) this.Y).F2(str);
                return this;
            }

            @Override // o.CG1.e
            public List<String> a1() {
                return Collections.unmodifiableList(((d) this.Y).a1());
            }

            public a a2(AbstractC8616os abstractC8616os) {
                P1();
                ((d) this.Y).G2(abstractC8616os);
                return this;
            }

            public a b2() {
                P1();
                ((d) this.Y).H2();
                return this;
            }

            public a c2(int i, String str) {
                P1();
                ((d) this.Y).Z2(i, str);
                return this;
            }

            @Override // o.CG1.e
            public AbstractC8616os w0(int i) {
                return ((d) this.Y).w0(i);
            }

            @Override // o.CG1.e
            public int x0() {
                return ((d) this.Y).x0();
            }

            public a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            IC0.w2(d.class, dVar);
        }

        public static d J2() {
            return DEFAULT_INSTANCE;
        }

        public static a K2() {
            return DEFAULT_INSTANCE.v1();
        }

        public static a L2(d dVar) {
            return DEFAULT_INSTANCE.w1(dVar);
        }

        public static d M2(InputStream inputStream) throws IOException {
            return (d) IC0.b2(DEFAULT_INSTANCE, inputStream);
        }

        public static d N2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
            return (d) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
        }

        public static d O2(InputStream inputStream) throws IOException {
            return (d) IC0.d2(DEFAULT_INSTANCE, inputStream);
        }

        public static d P2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
            return (d) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
        }

        public static d Q2(ByteBuffer byteBuffer) throws C9258rT0 {
            return (d) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d R2(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (d) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
        }

        public static d S2(AbstractC8616os abstractC8616os) throws C9258rT0 {
            return (d) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
        }

        public static d T2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (d) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
        }

        public static d U2(KE ke) throws IOException {
            return (d) IC0.k2(DEFAULT_INSTANCE, ke);
        }

        public static d V2(KE ke, C3151Hj0 c3151Hj0) throws IOException {
            return (d) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
        }

        public static d W2(byte[] bArr) throws C9258rT0 {
            return (d) IC0.n2(DEFAULT_INSTANCE, bArr);
        }

        public static d X2(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (d) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
        }

        public static InterfaceC3892Oy1<d> Y2() {
            return DEFAULT_INSTANCE.k1();
        }

        @Override // o.IC0
        public final Object A1(IC0.i iVar, Object obj, Object obj2) {
            InterfaceC3892Oy1 interfaceC3892Oy1;
            switch (a.a[iVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(null);
                case 3:
                    return IC0.Y1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC3892Oy1<d> interfaceC3892Oy12 = PARSER;
                    if (interfaceC3892Oy12 == null) {
                        synchronized (d.class) {
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
            AbstractC5713d2.a0(iterable, this.strings_);
        }

        public final void F2(String str) {
            str.getClass();
            I2();
            this.strings_.add(str);
        }

        public final void G2(AbstractC8616os abstractC8616os) {
            abstractC8616os.getClass();
            I2();
            this.strings_.add(abstractC8616os.B0());
        }

        public final void H2() {
            this.strings_ = IC0.G1();
        }

        public final void I2() {
            if (!this.strings_.X2()) {
                this.strings_ = IC0.W1(this.strings_);
            }
        }

        @Override // o.CG1.e
        public String X0(int i) {
            return this.strings_.get(i);
        }

        public final void Z2(int i, String str) {
            str.getClass();
            I2();
            this.strings_.set(i, str);
        }

        @Override // o.CG1.e
        public List<String> a1() {
            return this.strings_;
        }

        @Override // o.CG1.e
        public AbstractC8616os w0(int i) {
            return AbstractC8616os.H(this.strings_.get(i));
        }

        @Override // o.CG1.e
        public int x0() {
            return this.strings_.size();
        }
    }

    /* loaded from: classes.dex */
    public interface e extends InterfaceC3637Mi1 {
        String X0(int i);

        List<String> a1();

        AbstractC8616os w0(int i);

        int x0();
    }

    /* loaded from: classes.dex */
    public static final class f extends IC0<f, a> implements g {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final f DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile InterfaceC3892Oy1<f> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        /* loaded from: classes.dex */
        public static final class a extends IC0.b<f, a> implements g {
            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // o.CG1.g
            public boolean D0() {
                return ((f) this.Y).D0();
            }

            @Override // o.CG1.g
            public b J() {
                return ((f) this.Y).J();
            }

            @Override // o.CG1.g
            public boolean P0() {
                return ((f) this.Y).P0();
            }

            @Override // o.CG1.g
            public float T() {
                return ((f) this.Y).T();
            }

            @Override // o.CG1.g
            public boolean W() {
                return ((f) this.Y).W();
            }

            @Override // o.CG1.g
            public boolean Y() {
                return ((f) this.Y).Y();
            }

            public a Y1() {
                P1();
                ((f) this.Y).R2();
                return this;
            }

            @Override // o.CG1.g
            public boolean Z() {
                return ((f) this.Y).Z();
            }

            public a Z1() {
                P1();
                ((f) this.Y).S2();
                return this;
            }

            public a a2() {
                P1();
                ((f) this.Y).T2();
                return this;
            }

            public a b2() {
                P1();
                ((f) this.Y).U2();
                return this;
            }

            public a c2() {
                P1();
                ((f) this.Y).V2();
                return this;
            }

            public a d2() {
                P1();
                ((f) this.Y).W2();
                return this;
            }

            public a e2() {
                P1();
                ((f) this.Y).X2();
                return this;
            }

            public a f2() {
                P1();
                ((f) this.Y).Y2();
                return this;
            }

            @Override // o.CG1.g
            public boolean g1() {
                return ((f) this.Y).g1();
            }

            public a g2(d dVar) {
                P1();
                ((f) this.Y).a3(dVar);
                return this;
            }

            @Override // o.CG1.g
            public String getString() {
                return ((f) this.Y).getString();
            }

            public a h2(boolean z) {
                P1();
                ((f) this.Y).s3(z);
                return this;
            }

            public a j2(double d) {
                P1();
                ((f) this.Y).t3(d);
                return this;
            }

            public a k2(float f) {
                P1();
                ((f) this.Y).u3(f);
                return this;
            }

            public a m2(int i) {
                P1();
                ((f) this.Y).v3(i);
                return this;
            }

            public a n2(long j) {
                P1();
                ((f) this.Y).w3(j);
                return this;
            }

            public a o2(String str) {
                P1();
                ((f) this.Y).x3(str);
                return this;
            }

            public a p2(AbstractC8616os abstractC8616os) {
                P1();
                ((f) this.Y).z3(abstractC8616os);
                return this;
            }

            public a q2(d.a aVar) {
                P1();
                ((f) this.Y).A3(aVar);
                return this;
            }

            public a r2(d dVar) {
                P1();
                ((f) this.Y).C3(dVar);
                return this;
            }

            @Override // o.CG1.g
            public long s() {
                return ((f) this.Y).s();
            }

            @Override // o.CG1.g
            public int s0() {
                return ((f) this.Y).s0();
            }

            @Override // o.CG1.g
            public d t0() {
                return ((f) this.Y).t0();
            }

            @Override // o.CG1.g
            public double v0() {
                return ((f) this.Y).v0();
            }

            @Override // o.CG1.g
            public AbstractC8616os w() {
                return ((f) this.Y).w();
            }

            @Override // o.CG1.g
            public boolean y0() {
                return ((f) this.Y).y0();
            }

            @Override // o.CG1.g
            public boolean z() {
                return ((f) this.Y).z();
            }

            public a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes.dex */
        public enum b {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);
            
            public final int X;

            b(int i) {
                this.X = i;
            }

            public static b e(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }

            @Deprecated
            public static b g(int i) {
                return e(i);
            }

            public int k() {
                return this.X;
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            IC0.w2(f.class, fVar);
        }

        public static f Z2() {
            return DEFAULT_INSTANCE;
        }

        public static a b3() {
            return DEFAULT_INSTANCE.v1();
        }

        public static a c3(f fVar) {
            return DEFAULT_INSTANCE.w1(fVar);
        }

        public static f e3(InputStream inputStream) throws IOException {
            return (f) IC0.b2(DEFAULT_INSTANCE, inputStream);
        }

        public static f f3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
            return (f) IC0.c2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
        }

        public static f g3(InputStream inputStream) throws IOException {
            return (f) IC0.d2(DEFAULT_INSTANCE, inputStream);
        }

        public static f h3(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
            return (f) IC0.e2(DEFAULT_INSTANCE, inputStream, c3151Hj0);
        }

        public static f i3(ByteBuffer byteBuffer) throws C9258rT0 {
            return (f) IC0.f2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static f j3(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (f) IC0.g2(DEFAULT_INSTANCE, byteBuffer, c3151Hj0);
        }

        public static f k3(AbstractC8616os abstractC8616os) throws C9258rT0 {
            return (f) IC0.h2(DEFAULT_INSTANCE, abstractC8616os);
        }

        public static f l3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (f) IC0.j2(DEFAULT_INSTANCE, abstractC8616os, c3151Hj0);
        }

        public static f m3(KE ke) throws IOException {
            return (f) IC0.k2(DEFAULT_INSTANCE, ke);
        }

        public static f n3(KE ke, C3151Hj0 c3151Hj0) throws IOException {
            return (f) IC0.m2(DEFAULT_INSTANCE, ke, c3151Hj0);
        }

        public static f o3(byte[] bArr) throws C9258rT0 {
            return (f) IC0.n2(DEFAULT_INSTANCE, bArr);
        }

        public static f p3(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (f) IC0.o2(DEFAULT_INSTANCE, bArr, c3151Hj0);
        }

        public static InterfaceC3892Oy1<f> r3() {
            return DEFAULT_INSTANCE.k1();
        }

        @Override // o.IC0
        public final Object A1(IC0.i iVar, Object obj, Object obj2) {
            InterfaceC3892Oy1 interfaceC3892Oy1;
            switch (a.a[iVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(null);
                case 3:
                    return IC0.Y1(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", d.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC3892Oy1<f> interfaceC3892Oy12 = PARSER;
                    if (interfaceC3892Oy12 == null) {
                        synchronized (f.class) {
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

        public final void A3(d.a aVar) {
            this.value_ = aVar.build();
            this.valueCase_ = 6;
        }

        public final void C3(d dVar) {
            dVar.getClass();
            this.value_ = dVar;
            this.valueCase_ = 6;
        }

        @Override // o.CG1.g
        public boolean D0() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // o.CG1.g
        public b J() {
            return b.e(this.valueCase_);
        }

        @Override // o.CG1.g
        public boolean P0() {
            if (this.valueCase_ == 7) {
                return true;
            }
            return false;
        }

        public final void R2() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void S2() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // o.CG1.g
        public float T() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        public final void T2() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void U2() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void V2() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // o.CG1.g
        public boolean W() {
            if (this.valueCase_ == 5) {
                return true;
            }
            return false;
        }

        public final void W2() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void X2() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // o.CG1.g
        public boolean Y() {
            if (this.valueCase_ == 3) {
                return true;
            }
            return false;
        }

        public final void Y2() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        @Override // o.CG1.g
        public boolean Z() {
            if (this.valueCase_ == 2) {
                return true;
            }
            return false;
        }

        public final void a3(d dVar) {
            dVar.getClass();
            if (this.valueCase_ == 6 && this.value_ != d.J2()) {
                this.value_ = d.L2((d) this.value_).U1(dVar).i2();
            } else {
                this.value_ = dVar;
            }
            this.valueCase_ = 6;
        }

        @Override // o.CG1.g
        public boolean g1() {
            if (this.valueCase_ == 6) {
                return true;
            }
            return false;
        }

        @Override // o.CG1.g
        public String getString() {
            if (this.valueCase_ == 5) {
                return (String) this.value_;
            }
            return "";
        }

        @Override // o.CG1.g
        public long s() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // o.CG1.g
        public int s0() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        public final void s3(boolean z) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z);
        }

        @Override // o.CG1.g
        public d t0() {
            if (this.valueCase_ == 6) {
                return (d) this.value_;
            }
            return d.J2();
        }

        public final void t3(double d) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d);
        }

        public final void u3(float f) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f);
        }

        @Override // o.CG1.g
        public double v0() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        public final void v3(int i) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i);
        }

        @Override // o.CG1.g
        public AbstractC8616os w() {
            String str;
            if (this.valueCase_ == 5) {
                str = (String) this.value_;
            } else {
                str = "";
            }
            return AbstractC8616os.H(str);
        }

        public final void w3(long j) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j);
        }

        public final void x3(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        @Override // o.CG1.g
        public boolean y0() {
            if (this.valueCase_ == 4) {
                return true;
            }
            return false;
        }

        @Override // o.CG1.g
        public boolean z() {
            if (this.valueCase_ == 1) {
                return true;
            }
            return false;
        }

        public final void z3(AbstractC8616os abstractC8616os) {
            abstractC8616os.getClass();
            this.valueCase_ = 5;
            this.value_ = abstractC8616os.B0();
        }
    }

    /* loaded from: classes.dex */
    public interface g extends InterfaceC3637Mi1 {
        boolean D0();

        f.b J();

        boolean P0();

        float T();

        boolean W();

        boolean Y();

        boolean Z();

        boolean g1();

        String getString();

        long s();

        int s0();

        d t0();

        double v0();

        AbstractC8616os w();

        boolean y0();

        boolean z();
    }

    public static void a(C3151Hj0 c3151Hj0) {
    }
}
