package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfcx implements zzbjw {
    public final /* synthetic */ zzddy a;
    public final /* synthetic */ zzcmn b;
    public final /* synthetic */ zzfjr c;
    public final /* synthetic */ zzebt d;

    public /* synthetic */ zzfcx(zzddy zzddyVar, zzcmn zzcmnVar, zzfjr zzfjrVar, zzebt zzebtVar) {
        this.a = zzddyVar;
        this.b = zzcmnVar;
        this.c = zzfjrVar;
        this.d = zzebtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        zzbjv.c(map, this.a);
        String str = (String) map.get("u");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("URL missing from click GMSG.");
            return;
        }
        zzebt zzebtVar = this.d;
        zzfjr zzfjrVar = this.c;
        zzgcy.r(zzbjv.a(zzcfbVar, str), new zzfcz(zzcfbVar, this.b, zzfjrVar, zzebtVar), zzcaa.a);
    }
}
