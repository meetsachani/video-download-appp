package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import o.HT1;
import o.OL1;

/* renamed from: o.r91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9179r91 {
    public static final float a = 1.0f;
    public static final float b = 0.54f;
    public static final float c = 0.38f;
    public static final float d = 0.32f;
    public static final float e = 0.12f;
    public static final int f = 40;
    public static final int g = 100;
    public static final int h = 90;
    public static final int i = 10;
    public static final int j = 94;
    public static final int k = 92;
    public static final int l = 80;
    public static final int m = 20;
    public static final int n = 30;

    /* renamed from: o  reason: collision with root package name */
    public static final int f846o = 90;
    public static final int p = 12;
    public static final int q = 17;
    public static final int r = 6;

    @JF
    public static int a(@JF int i2, @BR0(from = 0, to = 255) int i3) {
        return C9205rG.D(i2, (Color.alpha(i2) * i3) / 255);
    }

    @JF
    public static int b(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i2, @JF int i3) {
        Integer f2 = f(context, i2);
        if (f2 != null) {
            return f2.intValue();
        }
        return i3;
    }

    @JF
    public static int c(Context context, @InterfaceC8568og int i2, String str) {
        return w(context, X81.i(context, i2, str));
    }

    @JF
    public static int d(@InterfaceC5670cr1 View view, @InterfaceC8568og int i2) {
        return w(view.getContext(), X81.j(view, i2));
    }

    @JF
    public static int e(@InterfaceC5670cr1 View view, @InterfaceC8568og int i2, @JF int i3) {
        return b(view.getContext(), i2, i3);
    }

    @InterfaceC11300zs1
    @JF
    public static Integer f(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i2) {
        TypedValue a2 = X81.a(context, i2);
        if (a2 != null) {
            return Integer.valueOf(w(context, a2));
        }
        return null;
    }

    @JF
    public static int g(@JF int i2, @BR0(from = 0, to = 100) int i3) {
        JG0 b2 = JG0.b(i2);
        b2.j(i3);
        return b2.k();
    }

    @JF
    public static int h(@JF int i2, @BR0(from = 0, to = 100) int i3, int i4) {
        JG0 b2 = JG0.b(g(i2, i3));
        b2.g(i4);
        return b2.k();
    }

    @InterfaceC5670cr1
    public static C8713pG i(@JF int i2, boolean z) {
        if (z) {
            return new C8713pG(g(i2, 40), g(i2, 100), g(i2, 90), g(i2, 10));
        }
        return new C8713pG(g(i2, 80), g(i2, 20), g(i2, 30), g(i2, 90));
    }

    @InterfaceC5670cr1
    public static C8713pG j(@InterfaceC5670cr1 Context context, @JF int i2) {
        return i(i2, r(context));
    }

    @InterfaceC5670cr1
    public static ColorStateList k(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i2, @InterfaceC5670cr1 ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        TypedValue a2 = X81.a(context, i2);
        if (a2 != null) {
            colorStateList2 = x(context, a2);
        } else {
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            return colorStateList;
        }
        return colorStateList2;
    }

    @InterfaceC11300zs1
    public static ColorStateList l(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i2) {
        TypedValue a2 = X81.a(context, i2);
        if (a2 == null) {
            return null;
        }
        int i3 = a2.resourceId;
        if (i3 != 0) {
            return C10201vM.h(context, i3);
        }
        int i4 = a2.data;
        if (i4 == 0) {
            return null;
        }
        return ColorStateList.valueOf(i4);
    }

    @HT1({HT1.a.Y})
    @JF
    public static int m(@InterfaceC5670cr1 Context context, @JF int i2) {
        int i3;
        if (r(context)) {
            i3 = 94;
        } else {
            i3 = 12;
        }
        return h(i2, i3, 6);
    }

    @HT1({HT1.a.Y})
    @JF
    public static int n(@InterfaceC5670cr1 Context context, @JF int i2) {
        int i3;
        if (r(context)) {
            i3 = 92;
        } else {
            i3 = 17;
        }
        return h(i2, i3, 6);
    }

    @JF
    public static int o(@JF int i2, @JF int i3) {
        return C8113mo.b(i2, i3);
    }

    @JF
    public static int p(@InterfaceC5670cr1 Context context, @JF int i2) {
        return o(i2, c(context, OL1.b.J0, C9179r91.class.getCanonicalName()));
    }

    public static boolean q(@JF int i2) {
        if (i2 != 0 && C9205rG.n(i2) > 0.5d) {
            return true;
        }
        return false;
    }

    public static boolean r(@InterfaceC5670cr1 Context context) {
        return X81.b(context, OL1.b.N1, true);
    }

    @JF
    public static int s(@JF int i2, @JF int i3) {
        return C9205rG.v(i3, i2);
    }

    @JF
    public static int t(@JF int i2, @JF int i3, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2) {
        return s(i2, C9205rG.D(i3, Math.round(Color.alpha(i3) * f2)));
    }

    @JF
    public static int u(@InterfaceC5670cr1 View view, @InterfaceC8568og int i2, @InterfaceC8568og int i3) {
        return v(view, i2, i3, 1.0f);
    }

    @JF
    public static int v(@InterfaceC5670cr1 View view, @InterfaceC8568og int i2, @InterfaceC8568og int i3, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2) {
        return t(d(view, i2), d(view, i3), f2);
    }

    public static int w(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        if (i2 != 0) {
            return C10201vM.g(context, i2);
        }
        return typedValue.data;
    }

    public static ColorStateList x(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        if (i2 != 0) {
            return C10201vM.h(context, i2);
        }
        return ColorStateList.valueOf(typedValue.data);
    }
}
