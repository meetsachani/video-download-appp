package o;

import o.InterfaceC5809dQ;
import o.J10;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10767xg2(markerClass = InterfaceC10715xS0.class)
/* loaded from: classes3.dex */
public interface HH<T> extends J10<T> {

    /* loaded from: classes3.dex */
    public static final class a {
        public static <T, R> R b(@NotNull HH<T> hh, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) J10.a.b(hh, r, va0);
        }

        @Nullable
        public static <T, E extends InterfaceC5809dQ.b> E c(@NotNull HH<T> hh, @NotNull InterfaceC5809dQ.c<E> cVar) {
            return (E) J10.a.c(hh, cVar);
        }

        @NotNull
        public static <T> InterfaceC5809dQ d(@NotNull HH<T> hh, @NotNull InterfaceC5809dQ.c<?> cVar) {
            return J10.a.d(hh, cVar);
        }

        @NotNull
        public static <T> InterfaceC5809dQ e(@NotNull HH<T> hh, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return J10.a.e(hh, interfaceC5809dQ);
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> RU0 f(@NotNull HH<T> hh, @NotNull RU0 ru0) {
            return J10.a.f(hh, ru0);
        }
    }

    boolean C(T t);

    boolean k(@NotNull Throwable th);
}
