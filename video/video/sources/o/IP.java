package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class IP {
    public static final String b = "CoordinateTransform";
    public static final String c = "The source viewport (%s) does not match the target viewport (%s). Please make sure they are associated with the same Viewport.";
    public final Matrix a;

    public IP(C6422fx1 c6422fx1, C6422fx1 c6422fx12) {
        if (!C5433bs2.i(c6422fx1.b(), c6422fx12.b())) {
            C7433k41.p(b, String.format(c, c6422fx1.b(), c6422fx12.b()));
        }
        Matrix matrix = new Matrix();
        this.a = matrix;
        C10907yF1.o(c6422fx1.a().invert(matrix), "The source transform cannot be inverted");
        matrix.postConcat(c6422fx12.a());
    }

    public void a(PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        this.a.mapPoints(fArr);
        pointF.x = fArr[0];
        pointF.y = fArr[1];
    }

    public void b(float[] fArr) {
        this.a.mapPoints(fArr);
    }

    public void c(RectF rectF) {
        this.a.mapRect(rectF);
    }

    public void d(Matrix matrix) {
        matrix.set(this.a);
    }
}
