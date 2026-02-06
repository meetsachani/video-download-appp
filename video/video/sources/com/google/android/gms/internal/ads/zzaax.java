package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class zzaax extends Surface {
    public static int Y0;
    public static boolean Z0;
    public final boolean X;
    public final zzaav Y;
    public boolean Z;

    public /* synthetic */ zzaax(zzaav zzaavVar, SurfaceTexture surfaceTexture, boolean z, zzaaw zzaawVar) {
        super(surfaceTexture);
        this.Y = zzaavVar;
        this.X = z;
    }

    public static zzaax a(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !b(context)) {
            z2 = false;
        }
        zzdc.f(z2);
        zzaav zzaavVar = new zzaav();
        if (z) {
            i = Y0;
        }
        return zzaavVar.a(i);
    }

    public static synchronized boolean b(Context context) {
        int i;
        int i2;
        synchronized (zzaax.class) {
            try {
                if (!Z0) {
                    if (zzdo.d(context)) {
                        if (zzdo.e()) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        i2 = 0;
                    }
                    Y0 = i2;
                    Z0 = true;
                }
                i = Y0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzaav zzaavVar = this.Y;
        synchronized (zzaavVar) {
            try {
                if (!this.Z) {
                    zzaavVar.b();
                    this.Z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
