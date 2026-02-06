package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1250Zr implements View.OnClickListener {
    public final /* synthetic */ C0967Ok A00;
    public final /* synthetic */ C1240Zh A01;
    public final /* synthetic */ MD A02;

    public View$OnClickListenerC1250Zr(MD md, C1240Zh c1240Zh, C0967Ok c0967Ok) {
        this.A02 = md;
        this.A01 = c1240Zh;
        this.A00 = c0967Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
