package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import java.util.Locale;

/* renamed from: o.bs2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5433bs2 {
    public static final RectF a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static int A(int i) {
        return ((i % 360) + 360) % 360;
    }

    public static Matrix a(int i, int i2, int i3) {
        Matrix matrix = new Matrix();
        float f = i2;
        float f2 = i3;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        RectF rectF2 = a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
        switch (i) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f2, f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f2, f);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f2, f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f2, f);
                break;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static Matrix b(Rect rect) {
        return c(new RectF(rect));
    }

    public static Matrix c(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix d(RectF rectF, RectF rectF2, int i) {
        return e(rectF, rectF2, i, false);
    }

    public static Matrix e(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(c(rectF2));
        return matrix;
    }

    public static Size f(Rect rect, int i) {
        return s(m(rect), i);
    }

    public static boolean g(Rect rect, Size size) {
        if (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) {
            return false;
        }
        return true;
    }

    public static boolean h(int i) {
        if (i != 90 && i != 270) {
            if (i != 0 && i != 180) {
                throw new IllegalArgumentException("Invalid rotation degrees: " + i);
            }
            return false;
        }
        return true;
    }

    public static boolean i(Size size, Size size2) {
        return j(size, false, size2, false);
    }

    public static boolean j(Size size, boolean z, Size size2, boolean z2) {
        float width;
        float width2;
        float width3;
        float f;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z2) {
            width3 = size2.getWidth() / size2.getHeight();
            f = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f = width4;
        }
        if (width >= width3 && f >= width2) {
            return true;
        }
        return false;
    }

    public static float k(float f, float f2, float f3, float f4) {
        return Math.max(Math.max(f, f2), Math.max(f3, f4));
    }

    public static float l(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    public static Size m(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String n(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static float[] o(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    public static Size p(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static SizeF q(SizeF sizeF) {
        return new SizeF(sizeF.getHeight(), sizeF.getWidth());
    }

    public static RectF r(RectF rectF, int i) {
        boolean z;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Invalid rotation degrees: " + i);
        if (h(A(i))) {
            return new RectF(0.0f, 0.0f, rectF.height(), rectF.width());
        }
        return rectF;
    }

    public static Size s(Size size, int i) {
        boolean z;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Invalid rotation degrees: " + i);
        if (h(A(i))) {
            return p(size);
        }
        return size;
    }

    public static Rect t(Size size) {
        return u(size, 0, 0);
    }

    public static Rect u(Size size, int i, int i2) {
        return new Rect(i, i2, size.getWidth() + i, size.getHeight() + i2);
    }

    public static RectF v(Size size) {
        return w(size, 0, 0);
    }

    public static RectF w(Size size, int i, int i2) {
        return new RectF(i, i2, i + size.getWidth(), i2 + size.getHeight());
    }

    public static float[] x(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static Matrix y(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static RectF z(float[] fArr) {
        return new RectF(l(fArr[0], fArr[2], fArr[4], fArr[6]), l(fArr[1], fArr[3], fArr[5], fArr[7]), k(fArr[0], fArr[2], fArr[4], fArr[6]), k(fArr[1], fArr[3], fArr[5], fArr[7]));
    }
}
