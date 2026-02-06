package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class X81 {
    @InterfaceC11300zs1
    public static TypedValue a(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, boolean z) {
        TypedValue a = a(context, i);
        if (a != null && a.type == 18) {
            if (a.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static boolean c(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, @InterfaceC5670cr1 String str) {
        if (g(context, i, str) != 0) {
            return true;
        }
        return false;
    }

    @PK1
    public static int d(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, @InterfaceC9154r30 int i2) {
        float dimension;
        TypedValue a = a(context, i);
        if (a != null && a.type == 5) {
            dimension = a.getDimension(context.getResources().getDisplayMetrics());
        } else {
            dimension = context.getResources().getDimension(i2);
        }
        return (int) dimension;
    }

    public static int e(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, int i2) {
        TypedValue a = a(context, i);
        if (a != null && a.type == 16) {
            return a.data;
        }
        return i2;
    }

    @PK1
    public static int f(@InterfaceC5670cr1 Context context) {
        return d(context, C7025iN1.c.minTouchTargetSize, C7025iN1.f.mtrl_min_touch_target_size);
    }

    public static int g(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, @InterfaceC5670cr1 String str) {
        return i(context, i, str).data;
    }

    public static int h(@InterfaceC5670cr1 View view, @InterfaceC8568og int i) {
        return j(view, i).data;
    }

    @InterfaceC5670cr1
    public static TypedValue i(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, @InterfaceC5670cr1 String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static TypedValue j(@InterfaceC5670cr1 View view, @InterfaceC8568og int i) {
        return i(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
