package o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class Zv2 {
    public static final void a(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return;
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }

    public static final boolean b(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    public static final int c(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    public static final ColorStateList d(TypedArray typedArray, int i) {
        a(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.");
    }

    public static final float e(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    public static final int f(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    public static final int g(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    public static final Drawable h(TypedArray typedArray, int i) {
        a(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        C6562gT0.m(drawable);
        return drawable;
    }

    public static final float i(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    public static final Typeface j(TypedArray typedArray, int i) {
        a(typedArray, i);
        return Yv2.a(typedArray, i);
    }

    public static final int k(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final int l(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    public static final int m(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    public static final String n(TypedArray typedArray, int i) {
        a(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    public static final CharSequence[] o(TypedArray typedArray, int i) {
        a(typedArray, i);
        return typedArray.getTextArray(i);
    }

    public static final CharSequence p(TypedArray typedArray, int i) {
        a(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
    }

    public static final <R> R q(TypedArray typedArray, HA0<? super TypedArray, ? extends R> ha0) {
        R invoke = ha0.invoke(typedArray);
        typedArray.recycle();
        return invoke;
    }
}
