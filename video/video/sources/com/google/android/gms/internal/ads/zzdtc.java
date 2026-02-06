package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;
import o.InterfaceC5940dy1;

/* loaded from: classes2.dex */
public final class zzdtc implements AppEventListener, zzcyv, com.google.android.gms.ads.internal.client.zza, zzcvt, zzcwn, zzcwo, zzcxh, zzcvw, zzfgu {
    public final List X;
    public final zzdsq Y;
    public long Z;

    public zzdtc(zzdsq zzdsqVar, zzchb zzchbVar) {
        this.Y = zzdsqVar;
        this.X = Collections.singletonList(zzchbVar);
    }

    public final void B(Class cls, String str, Object... objArr) {
        this.Y.a(this.X, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        B(zzcvw.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.X), zzeVar.Y, zzeVar.Z);
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
        this.Z = com.google.android.gms.ads.internal.zzv.d().b();
        B(zzcyv.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void a() {
        B(zzcvt.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void b() {
        B(zzcvt.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void c() {
        B(zzcvt.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void d() {
        B(zzcvt.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void e() {
        B(zzcvt.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void g(zzfgn zzfgnVar, String str) {
        B(zzfgm.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void h(zzfgn zzfgnVar, String str) {
        B(zzfgm.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    @InterfaceC5940dy1
    public final void k(zzbvx zzbvxVar, String str, String str2) {
        B(zzcvt.class, "onRewarded", zzbvxVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void n(zzfgn zzfgnVar, String str) {
        B(zzfgm.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void q(zzfgn zzfgnVar, String str, Throwable th) {
        B(zzfgm.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        B(zzcwn.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void t(Context context) {
        B(zzcwo.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void u(String str, String str2) {
        B(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        long b = com.google.android.gms.ads.internal.zzv.d().b() - this.Z;
        com.google.android.gms.ads.internal.util.zze.k("Ad Request Latency : " + b);
        B(zzcxh.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void w(Context context) {
        B(zzcwo.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void x(Context context) {
        B(zzcwo.class, "onResume", context);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void y() {
        B(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }
}
