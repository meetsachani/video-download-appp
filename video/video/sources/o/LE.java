package o;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.C9258rT0;
import o.IM2;
import o.O71;

/* loaded from: classes.dex */
public final class LE implements EO1 {
    public static final int g = 3;
    public static final int h = 7;
    public static final int i = 0;
    public final KE c;
    public int d;
    public int e;
    public int f = 0;

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

    public LE(KE ke) {
        KE ke2 = (KE) C9740tS0.e(ke, "input");
        this.c = ke2;
        ke2.d = this;
    }

    public static LE S(KE ke) {
        LE le = ke.d;
        if (le != null) {
            return le;
        }
        return new LE(ke);
    }

    private Object T(IM2.b bVar, Class<?> cls, C3151Hj0 c3151Hj0) throws IOException {
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

    private <T> T U(InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
        int i2 = this.e;
        this.e = IM2.c(IM2.a(this.d), 4);
        try {
            T b = interfaceC9026qY1.b();
            interfaceC9026qY1.i(b, this, c3151Hj0);
            interfaceC9026qY1.d(b);
            if (this.d == this.e) {
                return b;
            }
            throw C9258rT0.h();
        } finally {
            this.e = i2;
        }
    }

    private <T> T V(InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
        KE ke;
        int Z = this.c.Z();
        KE ke2 = this.c;
        if (ke2.a < ke2.b) {
            int t = ke2.t(Z);
            T b = interfaceC9026qY1.b();
            this.c.a++;
            interfaceC9026qY1.i(b, this, c3151Hj0);
            interfaceC9026qY1.d(b);
            this.c.a(0);
            ke.a--;
            this.c.s(t);
            return b;
        }
        throw C9258rT0.i();
    }

    private void X(int i2) throws IOException {
        if (this.c.h() == i2) {
            return;
        }
        throw C9258rT0.l();
    }

    private void Y(int i2) throws IOException {
        if (IM2.b(this.d) == i2) {
            return;
        }
        throw C9258rT0.e();
    }

    private void Z(int i2) throws IOException {
        if ((i2 & 3) == 0) {
            return;
        }
        throw C9258rT0.h();
    }

    private void a0(int i2) throws IOException {
        if ((i2 & 7) == 0) {
            return;
        }
        throw C9258rT0.h();
    }

    @Override // o.EO1
    public <T> T A(InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
        Y(3);
        return (T) U(interfaceC9026qY1, c3151Hj0);
    }

    @Override // o.EO1
    public int B() throws IOException {
        Y(5);
        return this.c.A();
    }

    @Override // o.EO1
    public void C(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof B41) {
            B41 b41 = (B41) list;
            int b = IM2.b(this.d);
            if (b != 1) {
                if (b == 2) {
                    int Z = this.c.Z();
                    a0(Z);
                    int h2 = this.c.h() + Z;
                    do {
                        b41.i4(this.c.T());
                    } while (this.c.h() < h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                b41.i4(this.c.T());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 1) {
            if (b2 == 2) {
                int Z2 = this.c.Z();
                a0(Z2);
                int h3 = this.c.h() + Z2;
                do {
                    list.add(Long.valueOf(this.c.T()));
                } while (this.c.h() < h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Long.valueOf(this.c.T()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public void D(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int b = IM2.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int h2 = this.c.h() + this.c.Z();
                    do {
                        c6299fR0.H3(this.c.F());
                    } while (this.c.h() < h2);
                    X(h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                c6299fR0.H3(this.c.F());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int h3 = this.c.h() + this.c.Z();
                do {
                    list.add(Integer.valueOf(this.c.F()));
                } while (this.c.h() < h3);
                X(h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Integer.valueOf(this.c.F()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public void E(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int b = IM2.b(this.d);
            if (b != 2) {
                if (b == 5) {
                    do {
                        c6299fR0.H3(this.c.A());
                        if (!this.c.i()) {
                            Y2 = this.c.Y();
                        } else {
                            return;
                        }
                    } while (Y2 == this.d);
                    this.f = Y2;
                    return;
                }
                throw C9258rT0.e();
            }
            int Z = this.c.Z();
            Z(Z);
            int h2 = this.c.h() + Z;
            do {
                c6299fR0.H3(this.c.A());
            } while (this.c.h() < h2);
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.c.A()));
                    if (!this.c.i()) {
                        Y = this.c.Y();
                    } else {
                        return;
                    }
                } while (Y == this.d);
                this.f = Y;
                return;
            }
            throw C9258rT0.e();
        }
        int Z2 = this.c.Z();
        Z(Z2);
        int h3 = this.c.h() + Z2;
        do {
            list.add(Integer.valueOf(this.c.A()));
        } while (this.c.h() < h3);
    }

    @Override // o.EO1
    public long F() throws IOException {
        Y(0);
        return this.c.V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r7.c.s(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.EO1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <K, V> void G(Map<K, V> map, O71.b<K, V> bVar, C3151Hj0 c3151Hj0) throws IOException {
        Y(2);
        int t = this.c.t(this.c.Z());
        Object obj = bVar.b;
        Object obj2 = bVar.d;
        while (true) {
            try {
                int I = I();
                if (I == Integer.MAX_VALUE || this.c.i()) {
                    break;
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
                        obj2 = T(bVar.c, bVar.d.getClass(), c3151Hj0);
                    }
                } else {
                    obj = T(bVar.a, null, null);
                }
            } catch (Throwable th) {
                this.c.s(t);
                throw th;
            }
        }
    }

    @Override // o.EO1
    public String H() throws IOException {
        Y(2);
        return this.c.W();
    }

    @Override // o.EO1
    public int I() throws IOException {
        int i2 = this.f;
        if (i2 != 0) {
            this.d = i2;
            this.f = 0;
        } else {
            this.d = this.c.Y();
        }
        int i3 = this.d;
        if (i3 != 0 && i3 != this.e) {
            return IM2.a(i3);
        }
        return Integer.MAX_VALUE;
    }

    @Override // o.EO1
    public void J(List<String> list) throws IOException {
        W(list, false);
    }

    @Override // o.EO1
    public void K(List<Float> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C6413fv0) {
            C6413fv0 c6413fv0 = (C6413fv0) list;
            int b = IM2.b(this.d);
            if (b != 2) {
                if (b == 5) {
                    do {
                        c6413fv0.D0(this.c.C());
                        if (!this.c.i()) {
                            Y2 = this.c.Y();
                        } else {
                            return;
                        }
                    } while (Y2 == this.d);
                    this.f = Y2;
                    return;
                }
                throw C9258rT0.e();
            }
            int Z = this.c.Z();
            Z(Z);
            int h2 = this.c.h() + Z;
            do {
                c6413fv0.D0(this.c.C());
            } while (this.c.h() < h2);
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.c.C()));
                    if (!this.c.i()) {
                        Y = this.c.Y();
                    } else {
                        return;
                    }
                } while (Y == this.d);
                this.f = Y;
                return;
            }
            throw C9258rT0.e();
        }
        int Z2 = this.c.Z();
        Z(Z2);
        int h3 = this.c.h() + Z2;
        do {
            list.add(Float.valueOf(this.c.C()));
        } while (this.c.h() < h3);
    }

    @Override // o.EO1
    public boolean L() {
        return this.c.f0();
    }

    @Override // o.EO1
    public boolean M() throws IOException {
        int i2;
        if (!this.c.i() && (i2 = this.d) != this.e) {
            return this.c.g0(i2);
        }
        return false;
    }

    @Override // o.EO1
    public int N() throws IOException {
        Y(5);
        return this.c.S();
    }

    @Override // o.EO1
    public void O(List<AbstractC8616os> list) throws IOException {
        int Y;
        if (IM2.b(this.d) == 2) {
            do {
                list.add(t());
                if (this.c.i()) {
                    return;
                }
                Y = this.c.Y();
            } while (Y == this.d);
            this.f = Y;
            return;
        }
        throw C9258rT0.e();
    }

    @Override // o.EO1
    public void P(List<Double> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof X40) {
            X40 x40 = (X40) list;
            int b = IM2.b(this.d);
            if (b != 1) {
                if (b == 2) {
                    int Z = this.c.Z();
                    a0(Z);
                    int h2 = this.c.h() + Z;
                    do {
                        x40.v4(this.c.y());
                    } while (this.c.h() < h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                x40.v4(this.c.y());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 1) {
            if (b2 == 2) {
                int Z2 = this.c.Z();
                a0(Z2);
                int h3 = this.c.h() + Z2;
                do {
                    list.add(Double.valueOf(this.c.y()));
                } while (this.c.h() < h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Double.valueOf(this.c.y()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public long Q() throws IOException {
        Y(0);
        return this.c.G();
    }

    @Override // o.EO1
    public String R() throws IOException {
        Y(2);
        return this.c.X();
    }

    public void W(List<String> list, boolean z) throws IOException {
        String H;
        int Y;
        int Y2;
        if (IM2.b(this.d) == 2) {
            if ((list instanceof InterfaceC6581gZ0) && !z) {
                InterfaceC6581gZ0 interfaceC6581gZ0 = (InterfaceC6581gZ0) list;
                do {
                    interfaceC6581gZ0.E3(t());
                    if (!this.c.i()) {
                        Y2 = this.c.Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.d);
                this.f = Y2;
                return;
            }
            do {
                if (z) {
                    H = R();
                } else {
                    H = H();
                }
                list.add(H);
                if (this.c.i()) {
                    return;
                }
                Y = this.c.Y();
            } while (Y == this.d);
            this.f = Y;
            return;
        }
        throw C9258rT0.e();
    }

    @Override // o.EO1
    public <T> T a(Class<T> cls, C3151Hj0 c3151Hj0) throws IOException {
        Y(2);
        return (T) V(XJ1.a().i(cls), c3151Hj0);
    }

    @Override // o.EO1
    public <T> void b(List<T> list, Class<T> cls, C3151Hj0 c3151Hj0) throws IOException {
        m(list, XJ1.a().i(cls), c3151Hj0);
    }

    @Override // o.EO1
    public long c() throws IOException {
        Y(1);
        return this.c.B();
    }

    @Override // o.EO1
    public void d(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int b = IM2.b(this.d);
            if (b != 2) {
                if (b == 5) {
                    do {
                        c6299fR0.H3(this.c.S());
                        if (!this.c.i()) {
                            Y2 = this.c.Y();
                        } else {
                            return;
                        }
                    } while (Y2 == this.d);
                    this.f = Y2;
                    return;
                }
                throw C9258rT0.e();
            }
            int Z = this.c.Z();
            Z(Z);
            int h2 = this.c.h() + Z;
            do {
                c6299fR0.H3(this.c.S());
            } while (this.c.h() < h2);
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.c.S()));
                    if (!this.c.i()) {
                        Y = this.c.Y();
                    } else {
                        return;
                    }
                } while (Y == this.d);
                this.f = Y;
                return;
            }
            throw C9258rT0.e();
        }
        int Z2 = this.c.Z();
        Z(Z2);
        int h3 = this.c.h() + Z2;
        do {
            list.add(Integer.valueOf(this.c.S()));
        } while (this.c.h() < h3);
    }

    @Override // o.EO1
    public void e(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof B41) {
            B41 b41 = (B41) list;
            int b = IM2.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int h2 = this.c.h() + this.c.Z();
                    do {
                        b41.i4(this.c.V());
                    } while (this.c.h() < h2);
                    X(h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                b41.i4(this.c.V());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int h3 = this.c.h() + this.c.Z();
                do {
                    list.add(Long.valueOf(this.c.V()));
                } while (this.c.h() < h3);
                X(h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Long.valueOf(this.c.V()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public boolean f() throws IOException {
        Y(0);
        return this.c.u();
    }

    @Override // o.EO1
    public long g() throws IOException {
        Y(1);
        return this.c.T();
    }

    @Override // o.EO1
    public void h(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof B41) {
            B41 b41 = (B41) list;
            int b = IM2.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int h2 = this.c.h() + this.c.Z();
                    do {
                        b41.i4(this.c.a0());
                    } while (this.c.h() < h2);
                    X(h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                b41.i4(this.c.a0());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int h3 = this.c.h() + this.c.Z();
                do {
                    list.add(Long.valueOf(this.c.a0()));
                } while (this.c.h() < h3);
                X(h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Long.valueOf(this.c.a0()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.EO1
    public <T> void i(List<T> list, InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
        int Y;
        if (IM2.b(this.d) == 2) {
            int i2 = this.d;
            do {
                list.add(V(interfaceC9026qY1, c3151Hj0));
                if (!this.c.i() && this.f == 0) {
                    Y = this.c.Y();
                } else {
                    return;
                }
            } while (Y == i2);
            this.f = Y;
            return;
        }
        throw C9258rT0.e();
    }

    @Override // o.EO1
    public int i0() {
        return this.d;
    }

    @Override // o.EO1
    public int j() throws IOException {
        Y(0);
        return this.c.Z();
    }

    @Override // o.EO1
    public <T> void k(List<T> list, Class<T> cls, C3151Hj0 c3151Hj0) throws IOException {
        i(list, XJ1.a().i(cls), c3151Hj0);
    }

    @Override // o.EO1
    public void l(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof B41) {
            B41 b41 = (B41) list;
            int b = IM2.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int h2 = this.c.h() + this.c.Z();
                    do {
                        b41.i4(this.c.G());
                    } while (this.c.h() < h2);
                    X(h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                b41.i4(this.c.G());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int h3 = this.c.h() + this.c.Z();
                do {
                    list.add(Long.valueOf(this.c.G()));
                } while (this.c.h() < h3);
                X(h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Long.valueOf(this.c.G()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.EO1
    public <T> void m(List<T> list, InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
        int Y;
        if (IM2.b(this.d) == 3) {
            int i2 = this.d;
            do {
                list.add(U(interfaceC9026qY1, c3151Hj0));
                if (!this.c.i() && this.f == 0) {
                    Y = this.c.Y();
                } else {
                    return;
                }
            } while (Y == i2);
            this.f = Y;
            return;
        }
        throw C9258rT0.e();
    }

    @Override // o.EO1
    public <T> T n(Class<T> cls, C3151Hj0 c3151Hj0) throws IOException {
        Y(3);
        return (T) U(XJ1.a().i(cls), c3151Hj0);
    }

    @Override // o.EO1
    public void o(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int b = IM2.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int h2 = this.c.h() + this.c.Z();
                    do {
                        c6299fR0.H3(this.c.z());
                    } while (this.c.h() < h2);
                    X(h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                c6299fR0.H3(this.c.z());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int h3 = this.c.h() + this.c.Z();
                do {
                    list.add(Integer.valueOf(this.c.z()));
                } while (this.c.h() < h3);
                X(h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Integer.valueOf(this.c.z()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public int p() throws IOException {
        Y(0);
        return this.c.z();
    }

    @Override // o.EO1
    public int q() throws IOException {
        Y(0);
        return this.c.U();
    }

    @Override // o.EO1
    public void r(List<Boolean> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C3170Ho) {
            C3170Ho c3170Ho = (C3170Ho) list;
            int b = IM2.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int h2 = this.c.h() + this.c.Z();
                    do {
                        c3170Ho.C1(this.c.u());
                    } while (this.c.h() < h2);
                    X(h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                c3170Ho.C1(this.c.u());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int h3 = this.c.h() + this.c.Z();
                do {
                    list.add(Boolean.valueOf(this.c.u()));
                } while (this.c.h() < h3);
                X(h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Boolean.valueOf(this.c.u()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public double readDouble() throws IOException {
        Y(1);
        return this.c.y();
    }

    @Override // o.EO1
    public float readFloat() throws IOException {
        Y(5);
        return this.c.C();
    }

    @Override // o.EO1
    public void s(List<String> list) throws IOException {
        W(list, true);
    }

    @Override // o.EO1
    public AbstractC8616os t() throws IOException {
        Y(2);
        return this.c.x();
    }

    @Override // o.EO1
    public int u() throws IOException {
        Y(0);
        return this.c.F();
    }

    @Override // o.EO1
    public void v(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof B41) {
            B41 b41 = (B41) list;
            int b = IM2.b(this.d);
            if (b != 1) {
                if (b == 2) {
                    int Z = this.c.Z();
                    a0(Z);
                    int h2 = this.c.h() + Z;
                    do {
                        b41.i4(this.c.B());
                    } while (this.c.h() < h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                b41.i4(this.c.B());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 1) {
            if (b2 == 2) {
                int Z2 = this.c.Z();
                a0(Z2);
                int h3 = this.c.h() + Z2;
                do {
                    list.add(Long.valueOf(this.c.B()));
                } while (this.c.h() < h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Long.valueOf(this.c.B()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public void w(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int b = IM2.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int h2 = this.c.h() + this.c.Z();
                    do {
                        c6299fR0.H3(this.c.U());
                    } while (this.c.h() < h2);
                    X(h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                c6299fR0.H3(this.c.U());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int h3 = this.c.h() + this.c.Z();
                do {
                    list.add(Integer.valueOf(this.c.U()));
                } while (this.c.h() < h3);
                X(h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Integer.valueOf(this.c.U()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public long x() throws IOException {
        Y(0);
        return this.c.a0();
    }

    @Override // o.EO1
    public void y(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int b = IM2.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int h2 = this.c.h() + this.c.Z();
                    do {
                        c6299fR0.H3(this.c.Z());
                    } while (this.c.h() < h2);
                    X(h2);
                    return;
                }
                throw C9258rT0.e();
            }
            do {
                c6299fR0.H3(this.c.Z());
                if (!this.c.i()) {
                    Y2 = this.c.Y();
                } else {
                    return;
                }
            } while (Y2 == this.d);
            this.f = Y2;
            return;
        }
        int b2 = IM2.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int h3 = this.c.h() + this.c.Z();
                do {
                    list.add(Integer.valueOf(this.c.Z()));
                } while (this.c.h() < h3);
                X(h3);
                return;
            }
            throw C9258rT0.e();
        }
        do {
            list.add(Integer.valueOf(this.c.Z()));
            if (this.c.i()) {
                return;
            }
            Y = this.c.Y();
        } while (Y == this.d);
        this.f = Y;
    }

    @Override // o.EO1
    public <T> T z(InterfaceC9026qY1<T> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
        Y(2);
        return (T) V(interfaceC9026qY1, c3151Hj0);
    }
}
