package o;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.hy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6922hy implements InterfaceC7406jy {
    @NotNull
    public final Future<?> X;

    public C6922hy(@NotNull Future<?> future) {
        this.X = future;
    }

    @Override // o.InterfaceC7406jy
    public void d(@Nullable Throwable th) {
        this.X.cancel(false);
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.X + ']';
    }
}
