package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC1667gc {
    public final C0650Cb A00;
    public final EnumC1672gh A01;

    public CL(C0650Cb c0650Cb, EnumC1672gh enumC1672gh) {
        this.A00 = c0650Cb;
        this.A01 = enumC1672gh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1667gc
    public void A4D(Map<InterfaceC1649gK, EnumC1672gh> map, Map<SyncModifiableBundle, EnumC1659gU> map2) {
        map.put(this.A00, this.A01);
    }
}
