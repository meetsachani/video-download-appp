package o;

import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* loaded from: classes4.dex */
public final class VK0 {
    public static final Object a = new Object();

    public static /* synthetic */ IOException a(Integer num, IOException iOException) {
        return iOException;
    }

    public static <T> void c(Stream<T> stream, EJ0<T> ej0) throws FJ0 {
        d(stream, ej0, new BiFunction() { // from class: o.UK0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return VK0.a((Integer) obj, (IOException) obj2);
            }
        });
    }

    public static <T> void d(Stream<T> stream, EJ0<T> ej0, BiFunction<Integer, IOException, IOException> biFunction) throws FJ0 {
        RK0.u5(stream).m2(ej0, new BJ0());
    }

    public static <T> void e(Stream<T> stream, EJ0<T> ej0) throws IOException {
        final EJ0 i = i(ej0);
        g(stream).forEach(new Consumer() { // from class: o.TK0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C7086ie0.b(EJ0.this, obj);
            }
        });
    }

    public static <T> Stream<T> f(Iterable<T> iterable) {
        if (iterable == null) {
            return Stream.empty();
        }
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    public static <T> Stream<T> g(Stream<T> stream) {
        if (stream == null) {
            return Stream.empty();
        }
        return stream;
    }

    @SafeVarargs
    public static <T> Stream<T> h(T... tArr) {
        if (tArr == null) {
            return Stream.empty();
        }
        return Stream.of((Object[]) tArr);
    }

    public static <T> EJ0<T> i(EJ0<T> ej0) {
        if (ej0 != null) {
            return ej0;
        }
        return EJ0.a();
    }
}
