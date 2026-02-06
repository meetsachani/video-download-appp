package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes2.dex */
final class zzbsc implements Runnable {
    public final /* synthetic */ AdOverlayInfoParcel X;
    public final /* synthetic */ zzbsd Y;

    public zzbsc(zzbsd zzbsdVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.X = adOverlayInfoParcel;
        this.Y = zzbsdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzv.n();
        activity = this.Y.a;
        com.google.android.gms.ads.internal.overlay.zzn.a(activity, this.X, true, null);
    }
}
