package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import o.ES1;

@ES1(api = 21)
/* loaded from: classes2.dex */
public final class zzbks extends zzbku {
    public final OnH5AdsEventListener X;

    public zzbks(OnH5AdsEventListener onH5AdsEventListener) {
        this.X = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void I(String str) {
        this.X.a(str);
    }
}
