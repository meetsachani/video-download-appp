package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class zzbtb extends zzbhw {
    public final NativeAd.UnconfirmedClickListener X;

    public zzbtb(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.X = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhx
    public final void S(String str) {
        this.X.a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhx
    public final void d() {
        this.X.b();
    }
}
