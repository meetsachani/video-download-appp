package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC7840ll;
import o.C6460g32;

/* renamed from: o.Ml  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3647Ml implements AbstractC7840ll.b, CX0, InterfaceC6474g70 {
    public final C8431o61 e;
    public final AbstractC8588ol f;
    public final float[] h;
    public final Paint i;
    public final AbstractC7840ll<?, Float> j;
    public final AbstractC7840ll<?, Integer> k;
    public final List<AbstractC7840ll<?, Float>> l;
    public final AbstractC7840ll<?, Float> m;
    public AbstractC7840ll<ColorFilter, ColorFilter> n;

    /* renamed from: o  reason: collision with root package name */
    public AbstractC7840ll<Float, Float> f547o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final List<b> g = new ArrayList();

    /* renamed from: o.Ml$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final List<InterfaceC5702cz1> a;
        public final C10823xu2 b;

        public b(C10823xu2 c10823xu2) {
            this.a = new ArrayList();
            this.b = c10823xu2;
        }
    }

    public AbstractC3647Ml(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, Paint.Cap cap, Paint.Join join, float f, C9663t9 c9663t9, C9177r9 c9177r9, List<C9177r9> list, C9177r9 c9177r92) {
        C5353bY0 c5353bY0 = new C5353bY0(1);
        this.i = c5353bY0;
        this.p = 0.0f;
        this.e = c8431o61;
        this.f = abstractC8588ol;
        c5353bY0.setStyle(Paint.Style.STROKE);
        c5353bY0.setStrokeCap(cap);
        c5353bY0.setStrokeJoin(join);
        c5353bY0.setStrokeMiter(f);
        this.k = c9663t9.a();
        this.j = c9177r9.a();
        if (c9177r92 == null) {
            this.m = null;
        } else {
            this.m = c9177r92.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        abstractC8588ol.j(this.k);
        abstractC8588ol.j(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            abstractC8588ol.j(this.l.get(i2));
        }
        AbstractC7840ll<?, Float> abstractC7840ll = this.m;
        if (abstractC7840ll != null) {
            abstractC8588ol.j(abstractC7840ll);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        AbstractC7840ll<?, Float> abstractC7840ll2 = this.m;
        if (abstractC7840ll2 != null) {
            abstractC7840ll2.a(this);
        }
        if (abstractC8588ol.x() != null) {
            C8629ov0 a2 = abstractC8588ol.x().a().a();
            this.f547o = a2;
            a2.a(this);
            abstractC8588ol.j(this.f547o);
        }
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        this.e.invalidateSelf();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        C10823xu2 c10823xu2 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            DL dl = list.get(size);
            if (dl instanceof C10823xu2) {
                C10823xu2 c10823xu22 = (C10823xu2) dl;
                if (c10823xu22.k() == C6460g32.a.INDIVIDUALLY) {
                    c10823xu2 = c10823xu22;
                }
            }
        }
        if (c10823xu2 != null) {
            c10823xu2.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            DL dl2 = list2.get(size2);
            if (dl2 instanceof C10823xu2) {
                C10823xu2 c10823xu23 = (C10823xu2) dl2;
                if (c10823xu23.k() == C6460g32.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.g.add(bVar);
                    }
                    bVar = new b(c10823xu23);
                    c10823xu23.c(this);
                }
            }
            if (dl2 instanceof InterfaceC5702cz1) {
                if (bVar == null) {
                    bVar = new b(c10823xu2);
                }
                bVar.a.add((InterfaceC5702cz1) dl2);
            }
        }
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        C4713Xj1.m(ax0, i, list, ax02, this);
    }

    @Override // o.BX0
    public <T> void d(T t, O61<T> o61) {
        if (t == D61.d) {
            this.k.o(o61);
        } else if (t == D61.v) {
            this.j.o(o61);
        } else if (t == D61.N) {
            AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.n;
            if (abstractC7840ll != null) {
                this.f.H(abstractC7840ll);
            }
            if (o61 == null) {
                this.n = null;
                return;
            }
            CE2 ce2 = new CE2(o61);
            this.n = ce2;
            ce2.a(this);
            this.f.j(this.n);
        } else if (t == D61.j) {
            AbstractC7840ll<Float, Float> abstractC7840ll2 = this.f547o;
            if (abstractC7840ll2 != null) {
                abstractC7840ll2.o(o61);
                return;
            }
            CE2 ce22 = new CE2(o61);
            this.f547o = ce22;
            ce22.a(this);
            this.f.j(this.f547o);
        }
    }

    @Override // o.InterfaceC6474g70
    public void e(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        if (ZX0.h()) {
            ZX0.b("StrokeContent#draw");
        }
        if (C6006eE2.h(matrix)) {
            if (ZX0.h()) {
                ZX0.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float intValue = this.k.h().intValue() / 100.0f;
        this.i.setAlpha(C4713Xj1.d((int) (i * intValue), 0, 255));
        this.i.setStrokeWidth(((C8629ov0) this.j).r());
        if (this.i.getStrokeWidth() <= 0.0f) {
            if (ZX0.h()) {
                ZX0.c("StrokeContent#draw");
                return;
            }
            return;
        }
        i();
        AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.n;
        if (abstractC7840ll != null) {
            this.i.setColorFilter(abstractC7840ll.h());
        }
        AbstractC7840ll<Float, Float> abstractC7840ll2 = this.f547o;
        if (abstractC7840ll2 != null) {
            float floatValue = abstractC7840ll2.h().floatValue();
            if (floatValue == 0.0f) {
                this.i.setMaskFilter(null);
            } else if (floatValue != this.p) {
                this.i.setMaskFilter(this.f.y(floatValue));
            }
            this.p = floatValue;
        }
        if (c10874y70 != null) {
            c10874y70.c((int) (intValue * 255.0f), this.i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar.b != null) {
                j(canvas, bVar);
            } else {
                if (ZX0.h()) {
                    ZX0.b("StrokeContent#buildPath");
                }
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((InterfaceC5702cz1) bVar.a.get(size)).Y());
                }
                if (ZX0.h()) {
                    ZX0.c("StrokeContent#buildPath");
                    ZX0.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.b, this.i);
                if (ZX0.h()) {
                    ZX0.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (ZX0.h()) {
            ZX0.c("StrokeContent#draw");
        }
    }

    @Override // o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        if (ZX0.h()) {
            ZX0.b("StrokeContent#getBounds");
        }
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = this.g.get(i);
            for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                this.b.addPath(((InterfaceC5702cz1) bVar.a.get(i2)).Y(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float r = ((C8629ov0) this.j).r();
        RectF rectF2 = this.d;
        float f = r / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (ZX0.h()) {
            ZX0.c("StrokeContent#getBounds");
        }
    }

    public final void i() {
        float floatValue;
        if (ZX0.h()) {
            ZX0.b("StrokeContent#applyDashPattern");
        }
        if (this.l.isEmpty()) {
            if (ZX0.h()) {
                ZX0.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i = 0; i < this.l.size(); i++) {
            this.h[i] = this.l.get(i).h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
        }
        AbstractC7840ll<?, Float> abstractC7840ll = this.m;
        if (abstractC7840ll == null) {
            floatValue = 0.0f;
        } else {
            floatValue = abstractC7840ll.h().floatValue();
        }
        this.i.setPathEffect(new DashPathEffect(this.h, floatValue));
        if (ZX0.h()) {
            ZX0.c("StrokeContent#applyDashPattern");
        }
    }

    public final void j(Canvas canvas, b bVar) {
        float f;
        float f2;
        float f3;
        if (ZX0.h()) {
            ZX0.b("StrokeContent#applyTrimPath");
        }
        if (bVar.b == null) {
            if (ZX0.h()) {
                ZX0.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.b.reset();
        for (int size = bVar.a.size() - 1; size >= 0; size--) {
            this.b.addPath(((InterfaceC5702cz1) bVar.a.get(size)).Y());
        }
        float floatValue = bVar.b.j().h().floatValue() / 100.0f;
        float floatValue2 = bVar.b.d().h().floatValue() / 100.0f;
        float floatValue3 = bVar.b.i().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.b, this.i);
            if (ZX0.h()) {
                ZX0.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.a.setPath(this.b, false);
        float length = this.a.getLength();
        while (this.a.nextContour()) {
            length += this.a.getLength();
        }
        float f4 = floatValue3 * length;
        float f5 = (floatValue * length) + f4;
        float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
        float f6 = 0.0f;
        for (int size2 = bVar.a.size() - 1; size2 >= 0; size2--) {
            this.c.set(((InterfaceC5702cz1) bVar.a.get(size2)).Y());
            this.a.setPath(this.c, false);
            float length2 = this.a.getLength();
            if (min > length) {
                float f7 = min - length;
                if (f7 < f6 + length2 && f6 < f7) {
                    if (f5 > length) {
                        f3 = (f5 - length) / length2;
                    } else {
                        f3 = 0.0f;
                    }
                    C6006eE2.a(this.c, f3, Math.min(f7 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.c, this.i);
                    f6 += length2;
                }
            }
            float f8 = f6 + length2;
            if (f8 >= f5 && f6 <= min) {
                if (f8 <= min && f5 < f6) {
                    canvas.drawPath(this.c, this.i);
                } else {
                    if (f5 < f6) {
                        f = 0.0f;
                    } else {
                        f = (f5 - f6) / length2;
                    }
                    if (min > f8) {
                        f2 = 1.0f;
                    } else {
                        f2 = (min - f6) / length2;
                    }
                    C6006eE2.a(this.c, f, f2, 0.0f);
                    canvas.drawPath(this.c, this.i);
                }
            }
            f6 += length2;
        }
        if (ZX0.h()) {
            ZX0.c("StrokeContent#applyTrimPath");
        }
    }
}
