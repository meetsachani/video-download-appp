package o;

import java.io.IOException;
import o.InterfaceC4410Ug1;
import o.KD;

@Deprecated
/* loaded from: classes2.dex */
public final class JD implements InterfaceC4410Ug1, InterfaceC4410Ug1.a {
    public final InterfaceC4410Ug1 X;
    @InterfaceC11300zs1
    public InterfaceC4410Ug1.a Y;
    public long Y0;
    public a[] Z = new a[0];
    public long Z0;
    public long a1;
    @InterfaceC11300zs1
    public KD.b b1;

    /* loaded from: classes2.dex */
    public final class a implements IX1 {
        public final IX1 X;
        public boolean Y;

        public a(IX1 ix1) {
            this.X = ix1;
        }

        public void a() {
            this.Y = false;
        }

        @Override // o.IX1
        public void b() throws IOException {
            this.X.b();
        }

        @Override // o.IX1
        public boolean isReady() {
            if (!JD.this.p() && this.X.isReady()) {
                return true;
            }
            return false;
        }

        @Override // o.IX1
        public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            if (JD.this.p()) {
                return -3;
            }
            if (this.Y) {
                c9267rW.u(4);
                return -4;
            }
            long f = JD.this.f();
            int j = this.X.j(c2899Ex0, c9267rW, i);
            if (j == -5) {
                C10833xx0 c10833xx0 = (C10833xx0) C9542sf.g(c2899Ex0.b);
                int i2 = c10833xx0.w1;
                if (i2 != 0 || c10833xx0.x1 != 0) {
                    JD jd = JD.this;
                    int i3 = 0;
                    if (jd.Z0 != 0) {
                        i2 = 0;
                    }
                    if (jd.a1 == Long.MIN_VALUE) {
                        i3 = c10833xx0.x1;
                    }
                    c2899Ex0.b = c10833xx0.b().P(i2).Q(i3).G();
                }
                return -5;
            }
            long j2 = JD.this.a1;
            if (j2 != Long.MIN_VALUE && ((j == -4 && c9267rW.a1 >= j2) || (j == -3 && f == Long.MIN_VALUE && !c9267rW.Z0))) {
                c9267rW.l();
                c9267rW.u(4);
                this.Y = true;
                return -4;
            }
            return j;
        }

