package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzdtj {
    public final zzbkv a;

    public zzdtj(zzbkv zzbkvVar) {
        this.a = zzbkvVar;
    }

    public final void a() throws RemoteException {
        s(new zzdth("initialize", null));
    }

    public final void b(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("interstitial", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onAdClicked";
        this.a.I(zzdth.a(zzdthVar));
    }

    public final void c(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("interstitial", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onAdClosed";
        s(zzdthVar);
    }

    public final void d(long j, int i) throws RemoteException {
        zzdth zzdthVar = new zzdth("interstitial", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onAdFailedToLoad";
        zzdthVar.d = Integer.valueOf(i);
        s(zzdthVar);
    }

    public final void e(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("interstitial", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onAdLoaded";
        s(zzdthVar);
    }

    public final void f(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("interstitial", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onNativeAdObjectNotAvailable";
        s(zzdthVar);
    }

    public final void g(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("interstitial", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onAdOpened";
        s(zzdthVar);
    }

    public final void h(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("creation", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "nativeObjectCreated";
        s(zzdthVar);
    }

    public final void i(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("creation", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "nativeObjectNotCreated";
        s(zzdthVar);
    }

    public final void j(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onAdClicked";
        s(zzdthVar);
    }

    public final void k(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onRewardedAdClosed";
        s(zzdthVar);
    }

    public final void l(long j, zzbwn zzbwnVar) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onUserEarnedReward";
        zzdthVar.e = zzbwnVar.e();
        zzdthVar.f = Integer.valueOf(zzbwnVar.d());
        s(zzdthVar);
    }

    public final void m(long j, int i) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onRewardedAdFailedToLoad";
        zzdthVar.d = Integer.valueOf(i);
        s(zzdthVar);
    }

    public final void n(long j, int i) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onRewardedAdFailedToShow";
        zzdthVar.d = Integer.valueOf(i);
        s(zzdthVar);
    }

    public final void o(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onAdImpression";
        s(zzdthVar);
    }

    public final void p(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onRewardedAdLoaded";
        s(zzdthVar);
    }

    public final void q(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onNativeAdObjectNotAvailable";
        s(zzdthVar);
    }

    public final void r(long j) throws RemoteException {
        zzdth zzdthVar = new zzdth("rewarded", null);
        zzdthVar.a = Long.valueOf(j);
        zzdthVar.c = "onRewardedAdOpened";
        s(zzdthVar);
    }

    public final void s(zzdth zzdthVar) throws RemoteException {
        String a = zzdth.a(zzdthVar);
        String concat = "Dispatching AFMA event on publisher webview: ".concat(a);
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f(concat);
        this.a.I(a);
    }
}
