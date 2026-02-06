package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcbq {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, final zzcbb zzcbbVar) {
        if (zzcbbVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (!this.c) {
                if (Math.abs(timestamp - this.b) < this.a) {
                    return;
                }
            }
            this.c = false;
            this.b = timestamp;
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbb.this.k();
                }
            });
        }
    }

    public final void b() {
        this.c = true;
    }
}
