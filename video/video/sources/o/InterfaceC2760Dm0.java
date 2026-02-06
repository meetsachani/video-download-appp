package o;

import java.lang.Throwable;
import java.util.Objects;

/* renamed from: o.Dm0 */
/* loaded from: classes4.dex */
public interface InterfaceC2760Dm0<E extends Throwable> {
    public static final InterfaceC2760Dm0 a = new InterfaceC2760Dm0() { // from class: o.Bm0
        @Override // o.InterfaceC2760Dm0
        public final long applyAsLong(long j) {
            return InterfaceC2760Dm0.g(j);
        }
    };

    static <E extends Throwable> InterfaceC2760Dm0<E> a() {
        return a;
    }

    static /* synthetic */ long d(InterfaceC2760Dm0 interfaceC2760Dm0, InterfaceC2760Dm0 interfaceC2760Dm02, long j) {
        return interfaceC2760Dm0.i(interfaceC2760Dm02, j);
    }

    static /* synthetic */ long f(InterfaceC2760Dm0 interfaceC2760Dm0, InterfaceC2760Dm0 interfaceC2760Dm02, long j) {
        return interfaceC2760Dm0.c(interfaceC2760Dm02, j);
    }

    static /* synthetic */ long g(long j) {
        return 0L;
    }

    static /* synthetic */ long h(long j) {
        return j;
    }

    static <E extends Throwable> InterfaceC2760Dm0<E> identity() {
        return new InterfaceC2760Dm0() { // from class: o.zm0
            @Override // o.InterfaceC2760Dm0
            public final long applyAsLong(long j) {
                return InterfaceC2760Dm0.h(j);
            }
        };
    }

    long applyAsLong(long j) throws Throwable;

    default InterfaceC2760Dm0<E> b(final InterfaceC2760Dm0<E> interfaceC2760Dm0) {
        Objects.requireNonNull(interfaceC2760Dm0);
        return new InterfaceC2760Dm0() { // from class: o.Cm0
            @Override // o.InterfaceC2760Dm0
            public final long applyAsLong(long j) {
                return InterfaceC2760Dm0.f(InterfaceC2760Dm0.this, interfaceC2760Dm0, j);
            }
        };
    }

    /* synthetic */ default long c(InterfaceC2760Dm0 interfaceC2760Dm0, long j) throws Throwable {
        return applyAsLong(interfaceC2760Dm0.applyAsLong(j));
    }

    default InterfaceC2760Dm0<E> e(final InterfaceC2760Dm0<E> interfaceC2760Dm0) {
        Objects.requireNonNull(interfaceC2760Dm0);
        return new InterfaceC2760Dm0() { // from class: o.Am0
            @Override // o.InterfaceC2760Dm0
            public final long applyAsLong(long j) {
                return InterfaceC2760Dm0.d(InterfaceC2760Dm0.this, interfaceC2760Dm0, j);
            }
        };
    }

    /* synthetic */ default long i(InterfaceC2760Dm0 interfaceC2760Dm0, long j) throws Throwable {
        return interfaceC2760Dm0.applyAsLong(applyAsLong(j));
    }
}
