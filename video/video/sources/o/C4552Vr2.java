package o;

import java.util.Iterator;

/* renamed from: o.Vr2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4552Vr2<I, O> implements Iterator<O> {
    public Iterator<? extends I> X;
    public InterfaceC3287Is2<? super I, ? extends O> Y;

    public C4552Vr2() {
    }

    public Iterator<? extends I> b() {
        return this.X;
    }

    public InterfaceC3287Is2<? super I, ? extends O> c() {
        return this.Y;
    }

    public void d(Iterator<? extends I> it) {
        this.X = it;
    }

    public void e(InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        this.Y = interfaceC3287Is2;
    }

    public O f(I i) {
        return this.Y.a(i);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public O next() {
        return f(this.X.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.X.remove();
    }

    public C4552Vr2(Iterator<? extends I> it) {
        this.X = it;
    }

    public C4552Vr2(Iterator<? extends I> it, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        this.X = it;
        this.Y = interfaceC3287Is2;
    }
}
