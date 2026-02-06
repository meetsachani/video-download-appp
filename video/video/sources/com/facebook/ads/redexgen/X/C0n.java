package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.0n  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C0n extends C0q {
    @Override // com.facebook.ads.redexgen.X.C0989Pg
    public final C1004Py A07(View view, C1004Py c1004Py) {
        WindowInsets result = (WindowInsets) C1004Py.A01(c1004Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C1004Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C0989Pg
    public final C1004Py A08(View view, C1004Py c1004Py) {
        WindowInsets result = (WindowInsets) C1004Py.A01(c1004Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C1004Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C0989Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C0989Pg
    public final void A0E(View view, PR pr) {
        if (pr == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0988Pf(this, pr));
        }
    }
}
