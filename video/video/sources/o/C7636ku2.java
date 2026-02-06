package o;

import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.ku2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7636ku2<E> extends AbstractList<E> {
    public b<E> X;
    public int Y;

    /* renamed from: o.ku2$c */
    /* loaded from: classes4.dex */
    public static class c<E> implements ListIterator<E>, InterfaceC8877pw1<E> {
        public final C7636ku2<E> X;
        public b<E> Y;
        public b<E> Y0;
        public int Z;
        public int Z0;
        public int a1;

        public c(C7636ku2<E> c7636ku2, int i) throws IndexOutOfBoundsException {
            b<E> f;
            this.X = c7636ku2;
            this.a1 = ((AbstractList) c7636ku2).modCount;
            if (c7636ku2.X == null) {
                f = null;
            } else {
                f = c7636ku2.X.f(i);
            }
            this.Y = f;
            this.Z = i;
            this.Z0 = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            b();
            this.X.add(this.Z, e);
            this.Y0 = null;
            this.Z0 = -1;
            this.Z++;
            this.a1++;
        }

        public void b() {
            if (((AbstractList) this.X).modCount == this.a1) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.Z < this.X.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            if (this.Z > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (hasNext()) {
                if (this.Y == null) {
                    this.Y = this.X.X.f(this.Z);
                }
                E k = this.Y.k();
                b<E> bVar = this.Y;
                this.Y0 = bVar;
                int i = this.Z;
                this.Z = i + 1;
                this.Z0 = i;
                this.Y = bVar.s();
                return k;
            }
            throw new NoSuchElementException("No element at index " + this.Z + UE.h);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Z;
        }

        @Override // java.util.ListIterator, o.InterfaceC8877pw1
        public E previous() {
            b();
            if (hasPrevious()) {
                b<E> bVar = this.Y;
                if (bVar == null) {
                    this.Y = this.X.X.f(this.Z - 1);
                } else {
                    this.Y = bVar.t();
                }
                E k = this.Y.k();
                this.Y0 = this.Y;
                int i = this.Z - 1;
                this.Z = i;
                this.Z0 = i;
                return k;
            }
            throw new NoSuchElementException("Already at start of list.");
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return nextIndex() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i = this.Z0;
            if (i != -1) {
                this.X.remove(i);
                int i2 = this.Z;
                if (i2 != this.Z0) {
                    this.Z = i2 - 1;
                }
                this.Y = null;
                this.Y0 = null;
                this.Z0 = -1;
                this.a1++;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            b();
            b<E> bVar = this.Y0;
            if (bVar != null) {
                bVar.E(e);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C7636ku2() {
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        ((AbstractList) this).modCount++;
        h(i, 0, size());
        b<E> bVar = this.X;
        if (bVar == null) {
            this.X = new b<>(i, e, null, null);
        } else {
            this.X = bVar.n(i, e);
        }
        this.Y++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount += collection.size();
        b<E> bVar = new b<>(collection);
        b<E> bVar2 = this.X;
        if (bVar2 != null) {
            bVar = bVar2.d(bVar, this.Y);
        }
        this.X = bVar;
        this.Y += collection.size();
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ((AbstractList) this).modCount++;
        this.X = null;
        this.Y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        h(i, 0, size() - 1);
        return this.X.f(i).k();
    }

    public final void h(int i, int i2, int i3) {
        if (i >= i2 && i <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("Invalid index:" + i + ", size=" + size());
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        b<E> bVar = this.X;
        if (bVar == null) {
            return -1;
        }
        return bVar.m(obj, bVar.f);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        ((AbstractList) this).modCount++;
        h(i, 0, size() - 1);
        E e = get(i);
        this.X = this.X.v(i);
        this.Y--;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        h(i, 0, size() - 1);
        b<E> f = this.X.f(i);
        E e2 = (E) f.g;
        f.E(e);
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        b<E> bVar = this.X;
        if (bVar != null) {
            bVar.F(objArr, bVar.f);
        }
        return objArr;
    }

    /* renamed from: o.ku2$b */
    /* loaded from: classes4.dex */
    public static class b<E> {
        public b<E> a;
        public boolean b;
        public b<E> c;
        public boolean d;
        public int e;
        public int f;
        public E g;

        public final b<E> A() {
            b<E> bVar = this.a;
            b<E> j = h().j();
            int i = this.f + i(bVar);
            B(j, bVar);
            bVar.D(this, null);
            C(bVar, i);
            C(this, -bVar.f);
            C(j, i(bVar) + i(j));
            return bVar;
        }

        public final void B(b<E> bVar, b<E> bVar2) {
            boolean z;
            if (bVar == null) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
            if (z) {
                bVar = bVar2;
            }
            this.a = bVar;
            u();
        }

        public final int C(b<E> bVar, int i) {
            if (bVar == null) {
                return 0;
            }
            int i2 = i(bVar);
            bVar.f = i;
            return i2;
        }

        public final void D(b<E> bVar, b<E> bVar2) {
            boolean z;
            if (bVar == null) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            if (z) {
                bVar = bVar2;
            }
            this.c = bVar;
            u();
        }

        public void E(E e) {
            this.g = e;
        }

        public void F(Object[] objArr, int i) {
            objArr[i] = this.g;
            if (h() != null) {
                b<E> bVar = this.a;
                bVar.F(objArr, bVar.f + i);
            }
            if (j() != null) {
                b<E> bVar2 = this.c;
                bVar2.F(objArr, i + bVar2.f);
            }
        }

        public final b<E> d(b<E> bVar, int i) {
            b<E> q = q();
            b<E> r = bVar.r();
            if (bVar.e > this.e) {
                b<E> w = w();
                ArrayDeque arrayDeque = new ArrayDeque();
                int i2 = 0;
                int i3 = bVar.f + i;
                b<E> bVar2 = bVar;
                while (bVar2 != null && bVar2.e > g(w)) {
                    arrayDeque.push(bVar2);
                    bVar2 = bVar2.a;
                    if (bVar2 != null) {
                        i2 = i3;
                        i3 = bVar2.f + i3;
                    } else {
                        i2 = i3;
                    }
                }
                q.B(w, null);
                q.D(bVar2, r);
                if (w != null) {
                    w.q().D(null, q);
                    w.f -= i - 1;
                }
                if (bVar2 != null) {
                    bVar2.r().B(null, q);
                    bVar2.f = (i3 - i) + 1;
                }
                q.f = (i - 1) - i2;
                bVar.f += i;
                while (!arrayDeque.isEmpty()) {
                    b bVar3 = (b) arrayDeque.pop();
                    bVar3.B(q, null);
                    q = bVar3.e();
                }
                return q;
            }
            b<E> x = bVar.x();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int i4 = this.f;
            int i5 = 0;
            b<E> bVar4 = this;
            while (bVar4 != null && bVar4.e > g(x)) {
                arrayDeque2.push(bVar4);
                bVar4 = bVar4.c;
                if (bVar4 != null) {
                    int i6 = i4;
                    i4 = bVar4.f + i4;
                    i5 = i6;
                } else {
                    i5 = i4;
                }
            }
            r.D(x, null);
            r.B(bVar4, q);
            if (x != null) {
                x.r().B(null, r);
                x.f++;
            }
            if (bVar4 != null) {
                bVar4.q().D(null, r);
                bVar4.f = i4 - i;
            }
            r.f = i - i5;
            while (!arrayDeque2.isEmpty()) {
                b bVar5 = (b) arrayDeque2.pop();
                bVar5.D(r, null);
                r = bVar5.e();
            }
            return r;
        }

        public final b<E> e() {
            int l = l();
            if (l != -2) {
                if (l != -1 && l != 0 && l != 1) {
                    if (l == 2) {
                        if (this.c.l() < 0) {
                            D(this.c.A(), null);
                        }
                        return z();
                    }
                    throw new RuntimeException("tree inconsistent!");
                }
                return this;
            }
            if (this.a.l() > 0) {
                B(this.a.z(), null);
            }
            return A();
        }

        public b<E> f(int i) {
            b<E> j;
            int i2 = i - this.f;
            if (i2 == 0) {
                return this;
            }
            if (i2 < 0) {
                j = h();
            } else {
                j = j();
            }
            if (j == null) {
                return null;
            }
            return j.f(i2);
        }

        public final int g(b<E> bVar) {
            if (bVar == null) {
                return -1;
            }
            return bVar.e;
        }

        public final b<E> h() {
            if (this.b) {
                return null;
            }
            return this.a;
        }

        public final int i(b<E> bVar) {
            if (bVar == null) {
                return 0;
            }
            return bVar.f;
        }

        public final b<E> j() {
            if (this.d) {
                return null;
            }
            return this.c;
        }

        public E k() {
            return this.g;
        }

        public final int l() {
            return g(j()) - g(h());
        }

        public int m(Object obj, int i) {
            if (h() != null) {
                b<E> bVar = this.a;
                int m = bVar.m(obj, bVar.f + i);
                if (m != -1) {
                    return m;
                }
            }
            E e = this.g;
            if (e != null ? e.equals(obj) : e == obj) {
                return i;
            }
            if (j() == null) {
                return -1;
            }
            b<E> bVar2 = this.c;
            return bVar2.m(obj, i + bVar2.f);
        }

        public b<E> n(int i, E e) {
            int i2 = i - this.f;
            if (i2 <= 0) {
                return o(i2, e);
            }
            return p(i2, e);
        }

        public final b<E> o(int i, E e) {
            if (h() == null) {
                B(new b<>(-1, e, this, this.a), null);
            } else {
                B(this.a.n(i, e), null);
            }
            int i2 = this.f;
            if (i2 >= 0) {
                this.f = i2 + 1;
            }
            b<E> e2 = e();
            u();
            return e2;
        }

        public final b<E> p(int i, E e) {
            if (j() == null) {
                D(new b<>(1, e, this.c, this), null);
            } else {
                D(this.c.n(i, e), null);
            }
            int i2 = this.f;
            if (i2 < 0) {
                this.f = i2 - 1;
            }
            b<E> e2 = e();
            u();
            return e2;
        }

        public final b<E> q() {
            if (j() == null) {
                return this;
            }
            return this.c.q();
        }

        public final b<E> r() {
            if (h() == null) {
                return this;
            }
            return this.a.r();
        }

        public b<E> s() {
            b<E> bVar;
            if (!this.d && (bVar = this.c) != null) {
                return bVar.r();
            }
            return this.c;
        }

        public b<E> t() {
            b<E> bVar;
            if (!this.b && (bVar = this.a) != null) {
                return bVar.q();
            }
            return this.a;
        }

        public String toString() {
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append("AVLNode(");
            sb.append(this.f);
            sb.append(',');
            boolean z2 = false;
            if (this.a != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(',');
            sb.append(this.g);
            sb.append(',');
            if (j() != null) {
                z2 = true;
            }
            sb.append(z2);
            sb.append(", faedelung ");
            sb.append(this.d);
            sb.append(" )");
            return sb.toString();
        }

        public final void u() {
            int i;
            int i2 = -1;
            if (h() == null) {
                i = -1;
            } else {
                i = h().e;
            }
            if (j() != null) {
                i2 = j().e;
            }
            this.e = Math.max(i, i2) + 1;
        }

        public b<E> v(int i) {
            int i2 = i - this.f;
            if (i2 == 0) {
                return y();
            }
            if (i2 > 0) {
                D(this.c.v(i2), this.c.c);
                int i3 = this.f;
                if (i3 < 0) {
                    this.f = i3 + 1;
                }
            } else {
                B(this.a.v(i2), this.a.a);
                int i4 = this.f;
                if (i4 > 0) {
                    this.f = i4 - 1;
                }
            }
            u();
            return e();
        }

        public final b<E> w() {
            if (j() == null) {
                return y();
            }
            D(this.c.w(), this.c.c);
            int i = this.f;
            if (i < 0) {
                this.f = i + 1;
            }
            u();
            return e();
        }

        public final b<E> x() {
            if (h() == null) {
                return y();
            }
            B(this.a.x(), this.a.a);
            int i = this.f;
            if (i > 0) {
                this.f = i - 1;
            }
            u();
            return e();
        }

        public final b<E> y() {
            if (j() == null && h() == null) {
                return null;
            }
            if (j() == null) {
                int i = this.f;
                if (i > 0) {
                    this.a.f += i;
                }
                this.a.q().D(null, this.c);
                return this.a;
            }
            int i2 = 1;
            if (h() == null) {
                b<E> bVar = this.c;
                int i3 = bVar.f;
                int i4 = this.f;
                if (i4 < 0) {
                    i2 = 0;
                }
                bVar.f = i3 + (i4 - i2);
                bVar.r().B(null, this.a);
                return this.c;
            }
            if (l() > 0) {
                b<E> r = this.c.r();
                this.g = r.g;
                if (this.b) {
                    this.a = r.a;
                }
                this.c = this.c.x();
                int i5 = this.f;
                if (i5 < 0) {
                    this.f = i5 + 1;
                }
            } else {
                b<E> q = this.a.q();
                this.g = q.g;
                if (this.d) {
                    this.c = q.c;
                }
                b<E> bVar2 = this.a;
                b<E> bVar3 = bVar2.a;
                b<E> w = bVar2.w();
                this.a = w;
                if (w == null) {
                    this.a = bVar3;
                    this.b = true;
                }
                int i6 = this.f;
                if (i6 > 0) {
                    this.f = i6 - 1;
                }
            }
            u();
            return this;
        }

        public final b<E> z() {
            b<E> bVar = this.c;
            b<E> h = j().h();
            int i = this.f + i(bVar);
            D(h, bVar);
            bVar.B(this, null);
            C(bVar, i);
            C(this, -bVar.f);
            C(h, i(bVar) + i(h));
            return bVar;
        }

        public b(int i, E e, b<E> bVar, b<E> bVar2) {
            this.f = i;
            this.g = e;
            this.d = true;
            this.b = true;
            this.c = bVar;
            this.a = bVar2;
        }

        public b(Collection<? extends E> collection) {
            this(collection.iterator(), 0, collection.size() - 1, 0, null, null);
        }

        public b(Iterator<? extends E> it, int i, int i2, int i3, b<E> bVar, b<E> bVar2) {
            b<E> bVar3;
            Iterator<? extends E> it2;
            int i4 = i + ((i2 - i) / 2);
            if (i < i4) {
                it2 = it;
                bVar3 = this;
                bVar3.a = new b<>(it2, i, i4 - 1, i4, bVar, this);
            } else {
                bVar3 = this;
                it2 = it;
                bVar3.b = true;
                bVar3.a = bVar;
            }
            bVar3.g = it2.next();
            bVar3.f = i4 - i3;
            if (i4 < i2) {
                bVar3.c = new b<>(it2, i4 + 1, i2, i4, bVar3, bVar2);
            } else {
                bVar3.d = true;
                bVar3.c = bVar2;
            }
            u();
        }
    }

    public C7636ku2(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.X = new b<>(collection);
        this.Y = collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        h(i, 0, size());
        return new c(this, i);
    }
}
