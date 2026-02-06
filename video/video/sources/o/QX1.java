package o;

import android.view.ScaleGestureDetector;

/* loaded from: classes.dex */
public final class QX1 {
    @JR1(expression = "scaleGestureDetector.isQuickScaleEnabled()")
    @Deprecated
    public static boolean a(ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    @JR1(expression = "scaleGestureDetector.setQuickScaleEnabled(enabled)")
    @Deprecated
    public static void c(ScaleGestureDetector scaleGestureDetector, boolean z) {
        scaleGestureDetector.setQuickScaleEnabled(z);
    }

    @Deprecated
    public static void d(Object obj, boolean z) {
        c((ScaleGestureDetector) obj, z);
    }
}
