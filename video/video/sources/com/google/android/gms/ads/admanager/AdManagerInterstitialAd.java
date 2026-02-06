package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbui;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void m(@InterfaceC5670cr1 final Context context, @InterfaceC5670cr1 final String str, @InterfaceC5670cr1 final AdManagerAdRequest adManagerAdRequest, @InterfaceC5670cr1 final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        Preconditions.s(context, "Context cannot be null.");
        Preconditions.s(str, "AdUnitId cannot be null.");
        Preconditions.s(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.s(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbcv.a(context);
        if (((Boolean) zzbet.i.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbmq(context2, str2).o(adManagerAdRequest2.j(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbui.c(context2).b(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbmq(context, str).o(adManagerAdRequest.j(), adManagerInterstitialAdLoadCallback);
    }

    @InterfaceC11300zs1
    public abstract AppEventListener l();

    public abstract void n(@InterfaceC11300zs1 AppEventListener appEventListener);
}
