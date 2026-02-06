package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdvu extends RewardedAdLoadCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzdvz c;

    public zzdvu(zzdvz zzdvzVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = zzdvzVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void a(@InterfaceC5670cr1 LoadAdError loadAdError) {
        String f8;
        zzdvz zzdvzVar = this.c;
        f8 = zzdvz.f8(loadAdError);
        zzdvzVar.g8(f8, this.b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void b(@InterfaceC5670cr1 RewardedAd rewardedAd) {
        String str = this.b;
        this.c.a8(this.a, rewardedAd, str);
    }
}
