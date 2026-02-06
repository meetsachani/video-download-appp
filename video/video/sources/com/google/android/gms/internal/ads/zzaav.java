package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import o.C6742hD1;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaav extends HandlerThread implements Handler.Callback {
    public zzdm X;
    public Handler Y;
    @InterfaceC11300zs1
    public RuntimeException Y0;
    @InterfaceC11300zs1
    public Error Z;
    @InterfaceC11300zs1
    public zzaax Z0;

    public zzaav() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final zzaax a(int i) {
        boolean z;
        start();
        this.Y = new Handler(getLooper(), this);
        this.X = new zzdm(this.Y, null);
        synchronized (this) {
            z = false;
            this.Y.obtainMessage(1, i, 0).sendToTarget();
            while (this.Z0 == null && this.Y0 == null && this.Z == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.Y0;
        if (runtimeException == null) {
            Error error = this.Z;
            if (error == null) {
                zzaax zzaaxVar = this.Z0;
                zzaaxVar.getClass();
                return zzaaxVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void b() {
        Handler handler = this.Y;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        zzdm zzdmVar;
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    try {
                        zzdmVar = this.X;
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    if (zzdmVar != null) {
                        zzdmVar.c();
                        return true;
                    }
                    throw null;
                }
            } else {
                try {
                    int i2 = message.arg1;
                    zzdm zzdmVar2 = this.X;
                    if (zzdmVar2 != null) {
                        zzdmVar2.b(i2);
                        SurfaceTexture a = this.X.a();
                        if (i2 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.Z0 = new zzaax(this, a, z, null);
                        synchronized (this) {
                            notify();
                        }
                    } else {
                        throw null;
                    }
                } catch (zzdn e) {
                    zzdx.d(C6742hD1.Y0, "Failed to initialize placeholder surface", e);
                    this.Y0 = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    zzdx.d(C6742hD1.Y0, "Failed to initialize placeholder surface", e2);
                    this.Z = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    zzdx.d(C6742hD1.Y0, "Failed to initialize placeholder surface", e3);
                    this.Y0 = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
