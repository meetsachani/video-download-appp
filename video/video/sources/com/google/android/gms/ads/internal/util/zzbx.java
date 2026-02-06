package com.google.android.gms.ads.internal.util;

/* loaded from: classes2.dex */
public final class zzbx {
    public long a;
    public long b = Long.MIN_VALUE;
    public final Object c = new Object();

    public zzbx(long j) {
        this.a = j;
    }

    public final void a(long j) {
        synchronized (this.c) {
            this.a = j;
        }
    }

    public final boolean b() {
        synchronized (this.c) {
            try {
                long b = com.google.android.gms.ads.internal.zzv.d().b();
                if (this.b + this.a > b) {
                    return false;
                }
                this.b = b;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
