package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import o.MK;
import o.Q92;

/* renamed from: o.u01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9872u01 {
    public static boolean A = true;
    public static boolean B = false;
    public static C3641Mj1 C = null;
    public static long D = 0;
    public static long E = 0;
    public static final boolean s = false;
    public static final boolean t = false;
    public static final boolean u = false;
    public static final boolean v = false;
    public static boolean w = false;
    public static boolean x = true;
    public static boolean y = true;
    public static boolean z = true;
    public a e;

    /* renamed from: o  reason: collision with root package name */
    public final C5191at f880o;
    public a r;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public HashMap<String, Q92> d = null;
    public int f = 32;
    public int g = 32;
    public boolean i = false;
    public boolean j = false;
    public boolean[] k = new boolean[32];
    public int l = 1;
    public int m = 0;
    public int n = 32;
    public Q92[] p = new Q92[1000];
    public int q = 0;
    public C3130He[] h = new C3130He[32];

    /* renamed from: o.u01$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(C9872u01 c9872u01, Q92 q92, boolean z);

        Q92 b(C9872u01 c9872u01, boolean[] zArr);

        void c(a aVar);

        void clear();

        void d(C9872u01 c9872u01, C3130He c3130He, boolean z);

        void e(C9872u01 c9872u01);

        void f(Q92 q92);

        Q92 getKey();

        boolean isEmpty();
    }

    /* renamed from: o.u01$b */
    /* loaded from: classes.dex */
    public static class b extends C3130He {
        public b(C5191at c5191at) {
            this.e = new R92(this, c5191at);
        }
    }

    public C9872u01() {
        U();
        C5191at c5191at = new C5191at();
        this.f880o = c5191at;
        this.e = new CH1(c5191at);
        if (B) {
            this.r = new b(c5191at);
        } else {
            this.r = new C3130He(c5191at);
        }
    }

    public static C3641Mj1 J() {
        return C;
    }

    public static C3130He u(C9872u01 c9872u01, Q92 q92, Q92 q922, float f) {
        return c9872u01.t().m(q92, q922, f);
    }

    public void A() {
        int i = 0;
        for (int i2 = 0; i2 < this.f; i2++) {
            C3130He c3130He = this.h[i2];
            if (c3130He != null) {
                i += c3130He.E();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.m; i4++) {
            C3130He c3130He2 = this.h[i4];
            if (c3130He2 != null) {
                i3 += c3130He2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f);
        sb.append(" (");
        int i5 = this.f;
        sb.append(F(i5 * i5));
        sb.append(") -- row sizes: ");
        sb.append(F(i));
        sb.append(", actual size: ");
        sb.append(F(i3));
        sb.append(" rows: ");
        sb.append(this.m);
        sb.append(RemoteSettings.i);
        sb.append(this.n);
        sb.append(" cols: ");
        sb.append(this.l);
        sb.append(RemoteSettings.i);
        sb.append(this.g);
        sb.append(C4500Ve2.b);
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(F(0));
        printStream.println(sb.toString());
    }

    public void B() {
        z();
        String str = "";
        for (int i = 0; i < this.m; i++) {
            if (this.h[i].a.e1 == Q92.a.UNRESTRICTED) {
                str = (str + this.h[i].F()) + "\n";
            }
        }
        System.out.println(str + this.e + "\n");
    }

    public final int C(a aVar) throws Exception {
        float f;
        long j;
        for (int i = 0; i < this.m; i++) {
            C3130He c3130He = this.h[i];
            if (c3130He.a.e1 != Q92.a.UNRESTRICTED) {
                float f2 = 0.0f;
                if (c3130He.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        C3641Mj1 c3641Mj1 = C;
                        long j2 = 1;
                        if (c3641Mj1 != null) {
                            c3641Mj1.f546o++;
                        }
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (true) {
                            if (i3 >= this.m) {
                                break;
                            }
                            C3130He c3130He2 = this.h[i3];
                            if (c3130He2.a.e1 != Q92.a.UNRESTRICTED && !c3130He2.f && c3130He2.b < f2) {
                                if (A) {
                                    int d = c3130He2.e.d();
                                    int i7 = 0;
                                    while (i7 < d) {
                                        float f4 = f2;
                                        Q92 f5 = c3130He2.e.f(i7);
                                        long j3 = j2;
                                        float e = c3130He2.e.e(f5);
                                        if (e > f4) {
                                            for (int i8 = 0; i8 < 9; i8++) {
                                                float f6 = f5.c1[i8] / e;
                                                if ((f6 < f3 && i8 == i6) || i8 > i6) {
                                                    i6 = i8;
                                                    i5 = f5.Z;
                                                    i4 = i3;
                                                    f3 = f6;
                                                }
                                            }
                                        }
                                        i7++;
                                        f2 = f4;
                                        j2 = j3;
                                    }
                                } else {
                                    f = f2;
                                    j = j2;
                                    for (int i9 = 1; i9 < this.l; i9++) {
                                        Q92 q92 = this.f880o.d[i9];
                                        float e2 = c3130He2.e.e(q92);
                                        if (e2 > f) {
                                            for (int i10 = 0; i10 < 9; i10++) {
                                                float f7 = q92.c1[i10] / e2;
                                                if ((f7 < f3 && i10 == i6) || i10 > i6) {
                                                    i6 = i10;
                                                    f3 = f7;
                                                    i4 = i3;
                                                    i5 = i9;
                                                }
                                            }
                                        }
                                    }
                                    i3++;
                                    f2 = f;
                                    j2 = j;
                                }
                            }
                            f = f2;
                            j = j2;
                            i3++;
                            f2 = f;
                            j2 = j;
                        }
                        float f8 = f2;
                        long j4 = j2;
                        if (i4 != -1) {
                            C3130He c3130He3 = this.h[i4];
                            c3130He3.a.Y0 = -1;
                            C3641Mj1 c3641Mj12 = C;
                            if (c3641Mj12 != null) {
                                c3641Mj12.n += j4;
                            }
                            c3130He3.C(this.f880o.d[i5]);
                            Q92 q922 = c3130He3.a;
                            q922.Y0 = i4;
                            q922.t(this, c3130He3);
                        } else {
                            z2 = true;
                        }
                        if (i2 > this.l / 2) {
                            z2 = true;
                        }
                        f2 = f8;
                    }
                    return i2;
                }
            }
        }
        return 0;
    }

    public void D(C3641Mj1 c3641Mj1) {
        C = c3641Mj1;
    }

    public C5191at E() {
        return this.f880o;
    }

    public final String F(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        if (i4 > 0) {
            return "" + i4 + " Mb";
        } else if (i3 > 0) {
            return "" + i3 + " Kb";
        } else {
            return "" + i2 + " bytes";
        }
    }

    public final String G(int i) {
        if (i == 1) {
            return "LOW";
        }
        if (i == 2) {
            return "MEDIUM";
        }
        if (i == 3) {
            return "HIGH";
        }
        if (i == 4) {
            return "HIGHEST";
        }
        if (i == 5) {
            return "EQUALITY";
        }
        if (i == 8) {
            return "FIXED";
        }
        if (i == 6) {
            return "BARRIER";
        }
        return XH0.M;
    }

    public a H() {
        return this.e;
    }

    public int I() {
        int i = 0;
        for (int i2 = 0; i2 < this.m; i2++) {
            C3130He c3130He = this.h[i2];
            if (c3130He != null) {
                i += c3130He.E();
            }
        }
        return i;
    }

    public int K() {
        return this.m;
    }

    public int L() {
        return this.c;
    }

    public int M(Object obj) {
        Q92 j = ((MK) obj).j();
        if (j != null) {
            return (int) (j.a1 + 0.5f);
        }
        return 0;
    }

    public C3130He N(int i) {
        return this.h[i];
    }

    public float O(String str) {
        Q92 P = P(str, Q92.a.UNRESTRICTED);
        if (P == null) {
            return 0.0f;
        }
        return P.a1;
    }

    public Q92 P(String str, Q92.a aVar) {
        if (this.d == null) {
            this.d = new HashMap<>();
        }
        Q92 q92 = this.d.get(str);
        if (q92 == null) {
            return w(str, aVar);
        }
        return q92;
    }

    public final void Q() {
        int i = this.f * 2;
        this.f = i;
        this.h = (C3130He[]) Arrays.copyOf(this.h, i);
        C5191at c5191at = this.f880o;
        c5191at.d = (Q92[]) Arrays.copyOf(c5191at.d, this.f);
        int i2 = this.f;
        this.k = new boolean[i2];
        this.g = i2;
        this.n = i2;
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.h++;
            c3641Mj1.t = Math.max(c3641Mj1.t, i2);
            C3641Mj1 c3641Mj12 = C;
            c3641Mj12.E = c3641Mj12.t;
        }
    }

    public void R() throws Exception {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.i++;
        }
        if (this.e.isEmpty()) {
            p();
        } else if (!this.i && !this.j) {
            S(this.e);
        } else {
            C3641Mj1 c3641Mj12 = C;
            if (c3641Mj12 != null) {
                c3641Mj12.v++;
            }
            for (int i = 0; i < this.m; i++) {
                if (!this.h[i].f) {
                    S(this.e);
                    return;
                }
            }
            C3641Mj1 c3641Mj13 = C;
            if (c3641Mj13 != null) {
                c3641Mj13.u++;
            }
            p();
        }
    }

    public void S(a aVar) throws Exception {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.z++;
            c3641Mj1.A = Math.max(c3641Mj1.A, this.l);
            C3641Mj1 c3641Mj12 = C;
            c3641Mj12.B = Math.max(c3641Mj12.B, this.m);
        }
        C(aVar);
        T(aVar, false);
        p();
    }

    public final int T(a aVar, boolean z2) {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.l++;
        }
        for (int i = 0; i < this.l; i++) {
            this.k[i] = false;
        }
        boolean z3 = false;
        int i2 = 0;
        while (!z3) {
            C3641Mj1 c3641Mj12 = C;
            if (c3641Mj12 != null) {
                c3641Mj12.m++;
            }
            i2++;
            if (i2 < this.l * 2) {
                if (aVar.getKey() != null) {
                    this.k[aVar.getKey().Z] = true;
                }
                Q92 b2 = aVar.b(this, this.k);
                if (b2 != null) {
                    boolean[] zArr = this.k;
                    int i3 = b2.Z;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    }
                }
                if (b2 != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.m; i5++) {
                        C3130He c3130He = this.h[i5];
                        if (c3130He.a.e1 != Q92.a.UNRESTRICTED && !c3130He.f && c3130He.y(b2)) {
                            float e = c3130He.e.e(b2);
                            if (e < 0.0f) {
                                float f2 = (-c3130He.b) / e;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        C3130He c3130He2 = this.h[i4];
                        c3130He2.a.Y0 = -1;
                        C3641Mj1 c3641Mj13 = C;
                        if (c3641Mj13 != null) {
                            c3641Mj13.n++;
                        }
                        c3130He2.C(b2);
                        Q92 q92 = c3130He2.a;
                        q92.Y0 = i4;
                        q92.t(this, c3130He2);
                    }
                } else {
                    z3 = true;
                }
            }
            return i2;
        }
        return i2;
    }

    public final void U() {
        int i = 0;
        if (B) {
            while (i < this.m) {
                C3130He c3130He = this.h[i];
                if (c3130He != null) {
                    this.f880o.a.b(c3130He);
                }
                this.h[i] = null;
                i++;
            }
            return;
        }
        while (i < this.m) {
            C3130He c3130He2 = this.h[i];
            if (c3130He2 != null) {
                this.f880o.b.b(c3130He2);
            }
            this.h[i] = null;
            i++;
        }
    }

    public void V(C3130He c3130He) {
        Q92 q92;
        int i;
        if (c3130He.f && (q92 = c3130He.a) != null) {
            int i2 = q92.Y0;
            if (i2 != -1) {
                while (true) {
                    i = this.m;
                    if (i2 >= i - 1) {
                        break;
                    }
                    C3130He[] c3130HeArr = this.h;
                    int i3 = i2 + 1;
                    C3130He c3130He2 = c3130HeArr[i3];
                    Q92 q922 = c3130He2.a;
                    if (q922.Y0 == i3) {
                        q922.Y0 = i2;
                    }
                    c3130HeArr[i2] = c3130He2;
                    i2 = i3;
                }
                this.m = i - 1;
            }
            Q92 q923 = c3130He.a;
            if (!q923.b1) {
                q923.o(this, c3130He.b);
            }
            if (B) {
                this.f880o.a.b(c3130He);
            } else {
                this.f880o.b.b(c3130He);
            }
        }
    }

    public void W() {
        C5191at c5191at;
        int i = 0;
        while (true) {
            c5191at = this.f880o;
            Q92[] q92Arr = c5191at.d;
            if (i >= q92Arr.length) {
                break;
            }
            Q92 q92 = q92Arr[i];
            if (q92 != null) {
                q92.n();
            }
            i++;
        }
        c5191at.c.c(this.p, this.q);
        this.q = 0;
        Arrays.fill(this.f880o.d, (Object) null);
        HashMap<String, Q92> hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.c = 0;
        this.e.clear();
        this.l = 1;
        for (int i2 = 0; i2 < this.m; i2++) {
            C3130He c3130He = this.h[i2];
            if (c3130He != null) {
                c3130He.c = false;
            }
        }
        U();
        this.m = 0;
        if (B) {
            this.r = new b(this.f880o);
        } else {
            this.r = new C3130He(this.f880o);
        }
    }

    public final Q92 a(Q92.a aVar, String str) {
        Q92 a2 = this.f880o.c.a();
        if (a2 == null) {
            a2 = new Q92(aVar, str);
            a2.r(aVar, str);
        } else {
            a2.n();
            a2.r(aVar, str);
        }
        int i = this.q;
        int i2 = this.a;
        if (i >= i2) {
            int i3 = i2 * 2;
            this.a = i3;
            this.p = (Q92[]) Arrays.copyOf(this.p, i3);
        }
        Q92[] q92Arr = this.p;
        int i4 = this.q;
        this.q = i4 + 1;
        q92Arr[i4] = a2;
        return a2;
    }

    public void b(UK uk, UK uk2, float f, int i) {
        MK.a aVar = MK.a.LEFT;
        Q92 s2 = s(uk.r(aVar));
        MK.a aVar2 = MK.a.TOP;
        Q92 s3 = s(uk.r(aVar2));
        MK.a aVar3 = MK.a.RIGHT;
        Q92 s4 = s(uk.r(aVar3));
        MK.a aVar4 = MK.a.BOTTOM;
        Q92 s5 = s(uk.r(aVar4));
        Q92 s6 = s(uk2.r(aVar));
        Q92 s7 = s(uk2.r(aVar2));
        Q92 s8 = s(uk2.r(aVar3));
        Q92 s9 = s(uk2.r(aVar4));
        C3130He t2 = t();
        double d = f;
        double d2 = i;
        t2.v(s3, s5, s7, s9, (float) (Math.sin(d) * d2));
        d(t2);
        C3130He t3 = t();
        t3.v(s2, s4, s6, s8, (float) (Math.cos(d) * d2));
        d(t3);
    }

    public void c(Q92 q92, Q92 q922, int i, float f, Q92 q923, Q92 q924, int i2, int i3) {
        C3130He t2 = t();
        t2.k(q92, q922, i, f, q923, q924, i2);
        if (i3 != 8) {
            t2.g(this, i3);
        }
        d(t2);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(C3130He c3130He) {
        Q92 A2;
        if (c3130He != null) {
            C3641Mj1 c3641Mj1 = C;
            if (c3641Mj1 != null) {
                c3641Mj1.j++;
                if (c3130He.f) {
                    c3641Mj1.k++;
                }
            }
            boolean z2 = true;
            if (this.m + 1 >= this.n || this.l + 1 >= this.g) {
                Q();
            }
            boolean z3 = false;
            if (!c3130He.f) {
                c3130He.e(this);
                if (!c3130He.isEmpty()) {
                    c3130He.w();
                    if (c3130He.i(this)) {
                        Q92 r = r();
                        c3130He.a = r;
                        int i = this.m;
                        l(c3130He);
                        if (this.m == i + 1) {
                            this.r.c(c3130He);
                            T(this.r, true);
                            if (r.Y0 == -1) {
                                if (c3130He.a == r && (A2 = c3130He.A(r)) != null) {
                                    C3641Mj1 c3641Mj12 = C;
                                    if (c3641Mj12 != null) {
                                        c3641Mj12.n++;
                                    }
                                    c3130He.C(A2);
                                }
                                if (!c3130He.f) {
                                    c3130He.a.t(this, c3130He);
                                }
                                if (B) {
                                    this.f880o.a.b(c3130He);
                                } else {
                                    this.f880o.b.b(c3130He);
                                }
                                this.m--;
                            }
                            if (!c3130He.x()) {
                                z3 = z2;
                            } else {
                                return;
                            }
                        }
                    }
                    z2 = false;
                    if (!c3130He.x()) {
                    }
                } else {
                    return;
                }
            }
            if (!z3) {
                l(c3130He);
            }
        }
    }

    public C3130He e(Q92 q92, Q92 q922, int i, int i2) {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.U++;
        }
        if (x && i2 == 8 && q922.b1 && q92.Y0 == -1) {
            q92.o(this, q922.a1 + i);
            return null;
        }
        C3130He t2 = t();
        t2.r(q92, q922, i);
        if (i2 != 8) {
            t2.g(this, i2);
        }
        d(t2);
        return t2;
    }

    public void f(Q92 q92, int i) {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.U++;
        }
        if (x && q92.Y0 == -1) {
            float f = i;
            q92.o(this, f);
            for (int i2 = 0; i2 < this.c + 1; i2++) {
                Q92 q922 = this.f880o.d[i2];
                if (q922 != null && q922.i1 && q922.j1 == q92.Z) {
                    q922.o(this, q922.k1 + f);
                }
            }
            return;
        }
        int i3 = q92.Y0;
        if (i3 != -1) {
            C3130He c3130He = this.h[i3];
            if (c3130He.f) {
                c3130He.b = i;
                return;
            } else if (c3130He.e.d() == 0) {
                c3130He.f = true;
                c3130He.b = i;
                return;
            } else {
                C3130He t2 = t();
                t2.q(q92, i);
                d(t2);
                return;
            }
        }
        C3130He t3 = t();
        t3.l(q92, i);
        d(t3);
    }

    public void g(Q92 q92, Q92 q922, int i, boolean z2) {
        C3130He t2 = t();
        Q92 v2 = v();
        v2.Z0 = 0;
        t2.t(q92, q922, v2, i);
        d(t2);
    }

    public void h(Q92 q92, Q92 q922, int i, int i2) {
        C3130He t2 = t();
        Q92 v2 = v();
        v2.Z0 = 0;
        t2.t(q92, q922, v2, i);
        if (i2 != 8) {
            m(t2, (int) (t2.e.e(v2) * (-1.0f)), i2);
        }
        d(t2);
    }

    public void i(Q92 q92, Q92 q922, int i, boolean z2) {
        C3130He t2 = t();
        Q92 v2 = v();
        v2.Z0 = 0;
        t2.u(q92, q922, v2, i);
        d(t2);
    }

    public void j(Q92 q92, Q92 q922, int i, int i2) {
        C3130He t2 = t();
        Q92 v2 = v();
        v2.Z0 = 0;
        t2.u(q92, q922, v2, i);
        if (i2 != 8) {
            m(t2, (int) (t2.e.e(v2) * (-1.0f)), i2);
        }
        d(t2);
    }

    public void k(Q92 q92, Q92 q922, Q92 q923, Q92 q924, float f, int i) {
        C3130He t2 = t();
        t2.n(q92, q922, q923, q924, f);
        if (i != 8) {
            t2.g(this, i);
        }
        d(t2);
    }

    public final void l(C3130He c3130He) {
        int i;
        if (y && c3130He.f) {
            c3130He.a.o(this, c3130He.b);
        } else {
            C3130He[] c3130HeArr = this.h;
            int i2 = this.m;
            c3130HeArr[i2] = c3130He;
            Q92 q92 = c3130He.a;
            q92.Y0 = i2;
            this.m = i2 + 1;
            q92.t(this, c3130He);
        }
        if (y && this.b) {
            int i3 = 0;
            while (i3 < this.m) {
                if (this.h[i3] == null) {
                    System.out.println("WTF");
                }
                C3130He c3130He2 = this.h[i3];
                if (c3130He2 != null && c3130He2.f) {
                    c3130He2.a.o(this, c3130He2.b);
                    if (B) {
                        this.f880o.a.b(c3130He2);
                    } else {
                        this.f880o.b.b(c3130He2);
                    }
                    this.h[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.m;
                        if (i4 >= i) {
                            break;
                        }
                        C3130He[] c3130HeArr2 = this.h;
                        int i6 = i4 - 1;
                        C3130He c3130He3 = c3130HeArr2[i4];
                        c3130HeArr2[i6] = c3130He3;
                        Q92 q922 = c3130He3.a;
                        if (q922.Y0 == i4) {
                            q922.Y0 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.h[i5] = null;
                    }
                    this.m = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public void m(C3130He c3130He, int i, int i2) {
        c3130He.h(q(i2, null), i);
    }

    public void n(Q92 q92, Q92 q922, int i) {
        if (q92.Y0 == -1 && i == 0) {
            if (q922.i1) {
                q922 = this.f880o.d[q922.j1];
            }
            if (q92.i1) {
                Q92 q923 = this.f880o.d[q92.j1];
                return;
            } else {
                q92.q(this, q922, 0.0f);
                return;
            }
        }
        e(q92, q922, i, 8);
    }

    public final void o() {
        int i;
        int i2 = 0;
        while (i2 < this.m) {
            C3130He c3130He = this.h[i2];
            if (c3130He.e.d() == 0) {
                c3130He.f = true;
            }
            if (c3130He.f) {
                Q92 q92 = c3130He.a;
                q92.a1 = c3130He.b;
                q92.m(c3130He);
                int i3 = i2;
                while (true) {
                    i = this.m;
                    if (i3 >= i - 1) {
                        break;
                    }
                    C3130He[] c3130HeArr = this.h;
                    int i4 = i3 + 1;
                    c3130HeArr[i3] = c3130HeArr[i4];
                    i3 = i4;
                }
                this.h[i - 1] = null;
                this.m = i - 1;
                i2--;
                if (B) {
                    this.f880o.a.b(c3130He);
                } else {
                    this.f880o.b.b(c3130He);
                }
            }
            i2++;
        }
    }

    public final void p() {
        for (int i = 0; i < this.m; i++) {
            C3130He c3130He = this.h[i];
            c3130He.a.a1 = c3130He.b;
        }
    }

    public Q92 q(int i, String str) {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.q++;
        }
        if (this.l + 1 >= this.g) {
            Q();
        }
        Q92 a2 = a(Q92.a.ERROR, str);
        int i2 = this.c + 1;
        this.c = i2;
        this.l++;
        a2.Z = i2;
        a2.Z0 = i;
        this.f880o.d[i2] = a2;
        this.e.f(a2);
        return a2;
    }

    public Q92 r() {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.s++;
        }
        if (this.l + 1 >= this.g) {
            Q();
        }
        Q92 a2 = a(Q92.a.SLACK, null);
        int i = this.c + 1;
        this.c = i;
        this.l++;
        a2.Z = i;
        this.f880o.d[i] = a2;
        return a2;
    }

    public Q92 s(Object obj) {
        Q92 q92 = null;
        if (obj == null) {
            return null;
        }
        if (this.l + 1 >= this.g) {
            Q();
        }
        if (obj instanceof MK) {
            MK mk = (MK) obj;
            q92 = mk.j();
            if (q92 == null) {
                mk.z(this.f880o);
                q92 = mk.j();
            }
            int i = q92.Z;
            if (i != -1 && i <= this.c && this.f880o.d[i] != null) {
                return q92;
            }
            if (i != -1) {
                q92.n();
            }
            int i2 = this.c + 1;
            this.c = i2;
            this.l++;
            q92.Z = i2;
            q92.e1 = Q92.a.UNRESTRICTED;
            this.f880o.d[i2] = q92;
        }
        return q92;
    }

    public C3130He t() {
        C3130He a2;
        if (B) {
            a2 = this.f880o.a.a();
            if (a2 == null) {
                a2 = new b(this.f880o);
                E++;
            } else {
                a2.D();
            }
        } else {
            a2 = this.f880o.b.a();
            if (a2 == null) {
                a2 = new C3130He(this.f880o);
                D++;
            } else {
                a2.D();
            }
        }
        Q92.l();
        return a2;
    }

    public Q92 v() {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.r++;
        }
        if (this.l + 1 >= this.g) {
            Q();
        }
        Q92 a2 = a(Q92.a.SLACK, null);
        int i = this.c + 1;
        this.c = i;
        this.l++;
        a2.Z = i;
        this.f880o.d[i] = a2;
        return a2;
    }

    public final Q92 w(String str, Q92.a aVar) {
        C3641Mj1 c3641Mj1 = C;
        if (c3641Mj1 != null) {
            c3641Mj1.p++;
        }
        if (this.l + 1 >= this.g) {
            Q();
        }
        Q92 a2 = a(aVar, null);
        a2.p(str);
        int i = this.c + 1;
        this.c = i;
        this.l++;
        a2.Z = i;
        if (this.d == null) {
            this.d = new HashMap<>();
        }
        this.d.put(str, a2);
        this.f880o.d[this.c] = a2;
        return a2;
    }

    public void x() {
        z();
        String str = " num vars " + this.c + "\n";
        for (int i = 0; i < this.c + 1; i++) {
            Q92 q92 = this.f880o.d[i];
            if (q92 != null && q92.b1) {
                str = str + " $[" + i + "] => " + q92 + " = " + q92.a1 + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i2 = 0; i2 < this.c + 1; i2++) {
            Q92[] q92Arr = this.f880o.d;
            Q92 q922 = q92Arr[i2];
            if (q922 != null && q922.i1) {
                str2 = str2 + " ~[" + i2 + "] => " + q922 + " = " + q92Arr[q922.j1] + " + " + q922.k1 + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.m; i3++) {
            str3 = (str3 + this.h[i3].F()) + "\n #  ";
        }
        if (this.e != null) {
            str3 = str3 + "Goal: " + this.e + "\n";
        }
        System.out.println(str3);
    }

    public final void y() {
        z();
        String str = "";
        for (int i = 0; i < this.m; i++) {
            str = (str + this.h[i]) + "\n";
        }
        System.out.println(str + this.e + "\n");
    }

    public final void z() {
        System.out.println("Display Rows (" + this.m + "x" + this.l + ")\n");
    }
}
