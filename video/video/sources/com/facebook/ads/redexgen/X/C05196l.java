package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.6l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05196l implements Comparable<C05196l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C05377d A03;

    public C05196l(C05377d c05377d) {
        this.A03 = c05377d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C05196l c05196l) {
        if ((this.A02 == null) != (c05196l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        } else if (this.A02 == null) {
            return 0;
        } else {
            int i = this.A00 - c05196l.A00;
            if (i != 0) {
                return i;
            }
            int comparePeriodIndex = C5C.A08(this.A01, c05196l.A01);
            return comparePeriodIndex;
        }
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
