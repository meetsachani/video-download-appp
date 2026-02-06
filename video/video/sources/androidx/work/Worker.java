package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import o.E22;
import o.InterfaceFutureC8411o11;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public E22<ListenableWorker.a> a1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.a1.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.a1.q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC8411o11<ListenableWorker.a> startWork() {
        this.a1 = E22.u();
        getBackgroundExecutor().execute(new a());
        return this.a1;
    }
}
