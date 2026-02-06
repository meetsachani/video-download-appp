package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import java.util.List;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class Adapter implements MediationExtrasReceiver {
    @InterfaceC5670cr1
    public abstract com.google.android.gms.ads.VersionInfo getSDKVersionInfo();

    @InterfaceC5670cr1
    public abstract com.google.android.gms.ads.VersionInfo getVersionInfo();

    public abstract void initialize(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 InitializationCompleteCallback initializationCompleteCallback, @InterfaceC5670cr1 List<MediationConfiguration> list);

    public void loadAppOpenAd(@InterfaceC5670cr1 MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.r0(new AdError(7, getClass().getSimpleName().concat(" does not support app open ads."), MobileAds.a));
    }

    public void loadBannerAd(@InterfaceC5670cr1 MediationBannerAdConfiguration mediationBannerAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.r0(new AdError(7, getClass().getSimpleName().concat(" does not support banner ads."), MobileAds.a));
    }

    public void loadInterstitialAd(@InterfaceC5670cr1 MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.r0(new AdError(7, getClass().getSimpleName().concat(" does not support interstitial ads."), MobileAds.a));
    }

    @Deprecated
    public void loadNativeAd(@InterfaceC5670cr1 MediationNativeAdConfiguration mediationNativeAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.r0(new AdError(7, getClass().getSimpleName().concat(" does not support native ads."), MobileAds.a));
    }

    public void loadNativeAdMapper(@InterfaceC5670cr1 MediationNativeAdConfiguration mediationNativeAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(@InterfaceC5670cr1 MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.r0(new AdError(7, getClass().getSimpleName().concat(" does not support rewarded ads."), MobileAds.a));
    }

    public void loadRewardedInterstitialAd(@InterfaceC5670cr1 MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.r0(new AdError(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), MobileAds.a));
    }
}
