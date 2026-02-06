package o;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: o.Ya2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4775Ya2 extends AbstractC7840ll<PointF, PointF> {
    public final PointF i;
    public final PointF j;
    public final AbstractC7840ll<Float, Float> k;
    public final AbstractC7840ll<Float, Float> l;
    public O61<Float> m;
    public O61<Float> n;

    public C4775Ya2(AbstractC7840ll<Float, Float> abstractC7840ll, AbstractC7840ll<Float, Float> abstractC7840ll2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = abstractC7840ll;
        this.l = abstractC7840ll2;
        n(f());
    }

    @Override // o.AbstractC7840ll
    public void n(float f) {
        this.k.n(f);
        this.l.n(f);
        this.i.set(this.k.h().floatValue(), this.l.h().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    @Override // o.AbstractC7840ll
    /* renamed from: r */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // o.AbstractC7840ll
    /* renamed from: s */
    public PointF i(LX0<PointF> lx0, float f) {
        Float f2;
        LX0<Float> b;
        float floatValue;
        LX0<Float> b2;
        float floatValue2;
        Float f3 = null;
        if (this.m != null && (b2 = this.k.b()) != null) {
            Float f4 = b2.h;
            O61<Float> o61 = this.m;
            float f5 = b2.g;
            if (f4 == null) {
                floatValue2 = f5;
            } else {
                floatValue2 = f4.floatValue();
            }
            f2 = o61.b(f5, floatValue2, b2.b, b2.c, this.k.d(), this.k.e(), this.k.f());
        } else {
            f2 = null;
        }
        if (this.n != null && (b = this.l.b()) != null) {
            Float f6 = b.h;
            O61<Float> o612 = this.n;
            float f7 = b.g;
            if (f6 == null) {
                floatValue = f7;
            } else {
                floatValue = f6.floatValue();
            }
            f3 = o612.b(f7, floatValue, b.b, b.c, this.l.d(), this.l.e(), this.l.f());
        }
        if (f2 == null) {
            this.j.set(this.i.x, 0.0f);
        } else {
            this.j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.j;
    }

    public void t(O61<Float> o61) {
        O61<Float> o612 = this.m;
        if (o612 != null) {
            o612.c(null);
        }
        this.m = o61;
        if (o61 != null) {
            o61.c(this);
        }
    }

    public void u(O61<Float> o61) {
        O61<Float> o612 = this.n;
        if (o612 != null) {
            o612.c(null);
        }
        this.n = o61;
        if (o61 != null) {
            o61.c(this);
        }
    }
}
