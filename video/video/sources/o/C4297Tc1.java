package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import o.C7025iN1;
import o.HT1;
import o.OL1;

@HT1({HT1.a.Y})
/* renamed from: o.Tc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4297Tc1 {
    public static final float a = 1.3f;
    public static final float b = 2.0f;

    @InterfaceC11300zs1
    public static ColorStateList a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i) {
        int resourceId;
        ColorStateList a2;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (a2 = C3220Ic.a(context, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i);
    }

    @InterfaceC11300zs1
    public static ColorStateList b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C2872Ep2 c2872Ep2, @InterfaceC4902Zf2 int i) {
        int u;
        ColorStateList a2;
        if (c2872Ep2.C(i) && (u = c2872Ep2.u(i, 0)) != 0 && (a2 = C3220Ic.a(context, u)) != null) {
            return a2;
        }
        return c2872Ep2.d(i);
    }

    public static int c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int d(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    @InterfaceC11300zs1
    public static Drawable e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i) {
        int resourceId;
        Drawable b2;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (b2 = C3220Ic.b(context, resourceId)) != null) {
            return b2;
        }
        return typedArray.getDrawable(i);
    }

    public static float f(@InterfaceC5670cr1 Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    @InterfaceC4902Zf2
    public static int g(@InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i, @InterfaceC4902Zf2 int i2) {
        if (typedArray.hasValue(i)) {
            return i;
        }
        return i2;
    }

    @InterfaceC11300zs1
    public static C9081qm2 h(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return new C9081qm2(context, resourceId);
        }
        return null;
    }

    public static int i(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7025iN1.o.t7);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(C7025iN1.o.y7, typedValue);
            if (!value) {
                value = obtainStyledAttributes.getValue(C7025iN1.o.w7, typedValue);
            }
            obtainStyledAttributes.recycle();
            if (value) {
                if (c(typedValue) == 2) {
                    return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
                }
                return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i2;
    }

    public static int j(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, OL1.m.a6);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(OL1.m.b6, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                if (c(typedValue) == 2) {
                    return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
                }
                return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i2;
    }

    public static boolean k(@InterfaceC5670cr1 Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean l(@InterfaceC5670cr1 Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
