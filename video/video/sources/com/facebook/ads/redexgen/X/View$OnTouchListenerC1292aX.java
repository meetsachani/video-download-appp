package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aX  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnTouchListenerC1292aX implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        switch (motionEvent.getAction()) {
            case 0:
                i = M8.A0G;
                YB.A0N(view, i);
                break;
            case 1:
                YB.A0N(view, 0);
                break;
        }
        return false;
    }
}
