package o;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.fI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6265fI2 extends AbstractC4678Xa2 {
    public static final String g = "ViewSpline";

    /* renamed from: o.fI2$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* renamed from: o.fI2$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC6265fI2 {
        public String h;
        public SparseArray<androidx.constraintlayout.widget.a> i;
        public float[] j;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.h = str.split(",")[1];
            this.i = sparseArray;
        }

        @Override // o.AbstractC4678Xa2
        public void g(int i, float f) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // o.AbstractC4678Xa2
        public void j(int i) {
            float[] fArr;
            int size = this.i.size();
            int p = this.i.valueAt(0).p();
            double[] dArr = new double[size];
            this.j = new float[p];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, p);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = this.i.keyAt(i2) * 0.01d;
                this.i.valueAt(i2).l(this.j);
                int i3 = 0;
                while (true) {
                    if (i3 < this.j.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = AS.a(i, dArr, dArr2);
        }

        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            this.a.e(f, this.j);
            C9008qT.b(this.i.valueAt(0), view, this.j);
        }

        public void n(int i, androidx.constraintlayout.widget.a aVar) {
            this.i.append(i, aVar);
        }
    }

    /* renamed from: o.fI2$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* renamed from: o.fI2$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    /* renamed from: o.fI2$f */
    /* loaded from: classes.dex */
    public static class f extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    /* renamed from: o.fI2$g */
    /* loaded from: classes.dex */
    public static class g extends AbstractC6265fI2 {
        public boolean h = false;

        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            Method method;
            if (view instanceof C7114il1) {
                ((C7114il1) view).setProgress(a(f));
            } else if (!this.h) {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.h = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e(AbstractC6265fI2.g, "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e(AbstractC6265fI2.g, "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: o.fI2$h */
    /* loaded from: classes.dex */
    public static class h extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* renamed from: o.fI2$i */
    /* loaded from: classes.dex */
    public static class i extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* renamed from: o.fI2$j */
    /* loaded from: classes.dex */
    public static class j extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* renamed from: o.fI2$k */
    /* loaded from: classes.dex */
    public static class k extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* renamed from: o.fI2$l */
    /* loaded from: classes.dex */
    public static class l extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* renamed from: o.fI2$m */
    /* loaded from: classes.dex */
    public static class m extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* renamed from: o.fI2$n */
    /* loaded from: classes.dex */
    public static class n extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* renamed from: o.fI2$o */
    /* loaded from: classes.dex */
    public static class o extends AbstractC6265fI2 {
        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public static AbstractC6265fI2 k(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static AbstractC6265fI2 l(String str) {
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
            case -797520672:
                if (str.equals(AbstractC6818hX0.t)) {
                    c2 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals(AbstractC6818hX0.l)) {
                    c2 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(AbstractC6818hX0.m)) {
                    c2 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(AbstractC6818hX0.i)) {
                    c2 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = C8206nB.d;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = 15;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case '\b':
                return new a();
            case '\t':
                return new e();
            case '\n':
                return new f();
            case 11:
                return new h();
            case '\f':
                return new c();
            case '\r':
                return new d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float f2);

    /* renamed from: o.fI2$d */
    /* loaded from: classes.dex */
    public static class d extends AbstractC6265fI2 {
        public void n(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // o.AbstractC6265fI2
        public void m(View view, float f) {
        }
    }
}
