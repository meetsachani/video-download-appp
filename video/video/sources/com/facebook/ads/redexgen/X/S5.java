package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.NativeAdViewTypeApi;

/* loaded from: assets/audience_network/classes2.dex */
public final class S5 implements NativeAdViewTypeApi {
    public final EnumC1138Ve A00;

    public S5(int i) {
        this.A00 = EnumC1138Ve.A00(i);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getHeight() {
        return this.A00.A04();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getValue() {
        return this.A00.A05();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getWidth() {
        return this.A00.A06();
    }
}
