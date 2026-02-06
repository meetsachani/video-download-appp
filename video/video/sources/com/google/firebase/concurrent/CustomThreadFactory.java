package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import o.InterfaceC10571ws1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class CustomThreadFactory implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public CustomThreadFactory(String str, int i, @InterfaceC10571ws1 StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.d = threadPolicy;
    }

    public static /* synthetic */ void a(CustomThreadFactory customThreadFactory, Runnable runnable) {
        Process.setThreadPriority(customThreadFactory.c);
        StrictMode.ThreadPolicy threadPolicy = customThreadFactory.d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                CustomThreadFactory.a(CustomThreadFactory.this, runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.b, Long.valueOf(this.a.getAndIncrement())));
        return newThread;
    }
}
