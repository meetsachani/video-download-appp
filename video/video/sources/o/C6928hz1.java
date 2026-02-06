package o;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: o.hz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6928hz1 {

    /* renamed from: o.hz1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Interpolator a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        public static Interpolator b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f, float f2) {
        return a.a(f, f2);
    }

    public static Interpolator b(float f, float f2, float f3, float f4) {
        return a.b(f, f2, f3, f4);
    }

    public static Interpolator c(Path path) {
        return a.c(path);
    }
}
