package o;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import o.AbstractC4678Xa2;

/* renamed from: o.Tk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4329Tk1 implements Comparable<C4329Tk1> {
    public static final int A1 = 1;
    public static final int B1 = 2;
    public static String[] C1 = {"position", "x", C5738d80.b, "width", "height", "pathRotate"};
    public static final String y1 = "MotionPaths";
    public static final boolean z1 = false;
    public int Z;
    public C6725h90 k1;
    public float m1;
    public float n1;
    public float o1;
    public float p1;
    public float q1;
    public float X = 1.0f;
    public int Y = 0;
    public boolean Y0 = false;
    public float Z0 = 0.0f;
    public float a1 = 0.0f;
    public float b1 = 0.0f;
    public float c1 = 0.0f;
    public float d1 = 1.0f;
    public float e1 = 1.0f;
    public float f1 = Float.NaN;
    public float g1 = Float.NaN;
    public float h1 = 0.0f;
    public float i1 = 0.0f;
    public float j1 = 0.0f;
    public int l1 = 0;
    public float r1 = Float.NaN;
    public float s1 = Float.NaN;
    public int t1 = -1;
    public LinkedHashMap<String, NT> u1 = new LinkedHashMap<>();
    public int v1 = 0;
    public double[] w1 = new double[18];
    public double[] x1 = new double[18];

    public void e(HashMap<String, AbstractC4678Xa2> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            AbstractC4678Xa2 abstractC4678Xa2 = hashMap.get(str);
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.b1)) {
                        f2 = this.b1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.c1)) {
                        f2 = this.c1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.a1)) {
                        f2 = this.a1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.h1)) {
                        f2 = this.h1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.i1)) {
                        f2 = this.i1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.j1)) {
                        f2 = this.j1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.s1)) {
                        f2 = this.s1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.f1)) {
                        f2 = this.f1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case '\b':
                    if (!Float.isNaN(this.g1)) {
                        f2 = this.g1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.d1)) {
                        f = this.d1;
                    }
                    abstractC4678Xa2.g(i, f);
                    break;
                case '\n':
                    if (!Float.isNaN(this.e1)) {
                        f = this.e1;
                    }
                    abstractC4678Xa2.g(i, f);
                    break;
                case 11:
                    if (!Float.isNaN(this.X)) {
                        f = this.X;
                    }
                    abstractC4678Xa2.g(i, f);
                    break;
                case '\f':
                    if (!Float.isNaN(this.r1)) {
                        f2 = this.r1;
                    }
                    abstractC4678Xa2.g(i, f2);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.u1.containsKey(str2)) {
                            NT nt = this.u1.get(str2);
                            if (abstractC4678Xa2 instanceof AbstractC4678Xa2.c) {
                                ((AbstractC4678Xa2.c) abstractC4678Xa2).k(i, nt);
                                break;
                            } else {
                                C5521cE2.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + nt.n() + abstractC4678Xa2);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        C5521cE2.f("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void g(C10054ul1 c10054ul1) {
        float g;
        this.Z = c10054ul1.B();
        if (c10054ul1.B() != 4) {
            g = 0.0f;
        } else {
            g = c10054ul1.g();
        }
        this.X = g;
        this.Y0 = false;
        this.a1 = c10054ul1.t();
        this.b1 = c10054ul1.r();
        this.c1 = c10054ul1.s();
        this.d1 = c10054ul1.u();
        this.e1 = c10054ul1.v();
        this.f1 = c10054ul1.o();
        this.g1 = c10054ul1.p();
        this.h1 = c10054ul1.x();
        this.i1 = c10054ul1.y();
        this.j1 = c10054ul1.z();
        for (String str : c10054ul1.j()) {
            NT i = c10054ul1.i(str);
            if (i != null && i.q()) {
                this.u1.put(str, i);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(C4329Tk1 c4329Tk1) {
        return Float.compare(this.m1, c4329Tk1.m1);
    }

    public final boolean i(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) <= 1.0E-6f) {
                return false;
            }
            return true;
        } else if (Float.isNaN(f) == Float.isNaN(f2)) {
            return false;
        } else {
            return true;
        }
    }

    public void j(C4329Tk1 c4329Tk1, HashSet<String> hashSet) {
        if (i(this.X, c4329Tk1.X)) {
            hashSet.add("alpha");
        }
        if (i(this.Z0, c4329Tk1.Z0)) {
            hashSet.add("translationZ");
        }
        int i = this.Z;
        int i2 = c4329Tk1.Z;
        if (i != i2 && this.Y == 0 && (i == 4 || i2 == 4)) {
            hashSet.add("alpha");
        }
        if (i(this.a1, c4329Tk1.a1)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.r1) || !Float.isNaN(c4329Tk1.r1)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.s1) || !Float.isNaN(c4329Tk1.s1)) {
            hashSet.add("progress");
        }
        if (i(this.b1, c4329Tk1.b1)) {
            hashSet.add("rotationX");
        }
        if (i(this.c1, c4329Tk1.c1)) {
            hashSet.add("rotationY");
        }
        if (i(this.f1, c4329Tk1.f1)) {
            hashSet.add("pivotX");
        }
        if (i(this.g1, c4329Tk1.g1)) {
            hashSet.add("pivotY");
        }
        if (i(this.d1, c4329Tk1.d1)) {
            hashSet.add("scaleX");
        }
        if (i(this.e1, c4329Tk1.e1)) {
            hashSet.add("scaleY");
        }
        if (i(this.h1, c4329Tk1.h1)) {
            hashSet.add("translationX");
        }
        if (i(this.i1, c4329Tk1.i1)) {
            hashSet.add("translationY");
        }
        if (i(this.j1, c4329Tk1.j1)) {
            hashSet.add("translationZ");
        }
        if (i(this.Z0, c4329Tk1.Z0)) {
            hashSet.add("elevation");
        }
    }

    public void l(C4329Tk1 c4329Tk1, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | i(this.m1, c4329Tk1.m1);
        zArr[1] = zArr[1] | i(this.n1, c4329Tk1.n1);
        zArr[2] = zArr[2] | i(this.o1, c4329Tk1.o1);
        zArr[3] = zArr[3] | i(this.p1, c4329Tk1.p1);
        zArr[4] = i(this.q1, c4329Tk1.q1) | zArr[4];
    }

    public void m(double[] dArr, int[] iArr) {
        int i = 0;
        float[] fArr = {this.m1, this.n1, this.o1, this.p1, this.q1, this.X, this.Z0, this.a1, this.b1, this.c1, this.d1, this.e1, this.f1, this.g1, this.h1, this.i1, this.j1, this.r1};
        for (int i2 : iArr) {
            if (i2 < 18) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public int n(String str, double[] dArr, int i) {
        NT nt = this.u1.get(str);
        if (nt.r() == 1) {
            dArr[i] = nt.n();
            return 1;
        }
        int r = nt.r();
        float[] fArr = new float[r];
        nt.o(fArr);
        int i2 = 0;
        while (i2 < r) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return r;
    }

    public int o(String str) {
        return this.u1.get(str).r();
    }

    public boolean p(String str) {
        return this.u1.containsKey(str);
    }

    public void q(float f, float f2, float f3, float f4) {
        this.n1 = f;
        this.o1 = f2;
        this.p1 = f3;
        this.q1 = f4;
    }

    public void r(C10054ul1 c10054ul1) {
        q(c10054ul1.E(), c10054ul1.F(), c10054ul1.D(), c10054ul1.k());
        g(c10054ul1);
    }

    public void s(C10704xP1 c10704xP1, C10054ul1 c10054ul1, int i, float f) {
        q(c10704xP1.b, c10704xP1.d, c10704xP1.b(), c10704xP1.a());
        g(c10054ul1);
        this.f1 = Float.NaN;
        this.g1 = Float.NaN;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.a1 = f + 90.0f;
            return;
        }
        this.a1 = f - 90.0f;
    }
}
