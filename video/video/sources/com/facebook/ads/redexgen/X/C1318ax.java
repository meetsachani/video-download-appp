package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.ax  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1318ax implements TC {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C1309ao A01;

    public C1318ax(C1309ao c1309ao, AdvertisingId advertisingId) {
        this.A01 = c1309ao;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.TC
    public final boolean AAX() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.TC
    public final String getId() {
        return this.A00.getId();
    }
}
