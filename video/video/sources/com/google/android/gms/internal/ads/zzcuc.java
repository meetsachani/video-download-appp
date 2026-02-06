package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcuc implements zzcyv, zzdek {
    public final Context X;
    public final zzfcp Y;
    public final com.google.android.gms.ads.internal.util.zzg Y0;
    public final VersionInfoParcel Z;
    public final zzduh Z0;
    public final zzfhq a1;
    public final zzdvc b1;

    public zzcuc(Context context, zzfcp zzfcpVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzduh zzduhVar, zzfhq zzfhqVar, zzdvc zzdvcVar) {
        this.X = context;
        this.Y = zzfcpVar;
        this.Z = versionInfoParcel;
        this.Y0 = zzgVar;
        this.Z0 = zzduhVar;
        this.a1 = zzfhqVar;
        this.b1 = zzdvcVar;
    }

    private final void b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l4)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.Y0;
            Context context = this.X;
            VersionInfoParcel versionInfoParcel = this.Z;
            zzfcp zzfcpVar = this.Y;
            zzfhq zzfhqVar = this.a1;
            zzdvc zzdvcVar = this.b1;
            com.google.android.gms.ads.internal.zzv.e().e(context, versionInfoParcel, zzfcpVar.f, zzgVar.g(), zzfhqVar, zzdvcVar.r());
        }
        this.Z0.r();
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void S(@InterfaceC11300zs1 String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void a(@InterfaceC11300zs1 com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m4)).booleanValue()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
    }
}
