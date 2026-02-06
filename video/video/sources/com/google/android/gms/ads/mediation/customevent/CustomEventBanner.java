package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventBanner extends CustomEvent {
    void requestBannerAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 CustomEventBannerListener customEventBannerListener, @InterfaceC11300zs1 String str, @InterfaceC5670cr1 AdSize adSize, @InterfaceC5670cr1 MediationAdRequest mediationAdRequest, @InterfaceC11300zs1 Bundle bundle);
}
