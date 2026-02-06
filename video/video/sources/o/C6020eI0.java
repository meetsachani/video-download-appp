package o;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.AbstractC5317bO0;
import o.C10833xx0;
import o.C4224Si1;
import o.C6020eI0;
import o.G02;
import o.GX1;
import o.InterfaceC10186vI0;
import o.InterfaceC10568wr2;
import o.InterfaceC8921q70;
import o.InterfaceC9309rh1;
import o.M11;
import o.MH0;
import o.R11;

@Deprecated
/* renamed from: o.eI0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6020eI0 implements R11.b<AbstractC6238fC>, R11.f, G02, InterfaceC4518Vj0, GX1.d {
    public static final String T1 = "HlsSampleStreamWrapper";
    public static final int U1 = -1;
    public static final int V1 = -2;
    public static final int W1 = -3;
    public static final Set<Integer> X1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public C10833xx0 A1;
    @InterfaceC11300zs1
    public C10833xx0 B1;
    public boolean C1;
    public C10079ur2 D1;
    public Set<C9593sr2> E1;
    public int[] F1;
    public int G1;
    public boolean H1;
    public boolean[] I1;
    public boolean[] J1;
    public long K1;
    public long L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public boolean P1;
    public long Q1;
    @InterfaceC11300zs1
    public C6960i70 R1;
    @InterfaceC11300zs1
    public RH0 S1;
    public final String X;
    public final int Y;
    public final MH0 Y0;
    public final b Z;
    public final InterfaceC10877y8 Z0;
    @InterfaceC11300zs1
    public final C10833xx0 a1;
    public final InterfaceC9170r70 b1;
    public final InterfaceC8921q70.a c1;
    public final M11 d1;
    public final InterfaceC9309rh1.a f1;
    public final int g1;
    public final ArrayList<RH0> i1;
    public final List<RH0> j1;
    public final Runnable k1;
    public final Runnable l1;
    public final Handler m1;
    public final ArrayList<C5050aI0> n1;
    public final Map<String, C6960i70> o1;
    @InterfaceC11300zs1
    public AbstractC6238fC p1;
    public d[] q1;
    public Set<Integer> s1;
    public SparseIntArray t1;
    public InterfaceC10568wr2 u1;
    public int v1;
    public int w1;
    public boolean x1;
    public boolean y1;
    public int z1;
    public final R11 e1 = new R11("Loader:HlsSampleStreamWrapper");
    public final MH0.b h1 = new MH0.b();
    public int[] r1 = new int[0];

    /* renamed from: o.eI0$b */
    /* loaded from: classes2.dex */
    public interface b extends G02.a<C6020eI0> {
        void n(Uri uri);

        void onPrepared();
    }

    /* renamed from: o.eI0$c */
    /* loaded from: classes2.dex */
    public static class c implements InterfaceC10568wr2 {
        public static final C10833xx0 j = new C10833xx0.b().g0(C4128Rj1.w0).G();
        public static final C10833xx0 k = new C10833xx0.b().g0(C4128Rj1.J0).G();
        public final C3913Pe0 d = new C3913Pe0();
        public final InterfaceC10568wr2 e;
        public final C10833xx0 f;
        public C10833xx0 g;
        public byte[] h;
        public int i;

        public c(InterfaceC10568wr2 interfaceC10568wr2, int i) {
            this.e = interfaceC10568wr2;
            if (i != 1) {
                if (i == 3) {
                    this.f = k;
                } else {
                    throw new IllegalArgumentException("Unknown metadataType: " + i);
                }
            } else {
                this.f = j;
            }
            this.h = new byte[0];
            this.i = 0;
        }

        @Override // o.InterfaceC10568wr2
        public void a(C10833xx0 c10833xx0) {
            this.g = c10833xx0;
            this.e.a(this.f);
        }

        @Override // o.InterfaceC10568wr2
        public void b(long j2, int i, int i2, int i3, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
            C9542sf.g(this.g);
            C3012Fy1 i4 = i(i2, i3);
            if (!TD2.g(this.g.g1, this.f.g1)) {
                if (C4128Rj1.J0.equals(this.g.g1)) {
                    C3816Oe0 c = this.d.c(i4);
                    if (!g(c)) {
                        I31.n(C6020eI0.T1, String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f.g1, c.j()));
                        return;
                    }
                    i4 = new C3012Fy1((byte[]) C9542sf.g(c.y0()));
                } else {
                    I31.n(C6020eI0.T1, "Ignoring sample for unsupported format: " + this.g.g1);
                    return;
                }
            }
            int a = i4.a();
            this.e.e(i4, a);
            this.e.b(j2, i, a, i3, aVar);
        }

        @Override // o.InterfaceC10568wr2
        public int d(CU cu, int i, boolean z, int i2) throws IOException {
            h(this.i + i);
            int read = cu.read(this.h, this.i, i);
            if (read == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            this.i += read;
            return read;
        }

        @Override // o.InterfaceC10568wr2
        public void f(C3012Fy1 c3012Fy1, int i, int i2) {
            h(this.i + i);
            c3012Fy1.n(this.h, this.i, i);
            this.i += i;
        }

        public final boolean g(C3816Oe0 c3816Oe0) {
            C10833xx0 j2 = c3816Oe0.j();
            if (j2 != null && TD2.g(this.f.g1, j2.g1)) {
                return true;
            }
            return false;
        }

        public final void h(int i) {
            byte[] bArr = this.h;
            if (bArr.length < i) {
                this.h = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        public final C3012Fy1 i(int i, int i2) {
            int i3 = this.i - i2;
            C3012Fy1 c3012Fy1 = new C3012Fy1(Arrays.copyOfRange(this.h, i3 - i, i3));
            byte[] bArr = this.h;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.i = i2;
            return c3012Fy1;
        }
    }

    /* renamed from: o.eI0$d */
    /* loaded from: classes2.dex */
    public static final class d extends GX1 {
        public final Map<String, C6960i70> M;
        @InterfaceC11300zs1
        public C6960i70 N;

        @Override // o.GX1, o.InterfaceC10568wr2
        public void b(long j, int i, int i2, int i3, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
            super.b(j, i, i2, i3, aVar);
        }

        @InterfaceC11300zs1
        public final C4224Si1 i0(@InterfaceC11300zs1 C4224Si1 c4224Si1) {
            if (c4224Si1 == null) {
                return null;
            }
            int e = c4224Si1.e();
            int i = 0;
            while (true) {
                if (i < e) {
                    C4224Si1.b d = c4224Si1.d(i);
                    if ((d instanceof HH1) && RH0.N.equals(((HH1) d).Y)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return c4224Si1;
            }
            if (e == 1) {
                return null;
            }
            C4224Si1.b[] bVarArr = new C4224Si1.b[e - 1];
            for (int i2 = 0; i2 < e; i2++) {
                if (i2 != i) {
                    bVarArr[i2 < i ? i2 : i2 - 1] = c4224Si1.d(i2);
                }
            }
            return new C4224Si1(bVarArr);
        }

        public void j0(@InterfaceC11300zs1 C6960i70 c6960i70) {
            this.N = c6960i70;
            K();
        }

        public void k0(RH0 rh0) {
            g0(rh0.k);
        }

        @Override // o.GX1
        public C10833xx0 y(C10833xx0 c10833xx0) {
            C6960i70 c6960i70;
            C6960i70 c6960i702 = this.N;
            if (c6960i702 == null) {
                c6960i702 = c10833xx0.j1;
            }
            if (c6960i702 != null && (c6960i70 = this.M.get(c6960i702.Z)) != null) {
                c6960i702 = c6960i70;
            }
            C4224Si1 i0 = i0(c10833xx0.e1);
            if (c6960i702 != c10833xx0.j1 || i0 != c10833xx0.e1) {
                c10833xx0 = c10833xx0.b().O(c6960i702).Z(i0).G();
            }
            return super.y(c10833xx0);
        }

        public d(InterfaceC10877y8 interfaceC10877y8, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar, Map<String, C6960i70> map) {
            super(interfaceC10877y8, interfaceC9170r70, aVar);
            this.M = map;
        }
    }

    public C6020eI0(String str, int i, b bVar, MH0 mh0, Map<String, C6960i70> map, InterfaceC10877y8 interfaceC10877y8, long j, @InterfaceC11300zs1 C10833xx0 c10833xx0, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar, M11 m11, InterfaceC9309rh1.a aVar2, int i2) {
        this.X = str;
        this.Y = i;
        this.Z = bVar;
        this.Y0 = mh0;
        this.o1 = map;
        this.Z0 = interfaceC10877y8;
        this.a1 = c10833xx0;
        this.b1 = interfaceC9170r70;
        this.c1 = aVar;
        this.d1 = m11;
        this.f1 = aVar2;
        this.g1 = i2;
        Set<Integer> set = X1;
        this.s1 = new HashSet(set.size());
        this.t1 = new SparseIntArray(set.size());
        this.q1 = new d[0];
        this.J1 = new boolean[0];
        this.I1 = new boolean[0];
        ArrayList<RH0> arrayList = new ArrayList<>();
        this.i1 = arrayList;
        this.j1 = Collections.unmodifiableList(arrayList);
        this.n1 = new ArrayList<>();
        this.k1 = new Runnable() { // from class: o.cI0
            @Override // java.lang.Runnable
            public final void run() {
                C6020eI0.this.V();
            }
        };
        this.l1 = new Runnable() { // from class: o.dI0
            @Override // java.lang.Runnable
            public final void run() {
                C6020eI0.this.e0();
            }
        };
        this.m1 = TD2.C();
        this.K1 = j;
        this.L1 = j;
    }

    public static W70 B(int i, int i2) {
        I31.n(T1, "Unmapped track with id " + i + " of type " + i2);
        return new W70();
    }

    public static C10833xx0 E(@InterfaceC11300zs1 C10833xx0 c10833xx0, C10833xx0 c10833xx02, boolean z) {
        String d2;
        String str;
        int i;
        int i2;
        if (c10833xx0 == null) {
            return c10833xx02;
        }
        int l = C4128Rj1.l(c10833xx02.g1);
        if (TD2.X(c10833xx0.d1, l) == 1) {
            d2 = TD2.Y(c10833xx0.d1, l);
            str = C4128Rj1.g(d2);
        } else {
            d2 = C4128Rj1.d(c10833xx0.d1, c10833xx02.g1);
            str = c10833xx02.g1;
        }
        C10833xx0.b e0 = c10833xx02.b().U(c10833xx0.X).W(c10833xx0.Y).X(c10833xx0.Z).i0(c10833xx0.Y0).e0(c10833xx0.Z0);
        if (z) {
            i = c10833xx0.a1;
        } else {
            i = -1;
        }
        C10833xx0.b I = e0.I(i);
        if (z) {
            i2 = c10833xx0.b1;
        } else {
            i2 = -1;
        }
        C10833xx0.b K = I.b0(i2).K(d2);
        if (l == 2) {
            K.n0(c10833xx0.l1).S(c10833xx0.m1).R(c10833xx0.n1);
        }
        if (str != null) {
            K.g0(str);
        }
        int i3 = c10833xx0.t1;
        if (i3 != -1 && l == 1) {
            K.J(i3);
        }
        C4224Si1 c4224Si1 = c10833xx0.e1;
        if (c4224Si1 != null) {
            C4224Si1 c4224Si12 = c10833xx02.e1;
            if (c4224Si12 != null) {
                c4224Si1 = c4224Si12.b(c4224Si1);
            }
            K.Z(c4224Si1);
        }
        return K.G();
    }

    private void F(int i) {
        C9542sf.i(!this.e1.k());
        while (true) {
            if (i < this.i1.size()) {
                if (z(i)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        long j = J().h;
        RH0 G = G(i);
        if (this.i1.isEmpty()) {
            this.L1 = this.K1;
        } else {
            ((RH0) C5098aU0.w(this.i1)).o();
        }
        this.O1 = false;
        this.f1.w(this.v1, G.g, j);
    }

    public static boolean I(C10833xx0 c10833xx0, C10833xx0 c10833xx02) {
        String str = c10833xx0.g1;
        String str2 = c10833xx02.g1;
        int l = C4128Rj1.l(str);
        if (l != 3) {
            if (l != C4128Rj1.l(str2)) {
                return false;
            }
            return true;
        } else if (!TD2.g(str, str2)) {
            return false;
        } else {
            if ((C4128Rj1.x0.equals(str) || C4128Rj1.y0.equals(str)) && c10833xx0.y1 != c10833xx02.y1) {
                return false;
            }
            return true;
        }
    }

    public static int O(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        return 0;
    }

    private static boolean Q(AbstractC6238fC abstractC6238fC) {
        return abstractC6238fC instanceof RH0;
    }

    private boolean R() {
        if (this.L1 != C10323vs.b) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (!this.C1 && this.F1 == null && this.x1) {
            for (d dVar : this.q1) {
                if (dVar.H() == null) {
                    return;
                }
            }
            if (this.D1 != null) {
                U();
                return;
            }
            y();
            n0();
            this.Z.onPrepared();
        }
    }

    private void i0() {
        for (d dVar : this.q1) {
            dVar.X(this.M1);
        }
        this.M1 = false;
    }

    public void A() {
        if (!this.y1) {
            d(this.K1);
        }
    }

    public final GX1 C(int i, int i2) {
        int length = this.q1.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        d dVar = new d(this.Z0, this.b1, this.c1, this.o1);
        dVar.c0(this.K1);
        if (z) {
            dVar.j0(this.R1);
        }
        dVar.b0(this.Q1);
        RH0 rh0 = this.S1;
        if (rh0 != null) {
            dVar.k0(rh0);
        }
        dVar.e0(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.r1, i3);
        this.r1 = copyOf;
        copyOf[length] = i;
        this.q1 = (d[]) TD2.n1(this.q1, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.J1, i3);
        this.J1 = copyOf2;
        copyOf2[length] = z;
        this.H1 |= z;
        this.s1.add(Integer.valueOf(i2));
        this.t1.append(i2, length);
        if (O(i2) > O(this.v1)) {
            this.w1 = length;
            this.v1 = i2;
        }
        this.I1 = Arrays.copyOf(this.I1, i3);
        return dVar;
    }

    public final C10079ur2 D(C9593sr2[] c9593sr2Arr) {
        for (int i = 0; i < c9593sr2Arr.length; i++) {
            C9593sr2 c9593sr2 = c9593sr2Arr[i];
            C10833xx0[] c10833xx0Arr = new C10833xx0[c9593sr2.X];
            for (int i2 = 0; i2 < c9593sr2.X; i2++) {
                C10833xx0 c2 = c9593sr2.c(i2);
                c10833xx0Arr[i2] = c2.c(this.b1.d(c2));
            }
            c9593sr2Arr[i] = new C9593sr2(c9593sr2.Y, c10833xx0Arr);
        }
        return new C10079ur2(c9593sr2Arr);
    }

    public final RH0 G(int i) {
        RH0 rh0 = this.i1.get(i);
        ArrayList<RH0> arrayList = this.i1;
        TD2.z1(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.q1.length; i2++) {
            this.q1[i2].w(rh0.m(i2));
        }
        return rh0;
    }

    public final boolean H(RH0 rh0) {
        int i = rh0.k;
        int length = this.q1.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.I1[i2] && this.q1[i2].R() == i) {
                return false;
            }
        }
        return true;
    }

    public final RH0 J() {
        ArrayList<RH0> arrayList = this.i1;
        return arrayList.get(arrayList.size() - 1);
    }

    @InterfaceC11300zs1
    public final InterfaceC10568wr2 K(int i, int i2) {
        C9542sf.a(X1.contains(Integer.valueOf(i2)));
        int i3 = this.t1.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.s1.add(Integer.valueOf(i2))) {
            this.r1[i3] = i;
        }
        if (this.r1[i3] == i) {
            return this.q1[i3];
        }
        return B(i, i2);
    }

    public int L() {
        return this.G1;
    }

    public final void P(RH0 rh0) {
        d[] dVarArr;
        this.S1 = rh0;
        this.A1 = rh0.d;
        this.L1 = C10323vs.b;
        this.i1.add(rh0);
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (d dVar : this.q1) {
            r.g(Integer.valueOf(dVar.I()));
        }
        rh0.n(this, r.e());
        for (d dVar2 : this.q1) {
            dVar2.k0(rh0);
            if (rh0.n) {
                dVar2.h0();
            }
        }
    }

    public boolean S(int i) {
        if (!R() && this.q1[i].M(this.O1)) {
            return true;
        }
        return false;
    }

    public boolean T() {
        if (this.v1 == 2) {
            return true;
        }
        return false;
    }

    @InterfaceC8557od0({"trackGroupToSampleQueueIndex"})
    @HS1({"trackGroups"})
    public final void U() {
        int i = this.D1.X;
        int[] iArr = new int[i];
        this.F1 = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                d[] dVarArr = this.q1;
                if (i3 >= dVarArr.length) {
                    break;
                } else if (I((C10833xx0) C9542sf.k(dVarArr[i3].H()), this.D1.b(i2).c(0))) {
                    this.F1[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<C5050aI0> it = this.n1.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void W() throws IOException {
        this.e1.b();
        this.Y0.o();
    }

    public void X(int i) throws IOException {
        W();
        this.q1[i].O();
    }

    @Override // o.R11.b
    /* renamed from: Y */
    public void M(AbstractC6238fC abstractC6238fC, long j, long j2, boolean z) {
        this.p1 = null;
        N11 n11 = new N11(abstractC6238fC.a, abstractC6238fC.b, abstractC6238fC.f(), abstractC6238fC.e(), j, j2, abstractC6238fC.b());
        this.d1.c(abstractC6238fC.a);
        this.f1.k(n11, abstractC6238fC.c, this.Y, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h);
        if (!z) {
            if (R() || this.z1 == 0) {
                i0();
            }
            if (this.z1 > 0) {
                this.Z.l(this);
            }
        }
    }

    @Override // o.R11.b
    /* renamed from: Z */
    public void t(AbstractC6238fC abstractC6238fC, long j, long j2) {
        this.p1 = null;
        this.Y0.q(abstractC6238fC);
        N11 n11 = new N11(abstractC6238fC.a, abstractC6238fC.b, abstractC6238fC.f(), abstractC6238fC.e(), j, j2, abstractC6238fC.b());
        this.d1.c(abstractC6238fC.a);
        this.f1.n(n11, abstractC6238fC.c, this.Y, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h);
        if (!this.y1) {
            d(this.K1);
        } else {
            this.Z.l(this);
        }
    }

    @Override // o.G02
    public boolean a() {
        return this.e1.k();
    }

    @Override // o.R11.b
    /* renamed from: a0 */
    public R11.c N(AbstractC6238fC abstractC6238fC, long j, long j2, IOException iOException, int i) {
        boolean z;
        R11.c cVar;
        int i2;
        boolean Q = Q(abstractC6238fC);
        if (Q && !((RH0) abstractC6238fC).q() && (iOException instanceof InterfaceC10186vI0.f) && ((i2 = ((InterfaceC10186vI0.f) iOException).c1) == 410 || i2 == 404)) {
            return R11.i;
        }
        long b2 = abstractC6238fC.b();
        N11 n11 = new N11(abstractC6238fC.a, abstractC6238fC.b, abstractC6238fC.f(), abstractC6238fC.e(), j, j2, b2);
        M11.d dVar = new M11.d(n11, new C10519wf1(abstractC6238fC.c, this.Y, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, TD2.b2(abstractC6238fC.g), TD2.b2(abstractC6238fC.h)), iOException, i);
        M11.b b3 = this.d1.b(C3087Gr2.c(this.Y0.l()), dVar);
        boolean z2 = false;
        if (b3 != null && b3.a == 2) {
            z = this.Y0.n(abstractC6238fC, b3.b);
        } else {
            z = false;
        }
        if (z) {
            if (Q && b2 == 0) {
                ArrayList<RH0> arrayList = this.i1;
                if (arrayList.remove(arrayList.size() - 1) == abstractC6238fC) {
                    z2 = true;
                }
                C9542sf.i(z2);
                if (this.i1.isEmpty()) {
                    this.L1 = this.K1;
                } else {
                    ((RH0) C5098aU0.w(this.i1)).o();
                }
            }
            cVar = R11.k;
        } else {
            long d2 = this.d1.d(dVar);
            if (d2 != C10323vs.b) {
                cVar = R11.i(false, d2);
            } else {
                cVar = R11.l;
            }
        }
        R11.c cVar2 = cVar;
        boolean c2 = cVar2.c();
        this.f1.p(n11, abstractC6238fC.c, this.Y, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h, iOException, !c2);
        if (!c2) {
            this.p1 = null;
            this.d1.c(abstractC6238fC.a);
        }
        if (z) {
            if (!this.y1) {
                d(this.K1);
                return cVar2;
            }
            this.Z.l(this);
        }
        return cVar2;
    }

    @Override // o.InterfaceC4518Vj0
    public InterfaceC10568wr2 b(int i, int i2) {
        InterfaceC10568wr2 interfaceC10568wr2;
        if (X1.contains(Integer.valueOf(i2))) {
            interfaceC10568wr2 = K(i, i2);
        } else {
            int i3 = 0;
            while (true) {
                InterfaceC10568wr2[] interfaceC10568wr2Arr = this.q1;
                if (i3 < interfaceC10568wr2Arr.length) {
                    if (this.r1[i3] == i) {
                        interfaceC10568wr2 = interfaceC10568wr2Arr[i3];
                        break;
                    }
                    i3++;
                } else {
                    interfaceC10568wr2 = null;
                    break;
                }
            }
        }
        if (interfaceC10568wr2 == null) {
            if (this.P1) {
                return B(i, i2);
            }
            interfaceC10568wr2 = C(i, i2);
        }
        if (i2 == 5) {
            if (this.u1 == null) {
                this.u1 = new c(interfaceC10568wr2, this.g1);
            }
            return this.u1;
        }
        return interfaceC10568wr2;
    }

    public void b0() {
        this.s1.clear();
    }

    @Override // o.G02
    public long c() {
        if (R()) {
            return this.L1;
        }
        if (this.O1) {
            return Long.MIN_VALUE;
        }
        return J().h;
    }

    public boolean c0(Uri uri, M11.d dVar, boolean z) {
        long j;
        M11.b b2;
        if (!this.Y0.p(uri)) {
            return true;
        }
        if (!z && (b2 = this.d1.b(C3087Gr2.c(this.Y0.l()), dVar)) != null && b2.a == 2) {
            j = b2.b;
        } else {
            j = -9223372036854775807L;
        }
        if (this.Y0.r(uri, j) && j != C10323vs.b) {
            return true;
        }
        return false;
    }

    @Override // o.G02
    public boolean d(long j) {
        List<RH0> list;
        long max;
        boolean z;
        if (this.O1 || this.e1.k() || this.e1.j()) {
            return false;
        }
        if (R()) {
            list = Collections.EMPTY_LIST;
            max = this.L1;
            for (d dVar : this.q1) {
                dVar.c0(this.L1);
            }
        } else {
            list = this.j1;
            RH0 J = J();
            if (J.h()) {
                max = J.h;
            } else {
                max = Math.max(this.K1, J.g);
            }
        }
        List<RH0> list2 = list;
        long j2 = max;
        this.h1.a();
        MH0 mh0 = this.Y0;
        if (!this.y1 && list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        mh0.f(j, j2, list2, z, this.h1);
        MH0.b bVar = this.h1;
        boolean z2 = bVar.b;
        AbstractC6238fC abstractC6238fC = bVar.a;
        Uri uri = bVar.c;
        if (z2) {
            this.L1 = C10323vs.b;
            this.O1 = true;
            return true;
        } else if (abstractC6238fC == null) {
            if (uri != null) {
                this.Z.n(uri);
            }
            return false;
        } else {
            if (Q(abstractC6238fC)) {
                P((RH0) abstractC6238fC);
            }
            this.p1 = abstractC6238fC;
            this.f1.t(new N11(abstractC6238fC.a, abstractC6238fC.b, this.e1.n(abstractC6238fC, this, this.d1.a(abstractC6238fC.c))), abstractC6238fC.c, this.Y, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h);
            return true;
        }
    }

    public void d0() {
        if (!this.i1.isEmpty()) {
            RH0 rh0 = (RH0) C5098aU0.w(this.i1);
            int c2 = this.Y0.c(rh0);
            if (c2 == 1) {
                rh0.v();
            } else if (c2 == 2 && !this.O1 && this.e1.k()) {
                this.e1.g();
            }
        }
    }

    public long e(long j, LZ1 lz1) {
        return this.Y0.b(j, lz1);
    }

    public final void e0() {
        this.x1 = true;
        V();
    }

    @Override // o.G02
    public long f() {
        ArrayList<RH0> arrayList;
        if (this.O1) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.L1;
        }
        long j = this.K1;
        RH0 J = J();
        if (!J.h()) {
            if (this.i1.size() > 1) {
                J = this.i1.get(arrayList.size() - 2);
            } else {
                J = null;
            }
        }
        if (J != null) {
            j = Math.max(j, J.h);
        }
        if (this.x1) {
            for (d dVar : this.q1) {
                j = Math.max(j, dVar.B());
            }
        }
        return j;
    }

    public void f0(C9593sr2[] c9593sr2Arr, int i, int... iArr) {
        this.D1 = D(c9593sr2Arr);
        this.E1 = new HashSet();
        for (int i2 : iArr) {
            this.E1.add(this.D1.b(i2));
        }
        this.G1 = i;
        Handler handler = this.m1;
        final b bVar = this.Z;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: o.bI0
            @Override // java.lang.Runnable
            public final void run() {
                C6020eI0.b.this.onPrepared();
            }
        });
        n0();
    }

    @Override // o.G02
    public void g(long j) {
        if (!this.e1.j() && !R()) {
            if (this.e1.k()) {
                C9542sf.g(this.p1);
                if (this.Y0.w(j, this.p1, this.j1)) {
                    this.e1.g();
                    return;
                }
                return;
            }
            int size = this.j1.size();
            while (size > 0 && this.Y0.c(this.j1.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.j1.size()) {
                F(size);
            }
            int i = this.Y0.i(j, this.j1);
            if (i < this.i1.size()) {
                F(i);
            }
        }
    }

    public int g0(int i, C2899Ex0 c2899Ex0, C9267rW c9267rW, int i2) {
        C10833xx0 c10833xx0;
        if (R()) {
            return -3;
        }
        int i3 = 0;
        if (!this.i1.isEmpty()) {
            int i4 = 0;
            while (i4 < this.i1.size() - 1 && H(this.i1.get(i4))) {
                i4++;
            }
            TD2.z1(this.i1, 0, i4);
            RH0 rh0 = this.i1.get(0);
            C10833xx0 c10833xx02 = rh0.d;
            if (!c10833xx02.equals(this.B1)) {
                this.f1.h(this.Y, c10833xx02, rh0.e, rh0.f, rh0.g);
            }
            this.B1 = c10833xx02;
        }
        if (!this.i1.isEmpty() && !this.i1.get(0).q()) {
            return -3;
        }
        int T = this.q1[i].T(c2899Ex0, c9267rW, i2, this.O1);
        if (T == -5) {
            C10833xx0 c10833xx03 = (C10833xx0) C9542sf.g(c2899Ex0.b);
            if (i == this.w1) {
                int d2 = C7775lT0.d(this.q1[i].R());
                while (i3 < this.i1.size() && this.i1.get(i3).k != d2) {
                    i3++;
                }
                if (i3 < this.i1.size()) {
                    c10833xx0 = this.i1.get(i3).d;
                } else {
                    c10833xx0 = (C10833xx0) C9542sf.g(this.A1);
                }
                c10833xx03 = c10833xx03.l(c10833xx0);
            }
            c2899Ex0.b = c10833xx03;
        }
        return T;
    }

    public void h0() {
        if (this.y1) {
            for (d dVar : this.q1) {
                dVar.S();
            }
        }
        this.e1.m(this);
        this.m1.removeCallbacksAndMessages(null);
        this.C1 = true;
        this.n1.clear();
    }

    @Override // o.GX1.d
    public void j(C10833xx0 c10833xx0) {
        this.m1.post(this.k1);
    }

    public final boolean j0(long j) {
        int length = this.q1.length;
        for (int i = 0; i < length; i++) {
            if (!this.q1[i].a0(j, false) && (this.J1[i] || !this.H1)) {
                return false;
            }
        }
        return true;
    }

    public boolean k0(long j, boolean z) {
        this.K1 = j;
        if (R()) {
            this.L1 = j;
            return true;
        }
        if (this.x1 && !z && j0(j)) {
            return false;
        }
        this.L1 = j;
        this.O1 = false;
        this.i1.clear();
        if (this.e1.k()) {
            if (this.x1) {
                for (d dVar : this.q1) {
                    dVar.s();
                }
            }
            this.e1.g();
        } else {
            this.e1.h();
            i0();
        }
        return true;
    }

    @Override // o.R11.f
    public void l() {
        for (d dVar : this.q1) {
            dVar.U();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010d, code lost:
        if (r1.s() != r13.Y0.k().d(r14.d)) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l0(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        w();
        int i = this.z1;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC6859hi0Arr.length; i3++) {
            C5050aI0 c5050aI0 = (C5050aI0) ix1Arr[i3];
            if (c5050aI0 != null && (interfaceC6859hi0Arr[i3] == null || !zArr[i3])) {
                this.z1--;
                c5050aI0.d();
                ix1Arr[i3] = null;
            }
        }
        if (!z && (!this.N1 ? j == this.K1 : i != 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        InterfaceC6859hi0 l = this.Y0.l();
        boolean z5 = z2;
        InterfaceC6859hi0 interfaceC6859hi0 = l;
        for (int i4 = 0; i4 < interfaceC6859hi0Arr.length; i4++) {
            InterfaceC6859hi0 interfaceC6859hi02 = interfaceC6859hi0Arr[i4];
            if (interfaceC6859hi02 != null) {
                int c2 = this.D1.c(interfaceC6859hi02.n());
                if (c2 == this.G1) {
                    this.Y0.v(interfaceC6859hi02);
                    interfaceC6859hi0 = interfaceC6859hi02;
                }
                if (ix1Arr[i4] == null) {
                    this.z1++;
                    C5050aI0 c5050aI02 = new C5050aI0(this, c2);
                    ix1Arr[i4] = c5050aI02;
                    zArr2[i4] = true;
                    if (this.F1 != null) {
                        c5050aI02.a();
                        if (!z5) {
                            d dVar = this.q1[this.F1[c2]];
                            if (!dVar.a0(j, true) && dVar.E() != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z4;
                        }
                    }
                }
            }
        }
        if (this.z1 == 0) {
            this.Y0.s();
            this.B1 = null;
            this.M1 = true;
            this.i1.clear();
            if (this.e1.k()) {
                if (this.x1) {
                    d[] dVarArr = this.q1;
                    int length = dVarArr.length;
                    while (i2 < length) {
                        dVarArr[i2].s();
                        i2++;
                    }
                }
                this.e1.g();
            } else {
                i0();
            }
        } else {
            if (!this.i1.isEmpty() && !TD2.g(interfaceC6859hi0, l)) {
                if (!this.N1) {
                    long j2 = 0;
                    if (j < 0) {
                        j2 = -j;
                    }
                    RH0 J = J();
                    InterfaceC6859hi0 interfaceC6859hi03 = interfaceC6859hi0;
                    interfaceC6859hi03.l(j, j2, C10323vs.b, this.j1, this.Y0.a(J, j));
                }
                this.M1 = true;
                z3 = true;
                z5 = true;
                if (z5) {
                    k0(j, z3);
                    while (i2 < ix1Arr.length) {
                        if (ix1Arr[i2] != null) {
                            zArr2[i2] = true;
                        }
                        i2++;
                    }
                }
            }
            z3 = z;
            if (z5) {
            }
        }
        s0(ix1Arr);
        this.N1 = true;
        return z5;
    }

    public void m() throws IOException {
        W();
        if (this.O1 && !this.y1) {
            throw C3989Py1.a("Loading finished before preparation is complete.", null);
        }
    }

    public void m0(@InterfaceC11300zs1 C6960i70 c6960i70) {
        if (!TD2.g(this.R1, c6960i70)) {
            this.R1 = c6960i70;
            int i = 0;
            while (true) {
                d[] dVarArr = this.q1;
                if (i < dVarArr.length) {
                    if (this.J1[i]) {
                        dVarArr[i].j0(c6960i70);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // o.InterfaceC4518Vj0
    public void n() {
        this.P1 = true;
        this.m1.post(this.l1);
    }

    @HS1({"trackGroups", "optionalTrackGroups"})
    public final void n0() {
        this.y1 = true;
    }

    public void o0(boolean z) {
        this.Y0.u(z);
    }

    public void p0(long j) {
        if (this.Q1 != j) {
            this.Q1 = j;
            for (d dVar : this.q1) {
                dVar.b0(j);
            }
        }
    }

    public C10079ur2 q() {
        w();
        return this.D1;
    }

    public int q0(int i, long j) {
        if (R()) {
            return 0;
        }
        d dVar = this.q1[i];
        int G = dVar.G(j, this.O1);
        RH0 rh0 = (RH0) C5098aU0.x(this.i1, null);
        if (rh0 != null && !rh0.q()) {
            G = Math.min(G, rh0.m(i) - dVar.E());
        }
        dVar.f0(G);
        return G;
    }

    public void r(long j, boolean z) {
        if (this.x1 && !R()) {
            int length = this.q1.length;
            for (int i = 0; i < length; i++) {
                this.q1[i].r(j, z, this.I1[i]);
            }
        }
    }

    public void r0(int i) {
        w();
        C9542sf.g(this.F1);
        int i2 = this.F1[i];
        C9542sf.i(this.I1[i2]);
        this.I1[i2] = false;
    }

    public final void s0(IX1[] ix1Arr) {
        this.n1.clear();
        for (IX1 ix1 : ix1Arr) {
            if (ix1 != null) {
                this.n1.add((C5050aI0) ix1);
            }
        }
    }

    @InterfaceC8557od0({"trackGroups", "optionalTrackGroups"})
    public final void w() {
        C9542sf.i(this.y1);
        C9542sf.g(this.D1);
        C9542sf.g(this.E1);
    }

    public int x(int i) {
        w();
        C9542sf.g(this.F1);
        int i2 = this.F1[i];
        if (i2 == -1) {
            if (!this.E1.contains(this.D1.b(i))) {
                return -2;
            }
            return -3;
        }
        boolean[] zArr = this.I1;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    @InterfaceC8557od0({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    public final void y() {
        C10833xx0 c10833xx0;
        C10833xx0 E;
        C10833xx0 c10833xx02;
        int length = this.q1.length;
        boolean z = false;
        int i = -2;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= length) {
                break;
            }
            String str = ((C10833xx0) C9542sf.k(this.q1[i3].H())).g1;
            if (!C4128Rj1.t(str)) {
                if (C4128Rj1.p(str)) {
                    i4 = 1;
                } else if (C4128Rj1.s(str)) {
                    i4 = 3;
                } else {
                    i4 = -2;
                }
            }
            if (O(i4) > O(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        C9593sr2 k = this.Y0.k();
        int i5 = k.X;
        this.G1 = -1;
        this.F1 = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.F1[i6] = i6;
        }
        C9593sr2[] c9593sr2Arr = new C9593sr2[length];
        for (int i7 = 0; i7 < length; i7++) {
            C10833xx0 c10833xx03 = (C10833xx0) C9542sf.k(this.q1[i7].H());
            if (i7 == i2) {
                C10833xx0[] c10833xx0Arr = new C10833xx0[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    C10833xx0 c2 = k.c(i8);
                    if (i == 1 && (c10833xx02 = this.a1) != null) {
                        c2 = c2.l(c10833xx02);
                    }
                    if (i5 == 1) {
                        E = c10833xx03.l(c2);
                    } else {
                        E = E(c2, c10833xx03, true);
                    }
                    c10833xx0Arr[i8] = E;
                }
                c9593sr2Arr[i7] = new C9593sr2(this.X, c10833xx0Arr);
                this.G1 = i7;
            } else {
                if (i == 2 && C4128Rj1.p(c10833xx03.g1)) {
                    c10833xx0 = this.a1;
                } else {
                    c10833xx0 = null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.X);
                sb.append(":muxed:");
                sb.append(i7 < i2 ? i7 : i7 - 1);
                c9593sr2Arr[i7] = new C9593sr2(sb.toString(), E(c10833xx0, c10833xx03, false));
            }
        }
        this.D1 = D(c9593sr2Arr);
        if (this.E1 == null) {
            z = true;
        }
        C9542sf.i(z);
        this.E1 = Collections.EMPTY_SET;
    }

    public final boolean z(int i) {
        for (int i2 = i; i2 < this.i1.size(); i2++) {
            if (this.i1.get(i2).n) {
                return false;
            }
        }
        RH0 rh0 = this.i1.get(i);
        for (int i3 = 0; i3 < this.q1.length; i3++) {
            if (this.q1[i3].E() > rh0.m(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC4518Vj0
    public void p(KZ1 kz1) {
    }
}
