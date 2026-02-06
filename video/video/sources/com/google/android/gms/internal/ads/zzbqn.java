package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbqn extends zzbpt {
    public final MediationInterscrollerAd X;

    public zzbqn(MediationInterscrollerAd mediationInterscrollerAd) {
        this.X = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final IObjectWrapper d() {
        return ObjectWrapper.V3(this.X.a());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final boolean e() {
        return this.X.b();
    }
}
