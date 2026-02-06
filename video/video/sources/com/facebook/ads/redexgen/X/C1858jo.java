package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1858jo implements O3 {
    public final /* synthetic */ C05567w A00;

    public C1858jo(C05567w c05567w) {
        this.A00 = c05567w;
    }

    @Override // com.facebook.ads.redexgen.X.O3
    public final void AFF(AdError adError) {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.O3
    public final void AFG() {
        AtomicBoolean atomicBoolean;
        NJ nj;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        nj = this.A00.A01;
        nj.AFm(this.A00);
    }
}
