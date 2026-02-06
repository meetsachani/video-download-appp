package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* renamed from: com.facebook.ads.redexgen.X.Tz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1107Tz implements AdSizeApi {
    public final /* synthetic */ DynamicLoaderImpl A00;
    public final /* synthetic */ EnumC1147Vp A01;

    public C1107Tz(DynamicLoaderImpl dynamicLoaderImpl, EnumC1147Vp enumC1147Vp) {
        this.A00 = dynamicLoaderImpl;
        this.A01 = enumC1147Vp;
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getHeight() {
        return this.A01.A03();
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getWidth() {
        return this.A01.A04();
    }
}
