package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.nm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2088nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C05939p A01;

    public C2088nm(C05939p c05939p, int i) {
        this.A01 = c05939p;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        return C05939p.A0W(this.A01)[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final int AHP(C05336z c05336z, C2163p0 c2163p0, int i) {
        return this.A01.A0Y(this.A00, c05336z, c2163p0, i);
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final int AK2(long j) {
        return this.A01.A0X(this.A00, j);
    }
}
