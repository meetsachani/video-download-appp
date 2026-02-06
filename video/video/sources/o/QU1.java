package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import o.HT1;
import o.OL1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class QU1 {
    @Deprecated
    public static final boolean a = true;
    public static final int[] b = {16842919};
    public static final int[] c = {16842908};
    public static final int[] d = {16842913, 16842919};
    public static final int[] e = {16842913};
    public static final int[] f = {16842910, 16842919};
    @InterfaceC5056aJ2
    public static final String g = QU1.class.getSimpleName();
    @InterfaceC5056aJ2
    public static final String h = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    /* loaded from: classes3.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        @K40
        public static Drawable b(@InterfaceC5670cr1 Context context, @PK1 int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(C9179r91.k(context, OL1.b.G0, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i, i, i, i));
        }
    }

    @InterfaceC5670cr1
    public static ColorStateList a(@InterfaceC11300zs1 ColorStateList colorStateList) {
        int[] iArr = c;
        return new ColorStateList(new int[][]{e, iArr, StateSet.NOTHING}, new int[]{d(colorStateList, d), d(colorStateList, iArr), d(colorStateList, b)});
    }

    @InterfaceC5670cr1
    public static Drawable b(@InterfaceC5670cr1 Context context, @PK1 int i) {
        return a.b(context, i);
    }

    @JF
    public static int c(@JF int i) {
        return C9205rG.D(i, Math.min(Color.alpha(i) * 2, 255));
    }

    @JF
    public static int d(@InterfaceC11300zs1 ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        return c(i);
    }

    @InterfaceC5670cr1
    public static ColorStateList e(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f, 0)) != 0) {
                Log.w(g, h);
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean f(@InterfaceC5670cr1 int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
