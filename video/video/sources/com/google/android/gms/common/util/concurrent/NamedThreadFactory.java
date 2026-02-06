package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class NamedThreadFactory implements ThreadFactory {
    public final String a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(@InterfaceC5670cr1 String str) {
        Preconditions.s(str, "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @InterfaceC5670cr1
    public final Thread newThread(@InterfaceC5670cr1 Runnable runnable) {
        Thread newThread = this.b.newThread(new zza(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
