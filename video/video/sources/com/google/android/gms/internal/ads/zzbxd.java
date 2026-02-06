package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* loaded from: classes2.dex */
public final class zzbxd extends zzbww {
    public final RewardedAdLoadCallback X;
    public final RewardedAd Y;

    public zzbxd(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.X = rewardedAdLoadCallback;
        this.Y = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void E(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.X;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.a(zzeVar.B0());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void g() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.X;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.b(this.Y);
        }
    }
}
