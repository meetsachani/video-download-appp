package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes2.dex */
public final class zzcca implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager X;
    public final zzcbz Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public float a1 = 1.0f;

    public zzcca(Context context, zzcbz zzcbzVar) {
        this.X = (AudioManager) context.getSystemService("audio");
        this.Y = zzcbzVar;
    }

    public final float a() {
        float f = this.Z0 ? 0.0f : this.a1;
        if (this.Z) {
            return f;
        }
        return 0.0f;
    }

    public final void b() {
        this.Y0 = true;
        f();
    }

    public final void c() {
        this.Y0 = false;
        f();
    }

    public final void d(boolean z) {
        this.Z0 = z;
        f();
    }

    public final void e(float f) {
        this.a1 = f;
        f();
    }

    public final void f() {
        boolean z = false;
        if (this.Y0 && !this.Z0 && this.a1 > 0.0f) {
            if (!this.Z) {
                AudioManager audioManager = this.X;
                if (audioManager != null) {
                    if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                        z = true;
                    }
                    this.Z = z;
                }
                this.Y.n();
            }
        } else if (this.Z) {
            AudioManager audioManager2 = this.X;
            if (audioManager2 != null) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z = true;
                }
                this.Z = z;
            }
            this.Y.n();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.Z = z;
        this.Y.n();
    }
}
