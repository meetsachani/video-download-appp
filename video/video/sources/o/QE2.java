package o;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class QE2 {
    public static Map<VelocityTracker, RE2> a = Collections.synchronizedMap(new WeakHashMap());

    /* loaded from: classes.dex */
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        public static float b(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        public static boolean c(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!a.containsKey(velocityTracker)) {
                a.put(velocityTracker, new RE2());
            }
            a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker) {
        velocityTracker.clear();
        l(velocityTracker);
    }

    public static void c(VelocityTracker velocityTracker, int i) {
        d(velocityTracker, i, Float.MAX_VALUE);
    }

    public static void d(VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        RE2 g = g(velocityTracker);
        if (g != null) {
            g.d(i, f);
        }
    }

    public static float e(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        RE2 g = g(velocityTracker);
        if (g != null) {
            return g.e(i);
        }
        return 0.0f;
    }

    public static float f(VelocityTracker velocityTracker, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(velocityTracker, i, i2);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity(i2);
        }
        if (i == 1) {
            return velocityTracker.getYVelocity(i2);
        }
        return 0.0f;
    }

    public static RE2 g(VelocityTracker velocityTracker) {
        return a.get(velocityTracker);
    }

    @JR1(expression = "tracker.getXVelocity(pointerId)")
    @Deprecated
    public static float h(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    @JR1(expression = "tracker.getYVelocity(pointerId)")
    @Deprecated
    public static float i(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }

    public static boolean j(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.c(velocityTracker, i);
        }
        if (i == 26 || i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public static void k(VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        l(velocityTracker);
    }

    public static void l(VelocityTracker velocityTracker) {
        a.remove(velocityTracker);
    }
}
