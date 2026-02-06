package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o.InterfaceC8710pF0;
import o.MB;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SequentialExecutor implements Executor {
    public static final Logger a1 = Logger.getLogger(SequentialExecutor.class.getName());
    public final Executor X;
    @InterfaceC8710pF0("queue")
    public final Deque<Runnable> Y = new ArrayDeque();
    @InterfaceC8710pF0("queue")
    public WorkerRunningState Z = WorkerRunningState.IDLE;
    @InterfaceC8710pF0("queue")
    public long Y0 = 0;
    public final QueueWorker Z0 = new QueueWorker();

    /* loaded from: classes3.dex */
    public final class QueueWorker implements Runnable {
        @MB
        public Runnable X;

        public QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            if (r1 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
            r8.X.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
            com.google.firebase.concurrent.SequentialExecutor.a1.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.X, (java.lang.Throwable) r3);
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
                    synchronized (SequentialExecutor.this.Y) {
                        if (!z) {
                            WorkerRunningState workerRunningState = SequentialExecutor.this.Z;
                            WorkerRunningState workerRunningState2 = WorkerRunningState.RUNNING;
                            if (workerRunningState != workerRunningState2) {
                                SequentialExecutor.e(SequentialExecutor.this);
                                SequentialExecutor.this.Z = workerRunningState2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) SequentialExecutor.this.Y.poll();
                        this.X = runnable;
                        if (runnable == null) {
                            SequentialExecutor.this.Z = WorkerRunningState.IDLE;
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
                synchronized (SequentialExecutor.this.Y) {
                    SequentialExecutor.this.Z = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.X;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.Z + "}";
        }
    }

    /* loaded from: classes3.dex */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public SequentialExecutor(Executor executor) {
        this.X = (Executor) Preconditions.r(executor);
    }

    public static /* synthetic */ long e(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.Y0;
        sequentialExecutor.Y0 = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(final Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z;
        Preconditions.r(runnable);
        synchronized (this.Y) {
            WorkerRunningState workerRunningState2 = this.Z;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j = this.Y0;
                Runnable runnable2 = new Runnable() { // from class: com.google.firebase.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.Y.add(runnable2);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.Z = workerRunningState3;
                try {
                    this.X.execute(this.Z0);
                    if (this.Z != workerRunningState3) {
                        return;
                    }
                    synchronized (this.Y) {
                        try {
                            if (this.Y0 == j && this.Z == workerRunningState3) {
                                this.Z = workerRunningState;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.Y) {
                        try {
                            WorkerRunningState workerRunningState4 = this.Z;
                            if (workerRunningState4 != WorkerRunningState.IDLE) {
                                if (workerRunningState4 == WorkerRunningState.QUEUING) {
                                }
                                z = false;
                                if ((e instanceof RejectedExecutionException) || z) {
                                    throw e;
                                }
                            }
                            if (this.Y.removeLastOccurrence(runnable2)) {
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
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.X + "}";
    }
}
