package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.eD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1519eD extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C1669ge A00;

    public C1519eD(C1669ge c1669ge) {
        this.A00 = c1669ge;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
