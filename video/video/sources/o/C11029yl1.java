package o;

import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.C10833xx0;
import o.C3062Gl1;
import o.C4224Si1;
import o.KL0;
import o.NZ1;

@Deprecated
/* renamed from: o.yl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11029yl1 implements InterfaceC4324Tj0 {
    public static final int A = 4;
    public static final int B = 8;
    public static final int D = 131072;
    public static final int E = 32768;
    public static final int F = 10;
    public static final int G = -128000;
    public static final int H = 1483304551;
    public static final int I = 1231971951;
    public static final int J = 1447187017;
    public static final int K = 0;
    public static final int y = 1;
    public static final int z = 2;
    public final int d;
    public final long e;
    public final C3012Fy1 f;
    public final C3062Gl1.a g;
    public final BC0 h;
    public final ML0 i;
    public final InterfaceC10568wr2 j;
    public InterfaceC4518Vj0 k;
    public InterfaceC10568wr2 l;
    public InterfaceC10568wr2 m;
    public int n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public C4224Si1 f921o;
    public long p;
    public long q;
    public long r;
    public int s;
    public NZ1 t;
    public boolean u;
    public boolean v;
    public long w;
    public static final InterfaceC4809Yj0 x = new InterfaceC4809Yj0() { // from class: o.wl1
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return C11029yl1.c();
        }
    };
    public static final KL0.a C = new KL0.a() { // from class: o.xl1
        @Override // o.KL0.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return C11029yl1.e(i, i2, i3, i4, i5);
        }
    };

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.yl1$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C11029yl1() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new C11029yl1()};
    }

    public static /* synthetic */ boolean e(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77 && i3 == 76 && i4 == 76) {
                if (i5 == 84 || i == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @InterfaceC8557od0({"extractorOutput", "realTrackOutput"})
    private void f() {
        C9542sf.k(this.l);
        TD2.o(this.k);
    }

    public static long m(@InterfaceC11300zs1 C4224Si1 c4224Si1) {
        if (c4224Si1 != null) {
            int e = c4224Si1.e();
            for (int i = 0; i < e; i++) {
                C4224Si1.b d = c4224Si1.d(i);
                if (d instanceof C2566Bm2) {
                    C2566Bm2 c2566Bm2 = (C2566Bm2) d;
                    if (c2566Bm2.X.equals("TLEN")) {
                        return TD2.j1(Long.parseLong(c2566Bm2.Y0.get(0)));
                    }
                }
            }
            return C10323vs.b;
        }
        return C10323vs.b;
    }

    public static int n(C3012Fy1 c3012Fy1, int i) {
        if (c3012Fy1.g() >= i + 4) {
            c3012Fy1.Y(i);
            int s = c3012Fy1.s();
            if (s == 1483304551 || s == 1231971951) {
                return s;
            }
        }
        if (c3012Fy1.g() >= 40) {
            c3012Fy1.Y(36);
            if (c3012Fy1.s() == 1447187017) {
                return J;
            }
            return 0;
        }
        return 0;
    }

    public static boolean o(int i, long j) {
        if ((i & G) == (j & (-128000))) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public static C6127ek1 p(@InterfaceC11300zs1 C4224Si1 c4224Si1, long j) {
        if (c4224Si1 != null) {
            int e = c4224Si1.e();
            for (int i = 0; i < e; i++) {
                C4224Si1.b d = c4224Si1.d(i);
                if (d instanceof C5885dk1) {
                    return C6127ek1.a(j, (C5885dk1) d, m(c4224Si1));
                }
            }
            return null;
        }
        return null;
    }

    @HS1({"realTrackOutput", "seeker"})
    private int t(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3062Gl1.a aVar;
        if (this.s == 0) {
            interfaceC4421Uj0.i();
            if (r(interfaceC4421Uj0)) {
                return -1;
            }
            this.f.Y(0);
            int s = this.f.s();
            if (o(s, this.n) && C3062Gl1.j(s) != -1) {
                this.g.a(s);
                if (this.p == C10323vs.b) {
                    this.p = this.t.c(interfaceC4421Uj0.getPosition());
                    if (this.e != C10323vs.b) {
                        this.p += this.e - this.t.c(0L);
                    }
                }
                this.s = this.g.c;
                NZ1 nz1 = this.t;
                if (nz1 instanceof C8750pP0) {
                    C8750pP0 c8750pP0 = (C8750pP0) nz1;
                    c8750pP0.b(i(this.q + aVar.g), interfaceC4421Uj0.getPosition() + this.g.c);
                    if (this.v && c8750pP0.a(this.w)) {
                        this.v = false;
                        this.m = this.l;
                    }
                }
            } else {
                interfaceC4421Uj0.t(1);
                this.n = 0;
                return 0;
            }
        }
        int c = this.m.c(interfaceC4421Uj0, this.s, true);
        if (c == -1) {
            return -1;
        }
        int i = this.s - c;
        this.s = i;
        if (i > 0) {
            return 0;
        }
        this.m.b(i(this.q), 1, this.g.c, 0, null);
        this.q += this.g.g;
        this.s = 0;
        return 0;
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        this.n = 0;
        this.p = C10323vs.b;
        this.q = 0L;
        this.s = 0;
        this.w = j2;
        NZ1 nz1 = this.t;
        if ((nz1 instanceof C8750pP0) && !((C8750pP0) nz1).a(j2)) {
            this.v = true;
            this.m = this.j;
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.k = interfaceC4518Vj0;
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(0, 1);
        this.l = b;
        this.m = b;
        this.k.n();
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return u(interfaceC4421Uj0, true);
    }

    public final NZ1 h(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        long m;
        long j;
        NZ1 q = q(interfaceC4421Uj0);
        C6127ek1 p = p(this.f921o, interfaceC4421Uj0.getPosition());
        if (this.u) {
            return new NZ1.a();
        }
        if ((this.d & 4) != 0) {
            if (p != null) {
                m = p.i();
                j = p.f();
            } else if (q != null) {
                m = q.i();
                j = q.f();
            } else {
                m = m(this.f921o);
                j = -1;
            }
            q = new C8750pP0(m, interfaceC4421Uj0.getPosition(), j);
        } else if (p != null) {
            q = p;
        } else if (q == null) {
            q = null;
        }
        boolean z2 = true;
        if (q != null && (q.h() || (this.d & 1) == 0)) {
            return q;
        }
        if ((this.d & 2) == 0) {
            z2 = false;
        }
        return l(interfaceC4421Uj0, z2);
    }

    public final long i(long j) {
        return this.p + ((j * 1000000) / this.g.d);
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        f();
        int s = s(interfaceC4421Uj0);
        if (s == -1 && (this.t instanceof C8750pP0)) {
            long i = i(this.q);
            if (this.t.i() != i) {
                ((C8750pP0) this.t).d(i);
                this.k.p(this.t);
            }
        }
        return s;
    }

    public void k() {
        this.u = true;
    }

    public final NZ1 l(InterfaceC4421Uj0 interfaceC4421Uj0, boolean z2) throws IOException {
        interfaceC4421Uj0.x(this.f.e(), 0, 4);
        this.f.Y(0);
        this.g.a(this.f.s());
        return new C8242nK(interfaceC4421Uj0.getLength(), interfaceC4421Uj0.getPosition(), this.g, z2);
    }

    @InterfaceC11300zs1
    public final NZ1 q(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(this.g.c);
        interfaceC4421Uj0.x(c3012Fy1.e(), 0, this.g.c);
        C3062Gl1.a aVar = this.g;
        int i = 21;
        if ((aVar.a & 1) != 0) {
            if (aVar.e != 1) {
                i = 36;
            }
        } else if (aVar.e == 1) {
            i = 13;
        }
        int i2 = i;
        int n = n(c3012Fy1, i2);
        if (n != 1483304551 && n != 1231971951) {
            if (n == 1447187017) {
                KE2 a2 = KE2.a(interfaceC4421Uj0.getLength(), interfaceC4421Uj0.getPosition(), this.g, c3012Fy1);
                interfaceC4421Uj0.t(this.g.c);
                return a2;
            }
            interfaceC4421Uj0.i();
            return null;
        }
        UN2 a3 = UN2.a(interfaceC4421Uj0.getLength(), interfaceC4421Uj0.getPosition(), this.g, c3012Fy1);
        if (a3 != null && !this.h.a()) {
            interfaceC4421Uj0.i();
            interfaceC4421Uj0.p(i2 + C3503Kz.e0);
            interfaceC4421Uj0.x(this.f.e(), 0, 3);
            this.f.Y(0);
            this.h.d(this.f.O());
        }
        interfaceC4421Uj0.t(this.g.c);
        if (a3 != null && !a3.h() && n == 1231971951) {
            return l(interfaceC4421Uj0, false);
        }
        return a3;
    }

    public final boolean r(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        NZ1 nz1 = this.t;
        if (nz1 != null) {
            long f = nz1.f();
            if (f != -1 && interfaceC4421Uj0.n() > f - 4) {
                return true;
            }
        }
        try {
            return !interfaceC4421Uj0.h(this.f.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @HS1({"extractorOutput", "realTrackOutput"})
    public final int s(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C4224Si1 c4224Si1;
        if (this.n == 0) {
            try {
                u(interfaceC4421Uj0, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.t == null) {
            NZ1 h = h(interfaceC4421Uj0);
            this.t = h;
            this.k.p(h);
            InterfaceC10568wr2 interfaceC10568wr2 = this.m;
            C10833xx0.b Q = new C10833xx0.b().g0(this.g.b).Y(4096).J(this.g.e).h0(this.g.d).P(this.h.a).Q(this.h.b);
            if ((this.d & 8) != 0) {
                c4224Si1 = null;
            } else {
                c4224Si1 = this.f921o;
            }
            interfaceC10568wr2.a(Q.Z(c4224Si1).G());
            this.r = interfaceC4421Uj0.getPosition();
        } else if (this.r != 0) {
            long position = interfaceC4421Uj0.getPosition();
            long j = this.r;
            if (position < j) {
                interfaceC4421Uj0.t((int) (j - position));
            }
        }
        return t(interfaceC4421Uj0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
        if (r13 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
        r12.t(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r12.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
        r11.n = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(InterfaceC4421Uj0 interfaceC4421Uj0, boolean z2) throws IOException {
        int i;
        int i2;
        int i3;
        int j;
        KL0.a aVar;
        if (z2) {
            i = 32768;
        } else {
            i = 131072;
        }
        interfaceC4421Uj0.i();
        if (interfaceC4421Uj0.getPosition() == 0) {
            if ((this.d & 8) == 0) {
                aVar = null;
            } else {
                aVar = C;
            }
            C4224Si1 a2 = this.i.a(interfaceC4421Uj0, aVar);
            this.f921o = a2;
            if (a2 != null) {
                this.h.c(a2);
            }
            i2 = (int) interfaceC4421Uj0.n();
            if (!z2) {
                interfaceC4421Uj0.t(i2);
            }
            i3 = 0;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i4 = i3;
        int i5 = i4;
        while (true) {
            if (r(interfaceC4421Uj0)) {
                if (i4 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.f.Y(0);
                int s = this.f.s();
                if ((i3 != 0 && !o(s, i3)) || (j = C3062Gl1.j(s)) == -1) {
                    int i6 = i5 + 1;
                    if (i5 == i) {
                        if (z2) {
                            return false;
                        }
                        throw C3989Py1.a("Searched too many bytes.", null);
                    }
                    if (z2) {
                        interfaceC4421Uj0.i();
                        interfaceC4421Uj0.p(i2 + i6);
                    } else {
                        interfaceC4421Uj0.t(1);
                    }
                    i4 = 0;
                    i5 = i6;
                    i3 = 0;
                } else {
                    i4++;
                    if (i4 == 1) {
                        this.g.a(s);
                        i3 = s;
                    } else if (i4 == 4) {
                        break;
                    }
                    interfaceC4421Uj0.p(j - 4);
                }
            }
        }
    }

    public C11029yl1(int i) {
        this(i, C10323vs.b);
    }

    public C11029yl1(int i, long j) {
        this.d = (i & 2) != 0 ? i | 1 : i;
        this.e = j;
        this.f = new C3012Fy1(10);
        this.g = new C3062Gl1.a();
        this.h = new BC0();
        this.p = C10323vs.b;
        this.i = new ML0();
        W70 w70 = new W70();
        this.j = w70;
        this.m = w70;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
