package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class G1<E> extends AbstractC7180j2<E> implements Serializable {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    public transient long Y0;
    public transient C5920dt1<E> Z;

    /* loaded from: classes3.dex */
    public class a extends G1<E>.c<E> {
        public a() {
            super();
        }

        @Override // o.G1.c
        @InterfaceC7894ly1
        public E c(int i) {
            return G1.this.Z.j(i);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends G1<E>.c<InterfaceC2467Am1.a<E>> {
        public b() {
            super();
        }

        @Override // o.G1.c
        /* renamed from: d */
        public InterfaceC2467Am1.a<E> c(int i) {
            return G1.this.Z.h(i);
        }
    }

    /* loaded from: classes3.dex */
    public abstract class c<T> implements Iterator<T> {
        public int X;
        public int Y = -1;
        public int Z;

        public c() {
            this.X = G1.this.Z.f();
            this.Z = G1.this.Z.d;
        }

        public final void b() {
            if (G1.this.Z.d == this.Z) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @InterfaceC7894ly1
        public abstract T c(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            if (this.X >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            if (hasNext()) {
                T c = c(this.X);
                int i = this.X;
                this.Y = i;
                this.X = G1.this.Z.t(i);
                return c;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            G1 g1;
            b();
            if (this.Y != -1) {
                z = true;
            } else {
                z = false;
            }
            C5037aF.e(z);
            G1.this.Y0 -= g1.Z.y(this.Y);
            this.X = G1.this.Z.u(this.X, this.Y);
            this.Y = -1;
            this.Z = G1.this.Z.d;
        }
    }

    public G1(int i) {
        this.Z = k(i);
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int h = C9634t12.h(objectInputStream);
        this.Z = k(3);
        C9634t12.g(this, objectInputStream, h);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C9634t12.k(this, objectOutputStream);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public final int R(@InterfaceC7894ly1 E e, int i) {
        int v;
        C5037aF.b(i, "count");
        C5920dt1<E> c5920dt1 = this.Z;
        if (i == 0) {
            v = c5920dt1.w(e);
        } else {
            v = c5920dt1.v(e, i);
        }
        this.Y0 += i - v;
        return v;
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    public final boolean Y3(@InterfaceC7894ly1 E e, int i, int i2) {
        C5037aF.b(i, "oldCount");
        C5037aF.b(i2, "newCount");
        int n = this.Z.n(e);
        if (n == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.Z.v(e, i2);
                this.Y0 += i2;
            }
            return true;
        } else if (this.Z.l(n) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.Z.y(n);
                this.Y0 -= i;
            } else {
                this.Z.C(n, i2);
                this.Y0 += i2 - i;
            }
            return true;
        }
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.Z.a();
        this.Y0 = 0L;
    }

    @Override // o.AbstractC7180j2
    public final int f() {
        return this.Z.D();
    }

    @Override // o.AbstractC7180j2
    public final Iterator<E> h() {
        return new a();
    }

    @Override // o.AbstractC7180j2
    public final Iterator<InterfaceC2467Am1.a<E>> i() {
        return new b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
    public final Iterator<E> iterator() {
        return C2565Bm1.n(this);
    }

    public void j(InterfaceC2467Am1<? super E> interfaceC2467Am1) {
        C10664xF1.E(interfaceC2467Am1);
        int f = this.Z.f();
        while (f >= 0) {
            interfaceC2467Am1.x((E) this.Z.j(f), this.Z.l(f));
            f = this.Z.t(f);
        }
    }

    public abstract C5920dt1<E> k(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public final int size() {
        return C7775lT0.x(this.Y0);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public final int v(@MB Object obj, int i) {
        boolean z;
        if (i == 0) {
            return w4(obj);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "occurrences cannot be negative: %s", i);
        int n = this.Z.n(obj);
        if (n == -1) {
            return 0;
        }
        int l = this.Z.l(n);
        if (l > i) {
            this.Z.C(n, l - i);
        } else {
            this.Z.y(n);
            i = l;
        }
        this.Y0 -= i;
        return l;
    }

    @Override // o.InterfaceC2467Am1
    public final int w4(@MB Object obj) {
        return this.Z.g(obj);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public final int x(@InterfaceC7894ly1 E e, int i) {
        boolean z;
        if (i == 0) {
            return w4(e);
        }
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "occurrences cannot be negative: %s", i);
        int n = this.Z.n(e);
        if (n == -1) {
            this.Z.v(e, i);
            this.Y0 += i;
            return 0;
        }
        int l = this.Z.l(n);
        long j = i;
        long j2 = l + j;
        if (j2 > 2147483647L) {
            z2 = false;
        }
        C10664xF1.p(z2, "too many occurrences: %s", j2);
        this.Z.C(n, (int) j2);
        this.Y0 += j;
        return l;
    }
}
