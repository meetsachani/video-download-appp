package o;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import o.AbstractC6265fI2;

/* renamed from: o.Sk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4232Sk1 implements Comparable<C4232Sk1> {
    public static final int A1 = 1;
    public static final int B1 = 2;
    public static String[] C1 = {"position", "x", C5738d80.b, "width", "height", "pathRotate"};
    public static final String y1 = "MotionPaths";
    public static final boolean z1 = false;
    public int Z;
    public C6725h90 o1;
    public float q1;
    public float r1;
    public float s1;
    public float t1;
    public float u1;
    public float X = 0.0f;
    public int Y = 0;
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> Y0 = new LinkedHashMap<>();
    public int Z0 = 0;
    public double[] a1 = new double[18];
    public double[] b1 = new double[18];
    public float c1 = 1.0f;
    public boolean d1 = false;
    public float e1 = 0.0f;
    public float f1 = 0.0f;
    public float g1 = 0.0f;
    public float h1 = 1.0f;
    public float i1 = 1.0f;
    public float j1 = Float.NaN;
    public float k1 = Float.NaN;
    public float l1 = 0.0f;
    public float m1 = 0.0f;
    public float n1 = 0.0f;
    public int p1 = 0;
    public float v1 = Float.NaN;
    public float w1 = Float.NaN;
    public int x1 = -1;

    public void e(HashMap<String, AbstractC6265fI2> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            AbstractC6265fI2 abstractC6265fI2 = hashMap.get(str);
            if (abstractC6265fI2 != null) {
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
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals(AbstractC6818hX0.l)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals(AbstractC6818hX0.m)) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals(AbstractC6818hX0.i)) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = C8206nB.d;
                            break;
                        }
                        break;
                }
                float f = 1.0f;
                float f2 = 0.0f;
                switch (c) {
                    case 0:
                        if (!Float.isNaN(this.g1)) {
                            f2 = this.g1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case 1:
                        if (!Float.isNaN(this.X)) {
                            f2 = this.X;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case 2:
                        if (!Float.isNaN(this.l1)) {
                            f2 = this.l1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case 3:
                        if (!Float.isNaN(this.m1)) {
                            f2 = this.m1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case 4:
                        if (!Float.isNaN(this.n1)) {
                            f2 = this.n1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case 5:
                        if (!Float.isNaN(this.w1)) {
                            f2 = this.w1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case 6:
                        if (!Float.isNaN(this.h1)) {
                            f = this.h1;
                        }
                        abstractC6265fI2.g(i, f);
                        continue;
                    case 7:
                        if (!Float.isNaN(this.i1)) {
                            f = this.i1;
                        }
                        abstractC6265fI2.g(i, f);
                        continue;
                    case '\b':
                        if (!Float.isNaN(this.j1)) {
                            f2 = this.j1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case '\t':
                        if (!Float.isNaN(this.k1)) {
                            f2 = this.k1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case '\n':
                        if (!Float.isNaN(this.f1)) {
                            f2 = this.f1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case 11:
                        if (!Float.isNaN(this.e1)) {
                            f2 = this.e1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case '\f':
                        if (!Float.isNaN(this.v1)) {
                            f2 = this.v1;
                        }
                        abstractC6265fI2.g(i, f2);
                        continue;
                    case '\r':
                        if (!Float.isNaN(this.c1)) {
                            f = this.c1;
                        }
                        abstractC6265fI2.g(i, f);
                        continue;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.Y0.containsKey(str2)) {
                                androidx.constraintlayout.widget.a aVar = this.Y0.get(str2);
                                if (abstractC6265fI2 instanceof AbstractC6265fI2.b) {
                                    ((AbstractC6265fI2.b) abstractC6265fI2).n(i, aVar);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + aVar.k() + abstractC6265fI2);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                            continue;
                        }
                }
            }
        }
    }

    public void g(View view) {
        float alpha;
        this.Z = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.c1 = alpha;
        this.d1 = false;
        this.e1 = view.getElevation();
        this.f1 = view.getRotation();
        this.g1 = view.getRotationX();
        this.X = view.getRotationY();
        this.h1 = view.getScaleX();
        this.i1 = view.getScaleY();
        this.j1 = view.getPivotX();
        this.k1 = view.getPivotY();
        this.l1 = view.getTranslationX();
        this.m1 = view.getTranslationY();
        this.n1 = view.getTranslationZ();
    }

    public void h(e.a aVar) {
        float f;
        e.d dVar = aVar.c;
        int i = dVar.c;
        this.Y = i;
        int i2 = dVar.b;
        this.Z = i2;
        if (i2 != 0 && i == 0) {
            f = 0.0f;
        } else {
            f = dVar.d;
        }
        this.c1 = f;
        e.C0020e c0020e = aVar.f;
        this.d1 = c0020e.m;
        this.e1 = c0020e.n;
        this.f1 = c0020e.b;
        this.g1 = c0020e.c;
        this.X = c0020e.d;
        this.h1 = c0020e.e;
        this.i1 = c0020e.f;
        this.j1 = c0020e.g;
        this.k1 = c0020e.h;
        this.l1 = c0020e.j;
        this.m1 = c0020e.k;
        this.n1 = c0020e.l;
        this.o1 = C6725h90.c(aVar.d.d);
        e.c cVar = aVar.d;
        this.v1 = cVar.i;
        this.p1 = cVar.f;
        this.x1 = cVar.b;
        this.w1 = aVar.c.e;
        for (String str : aVar.g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.g.get(str);
            if (aVar2.n()) {
                this.Y0.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(C4232Sk1 c4232Sk1) {
        return Float.compare(this.q1, c4232Sk1.q1);
    }

    public final boolean j(float f, float f2) {
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

    public void l(C4232Sk1 c4232Sk1, HashSet<String> hashSet) {
        if (j(this.c1, c4232Sk1.c1)) {
            hashSet.add("alpha");
        }
        if (j(this.e1, c4232Sk1.e1)) {
            hashSet.add("elevation");
        }
        int i = this.Z;
        int i2 = c4232Sk1.Z;
        if (i != i2 && this.Y == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (j(this.f1, c4232Sk1.f1)) {
            hashSet.add(AbstractC6818hX0.i);
        }
        if (!Float.isNaN(this.v1) || !Float.isNaN(c4232Sk1.v1)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.w1) || !Float.isNaN(c4232Sk1.w1)) {
            hashSet.add("progress");
        }
        if (j(this.g1, c4232Sk1.g1)) {
            hashSet.add("rotationX");
        }
        if (j(this.X, c4232Sk1.X)) {
            hashSet.add("rotationY");
        }
        if (j(this.j1, c4232Sk1.j1)) {
            hashSet.add(AbstractC6818hX0.l);
        }
        if (j(this.k1, c4232Sk1.k1)) {
            hashSet.add(AbstractC6818hX0.m);
        }
        if (j(this.h1, c4232Sk1.h1)) {
            hashSet.add("scaleX");
        }
        if (j(this.i1, c4232Sk1.i1)) {
            hashSet.add("scaleY");
        }
        if (j(this.l1, c4232Sk1.l1)) {
            hashSet.add("translationX");
        }
        if (j(this.m1, c4232Sk1.m1)) {
            hashSet.add("translationY");
        }
        if (j(this.n1, c4232Sk1.n1)) {
            hashSet.add("translationZ");
        }
    }

    public void m(C4232Sk1 c4232Sk1, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | j(this.q1, c4232Sk1.q1);
        zArr[1] = zArr[1] | j(this.r1, c4232Sk1.r1);
        zArr[2] = zArr[2] | j(this.s1, c4232Sk1.s1);
        zArr[3] = zArr[3] | j(this.t1, c4232Sk1.t1);
        zArr[4] = j(this.u1, c4232Sk1.u1) | zArr[4];
    }

    public void n(double[] dArr, int[] iArr) {
        int i = 0;
        float[] fArr = {this.q1, this.r1, this.s1, this.t1, this.u1, this.c1, this.e1, this.f1, this.g1, this.X, this.h1, this.i1, this.j1, this.k1, this.l1, this.m1, this.n1, this.v1};
        for (int i2 : iArr) {
            if (i2 < 18) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public int o(String str, double[] dArr, int i) {
        androidx.constraintlayout.widget.a aVar = this.Y0.get(str);
        if (aVar.p() == 1) {
            dArr[i] = aVar.k();
            return 1;
        }
        int p = aVar.p();
        float[] fArr = new float[p];
        aVar.l(fArr);
        int i2 = 0;
        while (i2 < p) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return p;
    }

    public int p(String str) {
        return this.Y0.get(str).p();
    }

    public boolean q(String str) {
        return this.Y0.containsKey(str);
    }

    public void r(float f, float f2, float f3, float f4) {
        this.r1 = f;
        this.s1 = f2;
        this.t1 = f3;
        this.u1 = f4;
    }

    public void s(Rect rect, View view, int i, float f) {
        r(rect.left, rect.top, rect.width(), rect.height());
        g(view);
        this.j1 = Float.NaN;
        this.k1 = Float.NaN;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f1 = f + 90.0f;
            return;
        }
        this.f1 = f - 90.0f;
    }

    public void t(Rect rect, androidx.constraintlayout.widget.e eVar, int i, int i2) {
        r(rect.left, rect.top, rect.width(), rect.height());
        h(eVar.q0(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f1 + 90.0f;
            this.f1 = f;
            if (f > 180.0f) {
                this.f1 = f - 360.0f;
                return;
            }
            return;
        }
        this.f1 -= 90.0f;
    }

    public void u(View view) {
        r(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        g(view);
    }
}
