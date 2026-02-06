package com.facebook.ads.redexgen.X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.en  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1554en extends ViewOutlineProvider {
    public final /* synthetic */ C1557eq A00;

    public C1554en(C1557eq c1557eq) {
        this.A00 = c1557eq;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 8.0f);
    }
}
