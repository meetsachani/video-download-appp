package o;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class LC extends ZI2 {
    public float d = 3.0f;

    public static float h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // o.AbstractC11305zt2
    public long c(ViewGroup viewGroup, AbstractC5921dt2 abstractC5921dt2, C3291It2 c3291It2, C3291It2 c3291It22) {
        int i;
        int[] iArr;
        int round;
        int i2;
        if (c3291It2 == null && c3291It22 == null) {
            return 0L;
        }
        if (c3291It22 != null && e(c3291It2) != 0) {
            c3291It2 = c3291It22;
            i = 1;
        } else {
            i = -1;
        }
        int f = f(c3291It2);
        int g = g(c3291It2);
        Rect K = abstractC5921dt2.K();
        if (K != null) {
            i2 = K.centerX();
            round = K.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i2 = round2;
        }
        float h = h(f, g, i2, round) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long J = abstractC5921dt2.J();
        if (J < 0) {
            J = 300;
        }
        return Math.round((((float) (J * i)) / this.d) * h);
    }

    public void i(float f) {
        if (f != 0.0f) {
            this.d = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}
