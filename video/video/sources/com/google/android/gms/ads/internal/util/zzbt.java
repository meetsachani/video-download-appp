package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzfrl;

/* loaded from: classes2.dex */
public final class zzbt {
    public HandlerThread a = null;
    public Handler b = null;
    public int c = 0;
    public final Object d = new Object();

    public final Handler a() {
        return this.b;
    }

    public final Looper b() {
        Looper looper;
        Object obj = this.d;
        synchronized (obj) {
            try {
                if (this.c == 0) {
                    if (this.a == null) {
                        zze.k("Starting the looper thread.");
                        HandlerThread handlerThread = new HandlerThread("LooperProvider");
                        this.a = handlerThread;
                        handlerThread.start();
                        this.b = new zzfrl(this.a.getLooper());
                        zze.k("Looper thread started.");
                    } else {
                        zze.k("Resuming the looper thread");
                        obj.notifyAll();
                    }
                } else {
                    Preconditions.s(this.a, "Invalid state: handlerThread should already been initialized.");
                }
                this.c++;
                looper = this.a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
