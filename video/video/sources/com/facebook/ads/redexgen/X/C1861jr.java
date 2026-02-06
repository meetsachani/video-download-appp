package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1861jr implements SM {
    public final /* synthetic */ C05567w A00;
    public final /* synthetic */ boolean A01;

    public C1861jr(C05567w c05567w, boolean z) {
        this.A00 = c05567w;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACx() {
        C1673gi c1673gi;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1673gi c1673gi2;
        NQ nq;
        c1673gi = this.A00.A04;
        if (!C1123Up.A1t(c1673gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        C05567w c05567w = this.A00;
        c1673gi2 = this.A00.A04;
        nq = this.A00.A03;
        c05567w.A06 = AbstractC1458dD.A01(c1673gi2, (C05457l) nq, 0, new C1862js(this));
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
