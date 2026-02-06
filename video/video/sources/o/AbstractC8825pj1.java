package o;

import android.graphics.PointF;
import android.util.Rational;

/* renamed from: o.pj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8825pj1 {
    public Rational a;

    public AbstractC8825pj1() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    public abstract PointF a(float f, float f2);

    public final C8582oj1 b(float f, float f2) {
        return c(f, f2, d());
    }

    public final C8582oj1 c(float f, float f2, float f3) {
        PointF a = a(f, f2);
        return new C8582oj1(a.x, a.y, f3, this.a);
    }

    public AbstractC8825pj1(Rational rational) {
        this.a = rational;
    }
}
