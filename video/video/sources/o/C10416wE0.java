package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;

/* renamed from: o.wE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10416wE0 extends SJ1 {
    public static final float[] w;
    public final GradientDrawable r;
    public final int[] s;
    public boolean t;
    public int u;
    public float v;

    static {
        float[] fArr = new float[100];
        w = fArr;
        PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        int length = fArr.length - 1;
        for (int i = length; i >= 0; i--) {
            w[i] = pathInterpolator.getInterpolation((length - i) / length);
        }
    }

    public C10416wE0(int i) {
        super(i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.r = gradientDrawable;
        this.s = new int[w.length];
        this.u = 0;
        this.v = 1.2f;
        if (i == 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        } else if (i == 2) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i == 4) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else if (i != 8) {
        } else {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
    }

    private void E(int i) {
        if (this.u != i) {
            this.u = i;
            G(i, this.s);
            this.r.setColors(this.s);
            s(this.r);
        }
    }

    public static void G(int i, int[] iArr) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = Color.argb((int) (w[length] * Color.alpha(i)), Color.red(i), Color.green(i), Color.blue(i));
        }
    }

    public int B() {
        return this.u;
    }

    public float C() {
        return this.v;
    }

    public void D(int i) {
        this.t = true;
        E(i);
    }

    public void F(float f) {
        if (f >= 0.0f) {
            this.v = f;
            A();
            return;
        }
        throw new IllegalArgumentException("Scale must not be negative.");
    }

    @Override // o.SJ1
    public void g(int i) {
        if (!this.t) {
            E(i);
        }
    }

    @Override // o.SJ1
    public int n(int i) {
        return (int) (this.v * i);
    }

    public C10416wE0(int i, int i2) {
        this(i);
        D(i2);
    }
}
