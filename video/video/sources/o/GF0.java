package o;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import o.C10833xx0;
import o.C9337ro1;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class GF0 implements InterfaceC8545oa0 {
    public final WZ1 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public InterfaceC10568wr2 j;
    public b k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final C9088qo1 d = new C9088qo1(7, 128);
    public final C9088qo1 e = new C9088qo1(8, 128);
    public final C9088qo1 f = new C9088qo1(6, 128);
    public long m = C10323vs.b;

    /* renamed from: o  reason: collision with root package name */
    public final C3012Fy1 f467o = new C3012Fy1();

    /* loaded from: classes2.dex */
    public static final class b {
        public static final int s = 128;
        public final InterfaceC10568wr2 a;
        public final boolean b;
        public final boolean c;
        public final C3110Gy1 f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public boolean k;
        public long l;

        /* renamed from: o  reason: collision with root package name */
        public boolean f468o;
        public long p;
        public long q;
        public boolean r;
        public final SparseArray<C9337ro1.c> d = new SparseArray<>();
        public final SparseArray<C9337ro1.b> e = new SparseArray<>();
        public a m = new a();
        public a n = new a();

        /* loaded from: classes2.dex */
        public static final class a {
            public static final int q = 2;
            public static final int r = 7;
            public boolean a;
            public boolean b;
            @InterfaceC11300zs1
            public C9337ro1.c c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;

            /* renamed from: o  reason: collision with root package name */
            public int f469o;
            public int p;

            public a() {
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public final boolean c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.a) {
                    return false;
                }
                if (!aVar.a) {
                    return true;
                }
                C9337ro1.c cVar = (C9337ro1.c) C9542sf.k(this.c);
                C9337ro1.c cVar2 = (C9337ro1.c) C9542sf.k(aVar.c);
                if (this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && ((!this.i || !aVar.i || this.j == aVar.j) && (((i = this.d) == (i2 = aVar.d) || (i != 0 && i2 != 0)) && (((i3 = cVar.l) != 0 || cVar2.l != 0 || (this.m == aVar.m && this.n == aVar.n)) && ((i3 != 1 || cVar2.l != 1 || (this.f469o == aVar.f469o && this.p == aVar.p)) && (z = this.k) == aVar.k && (!z || this.l == aVar.l)))))) {
                    return false;
                }
                return true;
            }

            public boolean d() {
                if (this.b) {
                    int i = this.e;
                    if (i == 7 || i == 2) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public void e(C9337ro1.c cVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = cVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.f469o = i8;
                this.p = i9;
                this.a = true;
                this.b = true;
            }

            public void f(int i) {
                this.e = i;
                this.b = true;
            }
        }

        public b(InterfaceC10568wr2 interfaceC10568wr2, boolean z, boolean z2) {
            this.a = interfaceC10568wr2;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new C3110Gy1(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(byte[] bArr, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            if (this.k) {
                int i9 = i2 - i;
                byte[] bArr2 = this.g;
                int length = bArr2.length;
                int i10 = this.h;
                if (length < i10 + i9) {
                    this.g = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i, this.g, this.h, i9);
                int i11 = this.h + i9;
                this.h = i11;
                this.f.i(this.g, 0, i11);
                if (this.f.b(8)) {
                    this.f.k();
                    int e = this.f.e(2);
                    this.f.l(5);
                    if (this.f.c()) {
                        this.f.h();
                        if (this.f.c()) {
                            int h = this.f.h();
                            if (!this.c) {
                                this.k = false;
                                this.n.f(h);
                            } else if (this.f.c()) {
                                int h2 = this.f.h();
                                if (this.e.indexOfKey(h2) < 0) {
                                    this.k = false;
                                    return;
                                }
                                C9337ro1.b bVar = this.e.get(h2);
                                C9337ro1.c cVar = this.d.get(bVar.b);
                                if (cVar.i) {
                                    if (this.f.b(2)) {
                                        this.f.l(2);
                                    } else {
                                        return;
                                    }
                                }
                                if (this.f.b(cVar.k)) {
                                    int e2 = this.f.e(cVar.k);
                                    if (!cVar.j) {
                                        if (this.f.b(1)) {
                                            boolean d = this.f.d();
                                            if (d) {
                                                if (this.f.b(1)) {
                                                    z = d;
                                                    z2 = true;
                                                    z3 = this.f.d();
                                                    if (this.i != 5) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    if (!z4) {
                                                        if (this.f.c()) {
                                                            i3 = this.f.h();
                                                        } else {
                                                            return;
                                                        }
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    i4 = cVar.l;
                                                    if (i4 != 0) {
                                                        if (this.f.b(cVar.m)) {
                                                            int e3 = this.f.e(cVar.m);
                                                            if (bVar.c && !z) {
                                                                if (this.f.c()) {
                                                                    i6 = this.f.g();
                                                                    i5 = e3;
                                                                    i7 = 0;
                                                                    i8 = i7;
                                                                    this.n.e(cVar, e, h, e2, h2, z, z2, z3, z4, i3, i5, i6, i7, i8);
                                                                    this.k = false;
                                                                }
                                                                return;
                                                            }
                                                            i5 = e3;
                                                            i6 = 0;
                                                        } else {
                                                            return;
                                                        }
                                                    } else if (i4 == 1 && !cVar.n) {
                                                        if (this.f.c()) {
                                                            int g = this.f.g();
                                                            if (bVar.c && !z) {
                                                                if (!this.f.c()) {
                                                                    return;
                                                                }
                                                                i8 = this.f.g();
                                                                i7 = g;
                                                                i5 = 0;
                                                                i6 = 0;
                                                            } else {
                                                                i7 = g;
                                                                i5 = 0;
                                                                i6 = 0;
                                                                i8 = 0;
                                                            }
                                                            this.n.e(cVar, e, h, e2, h2, z, z2, z3, z4, i3, i5, i6, i7, i8);
                                                            this.k = false;
                                                        }
                                                        return;
                                                    } else {
                                                        i5 = 0;
                                                        i6 = 0;
                                                    }
                                                    i7 = i6;
                                                    i8 = i7;
                                                    this.n.e(cVar, e, h, e2, h2, z, z2, z3, z4, i3, i5, i6, i7, i8);
                                                    this.k = false;
                                                }
                                                return;
                                            }
                                            z = d;
                                            z2 = false;
                                        } else {
                                            return;
                                        }
                                    } else {
                                        z = false;
                                        z2 = false;
                                    }
                                    z3 = z2;
                                    if (this.i != 5) {
                                    }
                                    if (!z4) {
                                    }
                                    i4 = cVar.l;
                                    if (i4 != 0) {
                                    }
                                    i7 = i6;
                                    i8 = i7;
                                    this.n.e(cVar, e, h, e2, h2, z, z2, z3, z4, i3, i5, i6, i7, i8);
                                    this.k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (z && this.f468o) {
                    d(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.f468o = true;
            }
            if (this.b) {
                z2 = this.n.d();
            }
            boolean z4 = this.r;
            int i2 = this.i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.r = z5;
            return z5;
        }

        public boolean c() {
            return this.c;
        }

        public final void d(int i) {
            long j = this.q;
            if (j == C10323vs.b) {
                return;
            }
            boolean z = this.r;
            this.a.b(j, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        public void e(C9337ro1.b bVar) {
            this.e.append(bVar.a, bVar);
        }

        public void f(C9337ro1.c cVar) {
            this.d.append(cVar.d, cVar);
        }

        public void g() {
            this.k = false;
            this.f468o = false;
            this.n.b();
        }

        public void h(long j, int i, long j2) {
            this.i = i;
            this.l = j2;
            this.j = j;
            if (!this.b || i != 1) {
                if (this.c) {
                    if (i != 5 && i != 1 && i != 2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public GF0(WZ1 wz1, boolean z, boolean z2) {
        this.a = wz1;
        this.b = z;
        this.c = z2;
    }

    @InterfaceC8557od0({"output", "sampleReader"})
    private void f() {
        C9542sf.k(this.j);
        TD2.o(this.k);
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        int i;
        f();
        int f = c3012Fy1.f();
        int g = c3012Fy1.g();
        byte[] e = c3012Fy1.e();
        this.g += c3012Fy1.a();
        this.j.e(c3012Fy1, c3012Fy1.a());
        while (true) {
            int c = C9337ro1.c(e, f, g, this.h);
            if (c == g) {
                h(e, f, g);
                return;
            }
            int f2 = C9337ro1.f(e, c);
            int i2 = c - f;
            if (i2 > 0) {
                h(e, f, c);
            }
            int i3 = g - c;
            long j = this.g - i3;
            if (i2 < 0) {
                i = -i2;
            } else {
                i = 0;
            }
            g(j, i3, i, this.m);
            i(j, f2, this.m);
            f = c + 3;
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.g = 0L;
        this.n = false;
        this.m = C10323vs.b;
        C9337ro1.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        b bVar = this.k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.i = eVar.b();
        InterfaceC10568wr2 b2 = interfaceC4518Vj0.b(eVar.c(), 2);
        this.j = b2;
        this.k = new b(b2, this.b, this.c);
        this.a.b(interfaceC4518Vj0, eVar);
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        boolean z;
        if (j != C10323vs.b) {
            this.m = j;
        }
        boolean z2 = this.n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.n = z2 | z;
    }

    @HS1({"output", "sampleReader"})
    public final void g(long j, int i, int i2, long j2) {
        if (!this.l || this.k.c()) {
            this.d.b(i2);
            this.e.b(i2);
            if (!this.l) {
                if (this.d.c() && this.e.c()) {
                    ArrayList arrayList = new ArrayList();
                    C9088qo1 c9088qo1 = this.d;
                    arrayList.add(Arrays.copyOf(c9088qo1.d, c9088qo1.e));
                    C9088qo1 c9088qo12 = this.e;
                    arrayList.add(Arrays.copyOf(c9088qo12.d, c9088qo12.e));
                    C9088qo1 c9088qo13 = this.d;
                    C9337ro1.c l = C9337ro1.l(c9088qo13.d, 3, c9088qo13.e);
                    C9088qo1 c9088qo14 = this.e;
                    C9337ro1.b j3 = C9337ro1.j(c9088qo14.d, 3, c9088qo14.e);
                    this.j.a(new C10833xx0.b().U(this.i).g0("video/avc").K(JE.a(l.a, l.b, l.c)).n0(l.f).S(l.g).c0(l.h).V(arrayList).G());
                    this.l = true;
                    this.k.f(l);
                    this.k.e(j3);
                    this.d.d();
                    this.e.d();
                }
            } else if (this.d.c()) {
                C9088qo1 c9088qo15 = this.d;
                this.k.f(C9337ro1.l(c9088qo15.d, 3, c9088qo15.e));
                this.d.d();
            } else if (this.e.c()) {
                C9088qo1 c9088qo16 = this.e;
                this.k.e(C9337ro1.j(c9088qo16.d, 3, c9088qo16.e));
                this.e.d();
            }
        }
        if (this.f.b(i2)) {
            C9088qo1 c9088qo17 = this.f;
            this.f467o.W(this.f.d, C9337ro1.q(c9088qo17.d, c9088qo17.e));
            this.f467o.Y(4);
            this.a.a(j2, this.f467o);
        }
        if (this.k.b(j, i, this.l, this.n)) {
            this.n = false;
        }
    }

    @HS1({"sampleReader"})
    public final void h(byte[] bArr, int i, int i2) {
        if (!this.l || this.k.c()) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @HS1({"sampleReader"})
    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c()) {
            this.d.e(i);
            this.e.e(i);
        }
        this.f.e(i);
        this.k.h(j, i, j2);
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
