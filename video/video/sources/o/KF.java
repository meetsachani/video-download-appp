package o;

import java.util.List;

/* loaded from: classes.dex */
public class KF extends MX0<Integer> {
    public KF(List<LX0<Integer>> list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
    }

    public int s(LX0<Integer> lx0, float f) {
        float f2;
        Float f3;
        if (lx0.b != null && lx0.c != null) {
            O61<A> o61 = this.e;
            if (o61 != 0 && (f3 = lx0.h) != null) {
                f2 = f;
                Integer num = (Integer) o61.b(lx0.g, f3.floatValue(), lx0.b, lx0.c, f2, e(), f());
                if (num != null) {
                    return num.intValue();
                }
            } else {
                f2 = f;
            }
            return AC0.c(C4713Xj1.c(f2, 0.0f, 1.0f), lx0.b.intValue(), lx0.c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // o.AbstractC7840ll
    /* renamed from: t */
    public Integer i(LX0<Integer> lx0, float f) {
        return Integer.valueOf(s(lx0, f));
    }
}
