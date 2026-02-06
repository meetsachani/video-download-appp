package o;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import o.C7025iN1;

/* renamed from: o.sa0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9523sa0 {
    public static final float f = 4.5f;
    public static final float g = 2.0f;
    public static final int h = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public C9523sa0(@InterfaceC5670cr1 Context context) {
        this(X81.b(context, C7025iN1.c.elevationOverlayEnabled, false), C9179r91.b(context, C7025iN1.c.elevationOverlayColor, 0), C9179r91.b(context, C7025iN1.c.elevationOverlayAccentColor, 0), C9179r91.b(context, C7025iN1.c.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public int a(float f2) {
        return Math.round(b(f2) * 255.0f);
    }

    public float b(float f2) {
        float f3 = this.e;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @JF
    public int c(@JF int i, float f2) {
        int i2;
        float b = b(f2);
        int alpha = Color.alpha(i);
        int t = C9179r91.t(C9205rG.D(i, 255), this.b, b);
        if (b > 0.0f && (i2 = this.c) != 0) {
            t = C9179r91.s(t, C9205rG.D(i2, h));
        }
        return C9205rG.D(t, alpha);
    }

    @JF
    public int d(@JF int i, float f2, @InterfaceC5670cr1 View view) {
        return c(i, f2 + i(view));
    }

    @JF
    public int e(@JF int i, float f2) {
        if (this.a && m(i)) {
            return c(i, f2);
        }
        return i;
    }

    @JF
    public int f(@JF int i, float f2, @InterfaceC5670cr1 View view) {
        return e(i, f2 + i(view));
    }

    @JF
    public int g(float f2) {
        return e(this.d, f2);
    }

    @JF
    public int h(float f2, @InterfaceC5670cr1 View view) {
        return g(f2 + i(view));
    }

    public float i(@InterfaceC5670cr1 View view) {
        return C10920yI2.p(view);
    }

    @JF
    public int j() {
        return this.b;
    }

    @JF
    public int k() {
        return this.d;
    }

    public boolean l() {
        return this.a;
    }

    public final boolean m(@JF int i) {
        if (C9205rG.D(i, 255) == this.d) {
            return true;
        }
        return false;
    }

    public C9523sa0(boolean z, @JF int i, @JF int i2, @JF int i3, float f2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
