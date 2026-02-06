package o;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.kI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7490kI2 extends AbstractC2977Fo2 {
    public static final String p = "ViewTimeCycle";

    /* renamed from: o.kI2$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setAlpha(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC7490kI2 {
        public String q;
        public SparseArray<androidx.constraintlayout.widget.a> r;
        public SparseArray<float[]> s = new SparseArray<>();
        public float[] t;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.q = str.split(",")[1];
            this.r = sparseArray;
        }

        @Override // o.AbstractC2977Fo2
        public void c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // o.AbstractC2977Fo2
        public void f(int i) {
            float[] fArr;
            int size = this.r.size();
            int p = this.r.valueAt(0).p();
            double[] dArr = new double[size];
            int i2 = p + 2;
            this.t = new float[i2];
            this.g = new float[p];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.r.keyAt(i3);
                float[] valueAt = this.s.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                this.r.valueAt(i3).l(this.t);
                int i4 = 0;
                while (true) {
                    if (i4 < this.t.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[p] = valueAt[0];
                dArr3[p + 1] = valueAt[1];
            }
            this.a = AS.a(i, dArr, dArr2);
        }

        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            boolean z;
            this.a.e(f, this.t);
            float[] fArr = this.t;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float a = c8049mX0.a(view, this.q, 0);
                this.j = a;
                if (Float.isNaN(a)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float) ((this.j + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.j = f4;
            this.i = j;
            float a2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.g;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.h;
                float f5 = this.t[i];
                if (f5 != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.h = z2 | z;
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            C9008qT.b(this.r.valueAt(0), view, this.g);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }

        public void k(int i, androidx.constraintlayout.widget.a aVar, float f, int i2, float f2) {
            this.r.append(i, aVar);
            this.s.append(i, new float[]{f, f2});
            this.b = Math.max(this.b, i2);
        }
    }

    /* renamed from: o.kI2$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setElevation(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$d */
    /* loaded from: classes.dex */
    public static class d extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            return this.h;
        }

        public boolean k(View view, C8049mX0 c8049mX0, float f, long j, double d, double d2) {
            view.setRotation(g(f, j, view, c8049mX0) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.h;
        }
    }

    /* renamed from: o.kI2$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC7490kI2 {
        public boolean q = false;

        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            e eVar;
            Method method;
            if (view instanceof C7114il1) {
                eVar = this;
                ((C7114il1) view).setProgress(g(f, j, view, c8049mX0));
            } else {
                eVar = this;
                if (eVar.q) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    eVar.q = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(eVar.g(f, j, view, c8049mX0)));
                    } catch (IllegalAccessException e) {
                        Log.e(AbstractC7490kI2.p, "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e(AbstractC7490kI2.p, "unable to setProgress", e2);
                    }
                }
            }
            return eVar.h;
        }
    }

    /* renamed from: o.kI2$f */
    /* loaded from: classes.dex */
    public static class f extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setRotation(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$g */
    /* loaded from: classes.dex */
    public static class g extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setRotationX(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$h */
    /* loaded from: classes.dex */
    public static class h extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setRotationY(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$i */
    /* loaded from: classes.dex */
    public static class i extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setScaleX(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$j */
    /* loaded from: classes.dex */
    public static class j extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setScaleY(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$k */
    /* loaded from: classes.dex */
    public static class k extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setTranslationX(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$l */
    /* loaded from: classes.dex */
    public static class l extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setTranslationY(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    /* renamed from: o.kI2$m */
    /* loaded from: classes.dex */
    public static class m extends AbstractC7490kI2 {
        @Override // o.AbstractC7490kI2
        public boolean j(View view, float f, long j, C8049mX0 c8049mX0) {
            view.setTranslationZ(g(f, j, view, c8049mX0));
            return this.h;
        }
    }

    public static AbstractC7490kI2 h(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static AbstractC7490kI2 i(String str, long j2) {
        AbstractC7490kI2 gVar;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(AbstractC6818hX0.i)) {
                    c2 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                gVar = new g();
                break;
            case 1:
                gVar = new h();
                break;
            case 2:
                gVar = new k();
                break;
            case 3:
                gVar = new l();
                break;
            case 4:
                gVar = new m();
                break;
            case 5:
                gVar = new e();
                break;
            case 6:
                gVar = new i();
                break;
            case 7:
                gVar = new j();
                break;
            case '\b':
                gVar = new f();
                break;
            case '\t':
                gVar = new c();
                break;
            case '\n':
                gVar = new d();
                break;
            case 11:
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.d(j2);
        return gVar;
    }

    public float g(float f2, long j2, View view, C8049mX0 c8049mX0) {
        boolean z;
        this.a.e(f2, this.g);
        float[] fArr = this.g;
        float f3 = fArr[1];
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float a2 = c8049mX0.a(view, this.f, 0);
            this.j = a2;
            if (Float.isNaN(a2)) {
                this.j = 0.0f;
            }
        }
        float f4 = (float) ((this.j + (((j2 - this.i) * 1.0E-9d) * f3)) % 1.0d);
        this.j = f4;
        c8049mX0.b(view, this.f, 0, f4);
        this.i = j2;
        float f5 = this.g[0];
        float a3 = (a(this.j) * f5) + this.g[2];
        if (f5 == 0.0f && i2 == 0) {
            z = false;
        } else {
            z = true;
        }
        this.h = z;
        return a3;
    }

    public abstract boolean j(View view, float f2, long j2, C8049mX0 c8049mX0);
}
