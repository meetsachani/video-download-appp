package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import o.C10323vs;
import o.C6755hG2;

/* loaded from: classes2.dex */
final class zzabo implements Choreographer.FrameCallback, Handler.Callback {
    public static final zzabo a1 = new zzabo();
    public volatile long X = C10323vs.b;
    public final Handler Y;
    public Choreographer Y0;
    public final HandlerThread Z;
    public int Z0;

    private zzabo() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.Z = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = zzeu.a;
        Handler handler = new Handler(looper, this);
        this.Y = handler;
        handler.sendEmptyMessage(1);
    }

    public static zzabo a() {
        return a1;
    }

    public final void b() {
        this.Y.sendEmptyMessage(2);
    }

    public final void c() {
        this.Y.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.X = j;
        Choreographer choreographer = this.Y0;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Choreographer choreographer = this.Y0;
                if (choreographer != null) {
                    int i2 = this.Z0 - 1;
                    this.Z0 = i2;
                    if (i2 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.X = C10323vs.b;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.Y0;
            if (choreographer2 != null) {
                int i3 = this.Z0 + 1;
                this.Z0 = i3;
                if (i3 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.Y0 = Choreographer.getInstance();
        } catch (RuntimeException e) {
            zzdx.g(C6755hG2.r, "Vsync sampling disabled due to platform error", e);
        }
        return true;
    }
}
