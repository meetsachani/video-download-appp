package o;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class G61 extends O61<PointF> {
    public final PointF d;

    public G61() {
        this.d = new PointF();
    }

    public PointF e(C9410s61<PointF> c9410s61) {
        T t = this.c;
        if (t != 0) {
            return (PointF) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // o.O61
    /* renamed from: f */
    public final PointF a(C9410s61<PointF> c9410s61) {
        this.d.set(C4713Xj1.k(c9410s61.g().x, c9410s61.b().x, c9410s61.c()), C4713Xj1.k(c9410s61.g().y, c9410s61.b().y, c9410s61.c()));
        PointF e = e(c9410s61);
        this.d.offset(e.x, e.y);
        return this.d;
    }

    public G61(PointF pointF) {
        super(pointF);
        this.d = new PointF();
    }
}
