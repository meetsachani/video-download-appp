package o;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class A40 implements B40 {
    @NotNull
    public final Future<?> X;

    public A40(@NotNull Future<?> future) {
        this.X = future;
    }

    @Override // o.B40
    public void e() {
        this.X.cancel(false);
    }

    @NotNull
    public String toString() {
        return "DisposableFutureHandle[" + this.X + ']';
    }
}
