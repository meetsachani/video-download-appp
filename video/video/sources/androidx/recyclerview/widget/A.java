package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;

/* loaded from: classes.dex */
public abstract class A<T2> extends z.b<T2> {
    public final RecyclerView.AbstractC0370h<?> X;

    public A(RecyclerView.AbstractC0370h<?> abstractC0370h) {
        this.X = abstractC0370h;
    }

    @Override // o.InterfaceC6439g11
    public void a(int i, int i2) {
        this.X.t(i, i2);
    }

    @Override // o.InterfaceC6439g11
    public void b(int i, int i2) {
        this.X.u(i, i2);
    }

    @Override // androidx.recyclerview.widget.z.b, o.InterfaceC6439g11
    public void c(int i, int i2, Object obj) {
        this.X.s(i, i2, obj);
    }

    @Override // o.InterfaceC6439g11
    public void d(int i, int i2) {
        this.X.q(i, i2);
    }

    @Override // androidx.recyclerview.widget.z.b
    public void h(int i, int i2) {
        this.X.r(i, i2);
    }
}
