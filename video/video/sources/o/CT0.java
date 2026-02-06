package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class CT0 extends AbstractC6569gV0 {
    @NotNull
    public final HA0<Throwable, C7458kA2> Z0;

    /* JADX WARN: Multi-variable type inference failed */
    public CT0(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        this.Z0 = ha0;
    }

    @Override // o.AbstractC6569gV0
    public boolean E() {
        return false;
    }

    @Override // o.AbstractC6569gV0
    public void F(@Nullable Throwable th) {
        this.Z0.invoke(th);
    }
}
