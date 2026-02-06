package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import o.InterfaceC6439g11;

/* renamed from: androidx.recyclerview.widget.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372b implements InterfaceC6439g11 {
    public final RecyclerView.AbstractC0370h X;

    public C0372b(RecyclerView.AbstractC0370h abstractC0370h) {
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

    @Override // o.InterfaceC6439g11
    public void c(int i, int i2, Object obj) {
        this.X.s(i, i2, obj);
    }

    @Override // o.InterfaceC6439g11
    public void d(int i, int i2) {
        this.X.q(i, i2);
    }
}
