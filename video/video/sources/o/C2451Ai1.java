package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import o.InterfaceC4410Ug1;

@Deprecated
/* renamed from: o.Ai1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2451Ai1 implements InterfaceC4410Ug1, InterfaceC4410Ug1.a {
    public final InterfaceC4410Ug1[] X;
    public final VI Z;
    @InterfaceC11300zs1
    public InterfaceC4410Ug1.a a1;
    @InterfaceC11300zs1
    public C10079ur2 b1;
    public G02 d1;
    public final ArrayList<InterfaceC4410Ug1> Y0 = new ArrayList<>();
    public final HashMap<C9593sr2, C9593sr2> Z0 = new HashMap<>();
    public final IdentityHashMap<IX1, Integer> Y = new IdentityHashMap<>();
    public InterfaceC4410Ug1[] c1 = new InterfaceC4410Ug1[0];

    /* renamed from: o.Ai1$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC6859hi0 {
        public final InterfaceC6859hi0 c;
        public final C9593sr2 d;

        public a(InterfaceC6859hi0 interfaceC6859hi0, C9593sr2 c9593sr2) {
            this.c = interfaceC6859hi0;
            this.d = c9593sr2;
        }

        @Override // o.InterfaceC11054yr2
        public C10833xx0 a(int i) {
            return this.c.a(i);
        }

        @Override // o.InterfaceC6859hi0
        public void b() {
            this.c.b();
        }

        @Override // o.InterfaceC6859hi0
        public long c() {
            return this.c.c();
        }

        @Override // o.InterfaceC6859hi0
        public boolean d(int i, long j) {
            return this.c.d(i, j);
        }

        @Override // o.InterfaceC6859hi0
        public boolean e(long j, AbstractC6238fC abstractC6238fC, List<? extends AbstractC2533Be1> list) {
            return this.c.e(j, abstractC6238fC, list);
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.c.equals(aVar.c) && this.d.equals(aVar.d)) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC6859hi0
        public int f() {
            return this.c.f();
        }

        @Override // o.InterfaceC11054yr2
        public int g(int i) {
            return this.c.g(i);
        }

        @Override // o.InterfaceC11054yr2
        public int getType() {
            return this.c.getType();
        }

        @Override // o.InterfaceC6859hi0
        public boolean h(int i, long j) {
            return this.c.h(i, j);
        }

        public int hashCode() {
            return ((527 + this.d.hashCode()) * 31) + this.c.hashCode();
        }

        @Override // o.InterfaceC6859hi0
        public void i(float f) {
            this.c.i(f);
        }

        @Override // o.InterfaceC6859hi0
        @InterfaceC11300zs1
        public Object j() {
            return this.c.j();
        }

        @Override // o.InterfaceC6859hi0
        public void k() {
            this.c.k();
        }

        @Override // o.InterfaceC6859hi0
        public void l(long j, long j2, long j3, List<? extends AbstractC2533Be1> list, InterfaceC2631Ce1[] interfaceC2631Ce1Arr) {
            this.c.l(j, j2, j3, list, interfaceC2631Ce1Arr);
        }

        @Override // o.InterfaceC11054yr2
        public int length() {
            return this.c.length();
        }

        @Override // o.InterfaceC11054yr2
        public int m(int i) {
            return this.c.m(i);
        }

        @Override // o.InterfaceC11054yr2
        public C9593sr2 n() {
            return this.d;
        }

        @Override // o.InterfaceC11054yr2
        public int o(C10833xx0 c10833xx0) {
            return this.c.o(c10833xx0);
        }

        @Override // o.InterfaceC6859hi0
        public void p(boolean z) {
            this.c.p(z);
        }

        @Override // o.InterfaceC6859hi0
        public void q() {
            this.c.q();
        }

        @Override // o.InterfaceC6859hi0
        public int r(long j, List<? extends AbstractC2533Be1> list) {
            return this.c.r(j, list);
        }

        @Override // o.InterfaceC6859hi0
        public int s() {
            return this.c.s();
        }

        @Override // o.InterfaceC6859hi0
        public C10833xx0 t() {
            return this.c.t();
        }

        @Override // o.InterfaceC6859hi0
        public int u() {
            return this.c.u();
        }

        @Override // o.InterfaceC6859hi0
        public void v() {
            this.c.v();
        }
    }

    /* renamed from: o.Ai1$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC4410Ug1, InterfaceC4410Ug1.a {
        public final InterfaceC4410Ug1 X;
        public final long Y;
        public InterfaceC4410Ug1.a Z;

        public b(InterfaceC4410Ug1 interfaceC4410Ug1, long j) {
            this.X = interfaceC4410Ug1;
            this.Y = j;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public boolean a() {
            return this.X.a();
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public long c() {
            long c = this.X.c();
            if (c == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return c + this.Y;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public boolean d(long j) {
            return this.X.d(j - this.Y);
        }

        @Override // o.InterfaceC4410Ug1
        public long e(long j, LZ1 lz1) {
            return this.X.e(j - this.Y, lz1) + this.Y;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public long f() {
            long f = this.X.f();
            if (f == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return f + this.Y;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public void g(long j) {
            this.X.g(j - this.Y);
        }

        @Override // o.InterfaceC4410Ug1
        public List<C3031Gd2> h(List<InterfaceC6859hi0> list) {
            return this.X.h(list);
        }

        @Override // o.InterfaceC4410Ug1
        public long i(long j) {
            return this.X.i(j - this.Y) + this.Y;
        }

        @Override // o.InterfaceC4410Ug1.a
        public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
            ((InterfaceC4410Ug1.a) C9542sf.g(this.Z)).j(this);
        }

        @Override // o.InterfaceC4410Ug1
        public long k() {
            long k = this.X.k();
            if (k == C10323vs.b) {
                return C10323vs.b;
            }
            return k + this.Y;
        }

        @Override // o.InterfaceC4410Ug1
        public void m() throws IOException {
            this.X.m();
        }

        @Override // o.InterfaceC4410Ug1
        public void o(InterfaceC4410Ug1.a aVar, long j) {
            this.Z = aVar;
            this.X.o(this, j - this.Y);
        }

        @Override // o.G02.a
        /* renamed from: p */
        public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
            ((InterfaceC4410Ug1.a) C9542sf.g(this.Z)).l(this);
        }

        @Override // o.InterfaceC4410Ug1
        public C10079ur2 q() {
            return this.X.q();
        }

        @Override // o.InterfaceC4410Ug1
        public void r(long j, boolean z) {
            this.X.r(j - this.Y, z);
        }

        @Override // o.InterfaceC4410Ug1
        public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
            IX1[] ix1Arr2 = new IX1[ix1Arr.length];
            int i = 0;
            while (true) {
                IX1 ix1 = null;
                if (i >= ix1Arr.length) {
                    break;
                }
                c cVar = (c) ix1Arr[i];
                if (cVar != null) {
                    ix1 = cVar.a();
                }
                ix1Arr2[i] = ix1;
                i++;
            }
            long s = this.X.s(interfaceC6859hi0Arr, zArr, ix1Arr2, zArr2, j - this.Y);
            for (int i2 = 0; i2 < ix1Arr.length; i2++) {
                IX1 ix12 = ix1Arr2[i2];
                if (ix12 == null) {
                    ix1Arr[i2] = null;
                } else {
                    IX1 ix13 = ix1Arr[i2];
                    if (ix13 == null || ((c) ix13).a() != ix12) {
                        ix1Arr[i2] = new c(ix12, this.Y);
                    }
                }
            }
            return s + this.Y;
        }
    }

    /* renamed from: o.Ai1$c */
    /* loaded from: classes2.dex */
    public static final class c implements IX1 {
        public final IX1 X;
        public final long Y;

        public c(IX1 ix1, long j) {
            this.X = ix1;
            this.Y = j;
        }

        public IX1 a() {
            return this.X;
        }

        @Override // o.IX1
        public void b() throws IOException {
            this.X.b();
        }

        @Override // o.IX1
        public boolean isReady() {
            return this.X.isReady();
        }

        @Override // o.IX1
        public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            int j = this.X.j(c2899Ex0, c9267rW, i);
            if (j == -4) {
                c9267rW.a1 = Math.max(0L, c9267rW.a1 + this.Y);
            }
            return j;
        }

        @Override // o.IX1
        public int n(long j) {
            return this.X.n(j - this.Y);
        }
    }

    public C2451Ai1(VI vi, long[] jArr, InterfaceC4410Ug1... interfaceC4410Ug1Arr) {
        this.Z = vi;
        this.X = interfaceC4410Ug1Arr;
        this.d1 = vi.a(new G02[0]);
        for (int i = 0; i < interfaceC4410Ug1Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.X[i] = new b(interfaceC4410Ug1Arr[i], j);
            }
        }
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        return this.d1.a();
    }

    public InterfaceC4410Ug1 b(int i) {
        InterfaceC4410Ug1 interfaceC4410Ug1 = this.X[i];
        if (interfaceC4410Ug1 instanceof b) {
            return ((b) interfaceC4410Ug1).X;
        }
        return interfaceC4410Ug1;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        return this.d1.c();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        if (!this.Y0.isEmpty()) {
            int size = this.Y0.size();
            for (int i = 0; i < size; i++) {
                this.Y0.get(i).d(j);
            }
            return false;
        }
        return this.d1.d(j);
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        InterfaceC4410Ug1 interfaceC4410Ug1;
        InterfaceC4410Ug1[] interfaceC4410Ug1Arr = this.c1;
        if (interfaceC4410Ug1Arr.length > 0) {
            interfaceC4410Ug1 = interfaceC4410Ug1Arr[0];
        } else {
            interfaceC4410Ug1 = this.X[0];
        }
        return interfaceC4410Ug1.e(j, lz1);
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        return this.d1.f();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
        this.d1.g(j);
    }

    @Override // o.InterfaceC4410Ug1
    public long i(long j) {
        long i = this.c1[0].i(j);
        int i2 = 1;
        while (true) {
            InterfaceC4410Ug1[] interfaceC4410Ug1Arr = this.c1;
            if (i2 < interfaceC4410Ug1Arr.length) {
                if (interfaceC4410Ug1Arr[i2].i(i) == i) {
                    i2++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return i;
            }
        }
    }

    @Override // o.InterfaceC4410Ug1.a
    public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
        this.Y0.remove(interfaceC4410Ug1);
        if (!this.Y0.isEmpty()) {
            return;
        }
        int i = 0;
        for (InterfaceC4410Ug1 interfaceC4410Ug12 : this.X) {
            i += interfaceC4410Ug12.q().X;
        }
        C9593sr2[] c9593sr2Arr = new C9593sr2[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            InterfaceC4410Ug1[] interfaceC4410Ug1Arr = this.X;
            if (i2 < interfaceC4410Ug1Arr.length) {
                C10079ur2 q = interfaceC4410Ug1Arr[i2].q();
                int i4 = q.X;
                int i5 = 0;
                while (i5 < i4) {
                    C9593sr2 b2 = q.b(i5);
                    C9593sr2 b3 = b2.b(i2 + ":" + b2.Y);
                    this.Z0.put(b3, b2);
                    c9593sr2Arr[i3] = b3;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.b1 = new C10079ur2(c9593sr2Arr);
                ((InterfaceC4410Ug1.a) C9542sf.g(this.a1)).j(this);
                return;
            }
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        InterfaceC4410Ug1[] interfaceC4410Ug1Arr;
        InterfaceC4410Ug1[] interfaceC4410Ug1Arr2;
        long j = -9223372036854775807L;
        for (InterfaceC4410Ug1 interfaceC4410Ug1 : this.c1) {
            long k = interfaceC4410Ug1.k();
            if (k != C10323vs.b) {
                if (j == C10323vs.b) {
                    for (InterfaceC4410Ug1 interfaceC4410Ug12 : this.c1) {
                        if (interfaceC4410Ug12 == interfaceC4410Ug1) {
                            break;
                        } else if (interfaceC4410Ug12.i(k) != k) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = k;
                } else if (k != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != C10323vs.b && interfaceC4410Ug1.i(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // o.InterfaceC4410Ug1
    public void m() throws IOException {
        for (InterfaceC4410Ug1 interfaceC4410Ug1 : this.X) {
            interfaceC4410Ug1.m();
        }
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        this.a1 = aVar;
        Collections.addAll(this.Y0, this.X);
        for (InterfaceC4410Ug1 interfaceC4410Ug1 : this.X) {
            interfaceC4410Ug1.o(this, j);
        }
    }

    @Override // o.G02.a
    /* renamed from: p */
    public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((InterfaceC4410Ug1.a) C9542sf.g(this.a1)).l(this);
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        return (C10079ur2) C9542sf.g(this.b1);
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
        for (InterfaceC4410Ug1 interfaceC4410Ug1 : this.c1) {
            interfaceC4410Ug1.r(j, z);
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        boolean z;
        IX1 ix1;
        Integer num;
        int intValue;
        int[] iArr = new int[interfaceC6859hi0Arr.length];
        int[] iArr2 = new int[interfaceC6859hi0Arr.length];
        int i = 0;
        for (int i2 = 0; i2 < interfaceC6859hi0Arr.length; i2++) {
            IX1 ix12 = ix1Arr[i2];
            if (ix12 == null) {
                num = null;
            } else {
                num = this.Y.get(ix12);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i2] = intValue;
            InterfaceC6859hi0 interfaceC6859hi0 = interfaceC6859hi0Arr[i2];
            if (interfaceC6859hi0 != null) {
                String str = interfaceC6859hi0.n().Y;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
        }
        this.Y.clear();
        int length = interfaceC6859hi0Arr.length;
        IX1[] ix1Arr2 = new IX1[length];
        IX1[] ix1Arr3 = new IX1[interfaceC6859hi0Arr.length];
        InterfaceC6859hi0[] interfaceC6859hi0Arr2 = new InterfaceC6859hi0[interfaceC6859hi0Arr.length];
        ArrayList arrayList = new ArrayList(this.X.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.X.length) {
            for (int i4 = i; i4 < interfaceC6859hi0Arr.length; i4++) {
                if (iArr[i4] == i3) {
                    ix1 = ix1Arr[i4];
                } else {
                    ix1 = null;
                }
                ix1Arr3[i4] = ix1;
                if (iArr2[i4] == i3) {
                    InterfaceC6859hi0 interfaceC6859hi02 = (InterfaceC6859hi0) C9542sf.g(interfaceC6859hi0Arr[i4]);
                    interfaceC6859hi0Arr2[i4] = new a(interfaceC6859hi02, (C9593sr2) C9542sf.g(this.Z0.get(interfaceC6859hi02.n())));
                } else {
                    interfaceC6859hi0Arr2[i4] = null;
                }
            }
            int i5 = i3;
            long s = this.X[i3].s(interfaceC6859hi0Arr2, zArr, ix1Arr3, zArr2, j2);
            if (i5 == 0) {
                j2 = s;
            } else if (s != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i6 = 0; i6 < interfaceC6859hi0Arr.length; i6++) {
                if (iArr2[i6] == i5) {
                    ix1Arr2[i6] = ix1Arr3[i6];
                    this.Y.put((IX1) C9542sf.g(ix1Arr3[i6]), Integer.valueOf(i5));
                    z2 = true;
                } else if (iArr[i6] == i5) {
                    if (ix1Arr3[i6] == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C9542sf.i(z);
                }
            }
            if (z2) {
                arrayList.add(this.X[i5]);
            }
            i3 = i5 + 1;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(ix1Arr2, i7, ix1Arr, i7, length);
        InterfaceC4410Ug1[] interfaceC4410Ug1Arr = (InterfaceC4410Ug1[]) arrayList.toArray(new InterfaceC4410Ug1[i7]);
        this.c1 = interfaceC4410Ug1Arr;
        this.d1 = this.Z.a(interfaceC4410Ug1Arr);
        return j2;
    }
}
