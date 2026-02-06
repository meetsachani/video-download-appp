package o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: o.Jx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3401Jx1<T> {
    public static AbstractC3401Jx1<Bitmap> j(Bitmap bitmap, C11251zg0 c11251zg0, Rect rect, int i, Matrix matrix, InterfaceC3784Nv interfaceC3784Nv) {
        return new C5879dj(bitmap, c11251zg0, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i, matrix, interfaceC3784Nv);
    }

    public static AbstractC3401Jx1<androidx.camera.core.g> k(androidx.camera.core.g gVar, C11251zg0 c11251zg0, Rect rect, int i, Matrix matrix, InterfaceC3784Nv interfaceC3784Nv) {
        return l(gVar, c11251zg0, new Size(gVar.getWidth(), gVar.getHeight()), rect, i, matrix, interfaceC3784Nv);
    }

    public static AbstractC3401Jx1<androidx.camera.core.g> l(androidx.camera.core.g gVar, C11251zg0 c11251zg0, Size size, Rect rect, int i, Matrix matrix, InterfaceC3784Nv interfaceC3784Nv) {
        if (gVar.getFormat() == 256) {
            C10907yF1.m(c11251zg0, "JPEG image must have Exif.");
        }
        return new C5879dj(gVar, c11251zg0, gVar.getFormat(), size, rect, i, matrix, interfaceC3784Nv);
    }

    public static AbstractC3401Jx1<byte[]> m(byte[] bArr, C11251zg0 c11251zg0, int i, Size size, Rect rect, int i2, Matrix matrix, InterfaceC3784Nv interfaceC3784Nv) {
        return new C5879dj(bArr, c11251zg0, i, size, rect, i2, matrix, interfaceC3784Nv);
    }

    public abstract InterfaceC3784Nv a();

    public abstract Rect b();

    public abstract T c();

    public abstract C11251zg0 d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public boolean i() {
        return C5433bs2.g(b(), h());
    }
}
