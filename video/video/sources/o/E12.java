package o;

import android.os.Handler;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC7373jp2;
import o.InterfaceC4410Ug1;
import o.InterfaceC7583kh1;
import o.InterfaceC8921q70;
import o.InterfaceC9309rh1;
import o.J6;

@Deprecated
/* loaded from: classes2.dex */
public final class E12 extends AbstractC10541wl implements InterfaceC7583kh1.c, InterfaceC9309rh1, InterfaceC8921q70 {
    public final InterfaceC7583kh1 c1;
    @InterfaceC11300zs1
    public final a g1;
    @InterfaceC8710pF0("this")
    @InterfaceC11300zs1
    public Handler h1;
    @InterfaceC11300zs1
    public e i1;
    public final V01<Pair<Long, Object>, e> d1 = C10756xe.I();
    public AbstractC6044eO0<Object, J6> j1 = AbstractC6044eO0.u();
    public final InterfaceC9309rh1.a e1 = b0(null);
    public final InterfaceC8921q70.a f1 = Y(null);

    /* loaded from: classes2.dex */
    public interface a {
        boolean a(AbstractC7373jp2 abstractC7373jp2);
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC4410Ug1 {
        public final e X;
        public final InterfaceC7583kh1.b Y;
        public final InterfaceC8921q70.a Y0;
        public final InterfaceC9309rh1.a Z;
        public InterfaceC4410Ug1.a Z0;
        public long a1;
        public boolean[] b1 = new boolean[0];
        public boolean c1;

        public b(e eVar, InterfaceC7583kh1.b bVar, InterfaceC9309rh1.a aVar, InterfaceC8921q70.a aVar2) {
            this.X = eVar;
            this.Y = bVar;
            this.Z = aVar;
            this.Y0 = aVar2;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public boolean a() {
            return this.X.t(this);
        }

        public void b() {
            InterfaceC4410Ug1.a aVar = this.Z0;
            if (aVar != null) {
                aVar.j(this);
            }
            this.c1 = true;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public long c() {
            return this.X.p(this);
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public boolean d(long j) {
            return this.X.f(this, j);
        }

        @Override // o.InterfaceC4410Ug1
        public long e(long j, LZ1 lz1) {
            return this.X.i(this, j, lz1);
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public long f() {
            return this.X.k(this);
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public void g(long j) {
            this.X.G(this, j);
        }

        @Override // o.InterfaceC4410Ug1
        public List<C3031Gd2> h(List<InterfaceC6859hi0> list) {
            return this.X.q(list);
        }

        @Override // o.InterfaceC4410Ug1
        public long i(long j) {
            return this.X.J(this, j);
        }

        @Override // o.InterfaceC4410Ug1
        public long k() {
            return this.X.F(this);
        }

        @Override // o.InterfaceC4410Ug1
        public void m() throws IOException {
            this.X.y();
        }

        @Override // o.InterfaceC4410Ug1
        public void o(InterfaceC4410Ug1.a aVar, long j) {
            this.Z0 = aVar;
            this.X.D(this, j);
        }

        @Override // o.InterfaceC4410Ug1
        public C10079ur2 q() {
            return this.X.s();
        }

        @Override // o.InterfaceC4410Ug1
        public void r(long j, boolean z) {
            this.X.g(this, j, z);
        }

        @Override // o.InterfaceC4410Ug1
        public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
            if (this.b1.length == 0) {
                this.b1 = new boolean[ix1Arr.length];
            }
            return this.X.K(this, interfaceC6859hi0Arr, zArr, ix1Arr, zArr2, j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements IX1 {
        public final b X;
        public final int Y;

        public c(b bVar, int i) {
            this.X = bVar;
            this.Y = i;
        }

        @Override // o.IX1
        public void b() throws IOException {
            this.X.X.x(this.Y);
        }

        @Override // o.IX1
        public boolean isReady() {
            return this.X.X.u(this.Y);
        }

        @Override // o.IX1
        public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            b bVar = this.X;
            return bVar.X.E(bVar, this.Y, c2899Ex0, c9267rW, i);
        }

        @Override // o.IX1
        public int n(long j) {
            b bVar = this.X;
            return bVar.X.L(bVar, this.Y, j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends AbstractC3696My0 {
        public final AbstractC6044eO0<Object, J6> b1;

        public d(AbstractC7373jp2 abstractC7373jp2, AbstractC6044eO0<Object, J6> abstractC6044eO0) {
            super(abstractC7373jp2);
            boolean z;
            if (abstractC7373jp2.w() == 1) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
            for (int i = 0; i < abstractC7373jp2.n(); i++) {
                abstractC7373jp2.l(i, bVar, true);
                C9542sf.i(abstractC6044eO0.containsKey(C9542sf.g(bVar.Y)));
            }
            this.b1 = abstractC6044eO0;
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            long f;
            super.l(i, bVar, true);
            J6 j6 = (J6) C9542sf.g(this.b1.get(bVar.Y));
            long j = bVar.Y0;
            if (j == C10323vs.b) {
                f = j6.Y0;
            } else {
                f = F12.f(j, -1, j6);
            }
            long j2 = f;
            AbstractC7373jp2.b bVar2 = new AbstractC7373jp2.b();
            long j3 = 0;
            for (int i2 = 0; i2 < i + 1; i2++) {
                this.a1.l(i2, bVar2, true);
                J6 j62 = (J6) C9542sf.g(this.b1.get(bVar2.Y));
                if (i2 == 0) {
                    j3 = -F12.f(-bVar2.t(), -1, j62);
                }
                if (i2 != i) {
                    j3 += F12.f(bVar2.Y0, -1, j62);
                }
            }
            bVar.z(bVar.X, bVar.Y, bVar.Z, j2, j3, j6, bVar.a1);
            return bVar;
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            super.v(i, dVar, j);
            AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
            J6 j6 = (J6) C9542sf.g(this.b1.get(C9542sf.g(l(dVar.j1, bVar, true).Y)));
            long f = F12.f(dVar.l1, -1, j6);
            if (dVar.i1 == C10323vs.b) {
                long j2 = j6.Y0;
                if (j2 != C10323vs.b) {
                    dVar.i1 = j2 - f;
                }
            } else {
                AbstractC7373jp2.b l = super.l(dVar.k1, bVar, true);
                long j3 = l.Z0;
                AbstractC7373jp2.b k = k(dVar.k1, bVar);
                dVar.i1 = k.Z0 + F12.f(dVar.i1 - j3, -1, (J6) C9542sf.g(this.b1.get(l.Y)));
            }
            dVar.l1 = f;
            return dVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC4410Ug1.a {
        public final InterfaceC4410Ug1 X;
        public final Object Y0;
        public J6 Z0;
        @InterfaceC11300zs1
        public b a1;
        public boolean b1;
        public boolean c1;
        public final List<b> Y = new ArrayList();
        public final Map<Long, Pair<N11, C10519wf1>> Z = new HashMap();
        public InterfaceC6859hi0[] d1 = new InterfaceC6859hi0[0];
        public IX1[] e1 = new IX1[0];
        public C10519wf1[] f1 = new C10519wf1[0];

        public e(InterfaceC4410Ug1 interfaceC4410Ug1, Object obj, J6 j6) {
            this.X = interfaceC4410Ug1;
            this.Y0 = obj;
            this.Z0 = j6;
        }

        public void A(b bVar, C10519wf1 c10519wf1) {
            int h = h(c10519wf1);
            if (h != -1) {
                this.f1[h] = c10519wf1;
                bVar.b1[h] = true;
            }
        }

        public void B(N11 n11) {
            this.Z.remove(Long.valueOf(n11.a));
        }

        public void C(N11 n11, C10519wf1 c10519wf1) {
            this.Z.put(Long.valueOf(n11.a), Pair.create(n11, c10519wf1));
        }

        public void D(b bVar, long j) {
            bVar.a1 = j;
            if (this.b1) {
                if (this.c1) {
                    bVar.b();
                    return;
                }
                return;
            }
            this.b1 = true;
            this.X.o(this, F12.g(j, bVar.Y, this.Z0));
        }

        public int E(b bVar, int i, C2899Ex0 c2899Ex0, C9267rW c9267rW, int i2) {
            long k = k(bVar);
            int j = ((IX1) TD2.o(this.e1[i])).j(c2899Ex0, c9267rW, i2 | 5);
            long o2 = o(bVar, c9267rW.a1);
            if ((j == -4 && o2 == Long.MIN_VALUE) || (j == -3 && k == Long.MIN_VALUE && !c9267rW.Z0)) {
                w(bVar, i);
                c9267rW.l();
                c9267rW.j(4);
                return -4;
            }
            if (j == -4) {
                w(bVar, i);
                ((IX1) TD2.o(this.e1[i])).j(c2899Ex0, c9267rW, i2);
                c9267rW.a1 = o2;
            }
            return j;
        }

        public long F(b bVar) {
            if (!bVar.equals(this.Y.get(0))) {
                return C10323vs.b;
            }
            long k = this.X.k();
            if (k == C10323vs.b) {
                return C10323vs.b;
            }
            return F12.d(k, bVar.Y, this.Z0);
        }

        public void G(b bVar, long j) {
            this.X.g(r(bVar, j));
        }

        public void H(InterfaceC7583kh1 interfaceC7583kh1) {
            interfaceC7583kh1.s(this.X);
        }

        public void I(b bVar) {
            if (bVar.equals(this.a1)) {
                this.a1 = null;
                this.Z.clear();
            }
            this.Y.remove(bVar);
        }

        public long J(b bVar, long j) {
            return F12.d(this.X.i(F12.g(j, bVar.Y, this.Z0)), bVar.Y, this.Z0);
        }

        public long K(b bVar, InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
            IX1 c7801lb0;
            IX1[] ix1Arr2;
            bVar.a1 = j;
            if (bVar.equals(this.Y.get(0))) {
                this.d1 = (InterfaceC6859hi0[]) Arrays.copyOf(interfaceC6859hi0Arr, interfaceC6859hi0Arr.length);
                long g = F12.g(j, bVar.Y, this.Z0);
                IX1[] ix1Arr3 = this.e1;
                if (ix1Arr3.length == 0) {
                    ix1Arr2 = new IX1[interfaceC6859hi0Arr.length];
                } else {
                    ix1Arr2 = (IX1[]) Arrays.copyOf(ix1Arr3, ix1Arr3.length);
                }
                IX1[] ix1Arr4 = ix1Arr2;
                long s = this.X.s(interfaceC6859hi0Arr, zArr, ix1Arr4, zArr2, g);
                this.e1 = (IX1[]) Arrays.copyOf(ix1Arr4, ix1Arr4.length);
                this.f1 = (C10519wf1[]) Arrays.copyOf(this.f1, ix1Arr4.length);
                for (int i = 0; i < ix1Arr4.length; i++) {
                    if (ix1Arr4[i] == null) {
                        ix1Arr[i] = null;
                        this.f1[i] = null;
                    } else if (ix1Arr[i] == null || zArr2[i]) {
                        ix1Arr[i] = new c(bVar, i);
                        this.f1[i] = null;
                    }
                }
                return F12.d(s, bVar.Y, this.Z0);
            }
            for (int i2 = 0; i2 < interfaceC6859hi0Arr.length; i2++) {
                InterfaceC6859hi0 interfaceC6859hi0 = interfaceC6859hi0Arr[i2];
                boolean z = true;
                if (interfaceC6859hi0 != null) {
                    if (zArr[i2] && ix1Arr[i2] != null) {
                        z = false;
                    }
                    zArr2[i2] = z;
                    if (z) {
                        if (TD2.g(this.d1[i2], interfaceC6859hi0)) {
                            c7801lb0 = new c(bVar, i2);
                        } else {
                            c7801lb0 = new C7801lb0();
                        }
                        ix1Arr[i2] = c7801lb0;
                    }
                } else {
                    ix1Arr[i2] = null;
                    zArr2[i2] = true;
                }
            }
            return j;
        }

        public int L(b bVar, int i, long j) {
            return ((IX1) TD2.o(this.e1[i])).n(F12.g(j, bVar.Y, this.Z0));
        }

        public void M(J6 j6) {
            this.Z0 = j6;
        }

        public void d(b bVar) {
            this.Y.add(bVar);
        }

        public boolean e(InterfaceC7583kh1.b bVar, long j) {
            b bVar2 = (b) C5098aU0.w(this.Y);
            if (F12.g(j, bVar, this.Z0) == F12.g(E12.y0(bVar2, this.Z0), bVar2.Y, this.Z0)) {
                return true;
            }
            return false;
        }

        public boolean f(b bVar, long j) {
            b bVar2 = this.a1;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                for (Pair<N11, C10519wf1> pair : this.Z.values()) {
                    bVar2.Z.o((N11) pair.first, E12.w0(bVar2, (C10519wf1) pair.second, this.Z0));
                    bVar.Z.u((N11) pair.first, E12.w0(bVar, (C10519wf1) pair.second, this.Z0));
                }
            }
            this.a1 = bVar;
            return this.X.d(r(bVar, j));
        }

        public void g(b bVar, long j, boolean z) {
            this.X.r(F12.g(j, bVar.Y, this.Z0), z);
        }

        public final int h(C10519wf1 c10519wf1) {
            boolean z;
            String str;
            if (c10519wf1.c == null) {
                return -1;
            }
            int i = 0;
            loop0: while (true) {
                InterfaceC6859hi0[] interfaceC6859hi0Arr = this.d1;
                if (i >= interfaceC6859hi0Arr.length) {
                    return -1;
                }
                InterfaceC6859hi0 interfaceC6859hi0 = interfaceC6859hi0Arr[i];
                if (interfaceC6859hi0 != null) {
                    C9593sr2 n = interfaceC6859hi0.n();
                    if (c10519wf1.b == 0 && n.equals(s().b(0))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i2 = 0; i2 < n.X; i2++) {
                        C10833xx0 c = n.c(i2);
                        if (c.equals(c10519wf1.c) || (z && (str = c.X) != null && str.equals(c10519wf1.c.X))) {
                            break loop0;
                        }
                    }
                    continue;
                }
                i++;
            }
            return i;
        }

        public long i(b bVar, long j, LZ1 lz1) {
            return F12.d(this.X.e(F12.g(j, bVar.Y, this.Z0), lz1), bVar.Y, this.Z0);
        }

        @Override // o.InterfaceC4410Ug1.a
        public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
            this.c1 = true;
            for (int i = 0; i < this.Y.size(); i++) {
                this.Y.get(i).b();
            }
        }

        public long k(b bVar) {
            return o(bVar, this.X.f());
        }

        @InterfaceC11300zs1
        public b m(@InterfaceC11300zs1 C10519wf1 c10519wf1) {
            if (c10519wf1 != null && c10519wf1.f != C10323vs.b) {
                for (int i = 0; i < this.Y.size(); i++) {
                    b bVar = this.Y.get(i);
                    if (bVar.c1) {
                        long d = F12.d(TD2.j1(c10519wf1.f), bVar.Y, this.Z0);
                        long y0 = E12.y0(bVar, this.Z0);
                        if (d >= 0 && d < y0) {
                            return bVar;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        public final long o(b bVar, long j) {
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long d = F12.d(j, bVar.Y, this.Z0);
            if (d >= E12.y0(bVar, this.Z0)) {
                return Long.MIN_VALUE;
            }
            return d;
        }

        public long p(b bVar) {
            return o(bVar, this.X.c());
        }

        public List<C3031Gd2> q(List<InterfaceC6859hi0> list) {
            return this.X.h(list);
        }

        public final long r(b bVar, long j) {
            long j2 = bVar.a1;
            if (j < j2) {
                return F12.g(j2, bVar.Y, this.Z0) - (bVar.a1 - j);
            }
            return F12.g(j, bVar.Y, this.Z0);
        }

        public C10079ur2 s() {
            return this.X.q();
        }

        public boolean t(b bVar) {
            if (bVar.equals(this.a1) && this.X.a()) {
                return true;
            }
            return false;
        }

        public boolean u(int i) {
            return ((IX1) TD2.o(this.e1[i])).isReady();
        }

        public boolean v() {
            return this.Y.isEmpty();
        }

        public final void w(b bVar, int i) {
            C10519wf1 c10519wf1;
            boolean[] zArr = bVar.b1;
            if (!zArr[i] && (c10519wf1 = this.f1[i]) != null) {
                zArr[i] = true;
                bVar.Z.i(E12.w0(bVar, c10519wf1, this.Z0));
            }
        }

        public void x(int i) throws IOException {
            ((IX1) TD2.o(this.e1[i])).b();
        }

        public void y() throws IOException {
            this.X.m();
        }

        @Override // o.G02.a
        /* renamed from: z */
        public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
            b bVar = this.a1;
            if (bVar == null) {
                return;
            }
            ((InterfaceC4410Ug1.a) C9542sf.g(bVar.Z0)).l(this.a1);
        }
    }

    public E12(InterfaceC7583kh1 interfaceC7583kh1, @InterfaceC11300zs1 a aVar) {
        this.c1 = interfaceC7583kh1;
        this.g1 = aVar;
    }

    public static /* synthetic */ void r0(E12 e12, AbstractC6044eO0 abstractC6044eO0, AbstractC7373jp2 abstractC7373jp2) {
        J6 j6;
        for (e eVar : e12.d1.values()) {
            J6 j62 = (J6) abstractC6044eO0.get(eVar.Y0);
            if (j62 != null) {
                eVar.M(j62);
            }
        }
        e eVar2 = e12.i1;
        if (eVar2 != null && (j6 = (J6) abstractC6044eO0.get(eVar2.Y0)) != null) {
            e12.i1.M(j6);
        }
        e12.j1 = abstractC6044eO0;
        e12.p0(new d(abstractC7373jp2, abstractC6044eO0));
    }

    public static C10519wf1 w0(b bVar, C10519wf1 c10519wf1, J6 j6) {
        return new C10519wf1(c10519wf1.a, c10519wf1.b, c10519wf1.c, c10519wf1.d, c10519wf1.e, x0(c10519wf1.f, bVar, j6), x0(c10519wf1.g, bVar, j6));
    }

    public static long x0(long j, b bVar, J6 j6) {
        long f;
        if (j == C10323vs.b) {
            return C10323vs.b;
        }
        long j1 = TD2.j1(j);
        InterfaceC7583kh1.b bVar2 = bVar.Y;
        if (bVar2.c()) {
            f = F12.e(j1, bVar2.b, bVar2.c, j6);
        } else {
            f = F12.f(j1, -1, j6);
        }
        return TD2.b2(f);
    }

    public static long y0(b bVar, J6 j6) {
        InterfaceC7583kh1.b bVar2 = bVar.Y;
        if (bVar2.c()) {
            J6.b g = j6.g(bVar2.b);
            if (g.Y == -1) {
                return 0L;
            }
            return g.a1[bVar2.c];
        }
        int i = bVar2.e;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        long j = j6.g(i).X;
        if (j == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j;
    }

    public final void A0() {
        e eVar = this.i1;
        if (eVar != null) {
            eVar.H(this.c1);
            this.i1 = null;
        }
    }

    public void B0(final AbstractC6044eO0<Object, J6> abstractC6044eO0, final AbstractC7373jp2 abstractC7373jp2) {
        boolean z;
        boolean z2;
        boolean z3;
        C9542sf.a(!abstractC6044eO0.isEmpty());
        Object g = C9542sf.g(abstractC6044eO0.values().d().get(0).X);
        AbstractC6237fB2<Map.Entry<Object, J6>> it = abstractC6044eO0.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, J6> next = it.next();
            Object key = next.getKey();
            J6 value = next.getValue();
            C9542sf.a(TD2.g(g, value.X));
            J6 j6 = this.j1.get(key);
            if (j6 != null) {
                for (int i = value.Z0; i < value.Y; i++) {
                    J6.b g2 = value.g(i);
                    C9542sf.a(g2.c1);
                    if (i < j6.Y && F12.c(value, i) < F12.c(j6, i)) {
                        J6.b g3 = value.g(i + 1);
                        if (g2.b1 + g3.b1 == j6.g(i).b1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C9542sf.a(z2);
                        if (g2.X + g2.b1 == g3.X) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C9542sf.a(z3);
                    }
                    if (g2.X == Long.MIN_VALUE) {
                        if (F12.c(value, i) == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C9542sf.a(z);
                    }
                }
            }
        }
        synchronized (this) {
            try {
                Handler handler = this.h1;
                if (handler == null) {
                    this.j1 = abstractC6044eO0;
                } else {
                    handler.post(new Runnable() { // from class: o.D12
                        @Override // java.lang.Runnable
                        public final void run() {
                            E12.r0(E12.this, abstractC6044eO0, abstractC7373jp2);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC7583kh1.c
    public void L(InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2) {
        a aVar = this.g1;
        if ((aVar == null || !aVar.a(abstractC7373jp2)) && !this.j1.isEmpty()) {
            p0(new d(abstractC7373jp2, this.j1));
        }
    }

    @Override // o.InterfaceC7583kh1
    public void Q() throws IOException {
        this.c1.Q();
    }

    @Override // o.InterfaceC8921q70
    public void d0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        b z0 = z0(bVar, null, false);
        if (z0 == null) {
            this.f1.h();
        } else {
            z0.Y0.h();
        }
    }

    @Override // o.InterfaceC8921q70
    public void e(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        b z0 = z0(bVar, null, false);
        if (z0 == null) {
            this.f1.i();
        } else {
            z0.Y0.i();
        }
    }

    @Override // o.AbstractC10541wl
    public void e0() {
        A0();
        this.c1.T(this);
    }

    @Override // o.InterfaceC9309rh1
    public void f0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
        b z0 = z0(bVar, c10519wf1, true);
        if (z0 == null) {
            this.e1.u(n11, c10519wf1);
            return;
        }
        z0.X.C(n11, c10519wf1);
        z0.Z.u(n11, w0(z0, c10519wf1, (J6) C9542sf.g(this.j1.get(z0.Y.a))));
    }

    @Override // o.AbstractC10541wl
    public void g0() {
        this.c1.A(this);
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        e eVar;
        Pair<Long, Object> pair = new Pair<>(Long.valueOf(bVar.d), bVar.a);
        e eVar2 = this.i1;
        boolean z = false;
        if (eVar2 != null) {
            if (eVar2.Y0.equals(bVar.a)) {
                eVar = this.i1;
                this.d1.put(pair, eVar);
                z = true;
            } else {
                this.i1.H(this.c1);
                eVar = null;
            }
            this.i1 = null;
        } else {
            eVar = null;
        }
        if (eVar == null && ((eVar = (e) C5098aU0.x(this.d1.get((V01<Pair<Long, Object>, e>) pair), null)) == null || !eVar.e(bVar, j))) {
            J6 j6 = (J6) C9542sf.g(this.j1.get(bVar.a));
            e eVar3 = new e(this.c1.h(new InterfaceC7583kh1.b(bVar.a, bVar.d), interfaceC10877y8, F12.g(j, bVar, j6)), bVar.a, j6);
            this.d1.put(pair, eVar3);
            eVar = eVar3;
        }
        b bVar2 = new b(eVar, bVar, b0(bVar), Y(bVar));
        eVar.d(bVar2);
        if (z && eVar.d1.length > 0) {
            bVar2.i(j);
        }
        return bVar2;
    }

    @Override // o.InterfaceC9309rh1
    public void h0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1, IOException iOException, boolean z) {
        b z0 = z0(bVar, c10519wf1, true);
        if (z0 == null) {
            this.e1.r(n11, c10519wf1, iOException, z);
            return;
        }
        if (z) {
            z0.X.B(n11);
        }
        z0.Z.r(n11, w0(z0, c10519wf1, (J6) C9542sf.g(this.j1.get(z0.Y.a))), iOException, z);
    }

    @Override // o.InterfaceC9309rh1
    public void i(int i, InterfaceC7583kh1.b bVar, C10519wf1 c10519wf1) {
        b z0 = z0(bVar, c10519wf1, false);
        if (z0 == null) {
            this.e1.x(c10519wf1);
        } else {
            z0.Z.x(w0(z0, c10519wf1, (J6) C9542sf.g(this.j1.get(z0.Y.a))));
        }
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.c1.k();
    }

    @Override // o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        Handler C = TD2.C();
        synchronized (this) {
            this.h1 = C;
        }
        this.c1.V(C, this);
        this.c1.m(C, this);
        this.c1.G(this, interfaceC4261Sr2, i0());
    }

    @Override // o.InterfaceC8921q70
    public void l(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, int i2) {
        b z0 = z0(bVar, null, true);
        if (z0 == null) {
            this.f1.k(i2);
        } else {
            z0.Y0.k(i2);
        }
    }

    @Override // o.InterfaceC9309rh1
    public void m0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
        b z0 = z0(bVar, c10519wf1, true);
        if (z0 == null) {
            this.e1.l(n11, c10519wf1);
            return;
        }
        z0.X.B(n11);
        z0.Z.l(n11, w0(z0, c10519wf1, (J6) C9542sf.g(this.j1.get(z0.Y.a))));
    }

    @Override // o.InterfaceC8921q70
    public void n(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, Exception exc) {
        b z0 = z0(bVar, null, false);
        if (z0 == null) {
            this.f1.l(exc);
        } else {
            z0.Y0.l(exc);
        }
    }

    @Override // o.InterfaceC8921q70
    public void n0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        b z0 = z0(bVar, null, false);
        if (z0 == null) {
            this.f1.m();
        } else {
            z0.Y0.m();
        }
    }

    @Override // o.InterfaceC9309rh1
    public void p(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, C10519wf1 c10519wf1) {
        b z0 = z0(bVar, c10519wf1, false);
        if (z0 == null) {
            this.e1.i(c10519wf1);
            return;
        }
        z0.X.A(z0, c10519wf1);
        z0.Z.i(w0(z0, c10519wf1, (J6) C9542sf.g(this.j1.get(z0.Y.a))));
    }

    @Override // o.AbstractC10541wl
    public void q0() {
        A0();
        synchronized (this) {
            this.h1 = null;
        }
        this.c1.u(this);
        this.c1.U(this);
        this.c1.o(this);
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        b bVar = (b) interfaceC4410Ug1;
        bVar.X.I(bVar);
        if (bVar.X.v()) {
            this.d1.remove(new Pair(Long.valueOf(bVar.Y.d), bVar.Y.a), bVar.X);
            if (this.d1.isEmpty()) {
                this.i1 = bVar.X;
            } else {
                bVar.X.H(this.c1);
            }
        }
    }

    @Override // o.InterfaceC8921q70
    public void u0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        b z0 = z0(bVar, null, false);
        if (z0 == null) {
            this.f1.j();
        } else {
            z0.Y0.j();
        }
    }

    @Override // o.InterfaceC9309rh1
    public void y(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
        b z0 = z0(bVar, c10519wf1, true);
        if (z0 == null) {
            this.e1.o(n11, c10519wf1);
            return;
        }
        z0.X.B(n11);
        z0.Z.o(n11, w0(z0, c10519wf1, (J6) C9542sf.g(this.j1.get(z0.Y.a))));
    }

    @InterfaceC11300zs1
    public final b z0(@InterfaceC11300zs1 InterfaceC7583kh1.b bVar, @InterfaceC11300zs1 C10519wf1 c10519wf1, boolean z) {
        if (bVar == null) {
            return null;
        }
        List<e> list = this.d1.get((V01<Pair<Long, Object>, e>) new Pair<>(Long.valueOf(bVar.d), bVar.a));
        if (list.isEmpty()) {
            return null;
        }
        if (z) {
            e eVar = (e) C5098aU0.w(list);
            if (eVar.a1 != null) {
                return eVar.a1;
            }
            return (b) C5098aU0.w(eVar.Y);
        }
        for (int i = 0; i < list.size(); i++) {
            b m = list.get(i).m(c10519wf1);
            if (m != null) {
                return m;
            }
        }
        return (b) list.get(0).Y.get(0);
    }
}
