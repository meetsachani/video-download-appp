package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import o.InterfaceC5056aJ2;
import o.ZS2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class a extends InterstitialAdLoadCallback {
    @InterfaceC5056aJ2
    public final AbstractAdViewAdapter a;
    @InterfaceC5056aJ2
    public final MediationInterstitialListener b;

    public a(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.a = abstractAdViewAdapter;
        this.b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void a(LoadAdError loadAdError) {
        this.b.u(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void b(InterstitialAd interstitialAd) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        InterstitialAd interstitialAd2 = interstitialAd;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        MediationInterstitialListener mediationInterstitialListener = this.b;
        interstitialAd2.h(new ZS2(abstractAdViewAdapter, mediationInterstitialListener));
        mediationInterstitialListener.v(abstractAdViewAdapter);
    }
}
