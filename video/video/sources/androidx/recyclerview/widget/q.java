package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0373c;
import androidx.recyclerview.widget.C0374d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.H;
import androidx.recyclerview.widget.i;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q<T, VH extends RecyclerView.H> extends RecyclerView.AbstractC0370h<VH> {
    public final C0374d<T> d;
    public final C0374d.b<T> e;

    /* loaded from: classes.dex */
    public class a implements C0374d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C0374d.b
        public void a(List<T> list, List<T> list2) {
            q.this.L(list, list2);
        }
    }

    public q(i.f<T> fVar) {
        a aVar = new a();
        this.e = aVar;
        C0374d<T> c0374d = new C0374d<>(new C0372b(this), new C0373c.a(fVar).a());
        this.d = c0374d;
        c0374d.a(aVar);
    }

    public List<T> J() {
        return this.d.b();
    }

    public T K(int i) {
        return this.d.b().get(i);
    }

    public void L(List<T> list, List<T> list2) {
    }

    public void M(List<T> list) {
        this.d.f(list);
    }

    public void N(List<T> list, Runnable runnable) {
        this.d.g(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.d.b().size();
    }

    public q(C0373c<T> c0373c) {
        a aVar = new a();
        this.e = aVar;
        C0374d<T> c0374d = new C0374d<>(new C0372b(this), c0373c);
        this.d = c0374d;
        c0374d.a(aVar);
    }
}
