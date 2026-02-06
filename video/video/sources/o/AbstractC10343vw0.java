package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.vw0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10343vw0<E> implements Iterable<E> {
    public final AbstractC4468Uv1<Iterable<E>> X;

    /* renamed from: o.vw0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC10343vw0<E> {
        public final /* synthetic */ Iterable Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.Y = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.Y.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.vw0$b */
    /* loaded from: classes3.dex */
    public class b<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable Y;

        public b(Iterable iterable) {
            this.Y = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.i(C7052iU0.c0(this.Y.iterator(), C5098aU0.S()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.vw0$c */
    /* loaded from: classes3.dex */
    public class c<T> extends AbstractC10343vw0<T> {
        public final /* synthetic */ Iterable[] Y;

        /* renamed from: o.vw0$c$a */
        /* loaded from: classes3.dex */
        public class a extends Y0<Iterator<? extends T>> {
            public a(int i) {
                super(i);
            }

            @Override // o.Y0
            /* renamed from: c */
            public Iterator<? extends T> b(int i) {
                return c.this.Y[i].iterator();
            }
        }

        public c(Iterable[] iterableArr) {
            this.Y = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.i(new a(this.Y.length));
        }
    }

    /* renamed from: o.vw0$d */
    /* loaded from: classes3.dex */
    public static class d<E> implements YA0<Iterable<E>, AbstractC10343vw0<E>> {
        @Override // o.YA0
        /* renamed from: a */
        public AbstractC10343vw0<E> apply(Iterable<E> iterable) {
            return AbstractC10343vw0.J(iterable);
        }
    }

    public AbstractC10343vw0() {
        this.X = AbstractC4468Uv1.a();
    }

    public static <E> AbstractC10343vw0<E> J(Iterable<E> iterable) {
        if (iterable instanceof AbstractC10343vw0) {
            return (AbstractC10343vw0) iterable;
        }
        return new a(iterable, iterable);
    }

    @Deprecated
    @VP0(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    public static <E> AbstractC10343vw0<E> K(AbstractC10343vw0<E> abstractC10343vw0) {
        return (AbstractC10343vw0) C10664xF1.E(abstractC10343vw0);
    }

    @InterfaceC4238Sm
    public static <E> AbstractC10343vw0<E> L(E[] eArr) {
        return J(Arrays.asList(eArr));
    }

    @InterfaceC4238Sm
    public static <E> AbstractC10343vw0<E> Y() {
        return J(Collections.EMPTY_LIST);
    }

    @InterfaceC4238Sm
    public static <E> AbstractC10343vw0<E> a0(@InterfaceC7894ly1 E e, E... eArr) {
        return J(C10608x11.c(e, eArr));
    }

    @InterfaceC4238Sm
    public static <T> AbstractC10343vw0<T> i(Iterable<? extends Iterable<? extends T>> iterable) {
        C10664xF1.E(iterable);
        return new b(iterable);
    }

    @InterfaceC4238Sm
    public static <T> AbstractC10343vw0<T> j(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return r(iterable, iterable2);
    }

    @InterfaceC4238Sm
    public static <T> AbstractC10343vw0<T> k(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return r(iterable, iterable2, iterable3);
    }

    @InterfaceC4238Sm
    public static <T> AbstractC10343vw0<T> l(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return r(iterable, iterable2, iterable3, iterable4);
    }

    @InterfaceC4238Sm
    public static <T> AbstractC10343vw0<T> p(Iterable<? extends T>... iterableArr) {
        return r((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <T> AbstractC10343vw0<T> r(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            C10664xF1.E(iterable);
        }
        return new c(iterableArr);
    }

    public final AbstractC10343vw0<E> B() {
        return J(C5098aU0.l(M()));
    }

    @InterfaceC11149zF0
    public final <T> AbstractC10343vw0<T> D(Class<T> cls) {
        return J(C5098aU0.o(M(), cls));
    }

    public final AbstractC10343vw0<E> F(IF1<? super E> if1) {
        return J(C5098aU0.p(M(), if1));
    }

    public final AbstractC4468Uv1<E> G() {
        Iterator<E> it = M().iterator();
        if (it.hasNext()) {
            return AbstractC4468Uv1.f(it.next());
        }
        return AbstractC4468Uv1.a();
    }

    public final AbstractC4468Uv1<E> H(IF1<? super E> if1) {
        return C5098aU0.V(M(), if1);
    }

    public final Iterable<E> M() {
        return this.X.g(this);
    }

    public final <K> C5559cO0<K, E> Q(YA0<? super E, K> ya0) {
        return C10547wm1.r(M(), ya0);
    }

    @InterfaceC4238Sm
    public final String U(C7782lV0 c7782lV0) {
        return c7782lV0.k(this);
    }

    public final AbstractC4468Uv1<E> V() {
        E next;
        Iterable<E> M = M();
        if (M instanceof List) {
            List list = (List) M;
            if (list.isEmpty()) {
                return AbstractC4468Uv1.a();
            }
            return AbstractC4468Uv1.f(list.get(list.size() - 1));
        }
        Iterator<E> it = M.iterator();
        if (!it.hasNext()) {
            return AbstractC4468Uv1.a();
        }
        if (M instanceof SortedSet) {
            return AbstractC4468Uv1.f(((SortedSet) M).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return AbstractC4468Uv1.f(next);
    }

    public final AbstractC10343vw0<E> X(int i) {
        return J(C5098aU0.D(M(), i));
    }

    public final AbstractC10343vw0<E> b0(int i) {
        return J(C5098aU0.N(M(), i));
    }

    public final boolean contains(@MB Object obj) {
        return C5098aU0.k(M(), obj);
    }

    public final boolean d(IF1<? super E> if1) {
        return C5098aU0.b(M(), if1);
    }

    @InterfaceC11149zF0
    public final E[] d0(Class<E> cls) {
        return (E[]) C5098aU0.Q(M(), cls);
    }

    public final boolean e(IF1<? super E> if1) {
        return C5098aU0.c(M(), if1);
    }

    public final AbstractC5317bO0<E> e0() {
        return AbstractC5317bO0.D(M());
    }

    @InterfaceC4238Sm
    public final AbstractC10343vw0<E> f(Iterable<? extends E> iterable) {
        return j(M(), iterable);
    }

    public final <V> AbstractC6044eO0<E, V> f0(YA0<? super E, V> ya0) {
        return C7935m81.u0(M(), ya0);
    }

    @InterfaceC7894ly1
    public final E get(int i) {
        return (E) C5098aU0.t(M(), i);
    }

    @InterfaceC4238Sm
    public final AbstractC10343vw0<E> h(E... eArr) {
        return j(M(), Arrays.asList(eArr));
    }

    public final AbstractC7269jO0<E> h0() {
        return AbstractC7269jO0.w(M());
    }

    public final boolean isEmpty() {
        return !M().iterator().hasNext();
    }

    public final AbstractC9481sO0<E> j0() {
        return AbstractC9481sO0.F(M());
    }

    public final AbstractC5317bO0<E> k0(Comparator<? super E> comparator) {
        return AbstractC10587ww1.h(comparator).l(M());
    }

    public final AbstractC10942yO0<E> l0(Comparator<? super E> comparator) {
        return AbstractC10942yO0.t0(comparator, M());
    }

    public final <T> AbstractC10343vw0<T> m0(YA0<? super E, T> ya0) {
        return J(C5098aU0.U(M(), ya0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> AbstractC10343vw0<T> n0(YA0<? super E, ? extends Iterable<? extends T>> ya0) {
        return i(m0(ya0));
    }

    public final <K> AbstractC6044eO0<K, E> p0(YA0<? super E, K> ya0) {
        return C7935m81.E0(M(), ya0);
    }

    public final int size() {
        return C5098aU0.M(M());
    }

    public String toString() {
        return C5098aU0.T(M());
    }

    @InterfaceC6181ey
    public final <C extends Collection<? super E>> C w(C c2) {
        C10664xF1.E(c2);
        Iterable<E> M = M();
        if (M instanceof Collection) {
            c2.addAll((Collection) M);
            return c2;
        }
        for (E e : M) {
            c2.add(e);
        }
        return c2;
    }

    public AbstractC10343vw0(Iterable<E> iterable) {
        this.X = AbstractC4468Uv1.f(iterable);
    }
}
