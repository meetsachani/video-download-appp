package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.dV0 */
/* loaded from: classes3.dex */
public final class C5829dV0 {
    @NotNull
    public static final RU0 A(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return C6314fV0.z(interfaceC5809dQ);
    }

    @NotNull
    public static final B40 B(@NotNull RU0 ru0, boolean z, @NotNull AbstractC6569gV0 abstractC6569gV0) {
        return C6314fV0.A(ru0, z, abstractC6569gV0);
    }

    public static /* synthetic */ B40 C(RU0 ru0, boolean z, AbstractC6569gV0 abstractC6569gV0, int i, Object obj) {
        return C6314fV0.B(ru0, z, abstractC6569gV0, i, obj);
    }

    public static final boolean D(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return C6314fV0.C(interfaceC5809dQ);
    }

    @NotNull
    public static final MH a(@Nullable RU0 ru0) {
        return C6314fV0.a(ru0);
    }

    public static /* synthetic */ MH c(RU0 ru0, int i, Object obj) {
        return C6314fV0.c(ru0, i, obj);
    }

    public static final void f(@NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable CancellationException cancellationException) {
        C6314fV0.f(interfaceC5809dQ, cancellationException);
    }

    public static final void g(@NotNull RU0 ru0, @NotNull String str, @Nullable Throwable th) {
        C6314fV0.g(ru0, str, th);
    }

    @Nullable
    public static final Object l(@NotNull RU0 ru0, @NotNull HM<? super C7458kA2> hm) {
        return C6314fV0.l(ru0, hm);
    }

    public static final void o(@NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable CancellationException cancellationException) {
        C6314fV0.o(interfaceC5809dQ, cancellationException);
    }

    public static final void r(@NotNull RU0 ru0, @Nullable CancellationException cancellationException) {
        C6314fV0.r(ru0, cancellationException);
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @IR1(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void w(@NotNull InterfaceC8396ny<?> interfaceC8396ny, @NotNull Future<?> future) {
        C6071eV0.a(interfaceC8396ny, future);
    }

    @NotNull
    public static final B40 x(@NotNull RU0 ru0, @NotNull B40 b40) {
        return C6314fV0.w(ru0, b40);
    }

    public static final void y(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C6314fV0.x(interfaceC5809dQ);
    }

    public static final void z(@NotNull RU0 ru0) {
        C6314fV0.y(ru0);
    }
}
