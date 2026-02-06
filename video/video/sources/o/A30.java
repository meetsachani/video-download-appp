package o;

import java.util.concurrent.Executor;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public enum A30 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
