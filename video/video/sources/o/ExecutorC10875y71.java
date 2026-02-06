package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.y71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC10875y71 implements Executor {
    public final Handler X = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.X.post(runnable);
    }
}
