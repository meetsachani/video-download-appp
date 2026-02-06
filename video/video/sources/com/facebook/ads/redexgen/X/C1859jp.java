package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1859jp implements SM {
    public final /* synthetic */ C05567w A00;

    public C1859jp(C05567w c05567w) {
        this.A00 = c05567w;
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACx() {
        AtomicBoolean atomicBoolean;
        NJ nj;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        nj = this.A00.A01;
        nj.AFm(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
