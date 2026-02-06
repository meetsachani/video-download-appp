package o;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.eV0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6071eV0 {
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @IR1(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void a(@NotNull InterfaceC8396ny<?> interfaceC8396ny, @NotNull Future<?> future) {
        C9375ry.c(interfaceC8396ny, new EK1(future));
    }
}
