package o;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class TD1 extends MX0<PointF> {
    public final PointF i;

    public TD1(List<LX0<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // o.AbstractC7840ll
    /* renamed from: r */
    public PointF i(LX0<PointF> lx0, float f) {
        return j(lx0, f, f, f);
    }

    @Override // o.AbstractC7840ll
    /* renamed from: s */
    public PointF j(LX0<PointF> lx0, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = lx0.b;
        if (pointF3 != null && (pointF = lx0.c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            O61<A> o61 = this.e;
            if (o61 != 0 && (pointF2 = (PointF) o61.b(lx0.g, lx0.h.floatValue(), pointF4, pointF5, f, e(), f())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.i;
            float f4 = pointF4.x;
            float f5 = f4 + (f2 * (pointF5.x - f4));
            float f6 = pointF4.y;
            pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
            return this.i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
