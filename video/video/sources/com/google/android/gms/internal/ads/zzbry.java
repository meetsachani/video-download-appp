package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes2.dex */
final class zzbry implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationRewardedAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback {
    public final zzbpr a;

    public zzbry(zzbpr zzbprVar) {
        this.a = zzbprVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void a() {
        try {
            this.a.n();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void b(AdError adError) {
        try {
            int b = adError.b();
            String d = adError.d();
            String c = adError.c();
            com.google.android.gms.ads.internal.util.client.zzo.g("Mediated ad failed to show: Error Code = " + b + ". Error Message = " + d + " Error Domain = " + c);
            this.a.e3(adError.e());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void c() {
        try {
            this.a.B();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void d() {
        try {
            this.a.o();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void e(String str) {
        try {
            com.google.android.gms.ads.internal.util.client.zzo.g("Mediated ad failed to show: " + str);
            this.a.g0(str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void f(RewardItem rewardItem) {
        try {
            this.a.N4(new zzbxh(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void g() {
        try {
            this.a.t();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void h() {
        try {
            this.a.y();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void i() {
        try {
            this.a.C();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void j() {
        try {
            this.a.w();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void k() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void l() {
        try {
            this.a.m();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void m() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void n() {
        try {
            this.a.d();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        try {
            this.a.e();
        } catch (RemoteException unused) {
        }
    }
}
