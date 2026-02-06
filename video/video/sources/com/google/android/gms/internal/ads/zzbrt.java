package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbrt implements MediationAdLoadCallback {
    public final /* synthetic */ zzbre a;
    public final /* synthetic */ zzbpr b;

    public zzbrt(zzbrx zzbrxVar, zzbre zzbreVar, zzbpr zzbprVar) {
        this.a = zzbreVar;
        this.b = zzbprVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        if (unifiedNativeAdMapper == null) {
            com.google.android.gms.ads.internal.util.client.zzo.g("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.a.u("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                return null;
            }
        }
        try {
            this.a.P7(new zzbqs(unifiedNativeAdMapper));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
        }
        return new zzbry(this.b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void q0(String str) {
        r0(new AdError(0, str, "undefined"));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void r0(AdError adError) {
        try {
            this.a.G(adError.e());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }
}
