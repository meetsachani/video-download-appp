package com.facebook.ads.redexgen.X;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1606fd implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC0673Cz A00;

    public C1606fd(TextureView$SurfaceTextureListenerC0673Cz textureView$SurfaceTextureListenerC0673Cz) {
        this.A00 = textureView$SurfaceTextureListenerC0673Cz;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C1600fX c1600fX;
        C1600fX c1600fX2;
        c1600fX = this.A00.A0C;
        if (c1600fX != null) {
            c1600fX2 = this.A00.A0C;
            return c1600fX2.A04();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1600fX c1600fX;
        C1600fX c1600fX2;
        c1600fX = this.A00.A0C;
        if (c1600fX != null) {
            c1600fX2 = this.A00.A0C;
            return c1600fX2.A05();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C1600fX c1600fX;
        C1600fX c1600fX2;
        c1600fX = this.A00.A0C;
        if (c1600fX != null) {
            c1600fX2 = this.A00.A0C;
            if (c1600fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1616fn interfaceC1616fn;
        InterfaceC1616fn interfaceC1616fn2;
        interfaceC1616fn = this.A00.A0F;
        if (interfaceC1616fn != null) {
            interfaceC1616fn2 = this.A00.A0F;
            interfaceC1616fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1616fn interfaceC1616fn;
        InterfaceC1616fn interfaceC1616fn2;
        interfaceC1616fn = this.A00.A0F;
        if (interfaceC1616fn != null) {
            interfaceC1616fn2 = this.A00.A0F;
            interfaceC1616fn2.AEp();
        }
    }
}
