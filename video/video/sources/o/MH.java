package o;

import o.InterfaceC5809dQ;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10767xg2(markerClass = InterfaceC10715xS0.class)
/* loaded from: classes3.dex */
public interface MH extends RU0 {

    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R b(@NotNull MH mh, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) RU0.a.d(mh, r, va0);
        }

        @Nullable
        public static <E extends InterfaceC5809dQ.b> E c(@NotNull MH mh, @NotNull InterfaceC5809dQ.c<E> cVar) {
            return (E) RU0.a.e(mh, cVar);
        }

        @NotNull
        public static InterfaceC5809dQ d(@NotNull MH mh, @NotNull InterfaceC5809dQ.c<?> cVar) {
            return RU0.a.h(mh, cVar);
        }

        @NotNull
        public static InterfaceC5809dQ e(@NotNull MH mh, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return RU0.a.i(mh, interfaceC5809dQ);
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static RU0 f(@NotNull MH mh, @NotNull RU0 ru0) {
            return RU0.a.j(mh, ru0);
        }
    }

    boolean k(@NotNull Throwable th);

    boolean n();
}
