package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class W52 extends ZI2 {
    public float d = 3.0f;
    public int e = 80;

    @Override // o.AbstractC11305zt2
    public long c(ViewGroup viewGroup, AbstractC5921dt2 abstractC5921dt2, C3291It2 c3291It2, C3291It2 c3291It22) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup viewGroup2;
        int i5;
        C3291It2 c3291It23 = c3291It2;
        if (c3291It23 == null && c3291It22 == null) {
            return 0L;
        }
        Rect K = abstractC5921dt2.K();
        if (c3291It22 != null && e(c3291It23) != 0) {
            c3291It23 = c3291It22;
            i = 1;
        } else {
            i = -1;
        }
        int f = f(c3291It23);
        int g = g(c3291It23);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + round;
        int height = viewGroup.getHeight() + round2;
        if (K != null) {
            int centerX = K.centerX();
            i4 = g;
            viewGroup2 = viewGroup;
            i5 = round2;
            i3 = K.centerY();
            i2 = centerX;
        } else {
            i2 = (round + width) / 2;
            i3 = (round2 + height) / 2;
            i4 = g;
            viewGroup2 = viewGroup;
            i5 = round2;
        }
        float h = h(viewGroup2, f, i4, i2, i3, round, i5, width, height) / i(viewGroup);
        long J = abstractC5921dt2.J();
        if (J < 0) {
            J = 300;
        }
        return Math.round((((float) (J * i)) / this.d) * h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r6.getLayoutDirection() == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r6.getLayoutDirection() == 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        r0 = 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.e;
        if (i9 != 8388611) {
            if (i9 == 8388613) {
            }
        }
        if (i9 != 3) {
            if (i9 != 5) {
                if (i9 != 48) {
                    if (i9 != 80) {
                        return 0;
                    }
                    return (i2 - i6) + Math.abs(i3 - i);
                }
                return (i8 - i2) + Math.abs(i3 - i);
            }
            return (i - i5) + Math.abs(i4 - i2);
        }
        return (i7 - i) + Math.abs(i4 - i2);
    }

    public final int i(ViewGroup viewGroup) {
        int i = this.e;
        if (i != 3 && i != 5 && i != 8388611 && i != 8388613) {
            return viewGroup.getHeight();
        }
        return viewGroup.getWidth();
    }

    public void j(float f) {
        if (f != 0.0f) {
            this.d = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public void k(int i) {
        this.e = i;
    }
}
