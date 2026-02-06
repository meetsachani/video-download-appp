package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbai extends zzbap {
    @InterfaceC11300zs1
    public final AppOpenAd.AppOpenAdLoadCallback X;
    public final String Y;

    public zzbai(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.X = appOpenAdLoadCallback;
        this.Y = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void k1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.X;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.a(zzeVar.B0());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void x4(zzban zzbanVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.X;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.b(new zzbaj(zzbanVar, this.Y));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void z(int i) {
    }
}
