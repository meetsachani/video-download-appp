package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;

/* renamed from: o.kH1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7485kH1 extends AbstractC8825pj1 {
    public static final PointF d = new PointF(2.0f, 2.0f);
    public final androidx.camera.view.b b;
    public Matrix c;

    public C7485kH1(androidx.camera.view.b bVar) {
        this.b = bVar;
    }

    @Override // o.AbstractC8825pj1
    public PointF a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            try {
                Matrix matrix = this.c;
                if (matrix == null) {
                    return d;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Size size, int i) {
        C5901do2.c();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0) {
                    this.c = this.b.c(size, i);
                    return;
                }
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
