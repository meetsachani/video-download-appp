package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public abstract class Z81<V extends View> {
    public static final String g = "MaterialBackHelper";
    public static final int h = 300;
    public static final int i = 150;
    public static final int j = 100;
    @InterfaceC5670cr1
    public final TimeInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    @InterfaceC5670cr1
    public final V b;
    public final int c;
    public final int d;
    public final int e;
    @InterfaceC11300zs1
    public C8827pk f;

    public Z81(@InterfaceC5670cr1 V v) {
        this.b = v;
        Context context = v.getContext();
        this.c = C9811tl1.f(context, C7025iN1.c.motionDurationMedium2, 300);
        this.d = C9811tl1.f(context, C7025iN1.c.motionDurationShort3, 150);
        this.e = C9811tl1.f(context, C7025iN1.c.motionDurationShort2, 100);
    }

    public float a(float f) {
        return this.a.getInterpolation(f);
    }

    @InterfaceC11300zs1
    public C8827pk b() {
        if (this.f == null) {
            Log.w(g, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C8827pk c8827pk = this.f;
        this.f = null;
        return c8827pk;
    }

    @InterfaceC11300zs1
    public C8827pk c() {
        C8827pk c8827pk = this.f;
        this.f = null;
        return c8827pk;
    }

    public void d(@InterfaceC5670cr1 C8827pk c8827pk) {
        this.f = c8827pk;
    }

    @InterfaceC11300zs1
    public C8827pk e(@InterfaceC5670cr1 C8827pk c8827pk) {
        if (this.f == null) {
            Log.w(g, "Must call startBackProgress() before updateBackProgress()");
        }
        C8827pk c8827pk2 = this.f;
        this.f = c8827pk;
        return c8827pk2;
    }
}
