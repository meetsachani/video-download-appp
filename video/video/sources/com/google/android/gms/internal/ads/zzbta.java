package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class zzbta extends zzbht {
    public final NativeAd.OnNativeAdLoadedListener X;

    public zzbta(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.X = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhu
    public final void j5(zzbia zzbiaVar) {
        this.X.a(new zzbsu(zzbiaVar));
    }
}
