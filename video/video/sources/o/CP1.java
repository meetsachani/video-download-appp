package o;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import o.AbstractC7840ll;
import o.C6460g32;

/* loaded from: classes.dex */
public class CP1 implements AbstractC7840ll.b, CX0, InterfaceC5702cz1 {
    public final String c;
    public final boolean d;
    public final C8431o61 e;
    public final AbstractC7840ll<?, PointF> f;
    public final AbstractC7840ll<?, PointF> g;
    public final AbstractC7840ll<?, Float> h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final C5296bJ i = new C5296bJ();
    public AbstractC7840ll<Float, Float> j = null;

    public CP1(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, DP1 dp1) {
        this.c = dp1.c();
        this.d = dp1.f();
        this.e = c8431o61;
        AbstractC7840ll<PointF, PointF> a = dp1.d().a();
        this.f = a;
        AbstractC7840ll<PointF, PointF> a2 = dp1.e().a();
        this.g = a2;
        C8629ov0 a3 = dp1.b().a();
        this.h = a3;
        abstractC8588ol.j(a);
        abstractC8588ol.j(a2);
        abstractC8588ol.j(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    private void i() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // o.InterfaceC5702cz1
    public Path Y() {
        float r;
        AbstractC7840ll<Float, Float> abstractC7840ll;
        if (this.k) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.k = true;
            return this.a;
        }
        PointF h = this.g.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        AbstractC7840ll<?, Float> abstractC7840ll2 = this.h;
        if (abstractC7840ll2 == null) {
            r = 0.0f;
        } else {
            r = ((C8629ov0) abstractC7840ll2).r();
        }
        if (r == 0.0f && (abstractC7840ll = this.j) != null) {
            r = Math.min(abstractC7840ll.h().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (r > min) {
            r = min;
        }
        PointF h2 = this.f.h();
        this.a.moveTo(h2.x + f, (h2.y - f2) + r);
        this.a.lineTo(h2.x + f, (h2.y + f2) - r);
        int i = (r > 0.0f ? 1 : (r == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.b;
            float f3 = h2.x;
            float f4 = r * 2.0f;
            float f5 = h2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((h2.x - f) + r, h2.y + f2);
        if (i > 0) {
            RectF rectF2 = this.b;
            float f6 = h2.x;
            float f7 = h2.y;
            float f8 = r * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(h2.x - f, (h2.y - f2) + r);
        if (i > 0) {
            RectF rectF3 = this.b;
            float f9 = h2.x;
            float f10 = h2.y;
            float f11 = r * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((h2.x + f) - r, h2.y - f2);
        if (i > 0) {
            RectF rectF4 = this.b;
            float f12 = h2.x;
            float f13 = r * 2.0f;
            float f14 = h2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.k = true;
        return this.a;
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        i();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        for (int i = 0; i < list.size(); i++) {
            DL dl = list.get(i);
            if (dl instanceof C10823xu2) {
                C10823xu2 c10823xu2 = (C10823xu2) dl;
                if (c10823xu2.k() == C6460g32.a.SIMULTANEOUSLY) {
                    this.i.a(c10823xu2);
                    c10823xu2.c(this);
                }
            }
            if (dl instanceof C8287nV1) {
                this.j = ((C8287nV1) dl).i();
            }
        }
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        C4713Xj1.m(ax0, i, list, ax02, this);
    }

    @Override // o.BX0
    public <T> void d(T t, O61<T> o61) {
        if (t == D61.l) {
            this.g.o(o61);
        } else if (t == D61.n) {
            this.f.o(o61);
        } else if (t == D61.m) {
            this.h.o(o61);
        }
    }

    @Override // o.DL
    public String getName() {
        return this.c;
    }
}
