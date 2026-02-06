package o;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class EK1 implements InterfaceC7406jy {
    @NotNull
    public final Future<?> X;

    public EK1(@NotNull Future<?> future) {
        this.X = future;
    }

    @Override // o.InterfaceC7406jy
    public void d(@Nullable Throwable th) {
        if (th != null) {
            this.X.cancel(false);
        }
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.X + ']';
    }
}
