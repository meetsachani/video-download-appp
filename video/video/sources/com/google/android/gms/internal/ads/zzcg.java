package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class zzcg implements AudioManager.OnAudioFocusChangeListener {
    public final Handler X;
    public final AudioManager.OnAudioFocusChangeListener Y;

    public zzcg(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.Y = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = zzeu.a;
        this.X = new Handler(looper, null);
    }

    public static /* synthetic */ void a(zzcg zzcgVar, int i) {
        zzcgVar.Y.onAudioFocusChange(i);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        zzeu.p(this.X, new Runnable() { // from class: com.google.android.gms.internal.ads.zzcf
            @Override // java.lang.Runnable
            public final void run() {
                zzcg.a(zzcg.this, i);
            }
        });
    }
}
