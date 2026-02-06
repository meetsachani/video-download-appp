package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.aU0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5098aU0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$a */
    /* loaded from: classes3.dex */
    public class a<T> implements YA0<Iterable<? extends T>, Iterator<? extends T>> {
        @Override // o.YA0
        /* renamed from: a */
        public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$b */
    /* loaded from: classes3.dex */
    public class b<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable Y;

        public b(Iterable iterable) {
            this.Y = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.r(this.Y);
        }

        @Override // o.AbstractC10343vw0
        public String toString() {
            return String.valueOf(this.Y.toString()).concat(" (cycled)");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$c */
    /* loaded from: classes3.dex */
    public class c<T> extends AbstractC10343vw0<List<T>> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ int Z;

        public c(Iterable iterable, int i) {
            this.Y = iterable;
            this.Z = i;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return C7052iU0.Q(this.Y.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$d */
    /* loaded from: classes3.dex */
    public class d<T> extends AbstractC10343vw0<List<T>> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ int Z;

        public d(Iterable iterable, int i) {
            this.Y = iterable;
            this.Z = i;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return C7052iU0.P(this.Y.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$e */
    /* loaded from: classes3.dex */
    public class e<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ IF1 Z;

        public e(Iterable iterable, IF1 if1) {
            this.Y = iterable;
            this.Z = if1;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.y(this.Y.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$f */
    /* loaded from: classes3.dex */
    public class f<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ YA0 Z;

        public f(Iterable iterable, YA0 ya0) {
            this.Y = iterable;
            this.Z = ya0;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.c0(this.Y.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$g */
    /* loaded from: classes3.dex */
    public class g<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ int Z;

        /* renamed from: o.aU0$g$a */
        /* loaded from: classes3.dex */
        public class a implements Iterator<T> {
            public boolean X = true;
            public final /* synthetic */ Iterator Y;

            public a(g gVar, Iterator it) {
                this.Y = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.Y.hasNext();
            }

            @Override // java.util.Iterator
            @InterfaceC7894ly1
            public T next() {
                T t = (T) this.Y.next();
                this.X = false;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                C5037aF.e(!this.X);
                this.Y.remove();
            }
        }

        public g(Iterable iterable, int i) {
            this.Y = iterable;
            this.Z = i;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.Y;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.Z), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            C7052iU0.b(it, this.Z);
            return new a(this, it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$h */
    /* loaded from: classes3.dex */
    public class h<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ int Z;

        public h(Iterable iterable, int i) {
            this.Y = iterable;
            this.Z = i;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.N(this.Y.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$i */
    /* loaded from: classes3.dex */
    public class i<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable Y;

        public i(Iterable iterable) {
            this.Y = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.Y;
            if (iterable instanceof Queue) {
                return new AL((Queue) iterable);
            }
            return C7052iU0.p(iterable.iterator());
        }

        @Override // o.AbstractC10343vw0
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.aU0$j */
    /* loaded from: classes3.dex */
    public class j<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ Comparator Z;

        public j(Iterable iterable, Comparator comparator) {
            this.Y = iterable;
            this.Z = comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.O(C5098aU0.U(this.Y, C5098aU0.S()), this.Z);
        }
    }

    /* renamed from: o.aU0$k */
    /* loaded from: classes3.dex */
    public static final class k<T> extends AbstractC10343vw0<T> {
        public final Iterable<? extends T> Y;

        public /* synthetic */ k(Iterable iterable, b bVar) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.e0(this.Y.iterator());
        }

        @Override // o.AbstractC10343vw0
        public String toString() {
            return this.Y.toString();
        }

        public k(Iterable<? extends T> iterable) {
            this.Y = iterable;
        }
    }

    @InterfaceC7894ly1
    public static <T> T A(Iterable<? extends T> iterable, @InterfaceC7894ly1 T t) {
        return (T) C7052iU0.L(iterable.iterator(), t);
    }

    public static <T> int B(Iterable<T> iterable, IF1<? super T> if1) {
        return C7052iU0.M(iterable.iterator(), if1);
    }

    public static boolean C(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> D(Iterable<T> iterable, int i2) {
        boolean z;
        C10664xF1.E(iterable);
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "limit is negative");
        return new h(iterable, i2);
    }

    @InterfaceC4238Sm
    public static <T> Iterable<T> E(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        C10664xF1.F(iterable, "iterables");
        C10664xF1.F(comparator, "comparator");
        return new k(new j(iterable, comparator), null);
    }

    public static <T> Iterable<List<T>> F(Iterable<T> iterable, int i2) {
        boolean z;
        C10664xF1.E(iterable);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        return new d(iterable, i2);
    }

    public static <T> Iterable<List<T>> G(Iterable<T> iterable, int i2) {
        boolean z;
        C10664xF1.E(iterable);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        return new c(iterable, i2);
    }

    @InterfaceC6181ey
    public static boolean H(Iterable<?> iterable, Collection<?> collection) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).removeAll((Collection) C10664xF1.E(collection));
        }
        return C7052iU0.V(iterable.iterator(), collection);
    }

    @MB
    public static <T> T I(Iterable<T> iterable, IF1<? super T> if1) {
        C10664xF1.E(if1);
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (if1.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @InterfaceC6181ey
    public static <T> boolean J(Iterable<T> iterable, IF1<? super T> if1) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            return K((List) iterable, (IF1) C10664xF1.E(if1));
        }
        return C7052iU0.W(iterable.iterator(), if1);
    }

    public static <T> boolean K(List<T> list, IF1<? super T> if1) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            T t = list.get(i2);
            if (!if1.apply(t)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, t);
                    } catch (IllegalArgumentException unused) {
                        O(list, if1, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        O(list, if1, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        if (i2 == i3) {
            return false;
        }
        return true;
    }

    @InterfaceC6181ey
    public static boolean L(Iterable<?> iterable, Collection<?> collection) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).retainAll((Collection) C10664xF1.E(collection));
        }
        return C7052iU0.X(iterable.iterator(), collection);
    }

    public static int M(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return C7052iU0.Z(iterable.iterator());
    }

    public static <T> Iterable<T> N(Iterable<T> iterable, int i2) {
        boolean z;
        C10664xF1.E(iterable);
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "number to skip cannot be negative");
        return new g(iterable, i2);
    }

    public static <T> void O(List<T> list, IF1<? super T> if1, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (if1.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    public static Object[] P(Iterable<?> iterable) {
        return d(iterable).toArray();
    }

    @InterfaceC11149zF0
    public static <T> T[] Q(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) R(iterable, C5436bt1.i(cls, 0));
    }

    public static <T> T[] R(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) d(iterable).toArray(tArr);
    }

    public static <T> YA0<Iterable<? extends T>, Iterator<? extends T>> S() {
        return new a();
    }

    public static String T(Iterable<?> iterable) {
        return C7052iU0.b0(iterable.iterator());
    }

    public static <F, T> Iterable<T> U(Iterable<F> iterable, YA0<? super F, ? extends T> ya0) {
        C10664xF1.E(iterable);
        C10664xF1.E(ya0);
        return new f(iterable, ya0);
    }

    public static <T> AbstractC4468Uv1<T> V(Iterable<T> iterable, IF1<? super T> if1) {
        return C7052iU0.d0(iterable.iterator(), if1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> W(Iterable<? extends T> iterable) {
        C10664xF1.E(iterable);
        if (!(iterable instanceof k)) {
            if (iterable instanceof TN0) {
                return iterable;
            }
            return new k(iterable, null);
        }
        return iterable;
    }

    @Deprecated
    public static <E> Iterable<E> X(TN0<E> tn0) {
        return (Iterable) C10664xF1.E(tn0);
    }

    @InterfaceC6181ey
    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        return C7052iU0.a(collection, ((Iterable) C10664xF1.E(iterable)).iterator());
    }

    public static <T> boolean b(Iterable<T> iterable, IF1<? super T> if1) {
        return C7052iU0.c(iterable.iterator(), if1);
    }

    public static <T> boolean c(Iterable<T> iterable, IF1<? super T> if1) {
        return C7052iU0.d(iterable.iterator(), if1);
    }

    public static <E> Collection<E> d(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C10608x11.s(iterable.iterator());
    }

    public static <T> Iterable<T> e(Iterable<? extends Iterable<? extends T>> iterable) {
        return AbstractC10343vw0.i(iterable);
    }

    public static <T> Iterable<T> f(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return AbstractC10343vw0.j(iterable, iterable2);
    }

    public static <T> Iterable<T> g(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return AbstractC10343vw0.k(iterable, iterable2, iterable3);
    }

    public static <T> Iterable<T> h(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return AbstractC10343vw0.l(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> i(Iterable<? extends T>... iterableArr) {
        return AbstractC10343vw0.p(iterableArr);
    }

    public static <T> Iterable<T> j(Iterable<T> iterable) {
        C10664xF1.E(iterable);
        return new i(iterable);
    }

    public static boolean k(Iterable<? extends Object> iterable, @MB Object obj) {
        if (iterable instanceof Collection) {
            return C7232jF.j((Collection) iterable, obj);
        }
        return C7052iU0.q(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> l(Iterable<T> iterable) {
        C10664xF1.E(iterable);
        return new b(iterable);
    }

    @SafeVarargs
    public static <T> Iterable<T> m(T... tArr) {
        return l(C10608x11.t(tArr));
    }

    public static boolean n(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return C7052iU0.t(iterable.iterator(), iterable2.iterator());
    }

    @InterfaceC11149zF0
    public static <T> Iterable<T> o(Iterable<?> iterable, Class<T> cls) {
        C10664xF1.E(iterable);
        C10664xF1.E(cls);
        return p(iterable, C7985mG1.o(cls));
    }

    public static <T> Iterable<T> p(Iterable<T> iterable, IF1<? super T> if1) {
        C10664xF1.E(iterable);
        C10664xF1.E(if1);
        return new e(iterable, if1);
    }

    @InterfaceC7894ly1
    public static <T> T q(Iterable<T> iterable, IF1<? super T> if1) {
        return (T) C7052iU0.z(iterable.iterator(), if1);
    }

    @MB
    public static <T> T r(Iterable<? extends T> iterable, IF1<? super T> if1, @MB T t) {
        return (T) C7052iU0.A(iterable.iterator(), if1, t);
    }

    public static int s(Iterable<?> iterable, @MB Object obj) {
        if (iterable instanceof InterfaceC2467Am1) {
            return ((InterfaceC2467Am1) iterable).w4(obj);
        }
        if (iterable instanceof Set) {
            return ((Set) iterable).contains(obj) ? 1 : 0;
        }
        return C7052iU0.E(iterable.iterator(), obj);
    }

    @InterfaceC7894ly1
    public static <T> T t(Iterable<T> iterable, int i2) {
        C10664xF1.E(iterable);
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i2);
        }
        return (T) C7052iU0.F(iterable.iterator(), i2);
    }

    @InterfaceC7894ly1
    public static <T> T u(Iterable<? extends T> iterable, int i2, @InterfaceC7894ly1 T t) {
        C10664xF1.E(iterable);
        C7052iU0.g(i2);
        if (iterable instanceof List) {
            List f2 = C10608x11.f(iterable);
            if (i2 < f2.size()) {
                return (T) f2.get(i2);
            }
            return t;
        }
        Iterator<? extends T> it = iterable.iterator();
        C7052iU0.b(it, i2);
        return (T) C7052iU0.J(it, t);
    }

    @InterfaceC7894ly1
    public static <T> T v(Iterable<? extends T> iterable, @InterfaceC7894ly1 T t) {
        return (T) C7052iU0.J(iterable.iterator(), t);
    }

    @InterfaceC7894ly1
    public static <T> T w(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) y(list);
            }
            throw new NoSuchElementException();
        }
        return (T) C7052iU0.H(iterable.iterator());
    }

    @InterfaceC7894ly1
    public static <T> T x(Iterable<? extends T> iterable, @InterfaceC7894ly1 T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) y(C10608x11.f(iterable));
            }
        }
        return (T) C7052iU0.I(iterable.iterator(), t);
    }

    @InterfaceC7894ly1
    public static <T> T y(List<T> list) {
        return list.get(list.size() - 1);
    }

    @InterfaceC7894ly1
    public static <T> T z(Iterable<T> iterable) {
        return (T) C7052iU0.K(iterable.iterator());
    }
}
