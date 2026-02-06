package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: o.w61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10385w61 extends AbstractC10628x61<PointF> {
    public final PointF g;

    public C10385w61(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.g = new PointF();
    }

    @Override // o.AbstractC10628x61, o.O61
    public /* bridge */ /* synthetic */ Object a(C9410s61 c9410s61) {
        return super.a(c9410s61);
    }

    @Override // o.AbstractC10628x61
    /* renamed from: f */
    public PointF e(PointF pointF, PointF pointF2, float f) {
        this.g.set(C4713Xj1.k(pointF.x, pointF2.x, f), C4713Xj1.k(pointF.y, pointF2.y, f));
        return this.g;
    }

    public C10385w61(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.g = new PointF();
    }
}
