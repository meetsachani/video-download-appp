package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventInterstitial extends CustomEvent {
    void requestInterstitialAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 CustomEventInterstitialListener customEventInterstitialListener, @InterfaceC11300zs1 String str, @InterfaceC5670cr1 MediationAdRequest mediationAdRequest, @InterfaceC11300zs1 Bundle bundle);

    void showInterstitial();
}
