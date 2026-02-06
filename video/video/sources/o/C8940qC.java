package o;

import android.graphics.Canvas;
import android.graphics.PointF;

/* renamed from: o.qC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8940qC extends HE0 {
    public PointF b = new PointF();
    public float c;

    @Override // o.HE0
    public void a(Canvas canvas) {
        PointF pointF = this.b;
        canvas.drawCircle(pointF.x, pointF.y, this.c, this.a);
    }

    public void f(float f, float f2) {
        this.b.set(f, f2);
    }

    public void g(float f) {
        this.c = f;
    }
}
