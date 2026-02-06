package o;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import o.C10898yD0;

@Deprecated
/* renamed from: o.vD0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC10166vD0 {
    @Deprecated
    public static final InterfaceC10166vD0 a = new a();

    /* renamed from: o.vD0$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC10166vD0 {
        @Override // o.InterfaceC10166vD0
        @ES1(17)
        public EGLSurface a(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws C10898yD0.b {
            return C10898yD0.q(eGLContext, eGLDisplay, iArr);
        }

        @Override // o.InterfaceC10166vD0
        @ES1(17)
        public EGLSurface b(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws C10898yD0.b {
            return C10898yD0.n(eGLDisplay, obj, i, z);
        }

        @Override // o.InterfaceC10166vD0
        public C10655xD0 c(int i, int i2, int i3) throws C10898yD0.b {
            return new C10655xD0(i, C10898yD0.p(i), -1, i2, i3);
        }

        @Override // o.InterfaceC10166vD0
        @ES1(17)
        public EGLContext d(EGLDisplay eGLDisplay, int i, int[] iArr) throws C10898yD0.b {
            return C10898yD0.k(EGL14.EGL_NO_CONTEXT, eGLDisplay, i, iArr);
        }
    }

    @ES1(17)
    EGLSurface a(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws C10898yD0.b;

    @ES1(17)
    EGLSurface b(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws C10898yD0.b;

    C10655xD0 c(int i, int i2, int i3) throws C10898yD0.b;

    @ES1(17)
    EGLContext d(EGLDisplay eGLDisplay, @BR0(from = 2, to = 3) int i, int[] iArr) throws C10898yD0.b;
}
