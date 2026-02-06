package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class p extends y {
    public static final float g = 1.0f;
    public t e;
    public t f;

    @Override // androidx.recyclerview.widget.y
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.s()) {
            iArr[0] = n(view, q(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.t()) {
            iArr[1] = n(view, r(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y
    public View h(RecyclerView.p pVar) {
        if (pVar.t()) {
            return p(pVar, r(pVar));
        }
        if (pVar.s()) {
            return p(pVar, q(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y
    public int i(RecyclerView.p pVar, int i, int i2) {
        int f;
        View h;
        int w0;
        int i3;
        PointF c;
        int i4;
        int i5;
        if (!(pVar instanceof RecyclerView.C.b) || (f = pVar.f()) == 0 || (h = h(pVar)) == null || (w0 = pVar.w0(h)) == -1 || (c = ((RecyclerView.C.b) pVar).c(f - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (pVar.s()) {
            i4 = o(pVar, q(pVar), i, 0);
            if (c.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (pVar.t()) {
            i5 = o(pVar, r(pVar), 0, i2);
            if (c.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (pVar.t()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = w0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        if (i6 >= f) {
            return i3;
        }
        return i6;
    }

    public final float m(RecyclerView.p pVar, t tVar) {
        int V = pVar.V();
        if (V == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < V; i3++) {
            View U = pVar.U(i3);
            int w0 = pVar.w0(U);
            if (w0 != -1) {
                if (w0 < i2) {
                    view = U;
                    i2 = w0;
                }
                if (w0 > i) {
                    view2 = U;
                    i = w0;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(tVar.d(view), tVar.d(view2)) - Math.min(tVar.g(view), tVar.g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i - i2) + 1);
    }

    public final int n(View view, t tVar) {
        return (tVar.g(view) + (tVar.e(view) / 2)) - (tVar.n() + (tVar.o() / 2));
    }

    public final int o(RecyclerView.p pVar, t tVar, int i, int i2) {
        int i3;
        int[] d = d(i, i2);
        float m = m(pVar, tVar);
        if (m <= 0.0f) {
            return 0;
        }
        if (Math.abs(d[0]) > Math.abs(d[1])) {
            i3 = d[0];
        } else {
            i3 = d[1];
        }
        return Math.round(i3 / m);
    }

    public final View p(RecyclerView.p pVar, t tVar) {
        int V = pVar.V();
        View view = null;
        if (V == 0) {
            return null;
        }
        int n = tVar.n() + (tVar.o() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < V; i2++) {
            View U = pVar.U(i2);
            int abs = Math.abs((tVar.g(U) + (tVar.e(U) / 2)) - n);
            if (abs < i) {
                view = U;
                i = abs;
            }
        }
        return view;
    }

    public final t q(RecyclerView.p pVar) {
        t tVar = this.f;
        if (tVar == null || tVar.a != pVar) {
            this.f = t.a(pVar);
        }
        return this.f;
    }

    public final t r(RecyclerView.p pVar) {
        t tVar = this.e;
        if (tVar == null || tVar.a != pVar) {
            this.e = t.c(pVar);
        }
        return this.e;
    }
}
