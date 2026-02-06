package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.C2565Bm1;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.j2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7180j2<E> extends AbstractCollection<E> implements InterfaceC2467Am1<E> {
    @MB
    @SY0
    public transient Set<E> X;
    @MB
    @SY0
    public transient Set<InterfaceC2467Am1.a<E>> Y;

    /* renamed from: o.j2$a */
    /* loaded from: classes3.dex */
    public class a extends C2565Bm1.h<E> {
        public a() {
        }

        @Override // o.C2565Bm1.h
        public InterfaceC2467Am1<E> i() {
            return AbstractC7180j2.this;
        }

        @Override // o.C2565Bm1.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractC7180j2.this.h();
        }
    }

    /* renamed from: o.j2$b */
    /* loaded from: classes3.dex */
    public class b extends C2565Bm1.i<E> {
        public b() {
        }

        @Override // o.C2565Bm1.i
        public InterfaceC2467Am1<E> i() {
            return AbstractC7180j2.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC2467Am1.a<E>> iterator() {
            return AbstractC7180j2.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC7180j2.this.f();
        }
    }

    @InterfaceC6181ey
    public int R(@InterfaceC7894ly1 E e, int i) {
        return C2565Bm1.v(this, e, i);
    }

    @InterfaceC6181ey
    public boolean Y3(@InterfaceC7894ly1 E e, int i, int i2) {
        return C2565Bm1.w(this, e, i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public final boolean add(@InterfaceC7894ly1 E e) {
        x(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    public final boolean addAll(Collection<? extends E> collection) {
        return C2565Bm1.a(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public boolean contains(@MB Object obj) {
        if (w4(obj) > 0) {
            return true;
        }
        return false;
    }

    public Set<E> d() {
        return new a();
    }

    public Set<InterfaceC2467Am1.a<E>> e() {
        return new b();
    }

    public Set<InterfaceC2467Am1.a<E>> entrySet() {
        Set<InterfaceC2467Am1.a<E>> set = this.Y;
        if (set == null) {
            Set<InterfaceC2467Am1.a<E>> e = e();
            this.Y = e;
            return e;
        }
        return set;
    }

    @Override // java.util.Collection, o.InterfaceC2467Am1
    public final boolean equals(@MB Object obj) {
        return C2565Bm1.i(this, obj);
    }

    public abstract int f();

    public abstract Iterator<E> h();

    @Override // java.util.Collection, o.InterfaceC2467Am1
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public abstract Iterator<InterfaceC2467Am1.a<E>> i();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public Set<E> n() {
        Set<E> set = this.X;
        if (set == null) {
            Set<E> d = d();
            this.X = d;
            return d;
        }
        return set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public final boolean remove(@MB Object obj) {
        if (v(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public final boolean removeAll(Collection<?> collection) {
        return C2565Bm1.p(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public final boolean retainAll(Collection<?> collection) {
        return C2565Bm1.s(this, collection);
    }

    @Override // java.util.AbstractCollection, o.InterfaceC2467Am1
    public final String toString() {
        return entrySet().toString();
    }

    @InterfaceC6181ey
    public int v(@MB Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC6181ey
    public int x(@InterfaceC7894ly1 E e, int i) {
        throw new UnsupportedOperationException();
    }
}
