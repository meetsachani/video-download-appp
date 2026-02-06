package o;

import o.InterfaceC5809dQ;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC9150r20(level = EnumC9879u20.Y, message = "This is internal API and may be removed in the future releases")
@InterfaceC10472wS0
/* renamed from: o.bC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5268bC extends RU0 {

    /* renamed from: o.bC$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R b(@NotNull InterfaceC5268bC interfaceC5268bC, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) RU0.a.d(interfaceC5268bC, r, va0);
        }

        @Nullable
        public static <E extends InterfaceC5809dQ.b> E c(@NotNull InterfaceC5268bC interfaceC5268bC, @NotNull InterfaceC5809dQ.c<E> cVar) {
            return (E) RU0.a.e(interfaceC5268bC, cVar);
        }

        @NotNull
        public static InterfaceC5809dQ d(@NotNull InterfaceC5268bC interfaceC5268bC, @NotNull InterfaceC5809dQ.c<?> cVar) {
            return RU0.a.h(interfaceC5268bC, cVar);
        }

        @NotNull
        public static InterfaceC5809dQ e(@NotNull InterfaceC5268bC interfaceC5268bC, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return RU0.a.i(interfaceC5268bC, interfaceC5809dQ);
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static RU0 f(@NotNull InterfaceC5268bC interfaceC5268bC, @NotNull RU0 ru0) {
            return RU0.a.j(interfaceC5268bC, ru0);
        }
    }

    @InterfaceC10472wS0
    void N(@NotNull InterfaceC2805Dy1 interfaceC2805Dy1);
}
