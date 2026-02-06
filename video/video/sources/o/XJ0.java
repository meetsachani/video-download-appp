package o;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface XJ0 {
    public static final XJ0 a = new XJ0() { // from class: o.VJ0
        @Override // o.XJ0
        public final void accept(int i) {
            XJ0.i(i);
        }
    };

    static /* synthetic */ void a(XJ0 xj0, XJ0 xj02, int i) {
        xj0.f(xj02, i);
    }

    static /* synthetic */ void d(XJ0 xj0, Integer num) {
        xj0.e(num);
    }

    static /* synthetic */ void h(XJ0 xj0, int i) {
        xj0.g(i);
    }

    static /* synthetic */ void i(int i) {
    }

    void accept(int i) throws IOException;

    default Consumer<Integer> b() {
        return new Consumer() { // from class: o.TJ0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                XJ0.d(XJ0.this, (Integer) obj);
            }
        };
    }

    default XJ0 c(final XJ0 xj0) {
        Objects.requireNonNull(xj0);
        return new XJ0() { // from class: o.UJ0
            @Override // o.XJ0
            public final void accept(int i) {
                XJ0.a(XJ0.this, xj0, i);
            }
        };
    }

    /* synthetic */ default void e(Integer num) {
        C8643oy2.c(this, num.intValue());
    }

    /* synthetic */ default void f(XJ0 xj0, int i) throws IOException {
        accept(i);
        xj0.accept(i);
    }

    /* synthetic */ default void g(int i) {
        C8643oy2.c(this, i);
    }

    default IntConsumer j() {
        return new IntConsumer() { // from class: o.WJ0
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                XJ0.h(XJ0.this, i);
            }
        };
    }
}
