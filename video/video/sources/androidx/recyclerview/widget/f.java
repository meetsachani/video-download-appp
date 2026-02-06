package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends RecyclerView.AbstractC0370h<RecyclerView.H> {
    public static final String e = "ConcatAdapter";
    public final g d;

    /* loaded from: classes.dex */
    public static final class a {
        public static final a c = new a(true, b.NO_STABLE_IDS);
        public final boolean a;
        public final b b;

        /* renamed from: androidx.recyclerview.widget.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0042a {
            public boolean a;
            public b b;

            public C0042a() {
                a aVar = a.c;
                this.a = aVar.a;
                this.b = aVar.b;
            }

            public a a() {
                return new a(this.a, this.b);
            }

            public C0042a b(boolean z) {
                this.a = z;
                return this;
            }

            public C0042a c(b bVar) {
                this.b = bVar;
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum b {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public a(boolean z, b bVar) {
            this.a = z;
            this.b = bVar;
        }
    }

    @SafeVarargs
    public f(RecyclerView.AbstractC0370h<? extends RecyclerView.H>... abstractC0370hArr) {
        this(a.c, abstractC0370hArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void A(RecyclerView recyclerView) {
        this.d.D(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public boolean B(RecyclerView.H h) {
        return this.d.E(h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void C(RecyclerView.H h) {
        this.d.F(h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void D(RecyclerView.H h) {
        this.d.G(h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void E(RecyclerView.H h) {
        this.d.H(h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void G(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void H(RecyclerView.AbstractC0370h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public boolean J(int i, RecyclerView.AbstractC0370h<? extends RecyclerView.H> abstractC0370h) {
        return this.d.h(i, abstractC0370h);
    }

    public boolean K(RecyclerView.AbstractC0370h<? extends RecyclerView.H> abstractC0370h) {
        return this.d.i(abstractC0370h);
    }

    public List<? extends RecyclerView.AbstractC0370h<? extends RecyclerView.H>> L() {
        return Collections.unmodifiableList(this.d.q());
    }

    public Pair<RecyclerView.AbstractC0370h<? extends RecyclerView.H>, Integer> M(int i) {
        return this.d.v(i);
    }

    public void N(RecyclerView.AbstractC0370h.a aVar) {
        super.H(aVar);
    }

    public boolean O(RecyclerView.AbstractC0370h<? extends RecyclerView.H> abstractC0370h) {
        return this.d.J(abstractC0370h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int f(RecyclerView.AbstractC0370h<? extends RecyclerView.H> abstractC0370h, RecyclerView.H h, int i) {
        return this.d.t(abstractC0370h, h, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.d.u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public long h(int i) {
        return this.d.r(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int i(int i) {
        return this.d.s(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void w(RecyclerView recyclerView) {
        this.d.A(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void x(RecyclerView.H h, int i) {
        this.d.B(h, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public RecyclerView.H z(ViewGroup viewGroup, int i) {
        return this.d.C(viewGroup, i);
    }

    @SafeVarargs
    public f(a aVar, RecyclerView.AbstractC0370h<? extends RecyclerView.H>... abstractC0370hArr) {
        this(aVar, Arrays.asList(abstractC0370hArr));
    }

    public f(List<? extends RecyclerView.AbstractC0370h<? extends RecyclerView.H>> list) {
        this(a.c, list);
    }

    public f(a aVar, List<? extends RecyclerView.AbstractC0370h<? extends RecyclerView.H>> list) {
        this.d = new g(this, aVar);
        for (RecyclerView.AbstractC0370h<? extends RecyclerView.H> abstractC0370h : list) {
            K(abstractC0370h);
        }
        super.G(this.d.x());
    }
}
