package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationBannerAdapter extends MediationAdapter {
    @InterfaceC5670cr1
    View getBannerView();

    void requestBannerAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 MediationBannerListener mediationBannerListener, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 AdSize adSize, @InterfaceC5670cr1 MediationAdRequest mediationAdRequest, @InterfaceC11300zs1 Bundle bundle2);
}
