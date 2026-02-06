package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.G02;
import o.InterfaceC7706lC;
import o.InterfaceC8921q70;
import o.InterfaceC9309rh1;
import o.M11;
import o.R11;

@Deprecated
/* renamed from: o.kC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7463kC<T extends InterfaceC7706lC> implements IX1, G02, R11.b<AbstractC6238fC>, R11.f {
    public static final String s1 = "ChunkSampleStream";
    public final int X;
    public final int[] Y;
    public final boolean[] Y0;
    public final C10833xx0[] Z;
    public final T Z0;
    public final G02.a<C7463kC<T>> a1;
    public final InterfaceC9309rh1.a b1;
    public final M11 c1;
    public final R11 d1;
    public final C6736hC e1;
    public final ArrayList<AbstractC9809tl> f1;
    public final List<AbstractC9809tl> g1;
    public final GX1 h1;
    public final GX1[] i1;
    public final C10295vl j1;
    @InterfaceC11300zs1
    public AbstractC6238fC k1;
    public C10833xx0 l1;
    @InterfaceC11300zs1
    public b<T> m1;
    public long n1;
    public long o1;
    public int p1;
    @InterfaceC11300zs1
    public AbstractC9809tl q1;
    public boolean r1;

    /* renamed from: o.kC$b */
    /* loaded from: classes2.dex */
    public interface b<T extends InterfaceC7706lC> {
        void b(C7463kC<T> c7463kC);
    }

    public C7463kC(int i, @InterfaceC11300zs1 int[] iArr, @InterfaceC11300zs1 C10833xx0[] c10833xx0Arr, T t, G02.a<C7463kC<T>> aVar, InterfaceC10877y8 interfaceC10877y8, long j, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar2, M11 m11, InterfaceC9309rh1.a aVar3) {
        this.X = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.Y = iArr;
        this.Z = c10833xx0Arr == null ? new C10833xx0[0] : c10833xx0Arr;
        this.Z0 = t;
        this.a1 = aVar;
        this.b1 = aVar3;
        this.c1 = m11;
        this.d1 = new R11(s1);
        this.e1 = new C6736hC();
        ArrayList<AbstractC9809tl> arrayList = new ArrayList<>();
        this.f1 = arrayList;
        this.g1 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.i1 = new GX1[length];
        this.Y0 = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        GX1[] gx1Arr = new GX1[i3];
        GX1 l = GX1.l(interfaceC10877y8, interfaceC9170r70, aVar2);
        this.h1 = l;
        iArr2[0] = i;
        gx1Arr[0] = l;
        while (i2 < length) {
            GX1 m = GX1.m(interfaceC10877y8);
            this.i1[i2] = m;
            int i4 = i2 + 1;
            gx1Arr[i4] = m;
            iArr2[i4] = this.Y[i2];
            i2 = i4;
        }
        this.j1 = new C10295vl(iArr2, gx1Arr);
        this.n1 = j;
        this.o1 = j;
    }

    public final void A(int i) {
        C9542sf.i(!this.d1.k());
        int size = this.f1.size();
        while (true) {
            if (i < size) {
                if (!E(i)) {
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
        long j = D().h;
        AbstractC9809tl B = B(i);
        if (this.f1.isEmpty()) {
            this.n1 = this.o1;
        }
        this.r1 = false;
        this.b1.w(this.X, B.g, j);
    }

    public final AbstractC9809tl B(int i) {
        AbstractC9809tl abstractC9809tl = this.f1.get(i);
        ArrayList<AbstractC9809tl> arrayList = this.f1;
        TD2.z1(arrayList, i, arrayList.size());
        this.p1 = Math.max(this.p1, this.f1.size());
        int i2 = 0;
        this.h1.w(abstractC9809tl.i(0));
        while (true) {
            GX1[] gx1Arr = this.i1;
            if (i2 < gx1Arr.length) {
                GX1 gx1 = gx1Arr[i2];
                i2++;
                gx1.w(abstractC9809tl.i(i2));
            } else {
                return abstractC9809tl;
            }
        }
    }

    public T C() {
        return this.Z0;
    }

    public final AbstractC9809tl D() {
        ArrayList<AbstractC9809tl> arrayList = this.f1;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean E(int i) {
        int E;
        AbstractC9809tl abstractC9809tl = this.f1.get(i);
        if (this.h1.E() > abstractC9809tl.i(0)) {
            return true;
        }
        int i2 = 0;
        do {
            GX1[] gx1Arr = this.i1;
            if (i2 >= gx1Arr.length) {
                return false;
            }
            E = gx1Arr[i2].E();
            i2++;
        } while (E <= abstractC9809tl.i(i2));
        return true;
    }

    public final boolean F(AbstractC6238fC abstractC6238fC) {
        return abstractC6238fC instanceof AbstractC9809tl;
    }

    public boolean G() {
        if (this.n1 != C10323vs.b) {
            return true;
        }
        return false;
    }

    public final void H() {
        int O = O(this.h1.E(), this.p1 - 1);
        while (true) {
            int i = this.p1;
            if (i <= O) {
                this.p1 = i + 1;
                I(i);
            } else {
                return;
            }
        }
    }

    public final void I(int i) {
        AbstractC9809tl abstractC9809tl = this.f1.get(i);
        C10833xx0 c10833xx0 = abstractC9809tl.d;
        if (!c10833xx0.equals(this.l1)) {
            this.b1.h(this.X, c10833xx0, abstractC9809tl.e, abstractC9809tl.f, abstractC9809tl.g);
        }
        this.l1 = c10833xx0;
    }

    @Override // o.R11.b
    /* renamed from: J */
    public void M(AbstractC6238fC abstractC6238fC, long j, long j2, boolean z) {
        this.k1 = null;
        this.q1 = null;
        N11 n11 = new N11(abstractC6238fC.a, abstractC6238fC.b, abstractC6238fC.f(), abstractC6238fC.e(), j, j2, abstractC6238fC.b());
        this.c1.c(abstractC6238fC.a);
        this.b1.k(n11, abstractC6238fC.c, this.X, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h);
        if (!z) {
            if (G()) {
                R();
            } else if (F(abstractC6238fC)) {
                B(this.f1.size() - 1);
                if (this.f1.isEmpty()) {
                    this.n1 = this.o1;
                }
            }
            this.a1.l(this);
        }
    }

    @Override // o.R11.b
    /* renamed from: K */
    public void t(AbstractC6238fC abstractC6238fC, long j, long j2) {
        this.k1 = null;
        this.Z0.i(abstractC6238fC);
        N11 n11 = new N11(abstractC6238fC.a, abstractC6238fC.b, abstractC6238fC.f(), abstractC6238fC.e(), j, j2, abstractC6238fC.b());
        this.c1.c(abstractC6238fC.a);
        this.b1.n(n11, abstractC6238fC.c, this.X, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h);
        this.a1.l(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    @Override // o.R11.b
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R11.c N(AbstractC6238fC abstractC6238fC, long j, long j2, IOException iOException, int i) {
        boolean z;
        R11.c cVar;
        boolean c;
        boolean z2;
        long b2 = abstractC6238fC.b();
        boolean F = F(abstractC6238fC);
        int size = this.f1.size() - 1;
        if (b2 != 0 && F && E(size)) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = z;
        N11 n11 = new N11(abstractC6238fC.a, abstractC6238fC.b, abstractC6238fC.f(), abstractC6238fC.e(), j, j2, b2);
        M11.d dVar = new M11.d(n11, new C10519wf1(abstractC6238fC.c, this.X, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, TD2.b2(abstractC6238fC.g), TD2.b2(abstractC6238fC.h)), iOException, i);
        if (this.Z0.f(abstractC6238fC, z3, dVar, this.c1)) {
            if (z3) {
                cVar = R11.k;
                if (F) {
                    if (B(size) == abstractC6238fC) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C9542sf.i(z2);
                    if (this.f1.isEmpty()) {
                        this.n1 = this.o1;
                    }
                }
                if (cVar == null) {
                    long d = this.c1.d(dVar);
                    if (d != C10323vs.b) {
                        cVar = R11.i(false, d);
                    } else {
                        cVar = R11.l;
                    }
                }
                c = cVar.c();
                this.b1.p(n11, abstractC6238fC.c, this.X, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h, iOException, !c);
                if (!c) {
                    this.k1 = null;
                    this.c1.c(abstractC6238fC.a);
                    this.a1.l(this);
                }
                return cVar;
            }
            I31.n(s1, "Ignoring attempt to cancel non-cancelable load.");
        }
        cVar = null;
        if (cVar == null) {
        }
        c = cVar.c();
        this.b1.p(n11, abstractC6238fC.c, this.X, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h, iOException, !c);
        if (!c) {
        }
        return cVar;
    }

    public final int O(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f1.size()) {
                return this.f1.size() - 1;
            }
        } while (this.f1.get(i2).i(0) <= i);
        return i2 - 1;
    }

    public void P() {
        Q(null);
    }

    public void Q(@InterfaceC11300zs1 b<T> bVar) {
        this.m1 = bVar;
        this.h1.S();
        for (GX1 gx1 : this.i1) {
            gx1.S();
        }
        this.d1.m(this);
    }

    public final void R() {
        this.h1.W();
        for (GX1 gx1 : this.i1) {
            gx1.W();
        }
    }

    public void S(long j) {
        AbstractC9809tl abstractC9809tl;
        boolean z;
        boolean a0;
        this.o1 = j;
        if (G()) {
            this.n1 = j;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f1.size(); i2++) {
            abstractC9809tl = this.f1.get(i2);
            int i3 = (abstractC9809tl.g > j ? 1 : (abstractC9809tl.g == j ? 0 : -1));
            if (i3 == 0 && abstractC9809tl.k == C10323vs.b) {
                break;
            } else if (i3 > 0) {
                break;
            }
        }
        abstractC9809tl = null;
        if (abstractC9809tl != null) {
            a0 = this.h1.Z(abstractC9809tl.i(0));
        } else {
            GX1 gx1 = this.h1;
            if (j < c()) {
                z = true;
            } else {
                z = false;
            }
            a0 = gx1.a0(j, z);
        }
        if (a0) {
            this.p1 = O(this.h1.E(), 0);
            GX1[] gx1Arr = this.i1;
            int length = gx1Arr.length;
            while (i < length) {
                gx1Arr[i].a0(j, true);
                i++;
            }
            return;
        }
        this.n1 = j;
        this.r1 = false;
        this.f1.clear();
        this.p1 = 0;
        if (this.d1.k()) {
            this.h1.s();
            GX1[] gx1Arr2 = this.i1;
            int length2 = gx1Arr2.length;
            while (i < length2) {
                gx1Arr2[i].s();
                i++;
            }
            this.d1.g();
            return;
        }
        this.d1.h();
        R();
    }

    public C7463kC<T>.a T(long j, int i) {
        for (int i2 = 0; i2 < this.i1.length; i2++) {
            if (this.Y[i2] == i) {
                C9542sf.i(!this.Y0[i2]);
                this.Y0[i2] = true;
                this.i1[i2].a0(j, true);
                return new a(this, this.i1[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // o.G02
    public boolean a() {
        return this.d1.k();
    }

    @Override // o.IX1
    public void b() throws IOException {
        this.d1.b();
        this.h1.O();
        if (!this.d1.k()) {
            this.Z0.b();
        }
    }

    @Override // o.G02
    public long c() {
        if (G()) {
            return this.n1;
        }
        if (this.r1) {
            return Long.MIN_VALUE;
        }
        return D().h;
    }

    @Override // o.G02
    public boolean d(long j) {
        List<AbstractC9809tl> list;
        long j2;
        if (this.r1 || this.d1.k() || this.d1.j()) {
            return false;
        }
        boolean G = G();
        if (G) {
            list = Collections.EMPTY_LIST;
            j2 = this.n1;
        } else {
            list = this.g1;
            j2 = D().h;
        }
        this.Z0.j(j, j2, list, this.e1);
        C6736hC c6736hC = this.e1;
        boolean z = c6736hC.b;
        AbstractC6238fC abstractC6238fC = c6736hC.a;
        c6736hC.a();
        if (z) {
            this.n1 = C10323vs.b;
            this.r1 = true;
            return true;
        } else if (abstractC6238fC == null) {
            return false;
        } else {
            this.k1 = abstractC6238fC;
            if (F(abstractC6238fC)) {
                AbstractC9809tl abstractC9809tl = (AbstractC9809tl) abstractC6238fC;
                if (G) {
                    long j3 = abstractC9809tl.g;
                    long j4 = this.n1;
                    if (j3 != j4) {
                        this.h1.c0(j4);
                        for (GX1 gx1 : this.i1) {
                            gx1.c0(this.n1);
                        }
                    }
                    this.n1 = C10323vs.b;
                }
                abstractC9809tl.k(this.j1);
                this.f1.add(abstractC9809tl);
            } else if (abstractC6238fC instanceof EP0) {
                ((EP0) abstractC6238fC).g(this.j1);
            }
            this.b1.t(new N11(abstractC6238fC.a, abstractC6238fC.b, this.d1.n(abstractC6238fC, this, this.c1.a(abstractC6238fC.c))), abstractC6238fC.c, this.X, abstractC6238fC.d, abstractC6238fC.e, abstractC6238fC.f, abstractC6238fC.g, abstractC6238fC.h);
            return true;
        }
    }

    public long e(long j, LZ1 lz1) {
        return this.Z0.e(j, lz1);
    }

    @Override // o.G02
    public long f() {
        if (this.r1) {
            return Long.MIN_VALUE;
        }
        if (G()) {
            return this.n1;
        }
        long j = this.o1;
        AbstractC9809tl D = D();
        if (!D.h()) {
            if (this.f1.size() > 1) {
                ArrayList<AbstractC9809tl> arrayList = this.f1;
                D = arrayList.get(arrayList.size() - 2);
            } else {
                D = null;
            }
        }
        if (D != null) {
            j = Math.max(j, D.h);
        }
        return Math.max(j, this.h1.B());
    }

    @Override // o.G02
    public void g(long j) {
        if (!this.d1.j() && !G()) {
            if (this.d1.k()) {
                AbstractC6238fC abstractC6238fC = (AbstractC6238fC) C9542sf.g(this.k1);
                if ((!F(abstractC6238fC) || !E(this.f1.size() - 1)) && this.Z0.h(j, abstractC6238fC, this.g1)) {
                    this.d1.g();
                    if (F(abstractC6238fC)) {
                        this.q1 = (AbstractC9809tl) abstractC6238fC;
                        return;
                    }
                    return;
                }
                return;
            }
            int k = this.Z0.k(j, this.g1);
            if (k < this.f1.size()) {
                A(k);
            }
        }
    }

    @Override // o.IX1
    public boolean isReady() {
        if (!G() && this.h1.M(this.r1)) {
            return true;
        }
        return false;
    }

    @Override // o.IX1
    public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
        if (G()) {
            return -3;
        }
        AbstractC9809tl abstractC9809tl = this.q1;
        if (abstractC9809tl != null && abstractC9809tl.i(0) <= this.h1.E()) {
            return -3;
        }
        H();
        return this.h1.T(c2899Ex0, c9267rW, i, this.r1);
    }

    @Override // o.R11.f
    public void l() {
        this.h1.U();
        for (GX1 gx1 : this.i1) {
            gx1.U();
        }
        this.Z0.g();
        b<T> bVar = this.m1;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // o.IX1
    public int n(long j) {
        if (G()) {
            return 0;
        }
        int G = this.h1.G(j, this.r1);
        AbstractC9809tl abstractC9809tl = this.q1;
        if (abstractC9809tl != null) {
            G = Math.min(G, abstractC9809tl.i(0) - this.h1.E());
        }
        this.h1.f0(G);
        H();
        return G;
    }

    public void r(long j, boolean z) {
        if (G()) {
            return;
        }
        int z2 = this.h1.z();
        this.h1.r(j, z, true);
        int z3 = this.h1.z();
        if (z3 > z2) {
            long A = this.h1.A();
            int i = 0;
            while (true) {
                GX1[] gx1Arr = this.i1;
                if (i >= gx1Arr.length) {
                    break;
                }
                gx1Arr[i].r(A, z, this.Y0[i]);
                i++;
            }
        }
        z(z3);
    }

    public final void z(int i) {
        int min = Math.min(O(i, 0), this.p1);
        if (min > 0) {
            TD2.z1(this.f1, 0, min);
            this.p1 -= min;
        }
    }

    /* renamed from: o.kC$a */
    /* loaded from: classes2.dex */
    public final class a implements IX1 {
        public final C7463kC<T> X;
        public final GX1 Y;
        public boolean Y0;
        public final int Z;

        public a(C7463kC<T> c7463kC, GX1 gx1, int i) {
            this.X = c7463kC;
            this.Y = gx1;
            this.Z = i;
        }

        private void a() {
            if (!this.Y0) {
                C7463kC.this.b1.h(C7463kC.this.Y[this.Z], C7463kC.this.Z[this.Z], 0, null, C7463kC.this.o1);
                this.Y0 = true;
            }
        }

        public void c() {
            C9542sf.i(C7463kC.this.Y0[this.Z]);
            C7463kC.this.Y0[this.Z] = false;
        }

        @Override // o.IX1
        public boolean isReady() {
            if (!C7463kC.this.G() && this.Y.M(C7463kC.this.r1)) {
                return true;
            }
            return false;
        }

        @Override // o.IX1
        public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            if (C7463kC.this.G()) {
                return -3;
            }
            if (C7463kC.this.q1 != null && C7463kC.this.q1.i(this.Z + 1) <= this.Y.E()) {
                return -3;
            }
            a();
            return this.Y.T(c2899Ex0, c9267rW, i, C7463kC.this.r1);
        }

        @Override // o.IX1
        public int n(long j) {
            if (C7463kC.this.G()) {
                return 0;
            }
            int G = this.Y.G(j, C7463kC.this.r1);
            if (C7463kC.this.q1 != null) {
                G = Math.min(G, C7463kC.this.q1.i(this.Z + 1) - this.Y.E());
            }
            this.Y.f0(G);
            if (G > 0) {
                a();
            }
            return G;
        }

        @Override // o.IX1
        public void b() {
        }
    }
}
