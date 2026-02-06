package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.la  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1965la implements InterfaceC0837Jj {
    public final List<C2192pT> A00;

    public C1965la(List<C2192pT> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final List<C2192pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final long A83(int i) {
        AbstractC04543y.A07(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
