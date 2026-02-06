package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC7840ll;

/* renamed from: o.Fs0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2991Fs0 implements InterfaceC6474g70, AbstractC7840ll.b, CX0 {
    public final Path a;
    public final Paint b;
    public final AbstractC8588ol c;
    public final String d;
    public final boolean e;
    public final List<InterfaceC5702cz1> f;
    public final AbstractC7840ll<Integer, Integer> g;
    public final AbstractC7840ll<Integer, Integer> h;
    public AbstractC7840ll<ColorFilter, ColorFilter> i;
    public final C8431o61 j;
    public AbstractC7840ll<Float, Float> k;
    public float l;

    public C2991Fs0(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, T22 t22) {
        Path path = new Path();
        this.a = path;
        this.b = new C5353bY0(1);
        this.f = new ArrayList();
        this.c = abstractC8588ol;
        this.d = t22.d();
        this.e = t22.f();
        this.j = c8431o61;
        if (abstractC8588ol.x() != null) {
            C8629ov0 a = abstractC8588ol.x().a().a();
            this.k = a;
            a.a(this);
            abstractC8588ol.j(this.k);
        }
        if (t22.b() != null && t22.e() != null) {
            path.setFillType(t22.c());
            AbstractC7840ll<Integer, Integer> a2 = t22.b().a();
            this.g = a2;
            a2.a(this);
            abstractC8588ol.j(a2);
            AbstractC7840ll<Integer, Integer> a3 = t22.e().a();
            this.h = a3;
            a3.a(this);
            abstractC8588ol.j(a3);
            return;
        }
        this.g = null;
        this.h = null;
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        for (int i = 0; i < list2.size(); i++) {
            DL dl = list2.get(i);
            if (dl instanceof InterfaceC5702cz1) {
                this.f.add((InterfaceC5702cz1) dl);
            }
        }
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        C4713Xj1.m(ax0, i, list, ax02, this);
    }

    @Override // o.BX0
    public <T> void d(T t, O61<T> o61) {
        if (t == D61.a) {
            this.g.o(o61);
        } else if (t == D61.d) {
            this.h.o(o61);
        } else if (t == D61.N) {
            AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.i;
            if (abstractC7840ll != null) {
                this.c.H(abstractC7840ll);
            }
            if (o61 == null) {
                this.i = null;
                return;
            }
            CE2 ce2 = new CE2(o61);
            this.i = ce2;
            ce2.a(this);
            this.c.j(this.i);
        } else if (t == D61.j) {
            AbstractC7840ll<Float, Float> abstractC7840ll2 = this.k;
            if (abstractC7840ll2 != null) {
                abstractC7840ll2.o(o61);
                return;
            }
            CE2 ce22 = new CE2(o61);
            this.k = ce22;
            ce22.a(this);
            this.c.j(this.k);
        }
    }

    @Override // o.InterfaceC6474g70
    public void e(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        if (!this.e) {
            if (ZX0.h()) {
                ZX0.b("FillContent#draw");
            }
            int r = ((KF) this.g).r();
            float intValue = this.h.h().intValue() / 100.0f;
            this.b.setColor((C4713Xj1.d((int) (i * intValue), 0, 255) << 24) | (r & C6516gH2.x));
            AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.i;
            if (abstractC7840ll != null) {
                this.b.setColorFilter(abstractC7840ll.h());
            }
            AbstractC7840ll<Float, Float> abstractC7840ll2 = this.k;
            if (abstractC7840ll2 != null) {
                float floatValue = abstractC7840ll2.h().floatValue();
                if (floatValue == 0.0f) {
                    this.b.setMaskFilter(null);
                } else if (floatValue != this.l) {
                    this.b.setMaskFilter(this.c.y(floatValue));
                }
                this.l = floatValue;
            }
            if (c10874y70 != null) {
                c10874y70.c((int) (intValue * 255.0f), this.b);
            } else {
                this.b.clearShadowLayer();
            }
            this.a.reset();
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                this.a.addPath(this.f.get(i2).Y(), matrix);
            }
            canvas.drawPath(this.a, this.b);
            if (ZX0.h()) {
                ZX0.c("FillContent#draw");
            }
        }
    }

    @Override // o.DL
    public String getName() {
        return this.d;
    }

    @Override // o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(this.f.get(i).Y(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
