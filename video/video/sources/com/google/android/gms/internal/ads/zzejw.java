package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzejw implements zzelg {
    public final /* synthetic */ zzejx a;

    public zzejw(zzejx zzejxVar) {
        this.a = zzejxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final void a() {
        zzejx zzejxVar = this.a;
        synchronized (zzejxVar) {
            zzejxVar.d1 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzcop zzcopVar;
        zzcop zzcopVar2;
        zzcop zzcopVar3;
        zzejx zzejxVar = this.a;
        zzcop zzcopVar4 = (zzcop) obj;
        synchronized (zzejxVar) {
            try {
                zzcopVar = zzejxVar.d1;
                if (zzcopVar != null) {
                    zzcopVar3 = zzejxVar.d1;
                    zzcopVar3.a();
                }
                zzejxVar.d1 = zzcopVar4;
                zzcopVar2 = zzejxVar.d1;
                zzcopVar2.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
