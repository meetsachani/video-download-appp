package o;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: o.jz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7412jz1 extends LX0<PointF> {
    public Path s;
    public final LX0<PointF> t;

    public C7412jz1(C10624x51 c10624x51, LX0<PointF> lx0) {
        super(c10624x51, lx0.b, lx0.c, lx0.d, lx0.e, lx0.f, lx0.g, lx0.h);
        this.t = lx0;
        j();
    }

    public void j() {
        boolean z;
        T t;
        T t2;
        T t3 = this.c;
        if (t3 != 0 && (t2 = this.b) != 0 && ((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z = true;
        } else {
            z = false;
        }
        T t4 = this.b;
        if (t4 != 0 && (t = this.c) != 0 && !z) {
            LX0<PointF> lx0 = this.t;
            this.s = C6006eE2.d((PointF) t4, (PointF) t, lx0.f536o, lx0.p);
        }
    }

    public Path k() {
        return this.s;
    }
}
