package o;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.iy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7163iy extends AbstractC6569gV0 {
    @NotNull
    public final Future<?> Z0;

    public C7163iy(@NotNull Future<?> future) {
        this.Z0 = future;
    }

    @Override // o.AbstractC6569gV0
    public boolean E() {
        return false;
    }

    @Override // o.AbstractC6569gV0
    public void F(@Nullable Throwable th) {
        if (th != null && !this.Z0.isDone()) {
            this.Z0.cancel(false);
        }
    }
}
