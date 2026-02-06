package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static LO A00(InterfaceC2033ms interfaceC2033ms, C04774v c04774v) throws IOException {
        interfaceC2033ms.AGt(c04774v.A0l(), 0, 8);
        c04774v.A0f(0);
        int A0C = c04774v.A0C();
        long size = c04774v.A0O();
        return new LO(A0C, size);
    }
}
