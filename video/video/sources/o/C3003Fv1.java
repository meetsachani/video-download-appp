package o;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.Fv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3003Fv1 {
    public static final a A;
    public static final String n = "OpenGlRenderer";

    /* renamed from: o  reason: collision with root package name */
    public static final String f459o = "vTextureCoord";
    public static final String p = "sTexture";
    public static final int q = 4;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final float[] v;
    public static final FloatBuffer w;
    public static final float[] x;
    public static final FloatBuffer y;
    public static final int z = 4;
    public Thread c;
    public EGLConfig f;
    public Surface h;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final Map<Surface, a> b = new HashMap();
    public EGLDisplay d = EGL14.EGL_NO_DISPLAY;
    public EGLContext e = EGL14.EGL_NO_CONTEXT;
    public EGLSurface g = EGL14.EGL_NO_SURFACE;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;

    /* renamed from: o.Fv1$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static a d(EGLSurface eGLSurface, int i, int i2) {
            return new C5151aj(eGLSurface, i, i2);
        }

        public abstract EGLSurface a();

        public abstract int b();

        public abstract int c();
    }

    static {
        Locale locale = Locale.US;
        r = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", f459o, f459o);
        s = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", f459o, f459o);
        t = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", f459o, p, p, f459o);
        u = String.format(locale, "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}", p, f459o, p, f459o);
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        v = fArr;
        w = h(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        x = fArr2;
        y = h(fArr2);
        A = a.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static int B(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    public static void a(String str) {
        try {
            b(str);
        } catch (IllegalStateException e) {
            C7433k41.d(n, e.toString(), e);
        }
    }

    public static void b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    public static void c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    public static void f(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static FloatBuffer h(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static EGLSurface j(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        b("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        b("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void o(int i) {
        GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        c("glDeleteFramebuffers");
    }

    public static void p(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        c("glDeleteTextures");
    }

    public static int q() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        c("glGenFramebuffers");
        return iArr[0];
    }

    public static int r() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        c("glGenTextures");
        return iArr[0];
    }

    public static int z(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        c("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        C7433k41.p(n, "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public final void A(EGLSurface eGLSurface) {
        C10907yF1.l(this.d);
        C10907yF1.l(this.e);
        if (EGL14.eglMakeCurrent(this.d, eGLSurface, eGLSurface, this.e)) {
            return;
        }
        throw new IllegalStateException("eglMakeCurrent failed");
    }

    public void C(Surface surface) {
        e(true);
        d();
        if (!this.b.containsKey(surface)) {
            this.b.put(surface, A);
        }
    }

    public void D() {
        if (!this.a.getAndSet(false)) {
            return;
        }
        d();
        E();
    }

    public final void E() {
        int i = this.j;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.j = -1;
        }
        if (!Objects.equals(this.d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (a aVar : this.b.values()) {
                if (!Objects.equals(aVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.d, aVar.a())) {
                    a("eglDestroySurface");
                }
            }
            this.b.clear();
            if (!Objects.equals(this.g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.g);
                this.g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.d);
            this.d = EGL14.EGL_NO_DISPLAY;
        }
        this.f = null;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.i = -1;
        this.h = null;
        this.c = null;
    }

    public final void F(Surface surface, boolean z2) {
        a put;
        if (this.h == surface) {
            this.h = null;
            A(this.g);
        }
        if (z2) {
            put = this.b.remove(surface);
        } else {
            put = this.b.put(surface, A);
        }
        if (put != null && put != A) {
            try {
                EGL14.eglDestroySurface(this.d, put.a());
            } catch (RuntimeException e) {
                C7433k41.q(n, "Failed to destroy EGL surface: " + e.getMessage(), e);
            }
        }
    }

    public void G(long j, float[] fArr, Surface surface) {
        e(true);
        d();
        a t2 = t(surface);
        if (t2 == A) {
            t2 = i(surface);
            if (t2 != null) {
                this.b.put(surface, t2);
            } else {
                return;
            }
        }
        if (surface != this.h) {
            A(t2.a());
            this.h = surface;
            GLES20.glViewport(0, 0, t2.c(), t2.b());
            GLES20.glScissor(0, 0, t2.c(), t2.b());
        }
        GLES20.glUniformMatrix4fv(this.k, 1, false, fArr, 0);
        c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        c("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.d, t2.a(), j);
        if (!EGL14.eglSwapBuffers(this.d, t2.a())) {
            C7433k41.p(n, "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            F(surface, false);
        }
    }

    public Bitmap H(Size size, float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        I(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.k(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public final void I(ByteBuffer byteBuffer, Size size, float[] fArr) {
        boolean z2;
        if (byteBuffer.capacity() == size.getWidth() * size.getHeight() * 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10907yF1.b(z2, "ByteBuffer capacity is not equal to width * height * 4.");
        C10907yF1.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int r2 = r();
        GLES20.glActiveTexture(33985);
        c("glActiveTexture");
        GLES20.glBindTexture(3553, r2);
        c("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        c("glTexImage2D");
        GLES20.glTexParameteri(3553, androidx.work.b.d, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int q2 = q();
        GLES20.glBindFramebuffer(36160, q2);
        c("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, r2, 0);
        c("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        c("glActiveTexture");
        GLES20.glBindTexture(36197, this.i);
        c("glBindTexture");
        this.h = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        GLES20.glUniformMatrix4fv(this.k, 1, false, fArr, 0);
        c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        c("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        c("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        p(r2);
        o(q2);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.i);
    }

    public void J(Surface surface) {
        e(true);
        d();
        F(surface, true);
    }

    public final void K() {
        GLES20.glUseProgram(this.j);
        c("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.i);
        GLES20.glEnableVertexAttribArray(this.l);
        c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.l, 2, 5126, false, 0, (Buffer) w);
        c("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.m);
        c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.m, 2, 5126, false, 0, (Buffer) y);
        c("glVertexAttribPointer");
    }

    public final void d() {
        boolean z2;
        if (this.c == Thread.currentThread()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10907yF1.o(z2, "Method call must be called on the GL thread.");
    }

    public final void e(boolean z2) {
        boolean z3;
        String str;
        if (z2 == this.a.get()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        C10907yF1.o(z3, str);
    }

    public final void g(N80 n80) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.d = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i4 = 2;
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize(this.d, iArr2, 0, iArr2, 1)) {
                if (n80.d()) {
                    i = 10;
                } else {
                    i = 8;
                }
                if (n80.d()) {
                    i2 = 2;
                } else {
                    i2 = 8;
                }
                if (n80.d()) {
                    i3 = 64;
                } else {
                    i3 = 4;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.d, new int[]{12324, i, 12323, i, 12322, i, 12321, i2, 12325, 0, 12326, 0, 12352, i3, 12610, !n80.d(), 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (n80.d()) {
                        i4 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i4, 12344}, 0);
                    b("eglCreateContext");
                    this.f = eGLConfig;
                    this.e = eglCreateContext;
                    EGL14.eglQueryContext(this.d, eglCreateContext, 12440, new int[1], 0);
                    Log.d(n, "EGLContext created, client version " + iArr[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    public final a i(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.d;
            EGLConfig eGLConfig = this.f;
            Objects.requireNonNull(eGLConfig);
            EGLSurface n2 = n(eGLDisplay, eGLConfig, surface);
            Size u2 = u(n2);
            return a.d(n2, u2.getWidth(), u2.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            C7433k41.q(n, "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(N80 n80, K22 k22) {
        int i;
        int i2;
        int i3;
        String str;
        int x2;
        int glCreateProgram;
        try {
            if (n80.d()) {
                str = s;
            } else {
                str = r;
            }
            i3 = z(35633, str);
            try {
                x2 = x(n80, k22);
                try {
                    glCreateProgram = GLES20.glCreateProgram();
                } catch (IllegalArgumentException | IllegalStateException e) {
                    i = x2;
                    e = e;
                    i2 = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e2) {
                e = e2;
                i = -1;
                i2 = -1;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            i = -1;
            i2 = -1;
            i3 = -1;
            if (i3 != -1) {
            }
            if (i != -1) {
            }
            if (i2 != -1) {
            }
            throw e;
        } catch (IllegalStateException e4) {
            e = e4;
            i = -1;
            i2 = -1;
            i3 = -1;
            if (i3 != -1) {
            }
            if (i != -1) {
            }
            if (i2 != -1) {
            }
            throw e;
        }
        try {
            c("glCreateProgram");
            GLES20.glAttachShader(glCreateProgram, i3);
            c("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, x2);
            c("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                this.j = glCreateProgram;
                return;
            }
            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(glCreateProgram));
        } catch (IllegalArgumentException e5) {
            e = e5;
            i = x2;
            e = e;
            i2 = glCreateProgram;
            if (i3 != -1) {
                GLES20.glDeleteShader(i3);
            }
            if (i != -1) {
                GLES20.glDeleteShader(i);
            }
            if (i2 != -1) {
                GLES20.glDeleteProgram(i2);
            }
            throw e;
        } catch (IllegalStateException e6) {
            e = e6;
            i = x2;
            e = e;
            i2 = glCreateProgram;
            if (i3 != -1) {
            }
            if (i != -1) {
            }
            if (i2 != -1) {
            }
            throw e;
        }
    }

    public final void l() {
        EGLDisplay eGLDisplay = this.d;
        EGLConfig eGLConfig = this.f;
        Objects.requireNonNull(eGLConfig);
        this.g = j(eGLDisplay, eGLConfig, 1, 1);
    }

    public final void m() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        c("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        c("glBindTexture " + i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, androidx.work.b.d, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        c("glTexParameter");
        this.i = i;
    }

    public final String s(N80 n80) {
        String str = "";
        e(false);
        try {
            g(n80);
            l();
            A(this.g);
            String glGetString = GLES20.glGetString(7939);
            if (glGetString != null) {
                str = glGetString;
            }
            return str;
        } catch (IllegalStateException e) {
            C7433k41.q(n, "Failed to get GL extensions: " + e.getMessage(), e);
            return "";
        } finally {
            E();
        }
    }

    public final a t(Surface surface) {
        C10907yF1.o(this.b.containsKey(surface), "The surface is not registered.");
        a aVar = this.b.get(surface);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    public final Size u(EGLSurface eGLSurface) {
        return new Size(B(this.d, eGLSurface, 12375), B(this.d, eGLSurface, 12374));
    }

    public int v() {
        e(true);
        d();
        return this.i;
    }

    public void w(N80 n80, K22 k22) {
        e(false);
        try {
            if (n80.d() && !s(n80).contains(C10898yD0.g)) {
                Log.w(n, "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                n80 = N80.n;
            }
            g(n80);
            l();
            A(this.g);
            k(n80, k22);
            y();
            m();
            K();
            this.c = Thread.currentThread();
            this.a.set(true);
        } catch (IllegalArgumentException e) {
            e = e;
            E();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            E();
            throw e;
        }
    }

    public final int x(N80 n80, K22 k22) {
        String str;
        if (k22 == K22.a) {
            if (n80.d()) {
                str = u;
            } else {
                str = t;
            }
            return z(35632, str);
        }
        try {
            String a2 = k22.a(p, f459o);
            if (a2 != null && a2.contains(f459o) && a2.contains(p)) {
                return z(35632, a2);
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th);
        }
    }

    public final void y() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.j, "aPosition");
        this.l = glGetAttribLocation;
        f(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.j, "aTextureCoord");
        this.m = glGetAttribLocation2;
        f(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.j, "uTexMatrix");
        this.k = glGetUniformLocation;
        f(glGetUniformLocation, "uTexMatrix");
    }
}
