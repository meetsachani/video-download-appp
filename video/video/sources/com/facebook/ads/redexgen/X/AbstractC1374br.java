package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.br  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1374br {
    public static final int A00 = YB.A00();

    public static void A00(C1673gi c1673gi, ViewGroup viewGroup, String str) {
        new LM(viewGroup, c1673gi).A07(str);
        View view = new View(c1673gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        YB.A0U(view, c1673gi);
        viewGroup.addView(view, 0);
    }
}
