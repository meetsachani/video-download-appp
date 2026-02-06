package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network/classes2.dex */
public class LQ extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C1327b6 A00;

    public LQ(C1327b6 c1327b6) {
        this.A00 = c1327b6;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (!z) {
            return;
        }
        handler = this.A00.A0D;
        runnable = this.A00.A0F;
        handler.postDelayed(runnable, 250L);
    }
}
