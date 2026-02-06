package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfbk implements zzelg {
    public final /* synthetic */ zzfbl a;

    public zzfbk(zzfbl zzfblVar) {
        this.a = zzfblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final void a() {
        zzfbl zzfblVar = this.a;
        synchronized (zzfblVar) {
            zzfblVar.d1 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzdoh zzdohVar;
        zzfch zzfchVar;
        zzfbl zzfblVar = this.a;
        zzdoh zzdohVar2 = (zzdoh) obj;
        synchronized (zzfblVar) {
            try {
                zzfblVar.d1 = zzdohVar2;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P3)).booleanValue()) {
                    zzfci k = zzdohVar2.k();
                    zzfchVar = zzfblVar.Y0;
                    k.a = zzfchVar;
                }
                zzdohVar = zzfblVar.d1;
                zzdohVar.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
