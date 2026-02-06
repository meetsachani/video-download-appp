package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzce {
    @InterfaceC11300zs1
    public AudioManager.OnAudioFocusChangeListener a;
    @InterfaceC11300zs1
    public Handler b;
    public zze c = zze.b;

    public zzce(int i) {
    }

    public final zzce a(zze zzeVar) {
        this.c = zzeVar;
        return this;
    }

    public final zzce b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.a = onAudioFocusChangeListener;
        this.b = handler;
        return this;
    }

    public final zzch c() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.a;
        if (onAudioFocusChangeListener != null) {
            Handler handler = this.b;
            handler.getClass();
            return new zzch(1, onAudioFocusChangeListener, handler, this.c, false);
        }
        throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
    }
}
