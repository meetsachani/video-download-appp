package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class R22 {
    public final List<C6557gS> a;
    public PointF b;
    public boolean c;

    public R22(PointF pointF, boolean z, List<C6557gS> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public List<C6557gS> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(R22 r22, R22 r222, float f) {
        boolean z;
        if (this.b == null) {
            this.b = new PointF();
        }
        if (!r22.d() && !r222.d()) {
            z = false;
        } else {
            z = true;
        }
        this.c = z;
        if (r22.a().size() != r222.a().size()) {
            C7190j41.e("Curves must have the same number of control points. Shape 1: " + r22.a().size() + "\tShape 2: " + r222.a().size());
        }
        int min = Math.min(r22.a().size(), r222.a().size());
        if (this.a.size() < min) {
            for (int size = this.a.size(); size < min; size++) {
                this.a.add(new C6557gS());
            }
        } else if (this.a.size() > min) {
            for (int size2 = this.a.size() - 1; size2 >= min; size2--) {
                List<C6557gS> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = r22.b();
        PointF b2 = r222.b();
        f(C4713Xj1.k(b.x, b2.x, f), C4713Xj1.k(b.y, b2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            C6557gS c6557gS = r22.a().get(size3);
            C6557gS c6557gS2 = r222.a().get(size3);
            PointF a = c6557gS.a();
            PointF b3 = c6557gS.b();
            PointF c = c6557gS.c();
            PointF a2 = c6557gS2.a();
            PointF b4 = c6557gS2.b();
            PointF c2 = c6557gS2.c();
            this.a.get(size3).d(C4713Xj1.k(a.x, a2.x, f), C4713Xj1.k(a.y, a2.y, f));
            this.a.get(size3).e(C4713Xj1.k(b3.x, b4.x, f), C4713Xj1.k(b3.y, b4.y, f));
            this.a.get(size3).g(C4713Xj1.k(c.x, c2.x, f), C4713Xj1.k(c.y, c2.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }

    public R22() {
        this.a = new ArrayList();
    }
}
