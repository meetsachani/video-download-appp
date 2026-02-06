package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class C30 implements Executor {
    public static volatile C30 X;

    public static Executor b() {
        if (X != null) {
            return X;
        }
        synchronized (C30.class) {
            try {
                if (X == null) {
                    X = new C30();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return X;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
