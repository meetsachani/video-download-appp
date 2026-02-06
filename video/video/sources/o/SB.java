package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public final class SB {

    /* loaded from: classes.dex */
    public static class a {
        public static ColorStateList a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        public static PorterDuff.Mode b(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void c(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void d(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @JR1(expression = "textView.getCheckMarkDrawable()")
    @Deprecated
    public static Drawable a(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    public static ColorStateList b(CheckedTextView checkedTextView) {
        return a.a(checkedTextView);
    }

    public static PorterDuff.Mode c(CheckedTextView checkedTextView) {
        return a.b(checkedTextView);
    }

    public static void d(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        a.c(checkedTextView, colorStateList);
    }

    public static void e(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        a.d(checkedTextView, mode);
    }
}
