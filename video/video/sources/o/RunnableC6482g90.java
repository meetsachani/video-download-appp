package o;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.C10898yD0;

@ES1(17)
@Deprecated
/* renamed from: o.g90  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC6482g90 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int c1 = 0;
    public static final int d1 = 1;
    public static final int e1 = 2;
    public static final int f1 = 1;
    public static final int g1 = 1;
    public static final int[] h1 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public static final int i1 = 12992;
    public final Handler X;
    public final int[] Y;
    @InterfaceC11300zs1
    public EGLDisplay Y0;
    @InterfaceC11300zs1
    public final b Z;
    @InterfaceC11300zs1
    public EGLContext Z0;
    @InterfaceC11300zs1
    public EGLSurface a1;
    @InterfaceC11300zs1
    public SurfaceTexture b1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.g90$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* renamed from: o.g90$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    public RunnableC6482g90(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) throws C10898yD0.b {
        boolean z = true;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, h1, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            z = false;
        }
        C10898yD0.f(z, TD2.M("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws C10898yD0.b {
        boolean z = true;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, i1, 1, 12344}, 0);
        if (eglCreateContext == null) {
            z = false;
        }
        C10898yD0.f(z, "eglCreateContext failed");
        return eglCreateContext;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws C10898yD0.b {
        EGLSurface eglCreatePbufferSurface;
        boolean z = true;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, i1, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                z = false;
            }
            C10898yD0.f(z, "eglCreatePbufferSurface failed");
        }
        C10898yD0.f(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    public static void e(int[] iArr) throws C10898yD0.b {
        GLES20.glGenTextures(1, iArr, 0);
        C10898yD0.e();
    }

    public static EGLDisplay f() throws C10898yD0.b {
        boolean z;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z = true;
        } else {
            z = false;
        }
        C10898yD0.f(z, "eglGetDisplay failed");
        int[] iArr = new int[2];
        C10898yD0.f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public final void d() {
        b bVar = this.Z;
        if (bVar != null) {
            bVar.a();
        }
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) C9542sf.g(this.b1);
    }

    public void h(int i) throws C10898yD0.b {
        EGLDisplay f = f();
        this.Y0 = f;
        EGLConfig a2 = a(f);
        EGLContext b2 = b(this.Y0, a2, i);
        this.Z0 = b2;
        this.a1 = c(this.Y0, a2, b2, i);
        e(this.Y);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.Y[0]);
        this.b1 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public void i() {
        this.X.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.b1;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.Y, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.Y0;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.Y0;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.a1;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.Y0, this.a1);
            }
            EGLContext eGLContext = this.Z0;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.Y0, eGLContext);
            }
            if (TD2.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.Y0;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.Y0);
            }
            this.Y0 = null;
            this.Z0 = null;
            this.a1 = null;
            this.b1 = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.X.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.b1;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC6482g90(Handler handler, @InterfaceC11300zs1 b bVar) {
        this.X = handler;
        this.Z = bVar;
        this.Y = new int[1];
    }
}
