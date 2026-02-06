package okhttp3.internal.concurrent;

import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC8303na2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes4.dex */
public abstract class Task {
    private final boolean cancelable;
    @NotNull
    private final String name;
    private long nextExecuteNanoTime;
    @Nullable
    private TaskQueue queue;

    public Task(@NotNull String str, boolean z) {
        C6562gT0.p(str, "name");
        this.name = str;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    @Nullable
    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(@NotNull TaskQueue taskQueue) {
        C6562gT0.p(taskQueue, "queue");
        TaskQueue taskQueue2 = this.queue;
        if (taskQueue2 == taskQueue) {
            return;
        }
        if (taskQueue2 == null) {
            this.queue = taskQueue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues");
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j) {
        this.nextExecuteNanoTime = j;
    }

    public final void setQueue$okhttp(@Nullable TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    @NotNull
    public String toString() {
        return this.name;
    }

    public /* synthetic */ Task(String str, boolean z, int i, C9516sY c9516sY) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
