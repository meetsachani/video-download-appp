package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzexz implements zzelg {
    public final /* synthetic */ zzeya a;

    public zzexz(zzeya zzeyaVar) {
        this.a = zzeyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final void a() {
        zzeya zzeyaVar = this.a;
        synchronized (zzeyaVar) {
            zzeyaVar.f1 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzexs zzexsVar;
        zzexs zzexsVar2;
        zzdsd zzdsdVar;
        zzcoj zzcojVar = (zzcoj) obj;
        zzeya zzeyaVar = this.a;
        synchronized (zzeyaVar) {
            try {
                zzcoj zzcojVar2 = zzeyaVar.f1;
                if (zzcojVar2 != null) {
                    zzcojVar2.a();
                }
                zzeyaVar.f1 = zzcojVar;
                zzcojVar.j(zzeyaVar);
                zzexsVar = zzeyaVar.a1;
                zzexsVar2 = zzeyaVar.a1;
                zzdsdVar = zzeyaVar.c1;
                zzexsVar.c(new zzcok(zzcojVar, zzeyaVar, zzexsVar2, zzdsdVar));
                zzcojVar.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
