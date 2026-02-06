package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: o.kz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7655kz1 extends MX0<PointF> {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public C7412jz1 m;

    public C7655kz1(List<? extends LX0<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // o.AbstractC7840ll
    /* renamed from: r */
    public PointF i(LX0<PointF> lx0, float f) {
        float f2;
        C7412jz1 c7412jz1 = (C7412jz1) lx0;
        Path k = c7412jz1.k();
        O61<A> o61 = this.e;
        if (o61 != 0 && lx0.h != null) {
            f2 = f;
            PointF pointF = (PointF) o61.b(c7412jz1.g, c7412jz1.h.floatValue(), (PointF) c7412jz1.b, (PointF) c7412jz1.c, e(), f2, f());
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (k == null) {
            return lx0.b;
        }
        if (this.m != c7412jz1) {
            this.l.setPath(k, false);
            this.m = c7412jz1;
        }
        float length = this.l.getLength();
        float f3 = f2 * length;
        this.l.getPosTan(f3, this.j, this.k);
        PointF pointF2 = this.i;
        float[] fArr = this.j;
        pointF2.set(fArr[0], fArr[1]);
        if (f3 < 0.0f) {
            PointF pointF3 = this.i;
            float[] fArr2 = this.k;
            pointF3.offset(fArr2[0] * f3, fArr2[1] * f3);
        } else if (f3 > length) {
            PointF pointF4 = this.i;
            float[] fArr3 = this.k;
            float f4 = f3 - length;
            pointF4.offset(fArr3[0] * f4, fArr3[1] * f4);
        }
        return this.i;
    }
}
