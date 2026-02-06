package o;

import android.view.ViewGroup;

@Deprecated
/* renamed from: o.t81  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9661t81 {
    @Deprecated
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection != 0 && layoutDirection != 1) {
            return 0;
        }
        return layoutDirection;
    }

    @JR1(expression = "lp.getMarginEnd()")
    @Deprecated
    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @JR1(expression = "lp.getMarginStart()")
    @Deprecated
    public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @JR1(expression = "lp.isMarginRelative()")
    @Deprecated
    public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @JR1(expression = "lp.resolveLayoutDirection(layoutDirection)")
    @Deprecated
    public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    @JR1(expression = "lp.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    @JR1(expression = "lp.setMarginEnd(marginEnd)")
    @Deprecated
    public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    @JR1(expression = "lp.setMarginStart(marginStart)")
    @Deprecated
    public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }
}
