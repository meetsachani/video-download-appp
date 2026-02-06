package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdvv extends RewardedInterstitialAdLoadCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzdvz c;

    public zzdvv(zzdvz zzdvzVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = zzdvzVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void a(LoadAdError loadAdError) {
        String f8;
        zzdvz zzdvzVar = this.c;
        f8 = zzdvz.f8(loadAdError);
        zzdvzVar.g8(f8, this.b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void b(RewardedInterstitialAd rewardedInterstitialAd) {
        String str = this.b;
        this.c.a8(this.a, rewardedInterstitialAd, str);
    }
}
