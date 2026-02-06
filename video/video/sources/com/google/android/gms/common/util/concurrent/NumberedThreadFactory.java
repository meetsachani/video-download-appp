package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.C6566gU0;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class NumberedThreadFactory implements ThreadFactory {
    public final String a;
    public final AtomicInteger b = new AtomicInteger();
    public final ThreadFactory c = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@InterfaceC5670cr1 String str) {
        Preconditions.s(str, "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @InterfaceC5670cr1
    public final Thread newThread(@InterfaceC5670cr1 Runnable runnable) {
        Thread newThread = this.c.newThread(new zza(runnable, 0));
        int andIncrement = this.b.getAndIncrement();
        newThread.setName(this.a + C6566gU0.f + andIncrement + C6566gU0.g);
        return newThread;
    }
}
