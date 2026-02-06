package androidx.recyclerview.widget;

import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.E;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import o.C10907yF1;

/* loaded from: classes.dex */
public class g implements r.b {
    public final f a;
    public final E b;
    public List<WeakReference<RecyclerView>> c = new ArrayList();
    public final IdentityHashMap<RecyclerView.H, r> d = new IdentityHashMap<>();
    public List<r> e = new ArrayList();
    public a f = new a();
    public final f.a.b g;
    public final B h;

    /* loaded from: classes.dex */
    public static class a {
        public r a;
        public int b;
        public boolean c;
    }

    public g(f fVar, f.a aVar) {
        this.a = fVar;
        if (aVar.a) {
            this.b = new E.a();
        } else {
            this.b = new E.b();
        }
        f.a.b bVar = aVar.b;
        this.g = bVar;
        if (bVar == f.a.b.NO_STABLE_IDS) {
            this.h = new B.b();
        } else if (bVar == f.a.b.ISOLATED_STABLE_IDS) {
            this.h = new B.a();
        } else if (bVar == f.a.b.SHARED_STABLE_IDS) {
            this.h = new B.c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public void A(RecyclerView recyclerView) {
        if (!z(recyclerView)) {
            this.c.add(new WeakReference<>(recyclerView));
            for (r rVar : this.e) {
                rVar.c.w(recyclerView);
            }
        }
    }

    public void B(RecyclerView.H h, int i) {
        a n = n(i);
        this.d.put(h, n.a);
        n.a.e(h, n.b);
        I(n);
    }

    public RecyclerView.H C(ViewGroup viewGroup, int i) {
        return this.b.a(i).f(viewGroup, i);
    }

    public void D(RecyclerView recyclerView) {
        int size = this.c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.c.get(size);
            if (weakReference.get() == null) {
                this.c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.c.remove(size);
                break;
            }
            size--;
        }
        for (r rVar : this.e) {
            rVar.c.A(recyclerView);
        }
    }

    public boolean E(RecyclerView.H h) {
        r rVar = this.d.get(h);
        if (rVar != null) {
            boolean B = rVar.c.B(h);
            this.d.remove(h);
            return B;
        }
        throw new IllegalStateException("Cannot find wrapper for " + h + ", seems like it is not bound by this adapter: " + this);
    }

    public void F(RecyclerView.H h) {
        w(h).c.C(h);
    }

    public void G(RecyclerView.H h) {
        w(h).c.D(h);
    }

    public void H(RecyclerView.H h) {
        r rVar = this.d.get(h);
        if (rVar != null) {
            rVar.c.E(h);
            this.d.remove(h);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + h + ", seems like it is not bound by this adapter: " + this);
    }

    public final void I(a aVar) {
        aVar.c = false;
        aVar.a = null;
        aVar.b = -1;
        this.f = aVar;
    }

    public boolean J(RecyclerView.AbstractC0370h<RecyclerView.H> abstractC0370h) {
        int y = y(abstractC0370h);
        if (y == -1) {
            return false;
        }
        r rVar = this.e.get(y);
        int m = m(rVar);
        this.e.remove(y);
        this.a.u(m, rVar.b());
        for (WeakReference<RecyclerView> weakReference : this.c) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                abstractC0370h.A(recyclerView);
            }
        }
        rVar.a();
        j();
        return true;
    }

    @Override // androidx.recyclerview.widget.r.b
    public void a(r rVar, int i, int i2, Object obj) {
        this.a.s(i + m(rVar), i2, obj);
    }

    @Override // androidx.recyclerview.widget.r.b
    public void b(r rVar, int i, int i2) {
        this.a.t(i + m(rVar), i2);
    }

    @Override // androidx.recyclerview.widget.r.b
    public void c(r rVar, int i, int i2) {
        int m = m(rVar);
        this.a.q(i + m, i2 + m);
    }

    @Override // androidx.recyclerview.widget.r.b
    public void d(r rVar) {
        j();
    }

    @Override // androidx.recyclerview.widget.r.b
    public void e(r rVar, int i, int i2) {
        this.a.r(i + m(rVar), i2);
    }

    @Override // androidx.recyclerview.widget.r.b
    public void f(r rVar) {
        this.a.m();
        j();
    }

    @Override // androidx.recyclerview.widget.r.b
    public void g(r rVar, int i, int i2) {
        this.a.u(i + m(rVar), i2);
    }

    public boolean h(int i, RecyclerView.AbstractC0370h<RecyclerView.H> abstractC0370h) {
        if (i >= 0 && i <= this.e.size()) {
            if (x()) {
                C10907yF1.b(abstractC0370h.l(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else if (abstractC0370h.l()) {
                Log.w(f.e, "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            if (o(abstractC0370h) != null) {
                return false;
            }
            r rVar = new r(abstractC0370h, this, this.b, this.h.a());
            this.e.add(i, rVar);
            for (WeakReference<RecyclerView> weakReference : this.c) {
                RecyclerView recyclerView = weakReference.get();
                if (recyclerView != null) {
                    abstractC0370h.w(recyclerView);
                }
            }
            if (rVar.b() > 0) {
                this.a.t(m(rVar), rVar.b());
            }
            j();
            return true;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.e.size() + ". Given:" + i);
    }

    public boolean i(RecyclerView.AbstractC0370h<RecyclerView.H> abstractC0370h) {
        return h(this.e.size(), abstractC0370h);
    }

    public final void j() {
        RecyclerView.AbstractC0370h.a l = l();
        if (l != this.a.j()) {
            this.a.N(l);
        }
    }

    public boolean k() {
        for (r rVar : this.e) {
            if (!rVar.c.d()) {
                return false;
            }
        }
        return true;
    }

    public final RecyclerView.AbstractC0370h.a l() {
        for (r rVar : this.e) {
            RecyclerView.AbstractC0370h.a j = rVar.c.j();
            RecyclerView.AbstractC0370h.a aVar = RecyclerView.AbstractC0370h.a.PREVENT;
            if (j == aVar || (j == RecyclerView.AbstractC0370h.a.PREVENT_WHEN_EMPTY && rVar.b() == 0)) {
                return aVar;
            }
        }
        return RecyclerView.AbstractC0370h.a.ALLOW;
    }

    public final int m(r rVar) {
        r next;
        Iterator<r> it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != rVar) {
            i += next.b();
        }
        return i;
    }

    public final a n(int i) {
        a aVar = this.f;
        if (aVar.c) {
            aVar = new a();
        } else {
            aVar.c = true;
        }
        Iterator<r> it = this.e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r next = it.next();
            if (next.b() > i2) {
                aVar.a = next;
                aVar.b = i2;
                break;
            }
            i2 -= next.b();
        }
        if (aVar.a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    public final r o(RecyclerView.AbstractC0370h<RecyclerView.H> abstractC0370h) {
        int y = y(abstractC0370h);
        if (y == -1) {
            return null;
        }
        return this.e.get(y);
    }

    public RecyclerView.AbstractC0370h<? extends RecyclerView.H> p(RecyclerView.H h) {
        r rVar = this.d.get(h);
        if (rVar == null) {
            return null;
        }
        return rVar.c;
    }

    public List<RecyclerView.AbstractC0370h<? extends RecyclerView.H>> q() {
        if (this.e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        for (r rVar : this.e) {
            arrayList.add(rVar.c);
        }
        return arrayList;
    }

    public long r(int i) {
        a n = n(i);
        long c = n.a.c(n.b);
        I(n);
        return c;
    }

    public int s(int i) {
        a n = n(i);
        int d = n.a.d(n.b);
        I(n);
        return d;
    }

    public int t(RecyclerView.AbstractC0370h<? extends RecyclerView.H> abstractC0370h, RecyclerView.H h, int i) {
        r rVar = this.d.get(h);
        if (rVar == null) {
            return -1;
        }
        int m = i - m(rVar);
        int g = rVar.c.g();
        if (m >= 0 && m < g) {
            return rVar.c.f(abstractC0370h, h, m);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + m + " which is out of bounds for the adapter with size " + g + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + h + "adapter:" + abstractC0370h);
    }

    public int u() {
        int i = 0;
        for (r rVar : this.e) {
            i += rVar.b();
        }
        return i;
    }

    public Pair<RecyclerView.AbstractC0370h<? extends RecyclerView.H>, Integer> v(int i) {
        a n = n(i);
        Pair<RecyclerView.AbstractC0370h<? extends RecyclerView.H>, Integer> pair = new Pair<>(n.a.c, Integer.valueOf(n.b));
        I(n);
        return pair;
    }

    public final r w(RecyclerView.H h) {
        r rVar = this.d.get(h);
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + h + ", seems like it is not bound by this adapter: " + this);
    }

    public boolean x() {
        if (this.g != f.a.b.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    public final int y(RecyclerView.AbstractC0370h<RecyclerView.H> abstractC0370h) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (this.e.get(i).c == abstractC0370h) {
                return i;
            }
        }
        return -1;
    }

    public final boolean z(RecyclerView recyclerView) {
        for (WeakReference<RecyclerView> weakReference : this.c) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }
}
