package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnn implements Runnable {
    public final /* synthetic */ zzbny X;
    public final /* synthetic */ zzbmu Y;
    public final /* synthetic */ long Y0;
    public final /* synthetic */ ArrayList Z;
    public final /* synthetic */ zzbnz Z0;

    public zzbnn(zzbnz zzbnzVar, zzbny zzbnyVar, zzbmu zzbmuVar, ArrayList arrayList, long j) {
        this.X = zzbnyVar;
        this.Y = zzbmuVar;
        this.Z = arrayList;
        this.Y0 = j;
        this.Z0 = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        String str;
        com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbnz zzbnzVar = this.Z0;
        obj = zzbnzVar.a;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbny zzbnyVar = this.X;
                if (zzbnyVar.a() != -1 && zzbnyVar.a() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V7)).booleanValue()) {
                        zzbnyVar.d(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbnyVar.c();
                    }
                    zzgdj zzgdjVar = zzcaa.f;
                    final zzbmu zzbmuVar = this.Y;
                    Objects.requireNonNull(zzbmuVar);
                    zzgdjVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbmu.this.c();
                        }
                    });
                    String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d));
                    int a = zzbnyVar.a();
                    i = zzbnzVar.i;
                    ArrayList arrayList = this.Z;
                    if (arrayList.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(arrayList.get(0));
                    }
                    com.google.android.gms.ads.internal.util.zze.k("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + a + ". Update status(fullLoadTimeout) is " + i + str + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzv.d().a() - this.Y0) + " ms at timeout. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
