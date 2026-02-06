package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class u extends y {
    public static final int g = 100;
    public t e;
    public t f;

    /* loaded from: classes.dex */
    public class a extends o {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.C
        public void p(View view, RecyclerView.D d, RecyclerView.C.a aVar) {
            u uVar = u.this;
            int[] c = uVar.c(uVar.a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int x = x(Math.max(Math.abs(i), Math.abs(i2)));
            if (x > 0) {
                aVar.l(i, i2, x, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.o
        public float w(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.o
        public int y(int i) {
            return Math.min(100, super.y(i));
        }
    }

    private int m(View view, t tVar) {
        return (tVar.g(view) + (tVar.e(view) / 2)) - (tVar.n() + (tVar.o() / 2));
    }

    private View n(RecyclerView.p pVar, t tVar) {
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

    private t o(RecyclerView.p pVar) {
        t tVar = this.f;
        if (tVar == null || tVar.a != pVar) {
            this.f = t.a(pVar);
        }
        return this.f;
    }

    private t q(RecyclerView.p pVar) {
        t tVar = this.e;
        if (tVar == null || tVar.a != pVar) {
            this.e = t.c(pVar);
        }
        return this.e;
    }

    @Override // androidx.recyclerview.widget.y
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.s()) {
            iArr[0] = m(view, o(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.t()) {
            iArr[1] = m(view, q(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y
    public RecyclerView.C e(RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.C.b)) {
            return null;
        }
        return new a(this.a.getContext());
    }

    @Override // androidx.recyclerview.widget.y
    public View h(RecyclerView.p pVar) {
        if (pVar.t()) {
            return n(pVar, q(pVar));
        }
        if (pVar.s()) {
            return n(pVar, o(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y
    public int i(RecyclerView.p pVar, int i, int i2) {
        t p;
        int i3;
        int f = pVar.f();
        if (f == 0 || (p = p(pVar)) == null) {
            return -1;
        }
        int V = pVar.V();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < V; i6++) {
            View U = pVar.U(i6);
            if (U != null) {
                int m = m(U, p);
                if (m <= 0 && m > i5) {
                    view2 = U;
                    i5 = m;
                }
                if (m >= 0 && m < i4) {
                    view = U;
                    i4 = m;
                }
            }
        }
        boolean r = r(pVar, i, i2);
        if (r && view != null) {
            return pVar.w0(view);
        }
        if (!r && view2 != null) {
            return pVar.w0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int w0 = pVar.w0(view);
        if (s(pVar) == r) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = w0 + i3;
        if (i7 < 0 || i7 >= f) {
            return -1;
        }
        return i7;
    }

    public final t p(RecyclerView.p pVar) {
        if (pVar.t()) {
            return q(pVar);
        }
        if (pVar.s()) {
            return o(pVar);
        }
        return null;
    }

    public final boolean r(RecyclerView.p pVar, int i, int i2) {
        if (pVar.s()) {
            if (i <= 0) {
                return false;
            }
            return true;
        } else if (i2 <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean s(RecyclerView.p pVar) {
        PointF c;
        int f = pVar.f();
        if (!(pVar instanceof RecyclerView.C.b) || (c = ((RecyclerView.C.b) pVar).c(f - 1)) == null) {
            return false;
        }
        if (c.x >= 0.0f && c.y >= 0.0f) {
            return false;
        }
        return true;
    }
}
