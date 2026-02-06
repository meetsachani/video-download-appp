package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnTouchListenerC1548eh implements View.OnTouchListener {
    public final /* synthetic */ C0710Ek A00;

    public View$OnTouchListenerC1548eh(C0710Ek c0710Ek) {
        this.A00 = c0710Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        UM um;
        um = this.A00.A0C;
        um.A02(new C0694Du(view, motionEvent));
        return false;
    }
}
