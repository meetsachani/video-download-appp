package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1716hP extends WP {
    public final /* synthetic */ C1713hM A00;

    public C1716hP(C1713hM c1713hM) {
        this.A00 = c1713hM;
    }

    @Override // com.facebook.ads.redexgen.X.WP
    public final void A01() {
        C1034Rd c1034Rd;
        C1034Rd c1034Rd2;
        C1034Rd c1034Rd3;
        c1034Rd = this.A00.A01;
        if (c1034Rd.A06() != null) {
            c1034Rd2 = this.A00.A01;
            AdListener A06 = c1034Rd2.A06();
            c1034Rd3 = this.A00.A01;
            A06.onAdLoaded(c1034Rd3.A07());
        }
    }
}
