package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzdpd {
    public final Context a;
    public final zzavl b;
    public final zzbec c;
    public final VersionInfoParcel d;
    public final com.google.android.gms.ads.internal.zza e;
    public final zzbbt f;
    public final zzcyq g;
    public final zzece h;
    public final zzfct i;
    public final zzdsd j;

    public zzdpd(zzcfo zzcfoVar, Context context, zzavl zzavlVar, zzbec zzbecVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbt zzbbtVar, zzcyq zzcyqVar, zzece zzeceVar, zzfct zzfctVar, zzdsd zzdsdVar) {
        this.a = context;
        this.b = zzavlVar;
        this.c = zzbecVar;
        this.d = versionInfoParcel;
        this.e = zzaVar;
        this.f = zzbbtVar;
        this.g = zzcyqVar;
        this.h = zzeceVar;
        this.i = zzfctVar;
        this.j = zzdsdVar;
    }

    public final zzcfb a(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfbu zzfbuVar, zzfbx zzfbxVar) throws zzcfn {
        zzcgv c = zzcgv.c(zzrVar);
        String str = zzrVar.X;
        zzdos zzdosVar = new zzdos(this);
        zzece zzeceVar = this.h;
        zzfct zzfctVar = this.i;
        zzdsd zzdsdVar = this.j;
        com.google.android.gms.ads.internal.zza zzaVar = this.e;
        zzbbt zzbbtVar = this.f;
        return zzcfo.a(this.a, c, str, false, false, this.b, this.c, this.d, null, zzdosVar, zzaVar, zzbbtVar, zzfbuVar, zzfbxVar, zzeceVar, zzfctVar, zzdsdVar);
    }
}
