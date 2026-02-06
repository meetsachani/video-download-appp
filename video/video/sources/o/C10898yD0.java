package o;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: o.yD0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10898yD0 {
    public static final int a = 4;
    public static final float b = 2.0f;
    public static final String e = "EGL_EXT_protected_content";
    public static final String f = "EGL_KHR_surfaceless_context";
    public static final String g = "GL_EXT_YUV_target";
    public static final String h = "EGL_EXT_gl_colorspace_bt2020_pq";
    public static final int[] c = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] d = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int i = 12445;
    public static final int j = 13120;
    public static final int[] k = {i, j, 12344, 12344};
    public static final int[] l = {12344};

    @ES1(17)
    /* renamed from: o.yD0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        public static EGLContext a(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) throws b {
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, i(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
            if (eglCreateContext != null) {
                C10898yD0.e();
                return eglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new b("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i);
        }

        @K40
        public static EGLDisplay b() throws b {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            C10898yD0.f(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            C10898yD0.f(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
            C10898yD0.e();
            return eglGetDisplay;
        }

        @K40
        public static EGLSurface c(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws b {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, i(eGLDisplay, iArr), iArr2, 0);
            C10898yD0.d("Error creating surface");
            return eglCreatePbufferSurface;
        }

        @K40
        public static EGLSurface d(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws b {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, i(eGLDisplay, iArr), obj, iArr2, 0);
            C10898yD0.d("Error creating surface");
            return eglCreateWindowSurface;
        }

        @K40
        public static void e(@InterfaceC11300zs1 EGLDisplay eGLDisplay, @InterfaceC11300zs1 EGLContext eGLContext) throws b {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            C10898yD0.d("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                C10898yD0.d("Error destroying context");
            }
            EGL14.eglReleaseThread();
            C10898yD0.d("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            C10898yD0.d("Error terminating display");
        }

        @K40
        public static void f(@InterfaceC11300zs1 EGLDisplay eGLDisplay, @InterfaceC11300zs1 EGLSurface eGLSurface) throws b {
            if (eGLDisplay != null && eGLSurface != null) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                C10898yD0.d("Error destroying surface");
            }
        }

        @K40
        public static void g(int i, int i2, int i3) throws b {
            C10898yD0.f(!TD2.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i) {
                GLES20.glBindFramebuffer(36160, i);
            }
            C10898yD0.e();
            GLES20.glViewport(0, 0, i2, i3);
            C10898yD0.e();
        }

        @K40
        public static void h(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws b {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            C10898yD0.d("Error making context current");
            g(i, i2, i3);
        }

        @K40
        private static EGLConfig i(EGLDisplay eGLDisplay, int[] iArr) throws b {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new b("eglChooseConfig failed.");
        }
    }

    /* renamed from: o.yD0$b */
    /* loaded from: classes2.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    @ES1(17)
    public static void A(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3) throws b {
        a.h(eGLDisplay, eGLContext, eGLSurface, 0, i2, i3);
    }

    @ES1(17)
    public static void B(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3, int i4) throws b {
        a.h(eGLDisplay, eGLContext, eGLSurface, i2, i3, i4);
    }

    @ES1(17)
    public static void C(int i2, int i3, int i4) throws b {
        a.g(i2, i3, i4);
    }

    @ES1(17)
    public static EGLSurface D(EGLContext eGLContext, EGLDisplay eGLDisplay) throws b {
        return q(eGLContext, eGLDisplay, c);
    }

    public static int E() throws b {
        f(!TD2.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        e();
        return iArr[0];
    }

    public static EGLContext F() {
        return EGL14.eglGetCurrentContext();
    }

    public static float[] G() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] H() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean I() {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains(h)) {
            return false;
        }
        return true;
    }

    public static boolean J(Context context) {
        String eglQueryString;
        int i2 = TD2.a;
        if (i2 < 24) {
            return false;
        }
        if (i2 < 26 && (D71.b.equals(TD2.c) || "XT1650".equals(TD2.d))) {
            return false;
        }
        if ((i2 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(e)) {
            return false;
        }
        return true;
    }

    public static boolean K() {
        String eglQueryString;
        if (TD2.a < 17 || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(f)) {
            return false;
        }
        return true;
    }

    public static boolean L() {
        String glGetString;
        if (TD2.a < 17) {
            return false;
        }
        if (TD2.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay m = m();
                EGLContext l2 = l(m);
                D(l2, m);
                glGetString = GLES20.glGetString(7939);
                y(m, l2);
            } catch (b unused) {
                return false;
            }
        } else {
            glGetString = GLES20.glGetString(7939);
        }
        if (glGetString == null || !glGetString.contains(g)) {
            return false;
        }
        return true;
    }

    public static void M(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void b(int i2, int i3) throws b {
        boolean z = true;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i4 = iArr[0];
        if (i4 <= 0) {
            z = false;
        }
        C9542sf.j(z, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i2 >= 0 && i3 >= 0) {
            if (i2 <= i4 && i3 <= i4) {
                return;
            }
            throw new b("width or height is greater than GL_MAX_TEXTURE_SIZE " + i4);
        }
        throw new b("width or height is less than 0");
    }

    public static void c(int i2, int i3) throws b {
        GLES20.glBindTexture(i2, i3);
        e();
        GLES20.glTexParameteri(i2, androidx.work.b.d, 9729);
        e();
        GLES20.glTexParameteri(i2, 10241, 9729);
        e();
        GLES20.glTexParameteri(i2, 10242, 33071);
        e();
        GLES20.glTexParameteri(i2, 10243, 33071);
        e();
    }

    public static void d(String str) throws b {
        boolean z;
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            z = true;
        } else {
            z = false;
        }
        f(z, str + ", error code: " + eglGetError);
    }

    public static void e() throws b {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (!z) {
            return;
        }
        throw new b(sb.toString());
    }

    public static void f(boolean z, String str) throws b {
        if (z) {
            return;
        }
        throw new b(str);
    }

    public static void g() throws b {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        e();
    }

    public static float[] h() {
        float[] fArr = new float[16];
        M(fArr);
        return fArr;
    }

    public static FloatBuffer i(int i2) {
        return ByteBuffer.allocateDirect(i2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer j(float[] fArr) {
        return (FloatBuffer) i(fArr.length).put(fArr).flip();
    }

    @ES1(17)
    public static EGLContext k(EGLContext eGLContext, EGLDisplay eGLDisplay, @BR0(from = 2, to = 3) int i2, int[] iArr) throws b {
        boolean z;
        boolean z2 = true;
        if (!Arrays.equals(iArr, c) && !Arrays.equals(iArr, d)) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        if (i2 != 2 && i2 != 3) {
            z2 = false;
        }
        C9542sf.a(z2);
        return a.a(eGLContext, eGLDisplay, i2, iArr);
    }

    @ES1(17)
    public static EGLContext l(EGLDisplay eGLDisplay) throws b {
        return k(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, c);
    }

    @ES1(17)
    public static EGLDisplay m() throws b {
        return a.b();
    }

    @ES1(17)
    public static EGLSurface n(EGLDisplay eGLDisplay, Object obj, int i2, boolean z) throws b {
        int[] iArr;
        int[] iArr2;
        if (i2 != 3 && i2 != 10) {
            if (i2 == 6) {
                iArr = d;
                if (z) {
                    iArr2 = l;
                } else {
                    iArr2 = k;
                }
            } else if (i2 == 7) {
                C9542sf.b(z, "Outputting HLG to the screen is not supported.");
                iArr = d;
                iArr2 = l;
            } else {
                throw new IllegalArgumentException("Unsupported color transfer: " + i2);
            }
        } else {
            iArr = c;
            iArr2 = l;
        }
        return a.d(eGLDisplay, obj, iArr, iArr2);
    }

    public static int o() throws b {
        int E = E();
        c(36197, E);
        return E;
    }

    public static int p(int i2) throws b {
        f(!TD2.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        e();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        e();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        e();
        return iArr[0];
    }

    @ES1(17)
    public static EGLSurface q(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws b {
        EGLSurface r;
        if (K()) {
            r = EGL14.EGL_NO_SURFACE;
        } else {
            r = r(eGLDisplay, 1, 1, iArr);
        }
        A(eGLDisplay, eGLContext, r, 1, 1);
        return r;
    }

    @ES1(17)
    public static EGLSurface r(EGLDisplay eGLDisplay, int i2, int i3, int[] iArr) throws b {
        return a.c(eGLDisplay, iArr, new int[]{12375, i2, 12374, i3, 12344});
    }

    public static int s(int i2, int i3, int i4, int i5) throws b {
        b(i2, i3);
        int E = E();
        c(3553, E);
        GLES20.glTexImage2D(3553, 0, i4, i2, i3, 0, 6408, i5, ByteBuffer.allocateDirect(i2 * i3 * 4));
        e();
        return E;
    }

    public static int t(int i2, int i3, boolean z) throws b {
        boolean z2;
        if (z) {
            if (TD2.a >= 18) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.j(z2, "GLES30 extensions are not supported below API 18.");
            return s(i2, i3, 34842, 5131);
        }
        return s(i2, i3, 6408, 5121);
    }

    public static float[] u(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i2 = 0; i2 < list.size(); i2++) {
            System.arraycopy(list.get(i2), 0, fArr, i2 * 4, 4);
        }
        return fArr;
    }

    public static void v(int i2) throws b {
        GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
        e();
    }

    public static void w(int i2) throws b {
        GLES20.glDeleteRenderbuffers(1, new int[]{i2}, 0);
        e();
    }

    public static void x(int i2) throws b {
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        e();
    }

    @ES1(17)
    public static void y(@InterfaceC11300zs1 EGLDisplay eGLDisplay, @InterfaceC11300zs1 EGLContext eGLContext) throws b {
        a.e(eGLDisplay, eGLContext);
    }

    @ES1(17)
    public static void z(@InterfaceC11300zs1 EGLDisplay eGLDisplay, @InterfaceC11300zs1 EGLSurface eGLSurface) throws b {
        a.f(eGLDisplay, eGLSurface);
    }
}
