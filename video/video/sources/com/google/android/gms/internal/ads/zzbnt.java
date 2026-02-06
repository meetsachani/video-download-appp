package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnt extends zzcam {
    public final Object c = new Object();
    public final zzbny d;
    public boolean e;

    public zzbnt(zzbny zzbnyVar) {
        this.d = zzbnyVar;
    }

    public final void h() {
        com.google.android.gms.ads.internal.util.zze.k("release: Trying to acquire lock");
        synchronized (this.c) {
            try {
                com.google.android.gms.ads.internal.util.zze.k("release: Lock acquired");
                if (this.e) {
                    com.google.android.gms.ads.internal.util.zze.k("release: Lock already released");
                    return;
                }
                this.e = true;
                f(new zzbnq(this), new zzcai());
                f(new zzbnr(this), new zzbns(this));
                com.google.android.gms.ads.internal.util.zze.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
