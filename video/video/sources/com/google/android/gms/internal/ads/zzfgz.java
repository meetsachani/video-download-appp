package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfgz implements zzddd, zzcwj, zzddh {
    public final zzfhn X;
    public final zzfhc Y;

    public zzfgz(Context context, zzfhn zzfhnVar) {
        this.X = zzfhnVar;
        this.Y = zzfhb.a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void b() {
        if (((Boolean) zzbeo.d.e()).booleanValue()) {
            zzfhn zzfhnVar = this.X;
            zzfhc zzfhcVar = this.Y;
            zzfhcVar.c(true);
            zzfhnVar.a(zzfhcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void j() {
        if (((Boolean) zzbeo.d.e()).booleanValue()) {
            this.Y.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void w(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbeo.d.e()).booleanValue()) {
            zzfhn zzfhnVar = this.X;
            zzfhc zzfhcVar = this.Y;
            zzfhcVar.Q(zzeVar.m0().toString());
            zzfhcVar.c(false);
            zzfhnVar.a(zzfhcVar);
        }
    }
}
