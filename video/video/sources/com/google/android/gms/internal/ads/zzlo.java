package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import o.HT1;
import o.InterfaceC8710pF0;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class zzlo {
    public final Object a;
    @InterfaceC8710pF0("lock")
    public Looper b;
    @InterfaceC8710pF0("lock")
    public HandlerThread c;
    @InterfaceC8710pF0("lock")
    public int d;

    public zzlo() {
        throw null;
    }

    public final Looper a() {
        Looper looper;
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    boolean z = false;
                    if (this.d == 0 && this.c == null) {
                        z = true;
                    }
                    zzdc.f(z);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.c = handlerThread;
                    handlerThread.start();
                    this.b = this.c.getLooper();
                }
                this.d++;
                looper = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final void b() {
        boolean z;
        HandlerThread handlerThread;
        synchronized (this.a) {
            try {
                if (this.d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                zzdc.f(z);
                int i = this.d - 1;
                this.d = i;
                if (i == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    this.c = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzlo(Looper looper) {
        this.a = new Object();
        this.b = null;
        this.c = null;
        this.d = 0;
    }
}
