package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Locale;
import o.InterfaceC11300zs1;
import o.RunnableC6482g90;

/* loaded from: classes2.dex */
public final class zzdm implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] b1 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler X;
    public final int[] Y = new int[1];
    @InterfaceC11300zs1
    public EGLContext Y0;
    @InterfaceC11300zs1
    public EGLDisplay Z;
    @InterfaceC11300zs1
    public EGLSurface Z0;
    @InterfaceC11300zs1
    public SurfaceTexture a1;

    public zzdm(Handler handler, @InterfaceC11300zs1 zzdl zzdlVar) {
        this.X = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.a1;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b(int i) throws zzdn {
        boolean z;
        boolean z2;
        boolean z3;
        EGLSurface eglCreatePbufferSurface;
        boolean z4;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z = true;
        } else {
            z = false;
        }
        zzdo.a(z, "eglGetDisplay failed");
        int[] iArr = new int[2];
        zzdo.a(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.Z = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, b1, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        String str = zzeu.a;
        zzdo.a(z2, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.Z, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, RunnableC6482g90.i1, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzdo.a(z3, "eglCreateContext failed");
        this.Y0 = eglCreateContext;
        EGLDisplay eGLDisplay = this.Z;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, RunnableC6482g90.i1, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            zzdo.a(z4, "eglCreatePbufferSurface failed");
        }
        zzdo.a(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
        this.Z0 = eglCreatePbufferSurface;
        int[] iArr3 = this.Y;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z5 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z5) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z5 = true;
        }
        if (!z5) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            this.a1 = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            return;
        }
        throw new zzdn(sb.toString());
    }

    public final void c() {
        this.X.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.a1;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.Y, 0);
            }
            EGLDisplay eGLDisplay = this.Z;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.Z;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.Z0;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.Z, this.Z0);
            }
            EGLContext eGLContext = this.Y0;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.Z, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.Z;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.Z);
            }
            this.Z = null;
            this.Y0 = null;
            this.Z0 = null;
            this.a1 = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.Z;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.Z;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.Z0;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.Z, this.Z0);
            }
            EGLContext eGLContext2 = this.Y0;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.Z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.Z;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.Z);
            }
            this.Z = null;
            this.Y0 = null;
            this.Z0 = null;
            this.a1 = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.X.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.a1;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
