package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnTouchListenerC1523eH implements View.OnTouchListener {
    public final /* synthetic */ C1524eI A00;

    public View$OnTouchListenerC1523eH(C1524eI c1524eI) {
        this.A00 = c1524eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VA va;
        AbstractC1847jd abstractC1847jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1524eI.A00(this.A00);
            va = this.A00.A06;
            abstractC1847jd = this.A00.A03;
            va.ABp(abstractC1847jd.A2E(), new C1330b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
