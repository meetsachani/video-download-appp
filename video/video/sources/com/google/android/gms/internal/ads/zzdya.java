package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public final class zzdya extends zzbvc {
    public final zzcaf X;
    public final zzbvl Y;

    public zzdya(zzcaf zzcafVar, zzbvl zzbvlVar) {
        this.X = zzcafVar;
        this.Y = zzbvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void s5(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.X.d(zzbbVar.m0());
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void t1(ParcelFileDescriptor parcelFileDescriptor, zzbvl zzbvlVar) {
        this.X.c(new zzdyr(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void y6(ParcelFileDescriptor parcelFileDescriptor) {
        this.X.c(new zzdyr(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.Y));
    }
}
