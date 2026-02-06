package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class t {
    public static final int d = Integer.MIN_VALUE;
    public static final int e = 0;
    public static final int f = 1;
    public final RecyclerView.p a;
    public int b;
    public final Rect c;

    /* loaded from: classes.dex */
    public class a extends t {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.t
        public int d(View view) {
            return this.a.g0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.f0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int g(View view) {
            return this.a.d0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int h() {
            return this.a.D0();
        }

        @Override // androidx.recyclerview.widget.t
        public int i() {
            return this.a.D0() - this.a.t0();
        }

        @Override // androidx.recyclerview.widget.t
        public int j() {
            return this.a.t0();
        }

        @Override // androidx.recyclerview.widget.t
        public int l() {
            return this.a.E0();
        }

        @Override // androidx.recyclerview.widget.t
        public int m() {
            return this.a.k0();
        }

        @Override // androidx.recyclerview.widget.t
        public int n() {
            return this.a.s0();
        }

        @Override // androidx.recyclerview.widget.t
        public int o() {
            return (this.a.D0() - this.a.s0()) - this.a.t0();
        }

        @Override // androidx.recyclerview.widget.t
        public int q(View view) {
            this.a.C0(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.t
        public int r(View view) {
            this.a.C0(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.t
        public void s(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        @Override // androidx.recyclerview.widget.t
        public void t(int i) {
            this.a.X0(i);
        }
    }

    /* loaded from: classes.dex */
    public class b extends t {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.t
        public int d(View view) {
            return this.a.b0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.f0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int g(View view) {
            return this.a.h0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int h() {
            return this.a.j0();
        }

        @Override // androidx.recyclerview.widget.t
        public int i() {
            return this.a.j0() - this.a.q0();
        }

        @Override // androidx.recyclerview.widget.t
        public int j() {
            return this.a.q0();
        }

        @Override // androidx.recyclerview.widget.t
        public int l() {
            return this.a.k0();
        }

        @Override // androidx.recyclerview.widget.t
        public int m() {
            return this.a.E0();
        }

        @Override // androidx.recyclerview.widget.t
        public int n() {
            return this.a.v0();
        }

        @Override // androidx.recyclerview.widget.t
        public int o() {
            return (this.a.j0() - this.a.v0()) - this.a.q0();
        }

        @Override // androidx.recyclerview.widget.t
        public int q(View view) {
            this.a.C0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.t
        public int r(View view) {
            this.a.C0(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.t
        public void s(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        @Override // androidx.recyclerview.widget.t
        public void t(int i) {
            this.a.Y0(i);
        }
    }

    public /* synthetic */ t(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static t a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static t b(RecyclerView.p pVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return c(pVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(pVar);
    }

    public static t c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.p k() {
        return this.a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return o() - this.b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i);

    public abstract void t(int i);

    public void u() {
        this.b = o();
    }

    public t(RecyclerView.p pVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = pVar;
    }
}
