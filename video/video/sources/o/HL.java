package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC7840ll;
import o.C6665gu1;

/* loaded from: classes.dex */
public class HL implements InterfaceC6474g70, InterfaceC5702cz1, AbstractC7840ll.b, BX0 {
    public final C6665gu1.b a;
    public final RectF b;
    public final C6665gu1 c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final List<DL> i;
    public final C8431o61 j;
    public List<InterfaceC5702cz1> k;
    public C5190as2 l;

    public HL(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, V22 v22, C10624x51 c10624x51) {
        this(c8431o61, abstractC8588ol, v22.c(), v22.d(), i(c8431o61, c10624x51, abstractC8588ol, v22.b()), j(v22.b()));
    }

    public static List<DL> i(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol, List<InterfaceC6776hM> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            DL a = list.get(i).a(c8431o61, c10624x51, abstractC8588ol);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public static F9 j(List<InterfaceC6776hM> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6776hM interfaceC6776hM = list.get(i);
            if (interfaceC6776hM instanceof F9) {
                return (F9) interfaceC6776hM;
            }
        }
        return null;
    }

    @Override // o.InterfaceC5702cz1
    public Path Y() {
        this.d.reset();
        C5190as2 c5190as2 = this.l;
        if (c5190as2 != null) {
            this.d.set(c5190as2.i());
        }
        this.e.reset();
        if (this.h) {
            return this.e;
        }
        for (int size = this.i.size() - 1; size >= 0; size--) {
            DL dl = this.i.get(size);
            if (dl instanceof InterfaceC5702cz1) {
                this.e.addPath(((InterfaceC5702cz1) dl).Y(), this.d);
            }
        }
        return this.e;
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.i.size());
        arrayList.addAll(list);
        for (int size = this.i.size() - 1; size >= 0; size--) {
            DL dl = this.i.get(size);
            dl.b(arrayList, this.i.subList(0, size));
            arrayList.add(dl);
        }
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        if (ax0.h(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                ax02 = ax02.a(getName());
                if (ax0.c(getName(), i)) {
                    list.add(ax02.j(this));
                }
            }
            if (ax0.i(getName(), i)) {
                int e = i + ax0.e(getName(), i);
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    DL dl = this.i.get(i2);
                    if (dl instanceof BX0) {
                        ((BX0) dl).c(ax0, e, list, ax02);
                    }
                }
            }
        }
    }

    @Override // o.BX0
    public <T> void d(T t, O61<T> o61) {
        C5190as2 c5190as2 = this.l;
        if (c5190as2 != null) {
            c5190as2.f(t, o61);
        }
    }

    @Override // o.InterfaceC6474g70
    public void e(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        boolean z;
        int intValue;
        if (!this.h) {
            this.d.set(matrix);
            C5190as2 c5190as2 = this.l;
            if (c5190as2 != null) {
                this.d.preConcat(c5190as2.i());
                if (this.l.k() == null) {
                    intValue = 100;
                } else {
                    intValue = this.l.k().h().intValue();
                }
                i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
            }
            int i2 = 255;
            if ((this.j.u0() && n() && i != 255) || (c10874y70 != null && this.j.v0() && n())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i2 = i;
            }
            if (z) {
                this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
                h(this.b, matrix, true);
                C6665gu1.b bVar = this.a;
                bVar.a = i;
                if (c10874y70 != null) {
                    c10874y70.b(bVar);
                    c10874y70 = null;
                } else {
                    bVar.d = null;
                }
                canvas = this.c.j(canvas, this.b, this.a);
            } else if (c10874y70 != null) {
                C10874y70 c10874y702 = new C10874y70(c10874y70);
                c10874y702.i(i2);
                c10874y70 = c10874y702;
            }
            for (int size = this.i.size() - 1; size >= 0; size--) {
                DL dl = this.i.get(size);
                if (dl instanceof InterfaceC6474g70) {
                    ((InterfaceC6474g70) dl).e(canvas, this.d, i2, c10874y70);
                }
            }
            if (z) {
                this.c.e();
            }
        }
    }

    @Override // o.DL
    public String getName() {
        return this.g;
    }

    @Override // o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        this.d.set(matrix);
        C5190as2 c5190as2 = this.l;
        if (c5190as2 != null) {
            this.d.preConcat(c5190as2.i());
        }
        this.f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.i.size() - 1; size >= 0; size--) {
            DL dl = this.i.get(size);
            if (dl instanceof InterfaceC6474g70) {
                ((InterfaceC6474g70) dl).h(this.f, this.d, z);
                rectF.union(this.f);
            }
        }
    }

    public List<DL> k() {
        return this.i;
    }

    public List<InterfaceC5702cz1> l() {
        if (this.k == null) {
            this.k = new ArrayList();
            for (int i = 0; i < this.i.size(); i++) {
                DL dl = this.i.get(i);
                if (dl instanceof InterfaceC5702cz1) {
                    this.k.add((InterfaceC5702cz1) dl);
                }
            }
        }
        return this.k;
    }

    public Matrix m() {
        C5190as2 c5190as2 = this.l;
        if (c5190as2 != null) {
            return c5190as2.i();
        }
        this.d.reset();
        return this.d;
    }

    public final boolean n() {
        int i = 0;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if ((this.i.get(i2) instanceof InterfaceC6474g70) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public HL(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, String str, boolean z, List<DL> list, F9 f9) {
        this.a = new C6665gu1.b();
        this.b = new RectF();
        this.c = new C6665gu1();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = c8431o61;
        this.h = z;
        this.i = list;
        if (f9 != null) {
            C5190as2 b = f9.b();
            this.l = b;
            b.d(abstractC8588ol);
            this.l.e(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            DL dl = list.get(size);
            if (dl instanceof LE0) {
                arrayList.add((LE0) dl);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((LE0) arrayList.get(size2)).i(list.listIterator(list.size()));
        }
    }
}
