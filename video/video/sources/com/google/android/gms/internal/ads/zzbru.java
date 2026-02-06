package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzbru implements MediationAdLoadCallback {
    public final /* synthetic */ zzbqv a;
    public final /* synthetic */ zzbpr b;
    public final /* synthetic */ zzbrx c;

    public zzbru(zzbrx zzbrxVar, zzbqv zzbqvVar, zzbpr zzbprVar) {
        this.a = zzbqvVar;
        this.b = zzbprVar;
        this.c = zzbrxVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
        if (mediationAppOpenAd != null) {
            try {
                this.c.Y0 = mediationAppOpenAd;
                this.a.g();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            }
            return new zzbry(this.b);
        }
        com.google.android.gms.ads.internal.util.client.zzo.g("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.a.u("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
            return null;
        }
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
