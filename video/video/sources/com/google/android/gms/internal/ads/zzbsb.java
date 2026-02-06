package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes2.dex */
final class zzbsb implements com.google.android.gms.ads.internal.overlay.zzr {
    public final /* synthetic */ zzbsd X;

    public zzbsb(zzbsd zzbsdVar) {
        this.X = zzbsdVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void S7() {
        com.google.android.gms.ads.internal.util.client.zzo.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
        com.google.android.gms.ads.internal.util.client.zzo.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void h5(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzo.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbsd zzbsdVar = this.X;
        mediationInterstitialListener = zzbsdVar.b;
        mediationInterstitialListener.x(zzbsdVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void o1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void r4() {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzo.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbsd zzbsdVar = this.X;
        mediationInterstitialListener = zzbsdVar.b;
        mediationInterstitialListener.z(zzbsdVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void s7() {
        com.google.android.gms.ads.internal.util.client.zzo.b("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
