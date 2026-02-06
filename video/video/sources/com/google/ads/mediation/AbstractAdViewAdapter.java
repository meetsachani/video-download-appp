package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import java.util.Set;
import o.C5096aT2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.SS2;

/* loaded from: classes2.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza {
    @InterfaceC5670cr1
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdLoader adLoader;
    @InterfaceC5670cr1
    protected AdView mAdView;
    @InterfaceC5670cr1
    protected InterstitialAd mInterstitialAd;

    public AdRequest buildAdRequest(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Set<String> m = mediationAdRequest.m();
        if (m != null) {
            for (String str : m) {
                builder.d(str);
            }
        }
        if (mediationAdRequest.g()) {
            zzbb.b();
            builder.l(zzf.E(context));
        }
        if (mediationAdRequest.d() != -1) {
            boolean z = true;
            if (mediationAdRequest.d() != 1) {
                z = false;
            }
            builder.o(z);
        }
        builder.m(mediationAdRequest.e());
        builder.e(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return builder.p();
    }

    @InterfaceC5670cr1
    public abstract Bundle buildExtrasBundle(@InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 Bundle bundle2);

    @InterfaceC5670cr1
    public String getAdUnitId(@InterfaceC5670cr1 Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @InterfaceC5670cr1
    public View getBannerView() {
        return this.mAdView;
    }

    @InterfaceC5056aJ2
    public InterstitialAd getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // com.google.android.gms.ads.mediation.zza
    @InterfaceC11300zs1
    public zzea getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.g().l();
        }
        return null;
    }

    @InterfaceC5056aJ2
    public AdLoader.Builder newAdLoader(Context context, String str) {
        return new AdLoader.Builder(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.i(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.e();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.f();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 MediationBannerListener mediationBannerListener, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 AdSize adSize, @InterfaceC5670cr1 MediationAdRequest mediationAdRequest, @InterfaceC5670cr1 Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new AdSize(adSize.j(), adSize.c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new SS2(this, mediationBannerListener));
        this.mAdView.d(buildAdRequest(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 MediationInterstitialListener mediationInterstitialListener, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 MediationAdRequest mediationAdRequest, @InterfaceC5670cr1 Bundle bundle2) {
        InterstitialAd.f(context, getAdUnitId(bundle), buildAdRequest(context, mediationAdRequest, bundle2, bundle), new a(this, mediationInterstitialListener));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 MediationNativeListener mediationNativeListener, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 NativeMediationAdRequest nativeMediationAdRequest, @InterfaceC5670cr1 Bundle bundle2) {
        C5096aT2 c5096aT2;
        C5096aT2 c5096aT22 = new C5096aT2(this, mediationNativeListener);
        AdLoader.Builder newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.e(c5096aT22);
        newAdLoader.j(nativeMediationAdRequest.h());
        newAdLoader.g(nativeMediationAdRequest.c());
        if (nativeMediationAdRequest.k()) {
            newAdLoader.i(c5096aT22);
        }
        if (nativeMediationAdRequest.b()) {
            for (String str : nativeMediationAdRequest.a().keySet()) {
                if (true != ((Boolean) nativeMediationAdRequest.a().get(str)).booleanValue()) {
                    c5096aT2 = null;
                } else {
                    c5096aT2 = c5096aT22;
                }
                newAdLoader.h(str, c5096aT22, c5096aT2);
            }
        }
        AdLoader a = newAdLoader.a();
        this.adLoader = a;
        a.b(buildAdRequest(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.k(null);
        }
    }
}
