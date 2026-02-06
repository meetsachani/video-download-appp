package o;

import java.util.List;

/* renamed from: o.ov0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8629ov0 extends MX0<Float> {
    public C8629ov0(List<LX0<Float>> list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
    }

    public float s(LX0<Float> lx0, float f) {
        float f2;
        if (lx0.b != null && lx0.c != null) {
            O61<A> o61 = this.e;
            if (o61 != 0) {
                f2 = f;
                Float f3 = (Float) o61.b(lx0.g, lx0.h.floatValue(), lx0.b, lx0.c, f2, e(), f());
                if (f3 != null) {
                    return f3.floatValue();
                }
            } else {
                f2 = f;
            }
            return C4713Xj1.k(lx0.g(), lx0.d(), f2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // o.AbstractC7840ll
    /* renamed from: t */
    public Float i(LX0<Float> lx0, float f) {
        return Float.valueOf(s(lx0, f));
    }
}
