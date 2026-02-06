package o;

import android.graphics.Matrix;

/* renamed from: o.ud1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10022ud1 {
    public static final Matrix a(float f, float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f, f2, f3);
        return matrix;
    }

    public static /* synthetic */ Matrix b(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return a(f, f2, f3);
    }

    public static final Matrix c(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    public static /* synthetic */ Matrix d(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return c(f, f2);
    }

    public static final Matrix e(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    public static final Matrix f(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f, f2);
        return matrix;
    }

    public static /* synthetic */ Matrix g(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return f(f, f2);
    }

    public static final float[] h(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
