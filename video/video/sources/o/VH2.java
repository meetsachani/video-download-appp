package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class VH2 {
    public static Map<androidx.camera.core.m, Rect> a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map<androidx.camera.core.m, AbstractC4008Qd2> map) {
        boolean z2;
        if (rect.width() > 0 && rect.height() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10907yF1.b(z2, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<androidx.camera.core.m, AbstractC4008Qd2> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().e().getWidth(), entry.getValue().e().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF g = g(rectF2, C10206vN0.i(i, rational), i2, z, i3, i);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, g);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((androidx.camera.core.m) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    public static RectF b(boolean z, int i, RectF rectF, RectF rectF2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (i == 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == 90 && z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && !z3) {
            if (i == 0 && z) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i == 270 && !z) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z4 && !z5) {
                if (i == 90 && !z) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i == 180 && z) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z6 && !z7) {
                    if (i == 180 && !z) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (i == 270 && z) {
                        z9 = true;
                    }
                    if (!z8 && !z9) {
                        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i);
                    }
                    return c(d(rectF2, rectF.centerY()), rectF.centerX());
                }
                return d(rectF2, rectF.centerY());
            }
            return c(rectF2, rectF.centerX());
        }
        return rectF2;
    }

    public static RectF c(RectF rectF, float f) {
        return new RectF(e(rectF.right, f), rectF.top, e(rectF.left, f), rectF.bottom);
    }

    public static RectF d(RectF rectF, float f) {
        return new RectF(rectF.left, f(rectF.bottom, f), rectF.right, f(rectF.top, f));
    }

    public static float e(float f, float f2) {
        return (f2 + f2) - f;
    }

    public static float f(float f, float f2) {
        return (f2 + f2) - f;
    }

    public static RectF g(RectF rectF, Rational rational, int i, boolean z, int i2, int i3) {
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
                } else {
                    throw new IllegalStateException("Unexpected scale type: " + i);
                }
            } else {
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
            }
        } else {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return b(h(z, i2), i3, rectF, rectF3);
    }

    public static boolean h(boolean z, int i) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        return z ^ z2;
    }
}
