package o;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: o.Tr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4358Tr2 {
    public static void a(Matrix matrix, float f, float f2, float f3, float f4, float f5) {
        if (f3 != 0.0f) {
            matrix.preRotate(f3);
        }
        if (f2 != 0.0f) {
            d(matrix, f5);
        }
        if (f != 0.0f) {
            c(matrix, f4);
        }
    }

    public static void b(Matrix matrix, PointF pointF, PointF pointF2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        matrix.reset();
        if (pointF2 != null) {
            float f8 = pointF2.x;
            if (f8 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f8, pointF2.y);
            }
        }
        if (f5 != 0.0f) {
            matrix.preRotate(f5);
        }
        if (f4 != 0.0f) {
            d(matrix, f7);
        }
        if (f3 != 0.0f) {
            c(matrix, f6);
        }
        if (f != 1.0f || f2 != 1.0f) {
            matrix.preScale(f, f2);
        }
        if (pointF != null) {
            float f9 = pointF.x;
            if (f9 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f9, -pointF.y);
            }
        }
    }

    public static void c(Matrix matrix, float f) {
        matrix.preScale(1.0f, f);
    }

    public static void d(Matrix matrix, float f) {
        matrix.preScale(f, 1.0f);
    }

    public static boolean e(Float f, Float f2, Float f3) {
        if (f == null || f.floatValue() == 0.0f) {
            if (f2 == null || f2.floatValue() == 0.0f) {
                if (f3 != null && f3.floatValue() != 0.0f) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
