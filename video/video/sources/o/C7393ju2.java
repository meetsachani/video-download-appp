package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.ju2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7393ju2 extends AbstractList {
    public a X;
    public int Y;

    /* renamed from: o.ju2$a */
    /* loaded from: classes4.dex */
    public static class a {
        public a a;
        public boolean b;
        public a c;
        public boolean d;
        public int e;
        public int f;
        public Object g;

        public final int A(a aVar, int i) {
            if (aVar == null) {
                return 0;
            }
            int g = g(aVar);
            aVar.f = i;
            return g;
        }

        public final void B(a aVar, a aVar2) {
            boolean z;
            if (aVar == null) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            if (z) {
                aVar = aVar2;
            }
            this.c = aVar;
            s();
        }

        public void C(Object obj) {
            this.g = obj;
        }

        public void D(Object[] objArr, int i) {
            objArr[i] = this.g;
            if (f() != null) {
                a aVar = this.a;
                aVar.D(objArr, aVar.f + i);
            }
            if (h() != null) {
                a aVar2 = this.c;
                aVar2.D(objArr, i + aVar2.f);
            }
        }

        public final a c() {
            int j = j();
            if (j != -2) {
                if (j != -1 && j != 0 && j != 1) {
                    if (j == 2) {
                        if (this.c.j() < 0) {
                            B(this.c.y(), null);
                        }
                        return x();
                    }
                    throw new RuntimeException("tree inconsistent!");
                }
                return this;
            }
            if (this.a.j() > 0) {
                z(this.a.x(), null);
            }
            return y();
        }

        public a d(int i) {
            a h;
            int i2 = i - this.f;
            if (i2 == 0) {
                return this;
            }
            if (i2 < 0) {
                h = f();
            } else {
                h = h();
            }
            if (h == null) {
                return null;
            }
            return h.d(i2);
        }

        public final int e(a aVar) {
            if (aVar == null) {
                return -1;
            }
            return aVar.e;
        }

        public final a f() {
            if (this.b) {
                return null;
            }
            return this.a;
        }

        public final int g(a aVar) {
            if (aVar == null) {
                return 0;
            }
            return aVar.f;
        }

        public final a h() {
            if (this.d) {
                return null;
            }
            return this.c;
        }

        public Object i() {
            return this.g;
        }

        public final int j() {
            return e(h()) - e(f());
        }

        public int k(Object obj, int i) {
            if (f() != null) {
                a aVar = this.a;
                int k = aVar.k(obj, aVar.f + i);
                if (k != -1) {
                    return k;
                }
            }
            Object obj2 = this.g;
            if (obj2 != null ? obj2.equals(obj) : obj2 == obj) {
                return i;
            }
            if (h() == null) {
                return -1;
            }
            a aVar2 = this.c;
            return aVar2.k(obj, i + aVar2.f);
        }

        public a l(int i, Object obj) {
            int i2 = i - this.f;
            if (i2 <= 0) {
                return m(i2, obj);
            }
            return n(i2, obj);
        }

        public final a m(int i, Object obj) {
            if (f() == null) {
                z(new a(-1, obj, this, this.a), null);
            } else {
                z(this.a.l(i, obj), null);
            }
            int i2 = this.f;
            if (i2 >= 0) {
                this.f = i2 + 1;
            }
            a c = c();
            s();
            return c;
        }

        public final a n(int i, Object obj) {
            if (h() == null) {
                B(new a(1, obj, this.c, this), null);
            } else {
                B(this.c.l(i, obj), null);
            }
            int i2 = this.f;
            if (i2 < 0) {
                this.f = i2 - 1;
            }
            a c = c();
            s();
            return c;
        }

        public final a o() {
            if (h() == null) {
                return this;
            }
            return this.c.o();
        }

        public final a p() {
            if (f() == null) {
                return this;
            }
            return this.a.p();
        }

        public a q() {
            a aVar;
            if (!this.d && (aVar = this.c) != null) {
                return aVar.p();
            }
            return this.c;
        }

        public a r() {
            a aVar;
            if (!this.b && (aVar = this.a) != null) {
                return aVar.o();
            }
            return this.a;
        }

        public final void s() {
            int i;
            int i2 = -1;
            if (f() == null) {
                i = -1;
            } else {
                i = f().e;
            }
            if (h() != null) {
                i2 = h().e;
            }
            this.e = Math.max(i, i2) + 1;
        }

        public a t(int i) {
            int i2 = i - this.f;
            if (i2 == 0) {
                return w();
            }
            if (i2 > 0) {
                B(this.c.t(i2), this.c.c);
                int i3 = this.f;
                if (i3 < 0) {
                    this.f = i3 + 1;
                }
            } else {
                z(this.a.t(i2), this.a.a);
                int i4 = this.f;
                if (i4 > 0) {
                    this.f = i4 - 1;
                }
            }
            s();
            return c();
        }

        public String toString() {
            boolean z;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("AVLNode(");
            stringBuffer.append(this.f);
            stringBuffer.append(",");
            boolean z2 = false;
            if (this.a != null) {
                z = true;
            } else {
                z = false;
            }
            stringBuffer.append(z);
            stringBuffer.append(",");
            stringBuffer.append(this.g);
            stringBuffer.append(",");
            if (h() != null) {
                z2 = true;
            }
            stringBuffer.append(z2);
            stringBuffer.append(", faedelung ");
            stringBuffer.append(this.d);
            stringBuffer.append(" )");
            return stringBuffer.toString();
        }

        public final a u() {
            if (h() == null) {
                return w();
            }
            B(this.c.u(), this.c.c);
            int i = this.f;
            if (i < 0) {
                this.f = i + 1;
            }
            s();
            return c();
        }

        public final a v() {
            if (f() == null) {
                return w();
            }
            z(this.a.v(), this.a.a);
            int i = this.f;
            if (i > 0) {
                this.f = i - 1;
            }
            s();
            return c();
        }

        public final a w() {
            if (h() == null && f() == null) {
                return null;
            }
            int i = 0;
            if (h() == null) {
                int i2 = this.f;
                if (i2 > 0) {
                    a aVar = this.a;
                    int i3 = aVar.f;
                    if (i2 <= 0) {
                        i = 1;
                    }
                    aVar.f = i3 + i2 + i;
                }
                this.a.o().B(null, this.c);
                return this.a;
            } else if (f() == null) {
                a aVar2 = this.c;
                int i4 = aVar2.f;
                int i5 = this.f;
                if (i5 >= 0) {
                    i = 1;
                }
                aVar2.f = i4 + (i5 - i);
                aVar2.p().z(null, this.a);
                return this.c;
            } else {
                if (j() > 0) {
                    a p = this.c.p();
                    this.g = p.g;
                    if (this.b) {
                        this.a = p.a;
                    }
                    this.c = this.c.v();
                    int i6 = this.f;
                    if (i6 < 0) {
                        this.f = i6 + 1;
                    }
                } else {
                    a o2 = this.a.o();
                    this.g = o2.g;
                    if (this.d) {
                        this.c = o2.c;
                    }
                    a aVar3 = this.a;
                    a aVar4 = aVar3.a;
                    a u = aVar3.u();
                    this.a = u;
                    if (u == null) {
                        this.a = aVar4;
                        this.b = true;
                    }
                    int i7 = this.f;
                    if (i7 > 0) {
                        this.f = i7 - 1;
                    }
                }
                s();
                return this;
            }
        }

        public final a x() {
            a aVar = this.c;
            a f = h().f();
            int g = this.f + g(aVar);
            B(f, aVar);
            aVar.z(this, null);
            A(aVar, g);
            A(this, -aVar.f);
            A(f, g(aVar) + g(f));
            return aVar;
        }

        public final a y() {
            a aVar = this.a;
            a h = f().h();
            int g = this.f + g(aVar);
            z(h, aVar);
            aVar.B(this, null);
            A(aVar, g);
            A(this, -aVar.f);
            A(h, g(aVar) + g(h));
            return aVar;
        }

        public final void z(a aVar, a aVar2) {
            boolean z;
            if (aVar == null) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
            if (z) {
                aVar = aVar2;
            }
            this.a = aVar;
            s();
        }

        public a(int i, Object obj, a aVar, a aVar2) {
            this.f = i;
            this.g = obj;
            this.d = true;
            this.b = true;
            this.c = aVar;
            this.a = aVar2;
        }
    }

    /* renamed from: o.ju2$b */
    /* loaded from: classes4.dex */
    public static class b implements ListIterator, InterfaceC9127qw1 {
        public final C7393ju2 X;
        public a Y;
        public a Y0;
        public int Z;
        public int Z0;
        public int a1;

        public b(C7393ju2 c7393ju2, int i) throws IndexOutOfBoundsException {
            a d;
            this.X = c7393ju2;
            this.a1 = ((AbstractList) c7393ju2).modCount;
            if (c7393ju2.X == null) {
                d = null;
            } else {
                d = c7393ju2.X.d(i);
            }
            this.Y = d;
            this.Z = i;
            this.Z0 = -1;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            this.X.add(this.Z, obj);
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

        @Override // java.util.ListIterator, o.InterfaceC9127qw1
        public boolean hasPrevious() {
            if (this.Z > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (hasNext()) {
                if (this.Y == null) {
                    this.Y = this.X.X.d(this.Z);
                }
                Object i = this.Y.i();
                a aVar = this.Y;
                this.Y0 = aVar;
                int i2 = this.Z;
                this.Z = i2 + 1;
                this.Z0 = i2;
                this.Y = aVar.q();
                return i;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No element at index ");
            stringBuffer.append(this.Z);
            stringBuffer.append(UE.h);
            throw new NoSuchElementException(stringBuffer.toString());
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Z;
        }

        @Override // java.util.ListIterator, o.InterfaceC9127qw1
        public Object previous() {
            b();
            if (hasPrevious()) {
                a aVar = this.Y;
                if (aVar == null) {
                    this.Y = this.X.X.d(this.Z - 1);
                } else {
                    this.Y = aVar.r();
                }
                Object i = this.Y.i();
                this.Y0 = this.Y;
                int i2 = this.Z - 1;
                this.Z = i2;
                this.Z0 = i2;
                return i;
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
        public void set(Object obj) {
            b();
            a aVar = this.Y0;
            if (aVar != null) {
                aVar.C(obj);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C7393ju2() {
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 0, size());
        a aVar = this.X;
        if (aVar == null) {
            this.X = new a(i, obj, null, null);
        } else {
            this.X = aVar.l(i, obj);
        }
        this.Y++;
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
    public Object get(int i) {
        h(i, 0, size() - 1);
        return this.X.d(i).i();
    }

    public final void h(int i, int i2, int i3) {
        if (i >= i2 && i <= i3) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid index:");
        stringBuffer.append(i);
        stringBuffer.append(", size=");
        stringBuffer.append(size());
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        a aVar = this.X;
        if (aVar == null) {
            return -1;
        }
        return aVar.k(obj, aVar.f);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        ((AbstractList) this).modCount++;
        h(i, 0, size() - 1);
        Object obj = get(i);
        this.X = this.X.t(i);
        this.Y--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        h(i, 0, size() - 1);
        a d = this.X.d(i);
        Object obj2 = d.g;
        d.C(obj);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        a aVar = this.X;
        if (aVar != null) {
            aVar.D(objArr, aVar.f);
        }
        return objArr;
    }

    public C7393ju2(Collection collection) {
        addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        h(i, 0, size());
        return new b(this, i);
    }
}
