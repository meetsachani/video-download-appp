package o;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.z90  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11125z90 {
    public static final int a = 128;

    public static void a(@InterfaceC5670cr1 Window window, boolean z) {
        b(window, z, null, null);
    }

    public static void b(@InterfaceC5670cr1 Window window, boolean z, @InterfaceC11300zs1 @JF Integer num, @InterfaceC11300zs1 @JF Integer num2) {
        boolean z2;
        boolean z3 = false;
        if (num != null && num.intValue() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (num2 == null || num2.intValue() == 0) {
            z3 = true;
        }
        if (z2 || z3) {
            int b = C9179r91.b(window.getContext(), 16842801, -16777216);
            if (z2) {
                num = Integer.valueOf(b);
            }
            if (z3) {
                num2 = Integer.valueOf(b);
            }
        }
        C8006mL2.c(window, !z);
        int d = d(window.getContext(), z);
        int c = c(window.getContext(), z);
        window.setStatusBarColor(d);
        window.setNavigationBarColor(c);
        g(window, e(d, C9179r91.q(num.intValue())));
        f(window, e(c, C9179r91.q(num2.intValue())));
    }

    public static int c(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return C9205rG.D(C9179r91.b(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return C9179r91.b(context, 16843858, -16777216);
    }

    public static int d(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return C9179r91.b(context, 16843857, -16777216);
    }

    public static boolean e(int i, boolean z) {
        if (!C9179r91.q(i)) {
            if (i != 0 || !z) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void f(@InterfaceC5670cr1 Window window, boolean z) {
        C8006mL2.a(window, window.getDecorView()).h(z);
    }

    public static void g(@InterfaceC5670cr1 Window window, boolean z) {
        C8006mL2.a(window, window.getDecorView()).i(z);
    }
}
