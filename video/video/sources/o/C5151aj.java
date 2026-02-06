package o;

import android.opengl.EGLSurface;
import o.C3003Fv1;

/* renamed from: o.aj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5151aj extends C3003Fv1.a {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public C5151aj(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.a = eGLSurface;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    @Override // o.C3003Fv1.a
    public EGLSurface a() {
        return this.a;
    }

    @Override // o.C3003Fv1.a
    public int b() {
        return this.c;
    }

    @Override // o.C3003Fv1.a
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3003Fv1.a) {
            C3003Fv1.a aVar = (C3003Fv1.a) obj;
            if (this.a.equals(aVar.a()) && this.b == aVar.c() && this.c == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.a + ", width=" + this.b + ", height=" + this.c + "}";
    }
}
