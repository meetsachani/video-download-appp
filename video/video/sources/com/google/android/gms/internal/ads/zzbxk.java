package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbxk extends RewardedInterstitialAd {
    public final String a;
    public final zzbwq b;
    public final Context c;
    @InterfaceC11300zs1
    public FullScreenContentCallback e;
    @InterfaceC11300zs1
    public OnAdMetadataChangedListener f;
    @InterfaceC11300zs1
    public OnPaidEventListener g;
    public final long h = System.currentTimeMillis();
    public final zzbxi d = new zzbxi();

    public zzbxk(Context context, String str) {
        this.a = str;
        this.c = context.getApplicationContext();
        this.b = com.google.android.gms.ads.internal.client.zzbb.a().s(context, str, new zzbph());
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle a() {
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                return zzbwqVar.b();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @InterfaceC11300zs1
    public final FullScreenContentCallback c() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @InterfaceC11300zs1
    public final OnAdMetadataChangedListener d() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @InterfaceC11300zs1
    public final OnPaidEventListener e() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @InterfaceC5670cr1
    public final ResponseInfo f() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzdxVar = zzbwqVar.c();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        return ResponseInfo.g(zzdxVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @InterfaceC5670cr1
    public final RewardItem g() {
        zzbwn zzbwnVar;
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwnVar = zzbwqVar.f();
            } else {
                zzbwnVar = null;
            }
            if (zzbwnVar != null) {
                return new zzbxa(zzbwnVar);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        return RewardItem.a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void j(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback) {
        this.e = fullScreenContentCallback;
        this.d.W7(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void k(boolean z) {
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.v3(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void l(@InterfaceC11300zs1 OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f = onAdMetadataChangedListener;
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.H4(new com.google.android.gms.ads.internal.client.zzfn(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void m(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener) {
        this.g = onPaidEventListener;
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.r3(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void n(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.d5(new zzbxe(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void o(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzbxi zzbxiVar = this.d;
        zzbxiVar.X7(onUserEarnedRewardListener);
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.e5(zzbxiVar);
                zzbwqVar.d0(ObjectWrapper.V3(activity));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void p(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzehVar.o(this.h);
                zzbwqVar.S6(com.google.android.gms.ads.internal.client.zzq.a.a(this.c, zzehVar), new zzbxj(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }
}
