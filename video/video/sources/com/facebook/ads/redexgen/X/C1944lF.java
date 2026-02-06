package com.facebook.ads.redexgen.X;

import o.C10323vs;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1944lF implements L8 {
    public C2242qI A00;
    public AnonymousClass53 A01;
    public InterfaceC0780Hd A02;

    public C1944lF(String str) {
        this.A00 = new C04212p().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC04543y.A02(this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A5A(C04774v c04774v) {
        A00();
        long A03 = this.A01.A03();
        long A04 = this.A01.A04();
        if (A03 == C10323vs.b || A04 == C10323vs.b) {
            return;
        }
        if (A04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(A04).A14();
            this.A02.A6e(this.A00);
        }
        int A07 = c04774v.A07();
        this.A02.AIr(c04774v, A07);
        this.A02.AIu(A03, 1, A07, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
        this.A01 = anonymousClass53;
        lg.A05();
        this.A02 = ha.AKS(lg.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
