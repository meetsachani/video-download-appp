package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class y extends RecyclerView.s {
    public static final float d = 100.0f;
    public RecyclerView a;
    public Scroller b;
    public final RecyclerView.u c = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.u {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                y.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends o {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.C
        public void p(View view, RecyclerView.D d, RecyclerView.C.a aVar) {
            y yVar = y.this;
            RecyclerView recyclerView = yVar.a;
            if (recyclerView != null) {
                int[] c = yVar.c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int x = x(Math.max(Math.abs(i), Math.abs(i2)));
                if (x > 0) {
                    aVar.l(i, i2, x, this.j);
                }
            }
        }

        @Override // androidx.recyclerview.widget.o
        public float w(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i, int i2) {
        RecyclerView.p layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !k(layoutManager, i, i2)) {
            return false;
        }
        return true;
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                g();
            }
            this.a = recyclerView;
            if (recyclerView != null) {
                j();
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                l();
            }
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    public int[] d(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    public RecyclerView.C e(RecyclerView.p pVar) {
        return f(pVar);
    }

    @Deprecated
    public o f(RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.C.b)) {
            return null;
        }
        return new b(this.a.getContext());
    }

    public final void g() {
        this.a.C1(this.c);
        this.a.setOnFlingListener(null);
    }

    public abstract View h(RecyclerView.p pVar);

    public abstract int i(RecyclerView.p pVar, int i, int i2);

    public final void j() throws IllegalStateException {
        if (this.a.getOnFlingListener() == null) {
            this.a.r(this.c);
            this.a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public final boolean k(RecyclerView.p pVar, int i, int i2) {
        RecyclerView.C e;
        int i3;
        if (!(pVar instanceof RecyclerView.C.b) || (e = e(pVar)) == null || (i3 = i(pVar, i, i2)) == -1) {
            return false;
        }
        e.q(i3);
        pVar.k2(e);
        return true;
    }

    public void l() {
        RecyclerView.p layoutManager;
        View h;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = h(layoutManager)) != null) {
            int[] c = c(layoutManager, h);
            int i = c[0];
            if (i == 0 && c[1] == 0) {
                return;
            }
            this.a.R1(i, c[1]);
        }
    }
}
