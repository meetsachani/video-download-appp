package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.fY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1601fY implements Runnable {
    public final /* synthetic */ C1604fb A00;

    public RunnableC1601fY(C1604fb c1604fb) {
        this.A00 = c1604fb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            handler = this.A00.A01;
            handler.removeCallbacks(this);
            handler2 = this.A00.A01;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
