package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1333bC {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else if (!z) {
        } else {
            View$OnClickListenerC1332bB view$OnClickListenerC1332bB = new View$OnClickListenerC1332bB(onClickListener);
            view.setOnClickListener(view$OnClickListenerC1332bB);
            view.setOnTouchListener(new View$OnTouchListenerC1331bA(view$OnClickListenerC1332bB));
        }
    }
}
