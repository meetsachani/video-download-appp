package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdzq implements zzgcu {
    public final /* synthetic */ zzbvl a;
    public final /* synthetic */ zzbvd b;

    public zzdzq(zzdzu zzdzuVar, zzbvl zzbvlVar, zzbvd zzbvdVar) {
        this.a = zzbvlVar;
        this.b = zzbvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        try {
            this.b.s5(com.google.android.gms.ads.internal.util.zzbb.B0(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.l("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r2)).booleanValue() && (bundle = this.a.h1) != null) {
                    bundle.putLong(zzdrl.BINDER_CALL_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
                }
                this.b.t1(parcelFileDescriptor, this.a);
                return;
            }
            this.b.y6(parcelFileDescriptor);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.l("Service can't call client", e);
        }
    }
}
