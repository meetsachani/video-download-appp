package o;

import java.lang.Throwable;
import java.util.Objects;

/* renamed from: o.hm0 */
/* loaded from: classes4.dex */
public interface InterfaceC6875hm0<E extends Throwable> {
    public static final InterfaceC6875hm0 a = new InterfaceC6875hm0() { // from class: o.dm0
        @Override // o.InterfaceC6875hm0
        public final int applyAsInt(int i) {
            return InterfaceC6875hm0.g(i);
        }
    };

    static <E extends Throwable> InterfaceC6875hm0<E> a() {
        return a;
    }

    static /* synthetic */ int e(InterfaceC6875hm0 interfaceC6875hm0, InterfaceC6875hm0 interfaceC6875hm02, int i) {
        return interfaceC6875hm0.c(interfaceC6875hm02, i);
    }

    static /* synthetic */ int f(int i) {
        return i;
    }

    static /* synthetic */ int g(int i) {
        return 0;
    }

    static /* synthetic */ int h(InterfaceC6875hm0 interfaceC6875hm0, InterfaceC6875hm0 interfaceC6875hm02, int i) {
        return interfaceC6875hm0.d(interfaceC6875hm02, i);
    }

    static <E extends Throwable> InterfaceC6875hm0<E> identity() {
        return new InterfaceC6875hm0() { // from class: o.gm0
            @Override // o.InterfaceC6875hm0
            public final int applyAsInt(int i) {
                return InterfaceC6875hm0.f(i);
            }
        };
    }

    int applyAsInt(int i) throws Throwable;

    default InterfaceC6875hm0<E> b(final InterfaceC6875hm0<E> interfaceC6875hm0) {
        Objects.requireNonNull(interfaceC6875hm0);
        return new InterfaceC6875hm0() { // from class: o.fm0
            @Override // o.InterfaceC6875hm0
            public final int applyAsInt(int i) {
                return InterfaceC6875hm0.e(InterfaceC6875hm0.this, interfaceC6875hm0, i);
            }
        };
    }

    /* synthetic */ default int c(InterfaceC6875hm0 interfaceC6875hm0, int i) throws Throwable {
        return interfaceC6875hm0.applyAsInt(applyAsInt(i));
    }

    /* synthetic */ default int d(InterfaceC6875hm0 interfaceC6875hm0, int i) throws Throwable {
        return applyAsInt(interfaceC6875hm0.applyAsInt(i));
    }

    default InterfaceC6875hm0<E> i(final InterfaceC6875hm0<E> interfaceC6875hm0) {
        Objects.requireNonNull(interfaceC6875hm0);
        return new InterfaceC6875hm0() { // from class: o.em0
            @Override // o.InterfaceC6875hm0
            public final int applyAsInt(int i) {
                return InterfaceC6875hm0.h(InterfaceC6875hm0.this, interfaceC6875hm0, i);
            }
        };
    }
}
