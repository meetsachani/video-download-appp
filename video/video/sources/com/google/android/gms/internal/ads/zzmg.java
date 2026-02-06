package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzmg implements zzkw {
    public boolean X;
    public long Y;
    public zzbb Y0 = zzbb.d;
    public long Z;

    public zzmg(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final long a() {
        long a;
        long j = this.Y;
        if (this.X) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.Z;
            zzbb zzbbVar = this.Y0;
            if (zzbbVar.a == 1.0f) {
                a = zzeu.N(elapsedRealtime);
            } else {
                a = zzbbVar.a(elapsedRealtime);
            }
            return j + a;
        }
        return j;
    }

    public final void b(long j) {
        this.Y = j;
        if (this.X) {
            this.Z = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final zzbb c() {
        return this.Y0;
    }

    public final void d() {
        if (!this.X) {
            this.Z = SystemClock.elapsedRealtime();
            this.X = true;
        }
    }

    public final void e() {
        if (this.X) {
            b(a());
            this.X = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void g(zzbb zzbbVar) {
        if (this.X) {
            b(a());
        }
        this.Y0 = zzbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final /* synthetic */ boolean j() {
        return false;
    }
}
