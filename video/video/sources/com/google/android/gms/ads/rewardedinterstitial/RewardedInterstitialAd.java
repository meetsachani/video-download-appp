package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbxk;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class RewardedInterstitialAd {
    public static void h(@InterfaceC5670cr1 final Context context, @InterfaceC5670cr1 final String str, @InterfaceC5670cr1 final AdRequest adRequest, @InterfaceC5670cr1 final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.s(context, "Context cannot be null.");
        Preconditions.s(str, "AdUnitId cannot be null.");
        Preconditions.s(adRequest, "AdRequest cannot be null.");
        Preconditions.s(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbcv.a(context);
        if (((Boolean) zzbet.k.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbxk(context2, str2).p(adRequest2.j(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbui.c(context2).b(e, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbxk(context, str).p(adRequest.j(), rewardedInterstitialAdLoadCallback);
    }

    public static void i(@InterfaceC5670cr1 final Context context, @InterfaceC5670cr1 final String str, @InterfaceC5670cr1 final AdManagerAdRequest adManagerAdRequest, @InterfaceC5670cr1 final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.s(context, "Context cannot be null.");
        Preconditions.s(str, "AdUnitId cannot be null.");
        Preconditions.s(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.s(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbcv.a(context);
        if (((Boolean) zzbet.k.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbxk(context2, str2).p(adManagerAdRequest2.j(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbui.c(context2).b(e, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbxk(context, str).p(adManagerAdRequest.j(), rewardedInterstitialAdLoadCallback);
    }

    @InterfaceC5670cr1
    public abstract Bundle a();

    @InterfaceC5670cr1
    public abstract String b();

    @InterfaceC11300zs1
    public abstract FullScreenContentCallback c();

    @InterfaceC11300zs1
    public abstract OnAdMetadataChangedListener d();

    @InterfaceC11300zs1
    public abstract OnPaidEventListener e();

    @InterfaceC5670cr1
    public abstract ResponseInfo f();

    @InterfaceC5670cr1
    public abstract RewardItem g();

    public abstract void j(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback);

    public abstract void k(boolean z);

    public abstract void l(@InterfaceC11300zs1 OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void m(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener);

    public abstract void n(@InterfaceC5670cr1 ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void o(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnUserEarnedRewardListener onUserEarnedRewardListener);
}
