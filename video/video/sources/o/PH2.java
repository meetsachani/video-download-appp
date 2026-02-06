package o;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class PH2 extends AbstractC8779pX0 {
    public static final String i = "ViewOscillator";

    /* loaded from: classes.dex */
    public static class a extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends PH2 {
        public float[] j = new float[1];
        public androidx.constraintlayout.widget.a k;

        @Override // o.AbstractC8779pX0
        public void e(Object obj) {
            this.k = (androidx.constraintlayout.widget.a) obj;
        }

        @Override // o.PH2
        public void m(View view, float f) {
            this.j[0] = a(f);
            C9008qT.b(this.k, view, this.j);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends PH2 {
        public boolean j = false;

        @Override // o.PH2
        public void m(View view, float f) {
            Method method;
            if (view instanceof C7114il1) {
                ((C7114il1) view).setProgress(a(f));
            } else if (!this.j) {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.j = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e(PH2.i, "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e(PH2.i, "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class g extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class h extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class i extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class j extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class k extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class l extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* loaded from: classes.dex */
    public static class m extends PH2 {
        @Override // o.PH2
        public void m(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public static PH2 l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals(AbstractC6818hX0.i)) {
                    c2 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = C8206nB.d;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new f();
            case '\n':
                return new c();
            case 11:
                return new d();
            case '\f':
                return new a();
            case '\r':
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float f2);

    /* loaded from: classes.dex */
    public static class d extends PH2 {
        public void n(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // o.PH2
        public void m(View view, float f) {
        }
    }
}
