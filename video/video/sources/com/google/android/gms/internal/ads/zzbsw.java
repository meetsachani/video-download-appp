package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbsw extends zzbhm {
    public final /* synthetic */ zzbsy X;

    public /* synthetic */ zzbsw(zzbsy zzbsyVar, zzbsx zzbsxVar) {
        this.X = zzbsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void c4(zzbha zzbhaVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd f;
        zzbsy zzbsyVar = this.X;
        onCustomFormatAdLoadedListener = zzbsyVar.a;
        f = zzbsyVar.f(zzbhaVar);
        onCustomFormatAdLoadedListener.a(f);
    }
}
