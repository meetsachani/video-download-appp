package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2069nT implements InterfaceC0837Jj {
    public final long A00;
    public final BP<C2192pT> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C2069nT(long j, BP<C2192pT> bp) {
        this.A00 = j;
        this.A01 = bp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final List<C2192pT> A7X(long j) {
        return j >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final long A83(int i) {
        AbstractC04543y.A07(i == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final int A8a(long j) {
        return this.A00 > j ? 0 : -1;
    }
}
