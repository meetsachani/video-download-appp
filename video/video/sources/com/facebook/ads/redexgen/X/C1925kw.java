package com.facebook.ads.redexgen.X;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.kw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1925kw implements LU<File> {
    @Override // com.facebook.ads.redexgen.X.LU
    public final LT<File> A3x(File file, InterfaceC0892Lm interfaceC0892Lm) {
        if (file.exists()) {
            return new LT<>(true, file);
        }
        return new LT<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.X.LU
    public final void A5D(File file, InterfaceC0892Lm interfaceC0892Lm) {
    }
}
