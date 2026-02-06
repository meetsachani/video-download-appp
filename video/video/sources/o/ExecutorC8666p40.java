package o;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.p40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC8666p40 implements Executor {
    @InterfaceC7058iW0
    @NotNull
    public final AbstractC7762lQ X;

    public ExecutorC8666p40(@NotNull AbstractC7762lQ abstractC7762lQ) {
        this.X = abstractC7762lQ;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        AbstractC7762lQ abstractC7762lQ = this.X;
        C3897Pa0 c3897Pa0 = C3897Pa0.X;
        if (abstractC7762lQ.U(c3897Pa0)) {
            this.X.I(c3897Pa0, runnable);
        } else {
            runnable.run();
        }
    }

    @NotNull
    public String toString() {
        return this.X.toString();
    }
}
