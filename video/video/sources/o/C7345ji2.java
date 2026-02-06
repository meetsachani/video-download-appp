package o;

import android.graphics.PointF;
import android.util.Rational;
import android.util.Size;

/* renamed from: o.ji2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7345ji2 extends AbstractC8825pj1 {
    public final float b;
    public final float c;

    public C7345ji2(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static Rational e(androidx.camera.core.m mVar) {
        if (mVar == null) {
            return null;
        }
        Size f = mVar.f();
        if (f != null) {
            return new Rational(f.getWidth(), f.getHeight());
        }
        throw new IllegalStateException("UseCase " + mVar + " is not bound.");
    }

    @Override // o.AbstractC8825pj1
    public PointF a(float f, float f2) {
        return new PointF(f / this.b, f2 / this.c);
    }

    public C7345ji2(float f, float f2, androidx.camera.core.m mVar) {
        super(e(mVar));
        this.b = f;
        this.c = f2;
    }
}
