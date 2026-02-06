package o;

import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o.AbstractC4501Vf;
import o.C10833xx0;
import o.C6960i70;
import o.InterfaceC10568wr2;
import o.KZ1;

@Deprecated
/* renamed from: o.Oz0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3894Oz0 implements InterfaceC4324Tj0 {
    public static final int M = 1;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 16;
    public static final String Q = "FragmentedMp4Extractor";
    public static final int R = 1936025959;
    public static final int U = 100;
    public static final int V = 0;
    public static final int W = 1;
    public static final int X = 2;
    public static final int Y = 3;
    public static final int Z = 4;
    public long A;
    public long B;
    @InterfaceC11300zs1
    public c C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public InterfaceC4518Vj0 H;
    public InterfaceC10568wr2[] I;
    public InterfaceC10568wr2[] J;
    public boolean K;
    public final int d;
    @InterfaceC11300zs1
    public final C8615or2 e;
    public final List<C10833xx0> f;
    public final SparseArray<c> g;
    public final C3012Fy1 h;
    public final C3012Fy1 i;
    public final C3012Fy1 j;
    public final byte[] k;
    public final C3012Fy1 l;
    @InterfaceC11300zs1
    public final C10071up2 m;
    public final C4010Qe0 n;

    /* renamed from: o  reason: collision with root package name */
    public final C3012Fy1 f579o;
    public final ArrayDeque<AbstractC4501Vf.a> p;
    public final ArrayDeque<b> q;
    @InterfaceC11300zs1
    public final InterfaceC10568wr2 r;
    public int s;
    public int t;
    public long u;
    public int v;
    @InterfaceC11300zs1
    public C3012Fy1 w;
    public long x;
    public int y;
    public long z;
    public static final InterfaceC4809Yj0 L = new InterfaceC4809Yj0() { // from class: o.Mz0
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return C3894Oz0.c();
        }
    };
    public static final byte[] S = {-94, 57, 79, 82, 90, -101, 79, C8077mf.x, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C10833xx0 T = new C10833xx0.b().g0(C4128Rj1.J0).G();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Oz0$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* renamed from: o.Oz0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final long a;
        public final boolean b;
        public final int c;

        public b(long j, boolean z, int i) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    /* renamed from: o.Oz0$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public static final int m = 8;
        public final InterfaceC10568wr2 a;
        public C10811xr2 d;
        public C9142r00 e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean l;
        public final C9101qr2 b = new C9101qr2();
        public final C3012Fy1 c = new C3012Fy1();
        public final C3012Fy1 j = new C3012Fy1(1);
        public final C3012Fy1 k = new C3012Fy1();

        public c(InterfaceC10568wr2 interfaceC10568wr2, C10811xr2 c10811xr2, C9142r00 c9142r00) {
            this.a = interfaceC10568wr2;
            this.d = c10811xr2;
            this.e = c9142r00;
            j(c10811xr2, c9142r00);
        }

        public int c() {
            int i;
            if (!this.l) {
                i = this.d.g[this.f];
            } else if (this.b.k[this.f]) {
                i = 1;
            } else {
                i = 0;
            }
            if (g() != null) {
                return i | 1073741824;
            }
            return i;
        }

        public long d() {
            if (!this.l) {
                return this.d.c[this.f];
            }
            return this.b.g[this.h];
        }

        public long e() {
            if (!this.l) {
                return this.d.f[this.f];
            }
            return this.b.c(this.f);
        }

        public int f() {
            if (!this.l) {
                return this.d.d[this.f];
            }
            return this.b.i[this.f];
        }

        @InterfaceC11300zs1
        public C8858pr2 g() {
            if (!this.l) {
                return null;
            }
            int i = ((C9142r00) TD2.o(this.b.a)).a;
            C8858pr2 c8858pr2 = this.b.n;
            if (c8858pr2 == null) {
                c8858pr2 = this.d.a.b(i);
            }
            if (c8858pr2 == null || !c8858pr2.a) {
                return null;
            }
            return c8858pr2;
        }

        public boolean h() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public int i(int i, int i2) {
            C3012Fy1 c3012Fy1;
            boolean z;
            int i3;
            C8858pr2 g = g();
            if (g == null) {
                return 0;
            }
            int i4 = g.d;
            if (i4 != 0) {
                c3012Fy1 = this.b.f843o;
            } else {
                byte[] bArr = (byte[]) TD2.o(g.e);
                this.k.W(bArr, bArr.length);
                C3012Fy1 c3012Fy12 = this.k;
                i4 = bArr.length;
                c3012Fy1 = c3012Fy12;
            }
            boolean g2 = this.b.g(this.f);
            if (!g2 && i2 == 0) {
                z = false;
            } else {
                z = true;
            }
            byte[] e = this.j.e();
            if (z) {
                i3 = 128;
            } else {
                i3 = 0;
            }
            e[0] = (byte) (i3 | i4);
            this.j.Y(0);
            this.a.f(this.j, 1, 1);
            this.a.f(c3012Fy1, i4, 1);
            if (!z) {
                return i4 + 1;
            }
            if (!g2) {
                this.c.U(8);
                byte[] e2 = this.c.e();
                e2[0] = 0;
                e2[1] = 1;
                e2[2] = (byte) ((i2 >> 8) & 255);
                e2[3] = (byte) (i2 & 255);
                e2[4] = (byte) ((i >> 24) & 255);
                e2[5] = (byte) ((i >> 16) & 255);
                e2[6] = (byte) ((i >> 8) & 255);
                e2[7] = (byte) (i & 255);
                this.a.f(this.c, 8, 1);
                return i4 + 9;
            }
            C3012Fy1 c3012Fy13 = this.b.f843o;
            int R = c3012Fy13.R();
            c3012Fy13.Z(-2);
            int i5 = (R * 6) + 2;
            if (i2 != 0) {
                this.c.U(i5);
                byte[] e3 = this.c.e();
                c3012Fy13.n(e3, 0, i5);
                int i6 = (((e3[2] & 255) << 8) | (e3[3] & 255)) + i2;
                e3[2] = (byte) ((i6 >> 8) & 255);
                e3[3] = (byte) (i6 & 255);
                c3012Fy13 = this.c;
            }
            this.a.f(c3012Fy13, i5, 1);
            return i4 + 1 + i5;
        }

        public void j(C10811xr2 c10811xr2, C9142r00 c9142r00) {
            this.d = c10811xr2;
            this.e = c9142r00;
            this.a.a(c10811xr2.a.f);
            k();
        }

        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public void l(long j) {
            int i = this.f;
            while (true) {
                C9101qr2 c9101qr2 = this.b;
                if (i < c9101qr2.f && c9101qr2.c(i) <= j) {
                    if (this.b.k[i]) {
                        this.i = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        public void m() {
            C8858pr2 g = g();
            if (g != null) {
                C3012Fy1 c3012Fy1 = this.b.f843o;
                int i = g.d;
                if (i != 0) {
                    c3012Fy1.Z(i);
                }
                if (this.b.g(this.f)) {
                    c3012Fy1.Z(c3012Fy1.R() * 6);
                }
            }
        }

        public void n(C6960i70 c6960i70) {
            String str;
            C8858pr2 b = this.d.a.b(((C9142r00) TD2.o(this.b.a)).a);
            if (b != null) {
                str = b.b;
            } else {
                str = null;
            }
            this.a.a(this.d.a.f.b().O(c6960i70.c(str)).G());
        }
    }

    public C3894Oz0() {
        this(0);
    }

    public static void A(C3012Fy1 c3012Fy1, C9101qr2 c9101qr2) throws C3989Py1 {
        z(c3012Fy1, 0, c9101qr2);
    }

    public static Pair<Long, C6979iC> B(C3012Fy1 c3012Fy1, long j) throws C3989Py1 {
        long Q2;
        long Q3;
        c3012Fy1.Y(8);
        int c2 = AbstractC4501Vf.c(c3012Fy1.s());
        c3012Fy1.Z(4);
        long N2 = c3012Fy1.N();
        if (c2 == 0) {
            Q2 = c3012Fy1.N();
            Q3 = c3012Fy1.N();
        } else {
            Q2 = c3012Fy1.Q();
            Q3 = c3012Fy1.Q();
        }
        long j2 = j + Q3;
        long C1 = TD2.C1(Q2, 1000000L, N2);
        c3012Fy1.Z(2);
        int R2 = c3012Fy1.R();
        int[] iArr = new int[R2];
        long[] jArr = new long[R2];
        long[] jArr2 = new long[R2];
        long[] jArr3 = new long[R2];
        long j3 = j2;
        long j4 = C1;
        int i = 0;
        while (i < R2) {
            int s = c3012Fy1.s();
            if ((Integer.MIN_VALUE & s) == 0) {
                long N3 = c3012Fy1.N();
                iArr[i] = s & Integer.MAX_VALUE;
                jArr[i] = j3;
                jArr3[i] = j4;
                Q2 += N3;
                long[] jArr4 = jArr3;
                j4 = TD2.C1(Q2, 1000000L, N2);
                jArr2[i] = j4 - jArr4[i];
                c3012Fy1.Z(4);
                j3 += iArr[i];
                i++;
                jArr3 = jArr4;
            } else {
                throw C3989Py1.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(C1), new C6979iC(iArr, jArr, jArr2, jArr3));
    }

    public static long C(C3012Fy1 c3012Fy1) {
        c3012Fy1.Y(8);
        if (AbstractC4501Vf.c(c3012Fy1.s()) == 1) {
            return c3012Fy1.Q();
        }
        return c3012Fy1.N();
    }

    @InterfaceC11300zs1
    public static c D(C3012Fy1 c3012Fy1, SparseArray<c> sparseArray, boolean z) {
        c cVar;
        int i;
        int i2;
        int i3;
        int i4;
        c3012Fy1.Y(8);
        int b2 = AbstractC4501Vf.b(c3012Fy1.s());
        int s = c3012Fy1.s();
        if (z) {
            cVar = sparseArray.valueAt(0);
        } else {
            cVar = sparseArray.get(s);
        }
        c cVar2 = cVar;
        if (cVar2 == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long Q2 = c3012Fy1.Q();
            C9101qr2 c9101qr2 = cVar2.b;
            c9101qr2.c = Q2;
            c9101qr2.d = Q2;
        }
        C9142r00 c9142r00 = cVar2.e;
        if ((b2 & 2) != 0) {
            i = c3012Fy1.s() - 1;
        } else {
            i = c9142r00.a;
        }
        if ((b2 & 8) != 0) {
            i2 = c3012Fy1.s();
        } else {
            i2 = c9142r00.b;
        }
        if ((b2 & 16) != 0) {
            i3 = c3012Fy1.s();
        } else {
            i3 = c9142r00.c;
        }
        if ((b2 & 32) != 0) {
            i4 = c3012Fy1.s();
        } else {
            i4 = c9142r00.d;
        }
        cVar2.b.a = new C9142r00(i, i2, i3, i4);
        return cVar2;
    }

    public static void E(AbstractC4501Vf.a aVar, SparseArray<c> sparseArray, boolean z, int i, byte[] bArr) throws C3989Py1 {
        String str;
        c D = D(((AbstractC4501Vf.b) C9542sf.g(aVar.h(AbstractC4501Vf.c0))).E1, sparseArray, z);
        if (D != null) {
            C9101qr2 c9101qr2 = D.b;
            long j = c9101qr2.q;
            boolean z2 = c9101qr2.r;
            D.k();
            D.l = true;
            AbstractC4501Vf.b h = aVar.h(AbstractC4501Vf.b0);
            if (h != null && (i & 2) == 0) {
                c9101qr2.q = C(h.E1);
                c9101qr2.r = true;
            } else {
                c9101qr2.q = j;
                c9101qr2.r = z2;
            }
            H(aVar, D, i);
            C8858pr2 b2 = D.d.a.b(((C9142r00) C9542sf.g(c9101qr2.a)).a);
            AbstractC4501Vf.b h2 = aVar.h(AbstractC4501Vf.G0);
            if (h2 != null) {
                x((C8858pr2) C9542sf.g(b2), h2.E1, c9101qr2);
            }
            AbstractC4501Vf.b h3 = aVar.h(AbstractC4501Vf.H0);
            if (h3 != null) {
                w(h3.E1, c9101qr2);
            }
            AbstractC4501Vf.b h4 = aVar.h(AbstractC4501Vf.L0);
            if (h4 != null) {
                A(h4.E1, c9101qr2);
            }
            if (b2 != null) {
                str = b2.b;
            } else {
                str = null;
            }
            y(aVar, str, c9101qr2);
            int size = aVar.F1.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC4501Vf.b bVar = aVar.F1.get(i2);
                if (bVar.a == 1970628964) {
                    I(bVar.E1, c9101qr2, bArr);
                }
            }
        }
    }

    public static Pair<Integer, C9142r00> F(C3012Fy1 c3012Fy1) {
        c3012Fy1.Y(12);
        return Pair.create(Integer.valueOf(c3012Fy1.s()), new C9142r00(c3012Fy1.s() - 1, c3012Fy1.s(), c3012Fy1.s(), c3012Fy1.s()));
    }

    public static int G(c cVar, int i, int i2, C3012Fy1 c3012Fy1, int i3) throws C3989Py1 {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z8;
        c3012Fy1.Y(8);
        int b2 = AbstractC4501Vf.b(c3012Fy1.s());
        C8615or2 c8615or2 = cVar.d.a;
        C9101qr2 c9101qr2 = cVar.b;
        C9142r00 c9142r00 = (C9142r00) TD2.o(c9101qr2.a);
        c9101qr2.h[i] = c3012Fy1.P();
        long[] jArr = c9101qr2.g;
        long j2 = c9101qr2.c;
        jArr[i] = j2;
        if ((b2 & 1) != 0) {
            jArr[i] = j2 + c3012Fy1.s();
        }
        if ((b2 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i11 = c9142r00.d;
        if (z) {
            i11 = c3012Fy1.s();
        }
        if ((b2 & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b2 & 512) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((b2 & 1024) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((b2 & 2048) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (m(c8615or2)) {
            j = ((long[]) TD2.o(c8615or2.i))[0];
        } else {
            j = 0;
        }
        int[] iArr = c9101qr2.i;
        long[] jArr2 = c9101qr2.j;
        boolean[] zArr = c9101qr2.k;
        boolean z9 = z5;
        if (c8615or2.b == 2 && (i2 & 1) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i12 = i3 + c9101qr2.h[i];
        boolean z10 = z;
        long j3 = c8615or2.c;
        long j4 = c9101qr2.q;
        int i13 = i3;
        while (i13 < i12) {
            if (z2) {
                i4 = c3012Fy1.s();
                z7 = z6;
            } else {
                z7 = z6;
                i4 = c9142r00.b;
            }
            int e = e(i4);
            if (z3) {
                i6 = c3012Fy1.s();
                i5 = i12;
            } else {
                i5 = i12;
                i6 = c9142r00.c;
            }
            int e2 = e(i6);
            if (z4) {
                i7 = e2;
                i8 = c3012Fy1.s();
            } else if (i13 == 0 && z10) {
                i7 = e2;
                i8 = i11;
            } else {
                i7 = e2;
                i8 = c9142r00.d;
            }
            if (z9) {
                i9 = i8;
                i10 = c3012Fy1.s();
            } else {
                i9 = i8;
                i10 = 0;
            }
            int i14 = i13;
            long C1 = TD2.C1((i10 + j4) - j, 1000000L, j3);
            jArr2[i14] = C1;
            if (!c9101qr2.r) {
                jArr2[i14] = C1 + cVar.d.h;
            }
            iArr[i14] = i7;
            if (((i9 >> 16) & 1) == 0 && (!z7 || i14 == 0)) {
                z8 = true;
            } else {
                z8 = false;
            }
            zArr[i14] = z8;
            j4 += e;
            i13 = i14 + 1;
            i12 = i5;
            z6 = z7;
        }
        int i15 = i12;
        c9101qr2.q = j4;
        return i15;
    }

    public static void H(AbstractC4501Vf.a aVar, c cVar, int i) throws C3989Py1 {
        List<AbstractC4501Vf.b> list = aVar.F1;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC4501Vf.b bVar = list.get(i4);
            if (bVar.a == 1953658222) {
                C3012Fy1 c3012Fy1 = bVar.E1;
                c3012Fy1.Y(12);
                int P2 = c3012Fy1.P();
                if (P2 > 0) {
                    i3 += P2;
                    i2++;
                }
            }
        }
        cVar.h = 0;
        cVar.g = 0;
        cVar.f = 0;
        cVar.b.e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC4501Vf.b bVar2 = list.get(i7);
            if (bVar2.a == 1953658222) {
                i6 = G(cVar, i5, i, bVar2.E1, i6);
                i5++;
            }
        }
    }

    public static void I(C3012Fy1 c3012Fy1, C9101qr2 c9101qr2, byte[] bArr) throws C3989Py1 {
        c3012Fy1.Y(8);
        c3012Fy1.n(bArr, 0, 16);
        if (!Arrays.equals(bArr, S)) {
            return;
        }
        z(c3012Fy1, 16, c9101qr2);
    }

    private void J(long j) throws C3989Py1 {
        while (!this.p.isEmpty() && this.p.peek().E1 == j) {
            o(this.p.pop());
        }
        f();
    }

    private boolean K(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (this.v == 0) {
            if (!interfaceC4421Uj0.j(this.f579o.e(), 0, 8, true)) {
                return false;
            }
            this.v = 8;
            this.f579o.Y(0);
            this.u = this.f579o.N();
            this.t = this.f579o.s();
        }
        long j = this.u;
        if (j == 1) {
            interfaceC4421Uj0.readFully(this.f579o.e(), 8, 8);
            this.v += 8;
            this.u = this.f579o.Q();
        } else if (j == 0) {
            long length = interfaceC4421Uj0.getLength();
            if (length == -1 && !this.p.isEmpty()) {
                length = this.p.peek().E1;
            }
            if (length != -1) {
                this.u = (length - interfaceC4421Uj0.getPosition()) + this.v;
            }
        }
        if (this.u >= this.v) {
            long position = interfaceC4421Uj0.getPosition() - this.v;
            int i = this.t;
            if ((i == 1836019558 || i == 1835295092) && !this.K) {
                this.H.p(new KZ1.b(this.A, position));
                this.K = true;
            }
            if (this.t == 1836019558) {
                int size = this.g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C9101qr2 c9101qr2 = this.g.valueAt(i2).b;
                    c9101qr2.b = position;
                    c9101qr2.d = position;
                    c9101qr2.c = position;
                }
            }
            int i3 = this.t;
            if (i3 == 1835295092) {
                this.C = null;
                this.x = position + this.u;
                this.s = 2;
                return true;
            }
            if (O(i3)) {
                long position2 = (interfaceC4421Uj0.getPosition() + this.u) - 8;
                this.p.push(new AbstractC4501Vf.a(this.t, position2));
                if (this.u == this.v) {
                    J(position2);
                } else {
                    f();
                }
            } else if (P(this.t)) {
                if (this.v == 8) {
                    if (this.u <= 2147483647L) {
                        C3012Fy1 c3012Fy1 = new C3012Fy1((int) this.u);
                        System.arraycopy(this.f579o.e(), 0, c3012Fy1.e(), 0, 8);
                        this.w = c3012Fy1;
                        this.s = 1;
                    } else {
                        throw C3989Py1.e("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw C3989Py1.e("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.u <= 2147483647L) {
                this.w = null;
                this.s = 1;
            } else {
                throw C3989Py1.e("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw C3989Py1.e("Atom size less than header length (unsupported).");
    }

    private static boolean O(int i) {
        if (i != 1836019574 && i != 1953653099 && i != 1835297121 && i != 1835626086 && i != 1937007212 && i != 1836019558 && i != 1953653094 && i != 1836475768 && i != 1701082227) {
            return false;
        }
        return true;
    }

    private static boolean P(int i) {
        if (i != 1751411826 && i != 1835296868 && i != 1836476516 && i != 1936286840 && i != 1937011556 && i != 1937011827 && i != 1668576371 && i != 1937011555 && i != 1937011578 && i != 1937013298 && i != 1937007471 && i != 1668232756 && i != 1937011571 && i != 1952867444 && i != 1952868452 && i != 1953196132 && i != 1953654136 && i != 1953658222 && i != 1886614376 && i != 1935763834 && i != 1935763823 && i != 1936027235 && i != 1970628964 && i != 1935828848 && i != 1936158820 && i != 1701606260 && i != 1835362404 && i != 1701671783) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new C3894Oz0()};
    }

    public static int e(int i) throws C3989Py1 {
        if (i >= 0) {
            return i;
        }
        throw C3989Py1.a("Unexpected negative value: " + i, null);
    }

    private void f() {
        this.s = 0;
        this.v = 0;
    }

    @InterfaceC11300zs1
    public static C6960i70 i(List<AbstractC4501Vf.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractC4501Vf.b bVar = list.get(i);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e = bVar.E1.e();
                UUID f = DK1.f(e);
                if (f == null) {
                    I31.n(Q, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C6960i70.b(f, C4128Rj1.f, e));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C6960i70(arrayList);
    }

    @InterfaceC11300zs1
    public static c k(SparseArray<c> sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            c valueAt = sparseArray.valueAt(i);
            if ((valueAt.l || valueAt.f != valueAt.d.b) && (!valueAt.l || valueAt.h != valueAt.b.e)) {
                long d = valueAt.d();
                if (d < j) {
                    cVar = valueAt;
                    j = d;
                }
            }
        }
        return cVar;
    }

    public static boolean m(C8615or2 c8615or2) {
        long[] jArr;
        long[] jArr2 = c8615or2.h;
        if (jArr2 != null && jArr2.length == 1 && (jArr = c8615or2.i) != null) {
            long j = jArr2[0];
            if (j == 0 || TD2.C1(j + jArr[0], 1000000L, c8615or2.d) >= c8615or2.e) {
                return true;
            }
        }
        return false;
    }

    public static long u(C3012Fy1 c3012Fy1) {
        c3012Fy1.Y(8);
        if (AbstractC4501Vf.c(c3012Fy1.s()) == 0) {
            return c3012Fy1.N();
        }
        return c3012Fy1.Q();
    }

    public static void v(AbstractC4501Vf.a aVar, SparseArray<c> sparseArray, boolean z, int i, byte[] bArr) throws C3989Py1 {
        int size = aVar.G1.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC4501Vf.a aVar2 = aVar.G1.get(i2);
            if (aVar2.a == 1953653094) {
                E(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    public static void w(C3012Fy1 c3012Fy1, C9101qr2 c9101qr2) throws C3989Py1 {
        long Q2;
        c3012Fy1.Y(8);
        int s = c3012Fy1.s();
        if ((AbstractC4501Vf.b(s) & 1) == 1) {
            c3012Fy1.Z(8);
        }
        int P2 = c3012Fy1.P();
        if (P2 == 1) {
            int c2 = AbstractC4501Vf.c(s);
            long j = c9101qr2.d;
            if (c2 == 0) {
                Q2 = c3012Fy1.N();
            } else {
                Q2 = c3012Fy1.Q();
            }
            c9101qr2.d = j + Q2;
            return;
        }
        throw C3989Py1.a("Unexpected saio entry count: " + P2, null);
    }

    public static void x(C8858pr2 c8858pr2, C3012Fy1 c3012Fy1, C9101qr2 c9101qr2) throws C3989Py1 {
        int i;
        boolean z;
        int i2 = c8858pr2.d;
        c3012Fy1.Y(8);
        boolean z2 = true;
        if ((AbstractC4501Vf.b(c3012Fy1.s()) & 1) == 1) {
            c3012Fy1.Z(8);
        }
        int L2 = c3012Fy1.L();
        int P2 = c3012Fy1.P();
        if (P2 <= c9101qr2.f) {
            if (L2 == 0) {
                boolean[] zArr = c9101qr2.m;
                i = 0;
                for (int i3 = 0; i3 < P2; i3++) {
                    int L3 = c3012Fy1.L();
                    i += L3;
                    if (L3 > i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zArr[i3] = z;
                }
            } else {
                if (L2 <= i2) {
                    z2 = false;
                }
                i = L2 * P2;
                Arrays.fill(c9101qr2.m, 0, P2, z2);
            }
            Arrays.fill(c9101qr2.m, P2, c9101qr2.f, false);
            if (i > 0) {
                c9101qr2.d(i);
                return;
            }
            return;
        }
        throw C3989Py1.a("Saiz sample count " + P2 + " is greater than fragment sample count" + c9101qr2.f, null);
    }

    public static void y(AbstractC4501Vf.a aVar, @InterfaceC11300zs1 String str, C9101qr2 c9101qr2) throws C3989Py1 {
        boolean z;
        byte[] bArr = null;
        C3012Fy1 c3012Fy1 = null;
        C3012Fy1 c3012Fy12 = null;
        for (int i = 0; i < aVar.F1.size(); i++) {
            AbstractC4501Vf.b bVar = aVar.F1.get(i);
            C3012Fy1 c3012Fy13 = bVar.E1;
            int i2 = bVar.a;
            if (i2 == 1935828848) {
                c3012Fy13.Y(12);
                if (c3012Fy13.s() == 1936025959) {
                    c3012Fy1 = c3012Fy13;
                }
            } else if (i2 == 1936158820) {
                c3012Fy13.Y(12);
                if (c3012Fy13.s() == 1936025959) {
                    c3012Fy12 = c3012Fy13;
                }
            }
        }
        if (c3012Fy1 != null && c3012Fy12 != null) {
            c3012Fy1.Y(8);
            int c2 = AbstractC4501Vf.c(c3012Fy1.s());
            c3012Fy1.Z(4);
            if (c2 == 1) {
                c3012Fy1.Z(4);
            }
            if (c3012Fy1.s() == 1) {
                c3012Fy12.Y(8);
                int c3 = AbstractC4501Vf.c(c3012Fy12.s());
                c3012Fy12.Z(4);
                if (c3 == 1) {
                    if (c3012Fy12.N() == 0) {
                        throw C3989Py1.e("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c3 >= 2) {
                    c3012Fy12.Z(4);
                }
                if (c3012Fy12.N() == 1) {
                    c3012Fy12.Z(1);
                    int L2 = c3012Fy12.L();
                    int i3 = (L2 & 240) >> 4;
                    int i4 = L2 & 15;
                    if (c3012Fy12.L() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int L3 = c3012Fy12.L();
                        byte[] bArr2 = new byte[16];
                        c3012Fy12.n(bArr2, 0, 16);
                        if (L3 == 0) {
                            int L4 = c3012Fy12.L();
                            bArr = new byte[L4];
                            c3012Fy12.n(bArr, 0, L4);
                        }
                        c9101qr2.l = true;
                        c9101qr2.n = new C8858pr2(z, str, L3, bArr2, i3, i4, bArr);
                        return;
                    }
                    return;
                }
                throw C3989Py1.e("Entry count in sgpd != 1 (unsupported).");
            }
            throw C3989Py1.e("Entry count in sbgp != 1 (unsupported).");
        }
    }

    public static void z(C3012Fy1 c3012Fy1, int i, C9101qr2 c9101qr2) throws C3989Py1 {
        boolean z;
        c3012Fy1.Y(i + 8);
        int b2 = AbstractC4501Vf.b(c3012Fy1.s());
        if ((b2 & 1) == 0) {
            if ((b2 & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int P2 = c3012Fy1.P();
            if (P2 == 0) {
                Arrays.fill(c9101qr2.m, 0, c9101qr2.f, false);
                return;
            } else if (P2 == c9101qr2.f) {
                Arrays.fill(c9101qr2.m, 0, P2, z);
                c9101qr2.d(c3012Fy1.a());
                c9101qr2.b(c3012Fy1);
                return;
            } else {
                throw C3989Py1.a("Senc sample count " + P2 + " is different from fragment sample count" + c9101qr2.f, null);
            }
        }
        throw C3989Py1.e("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public final void L(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int i = ((int) this.u) - this.v;
        C3012Fy1 c3012Fy1 = this.w;
        if (c3012Fy1 != null) {
            interfaceC4421Uj0.readFully(c3012Fy1.e(), 8, i);
            q(new AbstractC4501Vf.b(this.t, c3012Fy1), interfaceC4421Uj0.getPosition());
        } else {
            interfaceC4421Uj0.t(i);
        }
        J(interfaceC4421Uj0.getPosition());
    }

    public final void M(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int size = this.g.size();
        long j = Long.MAX_VALUE;
        c cVar = null;
        for (int i = 0; i < size; i++) {
            C9101qr2 c9101qr2 = this.g.valueAt(i).b;
            if (c9101qr2.p) {
                long j2 = c9101qr2.d;
                if (j2 < j) {
                    cVar = this.g.valueAt(i);
                    j = j2;
                }
            }
        }
        if (cVar == null) {
            this.s = 3;
            return;
        }
        int position = (int) (j - interfaceC4421Uj0.getPosition());
        if (position >= 0) {
            interfaceC4421Uj0.t(position);
            cVar.b.a(interfaceC4421Uj0);
            return;
        }
        throw C3989Py1.a("Offset to encryption data was negative.", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z;
        InterfaceC10568wr2.a aVar;
        boolean z2;
        int i;
        int c2;
        c cVar = this.C;
        Throwable th = null;
        if (cVar == null) {
            cVar = k(this.g);
            if (cVar == null) {
                int position = (int) (this.x - interfaceC4421Uj0.getPosition());
                if (position >= 0) {
                    interfaceC4421Uj0.t(position);
                    f();
                    return false;
                }
                throw C3989Py1.a("Offset to end of mdat was negative.", null);
            }
            int d = (int) (cVar.d() - interfaceC4421Uj0.getPosition());
            if (d < 0) {
                I31.n(Q, "Ignoring negative offset to sample data.");
                d = 0;
            }
            interfaceC4421Uj0.t(d);
            this.C = cVar;
        }
        int i2 = 4;
        int i3 = 1;
        if (this.s == 3) {
            int f = cVar.f();
            this.D = f;
            if (cVar.f < cVar.i) {
                interfaceC4421Uj0.t(f);
                cVar.m();
                if (!cVar.h()) {
                    this.C = null;
                }
                this.s = 3;
                return true;
            }
            if (cVar.d.a.g == 1) {
                this.D = f - 8;
                interfaceC4421Uj0.t(8);
            }
            if (C4128Rj1.T.equals(cVar.d.a.f.g1)) {
                this.E = cVar.i(this.D, 7);
                M3.a(this.D, this.l);
                cVar.a.e(this.l, 7);
                this.E += 7;
            } else {
                this.E = cVar.i(this.D, 0);
            }
            this.D += this.E;
            this.s = 4;
            this.F = 0;
        }
        C8615or2 c8615or2 = cVar.d.a;
        InterfaceC10568wr2 interfaceC10568wr2 = cVar.a;
        long e = cVar.e();
        C10071up2 c10071up2 = this.m;
        if (c10071up2 != null) {
            e = c10071up2.a(e);
        }
        if (c8615or2.j != 0) {
            byte[] e2 = this.i.e();
            e2[0] = 0;
            e2[1] = 0;
            e2[2] = 0;
            int i4 = c8615or2.j;
            int i5 = i4 + 1;
            int i6 = 4 - i4;
            while (this.E < this.D) {
                int i7 = this.F;
                if (i7 == 0) {
                    interfaceC4421Uj0.readFully(e2, i6, i5);
                    this.i.Y(0);
                    int s = this.i.s();
                    if (s >= i3) {
                        this.F = s - 1;
                        this.h.Y(0);
                        interfaceC10568wr2.e(this.h, i2);
                        interfaceC10568wr2.e(this.i, i3);
                        if (this.J.length > 0 && C9337ro1.g(c8615or2.f.g1, e2[i2])) {
                            z2 = i3;
                        } else {
                            z2 = 0;
                        }
                        this.G = z2;
                        this.E += 5;
                        this.D += i6;
                    } else {
                        throw C3989Py1.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.G) {
                        this.j.U(i7);
                        interfaceC4421Uj0.readFully(this.j.e(), 0, this.F);
                        interfaceC10568wr2.e(this.j, this.F);
                        c2 = this.F;
                        int q = C9337ro1.q(this.j.e(), this.j.g());
                        i = i3;
                        this.j.Y(C4128Rj1.k.equals(c8615or2.f.g1) ? 1 : 0);
                        this.j.X(q);
                        C3893Oz.a(e, this.j, this.J);
                    } else {
                        i = i3;
                        c2 = interfaceC10568wr2.c(interfaceC4421Uj0, i7, false);
                    }
                    this.E += c2;
                    this.F -= c2;
                    i3 = i;
                    th = null;
                    i2 = 4;
                }
            }
            z = i3;
        } else {
            z = 1;
            while (true) {
                int i8 = this.E;
                int i9 = this.D;
                if (i8 >= i9) {
                    break;
                }
                this.E += interfaceC10568wr2.c(interfaceC4421Uj0, i9 - i8, false);
            }
        }
        int c3 = cVar.c();
        C8858pr2 g = cVar.g();
        if (g != null) {
            aVar = g.c;
        } else {
            aVar = null;
        }
        interfaceC10568wr2.b(e, c3, this.D, 0, aVar);
        t(e);
        if (!cVar.h()) {
            this.C = null;
        }
        this.s = 3;
        return z;
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.valueAt(i).k();
        }
        this.q.clear();
        this.y = 0;
        this.z = j2;
        this.p.clear();
        f();
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.H = interfaceC4518Vj0;
        f();
        l();
        C8615or2 c8615or2 = this.e;
        if (c8615or2 != null) {
            this.g.put(0, new c(interfaceC4518Vj0.b(0, c8615or2.b), new C10811xr2(this.e, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C9142r00(0, 0, 0, 0)));
            this.H.n();
        }
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return A92.b(interfaceC4421Uj0);
    }

    public final C9142r00 h(SparseArray<C9142r00> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C9142r00) C9542sf.g(sparseArray.get(i));
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        while (true) {
            int i = this.s;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (N(interfaceC4421Uj0)) {
                            return 0;
                        }
                    } else {
                        M(interfaceC4421Uj0);
                    }
                } else {
                    L(interfaceC4421Uj0);
                }
            } else if (!K(interfaceC4421Uj0)) {
                return -1;
            }
        }
    }

    public final void l() {
        int i;
        InterfaceC10568wr2[] interfaceC10568wr2Arr = new InterfaceC10568wr2[2];
        this.I = interfaceC10568wr2Arr;
        InterfaceC10568wr2 interfaceC10568wr2 = this.r;
        int i2 = 0;
        if (interfaceC10568wr2 != null) {
            interfaceC10568wr2Arr[0] = interfaceC10568wr2;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.d & 4) != 0) {
            interfaceC10568wr2Arr[i] = this.H.b(100, 5);
            i3 = 101;
            i++;
        }
        InterfaceC10568wr2[] interfaceC10568wr2Arr2 = (InterfaceC10568wr2[]) TD2.p1(this.I, i);
        this.I = interfaceC10568wr2Arr2;
        for (InterfaceC10568wr2 interfaceC10568wr22 : interfaceC10568wr2Arr2) {
            interfaceC10568wr22.a(T);
        }
        this.J = new InterfaceC10568wr2[this.f.size()];
        while (i2 < this.J.length) {
            InterfaceC10568wr2 b2 = this.H.b(i3, 3);
            b2.a(this.f.get(i2));
            this.J[i2] = b2;
            i2++;
            i3++;
        }
    }

    public final void o(AbstractC4501Vf.a aVar) throws C3989Py1 {
        int i = aVar.a;
        if (i == 1836019574) {
            s(aVar);
        } else if (i == 1836019558) {
            r(aVar);
        } else if (!this.p.isEmpty()) {
            this.p.peek().d(aVar);
        }
    }

    public final void p(C3012Fy1 c3012Fy1) {
        String str;
        String str2;
        long C1;
        long j;
        long C12;
        long N2;
        long j2;
        InterfaceC10568wr2[] interfaceC10568wr2Arr;
        if (this.I.length != 0) {
            c3012Fy1.Y(8);
            int c2 = AbstractC4501Vf.c(c3012Fy1.s());
            if (c2 != 0) {
                if (c2 != 1) {
                    I31.n(Q, "Skipping unsupported emsg version: " + c2);
                    return;
                }
                long N3 = c3012Fy1.N();
                j2 = TD2.C1(c3012Fy1.Q(), 1000000L, N3);
                long C13 = TD2.C1(c3012Fy1.N(), 1000L, N3);
                long N4 = c3012Fy1.N();
                str = (String) C9542sf.g(c3012Fy1.F());
                str2 = (String) C9542sf.g(c3012Fy1.F());
                C12 = C13;
                N2 = N4;
                C1 = -9223372036854775807L;
            } else {
                str = (String) C9542sf.g(c3012Fy1.F());
                str2 = (String) C9542sf.g(c3012Fy1.F());
                long N5 = c3012Fy1.N();
                C1 = TD2.C1(c3012Fy1.N(), 1000000L, N5);
                long j3 = this.B;
                if (j3 != C10323vs.b) {
                    j = j3 + C1;
                } else {
                    j = -9223372036854775807L;
                }
                C12 = TD2.C1(c3012Fy1.N(), 1000L, N5);
                N2 = c3012Fy1.N();
                j2 = j;
            }
            String str3 = str;
            String str4 = str2;
            byte[] bArr = new byte[c3012Fy1.a()];
            c3012Fy1.n(bArr, 0, c3012Fy1.a());
            C3012Fy1 c3012Fy12 = new C3012Fy1(this.n.a(new C3816Oe0(str3, str4, C12, N2, bArr)));
            int a2 = c3012Fy12.a();
            for (InterfaceC10568wr2 interfaceC10568wr2 : this.I) {
                c3012Fy12.Y(0);
                interfaceC10568wr2.e(c3012Fy12, a2);
            }
            if (j2 == C10323vs.b) {
                this.q.addLast(new b(C1, true, a2));
                this.y += a2;
            } else if (!this.q.isEmpty()) {
                this.q.addLast(new b(j2, false, a2));
                this.y += a2;
            } else {
                C10071up2 c10071up2 = this.m;
                if (c10071up2 != null && !c10071up2.f()) {
                    this.q.addLast(new b(j2, false, a2));
                    this.y += a2;
                    return;
                }
                C10071up2 c10071up22 = this.m;
                if (c10071up22 != null) {
                    j2 = c10071up22.a(j2);
                }
                long j4 = j2;
                for (InterfaceC10568wr2 interfaceC10568wr22 : this.I) {
                    interfaceC10568wr22.b(j4, 1, a2, 0, null);
                }
            }
        }
    }

    public final void q(AbstractC4501Vf.b bVar, long j) throws C3989Py1 {
        if (!this.p.isEmpty()) {
            this.p.peek().e(bVar);
            return;
        }
        int i = bVar.a;
        if (i == 1936286840) {
            Pair<Long, C6979iC> B = B(bVar.E1, j);
            this.B = ((Long) B.first).longValue();
            this.H.p((KZ1) B.second);
            this.K = true;
        } else if (i == 1701671783) {
            p(bVar.E1);
        }
    }

    public final void r(AbstractC4501Vf.a aVar) throws C3989Py1 {
        boolean z;
        SparseArray<c> sparseArray = this.g;
        if (this.e != null) {
            z = true;
        } else {
            z = false;
        }
        v(aVar, sparseArray, z, this.d, this.k);
        C6960i70 i = i(aVar.F1);
        if (i != null) {
            int size = this.g.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.g.valueAt(i2).n(i);
            }
        }
        if (this.z != C10323vs.b) {
            int size2 = this.g.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.g.valueAt(i3).l(this.z);
            }
            this.z = C10323vs.b;
        }
    }

    public final void s(AbstractC4501Vf.a aVar) throws C3989Py1 {
        boolean z;
        boolean z2;
        int i = 0;
        boolean z3 = true;
        if (this.e == null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.j(z, "Unexpected moov box.");
        C6960i70 i2 = i(aVar.F1);
        AbstractC4501Vf.a aVar2 = (AbstractC4501Vf.a) C9542sf.g(aVar.g(AbstractC4501Vf.q0));
        SparseArray<C9142r00> sparseArray = new SparseArray<>();
        int size = aVar2.F1.size();
        long j = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC4501Vf.b bVar = aVar2.F1.get(i3);
            int i4 = bVar.a;
            if (i4 == 1953654136) {
                Pair<Integer, C9142r00> F = F(bVar.E1);
                sparseArray.put(((Integer) F.first).intValue(), (C9142r00) F.second);
            } else if (i4 == 1835362404) {
                j = u(bVar.E1);
            }
        }
        BC0 bc0 = new BC0();
        if ((this.d & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<C10811xr2> B = C4598Wf.B(aVar, bc0, j, i2, z2, false, new YA0() { // from class: o.Nz0
            @Override // o.YA0
            public final Object apply(Object obj) {
                return C3894Oz0.this.n((C8615or2) obj);
            }
        });
        int size2 = B.size();
        if (this.g.size() == 0) {
            while (i < size2) {
                C10811xr2 c10811xr2 = B.get(i);
                C8615or2 c8615or2 = c10811xr2.a;
                this.g.put(c8615or2.a, new c(this.H.b(i, c8615or2.b), c10811xr2, h(sparseArray, c8615or2.a)));
                this.A = Math.max(this.A, c8615or2.e);
                i++;
            }
            this.H.n();
            return;
        }
        if (this.g.size() != size2) {
            z3 = false;
        }
        C9542sf.i(z3);
        while (i < size2) {
            C10811xr2 c10811xr22 = B.get(i);
            C8615or2 c8615or22 = c10811xr22.a;
            this.g.get(c8615or22.a).j(c10811xr22, h(sparseArray, c8615or22.a));
            i++;
        }
    }

    public final void t(long j) {
        while (!this.q.isEmpty()) {
            b removeFirst = this.q.removeFirst();
            this.y -= removeFirst.c;
            long j2 = removeFirst.a;
            if (removeFirst.b) {
                j2 += j;
            }
            C10071up2 c10071up2 = this.m;
            if (c10071up2 != null) {
                j2 = c10071up2.a(j2);
            }
            long j3 = j2;
            for (InterfaceC10568wr2 interfaceC10568wr2 : this.I) {
                interfaceC10568wr2.b(j3, 1, removeFirst.c, this.y, null);
            }
        }
    }

    public C3894Oz0(int i) {
        this(i, null);
    }

    public C3894Oz0(int i, @InterfaceC11300zs1 C10071up2 c10071up2) {
        this(i, c10071up2, null, Collections.EMPTY_LIST);
    }

    public C3894Oz0(int i, @InterfaceC11300zs1 C10071up2 c10071up2, @InterfaceC11300zs1 C8615or2 c8615or2) {
        this(i, c10071up2, c8615or2, Collections.EMPTY_LIST);
    }

    public C3894Oz0(int i, @InterfaceC11300zs1 C10071up2 c10071up2, @InterfaceC11300zs1 C8615or2 c8615or2, List<C10833xx0> list) {
        this(i, c10071up2, c8615or2, list, null);
    }

    public C3894Oz0(int i, @InterfaceC11300zs1 C10071up2 c10071up2, @InterfaceC11300zs1 C8615or2 c8615or2, List<C10833xx0> list, @InterfaceC11300zs1 InterfaceC10568wr2 interfaceC10568wr2) {
        this.d = i;
        this.m = c10071up2;
        this.e = c8615or2;
        this.f = Collections.unmodifiableList(list);
        this.r = interfaceC10568wr2;
        this.n = new C4010Qe0();
        this.f579o = new C3012Fy1(16);
        this.h = new C3012Fy1(C9337ro1.i);
        this.i = new C3012Fy1(5);
        this.j = new C3012Fy1();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new C3012Fy1(bArr);
        this.p = new ArrayDeque<>();
        this.q = new ArrayDeque<>();
        this.g = new SparseArray<>();
        this.A = C10323vs.b;
        this.z = C10323vs.b;
        this.B = C10323vs.b;
        this.H = InterfaceC4518Vj0.B;
        this.I = new InterfaceC10568wr2[0];
        this.J = new InterfaceC10568wr2[0];
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }

    @InterfaceC11300zs1
    public C8615or2 n(@InterfaceC11300zs1 C8615or2 c8615or2) {
        return c8615or2;
    }
}
