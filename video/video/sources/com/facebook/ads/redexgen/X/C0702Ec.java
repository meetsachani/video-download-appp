package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ec  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0702Ec implements Comparable<C0702Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0702Ec(C2242qI c2242qI, int i) {
        this.A00 = (c2242qI.A0H & 1) != 0;
        this.A01 = C05879h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C0702Ec c0702Ec) {
        return AbstractC2094ns.A01().A09(this.A01, c0702Ec.A01).A09(this.A00, c0702Ec.A00).A05();
    }
}
