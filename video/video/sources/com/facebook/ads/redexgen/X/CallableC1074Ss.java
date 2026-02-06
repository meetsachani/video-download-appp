package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1074Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1079Sx A01;

    public CallableC1074Ss(C1079Sx c1079Sx, C1075St c1075St) {
        this.A01 = c1079Sx;
        new Handler(Looper.getMainLooper()).post(new C1676gl(this, c1079Sx, c1075St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1075St c1075St) {
        T8 t8;
        T8 t82;
        long currentTimeMillis = System.currentTimeMillis();
        t8 = this.A01.A04;
        C1604fb A06 = C1604fb.A06(t8.A02());
        Uri A00 = XB.A00(c1075St.A08);
        long j = c1075St.A00;
        if (j == -1) {
            t82 = this.A01.A04;
            j = C1123Up.A0S(t82);
        }
        A06.A0I(A00, new C1675gk(this, c1075St, j, currentTimeMillis), j);
    }
}
