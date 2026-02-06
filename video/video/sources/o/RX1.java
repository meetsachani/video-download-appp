package o;

import java.util.List;

/* loaded from: classes.dex */
public class RX1 extends MX0<UX1> {
    public final UX1 i;

    public RX1(List<LX0<UX1>> list) {
        super(list);
        this.i = new UX1();
    }

    @Override // o.AbstractC7840ll
    /* renamed from: r */
    public UX1 i(LX0<UX1> lx0, float f) {
        UX1 ux1;
        float f2;
        UX1 ux12 = lx0.b;
        if (ux12 != null && (ux1 = lx0.c) != null) {
            UX1 ux13 = ux12;
            UX1 ux14 = ux1;
            O61<A> o61 = this.e;
            if (o61 != 0) {
                f2 = f;
                UX1 ux15 = (UX1) o61.b(lx0.g, lx0.h.floatValue(), ux13, ux14, f2, e(), f());
                if (ux15 != null) {
                    return ux15;
                }
            } else {
                f2 = f;
            }
            this.i.d(C4713Xj1.k(ux13.b(), ux14.b(), f2), C4713Xj1.k(ux13.c(), ux14.c(), f2));
            return this.i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
