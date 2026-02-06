package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.sn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9577sn2<S> extends InterfaceC5809dQ.b {

    /* renamed from: o.sn2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <S, R> R a(@NotNull InterfaceC9577sn2<S> interfaceC9577sn2, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) InterfaceC5809dQ.b.a.a(interfaceC9577sn2, r, va0);
        }

        @Nullable
        public static <S, E extends InterfaceC5809dQ.b> E b(@NotNull InterfaceC9577sn2<S> interfaceC9577sn2, @NotNull InterfaceC5809dQ.c<E> cVar) {
            return (E) InterfaceC5809dQ.b.a.b(interfaceC9577sn2, cVar);
        }

        @NotNull
        public static <S> InterfaceC5809dQ c(@NotNull InterfaceC9577sn2<S> interfaceC9577sn2, @NotNull InterfaceC5809dQ.c<?> cVar) {
            return InterfaceC5809dQ.b.a.c(interfaceC9577sn2, cVar);
        }

        @NotNull
        public static <S> InterfaceC5809dQ d(@NotNull InterfaceC9577sn2<S> interfaceC9577sn2, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return InterfaceC5809dQ.b.a.d(interfaceC9577sn2, interfaceC5809dQ);
        }
    }

    void G(@NotNull InterfaceC5809dQ interfaceC5809dQ, S s);

    S c0(@NotNull InterfaceC5809dQ interfaceC5809dQ);
}
