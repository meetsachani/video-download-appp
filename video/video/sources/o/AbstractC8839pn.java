package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import o.C9258rT0;
import o.IM2;
import o.O71;

/* renamed from: o.pn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8839pn implements EO1 {
    public static final int c = 3;
    public static final int d = 7;

    /* renamed from: o.pn$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IM2.b.values().length];
            a = iArr;
            try {
                iArr[IM2.b.e1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IM2.b.i1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IM2.b.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IM2.b.k1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IM2.b.d1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IM2.b.c1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IM2.b.Y0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IM2.b.b1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[IM2.b.Z0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IM2.b.h1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[IM2.b.l1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[IM2.b.m1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[IM2.b.n1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[IM2.b.o1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[IM2.b.f1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[IM2.b.j1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[IM2.b.a1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* renamed from: o.pn$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8839pn {
        public final boolean e;
        public final byte[] f;
        public int g;
        public final int h;
        public int i;
        public int j;
        public int k;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.e = z;
            this.f = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.g = arrayOffset;
            this.h = arrayOffset;
            this.i = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // o.EO1
        public <T> T A(InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
            l0(3);
            return (T) X(interfaceC9026qY1, c3151Hj0);
        }

        @Override // o.EO1
        public int B() throws IOException {
            l0(5);
            return Y();
        }

        @Override // o.EO1
        public void C(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof B41) {
                B41 b41 = (B41) list;
                int b = IM2.b(this.j);
                if (b != 1) {
                    if (b == 2) {
                        int f0 = f0();
                        r0(f0);
                        int i3 = this.g + f0;
                        while (this.g < i3) {
                            b41.i4(b0());
                        }
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    b41.i4(g());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 1) {
                if (b2 == 2) {
                    int f02 = f0();
                    r0(f02);
                    int i4 = this.g + f02;
                    while (this.g < i4) {
                        list.add(Long.valueOf(b0()));
                    }
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Long.valueOf(g()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        @Override // o.EO1
        public void D(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C6299fR0) {
                C6299fR0 c6299fR0 = (C6299fR0) list;
                int b = IM2.b(this.j);
                if (b != 0) {
                    if (b == 2) {
                        int f0 = this.g + f0();
                        while (this.g < f0) {
                            c6299fR0.H3(f0());
                        }
                        k0(f0);
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    c6299fR0.H3(u());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 0) {
                if (b2 == 2) {
                    int f02 = this.g + f0();
                    while (this.g < f02) {
                        list.add(Integer.valueOf(f0()));
                    }
                    k0(f02);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Integer.valueOf(u()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        @Override // o.EO1
        public void E(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C6299fR0) {
                C6299fR0 c6299fR0 = (C6299fR0) list;
                int b = IM2.b(this.j);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            c6299fR0.H3(B());
                            if (!U()) {
                                i2 = this.g;
                            } else {
                                return;
                            }
                        } while (f0() == this.j);
                        this.g = i2;
                        return;
                    }
                    throw C9258rT0.e();
                }
                int f0 = f0();
                q0(f0);
                int i3 = this.g + f0;
                while (this.g < i3) {
                    c6299fR0.H3(Z());
                }
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(B()));
                        if (!U()) {
                            i = this.g;
                        } else {
                            return;
                        }
                    } while (f0() == this.j);
                    this.g = i;
                    return;
                }
                throw C9258rT0.e();
            }
            int f02 = f0();
            q0(f02);
            int i4 = this.g + f02;
            while (this.g < i4) {
                list.add(Integer.valueOf(Z()));
            }
        }

        @Override // o.EO1
        public long F() throws IOException {
            l0(0);
            return KE.c(g0());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.EO1
        public <K, V> void G(Map<K, V> map, O71.b<K, V> bVar, C3151Hj0 c3151Hj0) throws IOException {
            l0(2);
            int f0 = f0();
            j0(f0);
            int i = this.i;
            this.i = this.g + f0;
            try {
                Object obj = bVar.b;
                Object obj2 = bVar.d;
                while (true) {
                    int I = I();
                    if (I == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (I != 1) {
                        if (I != 2) {
                            try {
                                if (!M()) {
                                    throw new C9258rT0("Unable to parse map entry.");
                                    break;
                                }
                            } catch (C9258rT0.a unused) {
                                if (!M()) {
                                    throw new C9258rT0("Unable to parse map entry.");
                                }
                            }
                        } else {
                            obj2 = W(bVar.c, bVar.d.getClass(), c3151Hj0);
                        }
                    } else {
                        obj = W(bVar.a, null, null);
                    }
                }
            } finally {
                this.i = i;
            }
        }

        @Override // o.EO1
        public String H() throws IOException {
            return d0(false);
        }

        @Override // o.EO1
        public int I() throws IOException {
            if (U()) {
                return Integer.MAX_VALUE;
            }
            int f0 = f0();
            this.j = f0;
            if (f0 == this.k) {
                return Integer.MAX_VALUE;
            }
            return IM2.a(f0);
        }

        @Override // o.EO1
        public void J(List<String> list) throws IOException {
            e0(list, false);
        }

        @Override // o.EO1
        public void K(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C6413fv0) {
                C6413fv0 c6413fv0 = (C6413fv0) list;
                int b = IM2.b(this.j);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            c6413fv0.D0(readFloat());
                            if (!U()) {
                                i2 = this.g;
                            } else {
                                return;
                            }
                        } while (f0() == this.j);
                        this.g = i2;
                        return;
                    }
                    throw C9258rT0.e();
                }
                int f0 = f0();
                q0(f0);
                int i3 = this.g + f0;
                while (this.g < i3) {
                    c6413fv0.D0(Float.intBitsToFloat(Z()));
                }
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!U()) {
                            i = this.g;
                        } else {
                            return;
                        }
                    } while (f0() == this.j);
                    this.g = i;
                    return;
                }
                throw C9258rT0.e();
            }
            int f02 = f0();
            q0(f02);
            int i4 = this.g + f02;
            while (this.g < i4) {
                list.add(Float.valueOf(Float.intBitsToFloat(Z())));
            }
        }

        @Override // o.EO1
        public boolean M() throws IOException {
            int i;
            if (!U() && (i = this.j) != this.k) {
                int b = IM2.b(i);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 5) {
                                    m0(4);
                                    return true;
                                }
                                throw C9258rT0.e();
                            }
                            n0();
                            return true;
                        }
                        m0(f0());
                        return true;
                    }
                    m0(8);
                    return true;
                }
                o0();
                return true;
            }
            return false;
        }

        @Override // o.EO1
        public int N() throws IOException {
            l0(5);
            return Y();
        }

        @Override // o.EO1
        public void O(List<AbstractC8616os> list) throws IOException {
            int i;
            if (IM2.b(this.j) == 2) {
                do {
                    list.add(t());
                    if (U()) {
                        return;
                    }
                    i = this.g;
                } while (f0() == this.j);
                this.g = i;
                return;
            }
            throw C9258rT0.e();
        }

        @Override // o.EO1
        public void P(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof X40) {
                X40 x40 = (X40) list;
                int b = IM2.b(this.j);
                if (b != 1) {
                    if (b == 2) {
                        int f0 = f0();
                        r0(f0);
                        int i3 = this.g + f0;
                        while (this.g < i3) {
                            x40.v4(Double.longBitsToDouble(b0()));
                        }
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    x40.v4(readDouble());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 1) {
                if (b2 == 2) {
                    int f02 = f0();
                    r0(f02);
                    int i4 = this.g + f02;
                    while (this.g < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(b0())));
                    }
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Double.valueOf(readDouble()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        @Override // o.EO1
        public long Q() throws IOException {
            l0(0);
            return g0();
        }

        @Override // o.EO1
        public String R() throws IOException {
            return d0(true);
        }

        @Override // o.AbstractC8839pn
        public int S() {
            return this.g - this.h;
        }

        public final boolean U() {
            if (this.g == this.i) {
                return true;
            }
            return false;
        }

        public final byte V() throws IOException {
            int i = this.g;
            if (i != this.i) {
                byte[] bArr = this.f;
                this.g = i + 1;
                return bArr[i];
            }
            throw C9258rT0.l();
        }

        public final Object W(IM2.b bVar, Class<?> cls, C3151Hj0 c3151Hj0) throws IOException {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(f());
                case 2:
                    return t();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(p());
                case 5:
                    return Integer.valueOf(B());
                case 6:
                    return Long.valueOf(c());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(u());
                case 9:
                    return Long.valueOf(Q());
                case 10:
                    return a(cls, c3151Hj0);
                case 11:
                    return Integer.valueOf(N());
                case 12:
                    return Long.valueOf(g());
                case 13:
                    return Integer.valueOf(q());
                case 14:
                    return Long.valueOf(F());
                case 15:
                    return R();
                case 16:
                    return Integer.valueOf(j());
                case 17:
                    return Long.valueOf(x());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        public final <T> T X(InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
            int i = this.k;
            this.k = IM2.c(IM2.a(this.j), 4);
            try {
                T b = interfaceC9026qY1.b();
                interfaceC9026qY1.i(b, this, c3151Hj0);
                interfaceC9026qY1.d(b);
                if (this.j == this.k) {
                    return b;
                }
                throw C9258rT0.h();
            } finally {
                this.k = i;
            }
        }

        public final int Y() throws IOException {
            j0(4);
            return Z();
        }

        public final int Z() {
            int i = this.g;
            byte[] bArr = this.f;
            this.g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // o.EO1
        public <T> T a(Class<T> cls, C3151Hj0 c3151Hj0) throws IOException {
            l0(2);
            return (T) c0(XJ1.a().i(cls), c3151Hj0);
        }

        public final long a0() throws IOException {
            j0(8);
            return b0();
        }

        @Override // o.EO1
        public <T> void b(List<T> list, Class<T> cls, C3151Hj0 c3151Hj0) throws IOException {
            m(list, XJ1.a().i(cls), c3151Hj0);
        }

        public final long b0() {
            int i = this.g;
            byte[] bArr = this.f;
            this.g = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // o.EO1
        public long c() throws IOException {
            l0(1);
            return a0();
        }

        public final <T> T c0(InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
            int f0 = f0();
            j0(f0);
            int i = this.i;
            int i2 = this.g + f0;
            this.i = i2;
            try {
                T b = interfaceC9026qY1.b();
                interfaceC9026qY1.i(b, this, c3151Hj0);
                interfaceC9026qY1.d(b);
                if (this.g == i2) {
                    return b;
                }
                throw C9258rT0.h();
            } finally {
                this.i = i;
            }
        }

        @Override // o.EO1
        public void d(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C6299fR0) {
                C6299fR0 c6299fR0 = (C6299fR0) list;
                int b = IM2.b(this.j);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            c6299fR0.H3(N());
                            if (!U()) {
                                i2 = this.g;
                            } else {
                                return;
                            }
                        } while (f0() == this.j);
                        this.g = i2;
                        return;
                    }
                    throw C9258rT0.e();
                }
                int f0 = f0();
                q0(f0);
                int i3 = this.g + f0;
                while (this.g < i3) {
                    c6299fR0.H3(Z());
                }
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(N()));
                        if (!U()) {
                            i = this.g;
                        } else {
                            return;
                        }
                    } while (f0() == this.j);
                    this.g = i;
                    return;
                }
                throw C9258rT0.e();
            }
            int f02 = f0();
            q0(f02);
            int i4 = this.g + f02;
            while (this.g < i4) {
                list.add(Integer.valueOf(Z()));
            }
        }

        public String d0(boolean z) throws IOException {
            l0(2);
            int f0 = f0();
            if (f0 == 0) {
                return "";
            }
            j0(f0);
            if (z) {
                byte[] bArr = this.f;
                int i = this.g;
                if (!BD2.u(bArr, i, i + f0)) {
                    throw C9258rT0.d();
                }
            }
            String str = new String(this.f, this.g, f0, C9740tS0.a);
            this.g += f0;
            return str;
        }

        @Override // o.EO1
        public void e(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof B41) {
                B41 b41 = (B41) list;
                int b = IM2.b(this.j);
                if (b != 0) {
                    if (b == 2) {
                        int f0 = this.g + f0();
                        while (this.g < f0) {
                            b41.i4(KE.c(g0()));
                        }
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    b41.i4(F());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 0) {
                if (b2 == 2) {
                    int f02 = this.g + f0();
                    while (this.g < f02) {
                        list.add(Long.valueOf(KE.c(g0())));
                    }
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Long.valueOf(F()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        public void e0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (IM2.b(this.j) == 2) {
                if ((list instanceof InterfaceC6581gZ0) && !z) {
                    InterfaceC6581gZ0 interfaceC6581gZ0 = (InterfaceC6581gZ0) list;
                    do {
                        interfaceC6581gZ0.E3(t());
                        if (!U()) {
                            i2 = this.g;
                        } else {
                            return;
                        }
                    } while (f0() == this.j);
                    this.g = i2;
                    return;
                }
                do {
                    list.add(d0(z));
                    if (U()) {
                        return;
                    }
                    i = this.g;
                } while (f0() == this.j);
                this.g = i;
                return;
            }
            throw C9258rT0.e();
        }

        @Override // o.EO1
        public boolean f() throws IOException {
            l0(0);
            if (f0() == 0) {
                return false;
            }
            return true;
        }

        public final int f0() throws IOException {
            int i;
            int i2 = this.g;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.g = i4;
                    return b;
                } else if (i3 - i4 < 9) {
                    return (int) h0();
                } else {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << C8077mf.p) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << C8077mf.y);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    } else {
                                                        throw C9258rT0.f();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.g = i5;
                    return i;
                }
            }
            throw C9258rT0.l();
        }

        @Override // o.EO1
        public long g() throws IOException {
            l0(1);
            return a0();
        }

        public long g0() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.g;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.f;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.g = i3;
                    return b;
                } else if (i2 - i3 < 9) {
                    return h0();
                } else {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << C8077mf.p) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << C8077mf.y);
                            if (i9 < 0) {
                                i4 = i8;
                                j = (-2080896) ^ i9;
                            } else {
                                long j4 = i9;
                                i4 = i + 5;
                                long j5 = j4 ^ (bArr[i8] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j6 = j5 ^ (bArr[i4] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j5 = j6 ^ (bArr[i10] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j6 = j5 ^ (bArr[i4] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    } else {
                                                        throw C9258rT0.f();
                                                    }
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                    i4 = i10;
                                }
                                j = j5 ^ j3;
                            }
                        }
                    }
                    this.g = i4;
                    return j;
                }
            }
            throw C9258rT0.l();
        }

        @Override // o.EO1
        public void h(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof B41) {
                B41 b41 = (B41) list;
                int b = IM2.b(this.j);
                if (b != 0) {
                    if (b == 2) {
                        int f0 = this.g + f0();
                        while (this.g < f0) {
                            b41.i4(g0());
                        }
                        k0(f0);
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    b41.i4(x());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 0) {
                if (b2 == 2) {
                    int f02 = this.g + f0();
                    while (this.g < f02) {
                        list.add(Long.valueOf(g0()));
                    }
                    k0(f02);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Long.valueOf(x()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        public final long h0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte V = V();
                j |= (V & Byte.MAX_VALUE) << i;
                if ((V & 128) == 0) {
                    return j;
                }
            }
            throw C9258rT0.f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.EO1
        public <T> void i(List<T> list, InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
            int i;
            if (IM2.b(this.j) == 2) {
                int i2 = this.j;
                do {
                    list.add(c0(interfaceC9026qY1, c3151Hj0));
                    if (U()) {
                        return;
                    }
                    i = this.g;
                } while (f0() == i2);
                this.g = i;
                return;
            }
            throw C9258rT0.e();
        }

        @Override // o.EO1
        public int i0() {
            return this.j;
        }

        @Override // o.EO1
        public int j() throws IOException {
            l0(0);
            return f0();
        }

        public final void j0(int i) throws IOException {
            if (i >= 0 && i <= this.i - this.g) {
                return;
            }
            throw C9258rT0.l();
        }

        @Override // o.EO1
        public <T> void k(List<T> list, Class<T> cls, C3151Hj0 c3151Hj0) throws IOException {
            i(list, XJ1.a().i(cls), c3151Hj0);
        }

        public final void k0(int i) throws IOException {
            if (this.g == i) {
                return;
            }
            throw C9258rT0.l();
        }

        @Override // o.EO1
        public void l(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof B41) {
                B41 b41 = (B41) list;
                int b = IM2.b(this.j);
                if (b != 0) {
                    if (b == 2) {
                        int f0 = this.g + f0();
                        while (this.g < f0) {
                            b41.i4(g0());
                        }
                        k0(f0);
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    b41.i4(Q());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 0) {
                if (b2 == 2) {
                    int f02 = this.g + f0();
                    while (this.g < f02) {
                        list.add(Long.valueOf(g0()));
                    }
                    k0(f02);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Long.valueOf(Q()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        public final void l0(int i) throws IOException {
            if (IM2.b(this.j) == i) {
                return;
            }
            throw C9258rT0.e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.EO1
        public <T> void m(List<T> list, InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
            int i;
            if (IM2.b(this.j) == 3) {
                int i2 = this.j;
                do {
                    list.add(X(interfaceC9026qY1, c3151Hj0));
                    if (U()) {
                        return;
                    }
                    i = this.g;
                } while (f0() == i2);
                this.g = i;
                return;
            }
            throw C9258rT0.e();
        }

        public final void m0(int i) throws IOException {
            j0(i);
            this.g += i;
        }

        @Override // o.EO1
        public <T> T n(Class<T> cls, C3151Hj0 c3151Hj0) throws IOException {
            l0(3);
            return (T) X(XJ1.a().i(cls), c3151Hj0);
        }

        public final void n0() throws IOException {
            int i = this.k;
            this.k = IM2.c(IM2.a(this.j), 4);
            while (I() != Integer.MAX_VALUE && M()) {
            }
            if (this.j == this.k) {
                this.k = i;
                return;
            }
            throw C9258rT0.h();
        }

        @Override // o.EO1
        public void o(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C6299fR0) {
                C6299fR0 c6299fR0 = (C6299fR0) list;
                int b = IM2.b(this.j);
                if (b != 0) {
                    if (b == 2) {
                        int f0 = this.g + f0();
                        while (this.g < f0) {
                            c6299fR0.H3(f0());
                        }
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    c6299fR0.H3(p());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 0) {
                if (b2 == 2) {
                    int f02 = this.g + f0();
                    while (this.g < f02) {
                        list.add(Integer.valueOf(f0()));
                    }
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Integer.valueOf(p()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        public final void o0() throws IOException {
            int i = this.i;
            int i2 = this.g;
            if (i - i2 >= 10) {
                byte[] bArr = this.f;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.g = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            p0();
        }

        @Override // o.EO1
        public int p() throws IOException {
            l0(0);
            return f0();
        }

        public final void p0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (V() >= 0) {
                    return;
                }
            }
            throw C9258rT0.f();
        }

        @Override // o.EO1
        public int q() throws IOException {
            l0(0);
            return KE.b(f0());
        }

        public final void q0(int i) throws IOException {
            j0(i);
            if ((i & 3) == 0) {
                return;
            }
            throw C9258rT0.h();
        }

        @Override // o.EO1
        public void r(List<Boolean> list) throws IOException {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C3170Ho) {
                C3170Ho c3170Ho = (C3170Ho) list;
                int b = IM2.b(this.j);
                if (b != 0) {
                    if (b == 2) {
                        int f0 = this.g + f0();
                        while (this.g < f0) {
                            if (f0() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c3170Ho.C1(z2);
                        }
                        k0(f0);
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    c3170Ho.C1(f());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 0) {
                if (b2 == 2) {
                    int f02 = this.g + f0();
                    while (this.g < f02) {
                        if (f0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    k0(f02);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Boolean.valueOf(f()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        public final void r0(int i) throws IOException {
            j0(i);
            if ((i & 7) == 0) {
                return;
            }
            throw C9258rT0.h();
        }

        @Override // o.EO1
        public double readDouble() throws IOException {
            l0(1);
            return Double.longBitsToDouble(a0());
        }

        @Override // o.EO1
        public float readFloat() throws IOException {
            l0(5);
            return Float.intBitsToFloat(Y());
        }

        @Override // o.EO1
        public void s(List<String> list) throws IOException {
            e0(list, true);
        }

        @Override // o.EO1
        public AbstractC8616os t() throws IOException {
            AbstractC8616os G;
            l0(2);
            int f0 = f0();
            if (f0 == 0) {
                return AbstractC8616os.Z0;
            }
            j0(f0);
            if (this.e) {
                G = AbstractC8616os.G0(this.f, this.g, f0);
            } else {
                G = AbstractC8616os.G(this.f, this.g, f0);
            }
            this.g += f0;
            return G;
        }

        @Override // o.EO1
        public int u() throws IOException {
            l0(0);
            return f0();
        }

        @Override // o.EO1
        public void v(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof B41) {
                B41 b41 = (B41) list;
                int b = IM2.b(this.j);
                if (b != 1) {
                    if (b == 2) {
                        int f0 = f0();
                        r0(f0);
                        int i3 = this.g + f0;
                        while (this.g < i3) {
                            b41.i4(b0());
                        }
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    b41.i4(c());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 1) {
                if (b2 == 2) {
                    int f02 = f0();
                    r0(f02);
                    int i4 = this.g + f02;
                    while (this.g < i4) {
                        list.add(Long.valueOf(b0()));
                    }
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Long.valueOf(c()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        @Override // o.EO1
        public void w(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C6299fR0) {
                C6299fR0 c6299fR0 = (C6299fR0) list;
                int b = IM2.b(this.j);
                if (b != 0) {
                    if (b == 2) {
                        int f0 = this.g + f0();
                        while (this.g < f0) {
                            c6299fR0.H3(KE.b(f0()));
                        }
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    c6299fR0.H3(q());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 0) {
                if (b2 == 2) {
                    int f02 = this.g + f0();
                    while (this.g < f02) {
                        list.add(Integer.valueOf(KE.b(f0())));
                    }
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Integer.valueOf(q()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        @Override // o.EO1
        public long x() throws IOException {
            l0(0);
            return g0();
        }

        @Override // o.EO1
        public void y(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C6299fR0) {
                C6299fR0 c6299fR0 = (C6299fR0) list;
                int b = IM2.b(this.j);
                if (b != 0) {
                    if (b == 2) {
                        int f0 = this.g + f0();
                        while (this.g < f0) {
                            c6299fR0.H3(f0());
                        }
                        return;
                    }
                    throw C9258rT0.e();
                }
                do {
                    c6299fR0.H3(j());
                    if (!U()) {
                        i2 = this.g;
                    } else {
                        return;
                    }
                } while (f0() == this.j);
                this.g = i2;
                return;
            }
            int b2 = IM2.b(this.j);
            if (b2 != 0) {
                if (b2 == 2) {
                    int f02 = this.g + f0();
                    while (this.g < f02) {
                        list.add(Integer.valueOf(f0()));
                    }
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                list.add(Integer.valueOf(j()));
                if (U()) {
                    return;
                }
                i = this.g;
            } while (f0() == this.j);
            this.g = i;
        }

        @Override // o.EO1
        public <T> T z(InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
            l0(2);
            return (T) c0(interfaceC9026qY1, c3151Hj0);
        }
    }

    public /* synthetic */ AbstractC8839pn(a aVar) {
        this();
    }

    public static AbstractC8839pn T(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // o.EO1
    public boolean L() {
        return false;
    }

    public abstract int S();

    public AbstractC8839pn() {
    }
}
