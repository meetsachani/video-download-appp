package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbca;

/* loaded from: classes2.dex */
public final class zzdop implements zzhfv {
    public final zzhge a;

    public zzdop(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzbca.zza.EnumC0104zza enumC0104zza;
        if (((zzcvk) this.a).a().f280o.a == 3) {
            enumC0104zza = zzbca.zza.EnumC0104zza.REWARDED_INTERSTITIAL;
        } else {
            enumC0104zza = zzbca.zza.EnumC0104zza.REWARD_BASED_VIDEO_AD;
        }
        zzhgd.b(enumC0104zza);
        return enumC0104zza;
    }
}
