package o;

import java.lang.Throwable;
import java.util.Objects;

/* renamed from: o.Gl0 */
/* loaded from: classes4.dex */
public interface InterfaceC3061Gl0<E extends Throwable> {
    public static final InterfaceC3061Gl0 a = new InterfaceC3061Gl0() { // from class: o.Dl0
        @Override // o.InterfaceC3061Gl0
        public final double applyAsDouble(double d) {
            return InterfaceC3061Gl0.b(d);
        }
    };

    static <E extends Throwable> InterfaceC3061Gl0<E> a() {
        return a;
    }

    static /* synthetic */ double b(double d) {
        return 0.0d;
    }

    static /* synthetic */ double d(double d) {
        return d;
    }

    static /* synthetic */ double e(InterfaceC3061Gl0 interfaceC3061Gl0, InterfaceC3061Gl0 interfaceC3061Gl02, double d) {
        return interfaceC3061Gl0.c(interfaceC3061Gl02, d);
    }

    static /* synthetic */ double g(InterfaceC3061Gl0 interfaceC3061Gl0, InterfaceC3061Gl0 interfaceC3061Gl02, double d) {
        return interfaceC3061Gl0.h(interfaceC3061Gl02, d);
    }

    static <E extends Throwable> InterfaceC3061Gl0<E> identity() {
        return new InterfaceC3061Gl0() { // from class: o.Cl0
            @Override // o.InterfaceC3061Gl0
            public final double applyAsDouble(double d) {
                return InterfaceC3061Gl0.d(d);
            }
        };
    }

    double applyAsDouble(double d) throws Throwable;

    /* synthetic */ default double c(InterfaceC3061Gl0 interfaceC3061Gl0, double d) throws Throwable {
        return interfaceC3061Gl0.applyAsDouble(applyAsDouble(d));
    }

    default InterfaceC3061Gl0<E> f(final InterfaceC3061Gl0<E> interfaceC3061Gl0) {
        Objects.requireNonNull(interfaceC3061Gl0);
        return new InterfaceC3061Gl0() { // from class: o.El0
            @Override // o.InterfaceC3061Gl0
            public final double applyAsDouble(double d) {
                return InterfaceC3061Gl0.g(InterfaceC3061Gl0.this, interfaceC3061Gl0, d);
            }
        };
    }

    /* synthetic */ default double h(InterfaceC3061Gl0 interfaceC3061Gl0, double d) throws Throwable {
        return applyAsDouble(interfaceC3061Gl0.applyAsDouble(d));
    }

    default InterfaceC3061Gl0<E> i(final InterfaceC3061Gl0<E> interfaceC3061Gl0) {
        Objects.requireNonNull(interfaceC3061Gl0);
        return new InterfaceC3061Gl0() { // from class: o.Fl0
            @Override // o.InterfaceC3061Gl0
            public final double applyAsDouble(double d) {
                return InterfaceC3061Gl0.e(InterfaceC3061Gl0.this, interfaceC3061Gl0, d);
            }
        };
    }
}
