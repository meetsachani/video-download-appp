package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.aV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnAttachStateChangeListenerC1290aV implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C1291aW A00;

    public View$OnAttachStateChangeListenerC1290aV(C1291aW c1291aW) {
        this.A00 = c1291aW;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ImageView imageView;
        this.A00.A09();
        imageView = this.A00.A03;
        imageView.setOnClickListener(null);
    }
}
