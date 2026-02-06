package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.5T  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C5T extends E8 {
    public final /* synthetic */ C5S A00;

    public C5T(C5S c5s) {
        this.A00 = c5s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.UN
    /* renamed from: A00 */
    public final void A03(E9 e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1471dQ(this));
    }
}
