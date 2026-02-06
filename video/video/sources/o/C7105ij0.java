package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import o.BM1;

/* renamed from: o.ij0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7105ij0 extends VI2 {
    public static final TimeInterpolator f2 = new DecelerateInterpolator();
    public static final TimeInterpolator g2 = new AccelerateInterpolator();
    public static final String h2 = "android:explode:screenBounds";
    public int[] e2;

    public C7105ij0() {
        this.e2 = new int[2];
        N0(new LC());
    }

    private void R0(C3291It2 c3291It2) {
        View view = c3291It2.b;
        view.getLocationOnScreen(this.e2);
        int[] iArr = this.e2;
        int i = iArr[0];
        int i2 = iArr[1];
        c3291It2.a.put(h2, new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    public static float c1(float f, float f3) {
        return (float) Math.sqrt((f * f) + (f3 * f3));
    }

    public static float d1(View view, int i, int i2) {
        return c1(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    @Override // o.VI2
    public Animator W0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        if (c3291It22 == null) {
            return null;
        }
        Rect rect = (Rect) c3291It22.a.get(h2);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        e1(viewGroup, rect, this.e2);
        int[] iArr = this.e2;
        return C3487Kt2.a(view, c3291It22, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f2, this);
    }

    @Override // o.VI2
    public Animator Y0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        float f;
        float f3;
        if (c3291It2 == null) {
            return null;
        }
        Rect rect = (Rect) c3291It2.a.get(h2);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c3291It2.b.getTag(BM1.a.transition_position);
        if (iArr != null) {
            int i3 = iArr[0];
            f = (i3 - rect.left) + translationX;
            int i4 = iArr[1];
            f3 = (i4 - rect.top) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f = translationX;
            f3 = translationY;
        }
        e1(viewGroup, rect, this.e2);
        int[] iArr2 = this.e2;
        return C3487Kt2.a(view, c3291It2, i, i2, translationX, translationY, f + iArr2[0], f3 + iArr2[1], g2, this);
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        return true;
    }

    public final void e1(View view, Rect rect, int[] iArr) {
        int centerY;
        int i;
        view.getLocationOnScreen(this.e2);
        int[] iArr2 = this.e2;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        Rect K = K();
        if (K == null) {
            i = (view.getWidth() / 2) + i2 + Math.round(view.getTranslationX());
            centerY = (view.getHeight() / 2) + i3 + Math.round(view.getTranslationY());
        } else {
            int centerX = K.centerX();
            centerY = K.centerY();
            i = centerX;
        }
        float centerX2 = rect.centerX() - i;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float c1 = c1(centerX2, centerY2);
        float d1 = d1(view, i - i2, centerY - i3);
        iArr[0] = Math.round((centerX2 / c1) * d1);
        iArr[1] = Math.round(d1 * (centerY2 / c1));
    }

    @Override // o.VI2, o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        super.m(c3291It2);
        R0(c3291It2);
    }

    @Override // o.VI2, o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        super.p(c3291It2);
        R0(c3291It2);
    }

    public C7105ij0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e2 = new int[2];
        N0(new LC());
    }
}
