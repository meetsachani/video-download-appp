package o;

import java.util.List;

/* loaded from: classes.dex */
public class NR0 extends MX0<Integer> {
    public NR0(List<LX0<Integer>> list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
    }

    public int s(LX0<Integer> lx0, float f) {
        int e;
        float f2;
        if (lx0.b != null) {
            if (lx0.c == null) {
                e = lx0.h();
            } else {
                e = lx0.e();
            }
            O61<A> o61 = this.e;
            if (o61 != 0) {
                f2 = f;
                Integer num = (Integer) o61.b(lx0.g, lx0.h.floatValue(), lx0.b, Integer.valueOf(e), f2, e(), f());
                if (num != null) {
                    return num.intValue();
                }
            } else {
                f2 = f;
            }
            return C4713Xj1.l(lx0.h(), e, f2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // o.AbstractC7840ll
    /* renamed from: t */
    public Integer i(LX0<Integer> lx0, float f) {
        return Integer.valueOf(s(lx0, f));
    }
}
