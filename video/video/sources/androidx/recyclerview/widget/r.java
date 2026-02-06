package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.E;
import androidx.recyclerview.widget.RecyclerView;
import o.C10907yF1;

/* loaded from: classes.dex */
public class r {
    public final E.c a;
    public final B.d b;
    public final RecyclerView.AbstractC0370h<RecyclerView.H> c;
    public final b d;
    public int e;
    public RecyclerView.j f = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            r rVar = r.this;
            rVar.e = rVar.c.g();
            r rVar2 = r.this;
            rVar2.d.f(rVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i, int i2) {
            r rVar = r.this;
            rVar.d.a(rVar, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            r rVar = r.this;
            rVar.d.a(rVar, i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i, int i2) {
            r rVar = r.this;
            rVar.e += i2;
            rVar.d.b(rVar, i, i2);
            r rVar2 = r.this;
            if (rVar2.e > 0 && rVar2.c.j() == RecyclerView.AbstractC0370h.a.PREVENT_WHEN_EMPTY) {
                r rVar3 = r.this;
                rVar3.d.d(rVar3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i, int i2, int i3) {
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            C10907yF1.b(z, "moving more than 1 item is not supported in RecyclerView");
            r rVar = r.this;
            rVar.d.c(rVar, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i, int i2) {
            r rVar = r.this;
            rVar.e -= i2;
            rVar.d.g(rVar, i, i2);
            r rVar2 = r.this;
            if (rVar2.e < 1 && rVar2.c.j() == RecyclerView.AbstractC0370h.a.PREVENT_WHEN_EMPTY) {
                r rVar3 = r.this;
                rVar3.d.d(rVar3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            r rVar = r.this;
            rVar.d.d(rVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(r rVar, int i, int i2, Object obj);

        void b(r rVar, int i, int i2);

        void c(r rVar, int i, int i2);

        void d(r rVar);

        void e(r rVar, int i, int i2);

        void f(r rVar);

        void g(r rVar, int i, int i2);
    }

    public r(RecyclerView.AbstractC0370h<RecyclerView.H> abstractC0370h, b bVar, E e, B.d dVar) {
        this.c = abstractC0370h;
        this.d = bVar;
        this.a = e.b(this);
        this.b = dVar;
        this.e = abstractC0370h.g();
        abstractC0370h.F(this.f);
    }

    public void a() {
        this.c.I(this.f);
        this.a.e();
    }

    public int b() {
        return this.e;
    }

    public long c(int i) {
        return this.b.a(this.c.h(i));
    }

    public int d(int i) {
        return this.a.g(this.c.i(i));
    }

    public void e(RecyclerView.H h, int i) {
        this.c.c(h, i);
    }

    public RecyclerView.H f(ViewGroup viewGroup, int i) {
        return this.c.z(viewGroup, this.a.f(i));
    }
}
