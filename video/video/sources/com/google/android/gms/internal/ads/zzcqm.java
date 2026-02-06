package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcqm implements zzcxh, zzayu, zzdas {
    public final zzfbu X;
    public final zzcwl Y;
    public final zzcxq Z;
    public final zzcyh a1;
    public final AtomicBoolean Y0 = new AtomicBoolean();
    public final AtomicBoolean Z0 = new AtomicBoolean();
    public final AtomicBoolean b1 = new AtomicBoolean();

    public zzcqm(zzfbu zzfbuVar, zzcwl zzcwlVar, zzcxq zzcxqVar, zzcyh zzcyhVar) {
        this.X = zzfbuVar;
        this.Y = zzcwlVar;
        this.Z = zzcxqVar;
        this.a1 = zzcyhVar;
    }

    private final void a() {
        if (this.Y0.compareAndSet(false, true)) {
            this.Y.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void E0(zzayt zzaytVar) {
        int i = this.X.e;
        if (i == 1) {
            if (zzaytVar.j) {
                a();
            }
        } else if (i == 4 && zzaytVar.j && this.b1.compareAndSet(false, true)) {
            this.a1.a();
        }
        if (zzaytVar.j && this.Z0.compareAndSet(false, true)) {
            this.Z.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void g() {
        if (this.X.e == 4) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void v() {
        int i = this.X.e;
        if (i != 1 && i != 4) {
            a();
        }
    }
}
