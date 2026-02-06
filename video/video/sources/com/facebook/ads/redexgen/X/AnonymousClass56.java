package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.56  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class AnonymousClass56 extends E8 {
    public final /* synthetic */ AnonymousClass55 A00;

    public AnonymousClass56(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.UN
    /* renamed from: A00 */
    public final void A03(E9 e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1488dh(this));
    }
}
