package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;
import o.C9701tI1;

/* renamed from: o.nI1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8236nI1 implements InterfaceC3493Kv1<C9701tI1.b, AbstractC3401Jx1<androidx.camera.core.g>> {
    public static AbstractC3401Jx1<androidx.camera.core.g> b(C9944uI1 c9944uI1, C11251zg0 c11251zg0, androidx.camera.core.g gVar) {
        return AbstractC3401Jx1.k(gVar, c11251zg0, c9944uI1.b(), c9944uI1.e(), c9944uI1.f(), d(gVar));
    }

    public static AbstractC3401Jx1<androidx.camera.core.g> c(C9944uI1 c9944uI1, C11251zg0 c11251zg0, androidx.camera.core.g gVar) {
        Size size = new Size(gVar.getWidth(), gVar.getHeight());
        int e = c9944uI1.e() - c11251zg0.v();
        Size e2 = e(e, size);
        Matrix d = C5433bs2.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, e2.getWidth(), e2.getHeight()), e);
        return AbstractC3401Jx1.l(gVar, c11251zg0, e2, f(c9944uI1.b(), d), c11251zg0.v(), g(c9944uI1.f(), d), d(gVar));
    }

    public static InterfaceC3784Nv d(androidx.camera.core.g gVar) {
        return ((C3881Ov) gVar.I4()).f();
    }

    public static Size e(int i, Size size) {
        if (C5433bs2.h(C5433bs2.A(i))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // o.InterfaceC3493Kv1
    /* renamed from: a */
    public AbstractC3401Jx1<androidx.camera.core.g> apply(C9701tI1.b bVar) throws DM0 {
        C11251zg0 k;
        androidx.camera.core.g a = bVar.a();
        C9944uI1 b = bVar.b();
        if (a.getFormat() == 256) {
            try {
                k = C11251zg0.k(a);
                a.f3()[0].B().rewind();
            } catch (IOException e) {
                throw new DM0(1, "Failed to extract EXIF data.", e);
            }
        } else {
            k = null;
        }
        if (C6283fN0.i.b(a)) {
            C10907yF1.m(k, "JPEG image must have exif.");
            return c(b, k, a);
        }
        return b(b, k, a);
    }
}
