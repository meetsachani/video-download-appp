package o;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: o.n12  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC8169n12 implements Executor {
    public static final String a1 = "SequentialExecutor";
    public final Executor Y;
    public final Deque<Runnable> X = new ArrayDeque();
    public final b Z = new b();
    public c Y0 = c.IDLE;
    public long Z0 = 0;

    /* renamed from: o.n12$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable X;

        public a(Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.run();
        }
    }

    /* renamed from: o.n12$b */
    /* loaded from: classes.dex */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r1 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
            o.C7433k41.d(o.ExecutorC8169n12.a1, "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    synchronized (ExecutorC8169n12.this.X) {
                        if (!z) {
                            ExecutorC8169n12 executorC8169n12 = ExecutorC8169n12.this;
                            c cVar = executorC8169n12.Y0;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                executorC8169n12.Z0++;
                                executorC8169n12.Y0 = cVar2;
                                z = true;
                            }
                        }
                        Runnable poll = ExecutorC8169n12.this.X.poll();
                        if (poll == null) {
                            ExecutorC8169n12.this.Y0 = c.IDLE;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (ExecutorC8169n12.this.X) {
                    ExecutorC8169n12.this.Y0 = c.IDLE;
                    throw e;
                }
            }
        }
    }

    /* renamed from: o.n12$c */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC8169n12(Executor executor) {
        this.Y = (Executor) C10907yF1.l(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z;
        C10907yF1.l(runnable);
        synchronized (this.X) {
            c cVar2 = this.Y0;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j = this.Z0;
                a aVar = new a(runnable);
                this.X.add(aVar);
                c cVar3 = c.QUEUING;
                this.Y0 = cVar3;
                try {
                    this.Y.execute(this.Z);
                    if (this.Y0 != cVar3) {
                        return;
                    }
                    synchronized (this.X) {
                        try {
                            if (this.Z0 == j && this.Y0 == cVar3) {
                                this.Y0 = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.X) {
                        try {
                            c cVar4 = this.Y0;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z = false;
                                if ((e instanceof RejectedExecutionException) || z) {
                                    throw e;
                                }
                            }
                            if (this.X.removeLastOccurrence(aVar)) {
                                z = true;
                                if (e instanceof RejectedExecutionException) {
                                }
                                throw e;
                            }
                            z = false;
                            if (e instanceof RejectedExecutionException) {
                            }
                            throw e;
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.X.add(runnable);
        }
    }
}
