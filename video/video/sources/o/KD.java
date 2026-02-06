package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import o.AbstractC7373jp2;
import o.InterfaceC7583kh1;

@Deprecated
/* loaded from: classes2.dex */
public final class KD extends JN2 {
    public final long h1;
    public final long i1;
    public final boolean j1;
    public final boolean k1;
    public final boolean l1;
    public final ArrayList<JD> m1;
    public final AbstractC7373jp2.d n1;
    @InterfaceC11300zs1
    public a o1;
    @InterfaceC11300zs1
    public b p1;
    public long q1;
    public long r1;

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3696My0 {
        public final long b1;
        public final long c1;
        public final long d1;
        public final boolean e1;

        public a(AbstractC7373jp2 abstractC7373jp2, long j, long j2) throws b {
            super(abstractC7373jp2);
            long max;
            long j3;
            boolean z = false;
            if (abstractC7373jp2.n() == 1) {
                AbstractC7373jp2.d u = abstractC7373jp2.u(0, new AbstractC7373jp2.d());
                long max2 = Math.max(0L, j);
                if (!u.g1 && max2 != 0 && !u.c1) {
                    throw new b(1);
                }
                if (j2 == Long.MIN_VALUE) {
                    max = u.i1;
                } else {
                    max = Math.max(0L, j2);
                }
                long j4 = u.i1;
                if (j4 != C10323vs.b) {
                    max = max > j4 ? j4 : max;
                    if (max2 > max) {
                        throw new b(2);
                    }
                }
                this.b1 = max2;
                this.c1 = max;
                int i = (max > C10323vs.b ? 1 : (max == C10323vs.b ? 0 : -1));
                if (i == 0) {
                    j3 = -9223372036854775807L;
                } else {
                    j3 = max - max2;
                }
                this.d1 = j3;
                if (u.d1 && (i == 0 || (j4 != C10323vs.b && max == j4))) {
                    z = true;
                }
                this.e1 = z;
                return;
            }
            throw new b(0);
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            this.a1.l(0, bVar, z);
            long t = bVar.t() - this.b1;
            long j = this.d1;
            long j2 = C10323vs.b;
            if (j != C10323vs.b) {
                j2 = j - t;
            }
            return bVar.y(bVar.X, bVar.Y, 0, j2, t);
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            this.a1.v(0, dVar, 0L);
            long j2 = dVar.l1;
            long j3 = this.b1;
            dVar.l1 = j2 + j3;
            dVar.i1 = this.d1;
            dVar.d1 = this.e1;
            long j4 = dVar.h1;
            if (j4 != C10323vs.b) {
                long max = Math.max(j4, j3);
                dVar.h1 = max;
                long j5 = this.c1;
                if (j5 != C10323vs.b) {
                    max = Math.min(max, j5);
                }
                dVar.h1 = max - this.b1;
            }
            long b2 = TD2.b2(this.b1);
            long j6 = dVar.Z0;
            if (j6 != C10323vs.b) {
                dVar.Z0 = j6 + b2;
            }
            long j7 = dVar.a1;
            if (j7 != C10323vs.b) {
                dVar.a1 = j7 + b2;
            }
            return dVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends IOException {
        public static final int Y = 0;
        public static final int Y0 = 2;
        public static final int Z = 1;
        public final int X;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface a {
        }

        public b(int i) {
            super("Illegal clipping: " + a(i));
            this.X = i;
        }

        public static String a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return "unknown";
                    }
                    return "start exceeds end";
                }
                return "not seekable to start";
            }
            return "invalid period count";
        }
    }

    public KD(InterfaceC7583kh1 interfaceC7583kh1, long j, long j2) {
        this(interfaceC7583kh1, j, j2, true, false, false);
    }

    @Override // o.JN2
    public void L0(AbstractC7373jp2 abstractC7373jp2) {
        if (this.p1 != null) {
            return;
        }
        P0(abstractC7373jp2);
    }

    public final void P0(AbstractC7373jp2 abstractC7373jp2) {
        long j;
        abstractC7373jp2.u(0, this.n1);
        long j2 = this.n1.j();
        long j3 = Long.MIN_VALUE;
        if (this.o1 != null && !this.m1.isEmpty() && !this.k1) {
            j = this.q1 - j2;
            if (this.i1 != Long.MIN_VALUE) {
                j3 = this.r1 - j2;
            }
        } else {
            j = this.h1;
            long j4 = this.i1;
            if (this.l1) {
                long f = this.n1.f();
                j += f;
                j4 += f;
            }
            this.q1 = j2 + j;
            if (this.i1 != Long.MIN_VALUE) {
                j3 = j2 + j4;
            }
            this.r1 = j3;
            int size = this.m1.size();
            for (int i = 0; i < size; i++) {
                this.m1.get(i).w(this.q1, this.r1);
            }
            j3 = j4;
        }
        try {
            a aVar = new a(abstractC7373jp2, j, j3);
            this.o1 = aVar;
            p0(aVar);
        } catch (b e) {
            this.p1 = e;
            for (int i2 = 0; i2 < this.m1.size(); i2++) {
                this.m1.get(i2).u(this.p1);
            }
        }
    }

    @Override // o.TI, o.InterfaceC7583kh1
    public void Q() throws IOException {
        b bVar = this.p1;
        if (bVar == null) {
            super.Q();
            return;
        }
        throw bVar;
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        JD jd = new JD(this.f1.h(bVar, interfaceC10877y8, j), this.j1, this.q1, this.r1);
        this.m1.add(jd);
        return jd;
    }

    @Override // o.TI, o.AbstractC10541wl
    public void q0() {
        super.q0();
        this.p1 = null;
        this.o1 = null;
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        C9542sf.i(this.m1.remove(interfaceC4410Ug1));
        this.f1.s(((JD) interfaceC4410Ug1).X);
        if (this.m1.isEmpty() && !this.k1) {
            P0(((a) C9542sf.g(this.o1)).a1);
        }
    }

    public KD(InterfaceC7583kh1 interfaceC7583kh1, long j) {
        this(interfaceC7583kh1, 0L, j, true, false, true);
    }

    public KD(InterfaceC7583kh1 interfaceC7583kh1, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((InterfaceC7583kh1) C9542sf.g(interfaceC7583kh1));
        C9542sf.a(j >= 0);
        this.h1 = j;
        this.i1 = j2;
        this.j1 = z;
        this.k1 = z2;
        this.l1 = z3;
        this.m1 = new ArrayList<>();
        this.n1 = new AbstractC7373jp2.d();
    }
}
