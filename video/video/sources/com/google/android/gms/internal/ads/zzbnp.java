package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnp implements zzcah {
    public final /* synthetic */ zzbny a;
    public final /* synthetic */ zzfhc b;
    public final /* synthetic */ zzbnz c;

    public zzbnp(zzbnz zzbnzVar, zzbny zzbnyVar, zzfhc zzfhcVar) {
        this.a = zzbnyVar;
        this.b = zzfhcVar;
        this.c = zzbnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcah
    public final void a() {
        Object obj;
        zzfhq zzfhqVar;
        zzfhq zzfhqVar2;
        com.google.android.gms.ads.internal.util.zze.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbnz zzbnzVar = this.c;
        obj = zzbnzVar.a;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.k("loadNewJavascriptEngine (failure): Lock acquired");
                zzbnzVar.i = 1;
                com.google.android.gms.ads.internal.util.zze.k("Failed loading new engine. Marking new engine destroyable.");
                this.a.h();
                if (((Boolean) zzbeo.d.e()).booleanValue()) {
                    zzfhqVar = zzbnzVar.e;
                    if (zzfhqVar != null) {
                        zzfhqVar2 = zzbnzVar.e;
                        zzfhc zzfhcVar = this.b;
                        zzfhcVar.Q("Failed loading new engine");
                        zzfhcVar.c(false);
                        zzfhqVar2.c(zzfhcVar.m());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
