package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC1667gc {
    public final EnumC1659gU A00;
    public final AbstractC04112d A01;

    public CM(AbstractC04112d abstractC04112d, EnumC1659gU enumC1659gU) {
        this.A01 = abstractC04112d;
        this.A00 = enumC1659gU;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1667gc
    public void A4D(Map<InterfaceC1649gK, EnumC1672gh> map, Map<SyncModifiableBundle, EnumC1659gU> map2) {
        map2.put(null, this.A00);
    }
}
