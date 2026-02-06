package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbwz;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class RewardedAd {
    public static boolean h(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        Preconditions.s(context, "Context cannot be null.");
        Preconditions.s(str, "AdUnitId cannot be null.");
        try {
            return com.google.android.gms.ads.zzb.a(context).g0(str);
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void i(@InterfaceC5670cr1 final Context context, @InterfaceC5670cr1 final String str, @InterfaceC5670cr1 final AdRequest adRequest, @InterfaceC5670cr1 final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.s(context, "Context cannot be null.");
        Preconditions.s(str, "AdUnitId cannot be null.");
        Preconditions.s(adRequest, "AdRequest cannot be null.");
        Preconditions.s(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbcv.a(context);
        if (((Boolean) zzbet.k.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbwz(context2, str2).r(adRequest2.j(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbui.c(context2).b(e, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        zzo.b("Loading on UI thread");
        new zzbwz(context, str).r(adRequest.j(), rewardedAdLoadCallback);
    }

    public static void j(@InterfaceC5670cr1 final Context context, @InterfaceC5670cr1 final String str, @InterfaceC5670cr1 final AdManagerAdRequest adManagerAdRequest, @InterfaceC5670cr1 final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.s(context, "Context cannot be null.");
        Preconditions.s(str, "AdUnitId cannot be null.");
        Preconditions.s(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.s(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbcv.a(context);
        if (((Boolean) zzbet.k.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                zzo.b("Loading on background thread");
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbwz(context2, str2).r(adManagerAdRequest2.j(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbui.c(context2).b(e, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        zzo.b("Loading on UI thread");
        new zzbwz(context, str).r(adManagerAdRequest.j(), rewardedAdLoadCallback);
    }

    @InterfaceC11300zs1
    public static RewardedAd k(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        Preconditions.s(context, "Context cannot be null.");
        Preconditions.s(str, "AdUnitId cannot be null.");
        try {
            zzbwq f0 = com.google.android.gms.ads.zzb.a(context).f0(str);
            if (f0 == null) {
                zzo.i("Failed to obtain a Rewarded Ad from the preloader.", null);
                return null;
            }
            return new zzbwz(context, str, f0);
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            return null;
        }
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

    public abstract void l(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback);

    public abstract void m(boolean z);

    public abstract void n(@InterfaceC11300zs1 OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void o(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener);

    public abstract void p(@InterfaceC11300zs1 ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void q(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnUserEarnedRewardListener onUserEarnedRewardListener);
}
