package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzdj {
    public boolean a;

    public zzdj() {
        throw null;
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        if (j > 0) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = j + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    b();
                } else {
                    boolean z = false;
                    while (!this.a && elapsedRealtime < j2) {
                        try {
                            wait(j2 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a;
    }

    public final synchronized boolean d() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public final synchronized boolean e() {
        return this.a;
    }

    public final synchronized boolean f() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public zzdj(zzdg zzdgVar) {
    }
}
