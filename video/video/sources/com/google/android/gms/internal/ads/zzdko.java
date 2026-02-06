package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzdko implements zzgcu {
    public final /* synthetic */ zzdkp a;

    public zzdko(zzdkp zzdkpVar) {
        this.a = zzdkpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E5)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.t().x(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    /* renamed from: b */
    public final void c(List list) {
        try {
            zzcfb zzcfbVar = (zzcfb) list.get(0);
            if (zzcfbVar != null) {
                this.a.b(zzcfbVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E5)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "omid native display exp");
            }
        }
    }
}
