package com.facebook.ads.redexgen.X;

import java.io.FileNotFoundException;
import java.io.IOException;
import o.C10323vs;

/* renamed from: com.facebook.ads.redexgen.X.n9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2049n9 implements FF {
    public final int A00;

    public C2049n9() {
        this(-1);
    }

    public C2049n9(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.FF
    public final int A8Z(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.FF
    public final long A8u(FE fe) {
        IOException iOException = fe.A03;
        if ((iOException instanceof C3K) || (iOException instanceof FileNotFoundException) || (iOException instanceof AM) || (iOException instanceof FP) || C04835b.A00(iOException)) {
            return C10323vs.b;
        }
        return Math.min((fe.A00 - 1) * 1000, 5000);
    }
}
