package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.ww1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10587ww1<T> implements Comparator<T> {
    public static final int X = 1;
    public static final int Y = -1;

    @InterfaceC5299bJ2
    /* renamed from: o.ww1$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC10587ww1<Object> {
        public final AtomicInteger Z = new AtomicInteger(0);
        public final ConcurrentMap<Object, Integer> Y0 = C7469kD1.l(new Y71()).i();

        public final Integer H(Object obj) {
            Integer putIfAbsent;
            Integer num = this.Y0.get(obj);
            if (num == null && (putIfAbsent = this.Y0.putIfAbsent(obj, (num = Integer.valueOf(this.Z.getAndIncrement())))) != null) {
                return putIfAbsent;
            }
            return num;
        }

        public int I(Object obj) {
            return System.identityHashCode(obj);
        }

        @Override // o.AbstractC10587ww1, java.util.Comparator
        public int compare(@MB Object obj, @MB Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int I = I(obj);
            int I2 = I(obj2);
            if (I != I2) {
                if (I < I2) {
                    return -1;
                }
                return 1;
            }
            int compareTo = H(obj).compareTo(H(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* renamed from: o.ww1$b */
    /* loaded from: classes3.dex */
    public static class b {
        public static final AbstractC10587ww1<Object> a = new a();
    }

    @InterfaceC5299bJ2
    /* renamed from: o.ww1$c */
    /* loaded from: classes3.dex */
    public static class c extends ClassCastException {
        private static final long serialVersionUID = 0;
        public final Object X;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(Object obj) {
            super(r2.toString());
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Cannot compare value: ");
            sb.append(valueOf);
            this.X = obj;
        }
    }

    @InterfaceC10420wF0(serializable = true)
    public static AbstractC10587ww1<Object> G() {
        return C10900yD2.Z;
    }

    @InterfaceC10420wF0(serializable = true)
    public static AbstractC10587ww1<Object> a() {
        return C9659t8.Z;
    }

    public static AbstractC10587ww1<Object> b() {
        return b.a;
    }

    @InterfaceC10420wF0(serializable = true)
    public static <T> AbstractC10587ww1<T> d(Iterable<? extends Comparator<? super T>> iterable) {
        return new C5053aJ(iterable);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <T> AbstractC10587ww1<T> f(T t, T... tArr) {
        return g(C10608x11.c(t, tArr));
    }

    @InterfaceC10420wF0(serializable = true)
    public static <T> AbstractC10587ww1<T> g(List<T> list) {
        return new C6863hj0(list);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <T> AbstractC10587ww1<T> h(Comparator<T> comparator) {
        if (comparator instanceof AbstractC10587ww1) {
            return (AbstractC10587ww1) comparator;
        }
        return new C7240jH(comparator);
    }

    @InterfaceC10420wF0(serializable = true)
    @Deprecated
    public static <T> AbstractC10587ww1<T> i(AbstractC10587ww1<T> abstractC10587ww1) {
        return (AbstractC10587ww1) C10664xF1.E(abstractC10587ww1);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <C extends Comparable> AbstractC10587ww1<C> z() {
        return C2671Co1.Z0;
    }

    @InterfaceC10420wF0(serializable = true)
    public <S extends T> AbstractC10587ww1<S> A() {
        return new C2785Ds1(this);
    }

    @InterfaceC10420wF0(serializable = true)
    public <S extends T> AbstractC10587ww1<S> B() {
        return new C2883Es1(this);
    }

    public <T2 extends T> AbstractC10587ww1<Map.Entry<T2, ?>> C() {
        return (AbstractC10587ww1<Map.Entry<T2, ?>>) D(C7935m81.R());
    }

    @InterfaceC10420wF0(serializable = true)
    public <F> AbstractC10587ww1<F> D(YA0<F, ? extends T> ya0) {
        return new C10319vr(ya0, this);
    }

    @InterfaceC10420wF0(serializable = true)
    public <S extends T> AbstractC10587ww1<S> E() {
        return new GU1(this);
    }

    public <E extends T> List<E> F(Iterable<E> iterable) {
        Object[] P = C5098aU0.P(iterable);
        Arrays.sort(P, this);
        return C10608x11.r(Arrays.asList(P));
    }

    @Deprecated
    public int c(List<? extends T> list, @InterfaceC7894ly1 T t) {
        return Collections.binarySearch(list, t, this);
    }

    @Override // java.util.Comparator
    @InterfaceC6181ey
    public abstract int compare(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2);

    @InterfaceC10420wF0(serializable = true)
    public <U extends T> AbstractC10587ww1<U> e(Comparator<? super U> comparator) {
        return new C5053aJ(this, (Comparator) C10664xF1.E(comparator));
    }

    public <E extends T> List<E> j(Iterable<E> iterable, int i) {
        return E().o(iterable, i);
    }

    public <E extends T> List<E> k(Iterator<E> it, int i) {
        return E().p(it, i);
    }

    public <E extends T> AbstractC5317bO0<E> l(Iterable<E> iterable) {
        return AbstractC5317bO0.l0(this, iterable);
    }

    public boolean m(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public boolean n(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public <E extends T> List<E> o(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= i * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return p(iterable.iterator(), i);
    }

    public <E extends T> List<E> p(Iterator<E> it, int i) {
        C10664xF1.E(it);
        C5037aF.b(i, "k");
        if (i != 0 && it.hasNext()) {
            if (i >= 1073741823) {
                ArrayList s = C10608x11.s(it);
                Collections.sort(s, this);
                if (s.size() > i) {
                    s.subList(i, s.size()).clear();
                }
                s.trimToSize();
                return Collections.unmodifiableList(s);
            }
            C10564wq2 d = C10564wq2.d(i, this);
            d.g(it);
            return d.j();
        }
        return Collections.EMPTY_LIST;
    }

    @InterfaceC10420wF0(serializable = true)
    public <S extends T> AbstractC10587ww1<Iterable<S>> q() {
        return new C10981yZ0(this);
    }

    @InterfaceC7894ly1
    public <E extends T> E r(Iterable<E> iterable) {
        return (E) u(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7894ly1
    public <E extends T> E s(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
        if (compare(e, e2) >= 0) {
            return e;
        }
        return e2;
    }

    @InterfaceC7894ly1
    public <E extends T> E t(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2, @InterfaceC7894ly1 E e3, E... eArr) {
        E e4 = (E) s(s(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) s(e4, e5);
        }
        return e4;
    }

    @InterfaceC7894ly1
    public <E extends T> E u(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) s(next, it.next());
        }
        return next;
    }

    @InterfaceC7894ly1
    public <E extends T> E v(Iterable<E> iterable) {
        return (E) y(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7894ly1
    public <E extends T> E w(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
        if (compare(e, e2) <= 0) {
            return e;
        }
        return e2;
    }

    @InterfaceC7894ly1
    public <E extends T> E x(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2, @InterfaceC7894ly1 E e3, E... eArr) {
        E e4 = (E) w(w(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) w(e4, e5);
        }
        return e4;
    }

    @InterfaceC7894ly1
    public <E extends T> E y(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) w(next, it.next());
        }
        return next;
    }
}
