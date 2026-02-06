package com.facebook.ads.redexgen.X;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C0996Pp A00;
    public final YU A01;

    public YS(C1673gi c1673gi, Executor executor, C1104Tw c1104Tw) {
        this.A01 = new YU(c1673gi);
        this.A00 = new C0996Pp(executor, c1104Tw, c1673gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1673gi c1673gi, Executor executor, C1104Tw c1104Tw) {
        if (!C1123Up.A1c(c1673gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c1673gi, executor, c1104Tw);
            A02.A00();
            return;
        }
        A02.A02(c1104Tw);
    }

    private void A02(C1104Tw c1104Tw) {
        this.A00.A07(c1104Tw);
    }
}
