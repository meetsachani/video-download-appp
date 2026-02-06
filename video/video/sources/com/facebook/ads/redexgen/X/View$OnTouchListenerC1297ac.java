package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ac  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnTouchListenerC1297ac implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        switch (motionEvent.getAction()) {
            case 0:
                i = M6.A0K;
                YB.A0N(view, i);
                break;
            case 1:
                YB.A0N(view, 0);
                break;
        }
        return false;
    }
}
