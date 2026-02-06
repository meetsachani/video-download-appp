package com.google.android.gms.internal.ads;

import java.util.Map;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbiu implements zzbjw {
    public final /* synthetic */ zzddy a;
    public final /* synthetic */ zzcmn b;

    public /* synthetic */ zzbiu(zzddy zzddyVar, zzcmn zzcmnVar) {
        this.a = zzddyVar;
        this.b = zzcmnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        zzbjv.c(map, this.a);
        final String str = (String) map.get("u");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("URL missing from click GMSG.");
            return;
        }
        final zzcmn zzcmnVar = this.b;
        zzgcp A = zzgcp.A(zzbjv.a(zzcfbVar, str));
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzbix
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj2) {
                zzcmn zzcmnVar2;
                String str2 = (String) obj2;
                zzbjw zzbjwVar = zzbjv.a;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.qa)).booleanValue() && (zzcmnVar2 = zzcmn.this) != null && zzcmn.j(str)) {
                    return zzcmnVar2.e(str2, com.google.android.gms.ads.internal.client.zzbb.e());
                }
                return zzgcy.h(str2);
            }
        };
        zzgdj zzgdjVar = zzcaa.a;
        zzgcy.r((zzgcp) zzgcy.n(A, zzgcfVar, zzgdjVar), new zzbjk(zzcfbVar), zzgdjVar);
    }
}
