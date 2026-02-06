package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzbaj extends AppOpenAd {
    public final zzban a;
    @InterfaceC5670cr1
    public volatile String b;
    public final zzbak c = new zzbak();
    @InterfaceC11300zs1
    public FullScreenContentCallback d;
    @InterfaceC11300zs1
    public OnPaidEventListener e;

    public zzbaj(zzban zzbanVar, String str) {
        this.a = zzbanVar;
        this.b = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String a() {
        String str;
        if (this.b != null && !this.b.isEmpty()) {
            return this.b;
        }
        synchronized (this) {
            try {
                String g = this.a.g();
                if (g != null && !g.isEmpty()) {
                    this.b = g;
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
            str = this.b;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @InterfaceC11300zs1
    public final FullScreenContentCallback b() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @InterfaceC11300zs1
    public final OnPaidEventListener c() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @InterfaceC5670cr1
    public final ResponseInfo d() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.a.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            zzdxVar = null;
        }
        return ResponseInfo.g(zzdxVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void h(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback) {
        this.d = fullScreenContentCallback;
        this.c.W7(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void i(boolean z) {
        try {
            this.a.j3(z);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void j(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener) {
        this.e = onPaidEventListener;
        try {
            this.a.j4(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void k(@InterfaceC5670cr1 Activity activity) {
        try {
            this.a.k5(ObjectWrapper.V3(activity), this.c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }
}
