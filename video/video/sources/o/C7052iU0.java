package o;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.iU0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7052iU0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$a */
    /* loaded from: classes3.dex */
    public class a<T> extends AbstractC6237fB2<T> {
        public final /* synthetic */ Enumeration X;

        public a(Enumeration enumeration) {
            this.X = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasMoreElements();
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            return (T) this.X.nextElement();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$b */
    /* loaded from: classes3.dex */
    public class b<T> implements Enumeration<T> {
        public final /* synthetic */ Iterator a;

        public b(Iterator it) {
            this.a = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.a.hasNext();
        }

        @Override // java.util.Enumeration
        @InterfaceC7894ly1
        public T nextElement() {
            return (T) this.a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$c */
    /* loaded from: classes3.dex */
    public class c<T> extends AbstractC6237fB2<T> {
        public final /* synthetic */ Iterator X;

        public c(Iterator it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            return (T) this.X.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$d */
    /* loaded from: classes3.dex */
    public class d<T> implements Iterator<T> {
        public Iterator<T> X = C7052iU0.w();
        public final /* synthetic */ Iterable Y;

        public d(Iterable iterable) {
            this.Y = iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.X.hasNext() && !this.Y.iterator().hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            if (!this.X.hasNext()) {
                Iterator<T> it = this.Y.iterator();
                this.X = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.X.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.X.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: o.iU0$e */
    /* loaded from: classes3.dex */
    public class e<I> extends AbstractC6237fB2<I> {
        public int X = 0;
        public final /* synthetic */ Iterator[] Y;

        public e(Iterator[] itArr) {
            this.Y = itArr;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TI; */
        @Override // java.util.Iterator
        /* renamed from: b */
        public Iterator next() {
            if (hasNext()) {
                Iterator it = this.Y[this.X];
                Objects.requireNonNull(it);
                Iterator it2 = it;
                Iterator[] itArr = this.Y;
                int i = this.X;
                itArr[i] = null;
                this.X = i + 1;
                return it2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.length) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$f */
    /* loaded from: classes3.dex */
    public class f<T> extends AbstractC6237fB2<List<T>> {
        public final /* synthetic */ Iterator X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ boolean Z;

        public f(Iterator it, int i, boolean z) {
            this.X = it;
            this.Y = i;
            this.Z = z;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public List<T> next() {
            if (hasNext()) {
                Object[] objArr = new Object[this.Y];
                int i = 0;
                while (i < this.Y && this.X.hasNext()) {
                    objArr[i] = this.X.next();
                    i++;
                }
                for (int i2 = i; i2 < this.Y; i2++) {
                    objArr[i2] = null;
                }
                List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                if (!this.Z && i != this.Y) {
                    return unmodifiableList.subList(0, i);
                }
                return unmodifiableList;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$g */
    /* loaded from: classes3.dex */
    public class g<T> extends AbstractC6437g1<T> {
        public final /* synthetic */ IF1 Y0;
        public final /* synthetic */ Iterator Z;

        public g(Iterator it, IF1 if1) {
            this.Z = it;
            this.Y0 = if1;
        }

        @Override // o.AbstractC6437g1
        @MB
        public T b() {
            while (this.Z.hasNext()) {
                T t = (T) this.Z.next();
                if (this.Y0.apply(t)) {
                    return t;
                }
            }
            return c();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* renamed from: o.iU0$h */
    /* loaded from: classes3.dex */
    public class h<F, T> extends AbstractC8375ns2<F, T> {
        public final /* synthetic */ YA0 Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Iterator it, YA0 ya0) {
            super(it);
            this.Y = ya0;
        }

        @Override // o.AbstractC8375ns2
        @InterfaceC7894ly1
        public T b(@InterfaceC7894ly1 F f) {
            return (T) this.Y.apply(f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$i */
    /* loaded from: classes3.dex */
    public class i<T> implements Iterator<T> {
        public int X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ Iterator Z;

        public i(int i, Iterator it) {
            this.Y = i;
            this.Z = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y && this.Z.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            if (hasNext()) {
                this.X++;
                return (T) this.Z.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.Z.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$j */
    /* loaded from: classes3.dex */
    public class j<T> extends AbstractC6237fB2<T> {
        public final /* synthetic */ Iterator X;

        public j(Iterator it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            T t = (T) this.X.next();
            this.X.remove();
            return t;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.iU0$k */
    /* loaded from: classes3.dex */
    public class k<T> extends AbstractC6237fB2<T> {
        public boolean X;
        public final /* synthetic */ Object Y;

        public k(Object obj) {
            this.Y = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.X;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            if (!this.X) {
                this.X = true;
                return (T) this.Y;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: o.iU0$l */
    /* loaded from: classes3.dex */
    public static final class l<T> extends Y0<T> {
        public static final AbstractC7705lB2<Object> Z0 = new l(new Object[0], 0, 0, 0);
        public final int Y0;
        public final T[] Z;

        public l(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.Z = tArr;
            this.Y0 = i;
        }

        @Override // o.Y0
        @InterfaceC7894ly1
        public T b(int i) {
            return this.Z[this.Y0 + i];
        }
    }

    /* renamed from: o.iU0$m */
    /* loaded from: classes3.dex */
    public static class m<T> implements Iterator<T> {
        @MB
        public Iterator<? extends T> X;
        public Iterator<? extends T> Y = C7052iU0.u();
        @MB
        public Deque<Iterator<? extends Iterator<? extends T>>> Y0;
        @MB
        public Iterator<? extends Iterator<? extends T>> Z;

        public m(Iterator<? extends Iterator<? extends T>> it) {
            this.Z = (Iterator) C10664xF1.E(it);
        }

        @MB
        public final Iterator<? extends Iterator<? extends T>> b() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.Z;
                if (it != null && it.hasNext()) {
                    return this.Z;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.Y0;
                if (deque != null && !deque.isEmpty()) {
                    this.Z = this.Y0.removeFirst();
                } else {
                    return null;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) C10664xF1.E(this.Y)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> b = b();
                this.Z = b;
                if (b == null) {
                    return false;
                }
                Iterator<? extends T> next = b.next();
                this.Y = next;
                if (next instanceof m) {
                    m mVar = (m) next;
                    this.Y = mVar.Y;
                    if (this.Y0 == null) {
                        this.Y0 = new ArrayDeque();
                    }
                    this.Y0.addFirst(this.Z);
                    if (mVar.Y0 != null) {
                        while (!mVar.Y0.isEmpty()) {
                            this.Y0.addFirst(mVar.Y0.removeLast());
                        }
                    }
                    this.Z = mVar.Z;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.Y;
                this.X = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.X;
            if (it != null) {
                it.remove();
                this.X = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    /* renamed from: o.iU0$n */
    /* loaded from: classes3.dex */
    public enum n implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C5037aF.e(false);
        }
    }

    /* renamed from: o.iU0$o */
    /* loaded from: classes3.dex */
    public static class o<T> extends AbstractC6237fB2<T> {
        public final Queue<InterfaceC8699pC1<T>> X;

        public o(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.X = new PriorityQueue(2, new Comparator() { // from class: o.jU0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = comparator.compare(((InterfaceC8699pC1) obj).peek(), ((InterfaceC8699pC1) obj2).peek());
                    return compare;
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.X.add(C7052iU0.S(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.X.isEmpty();
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public T next() {
            InterfaceC8699pC1<T> remove = this.X.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.X.add(remove);
            }
            return next;
        }
    }

    /* renamed from: o.iU0$p */
    /* loaded from: classes3.dex */
    public static class p<E> implements InterfaceC8699pC1<E> {
        public final Iterator<? extends E> X;
        public boolean Y;
        @MB
        public E Z;

        public p(Iterator<? extends E> it) {
            this.X = (Iterator) C10664xF1.E(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.Y && !this.X.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // o.InterfaceC8699pC1, java.util.Iterator
        @InterfaceC7894ly1
        public E next() {
            if (!this.Y) {
                return this.X.next();
            }
            E e = (E) C2491As1.a(this.Z);
            this.Y = false;
            this.Z = null;
            return e;
        }

        @Override // o.InterfaceC8699pC1
        @InterfaceC7894ly1
        public E peek() {
            if (!this.Y) {
                this.Z = this.X.next();
                this.Y = true;
            }
            return (E) C2491As1.a(this.Z);
        }

        @Override // o.InterfaceC8699pC1, java.util.Iterator
        public void remove() {
            C10664xF1.h0(!this.Y, "Can't remove after you've peeked at next");
            this.X.remove();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @MB
    public static <T> T A(Iterator<? extends T> it, IF1<? super T> if1, @MB T t) {
        C10664xF1.E(it);
        C10664xF1.E(if1);
        while (it.hasNext()) {
            T next = it.next();
            if (if1.apply(next)) {
                return next;
            }
        }
        return t;
    }

    @SafeVarargs
    public static <T> AbstractC6237fB2<T> B(T... tArr) {
        return C(tArr, 0, tArr.length, 0);
    }

    public static <T> AbstractC7705lB2<T> C(T[] tArr, int i2, int i3, int i4) {
        boolean z;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        C10664xF1.f0(i2, i2 + i3, tArr.length);
        C10664xF1.d0(i4, i3);
        if (i3 == 0) {
            return v();
        }
        return new l(tArr, i2, i3, i4);
    }

    public static <T> AbstractC6237fB2<T> D(Enumeration<T> enumeration) {
        C10664xF1.E(enumeration);
        return new a(enumeration);
    }

    public static int E(Iterator<?> it, @MB Object obj) {
        int i2 = 0;
        while (q(it, obj)) {
            i2++;
        }
        return i2;
    }

    @InterfaceC7894ly1
    public static <T> T F(Iterator<T> it, int i2) {
        g(i2);
        int b2 = b(it, i2);
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder sb = new StringBuilder(91);
        sb.append("position (");
        sb.append(i2);
        sb.append(") must be less than the number of elements that remained (");
        sb.append(b2);
        sb.append(C9811tl1.d);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @InterfaceC7894ly1
    public static <T> T G(Iterator<? extends T> it, int i2, @InterfaceC7894ly1 T t) {
        g(i2);
        b(it, i2);
        return (T) J(it, t);
    }

    @InterfaceC7894ly1
    public static <T> T H(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @InterfaceC7894ly1
    public static <T> T I(Iterator<? extends T> it, @InterfaceC7894ly1 T t) {
        if (it.hasNext()) {
            return (T) H(it);
        }
        return t;
    }

    @InterfaceC7894ly1
    public static <T> T J(Iterator<? extends T> it, @InterfaceC7894ly1 T t) {
        if (it.hasNext()) {
            return it.next();
        }
        return t;
    }

    @InterfaceC7894ly1
    public static <T> T K(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i2 = 0; i2 < 4 && it.hasNext(); i2++) {
            sb.append(C6566gU0.h);
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    @InterfaceC7894ly1
    public static <T> T L(Iterator<? extends T> it, @InterfaceC7894ly1 T t) {
        if (it.hasNext()) {
            return (T) K(it);
        }
        return t;
    }

    public static <T> int M(Iterator<T> it, IF1<? super T> if1) {
        C10664xF1.F(if1, "predicate");
        int i2 = 0;
        while (it.hasNext()) {
            if (if1.apply(it.next())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static <T> Iterator<T> N(Iterator<T> it, int i2) {
        boolean z;
        C10664xF1.E(it);
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "limit is negative");
        return new i(i2, it);
    }

    @InterfaceC4238Sm
    public static <T> AbstractC6237fB2<T> O(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        C10664xF1.F(iterable, "iterators");
        C10664xF1.F(comparator, "comparator");
        return new o(iterable, comparator);
    }

    public static <T> AbstractC6237fB2<List<T>> P(Iterator<T> it, int i2) {
        return R(it, i2, true);
    }

    public static <T> AbstractC6237fB2<List<T>> Q(Iterator<T> it, int i2) {
        return R(it, i2, false);
    }

    public static <T> AbstractC6237fB2<List<T>> R(Iterator<T> it, int i2, boolean z) {
        boolean z2;
        C10664xF1.E(it);
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.d(z2);
        return new f(it, i2, z);
    }

    public static <T> InterfaceC8699pC1<T> S(Iterator<? extends T> it) {
        if (it instanceof p) {
            return (p) it;
        }
        return new p(it);
    }

    @Deprecated
    public static <T> InterfaceC8699pC1<T> T(InterfaceC8699pC1<T> interfaceC8699pC1) {
        return (InterfaceC8699pC1) C10664xF1.E(interfaceC8699pC1);
    }

    @MB
    public static <T> T U(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    @InterfaceC6181ey
    public static boolean V(Iterator<?> it, Collection<?> collection) {
        C10664xF1.E(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @InterfaceC6181ey
    public static <T> boolean W(Iterator<T> it, IF1<? super T> if1) {
        C10664xF1.E(if1);
        boolean z = false;
        while (it.hasNext()) {
            if (if1.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @InterfaceC6181ey
    public static boolean X(Iterator<?> it, Collection<?> collection) {
        C10664xF1.E(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> AbstractC6237fB2<T> Y(@InterfaceC7894ly1 T t) {
        return new k(t);
    }

    public static int Z(Iterator<?> it) {
        long j2 = 0;
        while (it.hasNext()) {
            it.next();
            j2++;
        }
        return C7775lT0.x(j2);
    }

    @InterfaceC6181ey
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        C10664xF1.E(collection);
        C10664xF1.E(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    @InterfaceC11149zF0
    public static <T> T[] a0(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) C5098aU0.Q(C10608x11.s(it), cls);
    }

    @InterfaceC6181ey
    public static int b(Iterator<?> it, int i2) {
        boolean z;
        C10664xF1.E(it);
        int i3 = 0;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "numberToAdvance must be nonnegative");
        while (i3 < i2 && it.hasNext()) {
            it.next();
            i3++;
        }
        return i3;
    }

    public static String b0(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(C6566gU0.h);
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> boolean c(Iterator<T> it, IF1<? super T> if1) {
        C10664xF1.E(if1);
        while (it.hasNext()) {
            if (!if1.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <F, T> Iterator<T> c0(Iterator<F> it, YA0<? super F, ? extends T> ya0) {
        C10664xF1.E(ya0);
        return new h(it, ya0);
    }

    public static <T> boolean d(Iterator<T> it, IF1<? super T> if1) {
        if (M(it, if1) != -1) {
            return true;
        }
        return false;
    }

    public static <T> AbstractC4468Uv1<T> d0(Iterator<T> it, IF1<? super T> if1) {
        C10664xF1.E(it);
        C10664xF1.E(if1);
        while (it.hasNext()) {
            T next = it.next();
            if (if1.apply(next)) {
                return AbstractC4468Uv1.f(next);
            }
        }
        return AbstractC4468Uv1.a();
    }

    public static <T> Enumeration<T> e(Iterator<T> it) {
        C10664xF1.E(it);
        return new b(it);
    }

    public static <T> AbstractC6237fB2<T> e0(Iterator<? extends T> it) {
        C10664xF1.E(it);
        if (it instanceof AbstractC6237fB2) {
            return (AbstractC6237fB2) it;
        }
        return new c(it);
    }

    public static <T> ListIterator<T> f(Iterator<T> it) {
        return (ListIterator) it;
    }

    @Deprecated
    public static <T> AbstractC6237fB2<T> f0(AbstractC6237fB2<T> abstractC6237fB2) {
        return (AbstractC6237fB2) C10664xF1.E(abstractC6237fB2);
    }

    public static void g(int i2) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("position (");
        sb.append(i2);
        sb.append(") must not be negative");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static void h(Iterator<?> it) {
        C10664xF1.E(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> i(Iterator<? extends Iterator<? extends T>> it) {
        return new m(it);
    }

    public static <T> Iterator<T> j(Iterator<? extends T> it, Iterator<? extends T> it2) {
        C10664xF1.E(it);
        C10664xF1.E(it2);
        return i(o(it, it2));
    }

    public static <T> Iterator<T> k(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        C10664xF1.E(it);
        C10664xF1.E(it2);
        C10664xF1.E(it3);
        return i(o(it, it2, it3));
    }

    public static <T> Iterator<T> l(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        C10664xF1.E(it);
        C10664xF1.E(it2);
        C10664xF1.E(it3);
        C10664xF1.E(it4);
        return i(o(it, it2, it3, it4));
    }

    public static <T> Iterator<T> m(Iterator<? extends T>... itArr) {
        return n((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> n(Iterator<? extends T>... itArr) {
        for (Iterator it : (Iterator[]) C10664xF1.E(itArr)) {
            C10664xF1.E(it);
        }
        return i(o(itArr));
    }

    public static <I extends Iterator<?>> Iterator<I> o(I... iArr) {
        return new e(iArr);
    }

    public static <T> Iterator<T> p(Iterator<T> it) {
        C10664xF1.E(it);
        return new j(it);
    }

    public static boolean q(Iterator<?> it, @MB Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> r(Iterable<T> iterable) {
        C10664xF1.E(iterable);
        return new d(iterable);
    }

    @SafeVarargs
    public static <T> Iterator<T> s(T... tArr) {
        return r(C10608x11.t(tArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C2593Bt1.a(it.next(), it2.next())) {
                return false;
            }
            while (it.hasNext()) {
            }
        }
        return !it2.hasNext();
    }

    public static <T> AbstractC6237fB2<T> u() {
        return v();
    }

    public static <T> AbstractC7705lB2<T> v() {
        return (AbstractC7705lB2<T>) l.Z0;
    }

    public static <T> Iterator<T> w() {
        return n.INSTANCE;
    }

    @InterfaceC11149zF0
    public static <T> AbstractC6237fB2<T> x(Iterator<?> it, Class<T> cls) {
        return y(it, C7985mG1.o(cls));
    }

    public static <T> AbstractC6237fB2<T> y(Iterator<T> it, IF1<? super T> if1) {
        C10664xF1.E(it);
        C10664xF1.E(if1);
        return new g(it, if1);
    }

    @InterfaceC7894ly1
    public static <T> T z(Iterator<T> it, IF1<? super T> if1) {
        C10664xF1.E(it);
        C10664xF1.E(if1);
        while (it.hasNext()) {
            T next = it.next();
            if (if1.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }
}
