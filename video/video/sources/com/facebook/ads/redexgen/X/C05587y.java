package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C05587y extends AbstractC1814j4 {
    public final /* synthetic */ C05567w A00;
    public final /* synthetic */ AbstractC1851jh A01;
    public final /* synthetic */ C05457l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05587y(C05567w c05567w, boolean z, boolean z2, C05457l c05457l, AbstractC1851jh abstractC1851jh) {
        super(z);
        this.A00 = c05567w;
        this.A03 = z2;
        this.A02 = c05457l;
        this.A01 = abstractC1851jh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1814j4
    public final void A00() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1814j4
    public final void A01(boolean z) {
        C1673gi c1673gi;
        WK wk;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1673gi c1673gi2;
        C1673gi c1673gi3;
        c1673gi = this.A00.A04;
        if (!C1123Up.A1t(c1673gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == WK.A0J) {
                c1673gi2 = this.A00.A04;
                c1673gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        C05567w c05567w = this.A00;
        c1673gi3 = this.A00.A04;
        c05567w.A06 = AbstractC1458dD.A01(c1673gi3, this.A02, 0, new C1860jq(this));
    }
}
