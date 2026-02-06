package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.MK;
import o.TD0;

/* loaded from: classes.dex */
public class UK {
    public static float A1 = 0.5f;
    public static final boolean U0 = false;
    public static final boolean V0 = false;
    public static final int W0 = 1;
    public static final int X0 = 2;
    public static final boolean Y0 = false;
    public static final int Z0 = 0;
    public static final int a1 = 1;
    public static final int b1 = 2;
    public static final int c1 = 3;
    public static final int d1 = 4;
    public static final int e1 = -1;
    public static final int f1 = 0;
    public static final int g1 = 1;
    public static final int h1 = 2;
    public static final int i1 = 0;
    public static final int j1 = 4;
    public static final int k1 = 8;
    public static final int l1 = 0;
    public static final int m1 = 1;
    public static final int n1 = 2;
    public static final int o1 = 0;
    public static final int p1 = 1;
    public static final int q1 = 2;
    public static final int r1 = 3;
    public static final int s1 = -2;
    public static final int t1 = 0;
    public static final int u1 = 1;
    public static final int v1 = 2;
    public static final int w1 = 3;
    public static final int x1 = 4;
    public static final int y1 = 0;
    public static final int z1 = 1;
    public int A;
    public int A0;
    public float B;
    public int B0;
    public int C;
    public boolean C0;
    public int D;
    public boolean D0;
    public float E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public int H;
    public boolean H0;
    public float I;
    public boolean I0;
    public int[] J;
    public int J0;
    public float K;
    public int K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public float[] N0;
    public int O;
    public UK[] O0;
    public int P;
    public UK[] P0;
    public MK Q;
    public UK Q0;
    public MK R;
    public UK R0;
    public MK S;
    public int S0;
    public MK T;
    public int T0;
    public MK U;
    public MK V;
    public MK W;
    public MK X;
    public MK[] Y;
    public ArrayList<MK> Z;
    public boolean a;
    public boolean[] a0;
    public WK2[] b;
    public b[] b0;
    public C4672Wz c;
    public UK c0;
    public C4672Wz d;
    public int d0;
    public C7731lI0 e;
    public int e0;
    public C6010eF2 f;
    public float f0;
    public boolean[] g;
    public int g0;
    public boolean h;
    public int h0;
    public boolean i;
    public int i0;
    public boolean j;
    public int j0;
    public boolean k;
    public int k0;
    public int l;
    public int l0;
    public int m;
    public int m0;
    public UK2 n;
    public int n0;

