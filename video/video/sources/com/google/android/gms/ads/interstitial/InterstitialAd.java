package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbui;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class InterstitialAd {
    public static boolean e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        try {
            return zzb.a(context).k2(str);
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void f(@InterfaceC5670cr1 final Context context, @InterfaceC5670cr1 final String str, @InterfaceC5670cr1 final AdRequest adRequest, @InterfaceC5670cr1 final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.s(context, "Context cannot be null.");
        Preconditions.s(str, "AdUnitId cannot be null.");
        Preconditions.s(adRequest, "AdRequest cannot be null.");
        Preconditions.s(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbcv.a(context);
        if (((Boolean) zzbet.i.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbmq(context2, str2).o(adRequest2.j(), interstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbui.c(context2).b(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbmq(context, str).o(adRequest.j(), interstitialAdLoadCallback);
    }

    @InterfaceC11300zs1
    public static InterstitialAd g(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        try {
            zzbx S = zzb.a(context).S(str);
            if (S == null) {
                zzo.i("Failed to obtain an Interstitial Ad from the preloader.", null);
                return null;
            }
            return new zzbmq(context, str, S);
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    @InterfaceC5670cr1
    public abstract String a();

    @InterfaceC11300zs1
    public abstract FullScreenContentCallback b();

    @InterfaceC11300zs1
    public abstract OnPaidEventListener c();

    @InterfaceC5670cr1
    public abstract ResponseInfo d();

    public abstract void h(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback);

    public abstract void i(boolean z);

    public abstract void j(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener);

    public abstract void k(@InterfaceC5670cr1 Activity activity);
}
