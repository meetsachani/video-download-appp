package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class Y22 extends AbstractC8588ol {
    public final HL I;
    public final YI J;
    public B70 K;

    public Y22(C8431o61 c8431o61, C9760tY0 c9760tY0, YI yi, C10624x51 c10624x51) {
        super(c8431o61, c9760tY0);
        this.J = yi;
        HL hl = new HL(c8431o61, this, new V22("__container", c9760tY0.o(), false), c10624x51);
        this.I = hl;
        List<DL> list = Collections.EMPTY_LIST;
        hl.b(list, list);
        if (z() != null) {
            this.K = new B70(this, this, z());
        }
    }

    @Override // o.AbstractC8588ol
    public void I(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        this.I.c(ax0, i, list, ax02);
    }

    @Override // o.AbstractC8588ol, o.BX0
    public <T> void d(T t, O61<T> o61) {
        B70 b70;
        B70 b702;
        B70 b703;
        B70 b704;
        B70 b705;
        super.d(t, o61);
        if (t == D61.e && (b705 = this.K) != null) {
            b705.c(o61);
        } else if (t == D61.J && (b704 = this.K) != null) {
            b704.f(o61);
        } else if (t == D61.K && (b703 = this.K) != null) {
            b703.d(o61);
        } else if (t == D61.L && (b702 = this.K) != null) {
            b702.e(o61);
        } else if (t == D61.M && (b70 = this.K) != null) {
            b70.g(o61);
        }
    }

    @Override // o.AbstractC8588ol, o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        super.h(rectF, matrix, z);
        this.I.h(rectF, this.f829o, z);
    }

    @Override // o.AbstractC8588ol
    public void u(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        B70 b70 = this.K;
        if (b70 != null) {
            c10874y70 = b70.b(matrix, i);
        }
        this.I.e(canvas, matrix, i, c10874y70);
    }

    @Override // o.AbstractC8588ol
    public C11039yo x() {
        C11039yo x = super.x();
        if (x != null) {
            return x;
        }
        return this.J.x();
    }
}
