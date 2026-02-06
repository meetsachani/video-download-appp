package com.google.firebase.messaging.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import o.EH;

/* loaded from: classes3.dex */
public interface ExecutorFactory {
    ExecutorService a(ThreadPriority threadPriority);

    ScheduledExecutorService b(int i, ThreadFactory threadFactory, ThreadPriority threadPriority);

    ExecutorService c(ThreadPriority threadPriority);

    Future<?> d(@EH String str, @EH String str2, ThreadPriority threadPriority, Runnable runnable);

    void e(@EH String str, @EH String str2, ThreadPriority threadPriority, Runnable runnable);

    ScheduledExecutorService f(int i, ThreadPriority threadPriority);

    ExecutorService g(int i, ThreadFactory threadFactory, ThreadPriority threadPriority);

    ExecutorService h(int i, ThreadPriority threadPriority);

    ExecutorService i(ThreadFactory threadFactory, ThreadPriority threadPriority);

    ExecutorService j(ThreadFactory threadFactory, ThreadPriority threadPriority);
}
