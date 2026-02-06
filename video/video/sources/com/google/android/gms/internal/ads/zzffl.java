package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzffl implements zzhfv {
    public static zzffl a() {
        return zzffk.a;
    }

    public static zzgdj c() {
        zzgdj zzgdjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W5)).booleanValue()) {
            zzgdjVar = zzcaa.c;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V5)).booleanValue()) {
                zzgdjVar = zzcaa.a;
            } else {
                zzgdjVar = zzcaa.f;
            }
        }
        zzhgd.b(zzgdjVar);
        return zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        return c();
    }
}