    /* renamed from: o  reason: collision with root package name */
    public String f625o;
    public int o0;
    public boolean p;
    public int p0;
    public boolean q;
    public float q0;
    public boolean r;
    public float r0;
    public boolean s;
    public Object s0;
    public int t;
    public int t0;
    public int u;
    public int u0;
    public int v;
    public boolean v0;
    public int w;
    public String w0;
    public int x;
    public String x0;
    public int[] y;
    public int y0;
    public int z;
    public int z0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MK.a.values().length];
            a = iArr;
            try {
                iArr[MK.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MK.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MK.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MK.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MK.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MK.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MK.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[MK.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[MK.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public UK() {
        this.a = false;
        this.b = new WK2[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new UK2(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = Float.NaN;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new MK(this, MK.a.LEFT);
        this.R = new MK(this, MK.a.TOP);
        this.S = new MK(this, MK.a.RIGHT);
        this.T = new MK(this, MK.a.BOTTOM);
        this.U = new MK(this, MK.a.BASELINE);
        this.V = new MK(this, MK.a.CENTER_X);
        this.W = new MK(this, MK.a.CENTER_Y);
        MK mk = new MK(this, MK.a.CENTER);
        this.X = mk;
        this.Y = new MK[]{this.Q, this.S, this.R, this.T, this.U, mk};
        this.Z = new ArrayList<>();
        this.a0 = new boolean[2];
        b bVar = b.FIXED;
        this.b0 = new b[]{bVar, bVar};
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = A1;
        this.q0 = f;
        this.r0 = f;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new UK[]{null, null};
        this.P0 = new UK[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
    }

    public float A() {
        return this.f0;
    }

    public boolean A0(int i) {
        return this.a0[i];
    }

    public void A1(boolean z) {
        this.G = z;
    }

    public int B() {
        return this.g0;
    }

    public boolean B0() {
        MK mk = this.Q;
        MK mk2 = mk.f;
        if (mk2 == null || mk2.f != mk) {
            MK mk3 = this.S;
            MK mk4 = mk3.f;
            if (mk4 != null && mk4.f == mk3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void B1(float f) {
        this.q0 = f;
    }

    public boolean C() {
        return this.L;
    }

    public boolean C0() {
        return this.M;
    }

    public void C1(int i) {
        this.J0 = i;
    }

    public int D() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.e0;
    }

    public boolean D0() {
        MK mk = this.R;
        MK mk2 = mk.f;
        if (mk2 == null || mk2.f != mk) {
            MK mk3 = this.T;
            MK mk4 = mk3.f;
            if (mk4 != null && mk4.f == mk3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void D1(int i, int i2) {
        this.h0 = i;
        int i3 = i2 - i;
        this.d0 = i3;
        int i4 = this.o0;
        if (i3 < i4) {
            this.d0 = i4;
        }
    }

    public float E() {
        return this.q0;
    }

    public boolean E0() {
        return this.N;
    }

    public void E1(b bVar) {
        this.b0[0] = bVar;
    }

    public UK F() {
        MK k;
        UK i;
        MK k2;
        if (!B0()) {
            return null;
        }
        UK uk = this;
        UK uk2 = null;
        while (uk2 == null && uk != null) {
            MK r = uk.r(MK.a.LEFT);
            if (r == null) {
                k = null;
            } else {
                k = r.k();
            }
            if (k == null) {
                i = null;
            } else {
                i = k.i();
            }
            if (i == U()) {
                return uk;
            }
            if (i == null) {
                k2 = null;
            } else {
                k2 = i.r(MK.a.RIGHT).k();
            }
            if (k2 != null && k2.i() != uk) {
                uk2 = uk;
            } else {
                uk = i;
            }
        }
        return uk2;
    }

    public boolean F0() {
        if (this.i && this.u0 != 8) {
            return true;
        }
        return false;
    }

    public void F1(int i, int i2, int i3, float f) {
        this.w = i;
        this.z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.A = i3;
        this.B = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.w = 2;
        }
    }

    public int G() {
        return this.J0;
    }

    public boolean G0() {
        if (!this.p) {
            if (!this.Q.o() || !this.S.o()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void G1(float f) {
        this.N0[0] = f;
    }

    public b H() {
        return this.b0[0];
    }

    public boolean H0() {
        if (!this.q) {
            if (!this.R.o() || !this.T.o()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void H1(int i, boolean z) {
        this.a0[i] = z;
    }

    public int I() {
        int i;
        MK mk = this.Q;
        if (mk != null) {
            i = mk.g;
        } else {
            i = 0;
        }
        MK mk2 = this.S;
        if (mk2 != null) {
            return i + mk2.g;
        }
        return i;
    }

    public boolean I0() {
        if (this.c0 == null) {
            return true;
        }
        return false;
    }

    public void I1(boolean z) {
        this.M = z;
    }

    public int J() {
        return this.O;
    }

    public boolean J0() {
        if (this.x == 0 && this.f0 == 0.0f && this.C == 0 && this.D == 0 && this.b0[1] == b.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public void J1(boolean z) {
        this.N = z;
    }

    public int K() {
        return this.P;
    }

    public boolean K0() {
        if (this.w != 0 || this.f0 != 0.0f || this.z != 0 || this.A != 0 || this.b0[0] != b.MATCH_CONSTRAINT) {
            return false;
        }
        return true;
    }

    public void K1(int i, int i2) {
        this.O = i;
        this.P = i2;
        O1(false);
    }

    public int L() {
        return o0();
    }

    public boolean L0() {
        return this.s;
    }

    public void L1(int i, int i2) {
        if (i2 == 0) {
            d2(i);
        } else if (i2 == 1) {
            z1(i);
        }
    }

    public int M(int i) {
        if (i == 0) {
            return m0();
        }
        if (i == 1) {
            return D();
        }
        return 0;
    }

    public boolean M0() {
        return this.F;
    }

    public void M1(int i) {
        this.J[1] = i;
    }

    public int N() {
        return this.J[1];
    }

    public void N0() {
        this.r = true;
    }

    public void N1(int i) {
        this.J[0] = i;
    }

    public int O() {
        return this.J[0];
    }

    public void O0() {
        this.s = true;
    }

    public void O1(boolean z) {
        this.i = z;
    }

    public int P() {
        return this.p0;
    }

    public boolean P0(int i) {
        char c;
        if (i == 0) {
            c = 1;
        } else {
            c = 0;
        }
        b[] bVarArr = this.b0;
        b bVar = bVarArr[i];
        b bVar2 = bVarArr[c];
        b bVar3 = b.MATCH_CONSTRAINT;
        if (bVar != bVar3 || bVar2 != bVar3) {
            return false;
        }
        return true;
    }

    public void P1(int i) {
        if (i < 0) {
            this.p0 = 0;
        } else {
            this.p0 = i;
        }
    }

    public int Q() {
        return this.o0;
    }

    public boolean Q0() {
        b[] bVarArr = this.b0;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        if (bVar != bVar2 || bVarArr[1] != bVar2) {
            return false;
        }
        return true;
    }

    public void Q1(int i) {
        if (i < 0) {
            this.o0 = 0;
        } else {
            this.o0 = i;
        }
    }

    public UK R(int i) {
        MK mk;
        MK mk2;
        if (i == 0) {
            MK mk3 = this.S;
            MK mk4 = mk3.f;
            if (mk4 != null && mk4.f == mk3) {
                return mk4.d;
            }
            return null;
        } else if (i == 1 && (mk2 = (mk = this.T).f) != null && mk2.f == mk) {
            return mk2.d;
        } else {
            return null;
        }
    }

    public void R0() {
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.c0 = null;
        this.K = Float.NaN;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = 0;
        float f = A1;
        this.q0 = f;
        this.r0 = f;
        b[] bVarArr = this.b0;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.s0 = null;
        this.t0 = 0;
        this.u0 = 0;
        this.x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.t = -1;
        this.u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.w = 0;
        this.x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.z = 0;
        this.C = 0;
        this.h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.i = true;
        int[] iArr2 = this.y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public void R1(int i, int i2) {
        this.l0 = i;
        this.m0 = i2;
    }

    public int S() {
        int i = this.e0;
        if (this.b0[1] == b.MATCH_CONSTRAINT) {
            if (this.x == 1) {
                i = Math.max(this.C, i);
            } else {
                i = this.C;
                if (i > 0) {
                    this.e0 = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.D;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public void S0() {
        U0();
        W1(A1);
        B1(A1);
    }

    public void S1(int i, int i2) {
        this.h0 = i;
        this.i0 = i2;
    }

    public int T() {
        int i = this.d0;
        int i2 = 0;
        if (this.b0[0] == b.MATCH_CONSTRAINT) {
            if (this.w == 1) {
                i2 = Math.max(this.z, i);
            } else {
                int i3 = this.z;
                if (i3 > 0) {
                    this.d0 = i3;
                    i2 = i3;
                }
            }
            int i4 = this.A;
            if (i4 > 0 && i4 < i2) {
                return i4;
            }
            return i2;
        }
        return i;
    }

    public void T0(MK mk) {
        if (U() != null && (U() instanceof VK) && ((VK) U()).L2()) {
            return;
        }
        MK r = r(MK.a.LEFT);
        MK r2 = r(MK.a.RIGHT);
        MK r3 = r(MK.a.TOP);
        MK r4 = r(MK.a.BOTTOM);
        MK r5 = r(MK.a.CENTER);
        MK r6 = r(MK.a.CENTER_X);
        MK r7 = r(MK.a.CENTER_Y);
        if (mk == r5) {
            if (r.p() && r2.p() && r.k() == r2.k()) {
                r.x();
                r2.x();
            }
            if (r3.p() && r4.p() && r3.k() == r4.k()) {
                r3.x();
                r4.x();
            }
            this.q0 = 0.5f;
            this.r0 = 0.5f;
        } else if (mk == r6) {
            if (r.p() && r2.p() && r.k().i() == r2.k().i()) {
                r.x();
                r2.x();
            }
            this.q0 = 0.5f;
        } else if (mk == r7) {
            if (r3.p() && r4.p() && r3.k().i() == r4.k().i()) {
                r3.x();
                r4.x();
            }
            this.r0 = 0.5f;
        } else if (mk != r && mk != r2) {
            if ((mk == r3 || mk == r4) && r3.p() && r3.k() == r4.k()) {
                r5.x();
            }
        } else if (r.p() && r.k() == r2.k()) {
            r5.x();
        }
        mk.x();
    }

    public void T1(UK uk) {
        this.c0 = uk;
    }

    public UK U() {
        return this.c0;
    }

    public void U0() {
        UK U = U();
        if (U == null || !(U instanceof VK) || !((VK) U()).L2()) {
            int size = this.Z.size();
            for (int i = 0; i < size; i++) {
                this.Z.get(i).x();
            }
        }
    }

    public void U1(int i, int i2) {
        if (i2 == 0) {
            this.j0 = i;
        } else if (i2 == 1) {
            this.k0 = i;
        }
    }

    public UK V(int i) {
        MK mk;
        MK mk2;
        if (i == 0) {
            MK mk3 = this.Q;
            MK mk4 = mk3.f;
            if (mk4 != null && mk4.f == mk3) {
                return mk4.d;
            }
            return null;
        } else if (i == 1 && (mk2 = (mk = this.R).f) != null && mk2.f == mk) {
            return mk2.d;
        } else {
            return null;
        }
    }

    public void V0() {
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            this.Z.get(i).y();
        }
    }

    public void V1(String str) {
        this.x0 = str;
    }

    public int W(int i) {
        if (i == 0) {
            return this.j0;
        }
        if (i == 1) {
            return this.k0;
        }
        return 0;
    }

    public void W0(C5191at c5191at) {
        this.Q.z(c5191at);
        this.R.z(c5191at);
        this.S.z(c5191at);
        this.T.z(c5191at);
        this.U.z(c5191at);
        this.X.z(c5191at);
        this.V.z(c5191at);
        this.W.z(c5191at);
    }

    public void W1(float f) {
        this.r0 = f;
    }

    public int X() {
        return o0() + this.d0;
    }

    public void X0() {
        this.r = false;
        this.s = false;
    }

    public void X1(int i) {
        this.K0 = i;
    }

    public int Y() {
        return this.h0 + this.l0;
    }

    public StringBuilder Y0(StringBuilder sb) {
        sb.append("{\n");
        Z0(sb, "left", this.Q);
        Z0(sb, C9698tH2.l, this.R);
        Z0(sb, C5445bv2.n0, this.S);
        Z0(sb, "bottom", this.T);
        Z0(sb, "baseline", this.U);
        Z0(sb, "centerX", this.V);
        Z0(sb, "centerY", this.W);
        d1(sb, this.X, this.K);
        f1(sb, "width", this.d0, this.o0, this.J[0], this.l, this.z, this.w, this.B, this.N0[0]);
        f1(sb, "height", this.e0, this.p0, this.J[1], this.m, this.C, this.x, this.E, this.N0[1]);
        e1(sb, "dimensionRatio", this.f0, this.g0);
        a1(sb, "horizontalBias", this.q0, A1);
        a1(sb, "verticalBias", this.r0, A1);
        sb.append("}\n");
        return sb;
    }

    public void Y1(int i, int i2) {
        this.i0 = i;
        int i3 = i2 - i;
        this.e0 = i3;
        int i4 = this.p0;
        if (i3 < i4) {
            this.e0 = i4;
        }
    }

    public int Z() {
        return this.i0 + this.m0;
    }

    public final void Z0(StringBuilder sb, String str, MK mk) {
        if (mk.f == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(mk.f);
        sb.append("',");
        sb.append(mk.g);
        sb.append(",");
        sb.append(mk.h);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    public void Z1(b bVar) {
        this.b0[1] = bVar;
    }

    public WK2 a0(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public final void a1(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public void a2(int i, int i2, int i3, float f) {
        this.x = i;
        this.C = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.D = i3;
        this.E = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.x = 2;
        }
    }

    public void b0(StringBuilder sb) {
        sb.append(TD0.a.Y0 + this.f625o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.d0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.e0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.h0);
        sb.append("\n");
        sb.append("    actualTop:" + this.i0);
        sb.append("\n");
        d0(sb, "left", this.Q);
        d0(sb, C9698tH2.l, this.R);
        d0(sb, C5445bv2.n0, this.S);
        d0(sb, "bottom", this.T);
        d0(sb, "baseline", this.U);
        d0(sb, "centerX", this.V);
        d0(sb, "centerY", this.W);
        c0(sb, "    width", this.d0, this.o0, this.J[0], this.l, this.z, this.w, this.B, this.b0[0], this.N0[0]);
        c0(sb, "    height", this.e0, this.p0, this.J[1], this.m, this.C, this.x, this.E, this.b0[1], this.N0[1]);
        e1(sb, "    dimensionRatio", this.f0, this.g0);
        a1(sb, "    horizontalBias", this.q0, A1);
        a1(sb, "    verticalBias", this.r0, A1);
        b1(sb, "    horizontalChainStyle", this.J0, 0);
        b1(sb, "    verticalChainStyle", this.K0, 0);
        sb.append("  }");
    }

    public final void b1(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public void b2(float f) {
        this.N0[1] = f;
    }

    public final void c0(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, b bVar, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        c1(sb, "      behavior", bVar.toString(), b.FIXED.toString());
        b1(sb, "      size", i, 0);
        b1(sb, "      min", i2, 0);
        b1(sb, "      max", i3, Integer.MAX_VALUE);
        b1(sb, "      matchMin", i5, 0);
        b1(sb, "      matchDef", i6, 0);
        a1(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public final void c1(StringBuilder sb, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(str2);
        sb.append(",\n");
    }

    public void c2(int i) {
        this.u0 = i;
    }

    public final void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    public final void d0(StringBuilder sb, String str, MK mk) {
        if (mk.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(mk.f);
        sb.append("'");
        if (mk.h != Integer.MIN_VALUE || mk.g != 0) {
            sb.append(",");
            sb.append(mk.g);
            if (mk.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(mk.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final void d1(StringBuilder sb, MK mk, float f) {
        if (mk.f != null && !Float.isNaN(f)) {
            sb.append("circle : [ '");
            sb.append(mk.f);
            sb.append("',");
            sb.append(mk.g);
            sb.append(",");
            sb.append(f);
            sb.append(",");
            sb.append(" ] ,\n");
        }
    }

    public void d2(int i) {
        this.d0 = i;
        int i2 = this.o0;
        if (i < i2) {
            this.d0 = i2;
        }
    }

    public void e(VK vk, C9872u01 c9872u01, HashSet<UK> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                C4077Qv1.a(vk, c9872u01, this);
                hashSet.remove(this);
                g(c9872u01, vk.T2(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<MK> e = this.Q.e();
            if (e != null) {
                Iterator<MK> it = e.iterator();
                while (it.hasNext()) {
                    it.next().d.e(vk, c9872u01, hashSet, i, true);
                }
            }
            HashSet<MK> e2 = this.S.e();
            if (e2 != null) {
                Iterator<MK> it2 = e2.iterator();
                while (it2.hasNext()) {
                    it2.next().d.e(vk, c9872u01, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<MK> e3 = this.R.e();
        if (e3 != null) {
            Iterator<MK> it3 = e3.iterator();
            while (it3.hasNext()) {
                it3.next().d.e(vk, c9872u01, hashSet, i, true);
            }
        }
        HashSet<MK> e4 = this.T.e();
        if (e4 != null) {
            Iterator<MK> it4 = e4.iterator();
            while (it4.hasNext()) {
                it4.next().d.e(vk, c9872u01, hashSet, i, true);
            }
        }
        HashSet<MK> e5 = this.U.e();
        if (e5 != null) {
            Iterator<MK> it5 = e5.iterator();
            while (it5.hasNext()) {
                it5.next().d.e(vk, c9872u01, hashSet, i, true);
            }
        }
    }

    public int e0() {
        return p0();
    }

    public final void e1(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    public void e2(boolean z) {
        this.F = z;
    }

    public boolean f() {
        if (!(this instanceof UI2) && !(this instanceof C9445sF0)) {
            return false;
        }
        return true;
    }

    public String f0() {
        return this.x0;
    }

    public final void f1(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        b1(sb, "size", i, Integer.MIN_VALUE);
        b1(sb, "min", i2, 0);
        b1(sb, "max", i3, Integer.MAX_VALUE);
        b1(sb, "matchMin", i5, 0);
        b1(sb, "matchDef", i6, 0);
        b1(sb, "matchPercent", i6, 1);
        a1(sb, "matchConstraintPercent", f, 1.0f);
        a1(sb, "weight", f2, 1.0f);
        b1(sb, "override", i4, 1);
        sb.append("},\n");
    }

    public void f2(int i) {
        if (i >= 0 && i <= 3) {
            this.v = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r13 != 3) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(C9872u01 c9872u01, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        UK uk;
        UK uk2;
        C3641Mj1 c3641Mj1;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        b bVar;
        b bVar2;
        boolean z7;
        b bVar3;
        boolean z8;
        float f;
        int i5;
        Q92 q92;
        Q92 q922;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        b bVar4;
        b bVar5;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Q92 q923;
        boolean z16;
        Q92 q924;
        b bVar6;
        boolean z17;
        b bVar7;
        Q92 q925;
        Q92 q926;
        int i11;
        boolean z18;
        boolean z19;
        boolean z20;
        Q92 q927;
        Q92 q928;
        Q92 q929;
        int i12;
        ?? r13;
        int i13;
        int i14;
        int i15;
        UK uk3;
        Q92 q9210;
        Q92 q9211;
        C9872u01 c9872u012;
        C3641Mj1 c3641Mj12;
        boolean z21;
        int i16;
        Q92 q9212;
        boolean z22;
        C6010eF2 c6010eF2;
        C8901q20 c8901q20;
        UK uk4;
        boolean z23;
        boolean z24;
        UK uk5;
        Q92 q9213;
        UK uk6;
        Q92 q9214;
        b[] bVarArr;
        boolean z25;
        C7731lI0 c7731lI0;
        C8901q20 c8901q202;
        int i17;
        int i18;
        int i19;
        int i20;
        C7731lI0 c7731lI02;
        C6010eF2 c6010eF22;
        C8901q20 c8901q203;
        boolean[] zArr;
        C9872u01 c9872u013 = c9872u01;
        Q92 s = c9872u013.s(this.Q);
        Q92 s2 = c9872u013.s(this.S);
        Q92 s3 = c9872u013.s(this.R);
        Q92 s4 = c9872u013.s(this.T);
        Q92 s5 = c9872u013.s(this.U);
        UK uk7 = this.c0;
        if (uk7 != null) {
            if (uk7 != null && uk7.b0[0] == b.WRAP_CONTENT) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (uk7 != null && uk7.b0[1] == b.WRAP_CONTENT) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i21 = this.v;
            if (i21 != 1) {
                if (i21 == 2) {
                    z3 = false;
                }
            } else {
                z2 = false;
            }
            if (this.u0 == 8 && !this.v0 && !s0()) {
                zArr = this.a0;
                if (!zArr[0] && !zArr[1]) {
                    return;
                }
            }
            z4 = this.p;
            if (!z4 || this.q) {
                if (z4) {
                    c9872u013.f(s, this.h0);
                    c9872u013.f(s2, this.h0 + this.d0);
                    if (z3 && (uk2 = this.c0) != null) {
                        if (this.k) {
                            VK vk = (VK) uk2;
                            vk.v2(this.Q);
                            vk.u2(this.S);
                        } else {
                            c9872u013.h(c9872u013.s(uk2.S), s2, 0, 5);
                        }
                    }
                }
                if (this.q) {
                    c9872u013.f(s3, this.i0);
                    c9872u013.f(s4, this.i0 + this.e0);
                    if (this.U.n()) {
                        c9872u013.f(s5, this.i0 + this.n0);
                    }
                    if (z2 && (uk = this.c0) != null) {
                        if (this.k) {
                            VK vk2 = (VK) uk;
                            vk2.A2(this.R);
                            vk2.z2(this.T);
                        } else {
                            c9872u013.h(c9872u013.s(uk.T), s4, 0, 5);
                        }
                    }
                }
                if (this.p && this.q) {
                    this.p = false;
                    this.q = false;
                    return;
                }
            }
            c3641Mj1 = C9872u01.C;
            if (c3641Mj1 != null) {
                c3641Mj1.F++;
            }
            if (z && (c7731lI02 = this.e) != null && (c6010eF22 = this.f) != null) {
                c8901q203 = c7731lI02.h;
                if (c8901q203.j && c7731lI02.i.j && c6010eF22.h.j && c6010eF22.i.j) {
                    if (c3641Mj1 != null) {
                        c3641Mj1.w++;
                    }
                    c9872u013.f(s, c8901q203.g);
                    c9872u013.f(s2, this.e.i.g);
                    c9872u013.f(s3, this.f.h.g);
                    c9872u013.f(s4, this.f.i.g);
                    c9872u013.f(s5, this.f.k.g);
                    if (this.c0 != null) {
                        if (z3 && this.g[0] && !B0()) {
                            c9872u013.h(c9872u013.s(this.c0.S), s2, 0, 8);
                        }
                        if (z2 && this.g[1] && !D0()) {
                            c9872u013.h(c9872u013.s(this.c0.T), s4, 0, 8);
                        }
                    }
                    this.p = false;
                    this.q = false;
                    return;
                }
            }
            if (c3641Mj1 != null) {
                c3641Mj1.x++;
            }
            if (this.c0 == null) {
                if (x0(0)) {
                    ((VK) this.c0).r2(this, 0);
                    z5 = true;
                    i20 = 1;
                } else {
                    z5 = B0();
                    i20 = 1;
                }
                if (x0(i20)) {
                    ((VK) this.c0).r2(this, i20);
                    z6 = true;
                } else {
                    z6 = D0();
                }
                if (!z5 && z3 && this.u0 != 8 && this.Q.f == null && this.S.f == null) {
                    c9872u013.h(c9872u013.s(this.c0.S), s2, 0, 1);
                }
                if (!z6 && z2 && this.u0 != 8 && this.R.f == null && this.T.f == null && this.U == null) {
                    c9872u013.h(c9872u013.s(this.c0.T), s4, 0, 1);
                }
            } else {
                z5 = false;
                z6 = false;
            }
            i = this.d0;
            i2 = this.o0;
            if (i >= i2) {
                i2 = i;
            }
            i3 = this.e0;
            i4 = this.p0;
            if (i3 >= i4) {
                i4 = i3;
            }
            b[] bVarArr2 = this.b0;
            bVar = bVarArr2[0];
            bVar2 = b.MATCH_CONSTRAINT;
            if (bVar == bVar2) {
                z7 = true;
            } else {
                z7 = false;
            }
            bVar3 = bVarArr2[1];
            boolean z26 = z5;
            if (bVar3 == bVar2) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z27 = z6;
            int i22 = this.g0;
            this.H = i22;
            int i23 = i4;
            f = this.f0;
            this.I = f;
            int i24 = this.w;
            int i25 = this.x;
            if (f <= 0.0f) {
                i5 = i2;
                if (this.u0 != 8) {
                    if (bVar == bVar2 && i24 == 0) {
                        i7 = 3;
                    } else {
                        i7 = i24;
                    }
                    if (bVar3 == bVar2 && i25 == 0) {
                        i18 = 3;
                    } else {
                        i18 = i25;
                    }
                    if (bVar == bVar2 && bVar3 == bVar2) {
                        q92 = s2;
                        i19 = 3;
                        if (i7 == 3 && i18 == 3) {
                            i2(z3, z2, z7, z8);
                            q922 = s4;
                            i6 = i23;
                            z9 = true;
                            i8 = i18;
                            i9 = i5;
                            int[] iArr = this.y;
                            iArr[0] = i7;
                            iArr[1] = i8;
                            this.h = z9;
                            if (!z9) {
                                int i26 = this.H;
                                i10 = -1;
                                if (i26 == 0 || i26 == -1) {
                                    z10 = true;
                                    if (!z9 && ((i17 = this.H) == 1 || i17 == i10)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    bVar4 = this.b0[0];
                                    bVar5 = b.WRAP_CONTENT;
                                    if (bVar4 != bVar5 && (this instanceof VK)) {
                                        z12 = z10;
                                        z13 = true;
                                    } else {
                                        z12 = z10;
                                        z13 = false;
                                    }
                                    if (z13) {
                                        i9 = 0;
                                    }
                                    z14 = !this.X.p();
                                    boolean[] zArr2 = this.a0;
                                    z15 = zArr2[0];
                                    boolean z28 = zArr2[1];
                                    Q92 q9215 = null;
                                    if (this.t != 2 && !this.p) {
                                        if (z && (c7731lI0 = this.e) != null) {
                                            c8901q202 = c7731lI0.h;
                                            if (c8901q202.j && c7731lI0.i.j) {
                                                if (z) {
                                                    c9872u013.f(s, c8901q202.g);
                                                    Q92 q9216 = q92;
                                                    c9872u013.f(q9216, this.e.i.g);
                                                    if (this.c0 != null && z3 && this.g[0] && !B0()) {
                                                        c9872u013.h(c9872u013.s(this.c0.S), q9216, 0, 8);
                                                    }
                                                    q923 = s;
                                                    z16 = z9;
                                                    q924 = q922;
                                                    bVar6 = bVar2;
                                                    z17 = z2;
                                                    bVar7 = bVar5;
                                                    q92 = q9216;
                                                    z20 = z3;
                                                    q926 = s3;
                                                    q925 = s5;
                                                    z19 = z26;
                                                    z18 = z27;
                                                    i11 = i7;
                                                    if (z && (c6010eF2 = this.f) != null) {
                                                        c8901q20 = c6010eF2.h;
                                                        if (c8901q20.j && c6010eF2.i.j) {
                                                            int i27 = c8901q20.g;
                                                            q927 = q926;
                                                            c9872u013.f(q927, i27);
                                                            q928 = q924;
                                                            c9872u013.f(q928, this.f.i.g);
                                                            q929 = q925;
                                                            c9872u013.f(q929, this.f.k.g);
                                                            uk4 = this.c0;
                                                            if (uk4 == null && !z18 && z17) {
                                                                z23 = true;
                                                                z24 = true;
                                                                if (this.g[1]) {
                                                                    i12 = 0;
                                                                    i13 = 8;
                                                                    c9872u013.h(c9872u013.s(uk4.T), q928, 0, 8);
                                                                    i14 = i12;
                                                                    r13 = z24;
                                                                    if (this.u == 2) {
                                                                        i15 = i12;
                                                                    } else {
                                                                        i15 = i14;
                                                                    }
                                                                    if (i15 == 0 && !this.q) {
                                                                        if (this.b0[r13] == bVar7 && (this instanceof VK)) {
                                                                            z21 = r13;
                                                                        } else {
                                                                            z21 = i12;
                                                                        }
                                                                        if (z21) {
                                                                            i16 = i12;
                                                                        } else {
                                                                            i16 = i6;
                                                                        }
                                                                        UK uk8 = this.c0;
                                                                        if (uk8 != null) {
                                                                            q9212 = c9872u013.s(uk8.T);
                                                                        } else {
                                                                            q9212 = null;
                                                                        }
                                                                        UK uk9 = this.c0;
                                                                        if (uk9 != null) {
                                                                            q9215 = c9872u013.s(uk9.R);
                                                                        }
                                                                        if (this.n0 > 0 || this.u0 == i13) {
                                                                            MK mk = this.U;
                                                                            if (mk.f != null) {
                                                                                c9872u013.e(q929, q927, t(), i13);
                                                                                c9872u013.e(q929, c9872u013.s(this.U.f), this.U.g(), i13);
                                                                                if (z17) {
                                                                                    c9872u013.h(q9212, c9872u013.s(this.T), i12, 5);
                                                                                }
                                                                                z14 = i12;
                                                                            } else if (this.u0 == i13) {
                                                                                c9872u013.e(q929, q927, mk.g(), i13);
                                                                            } else {
                                                                                c9872u013.e(q929, q927, t(), i13);
                                                                            }
                                                                        }
                                                                        boolean z29 = this.g[r13];
                                                                        b[] bVarArr3 = this.b0;
                                                                        int i28 = i12;
                                                                        b bVar8 = bVarArr3[r13];
                                                                        MK mk2 = this.R;
                                                                        boolean z30 = r13;
                                                                        int i29 = i16;
                                                                        MK mk3 = this.T;
                                                                        int i30 = this.i0;
                                                                        int i31 = this.p0;
                                                                        int i32 = this.J[z30 ? 1 : 0];
                                                                        float f2 = this.r0;
                                                                        if (bVarArr3[i28] == bVar6) {
                                                                            z22 = z30 ? 1 : 0;
                                                                        } else {
                                                                            z22 = i28;
                                                                        }
                                                                        q9210 = q927;
                                                                        q9211 = q928;
                                                                        i(c9872u01, false, z17, z20, z29, q9215, q9212, bVar8, z21, mk2, mk3, i30, i29, i31, i32, f2, z11, z22, z18, z19, z28, i8, i11, this.C, this.D, this.E, z14);
                                                                        uk3 = this;
                                                                    } else {
                                                                        uk3 = this;
                                                                        q9210 = q927;
                                                                        q9211 = q928;
                                                                    }
                                                                    if (z16) {
                                                                        if (uk3.H == 1) {
                                                                            c9872u01.k(q9211, q9210, q92, q923, uk3.I, 8);
                                                                        } else {
                                                                            c9872u01.k(q92, q923, q9211, q9210, uk3.I, 8);
                                                                            c9872u012 = c9872u01;
                                                                            if (uk3.X.p()) {
                                                                                c9872u012.b(uk3, uk3.X.k().i(), (float) Math.toRadians(uk3.K + 90.0f), uk3.X.g());
                                                                            }
                                                                            uk3.p = false;
                                                                            uk3.q = false;
                                                                            c3641Mj12 = C9872u01.C;
                                                                            if (c3641Mj12 == null) {
                                                                                c3641Mj12.S = c9872u012.K();
                                                                                C9872u01.C.T = c9872u012.L();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                    }
                                                                    c9872u012 = c9872u01;
                                                                    if (uk3.X.p()) {
                                                                    }
                                                                    uk3.p = false;
                                                                    uk3.q = false;
                                                                    c3641Mj12 = C9872u01.C;
                                                                    if (c3641Mj12 == null) {
                                                                    }
                                                                } else {
                                                                    i12 = 0;
                                                                }
                                                            } else {
                                                                i12 = 0;
                                                                z23 = true;
                                                            }
                                                            i13 = 8;
                                                            z24 = z23;
                                                            i14 = i12;
                                                            r13 = z24;
                                                            if (this.u == 2) {
                                                            }
                                                            if (i15 == 0) {
                                                            }
                                                            uk3 = this;
                                                            q9210 = q927;
                                                            q9211 = q928;
                                                            if (z16) {
                                                            }
                                                            c9872u012 = c9872u01;
                                                            if (uk3.X.p()) {
                                                            }
                                                            uk3.p = false;
                                                            uk3.q = false;
                                                            c3641Mj12 = C9872u01.C;
                                                            if (c3641Mj12 == null) {
                                                            }
                                                        }
                                                    }
                                                    q927 = q926;
                                                    q928 = q924;
                                                    q929 = q925;
                                                    i12 = 0;
                                                    r13 = 1;
                                                    i13 = 8;
                                                    i14 = 1;
                                                    if (this.u == 2) {
                                                    }
                                                    if (i15 == 0) {
                                                    }
                                                    uk3 = this;
                                                    q9210 = q927;
                                                    q9211 = q928;
                                                    if (z16) {
                                                    }
                                                    c9872u012 = c9872u01;
                                                    if (uk3.X.p()) {
                                                    }
                                                    uk3.p = false;
                                                    uk3.q = false;
                                                    c3641Mj12 = C9872u01.C;
                                                    if (c3641Mj12 == null) {
                                                    }
                                                }
                                            }
                                        }
                                        Q92 q9217 = q92;
                                        uk5 = this.c0;
                                        if (uk5 == null) {
                                            q9213 = c9872u013.s(uk5.S);
                                        } else {
                                            q9213 = null;
                                        }
                                        uk6 = this.c0;
                                        if (uk6 == null) {
                                            q9214 = c9872u013.s(uk6.Q);
                                        } else {
                                            q9214 = null;
                                        }
                                        boolean z31 = this.g[0];
                                        bVarArr = this.b0;
                                        b bVar9 = bVarArr[0];
                                        MK mk4 = this.Q;
                                        i11 = i7;
                                        MK mk5 = this.S;
                                        z16 = z9;
                                        z20 = z3;
                                        int i33 = this.h0;
                                        boolean z32 = z12;
                                        Q92 q9218 = q9214;
                                        int i34 = this.o0;
                                        int i35 = this.J[0];
                                        float f3 = this.q0;
                                        if (bVarArr[1] != bVar2) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        q923 = s;
                                        q924 = q922;
                                        bVar6 = bVar2;
                                        z17 = z2;
                                        q925 = s5;
                                        z19 = z26;
                                        z18 = z27;
                                        bVar7 = bVar5;
                                        q92 = q9217;
                                        q926 = s3;
                                        c9872u013 = c9872u01;
                                        i(c9872u013, true, z20, z17, z31, q9218, q9213, bVar9, z13, mk4, mk5, i33, i9, i34, i35, f3, z32, z25, z19, z18, z15, i11, i8, this.z, this.A, this.B, z14);
                                        if (z) {
                                            c8901q20 = c6010eF2.h;
                                            if (c8901q20.j) {
                                                int i272 = c8901q20.g;
                                                q927 = q926;
                                                c9872u013.f(q927, i272);
                                                q928 = q924;
                                                c9872u013.f(q928, this.f.i.g);
                                                q929 = q925;
                                                c9872u013.f(q929, this.f.k.g);
                                                uk4 = this.c0;
                                                if (uk4 == null) {
                                                }
                                                i12 = 0;
                                                z23 = true;
                                                i13 = 8;
                                                z24 = z23;
                                                i14 = i12;
                                                r13 = z24;
                                                if (this.u == 2) {
                                                }
                                                if (i15 == 0) {
                                                }
                                                uk3 = this;
                                                q9210 = q927;
                                                q9211 = q928;
                                                if (z16) {
                                                }
                                                c9872u012 = c9872u01;
                                                if (uk3.X.p()) {
                                                }
                                                uk3.p = false;
                                                uk3.q = false;
                                                c3641Mj12 = C9872u01.C;
                                                if (c3641Mj12 == null) {
                                                }
                                            }
                                        }
                                        q927 = q926;
                                        q928 = q924;
                                        q929 = q925;
                                        i12 = 0;
                                        r13 = 1;
                                        i13 = 8;
                                        i14 = 1;
                                        if (this.u == 2) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        uk3 = this;
                                        q9210 = q927;
                                        q9211 = q928;
                                        if (z16) {
                                        }
                                        c9872u012 = c9872u01;
                                        if (uk3.X.p()) {
                                        }
                                        uk3.p = false;
                                        uk3.q = false;
                                        c3641Mj12 = C9872u01.C;
                                        if (c3641Mj12 == null) {
                                        }
                                    }
                                    q923 = s;
                                    z16 = z9;
                                    q924 = q922;
                                    bVar6 = bVar2;
                                    z17 = z2;
                                    bVar7 = bVar5;
                                    z20 = z3;
                                    q926 = s3;
                                    q925 = s5;
                                    z19 = z26;
                                    z18 = z27;
                                    i11 = i7;
                                    if (z) {
                                    }
                                    q927 = q926;
                                    q928 = q924;
                                    q929 = q925;
                                    i12 = 0;
                                    r13 = 1;
                                    i13 = 8;
                                    i14 = 1;
                                    if (this.u == 2) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    uk3 = this;
                                    q9210 = q927;
                                    q9211 = q928;
                                    if (z16) {
                                    }
                                    c9872u012 = c9872u01;
                                    if (uk3.X.p()) {
                                    }
                                    uk3.p = false;
                                    uk3.q = false;
                                    c3641Mj12 = C9872u01.C;
                                    if (c3641Mj12 == null) {
                                    }
                                }
                            } else {
                                i10 = -1;
                            }
                            z10 = false;
                            if (!z9) {
                            }
                            z11 = false;
                            bVar4 = this.b0[0];
                            bVar5 = b.WRAP_CONTENT;
                            if (bVar4 != bVar5) {
                            }
                            z12 = z10;
                            z13 = false;
                            if (z13) {
                            }
                            z14 = !this.X.p();
                            boolean[] zArr22 = this.a0;
                            z15 = zArr22[0];
                            boolean z282 = zArr22[1];
                            Q92 q92152 = null;
                            if (this.t != 2) {
                                if (z) {
                                    c8901q202 = c7731lI0.h;
                                    if (c8901q202.j) {
                                        if (z) {
                                        }
                                    }
                                }
                                Q92 q92172 = q92;
                                uk5 = this.c0;
                                if (uk5 == null) {
                                }
                                uk6 = this.c0;
                                if (uk6 == null) {
                                }
                                boolean z312 = this.g[0];
                                bVarArr = this.b0;
                                b bVar92 = bVarArr[0];
                                MK mk42 = this.Q;
                                i11 = i7;
                                MK mk52 = this.S;
                                z16 = z9;
                                z20 = z3;
                                int i332 = this.h0;
                                boolean z322 = z12;
                                Q92 q92182 = q9214;
                                int i342 = this.o0;
                                int i352 = this.J[0];
                                float f32 = this.q0;
                                if (bVarArr[1] != bVar2) {
                                }
                                q923 = s;
                                q924 = q922;
                                bVar6 = bVar2;
                                z17 = z2;
                                q925 = s5;
                                z19 = z26;
                                z18 = z27;
                                bVar7 = bVar5;
                                q92 = q92172;
                                q926 = s3;
                                c9872u013 = c9872u01;
                                i(c9872u013, true, z20, z17, z312, q92182, q9213, bVar92, z13, mk42, mk52, i332, i9, i342, i352, f32, z322, z25, z19, z18, z15, i11, i8, this.z, this.A, this.B, z14);
                                if (z) {
                                }
                                q927 = q926;
                                q928 = q924;
                                q929 = q925;
                                i12 = 0;
                                r13 = 1;
                                i13 = 8;
                                i14 = 1;
                                if (this.u == 2) {
                                }
                                if (i15 == 0) {
                                }
                                uk3 = this;
                                q9210 = q927;
                                q9211 = q928;
                                if (z16) {
                                }
                                c9872u012 = c9872u01;
                                if (uk3.X.p()) {
                                }
                                uk3.p = false;
                                uk3.q = false;
                                c3641Mj12 = C9872u01.C;
                                if (c3641Mj12 == null) {
                                }
                            }
                            q923 = s;
                            z16 = z9;
                            q924 = q922;
                            bVar6 = bVar2;
                            z17 = z2;
                            bVar7 = bVar5;
                            z20 = z3;
                            q926 = s3;
                            q925 = s5;
                            z19 = z26;
                            z18 = z27;
                            i11 = i7;
                            if (z) {
                            }
                            q927 = q926;
                            q928 = q924;
                            q929 = q925;
                            i12 = 0;
                            r13 = 1;
                            i13 = 8;
                            i14 = 1;
                            if (this.u == 2) {
                            }
                            if (i15 == 0) {
                            }
                            uk3 = this;
                            q9210 = q927;
                            q9211 = q928;
                            if (z16) {
                            }
                            c9872u012 = c9872u01;
                            if (uk3.X.p()) {
                            }
                            uk3.p = false;
                            uk3.q = false;
                            c3641Mj12 = C9872u01.C;
                            if (c3641Mj12 == null) {
                            }
                        }
                    } else {
                        q92 = s2;
                        i19 = 3;
                    }
                    if (bVar == bVar2 && i7 == i19) {
                        this.H = 0;
                        int i36 = (int) (i3 * f);
                        if (bVar3 != bVar2) {
                            i7 = 4;
                            q922 = s4;
                            i6 = i23;
                            i8 = i18;
                            i9 = i36;
                            z9 = false;
                        } else {
                            q922 = s4;
                            i6 = i23;
                            i8 = i18;
                            i9 = i36;
                            z9 = true;
                        }
                    } else {
                        if (bVar3 == bVar2 && i18 == i19) {
                            this.H = 1;
                            if (i22 == -1) {
                                this.I = 1.0f / f;
                            }
                            i6 = (int) (this.I * i);
                            if (bVar != bVar2) {
                                q922 = s4;
                                i9 = i5;
                                z9 = false;
                                i8 = 4;
                            } else {
                                q922 = s4;
                                z9 = true;
                                i8 = i18;
                                i9 = i5;
                            }
                        }
                        q922 = s4;
                        i6 = i23;
                        z9 = true;
                        i8 = i18;
                        i9 = i5;
                    }
                    int[] iArr2 = this.y;
                    iArr2[0] = i7;
                    iArr2[1] = i8;
                    this.h = z9;
                    if (!z9) {
                    }
                    z10 = false;
                    if (!z9) {
                    }
                    z11 = false;
                    bVar4 = this.b0[0];
                    bVar5 = b.WRAP_CONTENT;
                    if (bVar4 != bVar5) {
                    }
                    z12 = z10;
                    z13 = false;
                    if (z13) {
                    }
                    z14 = !this.X.p();
                    boolean[] zArr222 = this.a0;
                    z15 = zArr222[0];
                    boolean z2822 = zArr222[1];
                    Q92 q921522 = null;
                    if (this.t != 2) {
                    }
                    q923 = s;
                    z16 = z9;
                    q924 = q922;
                    bVar6 = bVar2;
                    z17 = z2;
                    bVar7 = bVar5;
                    z20 = z3;
                    q926 = s3;
                    q925 = s5;
                    z19 = z26;
                    z18 = z27;
                    i11 = i7;
                    if (z) {
                    }
                    q927 = q926;
                    q928 = q924;
                    q929 = q925;
                    i12 = 0;
                    r13 = 1;
                    i13 = 8;
                    i14 = 1;
                    if (this.u == 2) {
                    }
                    if (i15 == 0) {
                    }
                    uk3 = this;
                    q9210 = q927;
                    q9211 = q928;
                    if (z16) {
                    }
                    c9872u012 = c9872u01;
                    if (uk3.X.p()) {
                    }
                    uk3.p = false;
                    uk3.q = false;
                    c3641Mj12 = C9872u01.C;
                    if (c3641Mj12 == null) {
                    }
                }
            } else {
                i5 = i2;
            }
            q92 = s2;
            q922 = s4;
            i6 = i23;
            i7 = i24;
            i8 = i25;
            i9 = i5;
            z9 = false;
            int[] iArr22 = this.y;
            iArr22[0] = i7;
            iArr22[1] = i8;
            this.h = z9;
            if (!z9) {
            }
            z10 = false;
            if (!z9) {
            }
            z11 = false;
            bVar4 = this.b0[0];
            bVar5 = b.WRAP_CONTENT;
            if (bVar4 != bVar5) {
            }
            z12 = z10;
            z13 = false;
            if (z13) {
            }
            z14 = !this.X.p();
            boolean[] zArr2222 = this.a0;
            z15 = zArr2222[0];
            boolean z28222 = zArr2222[1];
            Q92 q9215222 = null;
            if (this.t != 2) {
            }
            q923 = s;
            z16 = z9;
            q924 = q922;
            bVar6 = bVar2;
            z17 = z2;
            bVar7 = bVar5;
            z20 = z3;
            q926 = s3;
            q925 = s5;
            z19 = z26;
            z18 = z27;
            i11 = i7;
            if (z) {
            }
            q927 = q926;
            q928 = q924;
            q929 = q925;
            i12 = 0;
            r13 = 1;
            i13 = 8;
            i14 = 1;
            if (this.u == 2) {
            }
            if (i15 == 0) {
            }
            uk3 = this;
            q9210 = q927;
            q9211 = q928;
            if (z16) {
            }
            c9872u012 = c9872u01;
            if (uk3.X.p()) {
            }
            uk3.p = false;
            uk3.q = false;
            c3641Mj12 = C9872u01.C;
            if (c3641Mj12 == null) {
            }
        }
        z2 = false;
        z3 = false;
        if (this.u0 == 8) {
            zArr = this.a0;
            if (!zArr[0]) {
                return;
            }
        }
        z4 = this.p;
        if (!z4) {
        }
        if (z4) {
        }
        if (this.q) {
        }
        if (this.p) {
            this.p = false;
            this.q = false;
            return;
        }
        c3641Mj1 = C9872u01.C;
        if (c3641Mj1 != null) {
        }
        if (z) {
            c8901q203 = c7731lI02.h;
            if (c8901q203.j) {
                if (c3641Mj1 != null) {
                }
                c9872u013.f(s, c8901q203.g);
                c9872u013.f(s2, this.e.i.g);
                c9872u013.f(s3, this.f.h.g);
                c9872u013.f(s4, this.f.i.g);
                c9872u013.f(s5, this.f.k.g);
                if (this.c0 != null) {
                }
                this.p = false;
                this.q = false;
                return;
            }
        }
        if (c3641Mj1 != null) {
        }
        if (this.c0 == null) {
        }
        i = this.d0;
        i2 = this.o0;
        if (i >= i2) {
        }
        i3 = this.e0;
        i4 = this.p0;
        if (i3 >= i4) {
        }
        b[] bVarArr22 = this.b0;
        bVar = bVarArr22[0];
        bVar2 = b.MATCH_CONSTRAINT;
        if (bVar == bVar2) {
        }
        bVar3 = bVarArr22[1];
        boolean z262 = z5;
        if (bVar3 == bVar2) {
        }
        boolean z272 = z6;
        int i222 = this.g0;
        this.H = i222;
        int i232 = i4;
        f = this.f0;
        this.I = f;
        int i242 = this.w;
        int i252 = this.x;
        if (f <= 0.0f) {
        }
        q92 = s2;
        q922 = s4;
        i6 = i232;
        i7 = i242;
        i8 = i252;
        i9 = i5;
        z9 = false;
        int[] iArr222 = this.y;
        iArr222[0] = i7;
        iArr222[1] = i8;
        this.h = z9;
        if (!z9) {
        }
        z10 = false;
        if (!z9) {
        }
        z11 = false;
        bVar4 = this.b0[0];
        bVar5 = b.WRAP_CONTENT;
        if (bVar4 != bVar5) {
        }
        z12 = z10;
        z13 = false;
        if (z13) {
        }
        z14 = !this.X.p();
        boolean[] zArr22222 = this.a0;
        z15 = zArr22222[0];
        boolean z282222 = zArr22222[1];
        Q92 q92152222 = null;
        if (this.t != 2) {
        }
        q923 = s;
        z16 = z9;
        q924 = q922;
        bVar6 = bVar2;
        z17 = z2;
        bVar7 = bVar5;
        z20 = z3;
        q926 = s3;
        q925 = s5;
        z19 = z262;
        z18 = z272;
        i11 = i7;
        if (z) {
        }
        q927 = q926;
        q928 = q924;
        q929 = q925;
        i12 = 0;
        r13 = 1;
        i13 = 8;
        i14 = 1;
        if (this.u == 2) {
        }
        if (i15 == 0) {
        }
        uk3 = this;
        q9210 = q927;
        q9211 = q928;
        if (z16) {
        }
        c9872u012 = c9872u01;
        if (uk3.X.p()) {
        }
        uk3.p = false;
        uk3.q = false;
        c3641Mj12 = C9872u01.C;
        if (c3641Mj12 == null) {
        }
    }

    public float g0() {
        return this.r0;
    }

    public void g1(boolean z) {
        this.v0 = z;
    }

    public void g2(int i) {
        this.h0 = i;
    }

    public boolean h() {
        if (this.u0 != 8) {
            return true;
        }
        return false;
    }

    public UK h0() {
        MK k;
        UK i;
        MK k2;
        if (!D0()) {
            return null;
        }
        UK uk = this;
        UK uk2 = null;
        while (uk2 == null && uk != null) {
            MK r = uk.r(MK.a.TOP);
            if (r == null) {
                k = null;
            } else {
                k = r.k();
            }
            if (k == null) {
                i = null;
            } else {
                i = k.i();
            }
            if (i == U()) {
                return uk;
            }
            if (i == null) {
                k2 = null;
            } else {
                k2 = i.r(MK.a.BOTTOM).k();
            }
            if (k2 != null && k2.i() != uk) {
                uk2 = uk;
            } else {
                uk = i;
            }
        }
        return uk2;
    }

    public void h1(int i) {
        boolean z;
        this.n0 = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.L = z;
    }

    public void h2(int i) {
        this.i0 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:327:0x04d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:376:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(C9872u01 c9872u01, boolean z, boolean z2, boolean z3, boolean z4, Q92 q92, Q92 q922, b bVar, boolean z5, MK mk, MK mk2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i9;
        boolean z15;
        int i10;
        int i11;
        Q92 q923;
        int i12;
        Q92 q924;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        Q92 s;
        Q92 s2;
        boolean z18;
        MK mk3;
        Q92 q925;
        Q92 q926;
        Q92 q927;
        Q92 q928;
        int i15;
        int i16;
        int i17;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        Q92 q929;
        Q92 q9210;
        Q92 q9211;
        UK uk;
        UK uk2;
        UK uk3;
        boolean z23;
        int i18;
        int i19;
        boolean z24;
        int i20;
        int i21;
        UK uk4;
        int i22;
        boolean z25;
        int i23;
        int i24;
        boolean z26;
        int i25;
        boolean z27;
        UK uk5;
        int i26;
        UK uk6;
        C9872u01 c9872u012 = c9872u01;
        Q92 s3 = c9872u012.s(mk);
        Q92 s4 = c9872u012.s(mk2);
        Q92 s5 = c9872u012.s(mk.k());
        Q92 s6 = c9872u012.s(mk2.k());
        if (C9872u01.J() != null) {
            C9872u01.J().C++;
        }
        boolean p = mk.p();
        boolean p2 = mk2.p();
        boolean p3 = this.X.p();
        int i27 = p2 ? (p ? 1 : 0) + 1 : p ? 1 : 0;
        if (p3) {
            i27++;
        }
        int i28 = z6 ? 3 : i5;
        int ordinal = bVar.ordinal();
        boolean z28 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i28 == 4) ? false : true;
        int i29 = this.l;
        if (i29 == -1 || !z) {
            i29 = i2;
            z12 = z28;
        } else {
            this.l = -1;
            z12 = false;
        }
        int i30 = this.m;
        if (i30 == -1 || z) {
            z13 = z12;
        } else {
            this.m = -1;
            i29 = i30;
            z13 = false;
        }
        int i31 = i29;
        if (this.u0 == 8) {
            z14 = false;
            i9 = 0;
        } else {
            z14 = z13;
            i9 = i31;
        }
        if (z11) {
            if (!p && !p2 && !p3) {
                c9872u012.f(s3, i);
            } else if (p && !p2) {
                z15 = z14;
                i10 = 8;
                c9872u012.e(s3, s5, mk.g(), 8);
            }
            z15 = z14;
            i10 = 8;
        } else {
            z15 = z14;
            i10 = 8;
        }
        if (!z15) {
            if (z5) {
                c9872u012.e(s4, s3, 0, 3);
                if (i3 > 0) {
                    c9872u012.h(s4, s3, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    c9872u012.j(s4, s3, i4, 8);
                }
            } else {
                c9872u012.e(s4, s3, i9, i10);
            }
            i14 = i8;
            q923 = s4;
            i12 = i27;
            q924 = s6;
            z16 = z15;
            z17 = z4;
            i13 = i7;
        } else if (i27 == 2 || z6 || !(i28 == 1 || i28 == 0)) {
            int i32 = i7 == -2 ? i9 : i7;
            int i33 = i8 == -2 ? i9 : i8;
            if (i9 > 0 && i28 != 1) {
                i9 = 0;
            }
            if (i32 > 0) {
                c9872u012.h(s4, s3, i32, 8);
                i9 = Math.max(i9, i32);
            }
            if (i33 > 0) {
                if (!z2 || i28 != 1) {
                    c9872u012.j(s4, s3, i33, 8);
                }
                i9 = Math.min(i9, i33);
            }
            if (i28 == 1) {
                if (z2) {
                    c9872u012.e(s4, s3, i9, 8);
                } else if (z8) {
                    c9872u012.e(s4, s3, i9, 5);
                    c9872u012.j(s4, s3, i9, 8);
                } else {
                    c9872u012.e(s4, s3, i9, 5);
                    c9872u012.j(s4, s3, i9, 8);
                }
                q923 = s4;
                q924 = s6;
                z16 = z15;
                z17 = z4;
                i13 = i32;
                i14 = i33;
                i12 = i27;
            } else {
                if (i28 == 2) {
                    MK.a l = mk.l();
                    MK.a aVar = MK.a.TOP;
                    if (l != aVar && mk.l() != MK.a.BOTTOM) {
                        s = c9872u012.s(this.c0.r(MK.a.LEFT));
                        s2 = c9872u012.s(this.c0.r(MK.a.RIGHT));
                    } else {
                        s = c9872u012.s(this.c0.r(aVar));
                        s2 = c9872u012.s(this.c0.r(MK.a.BOTTOM));
                    }
                    Q92 q9212 = s2;
                    q923 = s4;
                    i11 = i33;
                    i12 = i27;
                    q924 = s6;
                    c9872u012.d(c9872u012.t().n(q923, s3, q9212, s, f2));
                    if (z2) {
                        z15 = false;
                    }
                    z17 = z4;
                    z16 = z15;
                } else {
                    i11 = i33;
                    q923 = s4;
                    i12 = i27;
                    q924 = s6;
                    z16 = z15;
                    z17 = true;
                }
                i13 = i32;
                i14 = i11;
            }
        } else {
            int max = Math.max(i7, i9);
            if (i8 > 0) {
                max = Math.min(i8, max);
            }
            c9872u012.e(s4, s3, max, 8);
            i13 = i7;
            i14 = i8;
            q923 = s4;
            i12 = i27;
            q924 = s6;
            z16 = false;
            z17 = z4;
        }
        if (!z11 || z8) {
            if (i12 < 2 && z2 && z17) {
                c9872u012.h(s3, q92, 0, 8);
                boolean z29 = z || this.U.f == null;
                if (z || (mk3 = this.U.f) == null) {
                    z18 = z29;
                } else {
                    UK uk7 = mk3.d;
                    if (uk7.f0 != 0.0f) {
                        b[] bVarArr = uk7.b0;
                        b bVar2 = bVarArr[0];
                        b bVar3 = b.MATCH_CONSTRAINT;
                        if (bVar2 == bVar3 && bVarArr[1] == bVar3) {
                            z18 = true;
                        }
                    }
                    z18 = false;
                }
                if (z18) {
                    c9872u012.h(q922, q923, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (p || p2 || p3) {
            if (p && !p2) {
                Q92 q9213 = q924;
                i26 = (z2 && (mk.f.d instanceof C4327Tk)) ? 8 : 5;
                q9210 = q9213;
                z23 = z2;
                if (z23) {
                }
            } else if (!p && p2) {
                c9872u012.e(q923, q924, -mk2.g(), 8);
                if (z2) {
                    if (this.j && s3.b1 && (uk5 = this.c0) != null) {
                        VK vk = (VK) uk5;
                        if (z) {
                            vk.v2(mk);
                        } else {
                            vk.A2(mk);
                        }
                    } else {
                        i20 = 5;
                        c9872u012.h(s3, q92, 0, 5);
                        q9210 = q924;
                        z23 = z2;
                        i26 = i20;
                        if (z23) {
                        }
                    }
                }
            } else if (p && p2) {
                UK uk8 = mk.f.d;
                UK uk9 = mk2.f.d;
                UK U = U();
                int i34 = 6;
                if (z16) {
                    if (i28 == 0) {
                        if (i14 != 0 || i13 != 0) {
                            z26 = false;
                            i25 = 5;
                            i16 = 5;
                            z27 = true;
                            z20 = true;
                        } else if (s5.b1 && q924.b1) {
                            c9872u012.e(s3, s5, mk.g(), 8);
                            c9872u012.e(q923, q924, -mk2.g(), 8);
                            return;
                        } else {
                            z27 = false;
                            z20 = false;
                            i25 = 8;
                            i16 = 8;
                            z26 = true;
                        }
                        if ((uk8 instanceof C4327Tk) || (uk9 instanceof C4327Tk)) {
                            q925 = s3;
                            q926 = q924;
                            z21 = z26;
                            i16 = 4;
                        } else {
                            q925 = s3;
                            q926 = q924;
                            z21 = z26;
                        }
                        q928 = q922;
                        z19 = z27;
                        i17 = i25;
                        q927 = s5;
                        i15 = 6;
                    } else {
                        if (i28 == 2) {
                            if ((uk8 instanceof C4327Tk) || (uk9 instanceof C4327Tk)) {
                                q925 = s3;
                                q926 = q924;
                                q927 = s5;
                                i15 = 6;
                                i16 = 4;
                            } else {
                                q925 = s3;
                                q926 = q924;
                                q927 = s5;
                                i15 = 6;
                                i16 = 5;
                            }
                            i17 = 5;
                        } else if (i28 == 1) {
                            q925 = s3;
                            q926 = q924;
                            q927 = s5;
                            i15 = 6;
                            i16 = 4;
                            i17 = 8;
                        } else if (i28 == 3) {
                            if (this.H == -1) {
                                if (z9) {
                                    c9872u012 = c9872u01;
                                    q925 = s3;
                                    q926 = q924;
                                    q927 = s5;
                                    i15 = z2 ? 5 : 4;
                                } else {
                                    c9872u012 = c9872u01;
                                    q925 = s3;
                                    q926 = q924;
                                    q927 = s5;
                                    i15 = 8;
                                }
                                i16 = 5;
                                i17 = 8;
                            } else {
                                if (z6) {
                                    if (i6 == 2 || i6 == 1) {
                                        i23 = 5;
                                        i24 = 4;
                                    } else {
                                        i23 = 8;
                                        i24 = 5;
                                    }
                                    i17 = i23;
                                    i16 = i24;
                                    q925 = s3;
                                    q926 = q924;
                                    q927 = s5;
                                    i15 = 6;
                                } else {
                                    if (i14 > 0) {
                                        c9872u012 = c9872u01;
                                        q925 = s3;
                                        q926 = q924;
                                        q927 = s5;
                                        i15 = 6;
                                        i16 = 5;
                                    } else if (i14 != 0 || i13 != 0) {
                                        c9872u012 = c9872u01;
                                        q925 = s3;
                                        q926 = q924;
                                        q927 = s5;
                                        i15 = 6;
                                        i16 = 4;
                                    } else if (z9) {
                                        i17 = (uk8 == U || uk9 == U) ? 5 : 4;
                                        q925 = s3;
                                        q926 = q924;
                                        q927 = s5;
                                        i15 = 6;
                                        i16 = 4;
                                    } else {
                                        c9872u012 = c9872u01;
                                        q925 = s3;
                                        q926 = q924;
                                        q927 = s5;
                                        i15 = 6;
                                        i16 = 8;
                                    }
                                    i17 = 5;
                                }
                                z19 = true;
                                z20 = true;
                                z21 = true;
                                c9872u012 = c9872u01;
                                q928 = q922;
                            }
                            z19 = true;
                            z20 = true;
                            z21 = true;
                            q928 = q922;
                        } else {
                            c9872u012 = c9872u01;
                            q925 = s3;
                            q926 = q924;
                            q927 = s5;
                            i15 = 6;
                            i16 = 4;
                            i17 = 5;
                            z19 = false;
                            z20 = false;
                            z21 = false;
                            q928 = q922;
                        }
                        z19 = true;
                        z20 = true;
                        z21 = false;
                        q928 = q922;
                    }
                } else if (s5.b1 && q924.b1) {
                    Q92 q9214 = q924;
                    c9872u01.c(s3, s5, mk.g(), f, q9214, q923, mk2.g(), 8);
                    if (z2 && z17) {
                        int g = mk2.f != null ? mk2.g() : 0;
                        if (q9214 != q922) {
                            c9872u01.h(q922, q923, g, 5);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    c9872u012 = c9872u01;
                    q925 = s3;
                    q926 = q924;
                    q927 = s5;
                    q928 = q922;
                    i15 = 6;
                    i16 = 4;
                    i17 = 5;
                    z19 = true;
                    z20 = true;
                    z21 = false;
                }
                if (z20 && q927 == q926 && uk8 != U) {
                    z20 = false;
                    z22 = false;
                } else {
                    z22 = true;
                }
                if (z19) {
                    if (z16 || z7 || z9 || q927 != q92 || q926 != q928) {
                        uk4 = U;
                        i22 = i15;
                        z25 = z2;
                    } else {
                        uk4 = U;
                        i22 = 8;
                        z25 = false;
                        i17 = 8;
                        z22 = false;
                    }
                    q9211 = q92;
                    uk = uk8;
                    z2 = z25;
                    uk3 = uk4;
                    uk2 = uk9;
                    Q92 q9215 = q923;
                    c9872u012.c(q925, q927, mk.g(), f, q926, q9215, mk2.g(), i22);
                    Q92 q9216 = q926;
                    q929 = q925;
                    q9210 = q9216;
                    q923 = q9215;
                } else {
                    Q92 q9217 = q926;
                    q929 = q925;
                    q9210 = q9217;
                    q9211 = q92;
                    uk = uk8;
                    uk2 = uk9;
                    uk3 = U;
                }
                z23 = z2;
                if (this.u0 != 8 || mk2.n()) {
                    if (z20) {
                        int i35 = (!z23 || q927 == q9210 || z16 || !((uk instanceof C4327Tk) || (uk2 instanceof C4327Tk))) ? i17 : 6;
                        c9872u012.h(q929, q927, mk.g(), i35);
                        c9872u012.j(q923, q9210, -mk2.g(), i35);
                        i17 = i35;
                    }
                    if (!z23 || !z10 || (uk instanceof C4327Tk) || (uk2 instanceof C4327Tk) || uk2 == uk3) {
                        i18 = i16;
                        i19 = i17;
                        z24 = z22;
                    } else {
                        i18 = 6;
                        i19 = 6;
                        z24 = true;
                    }
                    if (z24) {
                        if (z21 && (!z9 || z3)) {
                            if (uk != uk3 && uk2 != uk3) {
                                i34 = i18;
                            }
                            i34 = ((uk instanceof C9445sF0) || (uk2 instanceof C9445sF0)) ? 5 : 5;
                            i18 = Math.max(z9 ? 5 : ((uk instanceof C4327Tk) || (uk2 instanceof C4327Tk)) ? 5 : 5, i18);
                        }
                        if (z23) {
                            i18 = Math.min(i19, i18);
                            if (z6 && !z9 && (uk == uk3 || uk2 == uk3)) {
                                i21 = 4;
                                c9872u012.e(q929, q927, mk.g(), i21);
                                c9872u012.e(q923, q9210, -mk2.g(), i21);
                            }
                        }
                        i21 = i18;
                        c9872u012.e(q929, q927, mk.g(), i21);
                        c9872u012.e(q923, q9210, -mk2.g(), i21);
                    }
                    if (z23) {
                        int g2 = q9211 == q927 ? mk.g() : 0;
                        if (q927 != q9211) {
                            c9872u012.h(q929, q9211, g2, 5);
                        }
                    }
                    if (z23 && z16 && i3 == 0 && i13 == 0) {
                        if (z16 && i28 == 3) {
                            c9872u012.h(q923, q929, 0, 8);
                        } else {
                            i20 = 5;
                            c9872u012.h(q923, q929, 0, 5);
                            i26 = i20;
                            if (z23 && z17) {
                                int g3 = mk2.f != null ? mk2.g() : 0;
                                if (q9210 != q922) {
                                    if (this.j && q923.b1 && (uk6 = this.c0) != null) {
                                        VK vk2 = (VK) uk6;
                                        if (z) {
                                            vk2.u2(mk2);
                                            return;
                                        } else {
                                            vk2.z2(mk2);
                                            return;
                                        }
                                    }
                                    c9872u012.h(q922, q923, g3, i26);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    i20 = 5;
                    i26 = i20;
                    if (z23) {
                        return;
                    }
                    return;
                }
                return;
            }
        }
        q9210 = q924;
        i20 = 5;
        z23 = z2;
        i26 = i20;
        if (z23) {
        }
    }

    public int i0() {
        return this.K0;
    }

    public void i1(Object obj) {
        this.s0 = obj;
    }

    public void i2(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.H == -1) {
            if (z3 && !z4) {
                this.H = 0;
            } else if (!z3 && z4) {
                this.H = 1;
                if (this.g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.p() || !this.T.p())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.p() || !this.S.p())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.p() || !this.T.p() || !this.Q.p() || !this.S.p())) {
            if (this.R.p() && this.T.p()) {
                this.H = 0;
            } else if (this.Q.p() && this.S.p()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i = this.z;
            if (i > 0 && this.C == 0) {
                this.H = 0;
            } else if (i == 0 && this.C > 0) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public void j(MK.a aVar, UK uk, MK.a aVar2) {
        k(aVar, uk, aVar2, 0);
    }

    public b j0() {
        return this.b0[1];
    }

    public void j1(int i) {
        if (i >= 0) {
            this.t0 = i;
        } else {
            this.t0 = 0;
        }
    }

    public void j2(boolean z, boolean z2) {
        int i;
        int i2;
        boolean m = z & this.e.m();
        boolean m2 = z2 & this.f.m();
        C7731lI0 c7731lI0 = this.e;
        int i3 = c7731lI0.h.g;
        C6010eF2 c6010eF2 = this.f;
        int i4 = c6010eF2.h.g;
        int i5 = c7731lI0.i.g;
        int i6 = c6010eF2.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (m) {
            this.h0 = i3;
        }
        if (m2) {
            this.i0 = i4;
        }
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        if (m) {
            if (this.b0[0] == b.FIXED && i8 < (i2 = this.d0)) {
                i8 = i2;
            }
            this.d0 = i8;
            int i10 = this.o0;
            if (i8 < i10) {
                this.d0 = i10;
            }
        }
        if (m2) {
            if (this.b0[1] == b.FIXED && i9 < (i = this.e0)) {
                i9 = i;
            }
            this.e0 = i9;
            int i11 = this.p0;
            if (i9 < i11) {
                this.e0 = i11;
            }
        }
    }

    public void k(MK.a aVar, UK uk, MK.a aVar2, int i) {
        MK.a aVar3;
        MK.a aVar4;
        boolean z;
        MK.a aVar5 = MK.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 == aVar5) {
                MK.a aVar6 = MK.a.LEFT;
                MK r = r(aVar6);
                MK.a aVar7 = MK.a.RIGHT;
                MK r2 = r(aVar7);
                MK.a aVar8 = MK.a.TOP;
                MK r3 = r(aVar8);
                MK.a aVar9 = MK.a.BOTTOM;
                MK r4 = r(aVar9);
                boolean z2 = true;
                if ((r != null && r.p()) || (r2 != null && r2.p())) {
                    z = false;
                } else {
                    k(aVar6, uk, aVar6, 0);
                    k(aVar7, uk, aVar7, 0);
                    z = true;
                }
                if ((r3 != null && r3.p()) || (r4 != null && r4.p())) {
                    z2 = false;
                } else {
                    k(aVar8, uk, aVar8, 0);
                    k(aVar9, uk, aVar9, 0);
                }
                if (z && z2) {
                    r(aVar5).a(uk.r(aVar5), 0);
                    return;
                } else if (z) {
                    MK.a aVar10 = MK.a.CENTER_X;
                    r(aVar10).a(uk.r(aVar10), 0);
                    return;
                } else if (z2) {
                    MK.a aVar11 = MK.a.CENTER_Y;
                    r(aVar11).a(uk.r(aVar11), 0);
                    return;
                } else {
                    return;
                }
            }
            MK.a aVar12 = MK.a.LEFT;
            if (aVar2 != aVar12 && aVar2 != MK.a.RIGHT) {
                MK.a aVar13 = MK.a.TOP;
                if (aVar2 == aVar13 || aVar2 == MK.a.BOTTOM) {
                    k(aVar13, uk, aVar2, 0);
                    k(MK.a.BOTTOM, uk, aVar2, 0);
                    r(aVar5).a(uk.r(aVar2), 0);
                    return;
                }
                return;
            }
            k(aVar12, uk, aVar2, 0);
            k(MK.a.RIGHT, uk, aVar2, 0);
            r(aVar5).a(uk.r(aVar2), 0);
            return;
        }
        MK.a aVar14 = MK.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = MK.a.LEFT) || aVar2 == MK.a.RIGHT)) {
            MK r5 = r(aVar4);
            MK r6 = uk.r(aVar2);
            MK r7 = r(MK.a.RIGHT);
            r5.a(r6, 0);
            r7.a(r6, 0);
            r(aVar14).a(r6, 0);
            return;
        }
        MK.a aVar15 = MK.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = MK.a.TOP) || aVar2 == MK.a.BOTTOM)) {
            MK r8 = uk.r(aVar2);
            r(aVar3).a(r8, 0);
            r(MK.a.BOTTOM).a(r8, 0);
            r(aVar15).a(r8, 0);
        } else if (aVar == aVar14 && aVar2 == aVar14) {
            MK.a aVar16 = MK.a.LEFT;
            r(aVar16).a(uk.r(aVar16), 0);
            MK.a aVar17 = MK.a.RIGHT;
            r(aVar17).a(uk.r(aVar17), 0);
            r(aVar14).a(uk.r(aVar2), 0);
        } else if (aVar == aVar15 && aVar2 == aVar15) {
            MK.a aVar18 = MK.a.TOP;
            r(aVar18).a(uk.r(aVar18), 0);
            MK.a aVar19 = MK.a.BOTTOM;
            r(aVar19).a(uk.r(aVar19), 0);
            r(aVar15).a(uk.r(aVar2), 0);
        } else {
            MK r9 = r(aVar);
            MK r10 = uk.r(aVar2);
            if (r9.v(r10)) {
                MK.a aVar20 = MK.a.BASELINE;
                if (aVar == aVar20) {
                    MK r11 = r(MK.a.TOP);
                    MK r12 = r(MK.a.BOTTOM);
                    if (r11 != null) {
                        r11.x();
                    }
                    if (r12 != null) {
                        r12.x();
                    }
                } else if (aVar != MK.a.TOP && aVar != MK.a.BOTTOM) {
                    if (aVar == MK.a.LEFT || aVar == MK.a.RIGHT) {
                        MK r13 = r(aVar5);
                        if (r13.k() != r10) {
                            r13.x();
                        }
                        MK h = r(aVar).h();
                        MK r14 = r(aVar14);
                        if (r14.p()) {
                            h.x();
                            r14.x();
                        }
                    }
                } else {
                    MK r15 = r(aVar20);
                    if (r15 != null) {
                        r15.x();
                    }
                    MK r16 = r(aVar5);
                    if (r16.k() != r10) {
                        r16.x();
                    }
                    MK h2 = r(aVar).h();
                    MK r17 = r(aVar15);
                    if (r17.p()) {
                        h2.x();
                        r17.x();
                    }
                }
                r9.a(r10, i);
            }
        }
    }

    public int k0() {
        int i;
        if (this.Q != null) {
            i = this.R.g;
        } else {
            i = 0;
        }
        if (this.S != null) {
            return i + this.T.g;
        }
        return i;
    }

    public void k1(String str) {
        this.w0 = str;
    }

    public void k2(C9872u01 c9872u01, boolean z) {
        C6010eF2 c6010eF2;
        C7731lI0 c7731lI0;
        int M = c9872u01.M(this.Q);
        int M2 = c9872u01.M(this.R);
        int M3 = c9872u01.M(this.S);
        int M4 = c9872u01.M(this.T);
        if (z && (c7731lI0 = this.e) != null) {
            C8901q20 c8901q20 = c7731lI0.h;
            if (c8901q20.j) {
                C8901q20 c8901q202 = c7731lI0.i;
                if (c8901q202.j) {
                    M = c8901q20.g;
                    M3 = c8901q202.g;
                }
            }
        }
        if (z && (c6010eF2 = this.f) != null) {
            C8901q20 c8901q203 = c6010eF2.h;
            if (c8901q203.j) {
                C8901q20 c8901q204 = c6010eF2.i;
                if (c8901q204.j) {
                    M2 = c8901q203.g;
                    M4 = c8901q204.g;
                }
            }
        }
        int i = M4 - M2;
        if (M3 - M < 0 || i < 0 || M == Integer.MIN_VALUE || M == Integer.MAX_VALUE || M2 == Integer.MIN_VALUE || M2 == Integer.MAX_VALUE || M3 == Integer.MIN_VALUE || M3 == Integer.MAX_VALUE || M4 == Integer.MIN_VALUE || M4 == Integer.MAX_VALUE) {
            M = 0;
            M4 = 0;
            M2 = 0;
            M3 = 0;
        }
        w1(M, M2, M3, M4);
    }

    public void l(MK mk, MK mk2, int i) {
        if (mk.i() == this) {
            k(mk.l(), mk2.i(), mk2.l(), i);
        }
    }

    public int l0() {
        return this.u0;
    }

    public void l1(C9872u01 c9872u01, String str) {
        this.w0 = str;
        Q92 s = c9872u01.s(this.Q);
        Q92 s2 = c9872u01.s(this.R);
        Q92 s3 = c9872u01.s(this.S);
        Q92 s4 = c9872u01.s(this.T);
        s.p(str + ".left");
        s2.p(str + ".top");
        s3.p(str + ".right");
        s4.p(str + ".bottom");
        Q92 s5 = c9872u01.s(this.U);
        s5.p(str + ".baseline");
    }

    public void m(UK uk, float f, int i) {
        MK.a aVar = MK.a.CENTER;
        v0(aVar, uk, aVar, i, 0);
        this.K = f;
    }

    public int m0() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.d0;
    }

    public void m1(int i, int i2) {
        this.d0 = i;
        int i3 = this.o0;
        if (i < i3) {
            this.d0 = i3;
        }
        this.e0 = i2;
        int i4 = this.p0;
        if (i2 < i4) {
            this.e0 = i4;
        }
    }

    public void n(UK uk, HashMap<UK, UK> hashMap) {
        UK uk2;
        UK uk3;
        this.t = uk.t;
        this.u = uk.u;
        this.w = uk.w;
        this.x = uk.x;
        int[] iArr = this.y;
        int[] iArr2 = uk.y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.z = uk.z;
        this.A = uk.A;
        this.C = uk.C;
        this.D = uk.D;
        this.E = uk.E;
        this.F = uk.F;
        this.G = uk.G;
        this.H = uk.H;
        this.I = uk.I;
        int[] iArr3 = uk.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = uk.K;
        this.L = uk.L;
        this.M = uk.M;
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.b0 = (b[]) Arrays.copyOf(this.b0, 2);
        UK uk4 = null;
        if (this.c0 == null) {
            uk2 = null;
        } else {
            uk2 = hashMap.get(uk.c0);
        }
        this.c0 = uk2;
        this.d0 = uk.d0;
        this.e0 = uk.e0;
        this.f0 = uk.f0;
        this.g0 = uk.g0;
        this.h0 = uk.h0;
        this.i0 = uk.i0;
        this.j0 = uk.j0;
        this.k0 = uk.k0;
        this.l0 = uk.l0;
        this.m0 = uk.m0;
        this.n0 = uk.n0;
        this.o0 = uk.o0;
        this.p0 = uk.p0;
        this.q0 = uk.q0;
        this.r0 = uk.r0;
        this.s0 = uk.s0;
        this.t0 = uk.t0;
        this.u0 = uk.u0;
        this.v0 = uk.v0;
        this.w0 = uk.w0;
        this.x0 = uk.x0;
        this.y0 = uk.y0;
        this.z0 = uk.z0;
        this.A0 = uk.A0;
        this.B0 = uk.B0;
        this.C0 = uk.C0;
        this.D0 = uk.D0;
        this.E0 = uk.E0;
        this.F0 = uk.F0;
        this.G0 = uk.G0;
        this.H0 = uk.H0;
        this.J0 = uk.J0;
        this.K0 = uk.K0;
        this.L0 = uk.L0;
        this.M0 = uk.M0;
        float[] fArr = this.N0;
        float[] fArr2 = uk.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        UK[] ukArr = this.O0;
        UK[] ukArr2 = uk.O0;
        ukArr[0] = ukArr2[0];
        ukArr[1] = ukArr2[1];
        UK[] ukArr3 = this.P0;
        UK[] ukArr4 = uk.P0;
        ukArr3[0] = ukArr4[0];
        ukArr3[1] = ukArr4[1];
        UK uk5 = uk.Q0;
        if (uk5 == null) {
            uk3 = null;
        } else {
            uk3 = hashMap.get(uk5);
        }
        this.Q0 = uk3;
        UK uk6 = uk.R0;
        if (uk6 != null) {
            uk4 = hashMap.get(uk6);
        }
        this.R0 = uk4;
    }

    public int n0() {
        return this.v;
    }

    public void n1(float f, int i) {
        this.f0 = f;
        this.g0 = i;
    }

    public void o(C9872u01 c9872u01) {
        c9872u01.s(this.Q);
        c9872u01.s(this.R);
        c9872u01.s(this.S);
        c9872u01.s(this.T);
        if (this.n0 > 0) {
            c9872u01.s(this.U);
        }
    }

    public int o0() {
        UK uk = this.c0;
        if (uk != null && (uk instanceof VK)) {
            return ((VK) uk).J1 + this.h0;
        }
        return this.h0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please submit an issue!!! */
    public void o1(String str) {
        float f;
        int i = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase(C2638Cg0.T4)) {
                    if (substring.equalsIgnoreCase(C5738d80.e)) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                }
                i3 = i2;
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i2, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i3 == 1) {
                            f = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f = i;
            } else {
                String substring4 = str.substring(i2);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                f = i;
            }
            i = (f > i ? 1 : (f == i ? 0 : -1));
            if (i > 0) {
                this.f0 = f;
                this.g0 = i3;
                return;
            }
            return;
        }
        this.f0 = 0.0f;
    }

    public void p() {
        this.i = true;
    }

    public int p0() {
        UK uk = this.c0;
        if (uk != null && (uk instanceof VK)) {
            return ((VK) uk).K1 + this.i0;
        }
        return this.i0;
    }

    public void p1(int i) {
        if (!this.L) {
            return;
        }
        int i2 = i - this.n0;
        int i3 = this.e0 + i2;
        this.i0 = i2;
        this.R.A(i2);
        this.T.A(i3);
        this.U.A(i);
        this.q = true;
    }

    public void q() {
        if (this.e == null) {
            this.e = new C7731lI0(this);
        }
        if (this.f == null) {
            this.f = new C6010eF2(this);
        }
    }

    public boolean q0() {
        return this.L;
    }

    public void q1(int i, int i2, int i3, int i4, int i5, int i6) {
        w1(i, i2, i3, i4);
        h1(i5);
        if (i6 == 0) {
            this.p = true;
            this.q = false;
        } else if (i6 == 1) {
            this.p = false;
            this.q = true;
        } else if (i6 == 2) {
            this.p = true;
            this.q = true;
        } else {
            this.p = false;
            this.q = false;
        }
    }

    public MK r(MK.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean r0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.Q.f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.S.f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 >= 2) {
                return false;
            }
            return true;
        }
        if (this.R.f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.T.f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.U.f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 >= 2) {
            return false;
        }
        return true;
    }

    public void r1(int i, int i2) {
        if (this.p) {
            return;
        }
        this.Q.A(i);
        this.S.A(i2);
        this.h0 = i;
        this.d0 = i2 - i;
        this.p = true;
    }

    public ArrayList<MK> s() {
        return this.Z;
    }

    public boolean s0() {
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            if (this.Z.get(i).n()) {
                return true;
            }
        }
        return false;
    }

    public void s1(int i) {
        this.Q.A(i);
        this.h0 = i;
    }

    public int t() {
        return this.n0;
    }

    public boolean t0() {
        if (this.l == -1 && this.m == -1) {
            return false;
        }
        return true;
    }

    public void t1(int i) {
        this.R.A(i);
        this.i0 = i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.x0 == null) {
            str = "";
        } else {
            str = "type: " + this.x0 + C4500Ve2.b;
        }
        sb.append(str);
        if (this.w0 != null) {
            str2 = "id: " + this.w0 + C4500Ve2.b;
        }
        sb.append(str2);
        sb.append(C9811tl1.c);
        sb.append(this.h0);
        sb.append(C6566gU0.h);
        sb.append(this.i0);
        sb.append(") - (");
        sb.append(this.d0);
        sb.append(" x ");
        sb.append(this.e0);
        sb.append(C9811tl1.d);
        return sb.toString();
    }

    public float u(int i) {
        if (i == 0) {
            return this.q0;
        }
        if (i == 1) {
            return this.r0;
        }
        return -1.0f;
    }

    public boolean u0(int i, int i2) {
        MK mk;
        MK mk2;
        if (i == 0) {
            MK mk3 = this.Q.f;
            if (mk3 != null && mk3.o() && (mk2 = this.S.f) != null && mk2.o() && (this.S.f.f() - this.S.g()) - (this.Q.f.f() + this.Q.g()) >= i2) {
                return true;
            }
            return false;
        }
        MK mk4 = this.R.f;
        if (mk4 != null && mk4.o() && (mk = this.T.f) != null && mk.o() && (this.T.f.f() - this.T.g()) - (this.R.f.f() + this.R.g()) >= i2) {
            return true;
        }
        return false;
    }

    public void u1(int i, int i2) {
        if (this.q) {
            return;
        }
        this.R.A(i);
        this.T.A(i2);
        this.i0 = i;
        this.e0 = i2 - i;
        if (this.L) {
            this.U.A(i + this.n0);
        }
        this.q = true;
    }

    public int v() {
        return p0() + this.e0;
    }

    public void v0(MK.a aVar, UK uk, MK.a aVar2, int i, int i2) {
        r(aVar).b(uk.r(aVar2), i, i2, true);
    }

    public void v1(int i, int i2, int i3) {
        if (i3 == 0) {
            D1(i, i2);
        } else if (i3 == 1) {
            Y1(i, i2);
        }
    }

    public Object w() {
        return this.s0;
    }

    public boolean w0() {
        return this.v0;
    }

    public void w1(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.h0 = i;
        this.i0 = i2;
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        b[] bVarArr = this.b0;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.d0)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.e0)) {
            i8 = i5;
        }
        this.d0 = i7;
        this.e0 = i8;
        int i9 = this.p0;
        if (i8 < i9) {
            this.e0 = i9;
        }
        int i10 = this.o0;
        if (i7 < i10) {
            this.d0 = i10;
        }
        int i11 = this.A;
        if (i11 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.d0 = Math.min(this.d0, i11);
        }
        int i12 = this.D;
        if (i12 > 0 && this.b0[1] == b.MATCH_CONSTRAINT) {
            this.e0 = Math.min(this.e0, i12);
        }
        int i13 = this.d0;
        if (i7 != i13) {
            this.l = i13;
        }
        int i14 = this.e0;
        if (i8 != i14) {
            this.m = i14;
        }
    }

    public int x() {
        return this.t0;
    }

    public final boolean x0(int i) {
        MK mk;
        MK mk2;
        int i2 = i * 2;
        MK[] mkArr = this.Y;
        MK mk3 = mkArr[i2];
        MK mk4 = mk3.f;
        if (mk4 != null && mk4.f != mk3 && (mk2 = (mk = mkArr[i2 + 1]).f) != null && mk2.f == mk) {
            return true;
        }
        return false;
    }

    public void x1(MK.a aVar, int i) {
        int i2 = a.a[aVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                        this.U.h = i;
                        return;
                    }
                    this.T.h = i;
                    return;
                }
                this.S.h = i;
                return;
            }
            this.R.h = i;
            return;
        }
        this.Q.h = i;
    }

    public String y() {
        return this.w0;
    }

    public boolean y0() {
        return this.G;
    }

    public void y1(boolean z) {
        this.L = z;
    }

    public b z(int i) {
        if (i == 0) {
            return H();
        }
        if (i == 1) {
            return j0();
        }
        return null;
    }

    public boolean z0() {
        return this.r;
    }

    public void z1(int i) {
        this.e0 = i;
        int i2 = this.p0;
        if (i < i2) {
            this.e0 = i2;
        }
    }

    public UK(String str) {
        this.a = false;
        this.b = new WK2[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new UK2(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = Float.NaN;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new MK(this, MK.a.LEFT);
        this.R = new MK(this, MK.a.TOP);
        this.S = new MK(this, MK.a.RIGHT);
        this.T = new MK(this, MK.a.BOTTOM);
        this.U = new MK(this, MK.a.BASELINE);
        this.V = new MK(this, MK.a.CENTER_X);
        this.W = new MK(this, MK.a.CENTER_Y);
        MK mk = new MK(this, MK.a.CENTER);
        this.X = mk;
        this.Y = new MK[]{this.Q, this.S, this.R, this.T, this.U, mk};
        this.Z = new ArrayList<>();
        this.a0 = new boolean[2];
        b bVar = b.FIXED;
        this.b0 = new b[]{bVar, bVar};
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = A1;
        this.q0 = f;
        this.r0 = f;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new UK[]{null, null};
        this.P0 = new UK[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
        k1(str);
    }

    public UK(int i, int i2, int i3, int i4) {
        this.a = false;
        this.b = new WK2[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new UK2(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = Float.NaN;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new MK(this, MK.a.LEFT);
        this.R = new MK(this, MK.a.TOP);
        this.S = new MK(this, MK.a.RIGHT);
        this.T = new MK(this, MK.a.BOTTOM);
        this.U = new MK(this, MK.a.BASELINE);
        this.V = new MK(this, MK.a.CENTER_X);
        this.W = new MK(this, MK.a.CENTER_Y);
        MK mk = new MK(this, MK.a.CENTER);
        this.X = mk;
        this.Y = new MK[]{this.Q, this.S, this.R, this.T, this.U, mk};
        this.Z = new ArrayList<>();
        this.a0 = new boolean[2];
        b bVar = b.FIXED;
        this.b0 = new b[]{bVar, bVar};
        this.c0 = null;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = A1;
        this.q0 = f;
        this.r0 = f;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new UK[]{null, null};
        this.P0 = new UK[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        this.h0 = i;
        this.i0 = i2;
        this.d0 = i3;
        this.e0 = i4;
        d();
    }

    public UK(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        k1(str);
    }

    public UK(int i, int i2) {
        this(0, 0, i, i2);
    }

    public UK(String str, int i, int i2) {
        this(i, i2);
        k1(str);
    }
}
