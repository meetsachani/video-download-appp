package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import o.OL1;

/* renamed from: o.mn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8112mn2 {
    public static final String a = "ThemeUtils";
    public static final ThreadLocal<TypedValue> b = new ThreadLocal<>();
    public static final int[] c = {-16842910};
    public static final int[] d = {16842908};
    public static final int[] e = {16843518};
    public static final int[] f = {16842919};
    public static final int[] g = {16842912};
    public static final int[] h = {16842913};
    public static final int[] i = {-16842919, -16842908};
    public static final int[] j = new int[0];
    public static final int[] k = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(OL1.m.S0);
        try {
            if (!obtainStyledAttributes.hasValue(OL1.m.g3)) {
                Log.e(a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList b(int i2, int i3) {
        return new ColorStateList(new int[][]{c, j}, new int[]{i3, i2});
    }

    public static int c(Context context, int i2) {
        ColorStateList f2 = f(context, i2);
        if (f2 != null && f2.isStateful()) {
            return f2.getColorForState(c, f2.getDefaultColor());
        }
        TypedValue g2 = g();
        context.getTheme().resolveAttribute(16842803, g2, true);
        return e(context, i2, g2.getFloat());
    }

    public static int d(Context context, int i2) {
        int[] iArr = k;
        iArr[0] = i2;
        C2872Ep2 F = C2872Ep2.F(context, null, iArr);
        try {
            return F.c(0, 0);
        } finally {
            F.I();
        }
    }

    public static int e(Context context, int i2, float f2) {
        int d2 = d(context, i2);
        return C9205rG.D(d2, Math.round(Color.alpha(d2) * f2));
    }

    public static ColorStateList f(Context context, int i2) {
        int[] iArr = k;
        iArr[0] = i2;
        C2872Ep2 F = C2872Ep2.F(context, null, iArr);
        try {
            return F.d(0);
        } finally {
            F.I();
        }
    }

    public static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
