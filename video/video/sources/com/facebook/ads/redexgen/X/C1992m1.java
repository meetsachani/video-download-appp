package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.m1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1992m1 implements HY {
    public final /* synthetic */ C1991m0 A00;

    public C1992m1(C1991m0 c1991m0) {
        this.A00 = c1991m0;
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final long A7t() {
        AbstractC0829Jb abstractC0829Jb;
        long j;
        abstractC0829Jb = this.A00.A0B;
        j = this.A00.A07;
        return abstractC0829Jb.A05(j);
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final HX A91(long j) {
        AbstractC0829Jb abstractC0829Jb;
        long j2;
        long j3;
        long targetGranule;
        long targetGranule2;
        long j4;
        long j5;
        abstractC0829Jb = this.A00.A0B;
        long A06 = abstractC0829Jb.A06(j);
        j2 = this.A00.A09;
        j3 = this.A00.A08;
        targetGranule = this.A00.A09;
        targetGranule2 = this.A00.A07;
        j4 = this.A00.A09;
        j5 = this.A00.A08;
        long estimatedPosition = C5C.A0T((j2 + (((j3 - targetGranule) * A06) / targetGranule2)) - 30000, j4, j5 - 1);
        return new HX(new HZ(j, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final boolean AAj() {
        return true;
    }
}
