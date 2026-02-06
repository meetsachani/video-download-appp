package o;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: o.kJ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC7491kJ implements Executor {
    public final /* synthetic */ Handler X;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.post(runnable);
    }
}
