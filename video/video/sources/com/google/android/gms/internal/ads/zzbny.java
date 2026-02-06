package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzbny extends zzcam {
    public final com.google.android.gms.ads.internal.util.zzbd d;
    public final Object c = new Object();
    public boolean e = false;
    public int f = 0;

    public zzbny(com.google.android.gms.ads.internal.util.zzbd zzbdVar) {
        this.d = zzbdVar;
    }

    public final zzbnt g() {
        boolean z;
        zzbnt zzbntVar = new zzbnt(this);
        com.google.android.gms.ads.internal.util.zze.k("createNewReference: Trying to acquire lock");
        synchronized (this.c) {
            com.google.android.gms.ads.internal.util.zze.k("createNewReference: Lock acquired");
            f(new zzbnu(this, zzbntVar), new zzbnv(this, zzbntVar));
            if (this.f >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.x(z);
            this.f++;
        }
        com.google.android.gms.ads.internal.util.zze.k("createNewReference: Lock released");
        return zzbntVar;
    }

    public final void h() {
        boolean z;
        com.google.android.gms.ads.internal.util.zze.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.c) {
            com.google.android.gms.ads.internal.util.zze.k("markAsDestroyable: Lock acquired");
            if (this.f >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.x(z);
            com.google.android.gms.ads.internal.util.zze.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            i();
        }
        com.google.android.gms.ads.internal.util.zze.k("markAsDestroyable: Lock released");
    }

    public final void i() {
        boolean z;
        com.google.android.gms.ads.internal.util.zze.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.c) {
            try {
                com.google.android.gms.ads.internal.util.zze.k("maybeDestroy: Lock acquired");
                if (this.f >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.x(z);
                if (this.e && this.f == 0) {
                    com.google.android.gms.ads.internal.util.zze.k("No reference is left (including root). Cleaning up engine.");
                    f(new zzbnx(this), new zzcai());
                } else {
                    com.google.android.gms.ads.internal.util.zze.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.k("maybeDestroy: Lock released");
    }

    public final void j() {
        boolean z;
        com.google.android.gms.ads.internal.util.zze.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.c) {
            com.google.android.gms.ads.internal.util.zze.k("releaseOneReference: Lock acquired");
            if (this.f > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.x(z);
            com.google.android.gms.ads.internal.util.zze.k("Releasing 1 reference for JS Engine");
            this.f--;
            i();
        }
        com.google.android.gms.ads.internal.util.zze.k("releaseOneReference: Lock released");
    }
}
