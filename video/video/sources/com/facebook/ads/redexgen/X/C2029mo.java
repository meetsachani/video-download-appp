package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.mo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2029mo implements HY {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public C2029mo(long[] jArr, long[] jArr2, long j) {
        AbstractC04543y.A07(jArr.length == jArr2.length);
        int length = jArr2.length;
        this.A01 = length > 0;
        if (this.A01) {
            int length2 = (jArr2[0] > 0L ? 1 : (jArr2[0] == 0L ? 0 : -1));
            if (length2 > 0) {
                int length3 = length + 1;
                this.A02 = new long[length3];
                int length4 = length + 1;
                this.A03 = new long[length4];
                System.arraycopy(jArr, 0, this.A02, 1, length);
                System.arraycopy(jArr2, 0, this.A03, 1, length);
                this.A00 = j;
            }
        }
        this.A02 = jArr;
        this.A03 = jArr2;
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final HX A91(long j) {
        if (!this.A01) {
            return new HX(HZ.A04);
        }
        int A0L = C5C.A0L(this.A03, j, true, true);
        HZ hz = new HZ(this.A03[A0L], this.A02[A0L]);
        int targetIndex = (hz.A01 > j ? 1 : (hz.A01 == j ? 0 : -1));
        if (targetIndex != 0) {
            int targetIndex2 = this.A03.length;
            if (A0L != targetIndex2 - 1) {
                int targetIndex3 = A0L + 1;
                long j2 = this.A03[targetIndex3];
                int targetIndex4 = A0L + 1;
                HZ rightSeekPoint = new HZ(j2, this.A02[targetIndex4]);
                return new HX(hz, rightSeekPoint);
            }
        }
        return new HX(hz);
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final boolean AAj() {
        return this.A01;
    }
}
