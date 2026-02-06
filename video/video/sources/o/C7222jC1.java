package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.jC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7222jC1 extends AbstractC9139qz1 {
    public Path a;
    public final Path b;
    public final Matrix c;

    public C7222jC1() {
        Path path = new Path();
        this.b = path;
        this.c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.a = path;
    }

    public static float b(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    @Override // o.AbstractC9139qz1
    public Path a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = b(f5, f6);
        double atan2 = Math.atan2(f6, f5);
        this.c.setScale(b, b);
        this.c.postRotate((float) Math.toDegrees(atan2));
        this.c.postTranslate(f, f2);
        Path path = new Path();
        this.b.transform(this.c, path);
        return path;
    }

    public Path c() {
        return this.a;
    }

    public void d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / b(f5, f6);
        this.c.postScale(b, b);
        this.c.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.c, this.b);
        this.a = path;
    }

    public C7222jC1(Context context, AttributeSet attributeSet) {
        this.b = new Path();
        this.c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.k);
        try {
            String m = C5206aw2.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m != null) {
                d(C9624sz1.e(m));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public C7222jC1(Path path) {
        this.b = new Path();
        this.c = new Matrix();
        d(path);
    }
}
