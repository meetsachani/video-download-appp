package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes2.dex */
public final class zzab {
    public boolean a = false;
    public float b = 1.0f;

    public static float b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume != 0) {
                return streamVolume / streamMaxVolume;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final synchronized float a() {
        if (f()) {
            return this.b;
        }
        return 1.0f;
    }

    public final synchronized void c(boolean z) {
        this.a = z;
    }

    public final synchronized void d(float f) {
        this.b = f;
    }

    public final synchronized boolean e() {
        return this.a;
    }

    public final synchronized boolean f() {
        return this.b >= 0.0f;
    }
}
