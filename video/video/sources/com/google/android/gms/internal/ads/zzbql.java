package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* loaded from: classes2.dex */
final class zzbql implements MediationAdLoadCallback {
    public final /* synthetic */ zzbpr a;
    public final /* synthetic */ zzbqm b;

    public zzbql(zzbqm zzbqmVar, zzbpr zzbprVar) {
        this.a = zzbprVar;
        this.b = zzbqmVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            this.b.f1 = (MediationAppOpenAd) obj;
            this.a.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
        return new zzbqc(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void q0(String str) {
        Object obj;
        try {
            obj = this.b.X;
            String canonicalName = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.b(canonicalName + "failed to loaded mediation ad: " + str);
            zzbpr zzbprVar = this.a;
            zzbprVar.O1(0, str);
            zzbprVar.A(0);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
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
            com.google.android.gms.ads.internal.util.client.zzo.b(canonicalName + "failed to load mediation ad: ErrorCode = " + b + ". ErrorMessage = " + d + ". ErrorDomain = " + c);
            zzbpr zzbprVar = this.a;
            zzbprVar.Y1(adError.e());
            zzbprVar.O1(adError.b(), adError.d());
            zzbprVar.A(adError.b());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }
}
