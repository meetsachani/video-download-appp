package o;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface RJ0<T, R> {
    static <T> RJ0<T, T> identity() {
        return HK.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object A(Function function, Object obj) throws IOException {
        return function.apply(apply(obj));
    }

    default <V> RJ0<T, V> a(final RJ0<? super R, ? extends V> rj0) {
        Objects.requireNonNull(rj0, C5445bv2.d0);
        return new RJ0() { // from class: o.JJ0
            {
                RJ0.this = this;
            }

            @Override // o.RJ0
            public final Object apply(Object obj) {
                Object m;
                m = RJ0.this.m(rj0, obj);
                return m;
            }
        };
    }

    default EJ0<T> andThen(final Consumer<? super R> consumer) {
        Objects.requireNonNull(consumer, C5445bv2.d0);
        return new EJ0() { // from class: o.NJ0
            {
                RJ0.this = this;
            }

            @Override // o.EJ0
            public final void accept(Object obj) {
                RJ0.this.s(consumer, obj);
            }
        };
    }

    R apply(T t) throws IOException;

    default EJ0<T> c(final EJ0<? super R> ej0) {
        Objects.requireNonNull(ej0, C5445bv2.d0);
        return new EJ0() { // from class: o.LJ0
            {
                RJ0.this = this;
            }

            @Override // o.EJ0
            public final void accept(Object obj) {
                RJ0.this.h(ej0, obj);
            }
        };
    }

    default <V> RJ0<V, R> compose(final Function<? super V, ? extends T> function) {
        Objects.requireNonNull(function, C5445bv2.c0);
        return new RJ0() { // from class: o.KJ0
            {
                RJ0.this = this;
            }

            @Override // o.RJ0
            public final Object apply(Object obj) {
                Object e;
                e = RJ0.this.e(function, obj);
                return e;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object d(Supplier supplier) throws IOException {
        return apply(supplier.get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object e(Function function, Object obj) throws IOException {
        return apply(function.apply(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void h(EJ0 ej0, Object obj) throws IOException {
        ej0.accept(apply(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object i(RJ0 rj0, Object obj) throws IOException {
        return apply(rj0.apply(obj));
    }

    default Function<T, R> j() {
        return new Function() { // from class: o.IJ0
            {
                RJ0.this = this;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object v;
                v = RJ0.this.v(obj);
                return v;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object m(RJ0 rj0, Object obj) throws IOException {
        return rj0.apply(apply(obj));
    }

    default <V> RJ0<V, R> p(final RJ0<? super V, ? extends T> rj0) {
        Objects.requireNonNull(rj0, C5445bv2.c0);
        return new RJ0() { // from class: o.PJ0
            {
                RJ0.this = this;
            }

            @Override // o.RJ0
            public final Object apply(Object obj) {
                Object i;
                i = RJ0.this.i(rj0, obj);
                return i;
            }
        };
    }

    default XK0<R> q(final XK0<? extends T> xk0) {
        Objects.requireNonNull(xk0, C5445bv2.c0);
        return new XK0() { // from class: o.OJ0
            {
                RJ0.this = this;
            }

            @Override // o.XK0
            public final Object get() {
                Object y;
                y = RJ0.this.y(xk0);
                return y;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void s(Consumer consumer, Object obj) throws IOException {
        consumer.accept(apply(obj));
    }

    /* synthetic */ default Object v(Object obj) {
        return C8643oy2.f(this, obj);
    }

    default XK0<R> x(final Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, C5445bv2.c0);
        return new XK0() { // from class: o.QJ0
            {
                RJ0.this = this;
            }

            @Override // o.XK0
            public final Object get() {
                Object d;
                d = RJ0.this.d(supplier);
                return d;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object y(XK0 xk0) throws IOException {
        return apply(xk0.get());
    }

    default <V> RJ0<T, V> andThen(final Function<? super R, ? extends V> function) {
        Objects.requireNonNull(function, C5445bv2.d0);
        return new RJ0() { // from class: o.MJ0
            {
                RJ0.this = this;
            }

            @Override // o.RJ0
            public final Object apply(Object obj) {
                Object A;
                A = RJ0.this.A(function, obj);
                return A;
            }
        };
    }
}
