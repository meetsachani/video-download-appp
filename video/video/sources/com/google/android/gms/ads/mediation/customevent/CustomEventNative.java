package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventNative extends CustomEvent {
    void requestNativeAd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 CustomEventNativeListener customEventNativeListener, @InterfaceC11300zs1 String str, @InterfaceC5670cr1 NativeMediationAdRequest nativeMediationAdRequest, @InterfaceC11300zs1 Bundle bundle);
}
