package o;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: o.hg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6851hg0 {

    /* renamed from: o.hg0$a */
    /* loaded from: classes.dex */
    public static class a implements Executor {
        public final Handler X;

        public a(Handler handler) {
            this.X = (Handler) C10907yF1.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.X.post((Runnable) C10907yF1.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.X + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
