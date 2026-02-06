package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class VT implements View.OnTouchListener {
    public final /* synthetic */ C1157Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public VT(C1157Vz c1157Vz, boolean z, boolean z2) {
        this.A00 = c1157Vz;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1673gi c1673gi;
        if (this.A02) {
            return false;
        }
        if (!this.A01) {
            return true;
        }
        c1673gi = this.A00.A04;
        if (C1123Up.A1X(c1673gi)) {
            return false;
        }
        return true;
    }
}
