package o;

import o.InterfaceC5809dQ;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10767xg2(markerClass = InterfaceC10715xS0.class)
/* loaded from: classes3.dex */
public interface J10<T> extends RU0 {

    /* loaded from: classes3.dex */
    public static final class a {
        public static <T, R> R b(@NotNull J10<? extends T> j10, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) RU0.a.d(j10, r, va0);
        }

        @Nullable
        public static <T, E extends InterfaceC5809dQ.b> E c(@NotNull J10<? extends T> j10, @NotNull InterfaceC5809dQ.c<E> cVar) {
            return (E) RU0.a.e(j10, cVar);
        }

        @NotNull
        public static <T> InterfaceC5809dQ d(@NotNull J10<? extends T> j10, @NotNull InterfaceC5809dQ.c<?> cVar) {
            return RU0.a.h(j10, cVar);
        }

        @NotNull
        public static <T> InterfaceC5809dQ e(@NotNull J10<? extends T> j10, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return RU0.a.i(j10, interfaceC5809dQ);
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> RU0 f(@NotNull J10<? extends T> j10, @NotNull RU0 ru0) {
            return RU0.a.j(j10, ru0);
        }
    }

    @NotNull
    InterfaceC5223b02<T> P();

    @InterfaceC2951Fi0
    T p();

    @InterfaceC2951Fi0
    @Nullable
    Throwable t();

    @Nullable
    Object v(@NotNull HM<? super T> hm);
}
