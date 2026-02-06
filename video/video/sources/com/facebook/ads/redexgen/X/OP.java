package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {
    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C1669ge c1669ge) {
        if (A00 == null) {
            A00 = new OO(c1669ge);
        }
        return A00;
    }

    public static void A01(C1669ge c1669ge) {
        if (AbstractC1126Us.A0F(c1669ge)) {
            A03(c1669ge);
        }
    }

    public static void A02(C1669ge c1669ge) {
        if (AbstractC1126Us.A0E(c1669ge)) {
            A03(c1669ge);
        }
    }

    public static void A03(C1669ge c1669ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C1772iN(c1669ge));
        }
    }
}
