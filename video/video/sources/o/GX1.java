package o;

import android.os.Looper;
import java.io.IOException;
import o.GX1;
import o.InterfaceC10568wr2;
import o.InterfaceC7201j70;
import o.InterfaceC8921q70;
import o.InterfaceC9170r70;

@Deprecated
/* loaded from: classes2.dex */
public class GX1 implements InterfaceC10568wr2 {
    @InterfaceC5056aJ2
    public static final int K = 1000;
    public static final String L = "SampleQueue";
    public boolean C;
    @InterfaceC11300zs1
    public C10833xx0 D;
    @InterfaceC11300zs1
    public C10833xx0 E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public final EX1 d;
    @InterfaceC11300zs1
    public final InterfaceC9170r70 g;
    @InterfaceC11300zs1
    public final InterfaceC8921q70.a h;
    @InterfaceC11300zs1
    public d i;
    @InterfaceC11300zs1
    public C10833xx0 j;
    @InterfaceC11300zs1
    public InterfaceC7201j70 k;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean z;
    public final b e = new b();
    public int l = 1000;
    public long[] m = new long[1000];
    public long[] n = new long[1000];
    public long[] q = new long[1000];
    public int[] p = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    public int[] f475o = new int[1000];
    public InterfaceC10568wr2.a[] r = new InterfaceC10568wr2.a[1000];
    public final C10011ua2<c> f = new C10011ua2<>(new InterfaceC10686xL() { // from class: o.FX1
        @Override // o.InterfaceC10686xL
        public final void accept(Object obj) {
            ((GX1.c) obj).b.g();
        }
    });
    public long w = Long.MIN_VALUE;
    public long x = Long.MIN_VALUE;
    public long y = Long.MIN_VALUE;
    public boolean B = true;
    public boolean A = true;

    /* loaded from: classes2.dex */
    public static final class b {
        public int a;
        public long b;
        @InterfaceC11300zs1
        public InterfaceC10568wr2.a c;
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final C10833xx0 a;
        public final InterfaceC9170r70.b b;

        public c(C10833xx0 c10833xx0, InterfaceC9170r70.b bVar) {
            this.a = c10833xx0;
            this.b = bVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void j(C10833xx0 c10833xx0);
    }

    public GX1(InterfaceC10877y8 interfaceC10877y8, @InterfaceC11300zs1 InterfaceC9170r70 interfaceC9170r70, @InterfaceC11300zs1 InterfaceC8921q70.a aVar) {
        this.g = interfaceC9170r70;
        this.h = aVar;
        this.d = new EX1(interfaceC10877y8);
    }

    @Deprecated
    public static GX1 k(InterfaceC10877y8 interfaceC10877y8, Looper looper, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar) {
        interfaceC9170r70.e(looper, ND1.b);
        return new GX1(interfaceC10877y8, (InterfaceC9170r70) C9542sf.g(interfaceC9170r70), (InterfaceC8921q70.a) C9542sf.g(aVar));
    }

    public static GX1 l(InterfaceC10877y8 interfaceC10877y8, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar) {
        return new GX1(interfaceC10877y8, (InterfaceC9170r70) C9542sf.g(interfaceC9170r70), (InterfaceC8921q70.a) C9542sf.g(aVar));
    }

    public static GX1 m(InterfaceC10877y8 interfaceC10877y8) {
        return new GX1(interfaceC10877y8, null, null);
    }

    public final synchronized long A() {
        long j;
        if (this.s == 0) {
            j = Long.MIN_VALUE;
        } else {
            j = this.q[this.u];
        }
        return j;
    }

    public final synchronized long B() {
        return this.y;
    }

    public final synchronized long C() {
        return Math.max(this.x, D(this.v));
    }

    public final long D(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int F = F(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.q[F]);
            if ((this.p[F] & 1) != 0) {
                return j;
            }
            F--;
            if (F == -1) {
                F = this.l - 1;
            }
        }
        return j;
    }

    public final int E() {
        return this.t + this.v;
    }

    public final int F(int i) {
        int i2 = this.u + i;
        int i3 = this.l;
        if (i2 < i3) {
            return i2;
        }
        return i2 - i3;
    }

