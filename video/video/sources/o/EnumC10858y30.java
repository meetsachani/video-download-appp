package o;

import java.util.concurrent.Executor;

/* renamed from: o.y30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC10858y30 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
