package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1517eB implements WS {
    @Override // com.facebook.ads.redexgen.X.WS
    public final void AIZ(Throwable th, Object obj) {
        if (obj instanceof T4) {
            C1673gi adContext = ((T4) obj).A6m();
            if (adContext != null) {
                adContext.A0Q(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C1673gi)) {
                return;
            }
            ((C1673gi) context).A0Q(th);
        }
    }
}
