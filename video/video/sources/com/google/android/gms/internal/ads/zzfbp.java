package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfbp implements zzelg {
    public final /* synthetic */ zzfbr a;

    public zzfbp(zzfbr zzfbrVar) {
        this.a = zzfbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final void a() {
        zzfbr zzfbrVar = this.a;
        synchronized (zzfbrVar) {
            zzfbrVar.Y0 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzdoh zzdohVar;
        zzfch zzfchVar;
        zzfbr zzfbrVar = this.a;
        zzdoh zzdohVar2 = (zzdoh) obj;
        synchronized (zzfbrVar) {
            try {
                zzfbrVar.Y0 = zzdohVar2;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P3)).booleanValue()) {
                    zzfci k = zzdohVar2.k();
                    zzfchVar = zzfbrVar.Z;
                    k.a = zzfchVar;
                }
                zzdohVar = zzfbrVar.Y0;
                zzdohVar.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
