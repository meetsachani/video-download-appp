package com.facebook.ads.redexgen.X;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0704Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C0705Ef A00;
    public final /* synthetic */ C05879h A01;

    public C0704Ee(C0705Ef c0705Ef, C05879h c05879h) {
        this.A00 = c0705Ef;
        this.A01 = c05879h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
