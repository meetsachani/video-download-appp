package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class LX0<T> {
    public static final float q = -3987645.8f;
    public static final int r = 784923401;
    public final C10624x51 a;
    public final T b;
    public T c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f536o;
    public PointF p;

    public LX0(C10624x51 c10624x51, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = r;
        this.l = r;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f536o = null;
        this.p = null;
        this.a = c10624x51;
        this.b = t;
        this.c = t2;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public boolean a(float f) {
        if (f >= f() && f < c()) {
            return true;
        }
        return false;
    }

    public LX0<T> b(T t, T t2) {
        return new LX0<>(t, t2);
    }

    public float c() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.n = 1.0f;
            } else {
                float f = f();
                this.n = (float) (f + ((this.h.floatValue() - this.g) / this.a.e()));
            }
        }
        return this.n;
    }

    public float d() {
        if (this.j == -3987645.8f) {
            this.j = ((Float) this.c).floatValue();
        }
        return this.j;
    }

    public int e() {
        if (this.l == 784923401) {
            this.l = ((Integer) this.c).intValue();
        }
        return this.l;
    }

    public float f() {
        C10624x51 c10624x51 = this.a;
        if (c10624x51 == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            this.m = (this.g - c10624x51.r()) / this.a.e();
        }
        return this.m;
    }

    public float g() {
        if (this.i == -3987645.8f) {
            this.i = ((Float) this.b).floatValue();
        }
        return this.i;
    }

    public int h() {
        if (this.k == 784923401) {
            this.k = ((Integer) this.b).intValue();
        }
        return this.k;
    }

    public boolean i() {
        if (this.d == null && this.e == null && this.f == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + '}';
    }

    public LX0(C10624x51 c10624x51, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = r;
        this.l = r;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f536o = null;
        this.p = null;
        this.a = c10624x51;
        this.b = t;
        this.c = t2;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = f2;
    }

    public LX0(C10624x51 c10624x51, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = r;
        this.l = r;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f536o = null;
        this.p = null;
        this.a = c10624x51;
        this.b = t;
        this.c = t2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public LX0(T t) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = r;
        this.l = r;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f536o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.c = t;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public LX0(T t, T t2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = r;
        this.l = r;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f536o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.c = t2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
