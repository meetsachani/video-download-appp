package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzbxg implements MediationRewardedAdCallback {
    public final zzbpr a;

    public zzbxg(zzbpr zzbprVar) {
        this.a = zzbprVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void b(AdError adError) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdFailedToShow.");
        int b = adError.b();
        String d = adError.d();
        String c = adError.c();
        com.google.android.gms.ads.internal.util.client.zzo.g("Mediation ad failed to show: Error Code = " + b + ". Error Message = " + d + " Error Domain = " + c);
        try {
            this.a.e3(adError.e());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void c() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onVideoComplete.");
        try {
            this.a.q();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void d() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdOpened.");
        try {
            this.a.o();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void e(String str) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzo.g("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.a.g0(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void f(RewardItem rewardItem) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onUserEarnedReward.");
        try {
            this.a.N4(new zzbxh(rewardItem));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void g() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onUserEarnedReward.");
        try {
            this.a.t();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void i() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onVideoStart.");
        try {
            this.a.C();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void l() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called reportAdImpression.");
        try {
            this.a.m();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void n() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called reportAdClicked.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdClosed.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }
}
