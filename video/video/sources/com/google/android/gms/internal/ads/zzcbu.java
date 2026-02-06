package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import androidx.work.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzcbu extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcbs {
    public static final float[] w1 = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public final zzcbt X;
    public final float[] Y;
    public final float[] Y0;
    public final float[] Z;
    public final float[] Z0;
    public final float[] a1;
    public final float[] b1;
    public final float[] c1;
    public float d1;
    public float e1;
    public float f1;
    public int g1;
    public int h1;
    public SurfaceTexture i1;
    public SurfaceTexture j1;
    public int k1;
    public int l1;
    public int m1;
    public final FloatBuffer n1;
    public final CountDownLatch o1;
    public final Object p1;
    public EGL10 q1;
    public EGLDisplay r1;
    public EGLContext s1;
    public EGLSurface t1;
    public volatile boolean u1;
    public volatile boolean v1;

    public zzcbu(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = w1;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.n1 = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.Y = new float[9];
        this.Z = new float[9];
        this.Y0 = new float[9];
        this.Z0 = new float[9];
        this.a1 = new float[9];
        this.b1 = new float[9];
        this.c1 = new float[9];
        this.d1 = Float.NaN;
        zzcbt zzcbtVar = new zzcbt(context);
        this.X = zzcbtVar;
        zzcbtVar.b(this);
        this.o1 = new CountDownLatch(1);
        this.p1 = new Object();
    }

    public static final void h(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    public static final void i(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[1];
        float f2 = fArr3[3];
        float f3 = fArr2[2];
        float f4 = fArr3[6];
        fArr[0] = (fArr2[0] * fArr3[0]) + (f * f2) + (f3 * f4);
        float f5 = fArr2[0];
        float f6 = fArr3[4];
        float f7 = fArr3[7];
        fArr[1] = (fArr3[1] * f5) + (f * f6) + (f3 * f7);
        float f8 = f5 * fArr3[2];
        float f9 = fArr2[1];
        float f10 = fArr3[5];
        float f11 = fArr3[8];
        fArr[2] = f8 + (f9 * f10) + (f3 * f11);
        float f12 = fArr2[3];
        float f13 = fArr3[0];
        float f14 = fArr2[4];
        float f15 = fArr2[5];
        fArr[3] = (f12 * f13) + (f2 * f14) + (f15 * f4);
        float f16 = fArr2[3];
        float f17 = fArr3[1];
        fArr[4] = (f16 * f17) + (f14 * f6) + (f15 * f7);
        float f18 = fArr3[2];
        fArr[5] = (f16 * f18) + (fArr2[4] * f10) + (f15 * f11);
        float f19 = fArr2[6] * f13;
        float f20 = fArr2[7];
        float f21 = fArr2[8];
        fArr[6] = f19 + (fArr3[3] * f20) + (f4 * f21);
        float f22 = fArr2[6];
        fArr[7] = (f17 * f22) + (f20 * fArr3[4]) + (f7 * f21);
        fArr[8] = (f22 * f18) + (fArr2[7] * fArr3[5]) + (f21 * f11);
    }

    public static final void j(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void k(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int l(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        h("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            h("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            h("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            h("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                h("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void a() {
        Object obj = this.p1;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @InterfaceC11300zs1
    public final SurfaceTexture b() {
        if (this.j1 == null) {
            return null;
        }
        try {
            this.o1.await();
        } catch (InterruptedException unused) {
        }
        return this.i1;
    }

    public final void c(int i, int i2) {
        Object obj = this.p1;
        synchronized (obj) {
            this.h1 = i;
            this.g1 = i2;
            this.u1 = true;
            obj.notifyAll();
        }
    }

    public final void d(SurfaceTexture surfaceTexture, int i, int i2) {
        this.h1 = i;
        this.g1 = i2;
        this.j1 = surfaceTexture;
    }

    public final void e() {
        Object obj = this.p1;
        synchronized (obj) {
            this.v1 = true;
            this.j1 = null;
            obj.notifyAll();
        }
    }

    public final void f(float f, float f2) {
        int i = this.h1;
        int i2 = this.g1;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.e1 -= (f * 1.7453293f) / f3;
        float f4 = this.f1 - ((f2 * 1.7453293f) / f3);
        this.f1 = f4;
        if (f4 < -1.5707964f) {
            this.f1 = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f1 = 1.5707964f;
        }
    }

    @InterfaceC5056aJ2
    public final boolean g() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.t1;
        boolean z = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z = this.q1.eglDestroySurface(this.r1, this.t1) | this.q1.eglMakeCurrent(this.r1, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.t1 = null;
        }
        EGLContext eGLContext = this.s1;
        if (eGLContext != null) {
            z |= this.q1.eglDestroyContext(this.r1, eGLContext);
            this.s1 = null;
        }
        EGLDisplay eGLDisplay = this.r1;
        if (eGLDisplay != null) {
            boolean eglTerminate = this.q1.eglTerminate(eGLDisplay) | z;
            this.r1 = null;
            return eglTerminate;
        }
        return z;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.m1++;
        Object obj = this.p1;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01be A[ADDED_TO_REGION] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        EGLConfig eGLConfig;
        boolean z;
        zzbcm zzbcmVar;
        String str;
        int l;
        String str2;
        int glCreateProgram;
        if (this.j1 != null) {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.q1 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.r1 = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY && this.q1.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.q1.eglChooseConfig(this.r1, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) || iArr[0] <= 0) {
                    eGLConfig = null;
                } else {
                    eGLConfig = eGLConfigArr[0];
                }
                if (eGLConfig != null) {
                    EGL10 egl102 = this.q1;
                    EGLDisplay eGLDisplay = this.r1;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    this.s1 = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != eGLContext) {
                        EGLSurface eglCreateWindowSurface = this.q1.eglCreateWindowSurface(this.r1, eGLConfig, this.j1, null);
                        this.t1 = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.q1.eglMakeCurrent(this.r1, eglCreateWindowSurface, eglCreateWindowSurface, this.s1)) {
                            z = true;
                            zzbcmVar = zzbcv.w1;
                            if (((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).equals(zzbcmVar.k())) {
                                str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar);
                            } else {
                                str = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
                            }
                            l = l(35633, str);
                            if (l != 0) {
                                zzbcm zzbcmVar2 = zzbcv.x1;
                                if (!((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar2)).equals(zzbcmVar2.k())) {
                                    str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar2);
                                } else {
                                    str2 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
                                }
                                int l2 = l(35632, str2);
                                if (l2 != 0) {
                                    glCreateProgram = GLES20.glCreateProgram();
                                    h("createProgram");
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, l);
                                        h("attachShader");
                                        GLES20.glAttachShader(glCreateProgram, l2);
                                        h("attachShader");
                                        GLES20.glLinkProgram(glCreateProgram);
                                        h("linkProgram");
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                        h("getProgramiv");
                                        if (iArr2[0] != 1) {
                                            Log.e("SphericalVideoRenderer", "Could not link program: ");
                                            Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                                            GLES20.glDeleteProgram(glCreateProgram);
                                            h("deleteProgram");
                                        } else {
                                            GLES20.glValidateProgram(glCreateProgram);
                                            h("validateProgram");
                                        }
                                    }
                                    this.k1 = glCreateProgram;
                                    GLES20.glUseProgram(glCreateProgram);
                                    h("useProgram");
                                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.k1, "aPosition");
                                    GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.n1);
                                    h("vertexAttribPointer");
                                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                    h("enableVertexAttribArray");
                                    int[] iArr3 = new int[1];
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    h("genTextures");
                                    int i = iArr3[0];
                                    GLES20.glBindTexture(36197, i);
                                    h("bindTextures");
                                    GLES20.glTexParameteri(36197, b.d, 9729);
                                    h("texParameteri");
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    h("texParameteri");
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    h("texParameteri");
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    h("texParameteri");
                                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.k1, "uVMat");
                                    this.l1 = glGetUniformLocation;
                                    GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                    int i2 = this.k1;
                                    if (!z && i2 != 0) {
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
                                        this.i1 = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(this);
                                        this.o1.countDown();
                                        zzcbt zzcbtVar = this.X;
                                        zzcbtVar.c();
                                        try {
                                            try {
                                                this.u1 = true;
                                                while (!this.v1) {
                                                    while (this.m1 > 0) {
                                                        this.i1.updateTexImage();
                                                        this.m1--;
                                                    }
                                                    float[] fArr = this.Y;
                                                    if (zzcbtVar.e(fArr)) {
                                                        if (Float.isNaN(this.d1)) {
                                                            float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                                            float f = fArr[0];
                                                            float f2 = fArr2[0];
                                                            float f3 = fArr[1];
                                                            float f4 = fArr2[1];
                                                            float[] fArr3 = {(f * f2) + (f3 * f4) + (fArr[2] * 0.0f), (fArr[3] * f2) + (fArr[4] * f4) + (fArr[5] * 0.0f), (fArr[6] * f2) + (fArr[7] * f4) + (fArr[8] * 0.0f)};
                                                            this.d1 = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                        }
                                                        k(this.b1, this.d1 + this.e1);
                                                    } else {
                                                        j(fArr, -1.5707964f);
                                                        k(this.b1, this.e1);
                                                    }
                                                    float[] fArr4 = this.Z;
                                                    j(fArr4, 1.5707964f);
                                                    float[] fArr5 = this.Y0;
                                                    i(fArr5, this.b1, fArr4);
                                                    float[] fArr6 = this.Z0;
                                                    i(fArr6, fArr, fArr5);
                                                    float[] fArr7 = this.a1;
                                                    j(fArr7, this.f1);
                                                    float[] fArr8 = this.c1;
                                                    i(fArr8, fArr7, fArr6);
                                                    GLES20.glUniformMatrix3fv(this.l1, 1, false, fArr8, 0);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    h("drawArrays");
                                                    GLES20.glFinish();
                                                    this.q1.eglSwapBuffers(this.r1, this.t1);
                                                    if (this.u1) {
                                                        GLES20.glViewport(0, 0, this.h1, this.g1);
                                                        h("viewport");
                                                        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.k1, "uFOVx");
                                                        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.k1, "uFOVy");
                                                        int i3 = this.h1;
                                                        int i4 = this.g1;
                                                        if (i3 > i4) {
                                                            GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                            GLES20.glUniform1f(glGetUniformLocation3, (this.g1 * 0.87266463f) / this.h1);
                                                        } else {
                                                            GLES20.glUniform1f(glGetUniformLocation2, (i3 * 0.87266463f) / i4);
                                                            GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                        }
                                                        this.u1 = false;
                                                    }
                                                    try {
                                                        Object obj = this.p1;
                                                        synchronized (obj) {
                                                            try {
                                                                if (!this.v1 && !this.u1 && this.m1 == 0) {
                                                                    obj.wait();
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                                break;
                                                            }
                                                        }
                                                    } catch (InterruptedException unused) {
                                                    }
                                                }
                                            }
                                        } catch (IllegalStateException unused2) {
                                            int i5 = com.google.android.gms.ads.internal.util.zze.b;
                                            com.google.android.gms.ads.internal.util.client.zzo.g("SphericalVideoProcessor halted unexpectedly.");
                                        }
                                        this.X.d();
                                        this.i1.setOnFrameAvailableListener(null);
                                        this.i1 = null;
                                        g();
                                        return;
                                    }
                                    String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.q1.eglGetError()));
                                    int i6 = com.google.android.gms.ads.internal.util.zze.b;
                                    String concat = "EGL initialization failed: ".concat(valueOf);
                                    com.google.android.gms.ads.internal.util.client.zzo.d(concat);
                                    com.google.android.gms.ads.internal.zzv.t().x(new Throwable(concat), "SphericalVideoProcessor.run.1");
                                    g();
                                    this.o1.countDown();
                                    return;
                                }
                            }
                            glCreateProgram = 0;
                            this.k1 = glCreateProgram;
                            GLES20.glUseProgram(glCreateProgram);
                            h("useProgram");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.k1, "aPosition");
                            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.n1);
                            h("vertexAttribPointer");
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            h("enableVertexAttribArray");
                            int[] iArr32 = new int[1];
                            GLES20.glGenTextures(1, iArr32, 0);
                            h("genTextures");
                            int i7 = iArr32[0];
                            GLES20.glBindTexture(36197, i7);
                            h("bindTextures");
                            GLES20.glTexParameteri(36197, b.d, 9729);
                            h("texParameteri");
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            h("texParameteri");
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            h("texParameteri");
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            h("texParameteri");
                            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.k1, "uVMat");
                            this.l1 = glGetUniformLocation4;
                            GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                            int i22 = this.k1;
                            if (!z) {
                            }
                            String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.q1.eglGetError()));
                            int i62 = com.google.android.gms.ads.internal.util.zze.b;
                            String concat2 = "EGL initialization failed: ".concat(valueOf2);
                            com.google.android.gms.ads.internal.util.client.zzo.d(concat2);
                            com.google.android.gms.ads.internal.zzv.t().x(new Throwable(concat2), "SphericalVideoProcessor.run.1");
                            g();
                            this.o1.countDown();
                            return;
                        }
                    }
                }
            }
            z = false;
            zzbcmVar = zzbcv.w1;
            if (((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).equals(zzbcmVar.k())) {
            }
            l = l(35633, str);
            if (l != 0) {
            }
            glCreateProgram = 0;
            this.k1 = glCreateProgram;
            GLES20.glUseProgram(glCreateProgram);
            h("useProgram");
            int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.k1, "aPosition");
            GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.n1);
            h("vertexAttribPointer");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
            h("enableVertexAttribArray");
            int[] iArr322 = new int[1];
            GLES20.glGenTextures(1, iArr322, 0);
            h("genTextures");
            int i72 = iArr322[0];
            GLES20.glBindTexture(36197, i72);
            h("bindTextures");
            GLES20.glTexParameteri(36197, b.d, 9729);
            h("texParameteri");
            GLES20.glTexParameteri(36197, 10241, 9729);
            h("texParameteri");
            GLES20.glTexParameteri(36197, 10242, 33071);
            h("texParameteri");
            GLES20.glTexParameteri(36197, 10243, 33071);
            h("texParameteri");
            int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.k1, "uVMat");
            this.l1 = glGetUniformLocation42;
            GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
            int i222 = this.k1;
            if (!z) {
            }
            String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.q1.eglGetError()));
            int i622 = com.google.android.gms.ads.internal.util.zze.b;
            String concat22 = "EGL initialization failed: ".concat(valueOf22);
            com.google.android.gms.ads.internal.util.client.zzo.d(concat22);
            com.google.android.gms.ads.internal.zzv.t().x(new Throwable(concat22), "SphericalVideoProcessor.run.1");
            g();
            this.o1.countDown();
            return;
        }
        int i8 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.d("SphericalVideoProcessor started with no output texture.");
        this.o1.countDown();
    }
}
