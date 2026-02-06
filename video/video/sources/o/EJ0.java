package o;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface EJ0<T> {
    public static final EJ0<?> a = new EJ0() { // from class: o.DJ0
        @Override // o.EJ0
        public final void accept(Object obj) {
            EJ0.m(obj);
        }
    };

    static <T> EJ0<T> a() {
        return (EJ0<T>) a;
    }

    static <T> void d(T[] tArr, EJ0<T> ej0) throws IOException {
        VK0.e(VK0.h(tArr), ej0);
    }

    @SafeVarargs
    static <T> void f(EJ0<T> ej0, T... tArr) throws FJ0 {
        VK0.c(VK0.h(tArr), ej0);
    }

    static /* synthetic */ void g(EJ0 ej0, Object obj) {
        ej0.e(obj);
    }

    static <T> void h(EJ0<T> ej0, Stream<T> stream) throws FJ0 {
        VK0.d(stream, ej0, new BJ0());
    }

    static <T> void i(Stream<T> stream, EJ0<T> ej0) throws IOException {
        VK0.e(stream, ej0);
    }

    static <T> void k(EJ0<T> ej0, Iterable<T> iterable) throws FJ0 {
        VK0.c(VK0.f(iterable), ej0);
    }

    static /* synthetic */ void l(EJ0 ej0, EJ0 ej02, Object obj) {
        ej0.j(ej02, obj);
    }

    static /* synthetic */ void m(Object obj) {
    }

    static <T> void n(Iterable<T> iterable, EJ0<T> ej0) throws IOException {
        VK0.e(VK0.f(iterable), ej0);
    }

    void accept(T t) throws IOException;

    default Consumer<T> b() {
        return new Consumer() { // from class: o.AJ0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                EJ0.g(EJ0.this, obj);
            }
        };
    }

    default EJ0<T> c(final EJ0<? super T> ej0) {
        Objects.requireNonNull(ej0, C5445bv2.d0);
        return new EJ0() { // from class: o.CJ0
            @Override // o.EJ0
            public final void accept(Object obj) {
                EJ0.l(EJ0.this, ej0, obj);
            }
        };
    }

    /* synthetic */ default void e(Object obj) {
        C8643oy2.b(this, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void j(EJ0 ej0, Object obj) throws IOException {
        accept(obj);
        ej0.accept(obj);
    }
}
