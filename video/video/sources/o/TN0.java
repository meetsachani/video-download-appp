package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import o.AbstractC5317bO0;

@L40("Use ImmutableList.of or another implementation")
@InterfaceC6329fa0
@InterfaceC10420wF0(emulated = true)
/* loaded from: classes3.dex */
public abstract class TN0<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] X = new Object[0];

    /* loaded from: classes3.dex */
    public static abstract class a<E> extends b<E> {
        public Object[] b;
        public int c;
        public boolean d;

        public a(int i) {
            C5037aF.b(i, "initialCapacity");
            this.b = new Object[i];
            this.c = 0;
        }

        @Override // o.TN0.b
        @InterfaceC6181ey
        public b<E> b(E... eArr) {
            h(eArr, eArr.length);
            return this;
        }

        @Override // o.TN0.b
        @InterfaceC6181ey
        public b<E> c(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                i(this.c + collection.size());
                if (collection instanceof TN0) {
                    this.c = ((TN0) collection).e(this.b, this.c);
                    return this;
                }
            }
            super.c(iterable);
            return this;
        }

        @Override // o.TN0.b
        @InterfaceC6181ey
        /* renamed from: g */
        public a<E> a(E e) {
            C10664xF1.E(e);
            i(this.c + 1);
            Object[] objArr = this.b;
            int i = this.c;
            this.c = i + 1;
            objArr[i] = e;
            return this;
        }

        public final void h(Object[] objArr, int i) {
            C5436bt1.c(objArr, i);
            i(this.c + i);
            System.arraycopy(objArr, 0, this.b, this.c, i);
            this.c += i;
        }

        public final void i(int i) {
            Object[] objArr = this.b;
            if (objArr.length < i) {
                this.b = Arrays.copyOf(objArr, b.f(objArr.length, i));
                this.d = false;
            } else if (this.d) {
                this.b = (Object[]) objArr.clone();
                this.d = false;
            }
        }
    }

    @L40
    /* loaded from: classes3.dex */
    public static abstract class b<E> {
        public static final int a = 4;

        public static int f(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        @InterfaceC6181ey
        public abstract b<E> a(E e);

        @InterfaceC6181ey
        public b<E> b(E... eArr) {
            for (E e : eArr) {
                a(e);
            }
            return this;
        }

        @InterfaceC6181ey
        public b<E> c(Iterable<? extends E> iterable) {
            for (E e : iterable) {
                a(e);
            }
            return this;
        }

        @InterfaceC6181ey
        public b<E> d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public abstract TN0<E> e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@MB Object obj);

    public AbstractC5317bO0<E> d() {
        if (isEmpty()) {
            return AbstractC5317bO0.L();
        }
        return AbstractC5317bO0.l(toArray());
    }

    @InterfaceC6181ey
    public int e(Object[] objArr, int i) {
        AbstractC6237fB2<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @MB
    public Object[] f() {
        return null;
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public abstract AbstractC6237fB2<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@MB Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(X);
    }

    public Object writeReplace() {
        return new AbstractC5317bO0.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    public final <T> T[] toArray(T[] tArr) {
        C10664xF1.E(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] f = f();
            if (f != null) {
                return (T[]) C7469kD1.b(f, i(), h(), tArr);
            }
            tArr = (T[]) C5436bt1.j(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        e(tArr, 0);
        return tArr;
    }
}
