package o;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class HI2 extends DI2 {
    public static boolean i = true;
    public static boolean j = true;
    public static boolean k = true;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // o.DI2
    public void e(View view, Matrix matrix) {
        if (i) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    @Override // o.DI2
    public void i(View view, Matrix matrix) {
        if (j) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    @Override // o.DI2
    public void j(View view, Matrix matrix) {
        if (k) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
