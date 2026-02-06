package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* loaded from: classes4.dex */
public interface RK0<T> extends InterfaceC6765hJ0<T, RK0<T>, Stream<T>> {

    /* loaded from: classes4.dex */
    public class a implements Iterator<T> {
        public T X = (T) VK0.a;
        public final /* synthetic */ Object Y;
        public final /* synthetic */ InterfaceC6032eL0 Z;

        public a(Object obj, InterfaceC6032eL0 interfaceC6032eL0) {
            this.Y = obj;
            this.Z = interfaceC6032eL0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return true;
        }

        @Override // java.util.Iterator
        public T next() throws NoSuchElementException {
            T apply;
            try {
                T t = this.X;
                if (t == VK0.a) {
                    apply = (T) this.Y;
                } else {
                    apply = this.Z.apply(t);
                }
                this.X = apply;
                return apply;
            } catch (IOException e) {
                NoSuchElementException noSuchElementException = new NoSuchElementException();
                noSuchElementException.initCause(e);
                throw noSuchElementException;
            }
        }
    }

    static <T> RK0<T> C2(Iterable<T> iterable) {
        if (iterable == null) {
            return empty();
        }
        return u5(StreamSupport.stream(iterable.spliterator(), false));
    }

    static /* synthetic */ void F2(EJ0 ej0, AtomicReference atomicReference, BiFunction biFunction, AtomicInteger atomicInteger, Object obj) {
        try {
            ej0.accept(obj);
        } catch (IOException e) {
            if (atomicReference.get() == null) {
                atomicReference.set(new ArrayList());
            }
            if (biFunction != null) {
                ((List) atomicReference.get()).add((IOException) biFunction.apply(Integer.valueOf(atomicInteger.get()), e));
            }
        }
        atomicInteger.incrementAndGet();
    }

    static /* synthetic */ IntStream G1(RJ0 rj0, Object obj) {
        return (IntStream) C7086ie0.d(rj0, obj);
    }

    static /* synthetic */ IOException J1(Integer num, IOException iOException) {
        return iOException;
    }

    static <T> RK0<T> Q0(T t, InterfaceC6032eL0<T> interfaceC6032eL0) {
        Objects.requireNonNull(interfaceC6032eL0);
        return u5(StreamSupport.stream(Spliterators.spliteratorUnknownSize(new a(t, interfaceC6032eL0), 1040), false));
    }

    static /* synthetic */ LongStream d4(RJ0 rj0, Object obj) {
        return (LongStream) C7086ie0.d(rj0, obj);
    }

    static <T> RK0<T> empty() {
        return SK0.u5(Stream.empty());
    }

    static /* synthetic */ DoubleStream f1(RJ0 rj0, Object obj) {
        return (DoubleStream) C7086ie0.d(rj0, obj);
    }

    @SafeVarargs
    static <T> RK0<T> of(T... tArr) {
        return (tArr == null || tArr.length == 0) ? empty() : u5(Arrays.stream(tArr));
    }

    static <T> RK0<T> u5(Stream<T> stream) {
        return SK0.u5(stream);
    }

