package o;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: o.x61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10628x61<T> extends O61<T> {
    public final T d;
    public final T e;
    public final Interpolator f;

    public AbstractC10628x61(T t, T t2) {
        this(t, t2, new LinearInterpolator());
    }

    @Override // o.O61
    public T a(C9410s61<T> c9410s61) {
        return e(this.d, this.e, this.f.getInterpolation(c9410s61.e()));
    }

    public abstract T e(T t, T t2, float f);

    public AbstractC10628x61(T t, T t2, Interpolator interpolator) {
        this.d = t;
        this.e = t2;
        this.f = interpolator;
    }
}
