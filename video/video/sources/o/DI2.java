package o;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class DI2 {
    public static final String b = "ViewUtilsApi19";
    public static boolean c = true;
    public static Method d = null;
    public static boolean e = false;
    public static Field f = null;
    public static boolean g = false;
    public static final int h = 12;
    public float[] a;

    /* loaded from: classes.dex */
    public static class a {
        public static float a(View view) {
            float transitionAlpha;
            transitionAlpha = view.getTransitionAlpha();
            return transitionAlpha;
        }

        public static void b(View view, float f) {
            view.setTransitionAlpha(f);
        }
    }

    public final void b() {
        if (!e) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i(b, "Failed to retrieve setFrame method", e2);
            }
            e = true;
        }
    }

    public float c(View view) {
        if (c) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    public void e(View view, Matrix matrix) {
        int i;
        if (matrix != null && !matrix.isIdentity()) {
            float[] fArr = this.a;
            if (fArr == null) {
                fArr = new float[9];
                this.a = fArr;
            }
            matrix.getValues(fArr);
            float f2 = fArr[3];
            float sqrt = (float) Math.sqrt(1.0f - (f2 * f2));
            if (fArr[0] < 0.0f) {
                i = -1;
            } else {
                i = 1;
            }
            float f3 = sqrt * i;
            float degrees = (float) Math.toDegrees(Math.atan2(f2, f3));
            float f4 = fArr[0] / f3;
            float f5 = fArr[4] / f3;
            float f6 = fArr[2];
            float f7 = fArr[5];
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setTranslationX(f6);
            view.setTranslationY(f7);
            view.setRotation(degrees);
            view.setScaleX(f4);
            view.setScaleY(f5);
            return;
        }
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
    }

    public void f(View view, int i, int i2, int i3, int i4) {
        b();
        Method method = d;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void g(View view, float f2) {
        if (c) {
            try {
                a.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f2);
    }

    public void h(View view, int i) {
        if (!g) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(b, "fetchViewFlagsField: ");
            }
            g = true;
        }
        Field field = f;
        if (field != null) {
            try {
                f.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void j(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            j(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public void a(View view) {
    }

    public void d(View view) {
    }
}
