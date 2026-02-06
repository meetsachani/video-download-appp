package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1863jt implements InterfaceC1071Sp {
    public final /* synthetic */ C05567w A00;

    public C1863jt(C05567w c05567w) {
        this.A00 = c05567w;
    }

    private void A00(boolean z) {
        NJ nj;
        AtomicBoolean atomicBoolean;
        NJ nj2;
        if (!z) {
            nj = this.A00.A01;
            nj.AFp(this.A00, AdError.CACHE_ERROR);
            return;
        }
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        nj2 = this.A00.A01;
        nj2.AFm(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1071Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1071Sp
    public final void ADT() {
        A00(true);
    }
}
