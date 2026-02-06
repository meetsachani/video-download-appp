package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationInterstitialAdapter extends MediationAdapter {
    void requestInterstitialAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 MediationInterstitialListener mediationInterstitialListener, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 MediationAdRequest mediationAdRequest, @InterfaceC11300zs1 Bundle bundle2);

    void showInterstitial();
}
