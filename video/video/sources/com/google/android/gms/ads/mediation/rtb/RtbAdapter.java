package com.google.android.gms.ads.mediation.rtb;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import o.InterfaceC5670cr1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public abstract class RtbAdapter extends Adapter {
    public abstract void collectSignals(@InterfaceC5670cr1 RtbSignalData rtbSignalData, @InterfaceC5670cr1 SignalCallbacks signalCallbacks);

    public void loadRtbAppOpenAd(@InterfaceC5670cr1 MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        loadAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbBannerAd(@InterfaceC5670cr1 MediationBannerAdConfiguration mediationBannerAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        loadBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbInterstitialAd(@InterfaceC5670cr1 MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        loadInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
    }

    @Deprecated
    public void loadRtbNativeAd(@InterfaceC5670cr1 MediationNativeAdConfiguration mediationNativeAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        loadNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbNativeAdMapper(@InterfaceC5670cr1 MediationNativeAdConfiguration mediationNativeAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) throws RemoteException {
        loadNativeAdMapper(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbRewardedAd(@InterfaceC5670cr1 MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbRewardedInterstitialAd(@InterfaceC5670cr1 MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @InterfaceC5670cr1 MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        loadRewardedInterstitialAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }
}
