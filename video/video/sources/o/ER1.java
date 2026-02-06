package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import o.AbstractC7840ll;

/* loaded from: classes.dex */
public class ER1 implements InterfaceC6474g70, InterfaceC5702cz1, LE0, AbstractC7840ll.b, CX0 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final C8431o61 c;
    public final AbstractC8588ol d;
    public final String e;
    public final boolean f;
    public final AbstractC7840ll<Float, Float> g;
    public final AbstractC7840ll<Float, Float> h;
    public final C5190as2 i;
    public HL j;

    public ER1(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, DR1 dr1) {
        this.c = c8431o61;
        this.d = abstractC8588ol;
        this.e = dr1.c();
        this.f = dr1.f();
        C8629ov0 a = dr1.b().a();
        this.g = a;
        abstractC8588ol.j(a);
        a.a(this);
        C8629ov0 a2 = dr1.d().a();
        this.h = a2;
        abstractC8588ol.j(a2);
        a2.a(this);
        C5190as2 b = dr1.e().b();
        this.i = b;
        b.d(abstractC8588ol);
        b.e(this);
    }

    @Override // o.InterfaceC5702cz1
    public Path Y() {
        Path Y = this.j.Y();
        this.b.reset();
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.j(i + floatValue2));
            this.b.addPath(Y, this.a);
        }
        return this.b;
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        this.c.invalidateSelf();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        this.j.b(list, list2);
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        C4713Xj1.m(ax0, i, list, ax02, this);
        for (int i2 = 0; i2 < this.j.k().size(); i2++) {
            DL dl = this.j.k().get(i2);
            if (dl instanceof CX0) {
                C4713Xj1.m(ax0, i, list, ax02, (CX0) dl);
            }
        }
    }

    @Override // o.BX0
    public <T> void d(T t, O61<T> o61) {
        if (!this.i.f(t, o61)) {
            if (t == D61.x) {
                this.g.o(o61);
            } else if (t == D61.y) {
                this.h.o(o61);
            }
        }
    }

    @Override // o.InterfaceC6474g70
    public void e(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        float floatValue3 = this.i.l().h().floatValue() / 100.0f;
        float floatValue4 = this.i.h().h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.j(f + floatValue2));
            this.j.e(canvas, this.a, (int) (i * C4713Xj1.k(floatValue3, floatValue4, f / floatValue)), c10874y70);
        }
    }

    @Override // o.DL
    public String getName() {
        return this.e;
    }

    @Override // o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        this.j.h(rectF, matrix, z);
    }

    @Override // o.LE0
    public void i(ListIterator<DL> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new HL(this.c, this.d, "Repeater", this.f, arrayList, null);
    }
}
