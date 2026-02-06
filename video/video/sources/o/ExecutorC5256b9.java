package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.b9  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorC5256b9 implements Executor {
    public final Handler X = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.X.post(runnable);
    }
}
