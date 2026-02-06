package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public final class zzdxz extends zzbvc {
    public final /* synthetic */ zzdyb X;

    public zzdxz(zzdyb zzdybVar) {
        this.X = zzdybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void s5(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.X.X.d(zzbbVar.m0());
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void t1(ParcelFileDescriptor parcelFileDescriptor, zzbvl zzbvlVar) {
        this.X.X.c(new zzdyr(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void y6(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdyb zzdybVar = this.X;
        zzdybVar.X.c(new zzdyr(autoCloseInputStream, zzdybVar.Z0));
    }
}
