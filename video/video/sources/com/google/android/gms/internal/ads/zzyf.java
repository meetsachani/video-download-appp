package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes2.dex */
final class zzyf implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ zzyo a;

    public zzyf(zzyg zzygVar, zzyo zzyoVar) {
        this.a = zzyoVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        zzyo.q(this.a);
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        zzyo.q(this.a);
    }
}
