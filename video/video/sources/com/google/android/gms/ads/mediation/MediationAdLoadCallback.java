package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import o.InterfaceC5670cr1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    @InterfaceC5670cr1
    MediationAdCallbackT a(@InterfaceC5670cr1 MediationAdT mediationadt);

    @Deprecated
    void q0(@InterfaceC5670cr1 String str);

    void r0(@InterfaceC5670cr1 AdError adError);
}
