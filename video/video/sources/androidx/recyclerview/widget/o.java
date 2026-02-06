package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class o extends RecyclerView.C {
    public static final boolean q = false;
    public static final float r = 25.0f;
    public static final int s = 10000;
    public static final int t = -1;
    public static final int u = 1;
    public static final int v = 0;
    public static final float w = 1.2f;
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;

    /* renamed from: o  reason: collision with root package name */
    public int f61o = 0;
    public int p = 0;

    public o(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public int A() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public final float B() {
        if (!this.m) {
            this.n = w(this.l);
            this.m = true;
        }
        return this.n;
    }

    public int C() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public void D(RecyclerView.C.a aVar) {
        PointF a = a(f());
        if (a != null && (a.x != 0.0f || a.y != 0.0f)) {
            j(a);
            this.k = a;
            this.f61o = (int) (a.x * 10000.0f);
            this.p = (int) (a.y * 10000.0f);
            aVar.l((int) (this.f61o * 1.2f), (int) (this.p * 1.2f), (int) (y(10000) * 1.2f), this.i);
            return;
        }
        aVar.f(f());
        s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C
    public void m(int i, int i2, RecyclerView.D d, RecyclerView.C.a aVar) {
        if (c() == 0) {
            s();
            return;
        }
        this.f61o = z(this.f61o, i);
        int z = z(this.p, i2);
        this.p = z;
        if (this.f61o == 0 && z == 0) {
            D(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C
    public void n() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C
    public void o() {
        this.p = 0;
        this.f61o = 0;
        this.k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C
    public void p(View view, RecyclerView.D d, RecyclerView.C.a aVar) {
        int u2 = u(view, A());
        int v2 = v(view, C());
        int x = x((int) Math.sqrt((u2 * u2) + (v2 * v2)));
        if (x > 0) {
            aVar.l(-u2, -v2, x, this.j);
        }
    }

    public int t(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public int u(View view, int i) {
        RecyclerView.p e = e();
        if (e != null && e.s()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return t(e.d0(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e.g0(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e.s0(), e.D0() - e.t0(), i);
        }
        return 0;
    }

    public int v(View view, int i) {
        RecyclerView.p e = e();
        if (e != null && e.t()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return t(e.h0(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e.b0(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e.v0(), e.j0() - e.q0(), i);
        }
        return 0;
    }

    public float w(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int x(int i) {
        return (int) Math.ceil(y(i) / 0.3356d);
    }

    public int y(int i) {
        return (int) Math.ceil(Math.abs(i) * B());
    }

    public final int z(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }
}
