package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* loaded from: classes2.dex */
public final class zzdd extends zzdb {
    public final MuteThisAdListener X;

    public zzdd(MuteThisAdListener muteThisAdListener) {
        this.X = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdc
    public final void d() {
        this.X.a();
    }
}
