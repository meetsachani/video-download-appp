package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;
import o.C4114Rg;
import o.C4602Wg;
import o.ES1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzch {
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final zze d;
    @InterfaceC11300zs1
    public final Object f;
    public final int a = 1;
    public final boolean e = false;

    public zzch(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zze zzeVar, boolean z) {
        AudioFocusRequest audioFocusRequest;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        this.c = handler;
        this.d = zzeVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new zzcg(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            audioAttributes = C4114Rg.a(1).setAudioAttributes(zzeVar.a().a);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
            onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
            audioFocusRequest = onAudioFocusChangeListener2.build();
        } else {
            audioFocusRequest = null;
        }
        this.f = audioFocusRequest;
    }

    @ES1(26)
    public final AudioFocusRequest a() {
        Object obj = this.f;
        obj.getClass();
        return C4602Wg.a(obj);
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return this.b;
    }

    public final zze c() {
        return this.d;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return false;
        }
        zzch zzchVar = (zzch) obj;
        int i = zzchVar.a;
        if (Objects.equals(this.b, zzchVar.b) && Objects.equals(this.c, zzchVar.c) && Objects.equals(this.d, zzchVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(1, this.b, this.c, this.d, Boolean.FALSE);
    }
}
