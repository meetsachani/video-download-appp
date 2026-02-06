package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* loaded from: classes2.dex */
final class zzbii implements Runnable {
    public final /* synthetic */ AdManagerAdView X;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx Y;
    public final /* synthetic */ zzbij Z;

    public zzbii(zzbij zzbijVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.X = adManagerAdView;
        this.Y = zzbxVar;
        this.Z = zzbijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        AdManagerAdView adManagerAdView = this.X;
        if (adManagerAdView.j(this.Y)) {
            onAdManagerAdViewLoadedListener = this.Z.X;
            onAdManagerAdViewLoadedListener.a(adManagerAdView);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.g("Could not bind.");
    }
}
