package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class LK {
    public static final LK J = new LK(androidx.constraintlayout.widget.e.W1);
    public static int K = Integer.MIN_VALUE;
    public static Map<c, String> L;
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String[] G;
    public boolean H;
    public boolean I;
    public final String a;
    public String b = null;
    public String c = null;
    public d d = new d(e.LEFT);
    public d e = new d(e.RIGHT);
    public g f = new g(h.TOP);
    public g g = new g(h.BOTTOM);
    public d h = new d(e.START);
    public d i = new d(e.END);
    public g j = new g(h.BASELINE);
    public int k;
    public int l;
    public float m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public String f531o;
    public String p;
    public int q;
    public float r;
    public int s;
    public int t;
    public float u;
    public float v;
    public c w;
    public c x;
    public b y;
    public b z;

    /* loaded from: classes.dex */
    public class a {
        public final f a;
        public int c;
        public a b = null;
        public int d = Integer.MIN_VALUE;

        public a(f fVar) {
            this.a = fVar;
        }

        public void a(StringBuilder sb) {
            if (this.b != null) {
                sb.append(this.a.toString().toLowerCase());
                sb.append(":");
                sb.append(this);
                sb.append(",\n");
            }
        }

        public String b() {
            return LK.this.a;
        }

        public LK c() {
            return LK.this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(C6566gU0.f);
            if (this.b != null) {
                sb.append("'");
                sb.append(this.b.b());
                sb.append("',");
                sb.append("'");
                sb.append(this.b.a.toString().toLowerCase());
                sb.append("'");
            }
            if (this.c != 0) {
                sb.append(",");
                sb.append(this.c);
            }
            if (this.d != Integer.MIN_VALUE) {
                if (this.c == 0) {
                    sb.append(",0,");
                    sb.append(this.d);
                } else {
                    sb.append(",");
                    sb.append(this.d);
                }
            }
            sb.append(C6566gU0.g);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    /* loaded from: classes.dex */
    public enum c {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* loaded from: classes.dex */
    public class d extends a {
        public d(e eVar) {
            super(f.valueOf(eVar.name()));
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        LEFT,
        RIGHT,
        START,
        END
    }

    /* loaded from: classes.dex */
    public enum f {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    /* loaded from: classes.dex */
    public class g extends a {
        public g(h hVar) {
            super(f.valueOf(hVar.name()));
        }
    }

    /* loaded from: classes.dex */
    public enum h {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        HashMap hashMap = new HashMap();
        L = hashMap;
        hashMap.put(c.SPREAD, "spread");
        L.put(c.SPREAD_INSIDE, "spread_inside");
        L.put(c.PACKED, "packed");
    }

    public LK(String str) {
        int i = K;
        this.k = i;
        this.l = i;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.f531o = null;
        this.p = null;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = i;
        this.B = i;
        this.C = i;
        this.D = i;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = null;
        this.H = false;
        this.I = false;
        this.a = str;
    }

    public c A() {
        return this.x;
    }

    public void A0(int i) {
        this.A = i;
    }

    public float B() {
        return this.u;
    }

    public void B0(int i) {
        this.C = i;
    }

    public int C() {
        return this.k;
    }

    public void C0(float f2) {
        this.E = f2;
    }

    public b D() {
        return this.y;
    }

    public int E() {
        return this.A;
    }

    public int F() {
        return this.C;
    }

    public float G() {
        return this.E;
    }

    public boolean H() {
        return this.I;
    }

    public boolean I() {
        return this.H;
    }

    public void J(g gVar) {
        K(gVar, 0);
    }

    public void K(g gVar, int i) {
        L(gVar, i, Integer.MIN_VALUE);
    }

    public void L(g gVar, int i, int i2) {
        g gVar2 = this.j;
        gVar2.b = gVar;
        gVar2.c = i;
        gVar2.d = i2;
    }

    public void M(g gVar) {
        N(gVar, 0);
    }

    public void N(g gVar, int i) {
        O(gVar, i, Integer.MIN_VALUE);
    }

    public void O(g gVar, int i, int i2) {
        g gVar2 = this.g;
        gVar2.b = gVar;
        gVar2.c = i;
        gVar2.d = i2;
    }

    public void P(d dVar) {
        Q(dVar, 0);
    }

    public void Q(d dVar, int i) {
        R(dVar, i, Integer.MIN_VALUE);
    }

    public void R(d dVar, int i, int i2) {
        d dVar2 = this.i;
        dVar2.b = dVar;
        dVar2.c = i;
        dVar2.d = i2;
    }

    public void S(d dVar) {
        T(dVar, 0);
    }

    public void T(d dVar, int i) {
        U(dVar, i, Integer.MIN_VALUE);
    }

    public void U(d dVar, int i, int i2) {
        d dVar2 = this.d;
        dVar2.b = dVar;
        dVar2.c = i;
        dVar2.d = i2;
    }

    public void V(d dVar) {
        W(dVar, 0);
    }

    public void W(d dVar, int i) {
        X(dVar, i, Integer.MIN_VALUE);
    }

    public void X(d dVar, int i, int i2) {
        d dVar2 = this.e;
        dVar2.b = dVar;
        dVar2.c = i;
        dVar2.d = i2;
    }

    public void Y(d dVar) {
        Z(dVar, 0);
    }

    public void Z(d dVar, int i) {
        a0(dVar, i, Integer.MIN_VALUE);
    }

    public void a0(d dVar, int i, int i2) {
        d dVar2 = this.h;
        dVar2.b = dVar;
        dVar2.c = i;
        dVar2.d = i2;
    }

    public void b(StringBuilder sb, String str, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f2);
        sb.append(",\n");
    }

    public void b0(g gVar) {
        c0(gVar, 0);
    }

    public String c(String[] strArr) {
        String str;
        StringBuilder sb = new StringBuilder(C6566gU0.f);
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                str = "'";
            } else {
                str = ",'";
            }
            sb.append(str);
            sb.append(strArr[i]);
            sb.append("'");
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public void c0(g gVar, int i) {
        d0(gVar, i, Integer.MIN_VALUE);
    }

    public g d() {
        return this.j;
    }

    public void d0(g gVar, int i, int i2) {
        g gVar2 = this.f;
        gVar2.b = gVar;
        gVar2.c = i;
        gVar2.d = i2;
    }

    public g e() {
        return this.g;
    }

    public void e0(float f2) {
        this.r = f2;
    }

    public float f() {
        return this.r;
    }

    public void f0(String str) {
        this.p = str;
    }

    public String g() {
        return this.p;
    }

    public void g0(int i) {
        this.q = i;
    }

    public int h() {
        return this.q;
    }

    public void h0(boolean z) {
        this.I = z;
    }

    public String i() {
        return this.f531o;
    }

    public void i0(boolean z) {
        this.H = z;
    }

    public int j() {
        return this.s;
    }

    public void j0(String str) {
        this.f531o = str;
    }

    public int k() {
        return this.t;
    }

    public void k0(int i) {
        this.s = i;
    }

    public d l() {
        return this.i;
    }

    public void l0(int i) {
        this.t = i;
    }

    public int m() {
        return this.l;
    }

    public void m0(int i) {
        this.l = i;
    }

    public b n() {
        return this.z;
    }

    public void n0(b bVar) {
        this.z = bVar;
    }

    public int o() {
        return this.B;
    }

    public void o0(int i) {
        this.B = i;
    }

    public int p() {
        return this.D;
    }

    public void p0(int i) {
        this.D = i;
    }

    public float q() {
        return this.F;
    }

    public void q0(float f2) {
        this.F = f2;
    }

    public float r() {
        return this.m;
    }

    public void r0(float f2) {
        this.m = f2;
    }

    public c s() {
        return this.w;
    }

    public void s0(c cVar) {
        this.w = cVar;
    }

    public float t() {
        return this.v;
    }

    public void t0(float f2) {
        this.v = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.a + ":{\n");
        this.d.a(sb);
        this.e.a(sb);
        this.f.a(sb);
        this.g.a(sb);
        this.h.a(sb);
        this.i.a(sb);
        this.j.a(sb);
        if (this.k != K) {
            sb.append("width:");
            sb.append(this.k);
            sb.append(",\n");
        }
        if (this.l != K) {
            sb.append("height:");
            sb.append(this.l);
            sb.append(",\n");
        }
        b(sb, "horizontalBias", this.m);
        b(sb, "verticalBias", this.n);
        if (this.f531o != null) {
            sb.append("dimensionRatio:'");
            sb.append(this.f531o);
            sb.append("',\n");
        }
        if (this.p != null && (!Float.isNaN(this.r) || this.q != Integer.MIN_VALUE)) {
            sb.append("circular:['");
            sb.append(this.p);
            sb.append("'");
            if (!Float.isNaN(this.r)) {
                sb.append(",");
                sb.append(this.r);
            }
            if (this.q != Integer.MIN_VALUE) {
                if (Float.isNaN(this.r)) {
                    sb.append(",0,");
                    sb.append(this.q);
                } else {
                    sb.append(",");
                    sb.append(this.q);
                }
            }
            sb.append("],\n");
        }
        b(sb, "verticalWeight", this.u);
        b(sb, "horizontalWeight", this.v);
        if (this.w != null) {
            sb.append("horizontalChainStyle:'");
            sb.append(L.get(this.w));
            sb.append("',\n");
        }
        if (this.x != null) {
            sb.append("verticalChainStyle:'");
            sb.append(L.get(this.x));
            sb.append("',\n");
        }
        if (this.y != null) {
            int i = this.A;
            int i2 = K;
            if (i == i2 && this.C == i2) {
                sb.append("width:'");
                sb.append(this.y.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("width:{value:'");
                sb.append(this.y.toString().toLowerCase());
                sb.append("'");
                if (this.A != K) {
                    sb.append(",max:");
                    sb.append(this.A);
                }
                if (this.C != K) {
                    sb.append(",min:");
                    sb.append(this.C);
                }
                sb.append("},\n");
            }
        }
        if (this.z != null) {
            int i3 = this.B;
            int i4 = K;
            if (i3 == i4 && this.D == i4) {
                sb.append("height:'");
                sb.append(this.z.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("height:{value:'");
                sb.append(this.z.toString().toLowerCase());
                sb.append("'");
                if (this.B != K) {
                    sb.append(",max:");
                    sb.append(this.B);
                }
                if (this.D != K) {
                    sb.append(",min:");
                    sb.append(this.D);
                }
                sb.append("},\n");
            }
        }
        if (!Double.isNaN(this.E)) {
            sb.append("width:'");
            sb.append((int) this.E);
            sb.append("%',\n");
        }
        if (!Double.isNaN(this.F)) {
            sb.append("height:'");
            sb.append((int) this.F);
            sb.append("%',\n");
        }
        if (this.G != null) {
            sb.append("referenceIds:");
            sb.append(c(this.G));
            sb.append(",\n");
        }
        if (this.H) {
            sb.append("constrainedWidth:");
            sb.append(this.H);
            sb.append(",\n");
        }
        if (this.I) {
            sb.append("constrainedHeight:");
            sb.append(this.I);
            sb.append(",\n");
        }
        sb.append("},\n");
        return sb.toString();
    }

    public d u() {
        return this.d;
    }

    public void u0(String[] strArr) {
        this.G = strArr;
    }

    public String[] v() {
        return this.G;
    }

    public void v0(float f2) {
        this.n = f2;
    }

    public d w() {
        return this.e;
    }

    public void w0(c cVar) {
        this.x = cVar;
    }

    public d x() {
        return this.h;
    }

    public void x0(float f2) {
        this.u = f2;
    }

    public g y() {
        return this.f;
    }

    public void y0(int i) {
        this.k = i;
    }

    public float z() {
        return this.n;
    }

    public void z0(b bVar) {
        this.y = bVar;
    }
}
