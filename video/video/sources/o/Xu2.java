package o;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.KZ1;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class Xu2 implements InterfaceC4324Tj0 {
    public static final int A = 188;
    public static final int B = 112800;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 15;
    public static final int F = 17;
    public static final int G = 129;
    public static final int H = 138;
    public static final int I = 130;
    public static final int J = 135;
    public static final int K = 172;
    public static final int L = 2;
    public static final int M = 16;
    public static final int N = 27;
    public static final int O = 36;
    public static final int P = 21;
    public static final int Q = 134;
    public static final int R = 89;
    public static final int S = 128;
    public static final int T = 257;
    public static final int U = 71;
    public static final int V = 0;
    public static final int W = 8192;
    public static final long X = 1094921523;
    public static final long Y = 1161904947;
    public static final long Z = 1094921524;
    public static final long a0 = 1212503619;
    public static final int b0 = 9400;
    public static final int c0 = 5;
    public static final InterfaceC4809Yj0 w = new InterfaceC4809Yj0() { // from class: o.Wu2
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return Xu2.c();
        }
    };
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;
    public final int d;
    public final int e;
    public final List<C10071up2> f;
    public final C3012Fy1 g;
    public final SparseIntArray h;
    public final Yu2.c i;
    public final SparseArray<Yu2> j;
    public final SparseBooleanArray k;
    public final SparseBooleanArray l;
    public final Vu2 m;
    public Uu2 n;

    /* renamed from: o  reason: collision with root package name */
    public InterfaceC4518Vj0 f666o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    @InterfaceC11300zs1
    public Yu2 t;
    public int u;
    public int v;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public Xu2() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new Xu2()};
    }

    public static /* synthetic */ int l(Xu2 xu2) {
        int i = xu2.p;
        xu2.p = i + 1;
        return i;
    }

    private void x(long j) {
        if (!this.r) {
            this.r = true;
            if (this.m.b() != C10323vs.b) {
                Uu2 uu2 = new Uu2(this.m.c(), this.m.b(), j, this.v, this.e);
                this.n = uu2;
                this.f666o.p(uu2.b());
                return;
            }
            this.f666o.p(new KZ1.b(this.m.b()));
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        boolean z2;
        Uu2 uu2;
        boolean z3;
        if (this.d != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.i(z2);
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            C10071up2 c10071up2 = this.f.get(i);
            if (c10071up2.e() == C10323vs.b) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                long c2 = c10071up2.c();
                if (c2 != C10323vs.b && c2 != 0 && c2 != j2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                c10071up2.h(j2);
            }
        }
        if (j2 != 0 && (uu2 = this.n) != null) {
            uu2.h(j2);
        }
        this.g.U(0);
        this.h.clear();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.j.valueAt(i2).b();
        }
        this.u = 0;
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.f666o = interfaceC4518Vj0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r1 = r1 + 1;
     */
    @Override // o.InterfaceC4324Tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        byte[] e = this.g.e();
        interfaceC4421Uj0.x(e, 0, Uu2.g);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (e[(i2 * A) + i] != 71) {
                    break;
                }
            }
            interfaceC4421Uj0.t(i);
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        int i;
        boolean z2;
        Yu2 yu2;
        long j;
        int i2;
        long length = interfaceC4421Uj0.getLength();
        if (this.q) {
            if (length != -1 && this.d != 2 && !this.m.d()) {
                return this.m.e(interfaceC4421Uj0, ke1, this.v);
            }
            x(length);
            if (this.s) {
                this.s = false;
                a(0L, 0L);
                if (interfaceC4421Uj0.getPosition() != 0) {
                    ke1.a = 0L;
                    return 1;
                }
            }
            Uu2 uu2 = this.n;
            if (uu2 != null && uu2.d()) {
                return this.n.c(interfaceC4421Uj0, ke1);
            }
        }
        if (!v(interfaceC4421Uj0)) {
            return -1;
        }
        int w2 = w();
        int g = this.g.g();
        if (w2 > g) {
            return 0;
        }
        int s = this.g.s();
        if ((8388608 & s) != 0) {
            this.g.Y(w2);
            return 0;
        }
        if ((4194304 & s) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = (2096896 & s) >> 8;
        if ((s & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((s & 16) != 0) {
            yu2 = this.j.get(i3);
        } else {
            yu2 = null;
        }
        if (yu2 == null) {
            this.g.Y(w2);
            return 0;
        }
        if (this.d != 2) {
            int i4 = s & 15;
            j = -1;
            int i5 = this.h.get(i3, i4 - 1);
            this.h.put(i3, i4);
            if (i5 == i4) {
                this.g.Y(w2);
                return 0;
            } else if (i4 != ((i5 + 1) & 15)) {
                yu2.b();
            }
        } else {
            j = -1;
        }
        if (z2) {
            int L2 = this.g.L();
            if ((this.g.L() & 64) != 0) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            i |= i2;
            this.g.Z(L2 - 1);
        }
        boolean z3 = this.q;
        if (z(i3)) {
            this.g.X(w2);
            yu2.a(this.g, i);
            this.g.X(g);
        }
        if (this.d != 2 && !z3 && this.q && length != j) {
            this.s = true;
        }
        this.g.Y(w2);
        return 0;
    }

    public final boolean v(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        byte[] e = this.g.e();
        if (9400 - this.g.f() < 188) {
            int a2 = this.g.a();
            if (a2 > 0) {
                System.arraycopy(e, this.g.f(), e, 0, a2);
            }
            this.g.W(e, a2);
        }
        while (this.g.a() < 188) {
            int g = this.g.g();
            int read = interfaceC4421Uj0.read(e, g, 9400 - g);
            if (read == -1) {
                return false;
            }
            this.g.X(g + read);
        }
        return true;
    }

    public final int w() throws C3989Py1 {
        int f = this.g.f();
        int g = this.g.g();
        int a2 = Zu2.a(this.g.e(), f, g);
        this.g.Y(a2);
        int i = a2 + A;
        if (i > g) {
            int i2 = this.u + (a2 - f);
            this.u = i2;
            if (this.d == 2 && i2 > 376) {
                throw C3989Py1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
            return i;
        }
        this.u = 0;
        return i;
    }

    public final void y() {
        this.k.clear();
        this.j.clear();
        SparseArray<Yu2> a2 = this.i.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            this.j.put(a2.keyAt(i), a2.valueAt(i));
        }
        this.j.put(0, new IZ1(new b()));
        this.t = null;
    }

    public final boolean z(int i) {
        if (this.d != 2 && !this.q && this.l.get(i, false)) {
            return false;
        }
        return true;
    }

    public Xu2(int i) {
        this(1, i, (int) B);
    }

    public Xu2(int i, int i2, int i3) {
        this(i, new C10071up2(0L), new C10118v10(i2), i3);
    }

    public Xu2(int i, C10071up2 c10071up2, Yu2.c cVar) {
        this(i, c10071up2, cVar, B);
    }

    public Xu2(int i, C10071up2 c10071up2, Yu2.c cVar, int i2) {
        this.i = (Yu2.c) C9542sf.g(cVar);
        this.e = i2;
        this.d = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add(c10071up2);
        } else {
            this.f = Collections.singletonList(c10071up2);
        }
        this.g = new C3012Fy1(new byte[b0], 0);
        this.k = new SparseBooleanArray();
        this.l = new SparseBooleanArray();
        this.j = new SparseArray<>();
        this.h = new SparseIntArray();
        this.m = new Vu2(i2);
        this.f666o = InterfaceC4518Vj0.B;
        this.v = -1;
        y();
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }

    /* loaded from: classes2.dex */
    public class b implements HZ1 {
        public final C2903Ey1 a = new C2903Ey1(new byte[4]);

        public b() {
        }

        @Override // o.HZ1
        public void a(C3012Fy1 c3012Fy1) {
            if (c3012Fy1.L() == 0 && (c3012Fy1.L() & 128) != 0) {
                c3012Fy1.Z(6);
                int a = c3012Fy1.a() / 4;
                for (int i = 0; i < a; i++) {
                    c3012Fy1.m(this.a, 4);
                    int h = this.a.h(16);
                    this.a.s(3);
                    if (h == 0) {
                        this.a.s(13);
                    } else {
                        int h2 = this.a.h(13);
                        if (Xu2.this.j.get(h2) == null) {
                            Xu2.this.j.put(h2, new IZ1(new c(h2)));
                            Xu2.l(Xu2.this);
                        }
                    }
                }
                if (Xu2.this.d != 2) {
                    Xu2.this.j.remove(0);
                }
            }
        }

        @Override // o.HZ1
        public void c(C10071up2 c10071up2, InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        }
    }

    /* loaded from: classes2.dex */
    public class c implements HZ1 {
        public static final int f = 5;
        public static final int g = 10;
        public static final int h = 106;
        public static final int i = 111;
        public static final int j = 122;
        public static final int k = 123;
        public static final int l = 127;
        public static final int m = 89;
        public static final int n = 21;
        public final C2903Ey1 a = new C2903Ey1(new byte[5]);
        public final SparseArray<Yu2> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public c(int i2) {
            this.d = i2;
        }

        @Override // o.HZ1
        public void a(C3012Fy1 c3012Fy1) {
            C10071up2 c10071up2;
            int i2;
            Yu2 b;
            if (c3012Fy1.L() == 2) {
                if (Xu2.this.d != 1 && Xu2.this.d != 2 && Xu2.this.p != 1) {
                    c10071up2 = new C10071up2(((C10071up2) Xu2.this.f.get(0)).c());
                    Xu2.this.f.add(c10071up2);
                } else {
                    c10071up2 = (C10071up2) Xu2.this.f.get(0);
                }
                if ((c3012Fy1.L() & 128) != 0) {
                    c3012Fy1.Z(1);
                    int R = c3012Fy1.R();
                    int i3 = 3;
                    c3012Fy1.Z(3);
                    c3012Fy1.m(this.a, 2);
                    this.a.s(3);
                    int i4 = 13;
                    Xu2.this.v = this.a.h(13);
                    c3012Fy1.m(this.a, 2);
                    int i5 = 4;
                    this.a.s(4);
                    c3012Fy1.Z(this.a.h(12));
                    if (Xu2.this.d == 2 && Xu2.this.t == null) {
                        Yu2.b bVar = new Yu2.b(21, null, null, TD2.f);
                        Xu2 xu2 = Xu2.this;
                        xu2.t = xu2.i.b(21, bVar);
                        if (Xu2.this.t != null) {
                            Xu2.this.t.c(c10071up2, Xu2.this.f666o, new Yu2.e(R, 21, 8192));
                        }
                    }
                    this.b.clear();
                    this.c.clear();
                    int a = c3012Fy1.a();
                    while (a > 0) {
                        c3012Fy1.m(this.a, 5);
                        int h2 = this.a.h(8);
                        this.a.s(i3);
                        int h3 = this.a.h(i4);
                        this.a.s(i5);
                        int h4 = this.a.h(12);
                        Yu2.b b2 = b(c3012Fy1, h4);
                        if (h2 == 6 || h2 == 5) {
                            h2 = b2.a;
                        }
                        a -= h4 + 5;
                        if (Xu2.this.d == 2) {
                            i2 = h2;
                        } else {
                            i2 = h3;
                        }
                        if (!Xu2.this.k.get(i2)) {
                            if (Xu2.this.d == 2 && h2 == 21) {
                                b = Xu2.this.t;
                            } else {
                                b = Xu2.this.i.b(h2, b2);
                            }
                            if (Xu2.this.d != 2 || h3 < this.c.get(i2, 8192)) {
                                this.c.put(i2, h3);
                                this.b.put(i2, b);
                            }
                        }
                        i3 = 3;
                        i5 = 4;
                        i4 = 13;
                    }
                    int size = this.c.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        int keyAt = this.c.keyAt(i6);
                        int valueAt = this.c.valueAt(i6);
                        Xu2.this.k.put(keyAt, true);
                        Xu2.this.l.put(valueAt, true);
                        Yu2 valueAt2 = this.b.valueAt(i6);
                        if (valueAt2 != null) {
                            if (valueAt2 != Xu2.this.t) {
                                valueAt2.c(c10071up2, Xu2.this.f666o, new Yu2.e(R, keyAt, 8192));
                            }
                            Xu2.this.j.put(valueAt, valueAt2);
                        }
                    }
                    if (Xu2.this.d == 2) {
                        if (!Xu2.this.q) {
                            Xu2.this.f666o.n();
                            Xu2.this.p = 0;
                            Xu2.this.q = true;
                            return;
                        }
                        return;
                    }
                    Xu2.this.j.remove(this.d);
                    Xu2 xu22 = Xu2.this;
                    xu22.p = xu22.d == 1 ? 0 : Xu2.this.p - 1;
                    if (Xu2.this.p == 0) {
                        Xu2.this.f666o.n();
                        Xu2.this.q = true;
                    }
                }
            }
        }

        public final Yu2.b b(C3012Fy1 c3012Fy1, int i2) {
            int f2 = c3012Fy1.f();
            int i3 = i2 + f2;
            int i4 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (c3012Fy1.f() < i3) {
                int L = c3012Fy1.L();
                int f3 = c3012Fy1.f() + c3012Fy1.L();
                if (f3 > i3) {
                    break;
                }
                if (L == 5) {
                    long N = c3012Fy1.N();
                    if (N != Xu2.X) {
                        if (N != Xu2.Y) {
                            if (N != Xu2.Z) {
                                if (N == Xu2.a0) {
                                    i4 = 36;
                                }
                            }
                            i4 = 172;
                        }
                        i4 = 135;
                    }
                    i4 = 129;
                } else {
                    if (L != 106) {
                        if (L != 122) {
                            if (L == 127) {
                                if (c3012Fy1.L() != 21) {
                                }
                                i4 = 172;
                            } else if (L == 123) {
                                i4 = 138;
                            } else if (L == 10) {
                                str = c3012Fy1.I(3).trim();
                            } else if (L == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c3012Fy1.f() < f3) {
                                    String trim = c3012Fy1.I(3).trim();
                                    int L2 = c3012Fy1.L();
                                    byte[] bArr = new byte[4];
                                    c3012Fy1.n(bArr, 0, 4);
                                    arrayList2.add(new Yu2.a(trim, L2, bArr));
                                }
                                arrayList = arrayList2;
                                i4 = 89;
                            } else if (L == 111) {
                                i4 = 257;
                            }
                        }
                        i4 = 135;
                    }
                    i4 = 129;
                }
                c3012Fy1.Z(f3 - c3012Fy1.f());
            }
            c3012Fy1.Y(i3);
            return new Yu2.b(i4, str, arrayList, Arrays.copyOfRange(c3012Fy1.e(), f2, i3));
        }

        @Override // o.HZ1
        public void c(C10071up2 c10071up2, InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        }
    }
}
