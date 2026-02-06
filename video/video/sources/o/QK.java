package o;

import java.util.ArrayList;
import java.util.HashMap;
import o.C8068mc2;
import o.MK;

/* loaded from: classes.dex */
public class QK implements TP1 {
    public Object a;
    public final C8068mc2 b;
    public float c0;
    public float d0;
    public C9640t30 f0;
    public C9640t30 g0;
    public Object h0;
    public UK i0;
    public HashMap<String, Integer> j0;
    public HashMap<String, Float> k0;
    public C5933dw2 l0;
    public String c = null;
    public InterfaceC5156ak0 d = null;
    public int e = 0;
    public int f = 0;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = 0.5f;
    public float j = 0.5f;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f589o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public int x = 0;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public int J = 0;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public Object T = null;
    public Object U = null;
    public Object V = null;
    public Object W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object a0 = null;
    public Object b0 = null;
    public C8068mc2.b e0 = null;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C8068mc2.b.values().length];
            a = iArr;
            try {
                iArr[C8068mc2.b.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C8068mc2.b.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C8068mc2.b.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C8068mc2.b.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C8068mc2.b.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[C8068mc2.b.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[C8068mc2.b.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[C8068mc2.b.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[C8068mc2.b.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[C8068mc2.b.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[C8068mc2.b.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[C8068mc2.b.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[C8068mc2.b.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[C8068mc2.b.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[C8068mc2.b.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[C8068mc2.b.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[C8068mc2.b.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[C8068mc2.b.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[C8068mc2.b.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[C8068mc2.b.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        QK a(C8068mc2 c8068mc2);
    }

    /* loaded from: classes.dex */
    public static class c extends Exception {
        public final ArrayList<String> X;

        public c(ArrayList<String> arrayList) {
            this.X = arrayList;
        }

        public ArrayList<String> a() {
            return this.X;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return toString();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.X.toString();
        }
    }

    public QK(C8068mc2 c8068mc2) {
        Object obj = C9640t30.j;
        this.f0 = C9640t30.l(obj);
        this.g0 = C9640t30.l(obj);
        this.j0 = new HashMap<>();
        this.k0 = new HashMap<>();
        this.l0 = null;
        this.b = c8068mc2;
    }

    public final void A() {
        this.K = E(this.K);
        this.L = E(this.L);
        this.M = E(this.M);
        this.N = E(this.N);
        this.O = E(this.O);
        this.P = E(this.P);
        this.Q = E(this.Q);
        this.R = E(this.R);
        this.S = E(this.S);
        this.T = E(this.T);
        this.V = E(this.V);
        this.W = E(this.W);
        this.Y = E(this.Y);
        this.Z = E(this.Z);
        this.a0 = E(this.a0);
    }

    public QK A0(C9640t30 c9640t30) {
        this.f0 = c9640t30;
        return this;
    }

    public QK B() {
        if (this.Q != null) {
            this.e0 = C8068mc2.b.END_TO_START;
            return this;
        }
        this.e0 = C8068mc2.b.END_TO_END;
        return this;
    }

    public QK B0() {
        if (this.O != null) {
            this.e0 = C8068mc2.b.START_TO_START;
            return this;
        }
        this.e0 = C8068mc2.b.START_TO_END;
        return this;
    }

    public QK C(Object obj) {
        this.e0 = C8068mc2.b.END_TO_END;
        this.R = obj;
        return this;
    }

    public QK C0(Object obj) {
        this.e0 = C8068mc2.b.START_TO_END;
        this.P = obj;
        return this;
    }

    public QK D(Object obj) {
        this.e0 = C8068mc2.b.END_TO_START;
        this.Q = obj;
        return this;
    }

    public QK D0(Object obj) {
        this.e0 = C8068mc2.b.START_TO_START;
        this.O = obj;
        return this;
    }

    public final Object E(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof QK)) {
            return this.b.C(obj);
        }
        return obj;
    }

    public QK E0() {
        if (this.S != null) {
            this.e0 = C8068mc2.b.TOP_TO_TOP;
            return this;
        }
        this.e0 = C8068mc2.b.TOP_TO_BOTTOM;
        return this;
    }

    public float F() {
        return this.G;
    }

    public QK F0(Object obj) {
        this.e0 = C8068mc2.b.TOP_TO_BASELINE;
        this.U = obj;
        return this;
    }

    public C9640t30 G() {
        return this.g0;
    }

    public QK G0(Object obj) {
        this.e0 = C8068mc2.b.TOP_TO_BOTTOM;
        this.T = obj;
        return this;
    }

    public int H() {
        return this.e;
    }

    public QK H0(Object obj) {
        this.e0 = C8068mc2.b.TOP_TO_TOP;
        this.S = obj;
        return this;
    }

    public float I() {
        return this.g;
    }

    public QK I0(float f) {
        this.D = f;
        return this;
    }

    public float J() {
        return this.y;
    }

    public QK J0(float f) {
        this.E = f;
        return this;
    }

    public float K() {
        return this.z;
    }

    public QK K0(float f) {
        this.F = f;
        return this;
    }

    public float L() {
        return this.A;
    }

    public void L0() throws c {
        ArrayList arrayList = new ArrayList();
        if (this.K != null && this.L != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.M != null && this.N != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.O != null && this.P != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.Q != null && this.R != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.K != null || this.L != null || this.M != null || this.N != null) && (this.O != null || this.P != null || this.Q != null || this.R != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() <= 0) {
            return;
        }
        throw new c(arrayList);
    }

    public float M() {
        return this.B;
    }

    public QK M0(float f) {
        this.j = f;
        return this;
    }

    public float N() {
        return this.C;
    }

    public QK N0(int i) {
        this.J = i;
        return this;
    }

    public float O() {
        return this.H;
    }

    public QK O0(C9640t30 c9640t30) {
        return A0(c9640t30);
    }

    public float P() {
        return this.I;
    }

    public String Q() {
        return this.c;
    }

    public final UK R(Object obj) {
        if (obj instanceof TP1) {
            return ((TP1) obj).a();
        }
        return null;
    }

    public float S() {
        return this.D;
    }

    public float T() {
        return this.E;
    }

    public float U() {
        return this.F;
    }

    public int V(int i) {
        return this.f;
    }

    public float W() {
        return this.h;
    }

    public Object X() {
        return this.h0;
    }

    public C9640t30 Y() {
        return this.f0;
    }

    public QK Z(C9640t30 c9640t30) {
        return t0(c9640t30);
    }

    @Override // o.TP1
    public UK a() {
        if (this.i0 == null) {
            UK z = z();
            this.i0 = z;
            z.i1(this.h0);
        }
        return this.i0;
    }

    public QK a0(float f) {
        this.i = f;
        return this;
    }

    @Override // o.TP1
    public void apply() {
        if (this.i0 != null) {
            InterfaceC5156ak0 interfaceC5156ak0 = this.d;
            if (interfaceC5156ak0 != null) {
                interfaceC5156ak0.apply();
            }
            this.f0.j(this.b, this.i0, 0);
            this.g0.j(this.b, this.i0, 1);
            A();
            i();
            int i = this.e;
            if (i != 0) {
                this.i0.C1(i);
            }
            int i2 = this.f;
            if (i2 != 0) {
                this.i0.X1(i2);
            }
            float f = this.g;
            if (f != -1.0f) {
                this.i0.G1(f);
            }
            float f2 = this.h;
            if (f2 != -1.0f) {
                this.i0.b2(f2);
            }
            this.i0.B1(this.i);
            this.i0.W1(this.j);
            UK uk = this.i0;
            UK2 uk2 = uk.n;
            uk2.f = this.y;
            uk2.g = this.z;
            uk2.h = this.A;
            uk2.i = this.B;
            uk2.j = this.C;
            uk2.k = this.D;
            uk2.l = this.E;
            uk2.m = this.F;
            uk2.n = this.H;
            uk2.f626o = this.I;
            uk2.p = this.G;
            int i3 = this.J;
            uk2.r = i3;
            uk.c2(i3);
            this.i0.n.C(this.l0);
            HashMap<String, Integer> hashMap = this.j0;
            if (hashMap != null) {
                for (String str : hashMap.keySet()) {
                    this.i0.n.y(str, 902, this.j0.get(str).intValue());
                }
            }
            HashMap<String, Float> hashMap2 = this.k0;
            if (hashMap2 != null) {
                for (String str2 : hashMap2.keySet()) {
                    this.i0.n.x(str2, 901, this.k0.get(str2).floatValue());
                }
            }
        }
    }

    @Override // o.TP1
    public void b(UK uk) {
        if (uk == null) {
            return;
        }
        this.i0 = uk;
        uk.i1(this.h0);
    }

    public QK b0() {
        if (this.K != null) {
            this.e0 = C8068mc2.b.LEFT_TO_LEFT;
            return this;
        }
        this.e0 = C8068mc2.b.LEFT_TO_RIGHT;
        return this;
    }

    @Override // o.TP1
    public void c(Object obj) {
        this.a = obj;
    }

    public QK c0(Object obj) {
        this.e0 = C8068mc2.b.LEFT_TO_LEFT;
        this.K = obj;
        return this;
    }

    @Override // o.TP1
    public InterfaceC5156ak0 d() {
        return this.d;
    }

    public QK d0(Object obj) {
        this.e0 = C8068mc2.b.LEFT_TO_RIGHT;
        this.L = obj;
        return this;
    }

    public void e(String str, int i) {
        this.j0.put(str, Integer.valueOf(i));
    }

    public QK e0(int i) {
        C8068mc2.b bVar = this.e0;
        if (bVar != null) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                case 2:
                    this.k = i;
                    return this;
                case 3:
                case 4:
                    this.l = i;
                    return this;
                case 5:
                case 6:
                    this.m = i;
                    return this;
                case 7:
                case 8:
                    this.n = i;
                    return this;
                case 9:
                case 10:
                case 11:
                    this.f589o = i;
                    return this;
                case 12:
                case 13:
                case 14:
                    this.p = i;
                    return this;
                case 15:
                case 16:
                case 17:
                    this.w = i;
                    return this;
                case 18:
                    this.d0 = i;
                    return this;
                default:
                    return this;
            }
        }
        this.k = i;
        this.l = i;
        this.m = i;
        this.n = i;
        this.f589o = i;
        this.p = i;
        return this;
    }

    public void f(String str, float f) {
        if (this.k0 == null) {
            this.k0 = new HashMap<>();
        }
        this.k0.put(str, Float.valueOf(f));
    }

    public QK f0(Object obj) {
        return e0(this.b.g(obj));
    }

    public QK g(float f) {
        this.G = f;
        return this;
    }

    public QK g0(int i) {
        C8068mc2.b bVar = this.e0;
        if (bVar != null) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                case 2:
                    this.q = i;
                    return this;
                case 3:
                case 4:
                    this.r = i;
                    return this;
                case 5:
                case 6:
                    this.s = i;
                    return this;
                case 7:
                case 8:
                    this.t = i;
                    return this;
                case 9:
                case 10:
                case 11:
                    this.u = i;
                    return this;
                case 12:
                case 13:
                case 14:
                    this.v = i;
                    return this;
                case 15:
                case 16:
                case 17:
                    this.x = i;
                    return this;
                default:
                    return this;
            }
        }
        this.q = i;
        this.r = i;
        this.s = i;
        this.t = i;
        this.u = i;
        this.v = i;
        return this;
    }

    @Override // o.TP1
    public Object getKey() {
        return this.a;
    }

    public final void h(UK uk, Object obj, C8068mc2.b bVar) {
        UK R = R(obj);
        if (R != null) {
            int[] iArr = a.a;
            int i = iArr[bVar.ordinal()];
            switch (iArr[bVar.ordinal()]) {
                case 1:
                    MK.a aVar = MK.a.LEFT;
                    uk.r(aVar).b(R.r(aVar), this.k, this.q, false);
                    return;
                case 2:
                    uk.r(MK.a.LEFT).b(R.r(MK.a.RIGHT), this.k, this.q, false);
                    return;
                case 3:
                    uk.r(MK.a.RIGHT).b(R.r(MK.a.LEFT), this.l, this.r, false);
                    return;
                case 4:
                    MK.a aVar2 = MK.a.RIGHT;
                    uk.r(aVar2).b(R.r(aVar2), this.l, this.r, false);
                    return;
                case 5:
                    MK.a aVar3 = MK.a.LEFT;
                    uk.r(aVar3).b(R.r(aVar3), this.m, this.s, false);
                    return;
                case 6:
                    uk.r(MK.a.LEFT).b(R.r(MK.a.RIGHT), this.m, this.s, false);
                    return;
                case 7:
                    uk.r(MK.a.RIGHT).b(R.r(MK.a.LEFT), this.n, this.t, false);
                    return;
                case 8:
                    MK.a aVar4 = MK.a.RIGHT;
                    uk.r(aVar4).b(R.r(aVar4), this.n, this.t, false);
                    return;
                case 9:
                    MK.a aVar5 = MK.a.TOP;
                    uk.r(aVar5).b(R.r(aVar5), this.f589o, this.u, false);
                    return;
                case 10:
                    uk.r(MK.a.TOP).b(R.r(MK.a.BOTTOM), this.f589o, this.u, false);
                    return;
                case 11:
                    uk.v0(MK.a.TOP, R, MK.a.BASELINE, this.f589o, this.u);
                    return;
                case 12:
                    uk.r(MK.a.BOTTOM).b(R.r(MK.a.TOP), this.p, this.v, false);
                    return;
                case 13:
                    MK.a aVar6 = MK.a.BOTTOM;
                    uk.r(aVar6).b(R.r(aVar6), this.p, this.v, false);
                    return;
                case 14:
                    uk.v0(MK.a.BOTTOM, R, MK.a.BASELINE, this.p, this.v);
                    return;
                case 15:
                    uk.v0(MK.a.BASELINE, R, MK.a.BOTTOM, this.w, this.x);
                    return;
                case 16:
                    uk.v0(MK.a.BASELINE, R, MK.a.TOP, this.w, this.x);
                    return;
                case 17:
                    MK.a aVar7 = MK.a.BASELINE;
                    uk.v0(aVar7, R, aVar7, this.w, this.x);
                    return;
                case 18:
                    uk.m(R, this.c0, (int) this.d0);
                    return;
                default:
                    return;
            }
        }
    }

    public QK h0(Object obj) {
        return g0(this.b.g(obj));
    }

    public void i() {
        h(this.i0, this.K, C8068mc2.b.LEFT_TO_LEFT);
        h(this.i0, this.L, C8068mc2.b.LEFT_TO_RIGHT);
        h(this.i0, this.M, C8068mc2.b.RIGHT_TO_LEFT);
        h(this.i0, this.N, C8068mc2.b.RIGHT_TO_RIGHT);
        h(this.i0, this.O, C8068mc2.b.START_TO_START);
        h(this.i0, this.P, C8068mc2.b.START_TO_END);
        h(this.i0, this.Q, C8068mc2.b.END_TO_START);
        h(this.i0, this.R, C8068mc2.b.END_TO_END);
        h(this.i0, this.S, C8068mc2.b.TOP_TO_TOP);
        h(this.i0, this.T, C8068mc2.b.TOP_TO_BOTTOM);
        h(this.i0, this.U, C8068mc2.b.TOP_TO_BASELINE);
        h(this.i0, this.V, C8068mc2.b.BOTTOM_TO_TOP);
        h(this.i0, this.W, C8068mc2.b.BOTTOM_TO_BOTTOM);
        h(this.i0, this.X, C8068mc2.b.BOTTOM_TO_BASELINE);
        h(this.i0, this.Y, C8068mc2.b.BASELINE_TO_BASELINE);
        h(this.i0, this.Z, C8068mc2.b.BASELINE_TO_TOP);
        h(this.i0, this.a0, C8068mc2.b.BASELINE_TO_BOTTOM);
        h(this.i0, this.b0, C8068mc2.b.CIRCULAR_CONSTRAINT);
    }

    public QK i0(float f) {
        this.y = f;
        return this;
    }

    public QK j() {
        this.e0 = C8068mc2.b.BASELINE_TO_BASELINE;
        return this;
    }

    public QK j0(float f) {
        this.z = f;
        return this;
    }

    public QK k(Object obj) {
        this.e0 = C8068mc2.b.BASELINE_TO_BASELINE;
        this.Y = obj;
        return this;
    }

    public QK k0() {
        if (this.M != null) {
            this.e0 = C8068mc2.b.RIGHT_TO_LEFT;
            return this;
        }
        this.e0 = C8068mc2.b.RIGHT_TO_RIGHT;
        return this;
    }

    public QK l(Object obj) {
        this.e0 = C8068mc2.b.BASELINE_TO_BOTTOM;
        this.a0 = obj;
        return this;
    }

    public QK l0(Object obj) {
        this.e0 = C8068mc2.b.RIGHT_TO_LEFT;
        this.M = obj;
        return this;
    }

    public QK m(Object obj) {
        this.e0 = C8068mc2.b.BASELINE_TO_TOP;
        this.Z = obj;
        return this;
    }

    public QK m0(Object obj) {
        this.e0 = C8068mc2.b.RIGHT_TO_RIGHT;
        this.N = obj;
        return this;
    }

    public QK n(float f) {
        C8068mc2.b bVar = this.e0;
        if (bVar != null) {
            int i = a.a[bVar.ordinal()];
            if (i != 19) {
                if (i != 20) {
                    switch (i) {
                    }
                }
                this.j = f;
                return this;
            }
            this.i = f;
            return this;
        }
        return this;
    }

    public QK n0(float f) {
        this.A = f;
        return this;
    }

    public QK o() {
        if (this.V != null) {
            this.e0 = C8068mc2.b.BOTTOM_TO_TOP;
            return this;
        }
        this.e0 = C8068mc2.b.BOTTOM_TO_BOTTOM;
        return this;
    }

    public QK o0(float f) {
        this.B = f;
        return this;
    }

    public QK p(Object obj) {
        this.e0 = C8068mc2.b.BOTTOM_TO_BASELINE;
        this.X = obj;
        return this;
    }

    public QK p0(float f) {
        this.C = f;
        return this;
    }

    public QK q(Object obj) {
        this.e0 = C8068mc2.b.BOTTOM_TO_BOTTOM;
        this.W = obj;
        return this;
    }

    public QK q0(float f) {
        this.H = f;
        return this;
    }

    public QK r(Object obj) {
        this.e0 = C8068mc2.b.BOTTOM_TO_TOP;
        this.V = obj;
        return this;
    }

    public QK r0(float f) {
        this.I = f;
        return this;
    }

    public QK s(Object obj) {
        Object E = E(obj);
        this.O = E;
        this.R = E;
        this.e0 = C8068mc2.b.CENTER_HORIZONTALLY;
        this.i = 0.5f;
        return this;
    }

    public void s0(InterfaceC5156ak0 interfaceC5156ak0) {
        this.d = interfaceC5156ak0;
        if (interfaceC5156ak0 != null) {
            b(interfaceC5156ak0.a());
        }
    }

    public QK t(Object obj) {
        Object E = E(obj);
        this.S = E;
        this.W = E;
        this.e0 = C8068mc2.b.CENTER_VERTICALLY;
        this.j = 0.5f;
        return this;
    }

    public QK t0(C9640t30 c9640t30) {
        this.g0 = c9640t30;
        return this;
    }

    public QK u(Object obj, float f, float f2) {
        this.b0 = E(obj);
        this.c0 = f;
        this.d0 = f2;
        this.e0 = C8068mc2.b.CIRCULAR_CONSTRAINT;
        return this;
    }

    public void u0(int i) {
        this.e = i;
    }

    public QK v() {
        C8068mc2.b bVar = this.e0;
        if (bVar != null) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                case 2:
                    this.K = null;
                    this.L = null;
                    this.k = 0;
                    this.q = 0;
                    return this;
                case 3:
                case 4:
                    this.M = null;
                    this.N = null;
                    this.l = 0;
                    this.r = 0;
                    return this;
                case 5:
                case 6:
                    this.O = null;
                    this.P = null;
                    this.m = 0;
                    this.s = 0;
                    return this;
                case 7:
                case 8:
                    this.Q = null;
                    this.R = null;
                    this.n = 0;
                    this.t = 0;
                    return this;
                case 9:
                case 10:
                case 11:
                    this.S = null;
                    this.T = null;
                    this.U = null;
                    this.f589o = 0;
                    this.u = 0;
                    return this;
                case 12:
                case 13:
                case 14:
                    this.V = null;
                    this.W = null;
                    this.X = null;
                    this.p = 0;
                    this.v = 0;
                    return this;
                case 15:
                case 16:
                default:
                    return this;
                case 17:
                    this.Y = null;
                    return this;
                case 18:
                    this.b0 = null;
                    return this;
            }
        }
        w();
        return this;
    }

    public void v0(float f) {
        this.g = f;
    }

    public QK w() {
        this.K = null;
        this.L = null;
        this.k = 0;
        this.M = null;
        this.N = null;
        this.l = 0;
        this.O = null;
        this.P = null;
        this.m = 0;
        this.Q = null;
        this.R = null;
        this.n = 0;
        this.S = null;
        this.T = null;
        this.f589o = 0;
        this.V = null;
        this.W = null;
        this.p = 0;
        this.Y = null;
        this.b0 = null;
        this.i = 0.5f;
        this.j = 0.5f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        return this;
    }

    public void w0(String str) {
        this.c = str;
    }

    public QK x() {
        B0().v();
        B().v();
        b0().v();
        k0().v();
        return this;
    }

    public void x0(int i) {
        this.f = i;
    }

    public QK y() {
        E0().v();
        j().v();
        o().v();
        return this;
    }

    public void y0(float f) {
        this.h = f;
    }

    public UK z() {
        return new UK(Y().w(), G().w());
    }

    public void z0(Object obj) {
        this.h0 = obj;
        UK uk = this.i0;
        if (uk != null) {
            uk.i1(obj);
        }
    }
}
