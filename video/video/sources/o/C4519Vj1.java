package o;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

@InterfaceC6329fa0
@InterfaceC4238Sm
@InterfaceC10420wF0
/* renamed from: o.Vj1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4519Vj1<E> extends AbstractQueue<E> {
    public static final int b1 = 1431655765;
    public static final int c1 = -1431655766;
    public static final int d1 = 11;
    public final C4519Vj1<E>.c X;
    public final C4519Vj1<E>.c Y;
    public Object[] Y0;
    @InterfaceC5299bJ2
    public final int Z;
    public int Z0;
    public int a1;

    @InterfaceC4238Sm
    /* renamed from: o.Vj1$b */
    /* loaded from: classes3.dex */
    public static final class b<B> {
        public static final int d = -1;
        public final Comparator<B> a;
        public int b;
        public int c;

        public <T extends B> C4519Vj1<T> c() {
            return d(Collections.EMPTY_SET);
        }

        public <T extends B> C4519Vj1<T> d(Iterable<? extends T> iterable) {
            C4519Vj1<T> c4519Vj1 = new C4519Vj1<>(this, C4519Vj1.G(this.b, this.c, iterable));
            for (T t : iterable) {
                c4519Vj1.offer(t);
            }
            return c4519Vj1;
        }

        @InterfaceC6181ey
        public b<B> e(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            this.b = i;
            return this;
        }

        @InterfaceC6181ey
        public b<B> f(int i) {
            boolean z;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            this.c = i;
            return this;
        }

        public final <T extends B> AbstractC10587ww1<T> g() {
            return AbstractC10587ww1.h(this.a);
        }

        public b(Comparator<B> comparator) {
            this.b = -1;
            this.c = Integer.MAX_VALUE;
            this.a = (Comparator) C10664xF1.E(comparator);
        }
    }

    /* renamed from: o.Vj1$c */
    /* loaded from: classes3.dex */
    public class c {
        public final AbstractC10587ww1<E> a;
        @GJ2
        public C4519Vj1<E>.c b;

        public c(AbstractC10587ww1<E> abstractC10587ww1) {
            this.a = abstractC10587ww1;
        }

        public void b(int i, E e) {
            c cVar;
            int f = f(i, e);
            if (f == i) {
                f = i;
                cVar = this;
            } else {
                cVar = this.b;
            }
            cVar.c(f, e);
        }

        @InterfaceC6181ey
        public int c(int i, E e) {
            while (i > 2) {
                int k = k(i);
                Object p = C4519Vj1.this.p(k);
                if (((AbstractC10587ww1<E>) this.a).compare(p, e) <= 0) {
                    break;
                }
                C4519Vj1.this.Y0[i] = p;
                i = k;
            }
            C4519Vj1.this.Y0[i] = e;
            return i;
        }

        public int d(int i, int i2) {
            return ((AbstractC10587ww1<E>) this.a).compare(C4519Vj1.this.p(i), C4519Vj1.this.p(i2));
        }

        public int e(int i, E e) {
            int i2 = i(i);
            if (i2 > 0 && ((AbstractC10587ww1<E>) this.a).compare(C4519Vj1.this.p(i2), e) < 0) {
                C4519Vj1.this.Y0[i] = C4519Vj1.this.p(i2);
                C4519Vj1.this.Y0[i2] = e;
                return i2;
            }
            return f(i, e);
        }

        public int f(int i, E e) {
            int n;
            if (i == 0) {
                C4519Vj1.this.Y0[0] = e;
                return 0;
            }
            int m = m(i);
            Object p = C4519Vj1.this.p(m);
            if (m != 0 && (n = n(m(m))) != m && l(n) >= C4519Vj1.this.Z0) {
                Object p2 = C4519Vj1.this.p(n);
                if (((AbstractC10587ww1<E>) this.a).compare(p2, p) < 0) {
                    m = n;
                    p = p2;
                }
            }
            if (((AbstractC10587ww1<E>) this.a).compare(p, e) < 0) {
                C4519Vj1.this.Y0[i] = p;
                C4519Vj1.this.Y0[m] = e;
                return m;
            }
            C4519Vj1.this.Y0[i] = e;
            return i;
        }

        public int g(int i) {
            while (true) {
                int j = j(i);
                if (j > 0) {
                    C4519Vj1.this.Y0[i] = C4519Vj1.this.p(j);
                    i = j;
                } else {
                    return i;
                }
            }
        }

        public int h(int i, int i2) {
            boolean z;
            if (i >= C4519Vj1.this.Z0) {
                return -1;
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            int min = Math.min(i, C4519Vj1.this.Z0 - i2) + i2;
            for (int i3 = i + 1; i3 < min; i3++) {
                if (d(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        public int i(int i) {
            return h(l(i), 2);
        }

        public int j(int i) {
            int l = l(i);
            if (l < 0) {
                return -1;
            }
            return h(l(l), 4);
        }

        public final int k(int i) {
            return m(m(i));
        }

        public final int l(int i) {
            return (i * 2) + 1;
        }

        public final int m(int i) {
            return (i - 1) / 2;
        }

        public final int n(int i) {
            return (i * 2) + 2;
        }

        public int o(E e) {
            int n;
            int m = m(C4519Vj1.this.Z0);
            if (m != 0 && (n = n(m(m))) != m && l(n) >= C4519Vj1.this.Z0) {
                Object p = C4519Vj1.this.p(n);
                if (((AbstractC10587ww1<E>) this.a).compare(p, e) < 0) {
                    C4519Vj1.this.Y0[n] = e;
                    C4519Vj1.this.Y0[C4519Vj1.this.Z0] = p;
                    return n;
                }
            }
            return C4519Vj1.this.Z0;
        }

        @MB
        public d<E> p(int i, int i2, E e) {
            Object p;
            int e2 = e(i2, e);
            if (e2 == i2) {
                return null;
            }
            if (e2 < i) {
                p = C4519Vj1.this.p(i);
            } else {
                p = C4519Vj1.this.p(m(i));
            }
            if (this.b.c(e2, e) >= i) {
                return null;
            }
            return new d<>(e, p);
        }

        public final boolean q(int i) {
            if (l(i) < C4519Vj1.this.Z0 && d(i, l(i)) > 0) {
                return false;
            }
            if (n(i) < C4519Vj1.this.Z0 && d(i, n(i)) > 0) {
                return false;
            }
            if (i > 0 && d(i, m(i)) > 0) {
                return false;
            }
            if (i > 2 && d(k(i), i) > 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o.Vj1$d */
    /* loaded from: classes3.dex */
    public static class d<E> {
        public final E a;
        public final E b;

        public d(E e, E e2) {
            this.a = e;
            this.b = e2;
        }
    }

    /* renamed from: o.Vj1$e */
    /* loaded from: classes3.dex */
    public class e implements Iterator<E> {
        public int X;
        public int Y;
        @MB
        public Queue<E> Y0;
        public int Z;
        @MB
        public List<E> Z0;
        @MB
        public E a1;
        public boolean b1;

        public e() {
            this.X = -1;
            this.Y = -1;
            this.Z = C4519Vj1.this.a1;
        }

        public final void b() {
            if (C4519Vj1.this.a1 == this.Z) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public final boolean c(Iterable<E> iterable, E e) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(int i) {
            if (this.Y < i) {
                if (this.Z0 != null) {
                    while (i < C4519Vj1.this.size() && c(this.Z0, C4519Vj1.this.p(i))) {
                        i++;
                    }
                }
                this.Y = i;
            }
        }

        public final boolean e(Object obj) {
            for (int i = 0; i < C4519Vj1.this.Z0; i++) {
                if (C4519Vj1.this.Y0[i] == obj) {
                    C4519Vj1.this.Q(i);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Queue<E> queue;
            b();
            d(this.X + 1);
            if (this.Y < C4519Vj1.this.size() || ((queue = this.Y0) != null && !queue.isEmpty())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            b();
            d(this.X + 1);
            if (this.Y < C4519Vj1.this.size()) {
                int i = this.Y;
                this.X = i;
                this.b1 = true;
                return (E) C4519Vj1.this.p(i);
            }
            if (this.Y0 != null) {
                this.X = C4519Vj1.this.size();
                E poll = this.Y0.poll();
                this.a1 = poll;
                if (poll != null) {
                    this.b1 = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            C5037aF.e(this.b1);
            b();
            this.b1 = false;
            this.Z++;
            if (this.X < C4519Vj1.this.size()) {
                d<E> Q = C4519Vj1.this.Q(this.X);
                if (Q != null) {
                    if (this.Y0 == null || this.Z0 == null) {
                        this.Y0 = new ArrayDeque();
                        this.Z0 = new ArrayList(3);
                    }
                    if (!c(this.Z0, Q.a)) {
                        this.Y0.add(Q.a);
                    }
                    if (!c(this.Y0, Q.b)) {
                        this.Z0.add(Q.b);
                    }
                }
                this.X--;
                this.Y--;
                return;
            }
            E e = this.a1;
            Objects.requireNonNull(e);
            C10664xF1.g0(e(e));
            this.a1 = null;
        }
    }

    @InterfaceC5299bJ2
    public static int G(int i, int i2, Iterable<?> iterable) {
        if (i == -1) {
            i = 11;
        }
        if (iterable instanceof Collection) {
            i = Math.max(i, ((Collection) iterable).size());
        }
        return i(i, i2);
    }

    @InterfaceC5299bJ2
    public static boolean H(int i) {
        boolean z;
        int i2 = ~(~(i + 1));
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.h0(z, "negative index");
        if ((1431655765 & i2) > (i2 & c1)) {
            return true;
        }
        return false;
    }

    public static b<Comparable> K(int i) {
        return new b(AbstractC10587ww1.z()).f(i);
    }

    public static <B> b<B> L(Comparator<B> comparator) {
        return new b<>(comparator);
    }

    public static int i(int i, int i2) {
        return Math.min(i - 1, i2) + 1;
    }

    public static <E extends Comparable<E>> C4519Vj1<E> k() {
        return new b(AbstractC10587ww1.z()).c();
    }

    public static <E extends Comparable<E>> C4519Vj1<E> l(Iterable<? extends E> iterable) {
        return new b(AbstractC10587ww1.z()).d(iterable);
    }

    public static b<Comparable> r(int i) {
        return new b(AbstractC10587ww1.z()).e(i);
    }

    public final int B() {
        int i = this.Z0;
        if (i != 1) {
            if (i == 2 || this.Y.d(1, 2) <= 0) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public final void D() {
        if (this.Z0 > this.Y0.length) {
            Object[] objArr = new Object[h()];
            Object[] objArr2 = this.Y0;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.Y0 = objArr;
        }
    }

    public final C4519Vj1<E>.c F(int i) {
        if (H(i)) {
            return this.X;
        }
        return this.Y;
    }

    @InterfaceC5299bJ2
    public boolean J() {
        for (int i = 1; i < this.Z0; i++) {
            if (!F(i).q(i)) {
                return false;
            }
        }
        return true;
    }

    public final E M(int i) {
        E p = p(i);
        Q(i);
        return p;
    }

    @InterfaceC6181ey
    @MB
    @InterfaceC5299bJ2
    public d<E> Q(int i) {
        C10664xF1.d0(i, this.Z0);
        this.a1++;
        int i2 = this.Z0 - 1;
        this.Z0 = i2;
        if (i2 == i) {
            this.Y0[i2] = null;
            return null;
        }
        E p = p(i2);
        int o2 = F(this.Z0).o(p);
        if (o2 == i) {
            this.Y0[this.Z0] = null;
            return null;
        }
        E p2 = p(this.Z0);
        this.Y0[this.Z0] = null;
        d<E> w = w(i, p2);
        if (o2 < i) {
            if (w == null) {
                return new d<>(p, p2);
            }
            return new d<>(p, w.b);
        }
        return w;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @InterfaceC6181ey
    public boolean add(E e2) {
        offer(e2);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    public boolean addAll(Collection<? extends E> collection) {
        boolean z = false;
        for (E e2 : collection) {
            offer(e2);
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i = 0; i < this.Z0; i++) {
            this.Y0[i] = null;
        }
        this.Z0 = 0;
    }

    public Comparator<? super E> comparator() {
        return this.X.a;
    }

    public final int h() {
        int d2;
        int length = this.Y0.length;
        if (length < 64) {
            d2 = (length + 1) * 2;
        } else {
            d2 = C9979uR0.d(length / 2, 3);
        }
        return i(d2, this.Z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new e();
    }

    @InterfaceC5299bJ2
    public int j() {
        return this.Y0.length;
    }

    @Override // java.util.Queue
    @InterfaceC6181ey
    public boolean offer(E e2) {
        C10664xF1.E(e2);
        this.a1++;
        int i = this.Z0;
        this.Z0 = i + 1;
        D();
        F(i).b(i, e2);
        if (this.Z0 <= this.Z || pollLast() != e2) {
            return true;
        }
        return false;
    }

    public E p(int i) {
        E e2 = (E) this.Y0[i];
        Objects.requireNonNull(e2);
        return e2;
    }

    @Override // java.util.Queue
    @MB
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return p(0);
    }

    @MB
    public E peekFirst() {
        return peek();
    }

    @MB
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return p(B());
    }

    @Override // java.util.Queue
    @InterfaceC6181ey
    @MB
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return M(0);
    }

    @InterfaceC6181ey
    @MB
    public E pollFirst() {
        return poll();
    }

    @InterfaceC6181ey
    @MB
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return M(B());
    }

    @InterfaceC6181ey
    public E removeFirst() {
        return remove();
    }

    @InterfaceC6181ey
    public E removeLast() {
        if (!isEmpty()) {
            return M(B());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.Z0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i = this.Z0;
        Object[] objArr = new Object[i];
        System.arraycopy(this.Y0, 0, objArr, 0, i);
        return objArr;
    }

    @MB
    public final d<E> w(int i, E e2) {
        C4519Vj1<E>.c F = F(i);
        int g = F.g(i);
        int c2 = F.c(g, e2);
        if (c2 == g) {
            return F.p(i, g, e2);
        }
        if (c2 < i) {
            return new d<>(e2, p(i));
        }
        return null;
    }

    public C4519Vj1(b<? super E> bVar, int i) {
        AbstractC10587ww1 g = bVar.g();
        C4519Vj1<E>.c cVar = new c(g);
        this.X = cVar;
        C4519Vj1<E>.c cVar2 = new c(g.E());
        this.Y = cVar2;
        cVar.b = cVar2;
        cVar2.b = cVar;
        this.Z = bVar.c;
        this.Y0 = new Object[i];
    }
}
