package o;

import java.util.concurrent.Executor;

/* renamed from: o.z30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC11101z30 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
