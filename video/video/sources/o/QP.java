package o;

import o.InterfaceC5809dQ;
import o.InterfaceC9577sn2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC2951Fi0
@InterfaceC6442g20
/* loaded from: classes3.dex */
public interface QP<S> extends InterfaceC9577sn2<S> {

    /* loaded from: classes3.dex */
    public static final class a {
        public static <S, R> R a(@NotNull QP<S> qp, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) InterfaceC9577sn2.a.a(qp, r, va0);
        }

        @Nullable
        public static <S, E extends InterfaceC5809dQ.b> E b(@NotNull QP<S> qp, @NotNull InterfaceC5809dQ.c<E> cVar) {
            return (E) InterfaceC9577sn2.a.b(qp, cVar);
        }

        @NotNull
        public static <S> InterfaceC5809dQ c(@NotNull QP<S> qp, @NotNull InterfaceC5809dQ.c<?> cVar) {
            return InterfaceC9577sn2.a.c(qp, cVar);
        }

        @NotNull
        public static <S> InterfaceC5809dQ d(@NotNull QP<S> qp, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return InterfaceC9577sn2.a.d(qp, interfaceC5809dQ);
        }
    }

    @NotNull
    InterfaceC5809dQ x(@NotNull InterfaceC5809dQ.b bVar);

    @NotNull
    QP<S> y();
}
