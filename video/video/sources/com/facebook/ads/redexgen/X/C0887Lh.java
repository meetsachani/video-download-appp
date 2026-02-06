package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0887Lh extends AbstractRunnableC1160Wc {
    public final WeakReference<C1618fp> A00;

    public C0887Lh(C1618fp c1618fp) {
        this.A00 = new WeakReference<>(c1618fp);
    }

    public C0887Lh(WeakReference<C1618fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C1618fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
