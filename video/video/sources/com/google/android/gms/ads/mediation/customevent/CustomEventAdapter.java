package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import o.C5459bz1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

@KeepForSdkWithMembers
@KeepName
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    @InterfaceC5056aJ2
    public static final AdError e = new AdError(0, "Could not instantiate custom event adapter", MobileAds.a);
    public View a;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public CustomEventBanner b;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public CustomEventInterstitial c;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public CustomEventNative d;

    @InterfaceC11300zs1
    public static Object b(Class cls, @InterfaceC11300zs1 String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            }
            throw null;
        } catch (Throwable th) {
            String message = th.getMessage();
            zzo.g("Could not instantiate custom event adapter: " + str + ". " + message);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @InterfaceC5670cr1
    public View getBannerView() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 MediationBannerListener mediationBannerListener, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 AdSize adSize, @InterfaceC5670cr1 MediationAdRequest mediationAdRequest, @InterfaceC11300zs1 Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) b(CustomEventBanner.class, bundle.getString(C5459bz1.j));
        this.b = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.e(this, e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString(C5459bz1.j));
        }
        Bundle bundle4 = bundle3;
        CustomEventBanner customEventBanner2 = this.b;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new zza(this, mediationBannerListener), bundle.getString(MediationConfiguration.c), adSize, mediationAdRequest, bundle4);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 MediationInterstitialListener mediationInterstitialListener, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 MediationAdRequest mediationAdRequest, @InterfaceC11300zs1 Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) b(CustomEventInterstitial.class, bundle.getString(C5459bz1.j));
        this.c = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.u(this, e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString(C5459bz1.j));
        }
        Bundle bundle4 = bundle3;
        CustomEventInterstitial customEventInterstitial2 = this.c;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new zzb(this, this, mediationInterstitialListener), bundle.getString(MediationConfiguration.c), mediationAdRequest, bundle4);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 MediationNativeListener mediationNativeListener, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 NativeMediationAdRequest nativeMediationAdRequest, @InterfaceC11300zs1 Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) b(CustomEventNative.class, bundle.getString(C5459bz1.j));
        this.d = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.b(this, e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString(C5459bz1.j));
        }
        Bundle bundle4 = bundle3;
        CustomEventNative customEventNative2 = this.d;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new zzc(this, mediationNativeListener), bundle.getString(MediationConfiguration.c), nativeMediationAdRequest, bundle4);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
