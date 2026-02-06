package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class x extends RecyclerView.m {
    public static final boolean m = false;
    public static final String n = "SimpleItemAnimator";
    public boolean l = true;

    public abstract boolean D(RecyclerView.H h);

    public abstract boolean E(RecyclerView.H h, RecyclerView.H h2, int i, int i2, int i3, int i4);

    public abstract boolean F(RecyclerView.H h, int i, int i2, int i3, int i4);

    public abstract boolean G(RecyclerView.H h);

    public final void H(RecyclerView.H h) {
        Q(h);
        h(h);
    }

    public final void I(RecyclerView.H h) {
        R(h);
    }

    public final void J(RecyclerView.H h, boolean z) {
        S(h, z);
        h(h);
    }

    public final void K(RecyclerView.H h, boolean z) {
        T(h, z);
    }

    public final void L(RecyclerView.H h) {
        U(h);
        h(h);
    }

    public final void M(RecyclerView.H h) {
        V(h);
    }

    public final void N(RecyclerView.H h) {
        W(h);
        h(h);
    }

    public final void O(RecyclerView.H h) {
        X(h);
    }

    public boolean P() {
        return this.l;
    }

    public void Q(RecyclerView.H h) {
    }

    public void R(RecyclerView.H h) {
    }

    public void S(RecyclerView.H h, boolean z) {
    }

    public void T(RecyclerView.H h, boolean z) {
    }

    public void U(RecyclerView.H h) {
    }

    public void V(RecyclerView.H h) {
    }

    public void W(RecyclerView.H h) {
    }

    public void X(RecyclerView.H h) {
    }

    public void Y(boolean z) {
        this.l = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.H h, RecyclerView.m.d dVar, RecyclerView.m.d dVar2) {
        int i;
        int i2;
        if (dVar != null && ((i = dVar.a) != (i2 = dVar2.a) || dVar.b != dVar2.b)) {
            return F(h, i, dVar.b, i2, dVar2.b);
        }
        return D(h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.H h, RecyclerView.H h2, RecyclerView.m.d dVar, RecyclerView.m.d dVar2) {
        int i;
        int i2;
        int i3 = dVar.a;
        int i4 = dVar.b;
        if (h2.N()) {
            int i5 = dVar.a;
            i2 = dVar.b;
            i = i5;
        } else {
            i = dVar2.a;
            i2 = dVar2.b;
        }
        return E(h, h2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.H h, RecyclerView.m.d dVar, RecyclerView.m.d dVar2) {
        int i;
        int i2;
        int i3 = dVar.a;
        int i4 = dVar.b;
        View view = h.a;
        if (dVar2 == null) {
            i = view.getLeft();
        } else {
            i = dVar2.a;
        }
        int i5 = i;
        if (dVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = dVar2.b;
        }
        int i6 = i2;
        if (!h.z() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            return F(h, i3, i4, i5, i6);
        }
        return G(h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.H h, RecyclerView.m.d dVar, RecyclerView.m.d dVar2) {
        int i = dVar.a;
        int i2 = dVar2.a;
        if (i == i2 && dVar.b == dVar2.b) {
            L(h);
            return false;
        }
        return F(h, i, dVar.b, i2, dVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.H h) {
        if (this.l && !h.x()) {
            return false;
        }
        return true;
    }
}
