package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.ff  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnTouchListenerC1608ff implements View.OnTouchListener {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC0673Cz A00;

    public View$OnTouchListenerC1608ff(TextureView$SurfaceTextureListenerC0673Cz textureView$SurfaceTextureListenerC0673Cz) {
        this.A00 = textureView$SurfaceTextureListenerC0673Cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MediaController mediaController;
        MediaController mediaController2;
        MediaController mediaController3;
        MediaController mediaController4;
        mediaController = this.A00.A09;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A09;
            if (mediaController2.isShowing()) {
                mediaController4 = this.A00.A09;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A09;
                mediaController3.show();
            }
        }
        return true;
    }
}
