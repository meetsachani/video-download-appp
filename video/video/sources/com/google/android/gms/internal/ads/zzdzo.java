package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzdzo implements zzgcu {
    public final /* synthetic */ zzbuv a;
    public final /* synthetic */ zzbve b;

    public zzdzo(zzdzu zzdzuVar, zzbve zzbveVar, zzbuv zzbuvVar) {
        this.b = zzbveVar;
        this.a = zzbuvVar;
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
        try {
            this.b.r4((String) obj, this.a);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.l("Service can't call client", e);
        }
    }
}
