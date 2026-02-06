package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import o.C7025iN1;
import o.HT1;
import o.OL1;

@HT1({HT1.a.Y})
/* renamed from: o.kn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7608kn2 {
    public static final String b = "Theme.AppCompat";
    public static final String d = "Theme.MaterialComponents";
    public static final int[] a = {OL1.b.J0};
    public static final int[] c = {C7025iN1.c.colorPrimaryVariant};

    public static void a(@InterfaceC5670cr1 Context context) {
        e(context, a, b);
    }

    public static void b(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.Fe, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C7025iN1.o.He, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C7025iN1.c.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@InterfaceC5670cr1 Context context) {
        e(context, c, d);
    }

    public static void d(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC4902Zf2 @InterfaceC5670cr1 int[] iArr, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2, @InterfaceC11300zs1 @InterfaceC4902Zf2 int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.Fe, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C7025iN1.o.Ie, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = g(context, attributeSet, iArr, i, i2, iArr2);
        } else {
            if (obtainStyledAttributes.getResourceId(C7025iN1.o.Ge, -1) != -1) {
                z2 = true;
            }
            z = z2;
        }
        obtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 int[] iArr, String str) {
        if (j(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean f(@InterfaceC5670cr1 Context context) {
        return j(context, a);
    }

    public static boolean g(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC4902Zf2 @InterfaceC5670cr1 int[] iArr, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2, @InterfaceC4902Zf2 @InterfaceC5670cr1 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@InterfaceC5670cr1 Context context) {
        return X81.b(context, C7025iN1.c.isMaterial3Theme, false);
    }

    public static boolean i(@InterfaceC5670cr1 Context context) {
        return j(context, c);
    }

    public static boolean j(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @InterfaceC5670cr1
    public static TypedArray k(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC4902Zf2 @InterfaceC5670cr1 int[] iArr, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2, @InterfaceC4902Zf2 int... iArr2) {
        b(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static C2872Ep2 l(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC4902Zf2 @InterfaceC5670cr1 int[] iArr, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2, @InterfaceC4902Zf2 int... iArr2) {
        b(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return C2872Ep2.G(context, attributeSet, iArr, i, i2);
    }
}
