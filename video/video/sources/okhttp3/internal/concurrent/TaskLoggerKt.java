package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C6562gT0;
import o.C8319ne2;
import o.FA0;
import o.UP0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(Task task, TaskQueue taskQueue, String str) {
        log(task, taskQueue, str);
    }

    @NotNull
    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C6562gT0.o(format, "format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C6562gT0.o(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull FA0<? extends T> fa0) {
        long j;
        C6562gT0.p(task, "task");
        C6562gT0.p(taskQueue, "queue");
        C6562gT0.p(fa0, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T invoke = fa0.invoke();
            UP0.d(1);
            if (isLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            UP0.c(1);
            return invoke;
        } catch (Throwable th) {
            UP0.d(1);
            if (isLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            UP0.c(1);
            throw th;
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull FA0<String> fa0) {
        C6562gT0.p(task, "task");
        C6562gT0.p(taskQueue, "queue");
        C6562gT0.p(fa0, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, fa0.invoke());
        }
    }
}
