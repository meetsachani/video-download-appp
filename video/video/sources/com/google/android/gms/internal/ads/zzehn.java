package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzehn extends zzeio {
    public final zzdeh f1;

    public zzehn(zzcvr zzcvrVar, zzddw zzddwVar, zzcwl zzcwlVar, zzcxa zzcxaVar, zzcxf zzcxfVar, zzcwg zzcwgVar, zzdau zzdauVar, zzdet zzdetVar, zzcxz zzcxzVar, zzdeh zzdehVar, zzdaq zzdaqVar) {
        super(zzcvrVar, zzddwVar, zzcwlVar, zzcxaVar, zzcxfVar, zzdauVar, zzcxzVar, zzdetVar, zzdaqVar, zzcwgVar);
        this.f1 = zzdehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeio, com.google.android.gms.internal.ads.zzbpr
    public final void B() {
        this.f1.b();
    }

    @Override // com.google.android.gms.internal.ads.zzeio, com.google.android.gms.internal.ads.zzbpr
    public final void C() {
        this.f1.c();
    }

    @Override // com.google.android.gms.internal.ads.zzeio, com.google.android.gms.internal.ads.zzbpr
    public final void N4(zzbwn zzbwnVar) throws RemoteException {
        this.f1.N0(new zzbwj(zzbwnVar.e(), zzbwnVar.d()));
    }

    @Override // com.google.android.gms.internal.ads.zzeio, com.google.android.gms.internal.ads.zzbpr
    public final void N6(zzbwj zzbwjVar) {
        this.f1.N0(zzbwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeio, com.google.android.gms.internal.ads.zzbpr
    public final void q() throws RemoteException {
        this.f1.b();
    }

    @Override // com.google.android.gms.internal.ads.zzeio, com.google.android.gms.internal.ads.zzbpr
    public final void t() throws RemoteException {
        this.f1.N0(null);
    }
}
