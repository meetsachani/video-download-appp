package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* loaded from: classes2.dex */
public final class zzbxj extends zzbww {
    public final RewardedInterstitialAdLoadCallback X;
    public final zzbxk Y;

    public zzbxj(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbxk zzbxkVar) {
        this.X = rewardedInterstitialAdLoadCallback;
        this.Y = zzbxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void E(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.X;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.a(zzeVar.B0());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void g() {
        zzbxk zzbxkVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.X;
        if (rewardedInterstitialAdLoadCallback != null && (zzbxkVar = this.Y) != null) {
            rewardedInterstitialAdLoadCallback.b(zzbxkVar);
        }
    }
}
