package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class C40 implements InterfaceC7406jy {
    @NotNull
    public final B40 X;

    public C40(@NotNull B40 b40) {
        this.X = b40;
    }

    @Override // o.InterfaceC7406jy
    public void d(@Nullable Throwable th) {
        this.X.e();
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.X + ']';
    }
}
