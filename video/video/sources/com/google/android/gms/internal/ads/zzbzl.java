package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbzl {
    public final Object a = new Object();
    public volatile int c = 1;
    public volatile long b = 0;

    private zzbzl() {
    }

    public final void a() {
        long a = com.google.android.gms.ads.internal.zzv.d().a();
        synchronized (this.a) {
            try {
                if (this.c == 3) {
                    if (this.b + ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g6)).longValue() <= a) {
                        this.c = 1;
                    }
                }
            } finally {
            }
        }
        long a2 = com.google.android.gms.ads.internal.zzv.d().a();
        synchronized (this.a) {
            try {
                if (this.c != 2) {
                    return;
                }
                this.c = 3;
                if (this.c == 3) {
                    this.b = a2;
                }
            } finally {
            }
        }
    }

    public /* synthetic */ zzbzl(zzbzm zzbzmVar) {
    }
}
