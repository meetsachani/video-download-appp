package o;

import android.graphics.Canvas;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public class RZ0 extends HE0 {
    public PointF b;
    public PointF c;

    @Override // o.HE0
    public void a(Canvas canvas) {
        PointF pointF = this.b;
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = this.c;
        canvas.drawLine(f, f2, pointF2.x, pointF2.y, this.a);
    }

    public PointF f() {
        return this.b;
    }

    public PointF g() {
        return this.c;
    }

    public void h(PointF pointF) {
        this.b = pointF;
    }

    public void i(PointF pointF) {
        this.c = pointF;
    }
}
