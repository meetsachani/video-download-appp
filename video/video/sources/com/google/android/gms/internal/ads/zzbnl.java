package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnl implements zzbjw {
    public final /* synthetic */ zzbmu a;
    public final /* synthetic */ com.google.android.gms.ads.internal.util.zzby b;
    public final /* synthetic */ zzbnz c;

    public zzbnl(zzbnz zzbnzVar, zzavl zzavlVar, zzbmu zzbmuVar, com.google.android.gms.ads.internal.util.zzby zzbyVar) {
        this.a = zzbmuVar;
        this.b = zzbyVar;
        this.c = zzbnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Object obj2;
        int i;
        zzboa zzboaVar = (zzboa) obj;
        com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbnz zzbnzVar = this.c;
        obj2 = zzbnzVar.a;
        synchronized (obj2) {
            try {
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                com.google.android.gms.ads.internal.util.client.zzo.f("JS Engine is requesting an update");
                i = zzbnzVar.i;
                if (i == 0) {
                    com.google.android.gms.ads.internal.util.client.zzo.f("Starting reload.");
                    zzbnzVar.i = 2;
                    zzbnzVar.d(null);
                }
                this.a.v("/requestReload", (zzbjw) this.b.a());
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
