package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnk implements zzbjw {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzbny b;
    public final /* synthetic */ zzbmu c;
    public final /* synthetic */ zzbnz d;

    public zzbnk(zzbnz zzbnzVar, long j, zzbny zzbnyVar, zzbmu zzbmuVar) {
        this.a = j;
        this.b = zzbnyVar;
        this.c = zzbmuVar;
        this.d = zzbnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Object obj2;
        zzboa zzboaVar = (zzboa) obj;
        long a = com.google.android.gms.ads.internal.zzv.d().a() - this.a;
        com.google.android.gms.ads.internal.util.zze.k("onGmsg /jsLoaded. JsLoaded latency is " + a + " ms.");
        com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbnz zzbnzVar = this.d;
        obj2 = zzbnzVar.a;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbny zzbnyVar = this.b;
            if (zzbnyVar.a() != -1 && zzbnyVar.a() != 1) {
                zzbnzVar.i = 0;
                zzbmu zzbmuVar = this.c;
                zzbmuVar.x0("/log", zzbjv.g);
                zzbmuVar.x0("/result", zzbjv.f226o);
                zzbnyVar.e(zzbmuVar);
                zzbnzVar.h = zzbnyVar;
                com.google.android.gms.ads.internal.util.zze.k("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
