package o;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class B30 implements Executor {
    @NotNull
    public static final B30 X = new B30();

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        runnable.run();
    }
}
