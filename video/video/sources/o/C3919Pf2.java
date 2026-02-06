package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* renamed from: o.Pf2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3919Pf2 extends AbstractC3647Ml {
    public final AbstractC8588ol q;
    public final String r;
    public final boolean s;
    public final AbstractC7840ll<Integer, Integer> t;
    public AbstractC7840ll<ColorFilter, ColorFilter> u;

    public C3919Pf2(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, C5962e32 c5962e32) {
        super(c8431o61, abstractC8588ol, c5962e32.b().g(), c5962e32.e().g(), c5962e32.g(), c5962e32.i(), c5962e32.j(), c5962e32.f(), c5962e32.d());
        this.q = abstractC8588ol;
        this.r = c5962e32.h();
        this.s = c5962e32.k();
        AbstractC7840ll<Integer, Integer> a = c5962e32.c().a();
        this.t = a;
        a.a(this);
        abstractC8588ol.j(a);
    }

    @Override // o.AbstractC3647Ml, o.BX0
    public <T> void d(T t, O61<T> o61) {
        super.d(t, o61);
        if (t == D61.b) {
            this.t.o(o61);
        } else if (t == D61.N) {
            AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.u;
            if (abstractC7840ll != null) {
                this.q.H(abstractC7840ll);
            }
            if (o61 == null) {
                this.u = null;
                return;
            }
            CE2 ce2 = new CE2(o61);
            this.u = ce2;
            ce2.a(this);
            this.q.j(this.t);
        }
    }

    @Override // o.AbstractC3647Ml, o.InterfaceC6474g70
    public void e(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        if (this.s) {
            return;
        }
        this.i.setColor(((KF) this.t).r());
        AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.u;
        if (abstractC7840ll != null) {
            this.i.setColorFilter(abstractC7840ll.h());
        }
        super.e(canvas, matrix, i, c10874y70);
    }

    @Override // o.DL
    public String getName() {
        return this.r;
    }
}