    public final synchronized int G(long j, boolean z) {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int F = F(this.v);
            if (!J() || j < this.q[F]) {
                return 0;
            }
            if (j > this.y && z) {
                try {
                    return this.s - this.v;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            int x = x(F, this.s - this.v, j, true);
            if (x == -1) {
                return 0;
            }
            return x;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @InterfaceC11300zs1
    public final synchronized C10833xx0 H() {
        C10833xx0 c10833xx0;
        if (this.B) {
            c10833xx0 = null;
        } else {
            c10833xx0 = this.E;
        }
        return c10833xx0;
    }

    public final int I() {
        return this.t + this.s;
    }

    public final boolean J() {
        if (this.v != this.s) {
            return true;
        }
        return false;
    }

    public final void K() {
        this.C = true;
    }

    public final synchronized boolean L() {
        return this.z;
    }

    @InterfaceC2591Bt
    public synchronized boolean M(boolean z) {
        C10833xx0 c10833xx0;
        boolean z2 = true;
        if (!J()) {
            if (!z && !this.z && ((c10833xx0 = this.E) == null || c10833xx0 == this.j)) {
                z2 = false;
            }
            return z2;
        } else if (this.f.f(E()).a != this.j) {
            return true;
        } else {
            return N(F(this.v));
        }
    }

    public final boolean N(int i) {
        InterfaceC7201j70 interfaceC7201j70 = this.k;
        if (interfaceC7201j70 != null && interfaceC7201j70.getState() != 4) {
            if ((this.p[i] & 1073741824) != 0 || !this.k.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @InterfaceC2591Bt
    public void O() throws IOException {
        InterfaceC7201j70 interfaceC7201j70 = this.k;
        if (interfaceC7201j70 != null && interfaceC7201j70.getState() == 1) {
            throw ((InterfaceC7201j70.a) C9542sf.g(this.k.i()));
        }
    }

    public final void P(C10833xx0 c10833xx0, C2899Ex0 c2899Ex0) {
        boolean z;
        C6960i70 c6960i70;
        C10833xx0 c10833xx02;
        C10833xx0 c10833xx03 = this.j;
        if (c10833xx03 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c6960i70 = null;
        } else {
            c6960i70 = c10833xx03.j1;
        }
        this.j = c10833xx0;
        C6960i70 c6960i702 = c10833xx0.j1;
        InterfaceC9170r70 interfaceC9170r70 = this.g;
        if (interfaceC9170r70 != null) {
            c10833xx02 = c10833xx0.c(interfaceC9170r70.d(c10833xx0));
        } else {
            c10833xx02 = c10833xx0;
        }
        c2899Ex0.b = c10833xx02;
        c2899Ex0.a = this.k;
        if (this.g != null) {
            if (z || !TD2.g(c6960i70, c6960i702)) {
                InterfaceC7201j70 interfaceC7201j70 = this.k;
                InterfaceC7201j70 a2 = this.g.a(this.h, c10833xx0);
                this.k = a2;
                c2899Ex0.a = a2;
                if (interfaceC7201j70 != null) {
                    interfaceC7201j70.h(this.h);
                }
            }
        }
    }

    public final synchronized int Q(C2899Ex0 c2899Ex0, C9267rW c9267rW, boolean z, boolean z2, b bVar) {
        try {
            c9267rW.Z0 = false;
            if (!J()) {
                if (!z2 && !this.z) {
                    C10833xx0 c10833xx0 = this.E;
                    if (c10833xx0 == null || (!z && c10833xx0 == this.j)) {
                        return -3;
                    }
                    P((C10833xx0) C9542sf.g(c10833xx0), c2899Ex0);
                    return -5;
                }
                c9267rW.u(4);
                return -4;
            }
            C10833xx0 c10833xx02 = this.f.f(E()).a;
            if (!z && c10833xx02 == this.j) {
                int F = F(this.v);
                if (!N(F)) {
                    c9267rW.Z0 = true;
                    return -3;
                }
                c9267rW.u(this.p[F]);
                if (this.v == this.s - 1 && (z2 || this.z)) {
                    c9267rW.j(536870912);
                }
                long j = this.q[F];
                c9267rW.a1 = j;
                if (j < this.w) {
                    c9267rW.j(Integer.MIN_VALUE);
                }
                bVar.a = this.f475o[F];
                bVar.b = this.n[F];
                bVar.c = this.r[F];
                return -4;
            }
            P(c10833xx02, c2899Ex0);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long R() {
        long j;
        try {
            int F = F(this.v);
            if (J()) {
                j = this.m[F];
            } else {
                j = this.F;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    @InterfaceC2591Bt
    public void S() {
        s();
        V();
    }

    @InterfaceC2591Bt
    public int T(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int Q = Q(c2899Ex0, c9267rW, z2, z, this.e);
        if (Q == -4 && !c9267rW.q()) {
            if ((i & 1) != 0) {
                z3 = true;
            }
            if ((i & 4) == 0) {
                if (z3) {
                    this.d.f(c9267rW, this.e);
                } else {
                    this.d.m(c9267rW, this.e);
                }
            }
            if (!z3) {
                this.v++;
            }
        }
        return Q;
    }

    @InterfaceC2591Bt
    public void U() {
        X(true);
        V();
    }

    public final void V() {
        InterfaceC7201j70 interfaceC7201j70 = this.k;
        if (interfaceC7201j70 != null) {
            interfaceC7201j70.h(this.h);
            this.k = null;
            this.j = null;
        }
    }

    public final void W() {
        X(false);
    }

    @InterfaceC2591Bt
    public void X(boolean z) {
        this.d.n();
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.A = true;
        this.w = Long.MIN_VALUE;
        this.x = Long.MIN_VALUE;
        this.y = Long.MIN_VALUE;
        this.z = false;
        this.f.c();
        if (z) {
            this.D = null;
            this.E = null;
            this.B = true;
        }
    }

    public final synchronized void Y() {
        this.v = 0;
        this.d.o();
    }

    public final synchronized boolean Z(int i) {
        Y();
        int i2 = this.t;
        if (i >= i2 && i <= this.s + i2) {
            this.w = Long.MIN_VALUE;
            this.v = i - i2;
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10568wr2
    public final void a(C10833xx0 c10833xx0) {
        C10833xx0 y = y(c10833xx0);
        this.C = false;
        this.D = c10833xx0;
        boolean d0 = d0(y);
        d dVar = this.i;
        if (dVar != null && d0) {
            dVar.j(y);
        }
    }

    public final synchronized boolean a0(long j, boolean z) {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            Y();
            int F = F(this.v);
            if (!J() || j < this.q[F] || (j > this.y && !z)) {
                return false;
            }
            int x = x(F, this.s - this.v, j, true);
            if (x == -1) {
                return false;
            }
            this.w = j;
            this.v += x;
            return true;
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    @Override // o.InterfaceC10568wr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(long j, int i, int i2, int i3, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
        boolean z;
        int i4;
        if (this.C) {
            a((C10833xx0) C9542sf.k(this.D));
        }
        int i5 = i & 1;
        if (i5 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.A) {
            if (z) {
                this.A = false;
            } else {
                return;
            }
        }
        long j2 = this.I + j;
        if (this.G) {
            if (j2 >= this.w) {
                if (i5 == 0) {
                    if (!this.H) {
                        I31.n(L, "Overriding unexpected non-sync sample for format: " + this.E);
                        this.H = true;
                    }
                    i4 = i | 1;
                    if (this.J) {
                        if (z && h(j2)) {
                            this.J = false;
                        } else {
                            return;
                        }
                    }
                    i(j2, i4, (this.d.e() - i2) - i3, i2, aVar);
                }
            } else {
                return;
            }
        }
        i4 = i;
        if (this.J) {
        }
        i(j2, i4, (this.d.e() - i2) - i3, i2, aVar);
    }

    public final void b0(long j) {
        if (this.I != j) {
            this.I = j;
            K();
        }
    }

    public final void c0(long j) {
        this.w = j;
    }

    @Override // o.InterfaceC10568wr2
    public final int d(CU cu, int i, boolean z, int i2) throws IOException {
        return this.d.p(cu, i, z);
    }

    public final synchronized boolean d0(C10833xx0 c10833xx0) {
        try {
            this.B = false;
            if (TD2.g(c10833xx0, this.E)) {
                return false;
            }
            if (!this.f.h() && this.f.g().a.equals(c10833xx0)) {
                this.E = this.f.g().a;
            } else {
                this.E = c10833xx0;
            }
            C10833xx0 c10833xx02 = this.E;
            this.G = C4128Rj1.a(c10833xx02.g1, c10833xx02.d1);
            this.H = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e0(@InterfaceC11300zs1 d dVar) {
        this.i = dVar;
    }

    @Override // o.InterfaceC10568wr2
    public final void f(C3012Fy1 c3012Fy1, int i, int i2) {
        this.d.q(c3012Fy1, i);
    }

    public final synchronized void f0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.v + i <= this.s) {
                    z = true;
                    C9542sf.a(z);
                    this.v += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C9542sf.a(z);
        this.v += i;
    }

    public final void g0(long j) {
        this.F = j;
    }

    public final synchronized boolean h(long j) {
        boolean z = false;
        if (this.s == 0) {
            if (j > this.x) {
                z = true;
            }
            return z;
        } else if (C() >= j) {
            return false;
        } else {
            v(this.t + j(j));
            return true;
        }
    }

    public final void h0() {
        this.J = true;
    }

    public final synchronized void i(long j, int i, long j2, int i2, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
        boolean z;
        InterfaceC9170r70.b bVar;
        int F;
        boolean z2;
        try {
            int i3 = this.s;
            if (i3 > 0) {
                if (this.n[F(i3 - 1)] + this.f475o[F] <= j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9542sf.a(z2);
            }
            if ((536870912 & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.z = z;
            this.y = Math.max(this.y, j);
            int F2 = F(this.s);
            this.q[F2] = j;
            this.n[F2] = j2;
            this.f475o[F2] = i2;
            this.p[F2] = i;
            this.r[F2] = aVar;
            this.m[F2] = this.F;
            if (this.f.h() || !this.f.g().a.equals(this.E)) {
                InterfaceC9170r70 interfaceC9170r70 = this.g;
                if (interfaceC9170r70 != null) {
                    bVar = interfaceC9170r70.b(this.h, this.E);
                } else {
                    bVar = InterfaceC9170r70.b.a;
                }
                this.f.b(I(), new c((C10833xx0) C9542sf.g(this.E), bVar));
            }
            int i4 = this.s + 1;
            this.s = i4;
            int i5 = this.l;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                InterfaceC10568wr2.a[] aVarArr = new InterfaceC10568wr2.a[i6];
                int i7 = this.u;
                int i8 = i5 - i7;
                System.arraycopy(this.n, i7, jArr2, 0, i8);
                System.arraycopy(this.q, this.u, jArr3, 0, i8);
                System.arraycopy(this.p, this.u, iArr, 0, i8);
                System.arraycopy(this.f475o, this.u, iArr2, 0, i8);
                System.arraycopy(this.r, this.u, aVarArr, 0, i8);
                System.arraycopy(this.m, this.u, jArr, 0, i8);
                int i9 = this.u;
                System.arraycopy(this.n, 0, jArr2, i8, i9);
                System.arraycopy(this.q, 0, jArr3, i8, i9);
                System.arraycopy(this.p, 0, iArr, i8, i9);
                System.arraycopy(this.f475o, 0, iArr2, i8, i9);
                System.arraycopy(this.r, 0, aVarArr, i8, i9);
                System.arraycopy(this.m, 0, jArr, i8, i9);
                this.n = jArr2;
                this.q = jArr3;
                this.p = iArr;
                this.f475o = iArr2;
                this.r = aVarArr;
                this.m = jArr;
                this.u = 0;
                this.l = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int j(long j) {
        int i = this.s;
        int F = F(i - 1);
        while (i > this.v && this.q[F] >= j) {
            i--;
            F--;
            if (F == -1) {
                F = this.l - 1;
            }
        }
        return i;
    }

    public final synchronized long n(long j, boolean z, boolean z2) {
        Throwable th;
        try {
            try {
                int i = this.s;
                if (i != 0) {
                    long[] jArr = this.q;
                    int i2 = this.u;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.v;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int x = x(i2, i, j, z);
                        if (x == -1) {
                            return -1L;
                        }
                        return q(x);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized long o() {
        int i = this.s;
        if (i == 0) {
            return -1L;
        }
        return q(i);
    }

    public synchronized long p() {
        int i = this.v;
        if (i == 0) {
            return -1L;
        }
        return q(i);
    }

    @InterfaceC8710pF0("this")
    public final long q(int i) {
        int i2;
        this.x = Math.max(this.x, D(i));
        this.s -= i;
        int i3 = this.t + i;
        this.t = i3;
        int i4 = this.u + i;
        this.u = i4;
        int i5 = this.l;
        if (i4 >= i5) {
            this.u = i4 - i5;
        }
        int i6 = this.v - i;
        this.v = i6;
        if (i6 < 0) {
            this.v = 0;
        }
        this.f.e(i3);
        if (this.s == 0) {
            int i7 = this.u;
            if (i7 == 0) {
                i7 = this.l;
            }
            return this.n[i7 - 1] + this.f475o[i2];
        }
        return this.n[this.u];
    }

    public final void r(long j, boolean z, boolean z2) {
        this.d.b(n(j, z, z2));
    }

    public final void s() {
        this.d.b(o());
    }

    public final void t() {
        this.d.b(p());
    }

    public final void u(long j) {
        boolean z;
        if (this.s == 0) {
            return;
        }
        if (j > C()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        w(this.t + j(j));
    }

    public final long v(int i) {
        boolean z;
        int F;
        int I = I() - i;
        boolean z2 = false;
        if (I >= 0 && I <= this.s - this.v) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int i2 = this.s - I;
        this.s = i2;
        this.y = Math.max(this.x, D(i2));
        if (I == 0 && this.z) {
            z2 = true;
        }
        this.z = z2;
        this.f.d(i);
        int i3 = this.s;
        if (i3 != 0) {
            return this.n[F(i3 - 1)] + this.f475o[F];
        }
        return 0L;
    }

    public final void w(int i) {
        this.d.c(v(i));
    }

    public final int x(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.q[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.p[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.l) {
                i = 0;
            }
        }
        return i3;
    }

    @InterfaceC2591Bt
    public C10833xx0 y(C10833xx0 c10833xx0) {
        if (this.I != 0 && c10833xx0.k1 != Long.MAX_VALUE) {
            return c10833xx0.b().k0(c10833xx0.k1 + this.I).G();
        }
        return c10833xx0;
    }

    public final int z() {
        return this.t;
    }
}
