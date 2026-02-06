package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class zzbzw implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);
    public final /* synthetic */ String b;

    public zzbzw(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + this.b + ") #" + andIncrement);
    }
}