    default void B1(final EJ0<? super T> ej0) throws IOException {
        e().forEachOrdered(new Consumer() { // from class: o.MK0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C7086ie0.b(EJ0.this, obj);
            }
        });
    }

    default Optional<T> B2(final InterfaceC11165zJ0<? super T> interfaceC11165zJ0) throws IOException {
        return e().max(new Comparator() { // from class: o.OK0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e;
                e = C7086ie0.e(InterfaceC11165zJ0.this, obj, obj2);
                return e;
            }
        });
    }

    default RK0<T> E1(final EJ0<? super T> ej0) throws IOException {
        return u5(e().peek(new Consumer() { // from class: o.xK0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C7086ie0.b(EJ0.this, obj);
            }
        }));
    }

    default boolean H2(final InterfaceC7739lK0<? super T> interfaceC7739lK0) throws IOException {
        return e().allMatch(new Predicate() { // from class: o.DK0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean i;
                i = C7086ie0.i(InterfaceC7739lK0.this, obj);
                return i;
            }
        });
    }

    default void K(final EJ0<? super T> ej0) throws IOException {
        e().forEach(new Consumer() { // from class: o.KK0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C7086ie0.b(EJ0.this, obj);
            }
        });
    }

    default T P1(T t, final InterfaceC9461sJ0<T> interfaceC9461sJ0) throws IOException {
        return e().reduce(t, new BinaryOperator() { // from class: o.GK0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object c;
                c = C7086ie0.c(InterfaceC9461sJ0.this, obj, obj2);
                return c;
            }
        });
    }

    default <U> U W2(U u, final InterfaceC8483oJ0<U, ? super T, U> interfaceC8483oJ0, final InterfaceC9461sJ0<U> interfaceC9461sJ0) throws IOException {
        return (U) e().reduce(u, new BiFunction() { // from class: o.AK0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object c;
                c = C7086ie0.c(InterfaceC8483oJ0.this, obj, obj2);
                return c;
            }
        }, new BinaryOperator() { // from class: o.BK0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object c;
                c = C7086ie0.c(InterfaceC9461sJ0.this, obj, obj2);
                return c;
            }
        });
    }

    default <R> R X1(final XK0<R> xk0, final InterfaceC7735lJ0<R, ? super T> interfaceC7735lJ0, final InterfaceC7735lJ0<R, R> interfaceC7735lJ02) throws IOException {
        return (R) e().collect(new Supplier() { // from class: o.PK0
            @Override // java.util.function.Supplier
            public final Object get() {
                Object f;
                f = C7086ie0.f(XK0.this);
                return f;
            }
        }, new BiConsumer() { // from class: o.QK0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7086ie0.a(InterfaceC7735lJ0.this, obj, obj2);
            }
        }, new BiConsumer() { // from class: o.uK0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7086ie0.a(InterfaceC7735lJ0.this, obj, obj2);
            }
        });
    }

    default boolean a2(final InterfaceC7739lK0<? super T> interfaceC7739lK0) throws IOException {
        return e().noneMatch(new Predicate() { // from class: o.JK0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean i;
                i = C7086ie0.i(InterfaceC7739lK0.this, obj);
                return i;
            }
        });
    }

    default DoubleStream a3(final RJ0<? super T, ? extends DoubleStream> rj0) throws IOException {
        return e().flatMapToDouble(new Function() { // from class: o.HK0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return RK0.f1(RJ0.this, obj);
            }
        });
    }

    default RK0<T> b3(final InterfaceC11165zJ0<? super T> interfaceC11165zJ0) throws IOException {
        return u5(e().sorted(new Comparator() { // from class: o.IK0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e;
                e = C7086ie0.e(InterfaceC11165zJ0.this, obj, obj2);
                return e;
            }
        }));
    }

    default IntStream b5(final RJ0<? super T, ? extends IntStream> rj0) throws IOException {
        return e().flatMapToInt(new Function() { // from class: o.EK0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return RK0.G1(RJ0.this, obj);
            }
        });
    }

    default Optional<T> c3(final InterfaceC9461sJ0<T> interfaceC9461sJ0) throws IOException {
        return e().reduce(new BinaryOperator() { // from class: o.tK0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object c;
                c = C7086ie0.c(InterfaceC9461sJ0.this, obj, obj2);
                return c;
            }
        });
    }

    default <R, A> R collect(Collector<? super T, A, R> collector) {
        return (R) e().collect(collector);
    }

    default long count() {
        return e().count();
    }

    default RK0<T> distinct() {
        return u5(e().distinct());
    }

    default boolean f4(final InterfaceC7739lK0<? super T> interfaceC7739lK0) throws IOException {
        return e().anyMatch(new Predicate() { // from class: o.CK0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean i;
                i = C7086ie0.i(InterfaceC7739lK0.this, obj);
                return i;
            }
        });
    }

    default RK0<T> f5(final InterfaceC7739lK0<? super T> interfaceC7739lK0) throws IOException {
        return u5(e().filter(new Predicate() { // from class: o.zK0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean i;
                i = C7086ie0.i(InterfaceC7739lK0.this, obj);
                return i;
            }
        }));
    }

    default Optional<T> findAny() {
        return e().findAny();
    }

    default Optional<T> findFirst() {
        return e().findFirst();
    }

    default <R> RK0<R> g2(final RJ0<? super T, ? extends R> rj0) throws IOException {
        return u5(e().map(new Function() { // from class: o.vK0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object d;
                d = C7086ie0.d(RJ0.this, obj);
                return d;
            }
        }));
    }

    default LongStream j2(final RJ0<? super T, ? extends LongStream> rj0) throws IOException {
        return e().flatMapToLong(new Function() { // from class: o.FK0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return RK0.d4(RJ0.this, obj);
            }
        });
    }

    default RK0<T> limit(long j) {
        return u5(e().limit(j));
    }

    default void m2(EJ0<T> ej0, final BiFunction<Integer, IOException, IOException> biFunction) throws FJ0 {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger();
        final EJ0 i = VK0.i(ej0);
        e().forEach(new Consumer() { // from class: o.LK0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                RK0.F2(EJ0.this, atomicReference, biFunction, atomicInteger, obj);
            }
        });
        FJ0.d((List) atomicReference.get(), null);
    }

    default DoubleStream mapToDouble(ToDoubleFunction<? super T> toDoubleFunction) {
        return e().mapToDouble(toDoubleFunction);
    }

    default IntStream mapToInt(ToIntFunction<? super T> toIntFunction) {
        return e().mapToInt(toIntFunction);
    }

    default LongStream mapToLong(ToLongFunction<? super T> toLongFunction) {
        return e().mapToLong(toLongFunction);
    }

    default <R> RK0<R> o4(final RJ0<? super T, ? extends RK0<? extends R>> rj0) throws IOException {
        return u5(e().flatMap(new Function() { // from class: o.wK0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream e;
                e = ((RK0) C7086ie0.d(RJ0.this, obj)).e();
                return e;
            }
        }));
    }

    default RK0<T> skip(long j) {
        return u5(e().skip(j));
    }

    default RK0<T> sorted() {
        return u5(e().sorted());
    }

    default Object[] toArray() {
        return e().toArray();
    }

    default void v5(EJ0<T> ej0) throws FJ0 {
        m2(ej0, new BiFunction() { // from class: o.yK0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return RK0.J1((Integer) obj, (IOException) obj2);
            }
        });
    }

    default Optional<T> y2(final InterfaceC11165zJ0<? super T> interfaceC11165zJ0) throws IOException {
        return e().min(new Comparator() { // from class: o.NK0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e;
                e = C7086ie0.e(InterfaceC11165zJ0.this, obj, obj2);
                return e;
            }
        });
    }

    static <T> RK0<T> of(T t) {
        return u5(Stream.of(t));
    }

    default <A> A[] toArray(IntFunction<A[]> intFunction) {
        return (A[]) e().toArray(intFunction);
    }
}
