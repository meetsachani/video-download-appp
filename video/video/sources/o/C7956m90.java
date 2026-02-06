package o;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: o.m90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7956m90 {
    public final EdgeEffect a;

    /* renamed from: o.m90$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static void a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: o.m90$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public C7956m90(Context context) {
        this.a = new EdgeEffect(context);
    }

    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float d(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void g(EdgeEffect edgeEffect, float f, float f2) {
        a.a(edgeEffect, f, f2);
    }

    public static float j(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f, f2);
        }
        g(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.a.isFinished();
    }

    @Deprecated
    public boolean f(int i) {
        this.a.onAbsorb(i);
        return true;
    }

    @Deprecated
    public boolean h(float f) {
        this.a.onPull(f);
        return true;
    }

    @Deprecated
    public boolean i(float f, float f2) {
        g(this.a, f, f2);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.a.onRelease();
        return this.a.isFinished();
    }

    @Deprecated
    public void l(int i, int i2) {
        this.a.setSize(i, i2);
    }
}
