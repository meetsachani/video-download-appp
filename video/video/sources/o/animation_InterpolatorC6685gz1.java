package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: o.gz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class animation.InterpolatorC6685gz1 implements Interpolator {
    public static final float c = 0.002f;
    public final float[] a;
    public final float[] b;

    public animation.InterpolatorC6685gz1(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        this.a = new float[i2];
        this.b = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / i, fArr, null);
            this.a[i3] = fArr[0];
            this.b[i3] = fArr[1];
        }
    }

    public static Path a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    public static Path b(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.a;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.b[i];
        }
        float[] fArr2 = this.b;
        float f5 = fArr2[i];
        return f5 + (((f - f3) / f4) * (fArr2[length] - f5));
    }

    public animation.InterpolatorC6685gz1(float f, float f2) {
        this(b(f, f2));
    }

    public animation.InterpolatorC6685gz1(float f, float f2, float f3, float f4) {
        this(a(f, f2, f3, f4));
    }
}
