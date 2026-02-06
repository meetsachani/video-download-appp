package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import o.AbstractC7840ll;
import o.C6460g32;

/* renamed from: o.ta0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9766ta0 implements InterfaceC5702cz1, AbstractC7840ll.b, CX0 {
    public static final float i = 0.55228f;
    public final String b;
    public final C8431o61 c;
    public final AbstractC7840ll<?, PointF> d;
    public final AbstractC7840ll<?, PointF> e;
    public final C9675tC f;
    public boolean h;
    public final Path a = new Path();
    public final C5296bJ g = new C5296bJ();

    public C9766ta0(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, C9675tC c9675tC) {
        this.b = c9675tC.b();
        this.c = c8431o61;
        AbstractC7840ll<PointF, PointF> a = c9675tC.d().a();
        this.d = a;
        AbstractC7840ll<PointF, PointF> a2 = c9675tC.c().a();
        this.e = a2;
        this.f = c9675tC;
        abstractC8588ol.j(a);
        abstractC8588ol.j(a2);
        a.a(this);
        a2.a(this);
    }

    @Override // o.InterfaceC5702cz1
    public Path Y() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.a;
        }
        PointF h = this.d.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.f()) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF h2 = this.e.h();
        this.a.offset(h2.x, h2.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        i();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            DL dl = list.get(i2);
            if (dl instanceof C10823xu2) {
                C10823xu2 c10823xu2 = (C10823xu2) dl;
                if (c10823xu2.k() == C6460g32.a.SIMULTANEOUSLY) {
                    this.g.a(c10823xu2);
                    c10823xu2.c(this);
                }
            }
        }
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i2, List<AX0> list, AX0 ax02) {
        C4713Xj1.m(ax0, i2, list, ax02, this);
    }

    @Override // o.BX0
    public <T> void d(T t, O61<T> o61) {
        if (t == D61.k) {
            this.d.o(o61);
        } else if (t == D61.n) {
            this.e.o(o61);
        }
    }

    @Override // o.DL
    public String getName() {
        return this.b;
    }

    public final void i() {
        this.h = false;
        this.c.invalidateSelf();
    }
}
