package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbqg implements MediationAdLoadCallback {
    public final /* synthetic */ zzbpr a;
    public final /* synthetic */ zzbqm b;

    public zzbqg(zzbqm zzbqmVar, zzbpr zzbprVar) {
        this.a = zzbprVar;
        this.b = zzbqmVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        try {
            this.b.Z0 = mediationBannerAd.a();
            this.a.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
        return new zzbqc(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void q0(String str) {
        r0(new AdError(0, str, "undefined"));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void r0(AdError adError) {
        Object obj;
        try {
            obj = this.b.X;
            String canonicalName = obj.getClass().getCanonicalName();
            int b = adError.b();
            String d = adError.d();
            String c = adError.c();
            com.google.android.gms.ads.internal.util.client.zzo.b(canonicalName + "failed to loaded mediation ad: ErrorCode = " + b + ". ErrorMessage = " + d + ". ErrorDomain = " + c);
            zzbpr zzbprVar = this.a;
            zzbprVar.Y1(adError.e());
            zzbprVar.O1(adError.b(), adError.d());
            zzbprVar.A(adError.b());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }
}
