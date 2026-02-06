package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnTouchListenerC1331bA implements View.OnTouchListener {
    public final /* synthetic */ View$OnClickListenerC1332bB A00;

    public View$OnTouchListenerC1331bA(View$OnClickListenerC1332bB view$OnClickListenerC1332bB) {
        this.A00 = view$OnClickListenerC1332bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
