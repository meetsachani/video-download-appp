package o;

import java.io.IOException;

/* renamed from: o.ie0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7086ie0 {
    public static <T, U> void a(InterfaceC7735lJ0<T, U> interfaceC7735lJ0, T t, U u) {
        try {
            interfaceC7735lJ0.accept(t, u);
        } catch (IOException e) {
            g(e);
        }
    }

    public static <T> void b(EJ0<T> ej0, T t) {
        try {
            ej0.accept(t);
        } catch (IOException e) {
            g(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, U, R> R c(InterfaceC8483oJ0<? super T, ? super U, ? extends R> interfaceC8483oJ0, T t, U u) {
        try {
            return interfaceC8483oJ0.apply(t, u);
        } catch (IOException e) {
            throw g(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, R> R d(RJ0<? super T, ? extends R> rj0, T t) {
        try {
            return rj0.apply(t);
        } catch (IOException e) {
            throw g(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> int e(InterfaceC11165zJ0<? super T> interfaceC11165zJ0, T t, T t2) {
        try {
            return interfaceC11165zJ0.compare(t, t2);
        } catch (IOException e) {
            throw g(e);
        }
    }

    public static <T> T f(XK0<T> xk0) {
        try {
            return xk0.get();
        } catch (IOException e) {
            throw g(e);
        }
    }

    public static void h(InterfaceC8973qK0 interfaceC8973qK0) {
        try {
            interfaceC8973qK0.run();
        } catch (IOException e) {
            throw g(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean i(InterfaceC7739lK0<? super T> interfaceC7739lK0, T t) {
        try {
            return interfaceC7739lK0.test(t);
        } catch (IOException e) {
            throw g(e);
        }
    }

    public static <T extends Throwable> RuntimeException g(Throwable th) throws Throwable {
        throw th;
    }
}