        @Override // o.IX1
        public int n(long j) {
            if (JD.this.p()) {
                return -3;
            }
            return this.X.n(j);
        }
    }

    public JD(InterfaceC4410Ug1 interfaceC4410Ug1, boolean z, long j, long j2) {
        long j3;
        this.X = interfaceC4410Ug1;
        if (z) {
            j3 = j;
        } else {
            j3 = C10323vs.b;
        }
        this.Y0 = j3;
        this.Z0 = j;
        this.a1 = j2;
    }

    public static boolean v(long j, InterfaceC6859hi0[] interfaceC6859hi0Arr) {
        if (j != 0) {
            for (InterfaceC6859hi0 interfaceC6859hi0 : interfaceC6859hi0Arr) {
                if (interfaceC6859hi0 != null) {
                    C10833xx0 t = interfaceC6859hi0.t();
                    if (!C4128Rj1.a(t.g1, t.d1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        return this.X.a();
    }

    public final LZ1 b(long j, LZ1 lz1) {
        long j2;
        long x = TD2.x(lz1.a, 0L, j - this.Z0);
        long j3 = lz1.b;
        long j4 = this.a1;
        if (j4 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j4 - j;
        }
        long x2 = TD2.x(j3, 0L, j2);
        if (x == lz1.a && x2 == lz1.b) {
            return lz1;
        }
        return new LZ1(x, x2);
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        long c = this.X.c();
        if (c != Long.MIN_VALUE) {
            long j = this.a1;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        return this.X.d(j);
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        long j2 = this.Z0;
        if (j == j2) {
            return j2;
        }
        return this.X.e(j, b(j, lz1));
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        long f = this.X.f();
        if (f != Long.MIN_VALUE) {
            long j = this.a1;
            if (j == Long.MIN_VALUE || f < j) {
                return f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
        this.X.g(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // o.InterfaceC4410Ug1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i(long j) {
        a[] aVarArr;
        this.Y0 = C10323vs.b;
        boolean z = false;
        for (a aVar : this.Z) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long i = this.X.i(j);
        if (i != j) {
            if (i >= this.Z0) {
                long j2 = this.a1;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            C9542sf.i(z);
            return i;
        }
        z = true;
        C9542sf.i(z);
        return i;
    }

    @Override // o.InterfaceC4410Ug1.a
    public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
        if (this.b1 != null) {
            return;
        }
        ((InterfaceC4410Ug1.a) C9542sf.g(this.Y)).j(this);
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        boolean z;
        if (p()) {
            long j = this.Y0;
            this.Y0 = C10323vs.b;
            long k = k();
            if (k != C10323vs.b) {
                return k;
            }
            return j;
        }
        long k2 = this.X.k();
        if (k2 == C10323vs.b) {
            return C10323vs.b;
        }
        boolean z2 = false;
        if (k2 >= this.Z0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        long j2 = this.a1;
        if (j2 == Long.MIN_VALUE || k2 <= j2) {
            z2 = true;
        }
        C9542sf.i(z2);
        return k2;
    }

    @Override // o.InterfaceC4410Ug1
    public void m() throws IOException {
        KD.b bVar = this.b1;
        if (bVar == null) {
            this.X.m();
            return;
        }
        throw bVar;
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        this.Y = aVar;
        this.X.o(this, j);
    }

    public boolean p() {
        if (this.Y0 != C10323vs.b) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        return this.X.q();
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
        this.X.r(j, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r10 > r13) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    @Override // o.InterfaceC4410Ug1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.Z = new a[ix1Arr.length];
        IX1[] ix1Arr2 = new IX1[ix1Arr.length];
        int i = 0;
        while (true) {
            IX1 ix1 = null;
            if (i >= ix1Arr.length) {
                break;
            }
            a[] aVarArr = this.Z;
            a aVar = (a) ix1Arr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                ix1 = aVar.X;
            }
            ix1Arr2[i] = ix1;
            i++;
        }
        long s = this.X.s(interfaceC6859hi0Arr, zArr, ix1Arr2, zArr2, j);
        if (p()) {
            long j3 = this.Z0;
            if (j == j3 && v(j3, interfaceC6859hi0Arr)) {
                j2 = s;
                this.Y0 = j2;
                if (s != j) {
                    if (s >= this.Z0) {
                        long j4 = this.a1;
                        if (j4 != Long.MIN_VALUE) {
                        }
                    }
                    z = false;
                    C9542sf.i(z);
                    for (int i2 = 0; i2 < ix1Arr.length; i2++) {
                        IX1 ix12 = ix1Arr2[i2];
                        if (ix12 == null) {
                            this.Z[i2] = null;
                        } else {
                            a[] aVarArr2 = this.Z;
                            a aVar2 = aVarArr2[i2];
                            if (aVar2 == null || aVar2.X != ix12) {
                                aVarArr2[i2] = new a(ix12);
                            }
                        }
                        ix1Arr[i2] = this.Z[i2];
                    }
                    return s;
                }
                z = true;
                C9542sf.i(z);
                while (i2 < ix1Arr.length) {
                }
                return s;
            }
        }
        j2 = C10323vs.b;
        this.Y0 = j2;
        if (s != j) {
        }
        z = true;
        C9542sf.i(z);
        while (i2 < ix1Arr.length) {
        }
        return s;
    }

    @Override // o.G02.a
    /* renamed from: t */
    public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((InterfaceC4410Ug1.a) C9542sf.g(this.Y)).l(this);
    }

    public void u(KD.b bVar) {
        this.b1 = bVar;
    }

    public void w(long j, long j2) {
        this.Z0 = j;
        this.a1 = j2;
    }
}
