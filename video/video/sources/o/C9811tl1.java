package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import o.C7025iN1;

/* renamed from: o.tl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9811tl1 {
    public static final String a = "cubic-bezier";
    public static final String b = "path";
    public static final String c = "(";
    public static final String d = ")";

    public static float a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static TimeInterpolator c(String str) {
        if (e(str, a)) {
            String[] split = b(str, a).split(",");
            if (split.length == 4) {
                return new PathInterpolator(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        } else if (e(str, "path")) {
            return new PathInterpolator(C9624sz1.e(b(str, "path")));
        } else {
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
    }

    public static boolean d(String str) {
        if (!e(str, a) && !e(str, "path")) {
            return false;
        }
        return true;
    }

    public static boolean e(String str, String str2) {
        if (str.startsWith(str2 + c) && str.endsWith(d)) {
            return true;
        }
        return false;
    }

    public static int f(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, int i2) {
        return X81.e(context, i, i2);
    }

    @InterfaceC5670cr1
    public static TimeInterpolator g(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, @InterfaceC5670cr1 TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (d(valueOf)) {
                return c(valueOf);
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    @InterfaceC5670cr1
    public static C6092eb2 h(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        TypedArray obtainStyledAttributes;
        TypedValue a2 = X81.a(context, i);
        if (a2 == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, C7025iN1.o.i7, 0, i2);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(a2.resourceId, C7025iN1.o.i7);
        }
        C6092eb2 c6092eb2 = new C6092eb2();
        try {
            float f = obtainStyledAttributes.getFloat(C7025iN1.o.k7, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE) {
                float f2 = obtainStyledAttributes.getFloat(C7025iN1.o.j7, Float.MIN_VALUE);
                if (f2 != Float.MIN_VALUE) {
                    c6092eb2.i(f);
                    c6092eb2.g(f2);
                    return c6092eb2;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
