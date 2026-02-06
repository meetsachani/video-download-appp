package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbno implements zzcaj {
    public final /* synthetic */ zzbny a;
    public final /* synthetic */ zzfhc b;
    public final /* synthetic */ zzbnz c;

    public zzbno(zzbnz zzbnzVar, zzbny zzbnyVar, zzfhc zzfhcVar) {
        this.a = zzbnyVar;
        this.b = zzfhcVar;
        this.c = zzbnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Object obj2;
        zzbny zzbnyVar;
        zzfhq zzfhqVar;
        zzfhq zzfhqVar2;
        zzbny zzbnyVar2;
        zzbny zzbnyVar3;
        zzbmu zzbmuVar = (zzbmu) obj;
        com.google.android.gms.ads.internal.util.zze.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbnz zzbnzVar = this.c;
        obj2 = zzbnzVar.a;
        synchronized (obj2) {
            try {
                com.google.android.gms.ads.internal.util.zze.k("loadNewJavascriptEngine (success): Lock acquired");
                zzbnzVar.i = 0;
                zzbnyVar = zzbnzVar.h;
                if (zzbnyVar != null) {
                    zzbny zzbnyVar4 = this.a;
                    zzbnyVar2 = zzbnzVar.h;
                    if (zzbnyVar4 != zzbnyVar2) {
                        com.google.android.gms.ads.internal.util.zze.k("New JS engine is loaded, marking previous one as destroyable.");
                        zzbnyVar3 = zzbnzVar.h;
                        zzbnyVar3.h();
                    }
                }
                zzbnzVar.h = this.a;
                if (((Boolean) zzbeo.d.e()).booleanValue()) {
                    zzfhqVar = zzbnzVar.e;
                    if (zzfhqVar != null) {
                        zzfhqVar2 = zzbnzVar.e;
                        zzfhc zzfhcVar = this.b;
                        zzfhcVar.c(true);
                        zzfhqVar2.c(zzfhcVar.m());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.k("loadNewJavascriptEngine (success): Lock released");
    }
}
