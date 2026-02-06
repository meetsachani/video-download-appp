package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzbmq extends AdManagerInterstitialAd {
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzq b;
    public final com.google.android.gms.ads.internal.client.zzbx c;
    public volatile String d;
    public final zzbph e;
    public final long f;
    @InterfaceC11300zs1
    public AppEventListener g;
    @InterfaceC11300zs1
    public FullScreenContentCallback h;
    @InterfaceC11300zs1
    public OnPaidEventListener i;

    public zzbmq(Context context, String str) {
        zzbph zzbphVar = new zzbph();
        this.e = zzbphVar;
        this.f = System.currentTimeMillis();
        this.a = context;
        this.d = str;
        this.b = com.google.android.gms.ads.internal.client.zzq.a;
        this.c = com.google.android.gms.ads.internal.client.zzbb.a().f(context, new com.google.android.gms.ads.internal.client.zzr(), str, zzbphVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String a() {
        String str;
        if (this.d != null && !this.d.isEmpty()) {
            return this.d;
        }
        synchronized (this) {
            try {
                String x = this.c.x();
                if (x != null && !x.isEmpty()) {
                    this.d = x;
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
            str = this.d;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    @InterfaceC11300zs1
    public final FullScreenContentCallback b() {
        return this.h;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    @InterfaceC11300zs1
    public final OnPaidEventListener c() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    @InterfaceC5670cr1
    public final ResponseInfo d() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.c;
            if (zzbxVar != null) {
                zzdxVar = zzbxVar.k();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        return ResponseInfo.g(zzdxVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void h(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.h = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.c;
            if (zzbxVar != null) {
                zzbxVar.T1(new com.google.android.gms.ads.internal.client.zzbe(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void i(boolean z) {
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.c;
            if (zzbxVar != null) {
                zzbxVar.i7(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void j(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener) {
        try {
            this.i = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.c;
            if (zzbxVar != null) {
                zzbxVar.m7(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void k(@InterfaceC5670cr1 Activity activity) {
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.c;
            if (zzbxVar != null) {
                zzbxVar.Q5(ObjectWrapper.V3(activity));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    @InterfaceC11300zs1
    public final AppEventListener l() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void n(@InterfaceC11300zs1 AppEventListener appEventListener) {
        zzazi zzaziVar;
        try {
            this.g = appEventListener;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.c;
            if (zzbxVar != null) {
                if (appEventListener != null) {
                    zzaziVar = new zzazi(appEventListener);
                } else {
                    zzaziVar = null;
                }
                zzbxVar.P4(zzaziVar);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void o(com.google.android.gms.ads.internal.client.zzeh zzehVar, AdLoadCallback adLoadCallback) {
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.c;
            if (zzbxVar != null) {
                zzehVar.o(this.f);
                zzbxVar.b2(this.b.a(this.a, zzehVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            adLoadCallback.a(new LoadAdError(0, "Internal Error.", MobileAds.a, null, null));
        }
    }

    public zzbmq(Context context, String str, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.e = new zzbph();
        this.f = System.currentTimeMillis();
        this.a = context;
        this.d = str;
        this.b = com.google.android.gms.ads.internal.client.zzq.a;
        this.c = zzbxVar;
    }
}
