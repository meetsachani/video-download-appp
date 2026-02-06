package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.zzbhb;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationNativeListener {
    void a(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter);

    void b(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter, @InterfaceC5670cr1 AdError adError);

    void g(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter);

    void j(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter);

    void k(MediationNativeAdapter mediationNativeAdapter, zzbhb zzbhbVar, String str);

    void m(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter);

    void p(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter);

    @Deprecated
    void r(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter, int i);

    void s(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter);

    void w(MediationNativeAdapter mediationNativeAdapter, zzbhb zzbhbVar);

    void y(@InterfaceC5670cr1 MediationNativeAdapter mediationNativeAdapter, @InterfaceC5670cr1 UnifiedNativeAdMapper unifiedNativeAdMapper);
}
