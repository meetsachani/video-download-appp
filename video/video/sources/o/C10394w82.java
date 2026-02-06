package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import o.FU;
import o.InterfaceC4410Ug1;
import o.InterfaceC9309rh1;
import o.M11;
import o.R11;

@Deprecated
/* renamed from: o.w82  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10394w82 implements InterfaceC4410Ug1, R11.b<c> {
    public static final String j1 = "SingleSampleMediaPeriod";
    public static final int k1 = 1024;
    public final OU X;
    public final FU.a Y;
    public final M11 Y0;
    @InterfaceC11300zs1
    public final InterfaceC4261Sr2 Z;
    public final InterfaceC9309rh1.a Z0;
    public final C10079ur2 a1;
    public final long c1;
    public final C10833xx0 e1;
    public final boolean f1;
    public boolean g1;
    public byte[] h1;
    public int i1;
    public final ArrayList<b> b1 = new ArrayList<>();
    public final R11 d1 = new R11(j1);

    /* renamed from: o.w82$b */
    /* loaded from: classes2.dex */
    public final class b implements IX1 {
        public static final int Y0 = 0;
        public static final int Z0 = 1;
        public static final int a1 = 2;
        public int X;
        public boolean Y;

        public b() {
        }

        public final void a() {
            if (!this.Y) {
                C10394w82.this.Z0.h(C4128Rj1.l(C10394w82.this.e1.g1), C10394w82.this.e1, 0, null, 0L);
                this.Y = true;
            }
        }

        @Override // o.IX1
        public void b() throws IOException {
            C10394w82 c10394w82 = C10394w82.this;
            if (!c10394w82.f1) {
                c10394w82.d1.b();
            }
        }

        public void c() {
            if (this.X == 2) {
                this.X = 1;
            }
        }

        @Override // o.IX1
        public boolean isReady() {
            return C10394w82.this.g1;
        }

        @Override // o.IX1
        public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            a();
            C10394w82 c10394w82 = C10394w82.this;
            boolean z = c10394w82.g1;
            if (z && c10394w82.h1 == null) {
                this.X = 2;
            }
            int i2 = this.X;
            if (i2 == 2) {
                c9267rW.j(4);
                return -4;
            } else if ((i & 2) == 0 && i2 != 0) {
                if (!z) {
                    return -3;
                }
                C9542sf.g(c10394w82.h1);
                c9267rW.j(1);
                c9267rW.a1 = 0L;
                if ((i & 4) == 0) {
                    c9267rW.w(C10394w82.this.i1);
                    ByteBuffer byteBuffer = c9267rW.Y0;
                    C10394w82 c10394w822 = C10394w82.this;
                    byteBuffer.put(c10394w822.h1, 0, c10394w822.i1);
                }
                if ((i & 1) == 0) {
                    this.X = 2;
                }
                return -4;
            } else {
                c2899Ex0.b = c10394w82.e1;
                this.X = 1;
                return -5;
            }
        }

        @Override // o.IX1
        public int n(long j) {
            a();
            if (j > 0 && this.X != 2) {
                this.X = 2;
                return 1;
            }
            return 0;
        }
    }

    public C10394w82(OU ou, FU.a aVar, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, C10833xx0 c10833xx0, long j, M11 m11, InterfaceC9309rh1.a aVar2, boolean z) {
        this.X = ou;
        this.Y = aVar;
        this.Z = interfaceC4261Sr2;
        this.e1 = c10833xx0;
        this.c1 = j;
        this.Y0 = m11;
        this.Z0 = aVar2;
        this.f1 = z;
        this.a1 = new C10079ur2(new C9593sr2(c10833xx0));
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        return this.d1.k();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        if (!this.g1 && !this.d1.k()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        if (!this.g1 && !this.d1.k() && !this.d1.j()) {
            FU a2 = this.Y.a();
            InterfaceC4261Sr2 interfaceC4261Sr2 = this.Z;
            if (interfaceC4261Sr2 != null) {
                a2.s(interfaceC4261Sr2);
            }
            c cVar = new c(this.X, a2);
            this.Z0.t(new N11(cVar.a, this.X, this.d1.n(cVar, this, this.Y0.a(1))), 1, -1, this.e1, 0, null, 0L, this.c1);
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        if (this.g1) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // o.InterfaceC4410Ug1
    public long i(long j) {
        for (int i = 0; i < this.b1.size(); i++) {
            this.b1.get(i).c();
        }
        return j;
    }

    @Override // o.R11.b
    /* renamed from: j */
    public void M(c cVar, long j, long j2, boolean z) {
        C4004Qc2 c4004Qc2 = cVar.c;
        N11 n11 = new N11(cVar.a, cVar.b, c4004Qc2.y(), c4004Qc2.z(), j, j2, c4004Qc2.m());
        this.Y0.c(cVar.a);
        this.Z0.k(n11, 1, -1, null, 0, null, 0L, this.c1);
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        return C10323vs.b;
    }

    @Override // o.R11.b
    /* renamed from: l */
    public void t(c cVar, long j, long j2) {
        this.i1 = (int) cVar.c.m();
        this.h1 = (byte[]) C9542sf.g(cVar.d);
        this.g1 = true;
        C4004Qc2 c4004Qc2 = cVar.c;
        N11 n11 = new N11(cVar.a, cVar.b, c4004Qc2.y(), c4004Qc2.z(), j, j2, this.i1);
        this.Y0.c(cVar.a);
        this.Z0.n(n11, 1, -1, this.e1, 0, null, 0L, this.c1);
    }

    @Override // o.R11.b
    /* renamed from: n */
    public R11.c N(c cVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        R11.c cVar2;
        C4004Qc2 c4004Qc2 = cVar.c;
        N11 n11 = new N11(cVar.a, cVar.b, c4004Qc2.y(), c4004Qc2.z(), j, j2, c4004Qc2.m());
        long d = this.Y0.d(new M11.d(n11, new C10519wf1(1, -1, this.e1, 0, null, 0L, TD2.b2(this.c1)), iOException, i));
        int i2 = (d > C10323vs.b ? 1 : (d == C10323vs.b ? 0 : -1));
        if (i2 != 0 && i < this.Y0.a(1)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f1 && z) {
            I31.o(j1, "Loading failed, treating as end-of-stream.", iOException);
            this.g1 = true;
            cVar2 = R11.k;
        } else if (i2 != 0) {
            cVar2 = R11.i(false, d);
        } else {
            cVar2 = R11.l;
        }
        R11.c cVar3 = cVar2;
        boolean c2 = cVar3.c();
        this.Z0.p(n11, 1, -1, this.e1, 0, null, 0L, this.c1, iOException, !c2);
        if (!c2) {
            this.Y0.c(cVar.a);
        }
        return cVar3;
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        aVar.j(this);
    }

    public void p() {
        this.d1.l();
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        return this.a1;
    }

    @Override // o.InterfaceC4410Ug1
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
            IX1 ix1 = ix1Arr[i];
            if (ix1 != null && (interfaceC6859hi0Arr[i] == null || !zArr[i])) {
                this.b1.remove(ix1);
                ix1Arr[i] = null;
            }
            if (ix1Arr[i] == null && interfaceC6859hi0Arr[i] != null) {
                b bVar = new b();
                this.b1.add(bVar);
                ix1Arr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    /* renamed from: o.w82$c */
    /* loaded from: classes2.dex */
    public static final class c implements R11.e {
        public final long a = N11.a();
        public final OU b;
        public final C4004Qc2 c;
        @InterfaceC11300zs1
        public byte[] d;

        public c(OU ou, FU fu) {
            this.b = ou;
            this.c = new C4004Qc2(fu);
        }

        @Override // o.R11.e
        public void a() throws IOException {
            this.c.A();
            try {
                this.c.a(this.b);
                int i = 0;
                while (i != -1) {
                    int m = (int) this.c.m();
                    byte[] bArr = this.d;
                    if (bArr == null) {
                        this.d = new byte[1024];
                    } else if (m == bArr.length) {
                        this.d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C4004Qc2 c4004Qc2 = this.c;
                    byte[] bArr2 = this.d;
                    i = c4004Qc2.read(bArr2, m, bArr2.length - m);
                }
                NU.a(this.c);
            } catch (Throwable th) {
                NU.a(this.c);
                throw th;
            }
        }

        @Override // o.R11.e
        public void c() {
        }
    }

    @Override // o.InterfaceC4410Ug1
    public void m() {
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        return j;
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
    }
}
