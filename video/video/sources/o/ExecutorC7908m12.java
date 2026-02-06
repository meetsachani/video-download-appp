package o;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.m12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC7908m12 implements Executor {
    public static final Logger a1 = Logger.getLogger(ExecutorC7908m12.class.getName());
    public final Executor X;
    @InterfaceC7980mF0("queue")
    public final Deque<Runnable> Y = new ArrayDeque();
    @InterfaceC7980mF0("queue")
    public c Z = c.IDLE;
    @InterfaceC7980mF0("queue")
    public long Y0 = 0;
    @InterfaceC7537kU1
    public final b Z0 = new b(this, null);

    /* renamed from: o.m12$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable X;

        public a(ExecutorC7908m12 executorC7908m12, Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.run();
        }

        public String toString() {
            return this.X.toString();
        }
    }

    /* renamed from: o.m12$b */
    /* loaded from: classes3.dex */
    public final class b implements Runnable {
        @MB
        public Runnable X;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            if (r1 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
            r9.X.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
            r4 = o.ExecutorC7908m12.a1;
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r9.X);
            r8 = new java.lang.StringBuilder(r6.length() + 35);
            r8.append("Exception while executing runnable ");
            r8.append(r6);
            r4.log(r5, r8.toString(), (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
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
                    synchronized (ExecutorC7908m12.this.Y) {
                        if (!z) {
                            c cVar = ExecutorC7908m12.this.Z;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                ExecutorC7908m12.e(ExecutorC7908m12.this);
                                ExecutorC7908m12.this.Z = cVar2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) ExecutorC7908m12.this.Y.poll();
                        this.X = runnable;
                        if (runnable == null) {
                            ExecutorC7908m12.this.Z = c.IDLE;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                    this.X = null;
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
                synchronized (ExecutorC7908m12.this.Y) {
                    ExecutorC7908m12.this.Z = c.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.X;
            if (runnable != null) {
                String valueOf = String.valueOf(runnable);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("SequentialExecutorWorker{running=");
                sb.append(valueOf);
                sb.append("}");
                return sb.toString();
            }
            String valueOf2 = String.valueOf(ExecutorC7908m12.this.Z);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 32);
            sb2.append("SequentialExecutorWorker{state=");
            sb2.append(valueOf2);
            sb2.append("}");
            return sb2.toString();
        }

        public /* synthetic */ b(ExecutorC7908m12 executorC7908m12, a aVar) {
            this();
        }
    }

    /* renamed from: o.m12$c */
    /* loaded from: classes3.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC7908m12(Executor executor) {
        this.X = (Executor) C10664xF1.E(executor);
    }

    public static /* synthetic */ long e(ExecutorC7908m12 executorC7908m12) {
        long j = executorC7908m12.Y0;
        executorC7908m12.Y0 = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z;
        C10664xF1.E(runnable);
        synchronized (this.Y) {
            c cVar2 = this.Z;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j = this.Y0;
                a aVar = new a(this, runnable);
                this.Y.add(aVar);
                c cVar3 = c.QUEUING;
                this.Z = cVar3;
                try {
                    this.X.execute(this.Z0);
                    if (this.Z != cVar3) {
                        return;
                    }
                    synchronized (this.Y) {
                        try {
                            if (this.Y0 == j && this.Z == cVar3) {
                                this.Z = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.Y) {
                        try {
                            c cVar4 = this.Z;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z = false;
                                if ((e instanceof RejectedExecutionException) || z) {
                                    throw e;
                                }
                            }
                            if (this.Y.removeLastOccurrence(aVar)) {
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
            this.Y.add(runnable);
        }
    }

    public String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.X);
        StringBuilder sb = new StringBuilder(valueOf.length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
